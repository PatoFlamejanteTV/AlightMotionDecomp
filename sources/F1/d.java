package F1;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2110a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f2111b;

    /* renamed from: c, reason: collision with root package name */
    private a f2112c;

    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z8);
    }

    private void c(boolean z8) {
        if (this.f2111b != z8) {
            this.f2111b = z8;
            if (this.f2110a) {
                f(z8);
                a aVar = this.f2112c;
                if (aVar != null) {
                    aVar.a(z8);
                }
            }
        }
    }

    private boolean d() {
        if (e().importance == 100 || h()) {
            return true;
        }
        return false;
    }

    public void a(a aVar) {
        this.f2112c = aVar;
    }

    public void b(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    ActivityManager.RunningAppProcessInfo e() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean g() {
        return this.f2111b;
    }

    protected boolean h() {
        return false;
    }

    public void i() {
        this.f2110a = true;
        boolean d8 = d();
        this.f2111b = d8;
        f(d8);
    }

    public void j() {
        this.f2110a = false;
        this.f2112c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        c(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        c(d());
    }

    protected void f(boolean z8) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
