package l6;

import Q5.C1413h;
import Q5.F;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: l6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3334D {
    public static final byte a(String str) {
        AbstractC3292y.i(str, "<this>");
        Q5.y b9 = b(str);
        if (b9 != null) {
            return b9.f();
        }
        v.h(str);
        throw new C1413h();
    }

    public static final Q5.y b(String str) {
        AbstractC3292y.i(str, "<this>");
        return c(str, 10);
    }

    public static final Q5.y c(String str, int i8) {
        int compare;
        AbstractC3292y.i(str, "<this>");
        Q5.A f8 = f(str, i8);
        if (f8 == null) {
            return null;
        }
        int f9 = f8.f();
        compare = Integer.compare(f9 ^ Integer.MIN_VALUE, Q5.A.b(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return Q5.y.a(Q5.y.b((byte) f9));
    }

    public static final int d(String str) {
        AbstractC3292y.i(str, "<this>");
        Q5.A e8 = e(str);
        if (e8 != null) {
            return e8.f();
        }
        v.h(str);
        throw new C1413h();
    }

    public static final Q5.A e(String str) {
        AbstractC3292y.i(str, "<this>");
        return f(str, 10);
    }

    public static final Q5.A f(String str, int i8) {
        int i9;
        int compare;
        int compare2;
        int compare3;
        AbstractC3292y.i(str, "<this>");
        AbstractC3335a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        if (AbstractC3292y.k(charAt, 48) < 0) {
            i9 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i9 = 0;
        }
        int b9 = Q5.A.b(i8);
        int i11 = 119304647;
        while (i9 < length) {
            int b10 = AbstractC3336b.b(str.charAt(i9), i8);
            if (b10 >= 0) {
                compare = Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    if (i11 == 119304647) {
                        i11 = AbstractC3333C.a(-1, b9);
                        compare3 = Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                int b11 = Q5.A.b(i10 * b9);
                int b12 = Q5.A.b(Q5.A.b(b10) + b11);
                compare2 = Integer.compare(b12 ^ Integer.MIN_VALUE, b11 ^ Integer.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i9++;
                i10 = b12;
            } else {
                return null;
            }
        }
        return Q5.A.a(i10);
    }

    public static final long g(String str) {
        AbstractC3292y.i(str, "<this>");
        Q5.C h8 = h(str);
        if (h8 != null) {
            return h8.g();
        }
        v.h(str);
        throw new C1413h();
    }

    public static final Q5.C h(String str) {
        AbstractC3292y.i(str, "<this>");
        return i(str, 10);
    }

    public static final Q5.C i(String str, int i8) {
        int compare;
        int compare2;
        int compare3;
        AbstractC3292y.i(str, "<this>");
        AbstractC3335a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char charAt = str.charAt(0);
        if (AbstractC3292y.k(charAt, 48) < 0) {
            i9 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long b9 = Q5.C.b(i8);
        long j8 = 0;
        long j9 = 512409557603043100L;
        while (i9 < length) {
            if (AbstractC3336b.b(str.charAt(i9), i8) >= 0) {
                compare = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    if (j9 == 512409557603043100L) {
                        j9 = AbstractC3331A.a(-1L, b9);
                        compare3 = Long.compare(j8 ^ Long.MIN_VALUE, j9 ^ Long.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                long b10 = Q5.C.b(j8 * b9);
                long b11 = Q5.C.b(Q5.C.b(Q5.A.b(r13) & 4294967295L) + b10);
                compare2 = Long.compare(b11 ^ Long.MIN_VALUE, b10 ^ Long.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i9++;
                j8 = b11;
            } else {
                return null;
            }
        }
        return Q5.C.a(j8);
    }

    public static final short j(String str) {
        AbstractC3292y.i(str, "<this>");
        F k8 = k(str);
        if (k8 != null) {
            return k8.f();
        }
        v.h(str);
        throw new C1413h();
    }

    public static final F k(String str) {
        AbstractC3292y.i(str, "<this>");
        return l(str, 10);
    }

    public static final F l(String str, int i8) {
        int compare;
        AbstractC3292y.i(str, "<this>");
        Q5.A f8 = f(str, i8);
        if (f8 == null) {
            return null;
        }
        int f9 = f8.f();
        compare = Integer.compare(f9 ^ Integer.MIN_VALUE, Q5.A.b(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return F.a(F.b((short) f9));
    }
}
