package androidx.window.layout;

import Q5.I;
import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.GuardedBy;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {

    @GuardedBy("lock")
    private final Map<Activity, MulticastConsumer> activityToListeners;
    private final WindowLayoutComponent component;
    private final ReentrantLock extensionWindowBackendLock;

    @GuardedBy("lock")
    private final Map<Consumer<WindowLayoutInfo>, Activity> listenerToActivity;

    @SuppressLint({"NewApi"})
    /* loaded from: classes3.dex */
    private static final class MulticastConsumer implements java.util.function.Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {
        private final Activity activity;

        @GuardedBy("lock")
        private WindowLayoutInfo lastKnownValue;
        private final ReentrantLock multicastConsumerLock;

        @GuardedBy("lock")
        private final Set<Consumer<WindowLayoutInfo>> registeredListeners;

        public MulticastConsumer(Activity activity) {
            AbstractC3292y.i(activity, "activity");
            this.activity = activity;
            this.multicastConsumerLock = new ReentrantLock();
            this.registeredListeners = new LinkedHashSet();
        }

        public final void addListener(Consumer<WindowLayoutInfo> listener) {
            AbstractC3292y.i(listener, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
                if (windowLayoutInfo != null) {
                    listener.accept(windowLayoutInfo);
                }
                this.registeredListeners.add(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        public /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }

        public final void removeListener(Consumer<WindowLayoutInfo> listener) {
            AbstractC3292y.i(listener, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.function.Consumer
        public void accept(androidx.window.extensions.layout.WindowLayoutInfo value) {
            AbstractC3292y.i(value, "value");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, value);
                Iterator<T> it = this.registeredListeners.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).accept(this.lastKnownValue);
                }
                I i8 = I.f8786a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public ExtensionWindowLayoutInfoBackend(WindowLayoutComponent component) {
        AbstractC3292y.i(component, "component");
        this.component = component;
        this.extensionWindowBackendLock = new ReentrantLock();
        this.activityToListeners = new LinkedHashMap();
        this.listenerToActivity = new LinkedHashMap();
    }

    @Override // androidx.window.layout.WindowBackend
    public void registerLayoutChangeCallback(Activity activity, Executor executor, Consumer<WindowLayoutInfo> callback) {
        I i8;
        AbstractC3292y.i(activity, "activity");
        AbstractC3292y.i(executor, "executor");
        AbstractC3292y.i(callback, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                i8 = null;
            } else {
                multicastConsumer.addListener(callback);
                this.listenerToActivity.put(callback, activity);
                i8 = I.f8786a;
            }
            if (i8 == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                this.activityToListeners.put(activity, multicastConsumer2);
                this.listenerToActivity.put(callback, activity);
                multicastConsumer2.addListener(callback);
                this.component.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
            I i9 = I.f8786a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.layout.WindowBackend
    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> callback) {
        AbstractC3292y.i(callback, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(callback);
            if (activity == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.removeListener(callback);
            if (multicastConsumer.isEmpty()) {
                this.component.removeWindowLayoutInfoListener(multicastConsumer);
            }
            I i8 = I.f8786a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
