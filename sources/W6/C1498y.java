package W6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: W6.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1498y {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f10888a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10889b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[][] f10890c;

    public C1498y(InputStream inputStream) {
        this(inputStream, E0.c(inputStream));
    }

    private void e(boolean z8) {
        InputStream inputStream = this.f10888a;
        if (inputStream instanceof z0) {
            ((z0) inputStream).h(z8);
        }
    }

    InterfaceC1476d a(int i8) {
        if (i8 != 4) {
            if (i8 != 8) {
                if (i8 != 16) {
                    if (i8 == 17) {
                        return new L(this);
                    }
                    throw new C1481g("unknown BER object encountered: 0x" + Integer.toHexString(i8));
                }
                return new J(this);
            }
            return new T(this);
        }
        return new F(this);
    }

    public InterfaceC1476d b() {
        boolean z8;
        int read = this.f10888a.read();
        if (read == -1) {
            return null;
        }
        boolean z9 = false;
        e(false);
        int q8 = C1484j.q(this.f10888a, read);
        if ((read & 32) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        InputStream inputStream = this.f10888a;
        int i8 = this.f10889b;
        if (q8 == 4 || q8 == 16 || q8 == 17 || q8 == 8) {
            z9 = true;
        }
        int k8 = C1484j.k(inputStream, i8, z9);
        if (k8 < 0) {
            if (z8) {
                C1498y c1498y = new C1498y(new z0(this.f10888a, this.f10889b), this.f10889b);
                if ((read & PsExtractor.AUDIO_STREAM) == 192) {
                    return new H(q8, c1498y);
                }
                if ((read & 64) != 0) {
                    return new C(q8, c1498y);
                }
                if ((read & 128) != 0) {
                    return new N(true, q8, c1498y);
                }
                return c1498y.a(q8);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        x0 x0Var = new x0(this.f10888a, k8, this.f10889b);
        if ((read & PsExtractor.AUDIO_STREAM) == 192) {
            return new r0(z8, q8, x0Var.i());
        }
        if ((read & 64) != 0) {
            return new m0(z8, q8, x0Var.i());
        }
        if ((read & 128) != 0) {
            return new N(z8, q8, new C1498y(x0Var));
        }
        if (z8) {
            if (q8 != 4) {
                if (q8 != 8) {
                    if (q8 != 16) {
                        if (q8 == 17) {
                            return new v0(new C1498y(x0Var));
                        }
                        throw new IOException("unknown tag " + q8 + " encountered");
                    }
                    return new t0(new C1498y(x0Var));
                }
                return new T(new C1498y(x0Var));
            }
            return new F(new C1498y(x0Var));
        }
        if (q8 != 4) {
            try {
                return C1484j.b(q8, x0Var, this.f10890c);
            } catch (IllegalArgumentException e8) {
                throw new C1481g("corrupted stream detected", e8);
            }
        }
        return new C1473b0(x0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1492s c(boolean z8, int i8) {
        if (!z8) {
            return new w0(false, i8, new C1471a0(((x0) this.f10888a).i()));
        }
        C1478e d8 = d();
        if (this.f10888a instanceof z0) {
            if (d8.f() == 1) {
                return new M(true, i8, d8.d(0));
            }
            return new M(false, i8, D.a(d8));
        }
        if (d8.f() == 1) {
            return new w0(true, i8, d8.d(0));
        }
        return new w0(false, i8, p0.a(d8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1478e d() {
        AbstractC1492s d8;
        InterfaceC1476d b9 = b();
        if (b9 == null) {
            return new C1478e(0);
        }
        C1478e c1478e = new C1478e();
        do {
            if (b9 instanceof y0) {
                d8 = ((y0) b9).e();
            } else {
                d8 = b9.d();
            }
            c1478e.a(d8);
            b9 = b();
        } while (b9 != null);
        return c1478e;
    }

    public C1498y(InputStream inputStream, int i8) {
        this.f10888a = inputStream;
        this.f10889b = i8;
        this.f10890c = new byte[11];
    }
}
