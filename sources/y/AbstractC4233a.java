package y;

import android.os.Build;
import android.util.Log;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4233a {
    private static String a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    public static void b(String str, String str2, Object obj) {
        String e8 = e(str);
        if (Log.isLoggable(e8, 3)) {
            Log.d(e8, String.format(str2, obj));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        String e8 = e(str);
        if (Log.isLoggable(e8, 3)) {
            Log.d(e8, String.format(str2, objArr));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String e8 = e(str);
        if (Log.isLoggable(e8, 6)) {
            Log.e(e8, str2, th);
        }
    }

    private static String e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    public static void f(String str, String str2, Object obj) {
        String e8 = e(str);
        if (Log.isLoggable(e8, 4)) {
            Log.i(e8, String.format(str2, obj));
        }
    }

    public static void g(String str, String str2, Object obj) {
        String e8 = e(str);
        if (Log.isLoggable(e8, 5)) {
            Log.w(e8, String.format(str2, obj));
        }
    }
}
