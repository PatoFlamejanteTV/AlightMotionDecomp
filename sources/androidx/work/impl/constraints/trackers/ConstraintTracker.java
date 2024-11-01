package androidx.work.impl.constraints.trackers;

import Q5.I;
import R5.AbstractC1435t;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class ConstraintTracker<T> {
    private final Context appContext;
    private T currentState;
    private final LinkedHashSet<ConstraintListener<T>> listeners;
    private final Object lock;
    private final TaskExecutor taskExecutor;

    /* JADX INFO: Access modifiers changed from: protected */
    public ConstraintTracker(Context context, TaskExecutor taskExecutor) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(taskExecutor, "taskExecutor");
        this.taskExecutor = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        AbstractC3292y.h(applicationContext, "context.applicationContext");
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_state_$lambda$4$lambda$3(List listenersList, ConstraintTracker this$0) {
        AbstractC3292y.i(listenersList, "$listenersList");
        AbstractC3292y.i(this$0, "this$0");
        Iterator<T> it = listenersList.iterator();
        while (it.hasNext()) {
            ((ConstraintListener) it.next()).onConstraintChanged(this$0.currentState);
        }
    }

    public final void addListener(ConstraintListener<T> listener) {
        String str;
        AbstractC3292y.i(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.add(listener)) {
                    if (this.listeners.size() == 1) {
                        this.currentState = readSystemState();
                        Logger logger = Logger.get();
                        str = ConstraintTrackerKt.TAG;
                        logger.debug(str, getClass().getSimpleName() + ": initial state = " + this.currentState);
                        startTracking();
                    }
                    listener.onConstraintChanged(this.currentState);
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context getAppContext() {
        return this.appContext;
    }

    public final T getState() {
        T t8 = this.currentState;
        if (t8 == null) {
            return readSystemState();
        }
        return t8;
    }

    public abstract T readSystemState();

    public final void removeListener(ConstraintListener<T> listener) {
        AbstractC3292y.i(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                    stopTracking();
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setState(T t8) {
        synchronized (this.lock) {
            T t9 = this.currentState;
            if (t9 != null && AbstractC3292y.d(t9, t8)) {
                return;
            }
            this.currentState = t8;
            final List W02 = AbstractC1435t.W0(this.listeners);
            this.taskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: androidx.work.impl.constraints.trackers.a
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTracker._set_state_$lambda$4$lambda$3(W02, this);
                }
            });
            I i8 = I.f8786a;
        }
    }

    public abstract void startTracking();

    public abstract void stopTracking();
}
