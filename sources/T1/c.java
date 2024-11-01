package t1;

import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class c implements Closeable, Flushable {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f39454j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f39455k = new String[128];

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f39456l;

    /* renamed from: a, reason: collision with root package name */
    private final Writer f39457a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f39458b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int f39459c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f39460d;

    /* renamed from: e, reason: collision with root package name */
    private String f39461e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f39462f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f39463g;

    /* renamed from: h, reason: collision with root package name */
    private String f39464h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39465i;

    static {
        for (int i8 = 0; i8 <= 31; i8++) {
            f39455k[i8] = String.format("\\u%04x", Integer.valueOf(i8));
        }
        String[] strArr = f39455k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f39456l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        F(6);
        this.f39461e = ":";
        this.f39465i = true;
        Objects.requireNonNull(writer, "out == null");
        this.f39457a = writer;
    }

    private c B(int i8, char c8) {
        b();
        F(i8);
        this.f39457a.write(c8);
        return this;
    }

    private int E() {
        int i8 = this.f39459c;
        if (i8 != 0) {
            return this.f39458b[i8 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void F(int i8) {
        int i9 = this.f39459c;
        int[] iArr = this.f39458b;
        if (i9 == iArr.length) {
            this.f39458b = Arrays.copyOf(iArr, i9 * 2);
        }
        int[] iArr2 = this.f39458b;
        int i10 = this.f39459c;
        this.f39459c = i10 + 1;
        iArr2[i10] = i8;
    }

    private void G(int i8) {
        this.f39458b[this.f39459c - 1] = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void L(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f39463g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = t1.c.f39456l
            goto L9
        L7:
            java.lang.String[] r0 = t1.c.f39455k
        L9:
            java.io.Writer r1 = r8.f39457a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f39457a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f39457a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f39457a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f39457a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.c.L(java.lang.String):void");
    }

    private void S() {
        if (this.f39464h != null) {
            a();
            L(this.f39464h);
            this.f39464h = null;
        }
    }

    private void a() {
        int E8 = E();
        if (E8 == 5) {
            this.f39457a.write(44);
        } else if (E8 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        v();
        G(4);
    }

    private void b() {
        int E8 = E();
        if (E8 != 1) {
            if (E8 != 2) {
                if (E8 != 4) {
                    if (E8 != 6) {
                        if (E8 == 7) {
                            if (!this.f39462f) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    G(7);
                    return;
                }
                this.f39457a.append((CharSequence) this.f39461e);
                G(5);
                return;
            }
            this.f39457a.append(',');
            v();
            return;
        }
        G(2);
        v();
    }

    private c i(int i8, int i9, char c8) {
        int E8 = E();
        if (E8 != i9 && E8 != i8) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f39464h == null) {
            this.f39459c--;
            if (E8 == i9) {
                v();
            }
            this.f39457a.write(c8);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f39464h);
    }

    private static boolean t(Class cls) {
        if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            return false;
        }
        return true;
    }

    private void v() {
        if (this.f39460d == null) {
            return;
        }
        this.f39457a.write(10);
        int i8 = this.f39459c;
        for (int i9 = 1; i9 < i8; i9++) {
            this.f39457a.write(this.f39460d);
        }
    }

    public final void H(boolean z8) {
        this.f39463g = z8;
    }

    public final void I(String str) {
        if (str.length() == 0) {
            this.f39460d = null;
            this.f39461e = ":";
        } else {
            this.f39460d = str;
            this.f39461e = ": ";
        }
    }

    public final void J(boolean z8) {
        this.f39462f = z8;
    }

    public final void K(boolean z8) {
        this.f39465i = z8;
    }

    public c M(double d8) {
        S();
        if (!this.f39462f && (Double.isNaN(d8) || Double.isInfinite(d8))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d8);
        }
        b();
        this.f39457a.append((CharSequence) Double.toString(d8));
        return this;
    }

    public c N(long j8) {
        S();
        b();
        this.f39457a.write(Long.toString(j8));
        return this;
    }

    public c O(Boolean bool) {
        String str;
        if (bool == null) {
            return z();
        }
        S();
        b();
        Writer writer = this.f39457a;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    public c P(Number number) {
        if (number == null) {
            return z();
        }
        S();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!t(cls) && !f39454j.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f39462f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + obj);
        }
        b();
        this.f39457a.append((CharSequence) obj);
        return this;
    }

    public c Q(String str) {
        if (str == null) {
            return z();
        }
        S();
        b();
        L(str);
        return this;
    }

    public c R(boolean z8) {
        String str;
        S();
        b();
        Writer writer = this.f39457a;
        if (z8) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39457a.close();
        int i8 = this.f39459c;
        if (i8 <= 1 && (i8 != 1 || this.f39458b[i8 - 1] == 7)) {
            this.f39459c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void flush() {
        if (this.f39459c != 0) {
            this.f39457a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c g() {
        S();
        return B(1, '[');
    }

    public c h() {
        S();
        return B(3, '{');
    }

    public c j() {
        return i(1, 2, ']');
    }

    public c k() {
        return i(3, 5, '}');
    }

    public final boolean p() {
        return this.f39465i;
    }

    public final boolean q() {
        return this.f39463g;
    }

    public boolean r() {
        return this.f39462f;
    }

    public c u(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f39464h == null) {
            if (this.f39459c != 0) {
                this.f39464h = str;
                return this;
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new IllegalStateException();
    }

    public c z() {
        if (this.f39464h != null) {
            if (this.f39465i) {
                S();
            } else {
                this.f39464h = null;
                return this;
            }
        }
        b();
        this.f39457a.write("null");
        return this;
    }
}
