package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.Cache;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public final class DownloadManager {
    private static final boolean DEBUG = false;
    public static final int DEFAULT_MAX_SIMULTANEOUS_DOWNLOADS = 1;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    private static final String TAG = "DownloadManager";
    private final ActionFile actionFile;
    private final ArrayList<Task> activeDownloadTasks;
    private final DownloadAction.Deserializer[] deserializers;
    private final DownloaderConstructorHelper downloaderConstructorHelper;
    private boolean downloadsStopped;
    private final Handler fileIOHandler;
    private final HandlerThread fileIOThread;
    private final Handler handler;
    private boolean initialized;
    private final CopyOnWriteArraySet<Listener> listeners;
    private final int maxActiveDownloadTasks;
    private final int minRetryCount;
    private int nextTaskId;
    private boolean released;
    private final ArrayList<Task> tasks;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onIdle(DownloadManager downloadManager);

        void onInitialized(DownloadManager downloadManager);

        void onTaskStateChanged(DownloadManager downloadManager, TaskState taskState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Task implements Runnable {
        public static final int STATE_QUEUED_CANCELING = 5;
        public static final int STATE_STARTED_CANCELING = 6;
        public static final int STATE_STARTED_STOPPING = 7;
        private final DownloadAction action;
        private volatile int currentState;
        private final DownloadManager downloadManager;
        private volatile Downloader downloader;
        private Throwable error;
        private final int id;
        private final int minRetryCount;
        private Thread thread;

        /* loaded from: classes4.dex */
        public @interface InternalState {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean canStart() {
            if (this.currentState == 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancel() {
            if (changeStateAndNotify(0, 5)) {
                this.downloadManager.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Task.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Task.this.changeStateAndNotify(5, 3);
                    }
                });
            } else if (changeStateAndNotify(1, 6)) {
                cancelDownload();
            }
        }

        private void cancelDownload() {
            if (this.downloader != null) {
                this.downloader.cancel();
            }
            this.thread.interrupt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean changeStateAndNotify(int i8, int i9) {
            return changeStateAndNotify(i8, i9, null);
        }

        private int getExternalState() {
            int i8 = this.currentState;
            if (i8 != 5) {
                if (i8 != 6 && i8 != 7) {
                    return this.currentState;
                }
                return 1;
            }
            return 0;
        }

        private int getRetryDelayMillis(int i8) {
            return Math.min((i8 - 1) * 1000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
        }

        private String getStateString() {
            int i8 = this.currentState;
            if (i8 != 5 && i8 != 6) {
                if (i8 != 7) {
                    return TaskState.getStateString(this.currentState);
                }
                return "STOPPING";
            }
            return "CANCELING";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start() {
            if (changeStateAndNotify(0, 1)) {
                Thread thread = new Thread(this);
                this.thread = thread;
                thread.start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop() {
            if (changeStateAndNotify(1, 7)) {
                DownloadManager.logd("Stopping", this);
                this.thread.interrupt();
            }
        }

        public final float getDownloadPercentage() {
            if (this.downloader != null) {
                return this.downloader.getDownloadPercentage();
            }
            return -1.0f;
        }

        public final TaskState getDownloadState() {
            return new TaskState(this.id, this.action, getExternalState(), getDownloadPercentage(), getDownloadedBytes(), this.error);
        }

        public final long getDownloadedBytes() {
            if (this.downloader != null) {
                return this.downloader.getDownloadedBytes();
            }
            return 0L;
        }

        public final boolean isActive() {
            if (this.currentState == 5 || this.currentState == 1 || this.currentState == 7 || this.currentState == 6) {
                return true;
            }
            return false;
        }

        public final boolean isFinished() {
            if (this.currentState != 4 && this.currentState != 2 && this.currentState != 3) {
                return false;
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DownloadManager.logd("Task is started", this);
            try {
                this.downloader = this.action.createDownloader(this.downloadManager.downloaderConstructorHelper);
                if (this.action.isRemoveAction) {
                    this.downloader.remove();
                } else {
                    long j8 = -1;
                    int i8 = 0;
                    while (!Thread.interrupted()) {
                        try {
                            this.downloader.download();
                            break;
                        } catch (IOException e8) {
                            long downloadedBytes = this.downloader.getDownloadedBytes();
                            if (downloadedBytes != j8) {
                                DownloadManager.logd("Reset error count. downloadedBytes = " + downloadedBytes, this);
                                j8 = downloadedBytes;
                                i8 = 0;
                            }
                            if (this.currentState == 1 && (i8 = i8 + 1) <= this.minRetryCount) {
                                DownloadManager.logd("Download error. Retry " + i8, this);
                                Thread.sleep((long) getRetryDelayMillis(i8));
                            } else {
                                throw e8;
                            }
                        }
                    }
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            this.downloadManager.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.Task.2
                @Override // java.lang.Runnable
                public void run() {
                    int i9;
                    Task task = Task.this;
                    Throwable th2 = th;
                    if (th2 != null) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    if (!task.changeStateAndNotify(1, i9, th2) && !Task.this.changeStateAndNotify(6, 3) && !Task.this.changeStateAndNotify(7, 0)) {
                        throw new IllegalStateException();
                    }
                }
            });
        }

        public final String toString() {
            return super.toString();
        }

        private Task(int i8, DownloadManager downloadManager, DownloadAction downloadAction, int i9) {
            this.id = i8;
            this.downloadManager = downloadManager;
            this.action = downloadAction;
            this.currentState = 0;
            this.minRetryCount = i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean changeStateAndNotify(int i8, int i9, Throwable th) {
            if (this.currentState != i8) {
                return false;
            }
            this.currentState = i9;
            this.error = th;
            if (this.currentState != getExternalState()) {
                return true;
            }
            this.downloadManager.onTaskStateChange(this);
            return true;
        }

        private static String toString(byte[] bArr) {
            if (bArr.length > 100) {
                return "<data is too long>";
            }
            return '\'' + Util.fromUtf8Bytes(bArr) + '\'';
        }
    }

    /* loaded from: classes4.dex */
    public static final class TaskState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 2;
        public static final int STATE_FAILED = 4;
        public static final int STATE_QUEUED = 0;
        public static final int STATE_STARTED = 1;
        public final DownloadAction action;
        public final float downloadPercentage;
        public final long downloadedBytes;
        public final Throwable error;
        public final int state;
        public final int taskId;

        /* loaded from: classes4.dex */
        public @interface State {
        }

        public static String getStateString(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                return "FAILED";
                            }
                            throw new IllegalStateException();
                        }
                        return "CANCELED";
                    }
                    return "COMPLETED";
                }
                return "STARTED";
            }
            return "QUEUED";
        }

        private TaskState(int i8, DownloadAction downloadAction, int i9, float f8, long j8, Throwable th) {
            this.taskId = i8;
            this.action = downloadAction;
            this.state = i9;
            this.downloadPercentage = f8;
            this.downloadedBytes = j8;
            this.error = th;
        }
    }

    public DownloadManager(Cache cache, DataSource.Factory factory, File file, DownloadAction.Deserializer... deserializerArr) {
        this(new DownloaderConstructorHelper(cache, factory), file, deserializerArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task addTaskForAction(DownloadAction downloadAction) {
        int i8 = this.nextTaskId;
        this.nextTaskId = i8 + 1;
        Task task = new Task(i8, this, downloadAction, this.minRetryCount);
        this.tasks.add(task);
        logd("Task is added", task);
        return task;
    }

    private void loadActions() {
        this.fileIOHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.2
            @Override // java.lang.Runnable
            public void run() {
                final DownloadAction[] downloadActionArr;
                try {
                    downloadActionArr = DownloadManager.this.actionFile.load(DownloadManager.this.deserializers);
                    DownloadManager.logd("Action file is loaded.");
                } catch (Throwable th) {
                    Log.e(DownloadManager.TAG, "Action file loading failed.", th);
                    downloadActionArr = new DownloadAction[0];
                }
                DownloadManager.this.handler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (DownloadManager.this.released) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList(DownloadManager.this.tasks);
                        DownloadManager.this.tasks.clear();
                        for (DownloadAction downloadAction : downloadActionArr) {
                            DownloadManager.this.addTaskForAction(downloadAction);
                        }
                        DownloadManager.logd("Tasks are created.");
                        DownloadManager.this.initialized = true;
                        Iterator it = DownloadManager.this.listeners.iterator();
                        while (it.hasNext()) {
                            ((Listener) it.next()).onInitialized(DownloadManager.this);
                        }
                        if (!arrayList.isEmpty()) {
                            DownloadManager.this.tasks.addAll(arrayList);
                            DownloadManager.this.saveActions();
                        }
                        DownloadManager.this.maybeStartTasks();
                        for (int i8 = 0; i8 < DownloadManager.this.tasks.size(); i8++) {
                            Task task = (Task) DownloadManager.this.tasks.get(i8);
                            if (task.currentState == 0) {
                                DownloadManager.this.notifyListenersTaskStateChange(task);
                            }
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logd(String str) {
    }

    private void maybeNotifyListenersIdle() {
        if (!isIdle()) {
            return;
        }
        logd("Notify idle state");
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onIdle(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeStartTasks() {
        boolean z8;
        DownloadAction downloadAction;
        boolean z9;
        if (this.initialized && !this.released) {
            if (!this.downloadsStopped && this.activeDownloadTasks.size() != this.maxActiveDownloadTasks) {
                z8 = false;
            } else {
                z8 = true;
            }
            for (int i8 = 0; i8 < this.tasks.size(); i8++) {
                Task task = this.tasks.get(i8);
                if (task.canStart() && ((z9 = (downloadAction = task.action).isRemoveAction) || !z8)) {
                    int i9 = 0;
                    boolean z10 = true;
                    while (true) {
                        if (i9 >= i8) {
                            break;
                        }
                        Task task2 = this.tasks.get(i9);
                        if (task2.action.isSameMedia(downloadAction)) {
                            if (z9) {
                                logd(task + " clashes with " + task2);
                                task2.cancel();
                                z10 = false;
                            } else if (task2.action.isRemoveAction) {
                                z8 = true;
                                z10 = false;
                                break;
                            }
                        }
                        i9++;
                    }
                    if (z10) {
                        task.start();
                        if (!z9) {
                            this.activeDownloadTasks.add(task);
                            if (this.activeDownloadTasks.size() == this.maxActiveDownloadTasks) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListenersTaskStateChange(Task task) {
        logd("Task state is changed", task);
        TaskState downloadState = task.getDownloadState();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onTaskStateChanged(this, downloadState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTaskStateChange(Task task) {
        if (this.released) {
            return;
        }
        boolean z8 = !task.isActive();
        if (z8) {
            this.activeDownloadTasks.remove(task);
        }
        notifyListenersTaskStateChange(task);
        if (task.isFinished()) {
            this.tasks.remove(task);
            saveActions();
        }
        if (z8) {
            maybeStartTasks();
            maybeNotifyListenersIdle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveActions() {
        if (this.released) {
            return;
        }
        final DownloadAction[] downloadActionArr = new DownloadAction[this.tasks.size()];
        for (int i8 = 0; i8 < this.tasks.size(); i8++) {
            downloadActionArr[i8] = this.tasks.get(i8).action;
        }
        this.fileIOHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    DownloadManager.this.actionFile.store(downloadActionArr);
                    DownloadManager.logd("Actions persisted.");
                } catch (IOException e8) {
                    Log.e(DownloadManager.TAG, "Persisting actions failed.", e8);
                }
            }
        });
    }

    public final void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public final TaskState[] getAllTaskStates() {
        Assertions.checkState(!this.released);
        int size = this.tasks.size();
        TaskState[] taskStateArr = new TaskState[size];
        for (int i8 = 0; i8 < size; i8++) {
            taskStateArr[i8] = this.tasks.get(i8).getDownloadState();
        }
        return taskStateArr;
    }

    public final int getDownloadCount() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.tasks.size(); i9++) {
            if (!this.tasks.get(i9).action.isRemoveAction) {
                i8++;
            }
        }
        return i8;
    }

    public final int getTaskCount() {
        Assertions.checkState(!this.released);
        return this.tasks.size();
    }

    public final TaskState getTaskState(int i8) {
        Assertions.checkState(!this.released);
        for (int i9 = 0; i9 < this.tasks.size(); i9++) {
            Task task = this.tasks.get(i9);
            if (task.id == i8) {
                return task.getDownloadState();
            }
        }
        return null;
    }

    public final int handleAction(byte[] bArr) throws IOException {
        Assertions.checkState(!this.released);
        return handleAction(DownloadAction.deserializeFromStream(this.deserializers, new ByteArrayInputStream(bArr)));
    }

    public final boolean isIdle() {
        Assertions.checkState(!this.released);
        if (!this.initialized) {
            return false;
        }
        for (int i8 = 0; i8 < this.tasks.size(); i8++) {
            if (this.tasks.get(i8).isActive()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInitialized() {
        Assertions.checkState(!this.released);
        return this.initialized;
    }

    public final void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        for (int i8 = 0; i8 < this.tasks.size(); i8++) {
            this.tasks.get(i8).stop();
        }
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.fileIOHandler.post(new Runnable() { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadManager.1
            @Override // java.lang.Runnable
            public void run() {
                conditionVariable.open();
            }
        });
        conditionVariable.block();
        this.fileIOThread.quit();
        logd("Released");
    }

    public final void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public final void startDownloads() {
        Assertions.checkState(!this.released);
        if (this.downloadsStopped) {
            this.downloadsStopped = false;
            maybeStartTasks();
            logd("Downloads are started");
        }
    }

    public final void stopDownloads() {
        Assertions.checkState(!this.released);
        if (!this.downloadsStopped) {
            this.downloadsStopped = true;
            for (int i8 = 0; i8 < this.activeDownloadTasks.size(); i8++) {
                this.activeDownloadTasks.get(i8).stop();
            }
            logd("Downloads are stopping");
        }
    }

    public DownloadManager(DownloaderConstructorHelper downloaderConstructorHelper, File file, DownloadAction.Deserializer... deserializerArr) {
        this(downloaderConstructorHelper, 1, 5, file, deserializerArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logd(String str, Task task) {
        logd(str + ": " + task);
    }

    public DownloadManager(DownloaderConstructorHelper downloaderConstructorHelper, int i8, int i9, File file, DownloadAction.Deserializer... deserializerArr) {
        Assertions.checkArgument(deserializerArr.length > 0, "At least one Deserializer is required.");
        this.downloaderConstructorHelper = downloaderConstructorHelper;
        this.maxActiveDownloadTasks = i8;
        this.minRetryCount = i9;
        this.actionFile = new ActionFile(file);
        this.deserializers = deserializerArr;
        this.downloadsStopped = true;
        this.tasks = new ArrayList<>();
        this.activeDownloadTasks = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        HandlerThread handlerThread = new HandlerThread("DownloadManager file i/o");
        this.fileIOThread = handlerThread;
        handlerThread.start();
        this.fileIOHandler = new Handler(handlerThread.getLooper());
        this.listeners = new CopyOnWriteArraySet<>();
        loadActions();
        logd("Created");
    }

    public final int handleAction(DownloadAction downloadAction) {
        Assertions.checkState(!this.released);
        Task addTaskForAction = addTaskForAction(downloadAction);
        if (this.initialized) {
            saveActions();
            maybeStartTasks();
            if (addTaskForAction.currentState == 0) {
                notifyListenersTaskStateChange(addTaskForAction);
            }
        }
        return addTaskForAction.id;
    }
}
