package w0;

/* loaded from: classes3.dex */
public abstract class h {
    private static String a(int i8, int i9, String str) {
        if (i8 < 0) {
            return j.a("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return j.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String b(int i8, int i9, String str) {
        if (i8 < 0) {
            return j.a("%s (%s) must not be negative", str, Integer.valueOf(i8));
        }
        if (i9 >= 0) {
            return j.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i8), Integer.valueOf(i9));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String c(int i8, int i9, int i10) {
        if (i8 >= 0 && i8 <= i10) {
            if (i9 >= 0 && i9 <= i10) {
                return j.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i9), Integer.valueOf(i8));
            }
            return b(i9, i10, "end index");
        }
        return b(i8, i10, "start index");
    }

    public static void d(boolean z8) {
        if (z8) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z8, Object obj) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z8, String str, int i8, int i9) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(j.a(str, Integer.valueOf(i8), Integer.valueOf(i9)));
        }
    }

    public static int g(int i8, int i9) {
        return h(i8, i9, "index");
    }

    public static int h(int i8, int i9, String str) {
        if (i8 >= 0 && i8 < i9) {
            return i8;
        }
        throw new IndexOutOfBoundsException(a(i8, i9, str));
    }

    public static Object i(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object j(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int k(int i8, int i9) {
        return l(i8, i9, "index");
    }

    public static int l(int i8, int i9, String str) {
        if (i8 >= 0 && i8 <= i9) {
            return i8;
        }
        throw new IndexOutOfBoundsException(b(i8, i9, str));
    }

    public static void m(int i8, int i9, int i10) {
        if (i8 >= 0 && i9 >= i8 && i9 <= i10) {
        } else {
            throw new IndexOutOfBoundsException(c(i8, i9, i10));
        }
    }

    public static void n(boolean z8) {
        if (z8) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void o(boolean z8, Object obj) {
        if (z8) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void p(boolean z8, String str, Object obj) {
        if (z8) {
        } else {
            throw new IllegalStateException(j.a(str, obj));
        }
    }
}
