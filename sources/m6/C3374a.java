package m6;

import androidx.exifinterface.media.ExifInterface;
import e6.AbstractC2829a;
import i6.l;
import i6.m;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* renamed from: m6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3374a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final C0804a f35036b = new C0804a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f35037c = h(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f35038d = AbstractC3376c.b(4611686018427387903L);

    /* renamed from: e, reason: collision with root package name */
    private static final long f35039e = AbstractC3376c.b(-4611686018427387903L);

    /* renamed from: a, reason: collision with root package name */
    private final long f35040a;

    /* renamed from: m6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0804a {
        private C0804a() {
        }

        public final long a() {
            return C3374a.f35038d;
        }

        public final long b() {
            return C3374a.f35037c;
        }

        public final long c(String value) {
            AbstractC3292y.i(value, "value");
            try {
                return AbstractC3376c.h(value, true);
            } catch (IllegalArgumentException e8) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e8);
            }
        }

        public /* synthetic */ C0804a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ C3374a(long j8) {
        this.f35040a = j8;
    }

    public static int A(long j8) {
        return androidx.collection.a.a(j8);
    }

    public static final boolean B(long j8) {
        return !E(j8);
    }

    private static final boolean C(long j8) {
        if ((((int) j8) & 1) == 1) {
            return true;
        }
        return false;
    }

    private static final boolean D(long j8) {
        if ((((int) j8) & 1) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean E(long j8) {
        if (j8 != f35038d && j8 != f35039e) {
            return false;
        }
        return true;
    }

    public static final boolean F(long j8) {
        if (j8 < 0) {
            return true;
        }
        return false;
    }

    public static final boolean G(long j8) {
        if (j8 > 0) {
            return true;
        }
        return false;
    }

    public static final long H(long j8, long j9) {
        return I(j8, O(j9));
    }

    public static final long I(long j8, long j9) {
        if (E(j8)) {
            if (!B(j9) && (j9 ^ j8) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j8;
        }
        if (E(j9)) {
            return j9;
        }
        if ((((int) j8) & 1) == (((int) j9) & 1)) {
            long v8 = v(j8) + v(j9);
            if (D(j8)) {
                return AbstractC3376c.e(v8);
            }
            return AbstractC3376c.c(v8);
        }
        if (C(j8)) {
            return c(j8, v(j8), v(j9));
        }
        return c(j8, v(j9), v(j8));
    }

    public static final long J(long j8, int i8) {
        if (E(j8)) {
            if (i8 != 0) {
                if (i8 <= 0) {
                    return O(j8);
                }
                return j8;
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i8 == 0) {
            return f35037c;
        }
        long v8 = v(j8);
        long j9 = i8;
        long j10 = v8 * j9;
        if (D(j8)) {
            if (-2147483647L <= v8 && v8 < 2147483648L) {
                return AbstractC3376c.d(j10);
            }
            if (j10 / j9 == v8) {
                return AbstractC3376c.e(j10);
            }
            long g8 = AbstractC3376c.g(v8);
            long j11 = g8 * j9;
            long g9 = AbstractC3376c.g((v8 - AbstractC3376c.f(g8)) * j9) + j11;
            if (j11 / j9 == g8 && (g9 ^ j11) >= 0) {
                return AbstractC3376c.b(m.n(g9, new l(-4611686018427387903L, 4611686018427387903L)));
            }
            if (AbstractC2829a.b(v8) * AbstractC2829a.a(i8) > 0) {
                return f35038d;
            }
            return f35039e;
        }
        if (j10 / j9 == v8) {
            return AbstractC3376c.b(m.n(j10, new l(-4611686018427387903L, 4611686018427387903L)));
        }
        if (AbstractC2829a.b(v8) * AbstractC2829a.a(i8) > 0) {
            return f35038d;
        }
        return f35039e;
    }

    public static final double K(long j8, EnumC3377d unit) {
        AbstractC3292y.i(unit, "unit");
        if (j8 == f35038d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j8 == f35039e) {
            return Double.NEGATIVE_INFINITY;
        }
        return AbstractC3378e.a(v(j8), u(j8), unit);
    }

    public static final String L(long j8) {
        boolean z8;
        boolean z9;
        StringBuilder sb = new StringBuilder();
        if (F(j8)) {
            sb.append('-');
        }
        sb.append("PT");
        long k8 = k(j8);
        long n8 = n(k8);
        int r8 = r(k8);
        int t8 = t(k8);
        int s8 = s(k8);
        if (E(j8)) {
            n8 = 9999999999999L;
        }
        boolean z10 = false;
        if (n8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (t8 == 0 && s8 == 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (r8 != 0 || (z9 && z8)) {
            z10 = true;
        }
        if (z8) {
            sb.append(n8);
            sb.append('H');
        }
        if (z10) {
            sb.append(r8);
            sb.append('M');
        }
        if (z9 || (!z8 && !z10)) {
            d(j8, sb, t8, s8, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    public static final long M(long j8, EnumC3377d unit) {
        AbstractC3292y.i(unit, "unit");
        if (j8 == f35038d) {
            return Long.MAX_VALUE;
        }
        if (j8 == f35039e) {
            return Long.MIN_VALUE;
        }
        return AbstractC3378e.b(v(j8), u(j8), unit);
    }

    public static String N(long j8) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (j8 == 0) {
            return "0s";
        }
        if (j8 == f35038d) {
            return "Infinity";
        }
        if (j8 == f35039e) {
            return "-Infinity";
        }
        boolean F8 = F(j8);
        StringBuilder sb = new StringBuilder();
        if (F8) {
            sb.append('-');
        }
        long k8 = k(j8);
        long m8 = m(k8);
        int l8 = l(k8);
        int r8 = r(k8);
        int t8 = t(k8);
        int s8 = s(k8);
        int i8 = 0;
        if (m8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (l8 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (r8 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (t8 == 0 && s8 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z8) {
            sb.append(m8);
            sb.append('d');
            i8 = 1;
        }
        if (z9 || (z8 && (z10 || z11))) {
            int i9 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(l8);
            sb.append('h');
            i8 = i9;
        }
        if (z10 || (z11 && (z9 || z8))) {
            int i10 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(r8);
            sb.append('m');
            i8 = i10;
        }
        if (z11) {
            int i11 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            if (t8 == 0 && !z8 && !z9 && !z10) {
                if (s8 >= 1000000) {
                    d(j8, sb, s8 / 1000000, s8 % 1000000, 6, "ms", false);
                } else if (s8 >= 1000) {
                    d(j8, sb, s8 / 1000, s8 % 1000, 3, "us", false);
                } else {
                    sb.append(s8);
                    sb.append("ns");
                }
            } else {
                d(j8, sb, t8, s8, 9, "s", false);
            }
            i8 = i11;
        }
        if (F8 && i8 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }

    public static final long O(long j8) {
        return AbstractC3376c.a(-v(j8), ((int) j8) & 1);
    }

    private static final long c(long j8, long j9, long j10) {
        long g8 = AbstractC3376c.g(j10);
        long j11 = j9 + g8;
        if (-4611686018426L <= j11 && j11 < 4611686018427L) {
            return AbstractC3376c.d(AbstractC3376c.f(j11) + (j10 - AbstractC3376c.f(g8)));
        }
        return AbstractC3376c.b(m.m(j11, -4611686018427387903L, 4611686018427387903L));
    }

    private static final void d(long j8, StringBuilder sb, int i8, int i9, int i10, String str, boolean z8) {
        sb.append(i8);
        if (i9 != 0) {
            sb.append('.');
            String e02 = n.e0(String.valueOf(i9), i10, '0');
            int i11 = -1;
            int length = e02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (e02.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (!z8 && i13 < 3) {
                sb.append((CharSequence) e02, 0, i13);
                AbstractC3292y.h(sb, "append(...)");
            } else {
                sb.append((CharSequence) e02, 0, ((i11 + 3) / 3) * 3);
                AbstractC3292y.h(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ C3374a e(long j8) {
        return new C3374a(j8);
    }

    public static int g(long j8, long j9) {
        long j10 = j8 ^ j9;
        if (j10 >= 0 && (((int) j10) & 1) != 0) {
            int i8 = (((int) j8) & 1) - (((int) j9) & 1);
            if (F(j8)) {
                return -i8;
            }
            return i8;
        }
        return AbstractC3292y.l(j8, j9);
    }

    public static long h(long j8) {
        if (AbstractC3375b.a()) {
            if (D(j8)) {
                long v8 = v(j8);
                if (-4611686018426999999L > v8 || v8 >= 4611686018427000000L) {
                    throw new AssertionError(v(j8) + " ns is out of nanoseconds range");
                }
            } else {
                long v9 = v(j8);
                if (-4611686018427387903L <= v9 && v9 < 4611686018427387904L) {
                    long v10 = v(j8);
                    if (-4611686018426L <= v10 && v10 < 4611686018427L) {
                        throw new AssertionError(v(j8) + " ms is denormalized");
                    }
                } else {
                    throw new AssertionError(v(j8) + " ms is out of milliseconds range");
                }
            }
        }
        return j8;
    }

    public static boolean i(long j8, Object obj) {
        if (!(obj instanceof C3374a) || j8 != ((C3374a) obj).P()) {
            return false;
        }
        return true;
    }

    public static final boolean j(long j8, long j9) {
        if (j8 == j9) {
            return true;
        }
        return false;
    }

    public static final long k(long j8) {
        if (F(j8)) {
            return O(j8);
        }
        return j8;
    }

    public static final int l(long j8) {
        if (E(j8)) {
            return 0;
        }
        return (int) (n(j8) % 24);
    }

    public static final long m(long j8) {
        return M(j8, EnumC3377d.f35049h);
    }

    public static final long n(long j8) {
        return M(j8, EnumC3377d.f35048g);
    }

    public static final long o(long j8) {
        if (C(j8) && B(j8)) {
            return v(j8);
        }
        return M(j8, EnumC3377d.f35045d);
    }

    public static final long p(long j8) {
        return M(j8, EnumC3377d.f35047f);
    }

    public static final long q(long j8) {
        return M(j8, EnumC3377d.f35046e);
    }

    public static final int r(long j8) {
        if (E(j8)) {
            return 0;
        }
        return (int) (p(j8) % 60);
    }

    public static final int s(long j8) {
        long v8;
        if (E(j8)) {
            return 0;
        }
        if (C(j8)) {
            v8 = AbstractC3376c.f(v(j8) % 1000);
        } else {
            v8 = v(j8) % 1000000000;
        }
        return (int) v8;
    }

    public static final int t(long j8) {
        if (E(j8)) {
            return 0;
        }
        return (int) (q(j8) % 60);
    }

    private static final EnumC3377d u(long j8) {
        if (D(j8)) {
            return EnumC3377d.f35043b;
        }
        return EnumC3377d.f35045d;
    }

    private static final long v(long j8) {
        return j8 >> 1;
    }

    public final /* synthetic */ long P() {
        return this.f35040a;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((C3374a) obj).P());
    }

    public boolean equals(Object obj) {
        return i(this.f35040a, obj);
    }

    public int f(long j8) {
        return g(this.f35040a, j8);
    }

    public int hashCode() {
        return A(this.f35040a);
    }

    public String toString() {
        return N(this.f35040a);
    }
}
