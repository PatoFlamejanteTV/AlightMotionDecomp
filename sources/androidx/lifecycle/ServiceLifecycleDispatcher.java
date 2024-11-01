package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public class ServiceLifecycleDispatcher {
    private final Handler handler;
    private DispatchRunnable lastDispatchRunnable;
    private final LifecycleRegistry registry;

    /* loaded from: classes3.dex */
    public static final class DispatchRunnable implements Runnable {
        private final Lifecycle.Event event;
        private final LifecycleRegistry registry;
        private boolean wasExecuted;

        public DispatchRunnable(LifecycleRegistry registry, Lifecycle.Event event) {
            AbstractC3292y.i(registry, "registry");
            AbstractC3292y.i(event, "event");
            this.registry = registry;
            this.event = event;
        }

        public final Lifecycle.Event getEvent() {
            return this.event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.wasExecuted) {
                this.registry.handleLifecycleEvent(this.event);
                this.wasExecuted = true;
            }
        }
    }

    public ServiceLifecycleDispatcher(LifecycleOwner provider) {
        AbstractC3292y.i(provider, "provider");
        this.registry = new LifecycleRegistry(provider);
        this.handler = new Handler();
    }

    private final void postDispatchRunnable(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.lastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.registry, event);
        this.lastDispatchRunnable = dispatchRunnable2;
        Handler handler = this.handler;
        AbstractC3292y.f(dispatchRunnable2);
        handler.postAtFrontOfQueue(dispatchRunnable2);
    }

    public Lifecycle getLifecycle() {
        return this.registry;
    }

    public void onServicePreSuperOnBind() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        postDispatchRunnable(Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        postDispatchRunnable(Lifecycle.Event.ON_STOP);
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }
}
