package W6;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentMap;

/* renamed from: W6.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1488n extends AbstractC1492s {

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap f10861c = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final String f10862a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f10863b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W6.n$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f10864a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f10865b;

        a(byte[] bArr) {
            this.f10864a = J7.a.k(bArr);
            this.f10865b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return J7.a.a(this.f10865b, ((a) obj).f10865b);
            }
            return false;
        }

        public int hashCode() {
            return this.f10864a;
        }
    }

    C1488n(C1488n c1488n, String str) {
        if (!D(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.f10862a = c1488n.A() + "." + str;
    }

    public static C1488n B(Object obj) {
        if (obj != null && !(obj instanceof C1488n)) {
            if (obj instanceof InterfaceC1476d) {
                AbstractC1492s d8 = ((InterfaceC1476d) obj).d();
                if (d8 instanceof C1488n) {
                    return (C1488n) d8;
                }
            }
            if (obj instanceof byte[]) {
                try {
                    return (C1488n) AbstractC1492s.q((byte[]) obj);
                } catch (IOException e8) {
                    throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e8.getMessage());
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        return (C1488n) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:            return false;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean D(java.lang.String r8, int r9) {
        /*
            int r0 = r8.length()
            r1 = 0
            r2 = 0
        L6:
            int r3 = r0 + (-1)
            r4 = 48
            r5 = 1
            if (r3 < r9) goto L2e
            char r6 = r8.charAt(r3)
            r7 = 46
            if (r6 != r7) goto L23
            if (r2 == 0) goto L22
            if (r2 <= r5) goto L20
            char r0 = r8.charAt(r0)
            if (r0 != r4) goto L20
            goto L22
        L20:
            r2 = 0
            goto L2b
        L22:
            return r1
        L23:
            if (r4 > r6) goto L2d
            r0 = 57
            if (r6 > r0) goto L2d
            int r2 = r2 + 1
        L2b:
            r0 = r3
            goto L6
        L2d:
            return r1
        L2e:
            if (r2 == 0) goto L3a
            if (r2 <= r5) goto L39
            char r8 = r8.charAt(r0)
            if (r8 != r4) goto L39
            goto L3a
        L39:
            return r5
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.C1488n.D(java.lang.String, int):boolean");
    }

    private static boolean E(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return D(str, 2);
    }

    private void G(ByteArrayOutputStream byteArrayOutputStream, long j8) {
        byte[] bArr = new byte[9];
        int i8 = 8;
        bArr[8] = (byte) (((int) j8) & ModuleDescriptor.MODULE_VERSION);
        while (j8 >= 128) {
            j8 >>= 7;
            i8--;
            bArr[i8] = (byte) ((((int) j8) & ModuleDescriptor.MODULE_VERSION) | 128);
        }
        byteArrayOutputStream.write(bArr, i8, 9 - i8);
    }

    private void H(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i8 = bitLength - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            bArr[i9] = (byte) ((bigInteger.intValue() & ModuleDescriptor.MODULE_VERSION) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i8] = (byte) (bArr[i8] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    private void v(ByteArrayOutputStream byteArrayOutputStream) {
        D0 d02 = new D0(this.f10862a);
        int parseInt = Integer.parseInt(d02.b()) * 40;
        String b9 = d02.b();
        if (b9.length() <= 18) {
            G(byteArrayOutputStream, parseInt + Long.parseLong(b9));
        } else {
            H(byteArrayOutputStream, new BigInteger(b9).add(BigInteger.valueOf(parseInt)));
        }
        while (d02.a()) {
            String b10 = d02.b();
            if (b10.length() <= 18) {
                G(byteArrayOutputStream, Long.parseLong(b10));
            } else {
                H(byteArrayOutputStream, new BigInteger(b10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1488n y(byte[] bArr) {
        C1488n c1488n = (C1488n) f10861c.get(new a(bArr));
        if (c1488n == null) {
            return new C1488n(bArr);
        }
        return c1488n;
    }

    private synchronized byte[] z() {
        try {
            if (this.f10863b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                v(byteArrayOutputStream);
                this.f10863b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10863b;
    }

    public String A() {
        return this.f10862a;
    }

    public C1488n C() {
        a aVar = new a(z());
        ConcurrentMap concurrentMap = f10861c;
        C1488n c1488n = (C1488n) concurrentMap.get(aVar);
        if (c1488n == null) {
            C1488n c1488n2 = (C1488n) concurrentMap.putIfAbsent(aVar, this);
            if (c1488n2 == null) {
                return this;
            }
            return c1488n2;
        }
        return c1488n;
    }

    public boolean F(C1488n c1488n) {
        String A8 = A();
        String A9 = c1488n.A();
        if (A8.length() > A9.length() && A8.charAt(A9.length()) == '.' && A8.startsWith(A9)) {
            return true;
        }
        return false;
    }

    @Override // W6.AbstractC1492s, W6.AbstractC1487m
    public int hashCode() {
        return this.f10862a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean l(AbstractC1492s abstractC1492s) {
        if (abstractC1492s == this) {
            return true;
        }
        if (!(abstractC1492s instanceof C1488n)) {
            return false;
        }
        return this.f10862a.equals(((C1488n) abstractC1492s).f10862a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.n(z8, 6, z());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public int n() {
        int length = z().length;
        return E0.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.AbstractC1492s
    public boolean r() {
        return false;
    }

    public String toString() {
        return A();
    }

    public C1488n u(String str) {
        return new C1488n(this, str);
    }

    public C1488n(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (E(str)) {
            this.f10862a = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    C1488n(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z8 = true;
        BigInteger bigInteger = null;
        long j8 = 0;
        for (int i8 = 0; i8 != bArr.length; i8++) {
            byte b9 = bArr[i8];
            if (j8 <= 72057594037927808L) {
                long j9 = j8 + (b9 & Byte.MAX_VALUE);
                if ((b9 & 128) == 0) {
                    if (z8) {
                        if (j9 < 40) {
                            stringBuffer.append('0');
                        } else if (j9 < 80) {
                            stringBuffer.append('1');
                            j9 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j9 -= 80;
                        }
                        z8 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j9);
                    j8 = 0;
                } else {
                    j8 = j9 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j8) : bigInteger).or(BigInteger.valueOf(b9 & Byte.MAX_VALUE));
                if ((b9 & 128) == 0) {
                    if (z8) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z8 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    bigInteger = null;
                    j8 = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f10862a = stringBuffer.toString();
        this.f10863b = J7.a.d(bArr);
    }
}
