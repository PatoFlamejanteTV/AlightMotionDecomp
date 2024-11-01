package androidx.activity;

import Q5.I;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;

    @GuardedBy("lock")
    private final List<Function0> onReportCallbacks;
    private final Function0 reportFullyDrawn;

    @GuardedBy("lock")
    private boolean reportPosted;
    private final Runnable reportRunnable;

    @GuardedBy("lock")
    private boolean reportedFullyDrawn;

    @GuardedBy("lock")
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, Function0 reportFullyDrawn) {
        AbstractC3292y.i(executor, "executor");
        AbstractC3292y.i(reportFullyDrawn, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = reportFullyDrawn;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.j
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.reportRunnable$lambda$2(FullyDrawnReporter.this);
            }
        };
    }

    private final void postWhenReportersAreDone() {
        if (!this.reportPosted && this.reporterCount == 0) {
            this.reportPosted = true;
            this.executor.execute(this.reportRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter this$0) {
        AbstractC3292y.i(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                this$0.reportPosted = false;
                if (this$0.reporterCount == 0 && !this$0.reportedFullyDrawn) {
                    this$0.reportFullyDrawn.invoke();
                    this$0.fullyDrawnReported();
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void addOnReportDrawnListener(Function0 callback) {
        boolean z8;
        AbstractC3292y.i(callback, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z8 = true;
            } else {
                this.onReportCallbacks.add(callback);
                z8 = false;
            }
        }
        if (z8) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn) {
                    this.reporterCount++;
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z8;
        synchronized (this.lock) {
            z8 = this.reportedFullyDrawn;
        }
        return z8;
    }

    public final void removeOnReportDrawnListener(Function0 callback) {
        AbstractC3292y.i(callback, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(callback);
            I i8 = I.f8786a;
        }
    }

    public final void removeReporter() {
        int i8;
        synchronized (this.lock) {
            try {
                if (!this.reportedFullyDrawn && (i8 = this.reporterCount) > 0) {
                    this.reporterCount = i8 - 1;
                    postWhenReportersAreDone();
                }
                I i9 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
