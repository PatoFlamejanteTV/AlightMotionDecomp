package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ComponentCallbacks2C2083a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C2083a f16093e = new ComponentCallbacks2C2083a();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f16094a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f16095b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f16096c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f16097d = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0376a {
        void a(boolean z8);
    }

    private ComponentCallbacks2C2083a() {
    }

    public static ComponentCallbacks2C2083a b() {
        return f16093e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C2083a componentCallbacks2C2083a = f16093e;
        synchronized (componentCallbacks2C2083a) {
            try {
                if (!componentCallbacks2C2083a.f16097d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C2083a);
                    application.registerComponentCallbacks(componentCallbacks2C2083a);
                    componentCallbacks2C2083a.f16097d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z8) {
        synchronized (f16093e) {
            try {
                Iterator it = this.f16096c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0376a) it.next()).a(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(InterfaceC0376a interfaceC0376a) {
        synchronized (f16093e) {
            this.f16096c.add(interfaceC0376a);
        }
    }

    public boolean d() {
        return this.f16094a.get();
    }

    public boolean e(boolean z8) {
        if (!this.f16095b.get()) {
            if (V.k.b()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (!this.f16095b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.f16094a.set(true);
                }
            } else {
                return z8;
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f16095b;
        boolean compareAndSet = this.f16094a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f16095b;
        boolean compareAndSet = this.f16094a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i8) {
        if (i8 == 20 && this.f16094a.compareAndSet(false, true)) {
            this.f16095b.set(true);
            f(true);
        }
    }
}
