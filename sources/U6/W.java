package U6;

import R5.AbstractC1428l;
import java.security.MessageDigest;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class W extends C1452h {

    /* renamed from: f, reason: collision with root package name */
    private final transient byte[][] f10180f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int[] f10181g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(byte[][] segments, int[] directory) {
        super(C1452h.f10222e.i());
        AbstractC3292y.i(segments, "segments");
        AbstractC3292y.i(directory, "directory");
        this.f10180f = segments;
        this.f10181g = directory;
    }

    private final C1452h V() {
        return new C1452h(O());
    }

    @Override // U6.C1452h
    public boolean D(int i8, C1452h other, int i9, int i10) {
        int i11;
        AbstractC3292y.i(other, "other");
        if (i8 < 0 || i8 > J() - i10) {
            return false;
        }
        int i12 = i10 + i8;
        int b9 = V6.e.b(this, i8);
        while (i8 < i12) {
            if (b9 == 0) {
                i11 = 0;
            } else {
                i11 = S()[b9 - 1];
            }
            int i13 = S()[b9] - i11;
            int i14 = S()[T().length + b9];
            int min = Math.min(i12, i13 + i11) - i8;
            if (!other.E(i9, T()[b9], i14 + (i8 - i11), min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            b9++;
        }
        return true;
    }

    @Override // U6.C1452h
    public boolean E(int i8, byte[] other, int i9, int i10) {
        int i11;
        AbstractC3292y.i(other, "other");
        if (i8 < 0 || i8 > J() - i10 || i9 < 0 || i9 > other.length - i10) {
            return false;
        }
        int i12 = i10 + i8;
        int b9 = V6.e.b(this, i8);
        while (i8 < i12) {
            if (b9 == 0) {
                i11 = 0;
            } else {
                i11 = S()[b9 - 1];
            }
            int i13 = S()[b9] - i11;
            int i14 = S()[T().length + b9];
            int min = Math.min(i12, i13 + i11) - i8;
            if (!AbstractC1446b.a(T()[b9], i14 + (i8 - i11), other, i9, min)) {
                return false;
            }
            i9 += min;
            i8 += min;
            b9++;
        }
        return true;
    }

    @Override // U6.C1452h
    public C1452h L(int i8, int i9) {
        int d8 = AbstractC1446b.d(this, i9);
        if (i8 >= 0) {
            if (d8 <= J()) {
                int i10 = d8 - i8;
                if (i10 >= 0) {
                    if (i8 == 0 && d8 == J()) {
                        return this;
                    }
                    if (i8 == d8) {
                        return C1452h.f10222e;
                    }
                    int b9 = V6.e.b(this, i8);
                    int b10 = V6.e.b(this, d8 - 1);
                    byte[][] bArr = (byte[][]) AbstractC1428l.p(T(), b9, b10 + 1);
                    int[] iArr = new int[bArr.length * 2];
                    int i11 = 0;
                    if (b9 <= b10) {
                        int i12 = b9;
                        int i13 = 0;
                        while (true) {
                            iArr[i13] = Math.min(S()[i12] - i8, i10);
                            int i14 = i13 + 1;
                            iArr[i13 + bArr.length] = S()[T().length + i12];
                            if (i12 == b10) {
                                break;
                            }
                            i12++;
                            i13 = i14;
                        }
                    }
                    if (b9 != 0) {
                        i11 = S()[b9 - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i8 - i11);
                    return new W(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + d8 + " < beginIndex=" + i8).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + d8 + " > length(" + J() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i8 + " < 0").toString());
    }

    @Override // U6.C1452h
    public C1452h N() {
        return V().N();
    }

    @Override // U6.C1452h
    public byte[] O() {
        byte[] bArr = new byte[J()];
        int length = T().length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            int i11 = S()[length + i8];
            int i12 = S()[i8];
            int i13 = i12 - i9;
            AbstractC1428l.d(T()[i8], bArr, i10, i11, i11 + i13);
            i10 += i13;
            i8++;
            i9 = i12;
        }
        return bArr;
    }

    @Override // U6.C1452h
    public void R(C1449e buffer, int i8, int i9) {
        int i10;
        AbstractC3292y.i(buffer, "buffer");
        int i11 = i8 + i9;
        int b9 = V6.e.b(this, i8);
        while (i8 < i11) {
            if (b9 == 0) {
                i10 = 0;
            } else {
                i10 = S()[b9 - 1];
            }
            int i12 = S()[b9] - i10;
            int i13 = S()[T().length + b9];
            int min = Math.min(i11, i12 + i10) - i8;
            int i14 = i13 + (i8 - i10);
            U u8 = new U(T()[b9], i14, i14 + min, true, false);
            U u9 = buffer.f10211a;
            if (u9 == null) {
                u8.f10174g = u8;
                u8.f10173f = u8;
                buffer.f10211a = u8;
            } else {
                AbstractC3292y.f(u9);
                U u10 = u9.f10174g;
                AbstractC3292y.f(u10);
                u10.c(u8);
            }
            i8 += min;
            b9++;
        }
        buffer.B(buffer.E() + i9);
    }

    public final int[] S() {
        return this.f10181g;
    }

    public final byte[][] T() {
        return this.f10180f;
    }

    @Override // U6.C1452h
    public String a() {
        return V().a();
    }

    @Override // U6.C1452h
    public C1452h e(String algorithm) {
        AbstractC3292y.i(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = T().length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = S()[length + i8];
            int i11 = S()[i8];
            messageDigest.update(T()[i8], i10, i11 - i9);
            i8++;
            i9 = i11;
        }
        byte[] digestBytes = messageDigest.digest();
        AbstractC3292y.h(digestBytes, "digestBytes");
        return new C1452h(digestBytes);
    }

    @Override // U6.C1452h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1452h) {
            C1452h c1452h = (C1452h) obj;
            if (c1452h.J() == J() && D(0, c1452h, 0, J())) {
                return true;
            }
        }
        return false;
    }

    @Override // U6.C1452h
    public int hashCode() {
        int j8 = j();
        if (j8 == 0) {
            int length = T().length;
            int i8 = 0;
            int i9 = 1;
            int i10 = 0;
            while (i8 < length) {
                int i11 = S()[length + i8];
                int i12 = S()[i8];
                byte[] bArr = T()[i8];
                int i13 = (i12 - i10) + i11;
                while (i11 < i13) {
                    i9 = (i9 * 31) + bArr[i11];
                    i11++;
                }
                i8++;
                i10 = i12;
            }
            F(i9);
            return i9;
        }
        return j8;
    }

    @Override // U6.C1452h
    public int k() {
        return S()[T().length - 1];
    }

    @Override // U6.C1452h
    public String n() {
        return V().n();
    }

    @Override // U6.C1452h
    public int p(byte[] other, int i8) {
        AbstractC3292y.i(other, "other");
        return V().p(other, i8);
    }

    @Override // U6.C1452h
    public byte[] r() {
        return O();
    }

    @Override // U6.C1452h
    public byte t(int i8) {
        int i9;
        AbstractC1446b.b(S()[T().length - 1], i8, 1L);
        int b9 = V6.e.b(this, i8);
        if (b9 == 0) {
            i9 = 0;
        } else {
            i9 = S()[b9 - 1];
        }
        return T()[b9][(i8 - i9) + S()[T().length + b9]];
    }

    @Override // U6.C1452h
    public String toString() {
        return V().toString();
    }

    @Override // U6.C1452h
    public int v(byte[] other, int i8) {
        AbstractC3292y.i(other, "other");
        return V().v(other, i8);
    }
}
