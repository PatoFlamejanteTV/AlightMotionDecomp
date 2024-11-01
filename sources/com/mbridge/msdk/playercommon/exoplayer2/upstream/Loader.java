package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.TraceUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class Loader implements LoaderErrorThrower {
    public static final int DONT_RETRY = 2;
    public static final int DONT_RETRY_FATAL = 3;
    public static final int RETRY = 0;
    public static final int RETRY_RESET_ERROR_COUNT = 1;
    private LoadTask<? extends Loadable> currentTask;
    private final ExecutorService downloadExecutorService;
    private IOException fatalError;

    /* loaded from: classes4.dex */
    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t8, long j8, long j9, boolean z8);

        void onLoadCompleted(T t8, long j8, long j9);

        int onLoadError(T t8, long j8, long j9, IOException iOException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        private static final int MSG_CANCEL = 1;
        private static final int MSG_END_OF_SOURCE = 2;
        private static final int MSG_FATAL_ERROR = 4;
        private static final int MSG_IO_EXCEPTION = 3;
        private static final int MSG_START = 0;
        private static final String TAG = "LoadTask";
        private Callback<T> callback;
        private volatile boolean canceled;
        private IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private volatile Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;

        public LoadTask(Looper looper, T t8, Callback<T> callback, int i8, long j8) {
            super(looper);
            this.loadable = t8;
            this.callback = callback;
            this.defaultMinRetryCount = i8;
            this.startTimeMs = j8;
        }

        private void execute() {
            this.currentError = null;
            Loader.this.downloadExecutorService.execute(Loader.this.currentTask);
        }

        private void finish() {
            Loader.this.currentTask = null;
        }

        private long getRetryDelayMillis() {
            return Math.min((this.errorCount - 1) * 1000, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
        }

        public final void cancel(boolean z8) {
            this.released = z8;
            this.currentError = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z8) {
                    sendEmptyMessage(1);
                }
            } else {
                this.canceled = true;
                this.loadable.cancelLoad();
                if (this.executorThread != null) {
                    this.executorThread.interrupt();
                }
            }
            if (z8) {
                finish();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.callback.onLoadCanceled(this.loadable, elapsedRealtime, elapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.released) {
                return;
            }
            int i8 = message.what;
            if (i8 == 0) {
                execute();
                return;
            }
            if (i8 != 4) {
                finish();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j8 = elapsedRealtime - this.startTimeMs;
                if (this.canceled) {
                    this.callback.onLoadCanceled(this.loadable, elapsedRealtime, j8, false);
                    return;
                }
                int i9 = message.what;
                int i10 = 1;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            IOException iOException = (IOException) message.obj;
                            this.currentError = iOException;
                            int onLoadError = this.callback.onLoadError(this.loadable, elapsedRealtime, j8, iOException);
                            if (onLoadError == 3) {
                                Loader.this.fatalError = this.currentError;
                                return;
                            } else {
                                if (onLoadError != 2) {
                                    if (onLoadError != 1) {
                                        i10 = 1 + this.errorCount;
                                    }
                                    this.errorCount = i10;
                                    start(getRetryDelayMillis());
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        this.callback.onLoadCompleted(this.loadable, elapsedRealtime, j8);
                        return;
                    } catch (RuntimeException e8) {
                        Log.e(TAG, "Unexpected exception handling load completed", e8);
                        Loader.this.fatalError = new UnexpectedLoaderException(e8);
                        return;
                    }
                }
                this.callback.onLoadCanceled(this.loadable, elapsedRealtime, j8, false);
                return;
            }
            throw ((Error) message.obj);
        }

        public final void maybeThrowError(int i8) throws IOException {
            IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i8) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.executorThread = Thread.currentThread();
                if (!this.canceled) {
                    TraceUtil.beginSection("load:" + this.loadable.getClass().getSimpleName());
                    try {
                        this.loadable.load();
                        TraceUtil.endSection();
                    } catch (Throwable th) {
                        TraceUtil.endSection();
                        throw th;
                    }
                }
                if (!this.released) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e8) {
                if (!this.released) {
                    obtainMessage(3, e8).sendToTarget();
                }
            } catch (Error e9) {
                Log.e(TAG, "Unexpected error loading stream", e9);
                if (!this.released) {
                    obtainMessage(4, e9).sendToTarget();
                }
                throw e9;
            } catch (InterruptedException unused) {
                Assertions.checkState(this.canceled);
                if (!this.released) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e10) {
                Log.e(TAG, "Unexpected exception loading stream", e10);
                if (!this.released) {
                    obtainMessage(3, new UnexpectedLoaderException(e10)).sendToTarget();
                }
            } catch (OutOfMemoryError e11) {
                Log.e(TAG, "OutOfMemory error loading stream", e11);
                if (!this.released) {
                    obtainMessage(3, new UnexpectedLoaderException(e11)).sendToTarget();
                }
            }
        }

        public final void start(long j8) {
            boolean z8;
            if (Loader.this.currentTask == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkState(z8);
            Loader.this.currentTask = this;
            if (j8 > 0) {
                sendEmptyMessageDelayed(0, j8);
            } else {
                execute();
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface Loadable {
        void cancelLoad();

        void load() throws IOException, InterruptedException;
    }

    /* loaded from: classes4.dex */
    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ReleaseTask implements Runnable {
        private final ReleaseCallback callback;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.callback = releaseCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.callback.onLoaderReleased();
        }
    }

    /* loaded from: classes4.dex */
    public @interface RetryAction {
    }

    /* loaded from: classes4.dex */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public Loader(String str) {
        this.downloadExecutorService = Util.newSingleThreadExecutor(str);
    }

    public final void cancelLoading() {
        this.currentTask.cancel(false);
    }

    public final boolean isLoading() {
        if (this.currentTask != null) {
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
    public final void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public final void release() {
        release(null);
    }

    public final <T extends Loadable> long startLoading(T t8, Callback<T> callback, int i8) {
        boolean z8;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkState(z8);
        this.fatalError = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new LoadTask(myLooper, t8, callback, i8, elapsedRealtime).start(0L);
        return elapsedRealtime;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
    public final void maybeThrowError(int i8) throws IOException {
        IOException iOException = this.fatalError;
        if (iOException == null) {
            LoadTask<? extends Loadable> loadTask = this.currentTask;
            if (loadTask != null) {
                if (i8 == Integer.MIN_VALUE) {
                    i8 = loadTask.defaultMinRetryCount;
                }
                loadTask.maybeThrowError(i8);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void release(ReleaseCallback releaseCallback) {
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutorService.execute(new ReleaseTask(releaseCallback));
        }
        this.downloadExecutorService.shutdown();
    }
}
