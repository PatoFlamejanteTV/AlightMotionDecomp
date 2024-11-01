package v0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4118a {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f40417a;

    /* renamed from: b, reason: collision with root package name */
    private static Context f40418b;

    /* renamed from: c, reason: collision with root package name */
    private static C0907a f40419c;

    /* renamed from: v0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0907a {

        /* renamed from: b, reason: collision with root package name */
        private static Method f40420b;

        /* renamed from: a, reason: collision with root package name */
        private final PackageManager f40421a;

        C0907a(PackageManager packageManager) {
            this.f40421a = packageManager;
        }

        Boolean a() {
            if (!AbstractC4118a.a()) {
                return null;
            }
            if (f40420b == null) {
                try {
                    f40420b = PackageManager.class.getDeclaredMethod("isInstantApp", null);
                } catch (NoSuchMethodException unused) {
                    return null;
                }
            }
            try {
                return (Boolean) f40420b.invoke(this.f40421a, null);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return null;
            }
        }
    }

    static /* synthetic */ boolean a() {
        return b();
    }

    private static boolean b() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean c(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                if (f40417a != null && applicationContext.equals(f40418b)) {
                    return f40417a.booleanValue();
                }
                Boolean bool = null;
                f40417a = null;
                if (b()) {
                    if (f40419c == null || !applicationContext.equals(f40418b)) {
                        f40419c = new C0907a(applicationContext.getPackageManager());
                    }
                    bool = f40419c.a();
                }
                f40418b = applicationContext;
                if (bool != null) {
                    f40417a = bool;
                } else {
                    try {
                        applicationContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f40417a = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        f40417a = Boolean.FALSE;
                    }
                }
                return f40417a.booleanValue();
            }
            throw new IllegalStateException("Application context is null!");
        }
        throw new IllegalArgumentException("Context must be non-null");
    }
}
