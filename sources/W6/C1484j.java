package W6;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: W6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1484j extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final int f10852a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f10853b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[][] f10854c;

    public C1484j(InputStream inputStream) {
        this(inputStream, E0.c(inputStream));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1492s b(int i8, x0 x0Var, byte[][] bArr) {
        if (i8 != 10) {
            if (i8 != 12) {
                if (i8 != 30) {
                    switch (i8) {
                        case 1:
                            return C1474c.u(h(x0Var, bArr));
                        case 2:
                            return new C1485k(x0Var.i(), false);
                        case 3:
                            return AbstractC1472b.u(x0Var.g(), x0Var);
                        case 4:
                            return new C1471a0(x0Var.i());
                        case 5:
                            return Y.f10820a;
                        case 6:
                            return C1488n.y(h(x0Var, bArr));
                        default:
                            switch (i8) {
                                case 18:
                                    return new Z(x0Var.i());
                                case 19:
                                    return new C1477d0(x0Var.i());
                                case 20:
                                    return new g0(x0Var.i());
                                case 21:
                                    return new k0(x0Var.i());
                                case 22:
                                    return new X(x0Var.i());
                                case 23:
                                    return new A(x0Var.i());
                                case 24:
                                    return new C1483i(x0Var.i());
                                case 25:
                                    return new W(x0Var.i());
                                case 26:
                                    return new l0(x0Var.i());
                                case 27:
                                    return new U(x0Var.i());
                                case 28:
                                    return new j0(x0Var.i());
                                default:
                                    throw new IOException("unknown tag " + i8 + " encountered");
                            }
                    }
                }
                return new P(g(x0Var));
            }
            return new i0(x0Var.i());
        }
        return C1480f.u(h(x0Var, bArr));
    }

    private static char[] g(x0 x0Var) {
        int g8 = x0Var.g();
        if ((g8 & 1) == 0) {
            int i8 = g8 / 2;
            char[] cArr = new char[i8];
            byte[] bArr = new byte[8];
            int i9 = 0;
            int i10 = 0;
            while (g8 >= 8) {
                if (L7.a.d(x0Var, bArr, 0, 8) == 8) {
                    cArr[i10] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
                    cArr[i10 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
                    cArr[i10 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
                    cArr[i10 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
                    i10 += 4;
                    g8 -= 8;
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (g8 > 0) {
                if (L7.a.d(x0Var, bArr, 0, g8) != g8) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                do {
                    int i11 = i9 + 1;
                    int i12 = bArr[i9] << 8;
                    i9 += 2;
                    cArr[i10] = (char) ((bArr[i11] & 255) | i12);
                    i10++;
                } while (i9 < g8);
            }
            if (x0Var.g() == 0 && i8 == i10) {
                return cArr;
            }
            throw new IllegalStateException();
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    private static byte[] h(x0 x0Var, byte[][] bArr) {
        int g8 = x0Var.g();
        if (g8 >= bArr.length) {
            return x0Var.i();
        }
        byte[] bArr2 = bArr[g8];
        if (bArr2 == null) {
            bArr2 = new byte[g8];
            bArr[g8] = bArr2;
        }
        x0Var.h(bArr2);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(InputStream inputStream, int i8, boolean z8) {
        int read = inputStream.read();
        if (read >= 0) {
            if (read == 128) {
                return -1;
            }
            if (read > 127) {
                int i9 = read & ModuleDescriptor.MODULE_VERSION;
                if (i9 <= 4) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < i9; i11++) {
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            i10 = (i10 << 8) + read2;
                        } else {
                            throw new EOFException("EOF found reading length");
                        }
                    }
                    if (i10 >= 0) {
                        if (i10 >= i8 && !z8) {
                            throw new IOException("corrupted stream - out of bounds length found: " + i10 + " >= " + i8);
                        }
                        return i10;
                    }
                    throw new IOException("corrupted stream - negative length found");
                }
                throw new IOException("DER length more than 4 bytes: " + i9);
            }
            return read;
        }
        throw new EOFException("EOF found when length expected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(InputStream inputStream, int i8) {
        int i9 = i8 & 31;
        if (i9 == 31) {
            int read = inputStream.read();
            if ((read & ModuleDescriptor.MODULE_VERSION) != 0) {
                int i10 = 0;
                while (read >= 0 && (read & 128) != 0) {
                    i10 = ((read & ModuleDescriptor.MODULE_VERSION) | i10) << 7;
                    read = inputStream.read();
                }
                if (read >= 0) {
                    return i10 | (read & ModuleDescriptor.MODULE_VERSION);
                }
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        return i9;
    }

    protected AbstractC1492s a(int i8, int i9, int i10) {
        boolean z8;
        if ((i8 & 32) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        x0 x0Var = new x0(this, i10, this.f10852a);
        if ((i8 & PsExtractor.AUDIO_STREAM) == 192) {
            return new r0(z8, i9, x0Var.i());
        }
        if ((i8 & 64) != 0) {
            return new m0(z8, i9, x0Var.i());
        }
        if ((i8 & 128) != 0) {
            return new C1498y(x0Var).c(z8, i9);
        }
        if (z8) {
            if (i9 != 4) {
                if (i9 != 8) {
                    if (i9 != 16) {
                        if (i9 == 17) {
                            return p0.b(r(x0Var));
                        }
                        throw new IOException("unknown tag " + i9 + " encountered");
                    }
                    if (this.f10853b) {
                        return new B0(x0Var.i());
                    }
                    return p0.a(r(x0Var));
                }
                return new o0(r(x0Var));
            }
            C1478e r8 = r(x0Var);
            int f8 = r8.f();
            AbstractC1489o[] abstractC1489oArr = new AbstractC1489o[f8];
            for (int i11 = 0; i11 != f8; i11++) {
                InterfaceC1476d d8 = r8.d(i11);
                if (d8 instanceof AbstractC1489o) {
                    abstractC1489oArr[i11] = (AbstractC1489o) d8;
                } else {
                    throw new C1481g("unknown object encountered in constructed OCTET STRING: " + d8.getClass());
                }
            }
            return new E(abstractC1489oArr);
        }
        return b(i9, x0Var, this.f10854c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f10852a;
    }

    protected int j() {
        return k(this, this.f10852a, false);
    }

    public AbstractC1492s p() {
        boolean z8;
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int q8 = q(this, read);
        if ((read & 32) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int j8 = j();
        if (j8 < 0) {
            if (z8) {
                C1498y c1498y = new C1498y(new z0(this, this.f10852a), this.f10852a);
                if ((read & PsExtractor.AUDIO_STREAM) == 192) {
                    return new H(q8, c1498y).e();
                }
                if ((read & 64) != 0) {
                    return new C(q8, c1498y).e();
                }
                if ((read & 128) != 0) {
                    return new N(true, q8, c1498y).e();
                }
                if (q8 != 4) {
                    if (q8 != 8) {
                        if (q8 != 16) {
                            if (q8 == 17) {
                                return new L(c1498y).e();
                            }
                            throw new IOException("unknown BER object encountered");
                        }
                        return new J(c1498y).e();
                    }
                    return new T(c1498y).e();
                }
                return new F(c1498y).e();
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        try {
            return a(read, q8, j8);
        } catch (IllegalArgumentException e8) {
            throw new C1481g("corrupted stream detected", e8);
        }
    }

    C1478e r(x0 x0Var) {
        if (x0Var.g() < 1) {
            return new C1478e(0);
        }
        C1484j c1484j = new C1484j(x0Var);
        C1478e c1478e = new C1478e();
        while (true) {
            AbstractC1492s p8 = c1484j.p();
            if (p8 != null) {
                c1478e.a(p8);
            } else {
                return c1478e;
            }
        }
    }

    public C1484j(InputStream inputStream, int i8) {
        this(inputStream, i8, false);
    }

    public C1484j(InputStream inputStream, int i8, boolean z8) {
        super(inputStream);
        this.f10852a = i8;
        this.f10853b = z8;
        this.f10854c = new byte[11];
    }

    public C1484j(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public C1484j(byte[] bArr, boolean z8) {
        this(new ByteArrayInputStream(bArr), bArr.length, z8);
    }
}
