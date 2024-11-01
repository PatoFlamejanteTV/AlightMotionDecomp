package p7;

import W6.AbstractC1487m;
import W6.AbstractC1489o;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.AbstractC1499z;
import W6.C1471a0;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;
import W6.h0;

/* loaded from: classes5.dex */
public class k extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private final int f36530a;

    /* renamed from: b, reason: collision with root package name */
    private final long f36531b;

    /* renamed from: c, reason: collision with root package name */
    private final long f36532c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f36533d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f36534e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f36535f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f36536g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f36537h;

    public k(long j8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f36530a = 0;
        this.f36531b = j8;
        this.f36533d = J7.a.d(bArr);
        this.f36534e = J7.a.d(bArr2);
        this.f36535f = J7.a.d(bArr3);
        this.f36536g = J7.a.d(bArr4);
        this.f36537h = J7.a.d(bArr5);
        this.f36532c = -1L;
    }

    public static k n(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1485k c1485k;
        C1478e c1478e = new C1478e();
        if (this.f36532c >= 0) {
            c1485k = new C1485k(1L);
        } else {
            c1485k = new C1485k(0L);
        }
        c1478e.a(c1485k);
        C1478e c1478e2 = new C1478e();
        c1478e2.a(new C1485k(this.f36531b));
        c1478e2.a(new C1471a0(this.f36533d));
        c1478e2.a(new C1471a0(this.f36534e));
        c1478e2.a(new C1471a0(this.f36535f));
        c1478e2.a(new C1471a0(this.f36536g));
        long j8 = this.f36532c;
        if (j8 >= 0) {
            c1478e2.a(new h0(false, 0, new C1485k(j8)));
        }
        c1478e.a(new C1479e0(c1478e2));
        c1478e.a(new h0(true, 0, new C1471a0(this.f36537h)));
        return new C1479e0(c1478e);
    }

    public byte[] l() {
        return J7.a.d(this.f36537h);
    }

    public long m() {
        return this.f36531b;
    }

    public long o() {
        return this.f36532c;
    }

    public byte[] q() {
        return J7.a.d(this.f36535f);
    }

    public byte[] r() {
        return J7.a.d(this.f36536g);
    }

    public byte[] s() {
        return J7.a.d(this.f36534e);
    }

    public byte[] t() {
        return J7.a.d(this.f36533d);
    }

    public int u() {
        return this.f36530a;
    }

    public k(long j8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j9) {
        this.f36530a = 1;
        this.f36531b = j8;
        this.f36533d = J7.a.d(bArr);
        this.f36534e = J7.a.d(bArr2);
        this.f36535f = J7.a.d(bArr3);
        this.f36536g = J7.a.d(bArr4);
        this.f36537h = J7.a.d(bArr5);
        this.f36532c = j9;
    }

    private k(AbstractC1494u abstractC1494u) {
        long j8;
        C1485k v8 = C1485k.v(abstractC1494u.v(0));
        if (!v8.z(0) && !v8.z(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f36530a = v8.B();
        if (abstractC1494u.size() != 2 && abstractC1494u.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC1494u u8 = AbstractC1494u.u(abstractC1494u.v(1));
        this.f36531b = C1485k.v(u8.v(0)).E();
        this.f36533d = J7.a.d(AbstractC1489o.v(u8.v(1)).y());
        this.f36534e = J7.a.d(AbstractC1489o.v(u8.v(2)).y());
        this.f36535f = J7.a.d(AbstractC1489o.v(u8.v(3)).y());
        this.f36536g = J7.a.d(AbstractC1489o.v(u8.v(4)).y());
        if (u8.size() == 6) {
            AbstractC1499z u9 = AbstractC1499z.u(u8.v(5));
            if (u9.y() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            j8 = C1485k.u(u9, false).E();
        } else {
            if (u8.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            j8 = -1;
        }
        this.f36532c = j8;
        if (abstractC1494u.size() == 3) {
            this.f36537h = J7.a.d(AbstractC1489o.u(AbstractC1499z.u(abstractC1494u.v(2)), true).y());
        } else {
            this.f36537h = null;
        }
    }
}
