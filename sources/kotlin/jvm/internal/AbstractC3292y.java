package kotlin.jvm.internal;

import java.util.Arrays;

/* renamed from: kotlin.jvm.internal.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3292y {

    /* renamed from: kotlin.jvm.internal.y$a */
    /* loaded from: classes5.dex */
    public static class a {
    }

    public static boolean a(float f8, Float f9) {
        if (f9 != null && f8 == f9.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean b(Float f8, float f9) {
        if (f8 != null && f8.floatValue() == f9) {
            return true;
        }
        return false;
    }

    public static boolean c(Float f8, Float f9) {
        if (f8 == null) {
            if (f9 != null) {
                return false;
            }
        } else if (f9 == null || f8.floatValue() != f9.floatValue()) {
            return false;
        }
        return true;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) o(new IllegalStateException(str + " must not be null")));
    }

    public static void f(Object obj) {
        if (obj == null) {
            r();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) o(new NullPointerException(str + " must not be null")));
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            u(str);
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            t(str);
        }
    }

    public static int k(int i8, int i9) {
        if (i8 < i9) {
            return -1;
        }
        return i8 == i9 ? 0 : 1;
    }

    public static int l(long j8, long j9) {
        if (j8 < j9) {
            return -1;
        }
        return j8 == j9 ? 0 : 1;
    }

    private static String m(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC3292y.class.getName();
        int i8 = 0;
        while (!stackTrace[i8].getClassName().equals(name)) {
            i8++;
        }
        while (stackTrace[i8].getClassName().equals(name)) {
            i8++;
        }
        StackTraceElement stackTraceElement = stackTrace[i8];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void n(int i8, String str) {
        v();
    }

    private static Throwable o(Throwable th) {
        return p(th, AbstractC3292y.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Throwable p(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i8 = -1;
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(stackTrace[i9].getClassName())) {
                i8 = i9;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i8 + 1, length));
        return th;
    }

    public static String q(String str, Object obj) {
        return str + obj;
    }

    public static void r() {
        throw ((NullPointerException) o(new NullPointerException()));
    }

    public static void s(String str) {
        throw ((NullPointerException) o(new NullPointerException(str)));
    }

    private static void t(String str) {
        throw ((IllegalArgumentException) o(new IllegalArgumentException(m(str))));
    }

    private static void u(String str) {
        throw ((NullPointerException) o(new NullPointerException(m(str))));
    }

    public static void v() {
        w("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void w(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void x(String str) {
        throw ((Q5.H) o(new Q5.H(str)));
    }

    public static void y(String str) {
        x("lateinit property " + str + " has not been initialized");
    }
}
