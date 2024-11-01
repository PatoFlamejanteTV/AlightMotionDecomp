package m1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class H implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final H f34860a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f34861b;

    /* renamed from: c, reason: collision with root package name */
    private static C3348D f34862c;

    private H() {
    }

    public final void a(C3348D c3348d) {
        f34862c = c3348d;
        if (c3348d != null && f34861b) {
            f34861b = false;
            c3348d.k();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3292y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC3292y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        C3348D c3348d = f34862c;
        if (c3348d != null) {
            c3348d.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Q5.I i8;
        AbstractC3292y.i(activity, "activity");
        C3348D c3348d = f34862c;
        if (c3348d != null) {
            c3348d.k();
            i8 = Q5.I.f8786a;
        } else {
            i8 = null;
        }
        if (i8 == null) {
            f34861b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC3292y.i(activity, "activity");
        AbstractC3292y.i(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC3292y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC3292y.i(activity, "activity");
    }
}
