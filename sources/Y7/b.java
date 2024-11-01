package Y7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f13147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f13148b;

    public b(a aVar) {
        this.f13148b = aVar;
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC3292y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC3292y.i(activity, "activity");
        AbstractC3292y.i(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        WeakReference weakReference = this.f13147a;
        if (weakReference == null || !AbstractC3292y.d((Activity) weakReference.get(), activity)) {
            if (!c.f13149a) {
                this.f13148b.a();
                c.f13149a = true;
            }
            this.f13147a = new WeakReference(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Activity activity2;
        AbstractC3292y.i(activity, "activity");
        WeakReference weakReference = this.f13147a;
        if (weakReference == null) {
            activity2 = null;
        } else {
            activity2 = (Activity) weakReference.get();
        }
        if (AbstractC3292y.d(activity2, activity)) {
            if (c.f13149a) {
                this.f13148b.b();
                c.f13149a = false;
            }
            this.f13147a = null;
        }
    }
}
