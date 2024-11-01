package m6;

import R5.N;
import e6.AbstractC2829a;
import i6.i;
import i6.m;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import m6.C3374a;

/* renamed from: m6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC3376c {
    public static final long i(long j8, int i8) {
        return C3374a.h((j8 << 1) + i8);
    }

    public static final long j(long j8) {
        return C3374a.h((j8 << 1) + 1);
    }

    public static final long k(long j8) {
        if (-4611686018426L <= j8 && j8 < 4611686018427L) {
            return l(n(j8));
        }
        return j(m.m(j8, -4611686018427387903L, 4611686018427387903L));
    }

    public static final long l(long j8) {
        return C3374a.h(j8 << 1);
    }

    public static final long m(long j8) {
        if (-4611686018426999999L <= j8 && j8 < 4611686018427000000L) {
            return l(j8);
        }
        return j(o(j8));
    }

    public static final long n(long j8) {
        return j8 * 1000000;
    }

    public static final long o(long j8) {
        return j8 / 1000000;
    }

    public static final long p(String str, boolean z8) {
        int i8;
        boolean z9;
        boolean z10;
        long j8;
        char charAt;
        char charAt2;
        int i9;
        char charAt3;
        int length = str.length();
        if (length != 0) {
            C3374a.C0804a c0804a = C3374a.f35036b;
            long b9 = c0804a.b();
            char charAt4 = str.charAt(0);
            if (charAt4 != '+' && charAt4 != '-') {
                i8 = 0;
            } else {
                i8 = 1;
            }
            if (i8 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && n.x0(str, '-', false, 2, null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (length > i8) {
                char c8 = ':';
                char c9 = '0';
                if (str.charAt(i8) == 'P') {
                    int i10 = i8 + 1;
                    if (i10 != length) {
                        EnumC3377d enumC3377d = null;
                        boolean z11 = false;
                        while (i10 < length) {
                            if (str.charAt(i10) == 'T') {
                                if (!z11 && (i10 = i10 + 1) != length) {
                                    z11 = true;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                int i11 = i10;
                                while (i11 < str.length() && ((c9 <= (charAt3 = str.charAt(i11)) && charAt3 < c8) || n.F("+-.", charAt3, false, 2, null))) {
                                    i11++;
                                    c8 = ':';
                                    c9 = '0';
                                }
                                AbstractC3292y.g(str, "null cannot be cast to non-null type java.lang.String");
                                String substring = str.substring(i10, i11);
                                AbstractC3292y.h(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = i10 + substring.length();
                                    if (length2 >= 0 && length2 < str.length()) {
                                        char charAt5 = str.charAt(length2);
                                        int i12 = length2 + 1;
                                        EnumC3377d d8 = AbstractC3379f.d(charAt5, z11);
                                        if (enumC3377d != null && enumC3377d.compareTo(d8) <= 0) {
                                            throw new IllegalArgumentException("Unexpected order of duration components");
                                        }
                                        int Q8 = n.Q(substring, '.', 0, false, 6, null);
                                        if (d8 == EnumC3377d.f35046e && Q8 > 0) {
                                            AbstractC3292y.g(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring2 = substring.substring(0, Q8);
                                            AbstractC3292y.h(substring2, "substring(...)");
                                            i9 = i12;
                                            long I8 = C3374a.I(b9, t(q(substring2), d8));
                                            AbstractC3292y.g(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring3 = substring.substring(Q8);
                                            AbstractC3292y.h(substring3, "substring(...)");
                                            b9 = C3374a.I(I8, r(Double.parseDouble(substring3), d8));
                                        } else {
                                            i9 = i12;
                                            b9 = C3374a.I(b9, t(q(substring), d8));
                                        }
                                        i10 = i9;
                                        enumC3377d = d8;
                                        c8 = ':';
                                        c9 = '0';
                                    } else {
                                        throw new IllegalArgumentException("Missing unit for value " + substring);
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (!z8) {
                    String str2 = "Unexpected order of duration components";
                    if (n.u(str, i8, "Infinity", 0, Math.max(length - i8, 8), true)) {
                        b9 = c0804a.a();
                    } else {
                        boolean z12 = !z9;
                        if (z9 && str.charAt(i8) == '(' && n.R0(str) == ')') {
                            i8++;
                            length--;
                            if (i8 != length) {
                                j8 = b9;
                                z12 = true;
                            } else {
                                throw new IllegalArgumentException("No components");
                            }
                        } else {
                            j8 = b9;
                        }
                        EnumC3377d enumC3377d2 = null;
                        boolean z13 = false;
                        while (i8 < length) {
                            if (z13 && z12) {
                                while (i8 < str.length() && str.charAt(i8) == ' ') {
                                    i8++;
                                }
                            }
                            int i13 = i8;
                            while (i13 < str.length() && (('0' <= (charAt2 = str.charAt(i13)) && charAt2 < ':') || charAt2 == '.')) {
                                i13++;
                            }
                            AbstractC3292y.g(str, "null cannot be cast to non-null type java.lang.String");
                            String substring4 = str.substring(i8, i13);
                            AbstractC3292y.h(substring4, "substring(...)");
                            if (substring4.length() != 0) {
                                int length3 = i8 + substring4.length();
                                int i14 = length3;
                                while (i14 < str.length() && 'a' <= (charAt = str.charAt(i14)) && charAt < '{') {
                                    i14++;
                                }
                                AbstractC3292y.g(str, "null cannot be cast to non-null type java.lang.String");
                                String substring5 = str.substring(length3, i14);
                                AbstractC3292y.h(substring5, "substring(...)");
                                i8 = length3 + substring5.length();
                                EnumC3377d e8 = AbstractC3379f.e(substring5);
                                if (enumC3377d2 == null || enumC3377d2.compareTo(e8) > 0) {
                                    String str3 = str2;
                                    int Q9 = n.Q(substring4, '.', 0, false, 6, null);
                                    if (Q9 > 0) {
                                        AbstractC3292y.g(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring6 = substring4.substring(0, Q9);
                                        AbstractC3292y.h(substring6, "substring(...)");
                                        long I9 = C3374a.I(j8, t(Long.parseLong(substring6), e8));
                                        AbstractC3292y.g(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring7 = substring4.substring(Q9);
                                        AbstractC3292y.h(substring7, "substring(...)");
                                        j8 = C3374a.I(I9, r(Double.parseDouble(substring7), e8));
                                        i8 = i8;
                                        if (i8 < length) {
                                            throw new IllegalArgumentException("Fractional component must be last");
                                        }
                                    } else {
                                        j8 = C3374a.I(j8, t(Long.parseLong(substring4), e8));
                                    }
                                    str2 = str3;
                                    enumC3377d2 = e8;
                                    z13 = true;
                                } else {
                                    throw new IllegalArgumentException(str2);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        b9 = j8;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                if (z10) {
                    return C3374a.O(b9);
                }
                return b9;
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    private static final long q(String str) {
        int i8;
        int length = str.length();
        if (length > 0 && n.F("+-", str.charAt(0), false, 2, null)) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (length - i8 > 16) {
            Iterable iVar = new i(i8, n.L(str));
            if (!(iVar instanceof Collection) || !((Collection) iVar).isEmpty()) {
                Iterator it = iVar.iterator();
                while (it.hasNext()) {
                    char charAt = str.charAt(((N) it).nextInt());
                    if ('0' <= charAt && charAt < ':') {
                    }
                }
            }
            if (str.charAt(0) == '-') {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
        if (n.B(str, "+", false, 2, null)) {
            str = n.P0(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d8, EnumC3377d unit) {
        AbstractC3292y.i(unit, "unit");
        double a9 = AbstractC3378e.a(d8, unit, EnumC3377d.f35043b);
        if (!Double.isNaN(a9)) {
            long e8 = AbstractC2829a.e(a9);
            if (-4611686018426999999L <= e8 && e8 < 4611686018427000000L) {
                return l(e8);
            }
            return k(AbstractC2829a.e(AbstractC3378e.a(d8, unit, EnumC3377d.f35045d)));
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    public static final long s(int i8, EnumC3377d unit) {
        AbstractC3292y.i(unit, "unit");
        if (unit.compareTo(EnumC3377d.f35046e) <= 0) {
            return l(AbstractC3378e.c(i8, unit, EnumC3377d.f35043b));
        }
        return t(i8, unit);
    }

    public static final long t(long j8, EnumC3377d unit) {
        AbstractC3292y.i(unit, "unit");
        EnumC3377d enumC3377d = EnumC3377d.f35043b;
        long c8 = AbstractC3378e.c(4611686018426999999L, enumC3377d, unit);
        if ((-c8) <= j8 && j8 <= c8) {
            return l(AbstractC3378e.c(j8, unit, enumC3377d));
        }
        return j(m.m(AbstractC3378e.b(j8, unit, EnumC3377d.f35045d), -4611686018427387903L, 4611686018427387903L));
    }
}
