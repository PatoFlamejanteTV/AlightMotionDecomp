package V;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static final int f10400a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f10401b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f10402c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f10403d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f10404e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f10405f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f10406g;

    /* renamed from: h, reason: collision with root package name */
    private static final Method f10407h;

    /* renamed from: i, reason: collision with root package name */
    private static final Method f10408i;

    /* renamed from: j, reason: collision with root package name */
    private static Boolean f10409j;

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|2|3|4|(22:54|55|7|8|9|10|11|12|13|(13:46|47|16|(10:41|42|19|(7:36|37|22|(6:28|29|30|31|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004c, code lost:            r3 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x003c, code lost:            r3 = null;     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.String r3 = "add"
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            int r5 = android.os.Process.myUid()
            V.p.f10400a = r5
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L19
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L19
            r6[r1] = r7     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r6 = r4.getMethod(r3, r6)     // Catch: java.lang.Exception -> L19
            goto L1b
        L19:
            r6 = r5
        L1b:
            V.p.f10401b = r6
            boolean r6 = V.k.c()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r6 == 0) goto L32
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L32
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L32
            r6[r1] = r8     // Catch: java.lang.Exception -> L32
            r6[r2] = r7     // Catch: java.lang.Exception -> L32
            java.lang.reflect.Method r3 = r4.getMethod(r3, r6)     // Catch: java.lang.Exception -> L32
            goto L33
        L32:
            r3 = r5
        L33:
            V.p.f10402c = r3
            java.lang.String r3 = "size"
            java.lang.reflect.Method r3 = r4.getMethod(r3, r5)     // Catch: java.lang.Exception -> L3c
            goto L3d
        L3c:
            r3 = r5
        L3d:
            V.p.f10403d = r3
            java.lang.String r3 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4c
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4c
            r6[r1] = r8     // Catch: java.lang.Exception -> L4c
            java.lang.reflect.Method r3 = r4.getMethod(r3, r6)     // Catch: java.lang.Exception -> L4c
            goto L4e
        L4c:
            r3 = r5
        L4e:
            V.p.f10404e = r3
            boolean r3 = V.k.c()
            if (r3 == 0) goto L64
            java.lang.String r3 = "getName"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L63
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L63
            r6[r1] = r8     // Catch: java.lang.Exception -> L63
            java.lang.reflect.Method r3 = r4.getMethod(r3, r6)     // Catch: java.lang.Exception -> L63
            goto L65
        L63:
        L64:
            r3 = r5
        L65:
            V.p.f10405f = r3
            boolean r3 = V.k.i()
            java.lang.String r6 = "WorkSourceUtil"
            if (r3 == 0) goto L7c
            java.lang.String r3 = "createWorkChain"
            java.lang.reflect.Method r3 = r4.getMethod(r3, r5)     // Catch: java.lang.Exception -> L76
            goto L7d
        L76:
            r3 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r6, r8, r3)
        L7c:
            r3 = r5
        L7d:
            V.p.f10406g = r3
            boolean r3 = V.k.i()
            if (r3 == 0) goto La0
            java.lang.String r3 = "android.os.WorkSource$WorkChain"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r8 = "addNode"
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L9a
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9a
            r0[r1] = r9     // Catch: java.lang.Exception -> L9a
            r0[r2] = r7     // Catch: java.lang.Exception -> L9a
            java.lang.reflect.Method r0 = r3.getMethod(r8, r0)     // Catch: java.lang.Exception -> L9a
            goto La1
        L9a:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r6, r1, r0)
        La0:
            r0 = r5
        La1:
            V.p.f10407h = r0
            boolean r0 = V.k.i()
            if (r0 == 0) goto Lb3
            java.lang.String r0 = "isEmpty"
            java.lang.reflect.Method r0 = r4.getMethod(r0, r5)     // Catch: java.lang.Exception -> Lb3
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> Lb4
            goto Lb4
        Lb3:
            r0 = r5
        Lb4:
            V.p.f10408i = r0
            V.p.f10409j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.p.<clinit>():void");
    }

    public static void a(WorkSource workSource, int i8, String str) {
        Method method = f10402c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i8), str);
                return;
            } catch (Exception e8) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
                return;
            }
        }
        Method method2 = f10401b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i8));
            } catch (Exception e9) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c8 = X.e.a(context).c(str, 0);
                if (c8 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i8 = c8.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i8, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        synchronized (p.class) {
            Boolean bool = f10409j;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z8 = false;
            if (context == null) {
                return false;
            }
            if (ContextCompat.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z8 = true;
            }
            f10409j = Boolean.valueOf(z8);
            return z8;
        }
    }
}
