package X;

import V.k;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f10911a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f10912b;

    public static synchronized boolean a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f10911a;
            if (context2 != null && (bool = f10912b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f10912b = null;
            if (k.h()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f10912b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f10912b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f10912b = Boolean.FALSE;
                }
            }
            f10911a = applicationContext;
            return f10912b.booleanValue();
        }
    }
}
