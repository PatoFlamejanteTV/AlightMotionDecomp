package q5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Debug;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3771D {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37266a;

    public C3771D(Context context) {
        AbstractC3292y.i(context, "context");
        this.f37266a = context;
    }

    private final boolean a() {
        if ((this.f37266a.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    private final boolean c() {
        C3784i c3784i = new C3784i();
        PackageManager packageManager = this.f37266a.getPackageManager();
        AbstractC3292y.h(packageManager, "getPackageManager(...)");
        String packageName = this.f37266a.getPackageName();
        AbstractC3292y.h(packageName, "getPackageName(...)");
        return l6.n.s(c3784i.n(packageManager, packageName), "822b9ca12b534ebcf426632221d951bfc60eb08f9f0cf2839c321b0685c2e8a4", true);
    }

    public final boolean b() {
        if (!c() || a() || Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            return true;
        }
        return false;
    }
}
