package V;

import N.AbstractC1349l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f10391a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f10392b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f10393c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f10394d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f10394d == null) {
            boolean z8 = false;
            if (k.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z8 = true;
            }
            f10394d = Boolean.valueOf(z8);
        }
        return f10394d.booleanValue();
    }

    public static boolean b() {
        int i8 = AbstractC1349l.f6370a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (!c(context) || k.g()) {
            if (e(context)) {
                if (!k.h() || k.k()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean e(Context context) {
        if (f10392b == null) {
            boolean z8 = false;
            if (k.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z8 = true;
            }
            f10392b = Boolean.valueOf(z8);
        }
        return f10392b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f10393c == null) {
            boolean z8 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z8 = false;
            }
            f10393c = Boolean.valueOf(z8);
        }
        return f10393c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f10391a == null) {
            boolean z8 = false;
            if (k.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z8 = true;
            }
            f10391a = Boolean.valueOf(z8);
        }
        return f10391a.booleanValue();
    }
}
