package U6;

import R5.AbstractC1428l;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: U6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1452h implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f10221d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final C1452h f10222e = new C1452h(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10223a;

    /* renamed from: b, reason: collision with root package name */
    private transient int f10224b;

    /* renamed from: c, reason: collision with root package name */
    private transient String f10225c;

    /* renamed from: U6.h$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C1452h a(String str) {
            AbstractC3292y.i(str, "<this>");
            byte[] a9 = AbstractC1445a.a(str);
            if (a9 != null) {
                return new C1452h(a9);
            }
            return null;
        }

        public final C1452h b(String str) {
            AbstractC3292y.i(str, "<this>");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = i8 * 2;
                    bArr[i8] = (byte) ((V6.b.b(str.charAt(i9)) << 4) + V6.b.b(str.charAt(i9 + 1)));
                }
                return new C1452h(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final C1452h c(String str) {
            AbstractC3292y.i(str, "<this>");
            C1452h c1452h = new C1452h(c0.a(str));
            c1452h.G(str);
            return c1452h;
        }

        public final C1452h d(byte... data) {
            AbstractC3292y.i(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            AbstractC3292y.h(copyOf, "copyOf(this, size)");
            return new C1452h(copyOf);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C1452h(byte[] data) {
        AbstractC3292y.i(data, "data");
        this.f10223a = data;
    }

    public static /* synthetic */ int A(C1452h c1452h, C1452h c1452h2, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i8 = AbstractC1446b.c();
            }
            return c1452h.u(c1452h2, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static final C1452h C(byte... bArr) {
        return f10221d.d(bArr);
    }

    public static /* synthetic */ C1452h M(C1452h c1452h, int i8, int i9, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                i8 = 0;
            }
            if ((i10 & 2) != 0) {
                i9 = AbstractC1446b.c();
            }
            return c1452h.L(i8, i9);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static final C1452h c(String str) {
        return f10221d.a(str);
    }

    public static final C1452h d(String str) {
        return f10221d.b(str);
    }

    public static final C1452h f(String str) {
        return f10221d.c(str);
    }

    public static /* synthetic */ int q(C1452h c1452h, C1452h c1452h2, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 2) != 0) {
                i8 = 0;
            }
            return c1452h.o(c1452h2, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public final C1452h B() {
        return e(SameMD5.TAG);
    }

    public boolean D(int i8, C1452h other, int i9, int i10) {
        AbstractC3292y.i(other, "other");
        return other.E(i9, i(), i8, i10);
    }

    public boolean E(int i8, byte[] other, int i9, int i10) {
        AbstractC3292y.i(other, "other");
        if (i8 >= 0 && i8 <= i().length - i10 && i9 >= 0 && i9 <= other.length - i10 && AbstractC1446b.a(i(), i8, other, i9, i10)) {
            return true;
        }
        return false;
    }

    public final void F(int i8) {
        this.f10224b = i8;
    }

    public final void G(String str) {
        this.f10225c = str;
    }

    public final C1452h H() {
        return e("SHA-256");
    }

    public final int J() {
        return k();
    }

    public final boolean K(C1452h prefix) {
        AbstractC3292y.i(prefix, "prefix");
        return D(0, prefix, 0, prefix.J());
    }

    public C1452h L(int i8, int i9) {
        int d8 = AbstractC1446b.d(this, i9);
        if (i8 >= 0) {
            if (d8 <= i().length) {
                if (d8 - i8 >= 0) {
                    if (i8 == 0 && d8 == i().length) {
                        return this;
                    }
                    return new C1452h(AbstractC1428l.o(i(), i8, d8));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + i().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public C1452h N() {
        for (int i8 = 0; i8 < i().length; i8++) {
            byte b9 = i()[i8];
            if (b9 >= 65 && b9 <= 90) {
                byte[] i9 = i();
                byte[] copyOf = Arrays.copyOf(i9, i9.length);
                AbstractC3292y.h(copyOf, "copyOf(this, size)");
                copyOf[i8] = (byte) (b9 + 32);
                for (int i10 = i8 + 1; i10 < copyOf.length; i10++) {
                    byte b10 = copyOf[i10];
                    if (b10 >= 65 && b10 <= 90) {
                        copyOf[i10] = (byte) (b10 + 32);
                    }
                }
                return new C1452h(copyOf);
            }
        }
        return this;
    }

    public byte[] O() {
        byte[] i8 = i();
        byte[] copyOf = Arrays.copyOf(i8, i8.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public String P() {
        String m8 = m();
        if (m8 == null) {
            String c8 = c0.c(r());
            G(c8);
            return c8;
        }
        return m8;
    }

    public void R(C1449e buffer, int i8, int i9) {
        AbstractC3292y.i(buffer, "buffer");
        V6.b.d(this, buffer, i8, i9);
    }

    public String a() {
        return AbstractC1445a.c(i(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(U6.C1452h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.AbstractC3292y.i(r10, r0)
            int r0 = r9.J()
            int r1 = r10.J()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.h(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.h(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = -1
            goto L34
        L2c:
            r3 = 1
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U6.C1452h.compareTo(U6.h):int");
    }

    public C1452h e(String algorithm) {
        AbstractC3292y.i(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f10223a, 0, J());
        byte[] digestBytes = messageDigest.digest();
        AbstractC3292y.h(digestBytes, "digestBytes");
        return new C1452h(digestBytes);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1452h) {
            C1452h c1452h = (C1452h) obj;
            if (c1452h.J() == i().length && c1452h.E(0, i(), 0, i().length)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(C1452h suffix) {
        AbstractC3292y.i(suffix, "suffix");
        return D(J() - suffix.J(), suffix, 0, suffix.J());
    }

    public final byte h(int i8) {
        return t(i8);
    }

    public int hashCode() {
        int j8 = j();
        if (j8 == 0) {
            int hashCode = Arrays.hashCode(i());
            F(hashCode);
            return hashCode;
        }
        return j8;
    }

    public final byte[] i() {
        return this.f10223a;
    }

    public final int j() {
        return this.f10224b;
    }

    public int k() {
        return i().length;
    }

    public final String m() {
        return this.f10225c;
    }

    public String n() {
        char[] cArr = new char[i().length * 2];
        int i8 = 0;
        for (byte b9 : i()) {
            int i9 = i8 + 1;
            cArr[i8] = V6.b.f()[(b9 >> 4) & 15];
            i8 += 2;
            cArr[i9] = V6.b.f()[b9 & 15];
        }
        return l6.n.n(cArr);
    }

    public final int o(C1452h other, int i8) {
        AbstractC3292y.i(other, "other");
        return p(other.r(), i8);
    }

    public int p(byte[] other, int i8) {
        AbstractC3292y.i(other, "other");
        int length = i().length - other.length;
        int max = Math.max(i8, 0);
        if (max <= length) {
            while (!AbstractC1446b.a(i(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] r() {
        return i();
    }

    public byte t(int i8) {
        return i()[i8];
    }

    public String toString() {
        C1452h c1452h;
        String str;
        if (i().length == 0) {
            str = "[size=0]";
        } else {
            int a9 = V6.b.a(i(), 64);
            if (a9 == -1) {
                if (i().length <= 64) {
                    str = "[hex=" + n() + ']';
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[size=");
                    sb.append(i().length);
                    sb.append(" hex=");
                    int d8 = AbstractC1446b.d(this, 64);
                    if (d8 <= i().length) {
                        if (d8 >= 0) {
                            if (d8 == i().length) {
                                c1452h = this;
                            } else {
                                c1452h = new C1452h(AbstractC1428l.o(i(), 0, d8));
                            }
                            sb.append(c1452h.n());
                            sb.append("…]");
                            return sb.toString();
                        }
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    throw new IllegalArgumentException(("endIndex > length(" + i().length + ')').toString());
                }
            } else {
                String P8 = P();
                String substring = P8.substring(0, a9);
                AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String z8 = l6.n.z(l6.n.z(l6.n.z(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
                if (a9 < P8.length()) {
                    return "[size=" + i().length + " text=" + z8 + "…]";
                }
                return "[text=" + z8 + ']';
            }
        }
        return str;
    }

    public final int u(C1452h other, int i8) {
        AbstractC3292y.i(other, "other");
        return v(other.r(), i8);
    }

    public int v(byte[] other, int i8) {
        AbstractC3292y.i(other, "other");
        for (int min = Math.min(AbstractC1446b.d(this, i8), i().length - other.length); -1 < min; min--) {
            if (AbstractC1446b.a(i(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }
}
