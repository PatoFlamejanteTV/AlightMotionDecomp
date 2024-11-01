package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
class SnackbarManager {
    private static final int LONG_DURATION_MS = 2750;
    static final int MSG_TIMEOUT = 0;
    private static final int SHORT_DURATION_MS = 1500;
    private static SnackbarManager snackbarManager;

    @Nullable
    private SnackbarRecord currentSnackbar;

    @Nullable
    private SnackbarRecord nextSnackbar;

    @NonNull
    private final Object lock = new Object();

    @NonNull
    private final Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.SnackbarManager.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            SnackbarManager.this.handleTimeout((SnackbarRecord) message.obj);
            return true;
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface Callback {
        void dismiss(int i8);

        void show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class SnackbarRecord {

        @NonNull
        final WeakReference<Callback> callback;
        int duration;
        boolean paused;

        SnackbarRecord(int i8, Callback callback) {
            this.callback = new WeakReference<>(callback);
            this.duration = i8;
        }

        boolean isSnackbar(@Nullable Callback callback) {
            if (callback != null && this.callback.get() == callback) {
                return true;
            }
            return false;
        }
    }

    private SnackbarManager() {
    }

    private boolean cancelSnackbarLocked(@NonNull SnackbarRecord snackbarRecord, int i8) {
        Callback callback = snackbarRecord.callback.get();
        if (callback != null) {
            this.handler.removeCallbacksAndMessages(snackbarRecord);
            callback.dismiss(i8);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SnackbarManager getInstance() {
        if (snackbarManager == null) {
            snackbarManager = new SnackbarManager();
        }
        return snackbarManager;
    }

    private boolean isCurrentSnackbarLocked(Callback callback) {
        SnackbarRecord snackbarRecord = this.currentSnackbar;
        if (snackbarRecord != null && snackbarRecord.isSnackbar(callback)) {
            return true;
        }
        return false;
    }

    private boolean isNextSnackbarLocked(Callback callback) {
        SnackbarRecord snackbarRecord = this.nextSnackbar;
        if (snackbarRecord != null && snackbarRecord.isSnackbar(callback)) {
            return true;
        }
        return false;
    }

    private void scheduleTimeoutLocked(@NonNull SnackbarRecord snackbarRecord) {
        int i8 = snackbarRecord.duration;
        if (i8 == -2) {
            return;
        }
        if (i8 <= 0) {
            if (i8 == -1) {
                i8 = SHORT_DURATION_MS;
            } else {
                i8 = LONG_DURATION_MS;
            }
        }
        this.handler.removeCallbacksAndMessages(snackbarRecord);
        Handler handler = this.handler;
        handler.sendMessageDelayed(Message.obtain(handler, 0, snackbarRecord), i8);
    }

    private void showNextSnackbarLocked() {
        SnackbarRecord snackbarRecord = this.nextSnackbar;
        if (snackbarRecord != null) {
            this.currentSnackbar = snackbarRecord;
            this.nextSnackbar = null;
            Callback callback = snackbarRecord.callback.get();
            if (callback != null) {
                callback.show();
            } else {
                this.currentSnackbar = null;
            }
        }
    }

    public void dismiss(Callback callback, int i8) {
        synchronized (this.lock) {
            try {
                if (isCurrentSnackbarLocked(callback)) {
                    cancelSnackbarLocked(this.currentSnackbar, i8);
                } else if (isNextSnackbarLocked(callback)) {
                    cancelSnackbarLocked(this.nextSnackbar, i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void handleTimeout(@NonNull SnackbarRecord snackbarRecord) {
        synchronized (this.lock) {
            try {
                if (this.currentSnackbar != snackbarRecord) {
                    if (this.nextSnackbar == snackbarRecord) {
                    }
                }
                cancelSnackbarLocked(snackbarRecord, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isCurrent(Callback callback) {
        boolean isCurrentSnackbarLocked;
        synchronized (this.lock) {
            isCurrentSnackbarLocked = isCurrentSnackbarLocked(callback);
        }
        return isCurrentSnackbarLocked;
    }

    public boolean isCurrentOrNext(Callback callback) {
        boolean z8;
        synchronized (this.lock) {
            try {
                if (!isCurrentSnackbarLocked(callback) && !isNextSnackbarLocked(callback)) {
                    z8 = false;
                }
                z8 = true;
            } finally {
            }
        }
        return z8;
    }

    public void onDismissed(Callback callback) {
        synchronized (this.lock) {
            try {
                if (isCurrentSnackbarLocked(callback)) {
                    this.currentSnackbar = null;
                    if (this.nextSnackbar != null) {
                        showNextSnackbarLocked();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onShown(Callback callback) {
        synchronized (this.lock) {
            try {
                if (isCurrentSnackbarLocked(callback)) {
                    scheduleTimeoutLocked(this.currentSnackbar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void pauseTimeout(Callback callback) {
        synchronized (this.lock) {
            try {
                if (isCurrentSnackbarLocked(callback)) {
                    SnackbarRecord snackbarRecord = this.currentSnackbar;
                    if (!snackbarRecord.paused) {
                        snackbarRecord.paused = true;
                        this.handler.removeCallbacksAndMessages(snackbarRecord);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void restoreTimeoutIfPaused(Callback callback) {
        synchronized (this.lock) {
            try {
                if (isCurrentSnackbarLocked(callback)) {
                    SnackbarRecord snackbarRecord = this.currentSnackbar;
                    if (snackbarRecord.paused) {
                        snackbarRecord.paused = false;
                        scheduleTimeoutLocked(snackbarRecord);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void show(int i8, Callback callback) {
        synchronized (this.lock) {
            try {
                if (isCurrentSnackbarLocked(callback)) {
                    SnackbarRecord snackbarRecord = this.currentSnackbar;
                    snackbarRecord.duration = i8;
                    this.handler.removeCallbacksAndMessages(snackbarRecord);
                    scheduleTimeoutLocked(this.currentSnackbar);
                    return;
                }
                if (isNextSnackbarLocked(callback)) {
                    this.nextSnackbar.duration = i8;
                } else {
                    this.nextSnackbar = new SnackbarRecord(i8, callback);
                }
                SnackbarRecord snackbarRecord2 = this.currentSnackbar;
                if (snackbarRecord2 != null && cancelSnackbarLocked(snackbarRecord2, 4)) {
                    return;
                }
                this.currentSnackbar = null;
                showNextSnackbarLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
