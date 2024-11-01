package androidx.room;

import Q5.I;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class AutoCloser {
    public static final Companion Companion = new Companion(null);
    public static final String autoCloseBug = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    private long autoCloseTimeoutInMs;
    private final Runnable autoCloser;

    @GuardedBy("lock")
    private SupportSQLiteDatabase delegateDatabase;
    public SupportSQLiteOpenHelper delegateOpenHelper;
    private final Runnable executeAutoCloser;
    private final Executor executor;
    private final Handler handler;

    @GuardedBy("lock")
    private long lastDecrementRefCountTimeStamp;
    private final Object lock;
    private boolean manuallyClosed;
    private Runnable onAutoCloseCallback;

    @GuardedBy("lock")
    private int refCount;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public AutoCloser(long j8, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        AbstractC3292y.i(autoCloseTimeUnit, "autoCloseTimeUnit");
        AbstractC3292y.i(autoCloseExecutor, "autoCloseExecutor");
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = autoCloseTimeUnit.toMillis(j8);
        this.executor = autoCloseExecutor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() { // from class: androidx.room.a
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloser.executeAutoCloser$lambda$0(AutoCloser.this);
            }
        };
        this.autoCloser = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloser.autoCloser$lambda$3(AutoCloser.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void autoCloser$lambda$3(AutoCloser this$0) {
        I i8;
        AbstractC3292y.i(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                if (SystemClock.uptimeMillis() - this$0.lastDecrementRefCountTimeStamp < this$0.autoCloseTimeoutInMs) {
                    return;
                }
                if (this$0.refCount != 0) {
                    return;
                }
                Runnable runnable = this$0.onAutoCloseCallback;
                if (runnable != null) {
                    runnable.run();
                    i8 = I.f8786a;
                } else {
                    i8 = null;
                }
                if (i8 != null) {
                    SupportSQLiteDatabase supportSQLiteDatabase = this$0.delegateDatabase;
                    if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                        supportSQLiteDatabase.close();
                    }
                    this$0.delegateDatabase = null;
                    I i9 = I.f8786a;
                    return;
                }
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAutoCloser$lambda$0(AutoCloser this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.executor.execute(this$0.autoCloser);
    }

    public final void closeDatabaseIfOpen() throws IOException {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
                if (supportSQLiteDatabase != null) {
                    supportSQLiteDatabase.close();
                }
                this.delegateDatabase = null;
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void decrementCountAndScheduleClose() {
        synchronized (this.lock) {
            try {
                int i8 = this.refCount;
                if (i8 > 0) {
                    int i9 = i8 - 1;
                    this.refCount = i9;
                    if (i9 == 0) {
                        if (this.delegateDatabase == null) {
                            return;
                        } else {
                            this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
                        }
                    }
                    I i10 = I.f8786a;
                    return;
                }
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <V> V executeRefCountingFunction(Function1 block) {
        AbstractC3292y.i(block, "block");
        try {
            return (V) block.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    public final SupportSQLiteDatabase getDelegateDatabase$room_runtime_release() {
        return this.delegateDatabase;
    }

    public final SupportSQLiteOpenHelper getDelegateOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.delegateOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        AbstractC3292y.y("delegateOpenHelper");
        return null;
    }

    public final long getLastDecrementRefCountTimeStamp$room_runtime_release() {
        return this.lastDecrementRefCountTimeStamp;
    }

    public final Runnable getOnAutoCloseCallback$room_runtime_release() {
        return this.onAutoCloseCallback;
    }

    public final int getRefCount$room_runtime_release() {
        return this.refCount;
    }

    @VisibleForTesting
    public final int getRefCountForTest$room_runtime_release() {
        int i8;
        synchronized (this.lock) {
            i8 = this.refCount;
        }
        return i8;
    }

    public final SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (!this.manuallyClosed) {
                SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
                if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                    return supportSQLiteDatabase;
                }
                SupportSQLiteDatabase writableDatabase = getDelegateOpenHelper().getWritableDatabase();
                this.delegateDatabase = writableDatabase;
                return writableDatabase;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    public final void init(SupportSQLiteOpenHelper delegateOpenHelper) {
        AbstractC3292y.i(delegateOpenHelper, "delegateOpenHelper");
        setDelegateOpenHelper(delegateOpenHelper);
    }

    public final boolean isActive() {
        return !this.manuallyClosed;
    }

    public final void setAutoCloseCallback(Runnable onAutoClose) {
        AbstractC3292y.i(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void setDelegateDatabase$room_runtime_release(SupportSQLiteDatabase supportSQLiteDatabase) {
        this.delegateDatabase = supportSQLiteDatabase;
    }

    public final void setDelegateOpenHelper(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        AbstractC3292y.i(supportSQLiteOpenHelper, "<set-?>");
        this.delegateOpenHelper = supportSQLiteOpenHelper;
    }

    public final void setLastDecrementRefCountTimeStamp$room_runtime_release(long j8) {
        this.lastDecrementRefCountTimeStamp = j8;
    }

    public final void setOnAutoCloseCallback$room_runtime_release(Runnable runnable) {
        this.onAutoCloseCallback = runnable;
    }

    public final void setRefCount$room_runtime_release(int i8) {
        this.refCount = i8;
    }
}
