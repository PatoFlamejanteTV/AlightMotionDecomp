package N;

import Q.AbstractC1396p;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;

/* renamed from: N.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1350m {

    /* renamed from: c, reason: collision with root package name */
    private static C1350m f6375c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6376a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f6377b;

    public C1350m(Context context) {
        this.f6376a = context.getApplicationContext();
    }

    public static C1350m a(Context context) {
        AbstractC1396p.l(context);
        synchronized (C1350m.class) {
            try {
                if (f6375c == null) {
                    D.d(context);
                    f6375c = new C1350m(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6375c;
    }

    static final z d(PackageInfo packageInfo, z... zVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            A a9 = new A(packageInfo.signatures[0].toByteArray());
            for (int i8 = 0; i8 < zVarArr.length; i8++) {
                if (zVarArr[i8].equals(a9)) {
                    return zVarArr[i8];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = 1
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            N.z[] r4 = N.C.f6320a
            N.z r4 = d(r2, r4)
            goto L45
        L39:
            N.z[] r4 = N.C.f6320a
            r4 = r4[r1]
            N.z[] r5 = new N.z[r0]
            r5[r1] = r4
            N.z r4 = d(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C1350m.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    private final N f(String str, boolean z8, boolean z9) {
        N c8;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return N.c("null pkg");
        }
        if (!str.equals(this.f6377b)) {
            if (D.e()) {
                c8 = D.b(str, AbstractC1349l.f(this.f6376a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.f6376a.getPackageManager().getPackageInfo(str, 64);
                    boolean f8 = AbstractC1349l.f(this.f6376a);
                    if (packageInfo == null) {
                        c8 = N.c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            A a9 = new A(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            N a10 = D.a(str2, a9, f8, false);
                            if (a10.f6344a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && D.a(str2, a9, false, true).f6344a) {
                                c8 = N.c("debuggable release cert app rejected");
                            } else {
                                c8 = a10;
                            }
                        } else {
                            c8 = N.c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e8) {
                    return N.d("no pkg ".concat(str), e8);
                }
            }
            if (c8.f6344a) {
                this.f6377b = str;
            }
            return c8;
        }
        return N.b();
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (AbstractC1349l.f(this.f6376a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i8) {
        N c8;
        int length;
        String[] packagesForUid = this.f6376a.getPackageManager().getPackagesForUid(i8);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c8 = null;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    c8 = f(packagesForUid[i9], false, false);
                    if (c8.f6344a) {
                        break;
                    }
                    i9++;
                } else {
                    AbstractC1396p.l(c8);
                    break;
                }
            }
        } else {
            c8 = N.c("no pkgs");
        }
        c8.e();
        return c8.f6344a;
    }
}
