package N;

import Q.AbstractC1396p;
import Q.Y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: N.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1349l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6370a = 12451000;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6372c = false;

    /* renamed from: d, reason: collision with root package name */
    static boolean f6373d = false;

    /* renamed from: b, reason: collision with root package name */
    static final AtomicBoolean f6371b = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f6374e = new AtomicBoolean();

    public static void a(Context context, int i8) {
        int h8 = C1345h.f().h(context, i8);
        if (h8 != 0) {
            Intent b9 = C1345h.f().b(context, h8, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + h8);
            if (b9 == null) {
                throw new C1346i(h8);
            }
            throw new C1347j(h8, "Google Play Services not available", b9);
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static String c(int i8) {
        return C1339b.I(i8);
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        try {
            if (!f6373d) {
                try {
                    PackageInfo e8 = X.e.a(context).e("com.google.android.gms", 64);
                    C1350m.a(context);
                    if (e8 != null && !C1350m.e(e8, false) && C1350m.e(e8, true)) {
                        f6372c = true;
                    } else {
                        f6372c = false;
                    }
                    f6373d = true;
                } catch (PackageManager.NameNotFoundException e9) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e9);
                    f6373d = true;
                }
            }
            if (!f6372c && V.h.b()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            f6373d = true;
            throw th;
        }
    }

    public static int g(Context context, int i8) {
        boolean z8;
        boolean z9;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(AbstractC1351n.f6378a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f6374e.get()) {
            int a9 = Y.a(context);
            if (a9 != 0) {
                if (a9 != f6370a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(a9);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        if (!V.h.d(context) && !V.h.f(context)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (i8 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1396p.a(z9);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z8) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1350m.a(context);
            if (!C1350m.e(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z8) {
                    AbstractC1396p.l(packageInfo);
                    if (!C1350m.e(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z8 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else {
                    if (V.q.a(packageInfo2.versionCode) < V.q.a(i8)) {
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i8 + " but found " + packageInfo2.versionCode);
                        return 2;
                    }
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e8) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e8);
                            return 1;
                        }
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    return 3;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    public static boolean h(Context context, int i8) {
        if (i8 == 18) {
            return true;
        }
        if (i8 == 1) {
            return l(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean i(Context context) {
        if (V.k.c()) {
            Object systemService = context.getSystemService("user");
            AbstractC1396p.l(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean j(int i8) {
        if (i8 == 1 || i8 == 2 || i8 == 3 || i8 == 9) {
            return true;
        }
        return false;
    }

    public static boolean k(Context context, int i8, String str) {
        return V.o.b(context, i8, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (V.k.f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled && !i(context)) {
            return true;
        }
        return false;
    }
}
