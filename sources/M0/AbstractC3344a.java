package m0;

import N.AbstractC1349l;
import N.C1345h;
import N.C1346i;
import Q.AbstractC1396p;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3344a {

    /* renamed from: a, reason: collision with root package name */
    private static final C1345h f34812a = C1345h.f();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f34813b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Method f34814c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f34815d = null;

    public static void a(Context context) {
        Context context2;
        AbstractC1396p.m(context, "Context must not be null");
        f34812a.k(context, 11925000);
        synchronized (f34813b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.f16185f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e8) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e8.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context d8 = AbstractC1349l.d(context);
            if (d8 != null) {
                try {
                    if (f34815d == null) {
                        Class cls = Long.TYPE;
                        f34815d = b(d8, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f34815d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e9) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e9.getMessage())));
                }
            }
            if (d8 != null) {
                c(d8, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new C1346i(8);
            }
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, Context context2, String str) {
        String message;
        try {
            if (f34814c == null) {
                f34814c = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f34814c.invoke(null, context);
        } catch (Exception e8) {
            Throwable cause = e8.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    message = e8.getMessage();
                } else {
                    message = cause.getMessage();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(message)));
            }
            throw new C1346i(8);
        }
    }
}
