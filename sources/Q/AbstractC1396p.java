package Q;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: Q.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1396p {
    public static void a(boolean z8) {
        if (z8) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z8, Object obj) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z8, String str, Object... objArr) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + str + ".");
        }
    }

    public static void e(String str) {
        if (V.r.a()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static String f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String g(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void h() {
        i("Must not be called on GoogleApiHandler thread.");
    }

    public static void i(String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException(str);
            }
        }
    }

    public static void j() {
        k("Must not be called on the main application thread");
    }

    public static void k(String str) {
        if (!V.r.a()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static Object l(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object m(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int n(int i8) {
        if (i8 != 0) {
            return i8;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static void o(boolean z8) {
        if (z8) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void p(boolean z8, Object obj) {
        if (z8) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
