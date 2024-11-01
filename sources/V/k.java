package V;

import android.os.Build;

/* loaded from: classes3.dex */
public abstract class k {
    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return true;
    }

    public static boolean c() {
        return true;
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean k() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }
}
