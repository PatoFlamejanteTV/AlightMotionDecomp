package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SystemAlarmDispatcher implements ExecutionListener {
    private static final int DEFAULT_START_ID = 0;
    private static final String KEY_START_ID = "KEY_START_ID";
    private static final String PROCESS_COMMAND_TAG = "ProcessCommand";
    static final String TAG = Logger.tagWithPrefix("SystemAlarmDispatcher");
    final CommandHandler mCommandHandler;

    @Nullable
    private CommandsCompletedListener mCompletedListener;
    final Context mContext;
    Intent mCurrentIntent;
    final List<Intent> mIntents;
    private final Processor mProcessor;
    private StartStopTokens mStartStopTokens;
    final TaskExecutor mTaskExecutor;
    private final WorkLauncher mWorkLauncher;
    private final WorkManagerImpl mWorkManager;
    private final WorkTimer mWorkTimer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class AddRunnable implements Runnable {
        private final SystemAlarmDispatcher mDispatcher;
        private final Intent mIntent;
        private final int mStartId;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AddRunnable(@NonNull SystemAlarmDispatcher systemAlarmDispatcher, @NonNull Intent intent, int i8) {
            this.mDispatcher = systemAlarmDispatcher;
            this.mIntent = intent;
            this.mStartId = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.add(this.mIntent, this.mStartId);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface CommandsCompletedListener {
        void onAllCommandsCompleted();
    }

    /* loaded from: classes3.dex */
    static class DequeueAndCheckForCompletion implements Runnable {
        private final SystemAlarmDispatcher mDispatcher;

        DequeueAndCheckForCompletion(@NonNull SystemAlarmDispatcher systemAlarmDispatcher) {
            this.mDispatcher = systemAlarmDispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mDispatcher.dequeueAndCheckForCompletion();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SystemAlarmDispatcher(@NonNull Context context) {
        this(context, null, null, null);
    }

    private void assertMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @MainThread
    private boolean hasIntentWithAction(@NonNull String str) {
        assertMainThread();
        synchronized (this.mIntents) {
            try {
                Iterator<Intent> it = this.mIntents.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @MainThread
    private void processCommand() {
        assertMainThread();
        PowerManager.WakeLock newWakeLock = WakeLocks.newWakeLock(this.mContext, PROCESS_COMMAND_TAG);
        try {
            newWakeLock.acquire();
            this.mWorkManager.getWorkTaskExecutor().executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public void run() {
                    Executor mainThreadExecutor;
                    DequeueAndCheckForCompletion dequeueAndCheckForCompletion;
                    synchronized (SystemAlarmDispatcher.this.mIntents) {
                        SystemAlarmDispatcher systemAlarmDispatcher = SystemAlarmDispatcher.this;
                        systemAlarmDispatcher.mCurrentIntent = systemAlarmDispatcher.mIntents.get(0);
                    }
                    Intent intent = SystemAlarmDispatcher.this.mCurrentIntent;
                    if (intent != null) {
                        String action = intent.getAction();
                        int intExtra = SystemAlarmDispatcher.this.mCurrentIntent.getIntExtra(SystemAlarmDispatcher.KEY_START_ID, 0);
                        Logger logger = Logger.get();
                        String str = SystemAlarmDispatcher.TAG;
                        logger.debug(str, "Processing command " + SystemAlarmDispatcher.this.mCurrentIntent + ", " + intExtra);
                        PowerManager.WakeLock newWakeLock2 = WakeLocks.newWakeLock(SystemAlarmDispatcher.this.mContext, action + " (" + intExtra + ")");
                        try {
                            Logger.get().debug(str, "Acquiring operation wake lock (" + action + ") " + newWakeLock2);
                            newWakeLock2.acquire();
                            SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher2.mCommandHandler.onHandleIntent(systemAlarmDispatcher2.mCurrentIntent, intExtra, systemAlarmDispatcher2);
                            Logger.get().debug(str, "Releasing operation wake lock (" + action + ") " + newWakeLock2);
                            newWakeLock2.release();
                            mainThreadExecutor = SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor();
                            dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                        } catch (Throwable th) {
                            try {
                                Logger logger2 = Logger.get();
                                String str2 = SystemAlarmDispatcher.TAG;
                                logger2.error(str2, "Unexpected error in onHandleIntent", th);
                                Logger.get().debug(str2, "Releasing operation wake lock (" + action + ") " + newWakeLock2);
                                newWakeLock2.release();
                                mainThreadExecutor = SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor();
                                dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                            } catch (Throwable th2) {
                                Logger.get().debug(SystemAlarmDispatcher.TAG, "Releasing operation wake lock (" + action + ") " + newWakeLock2);
                                newWakeLock2.release();
                                SystemAlarmDispatcher.this.mTaskExecutor.getMainThreadExecutor().execute(new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this));
                                throw th2;
                            }
                        }
                        mainThreadExecutor.execute(dequeueAndCheckForCompletion);
                    }
                }
            });
        } finally {
            newWakeLock.release();
        }
    }

    @MainThread
    public boolean add(@NonNull Intent intent, int i8) {
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Adding command " + intent + " (" + i8 + ")");
        assertMainThread();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.get().warning(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && hasIntentWithAction("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra(KEY_START_ID, i8);
        synchronized (this.mIntents) {
            try {
                boolean z8 = !this.mIntents.isEmpty();
                this.mIntents.add(intent);
                if (!z8) {
                    processCommand();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @MainThread
    void dequeueAndCheckForCompletion() {
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Checking if commands are complete.");
        assertMainThread();
        synchronized (this.mIntents) {
            try {
                if (this.mCurrentIntent != null) {
                    Logger.get().debug(str, "Removing command " + this.mCurrentIntent);
                    if (this.mIntents.remove(0).equals(this.mCurrentIntent)) {
                        this.mCurrentIntent = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                SerialExecutor serialTaskExecutor = this.mTaskExecutor.getSerialTaskExecutor();
                if (!this.mCommandHandler.hasPendingCommands() && this.mIntents.isEmpty() && !serialTaskExecutor.hasPendingTasks()) {
                    Logger.get().debug(str, "No more commands & intents.");
                    CommandsCompletedListener commandsCompletedListener = this.mCompletedListener;
                    if (commandsCompletedListener != null) {
                        commandsCompletedListener.onAllCommandsCompleted();
                    }
                } else if (!this.mIntents.isEmpty()) {
                    processCommand();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Processor getProcessor() {
        return this.mProcessor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskExecutor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WorkManagerImpl getWorkManager() {
        return this.mWorkManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WorkTimer getWorkTimer() {
        return this.mWorkTimer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WorkLauncher getWorkerLauncher() {
        return this.mWorkLauncher;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDestroy() {
        Logger.get().debug(TAG, "Destroying SystemAlarmDispatcher");
        this.mProcessor.removeExecutionListener(this);
        this.mCompletedListener = null;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z8) {
        this.mTaskExecutor.getMainThreadExecutor().execute(new AddRunnable(this, CommandHandler.createExecutionCompletedIntent(this.mContext, workGenerationalId, z8), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCompletedListener(@NonNull CommandsCompletedListener commandsCompletedListener) {
        if (this.mCompletedListener != null) {
            Logger.get().error(TAG, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.mCompletedListener = commandsCompletedListener;
        }
    }

    @VisibleForTesting
    SystemAlarmDispatcher(@NonNull Context context, @Nullable Processor processor, @Nullable WorkManagerImpl workManagerImpl, @Nullable WorkLauncher workLauncher) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mStartStopTokens = new StartStopTokens();
        workManagerImpl = workManagerImpl == null ? WorkManagerImpl.getInstance(context) : workManagerImpl;
        this.mWorkManager = workManagerImpl;
        this.mCommandHandler = new CommandHandler(applicationContext, workManagerImpl.getConfiguration().getClock(), this.mStartStopTokens);
        this.mWorkTimer = new WorkTimer(workManagerImpl.getConfiguration().getRunnableScheduler());
        processor = processor == null ? workManagerImpl.getProcessor() : processor;
        this.mProcessor = processor;
        TaskExecutor workTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.mTaskExecutor = workTaskExecutor;
        this.mWorkLauncher = workLauncher == null ? new WorkLauncherImpl(processor, workTaskExecutor) : workLauncher;
        processor.addExecutionListener(this);
        this.mIntents = new ArrayList();
        this.mCurrentIntent = null;
    }
}
