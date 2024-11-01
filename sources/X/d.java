package X;

import V.k;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f10913a;

    public d(Context context) {
        this.f10913a = context;
    }

    public int a(String str) {
        return this.f10913a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.f10913a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i8) {
        return this.f10913a.getPackageManager().getApplicationInfo(str, i8);
    }

    public CharSequence d(String str) {
        Context context = this.f10913a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo e(String str, int i8) {
        return this.f10913a.getPackageManager().getPackageInfo(str, i8);
    }

    public boolean f() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f10913a);
        }
        if (k.h() && (nameForUid = this.f10913a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = this.f10913a.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    public final boolean g(int i8, String str) {
        if (k.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f10913a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i8, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f10913a.getPackageManager().getPackagesForUid(i8);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
