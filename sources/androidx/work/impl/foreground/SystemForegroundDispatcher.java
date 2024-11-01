package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import n6.InterfaceC3488x0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SystemForegroundDispatcher implements OnConstraintsStateChangedListener, ExecutionListener {
    private static final String ACTION_CANCEL_WORK = "ACTION_CANCEL_WORK";
    private static final String ACTION_NOTIFY = "ACTION_NOTIFY";
    private static final String ACTION_START_FOREGROUND = "ACTION_START_FOREGROUND";
    private static final String ACTION_STOP_FOREGROUND = "ACTION_STOP_FOREGROUND";
    private static final String KEY_FOREGROUND_SERVICE_TYPE = "KEY_FOREGROUND_SERVICE_TYPE";
    private static final String KEY_GENERATION = "KEY_GENERATION";
    private static final String KEY_NOTIFICATION = "KEY_NOTIFICATION";
    private static final String KEY_NOTIFICATION_ID = "KEY_NOTIFICATION_ID";
    private static final String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    static final String TAG = Logger.tagWithPrefix("SystemFgDispatcher");

    @Nullable
    private Callback mCallback;
    final WorkConstraintsTracker mConstraintsTracker;
    private Context mContext;
    WorkGenerationalId mCurrentForegroundId;
    final Map<WorkGenerationalId, ForegroundInfo> mForegroundInfoById;
    final Object mLock;
    private final TaskExecutor mTaskExecutor;
    final Map<WorkGenerationalId, InterfaceC3488x0> mTrackedWorkSpecs;
    private WorkManagerImpl mWorkManagerImpl;
    final Map<WorkGenerationalId, WorkSpec> mWorkSpecById;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface Callback {
        void cancelNotification(int i8);

        void notify(int i8, @NonNull Notification notification);

        void startForeground(int i8, int i9, @NonNull Notification notification);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SystemForegroundDispatcher(@NonNull Context context) {
        this.mContext = context;
        this.mLock = new Object();
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
        this.mWorkManagerImpl = workManagerImpl;
        this.mTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.mCurrentForegroundId = null;
        this.mForegroundInfoById = new LinkedHashMap();
        this.mTrackedWorkSpecs = new HashMap();
        this.mWorkSpecById = new HashMap();
        this.mConstraintsTracker = new WorkConstraintsTracker(this.mWorkManagerImpl.getTrackers());
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
    }

    @NonNull
    public static Intent createCancelWorkIntent(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_CANCEL_WORK);
        intent.setData(Uri.parse("workspec://" + str));
        intent.putExtra(KEY_WORKSPEC_ID, str);
        return intent;
    }

    @NonNull
    public static Intent createNotifyIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, @NonNull ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_NOTIFY);
        intent.putExtra(KEY_NOTIFICATION_ID, foregroundInfo.getNotificationId());
        intent.putExtra(KEY_FOREGROUND_SERVICE_TYPE, foregroundInfo.getForegroundServiceType());
        intent.putExtra(KEY_NOTIFICATION, foregroundInfo.getNotification());
        intent.putExtra(KEY_WORKSPEC_ID, workGenerationalId.getWorkSpecId());
        intent.putExtra(KEY_GENERATION, workGenerationalId.getGeneration());
        return intent;
    }

    @NonNull
    public static Intent createStartForegroundIntent(@NonNull Context context, @NonNull WorkGenerationalId workGenerationalId, @NonNull ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_START_FOREGROUND);
        intent.putExtra(KEY_WORKSPEC_ID, workGenerationalId.getWorkSpecId());
        intent.putExtra(KEY_GENERATION, workGenerationalId.getGeneration());
        intent.putExtra(KEY_NOTIFICATION_ID, foregroundInfo.getNotificationId());
        intent.putExtra(KEY_FOREGROUND_SERVICE_TYPE, foregroundInfo.getForegroundServiceType());
        intent.putExtra(KEY_NOTIFICATION, foregroundInfo.getNotification());
        return intent;
    }

    @NonNull
    public static Intent createStopForegroundIntent(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_STOP_FOREGROUND);
        return intent;
    }

    @MainThread
    private void handleCancelWork(@NonNull Intent intent) {
        Logger.get().info(TAG, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.mWorkManagerImpl.cancelWorkById(UUID.fromString(stringExtra));
        }
    }

    @MainThread
    private void handleNotify(@NonNull Intent intent) {
        int i8 = 0;
        int intExtra = intent.getIntExtra(KEY_NOTIFICATION_ID, 0);
        int intExtra2 = intent.getIntExtra(KEY_FOREGROUND_SERVICE_TYPE, 0);
        String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra(KEY_GENERATION, 0));
        Notification notification = (Notification) intent.getParcelableExtra(KEY_NOTIFICATION);
        Logger.get().debug(TAG, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.mCallback != null) {
            this.mForegroundInfoById.put(workGenerationalId, new ForegroundInfo(intExtra, notification, intExtra2));
            if (this.mCurrentForegroundId == null) {
                this.mCurrentForegroundId = workGenerationalId;
                this.mCallback.startForeground(intExtra, intExtra2, notification);
                return;
            }
            this.mCallback.notify(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<WorkGenerationalId, ForegroundInfo>> it = this.mForegroundInfoById.entrySet().iterator();
                while (it.hasNext()) {
                    i8 |= it.next().getValue().getForegroundServiceType();
                }
                ForegroundInfo foregroundInfo = this.mForegroundInfoById.get(this.mCurrentForegroundId);
                if (foregroundInfo != null) {
                    this.mCallback.startForeground(foregroundInfo.getNotificationId(), i8, foregroundInfo.getNotification());
                }
            }
        }
    }

    @MainThread
    private void handleStartForeground(@NonNull Intent intent) {
        Logger.get().info(TAG, "Started foreground service " + intent);
        final String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        this.mTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundDispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                WorkSpec runningWorkSpec = SystemForegroundDispatcher.this.mWorkManagerImpl.getProcessor().getRunningWorkSpec(stringExtra);
                if (runningWorkSpec != null && runningWorkSpec.hasConstraints()) {
                    synchronized (SystemForegroundDispatcher.this.mLock) {
                        SystemForegroundDispatcher.this.mWorkSpecById.put(WorkSpecKt.generationalId(runningWorkSpec), runningWorkSpec);
                        SystemForegroundDispatcher systemForegroundDispatcher = SystemForegroundDispatcher.this;
                        SystemForegroundDispatcher.this.mTrackedWorkSpecs.put(WorkSpecKt.generationalId(runningWorkSpec), WorkConstraintsTrackerKt.listen(systemForegroundDispatcher.mConstraintsTracker, runningWorkSpec, systemForegroundDispatcher.mTaskExecutor.getTaskCoroutineDispatcher(), SystemForegroundDispatcher.this));
                    }
                }
            }
        });
    }

    @MainThread
    void handleStop(@NonNull Intent intent) {
        Logger.get().info(TAG, "Stopping foreground service");
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.stop();
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void onConstraintsStateChanged(@NonNull WorkSpec workSpec, @NonNull ConstraintsState constraintsState) {
        if (constraintsState instanceof ConstraintsState.ConstraintsNotMet) {
            String str = workSpec.id;
            Logger.get().debug(TAG, "Constraints unmet for WorkSpec " + str);
            this.mWorkManagerImpl.stopForegroundWork(WorkSpecKt.generationalId(workSpec));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @MainThread
    public void onDestroy() {
        this.mCallback = null;
        synchronized (this.mLock) {
            try {
                Iterator<InterfaceC3488x0> it = this.mTrackedWorkSpecs.values().iterator();
                while (it.hasNext()) {
                    it.next().cancel(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.mWorkManagerImpl.getProcessor().removeExecutionListener(this);
    }

    @Override // androidx.work.impl.ExecutionListener
    @MainThread
    public void onExecuted(@NonNull WorkGenerationalId workGenerationalId, boolean z8) {
        InterfaceC3488x0 interfaceC3488x0;
        Map.Entry<WorkGenerationalId, ForegroundInfo> entry;
        synchronized (this.mLock) {
            try {
                if (this.mWorkSpecById.remove(workGenerationalId) != null) {
                    interfaceC3488x0 = this.mTrackedWorkSpecs.remove(workGenerationalId);
                } else {
                    interfaceC3488x0 = null;
                }
                if (interfaceC3488x0 != null) {
                    interfaceC3488x0.cancel(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ForegroundInfo remove = this.mForegroundInfoById.remove(workGenerationalId);
        if (workGenerationalId.equals(this.mCurrentForegroundId)) {
            if (this.mForegroundInfoById.size() > 0) {
                Iterator<Map.Entry<WorkGenerationalId, ForegroundInfo>> it = this.mForegroundInfoById.entrySet().iterator();
                Map.Entry<WorkGenerationalId, ForegroundInfo> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.mCurrentForegroundId = entry.getKey();
                if (this.mCallback != null) {
                    ForegroundInfo value = entry.getValue();
                    this.mCallback.startForeground(value.getNotificationId(), value.getForegroundServiceType(), value.getNotification());
                    this.mCallback.cancelNotification(value.getNotificationId());
                }
            } else {
                this.mCurrentForegroundId = null;
            }
        }
        Callback callback = this.mCallback;
        if (remove != null && callback != null) {
            Logger.get().debug(TAG, "Removing Notification (id: " + remove.getNotificationId() + ", workSpecId: " + workGenerationalId + ", notificationType: " + remove.getForegroundServiceType());
            callback.cancelNotification(remove.getNotificationId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onStartCommand(@NonNull Intent intent) {
        String action = intent.getAction();
        if (ACTION_START_FOREGROUND.equals(action)) {
            handleStartForeground(intent);
            handleNotify(intent);
        } else if (ACTION_NOTIFY.equals(action)) {
            handleNotify(intent);
        } else if (ACTION_CANCEL_WORK.equals(action)) {
            handleCancelWork(intent);
        } else if (ACTION_STOP_FOREGROUND.equals(action)) {
            handleStop(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @MainThread
    public void setCallback(@NonNull Callback callback) {
        if (this.mCallback != null) {
            Logger.get().error(TAG, "A callback already exists.");
        } else {
            this.mCallback = callback;
        }
    }

    @VisibleForTesting
    SystemForegroundDispatcher(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl, @NonNull WorkConstraintsTracker workConstraintsTracker) {
        this.mContext = context;
        this.mLock = new Object();
        this.mWorkManagerImpl = workManagerImpl;
        this.mTaskExecutor = workManagerImpl.getWorkTaskExecutor();
        this.mCurrentForegroundId = null;
        this.mForegroundInfoById = new LinkedHashMap();
        this.mTrackedWorkSpecs = new HashMap();
        this.mWorkSpecById = new HashMap();
        this.mConstraintsTracker = workConstraintsTracker;
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
    }
}
