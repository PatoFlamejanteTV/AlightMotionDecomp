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
public class m extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private final int f36540a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36541b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f36542c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f36543d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f36544e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f36545f;

    /* renamed from: g, reason: collision with root package name */
    private final int f36546g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f36547h;

    public m(int i8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f36540a = 0;
        this.f36541b = i8;
        this.f36542c = J7.a.d(bArr);
        this.f36543d = J7.a.d(bArr2);
        this.f36544e = J7.a.d(bArr3);
        this.f36545f = J7.a.d(bArr4);
        this.f36547h = J7.a.d(bArr5);
        this.f36546g = -1;
    }

    public static m n(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1485k c1485k;
        C1478e c1478e = new C1478e();
        if (this.f36546g >= 0) {
            c1485k = new C1485k(1L);
        } else {
            c1485k = new C1485k(0L);
        }
        c1478e.a(c1485k);
        C1478e c1478e2 = new C1478e();
        c1478e2.a(new C1485k(this.f36541b));
        c1478e2.a(new C1471a0(this.f36542c));
        c1478e2.a(new C1471a0(this.f36543d));
        c1478e2.a(new C1471a0(this.f36544e));
        c1478e2.a(new C1471a0(this.f36545f));
        int i8 = this.f36546g;
        if (i8 >= 0) {
            c1478e2.a(new h0(false, 0, new C1485k(i8)));
        }
        c1478e.a(new C1479e0(c1478e2));
        c1478e.a(new h0(true, 0, new C1471a0(this.f36547h)));
        return new C1479e0(c1478e);
    }

    public byte[] l() {
        return J7.a.d(this.f36547h);
    }

    public int m() {
        return this.f36541b;
    }

    public int o() {
        return this.f36546g;
    }

    public byte[] q() {
        return J7.a.d(this.f36544e);
    }

    public byte[] r() {
        return J7.a.d(this.f36545f);
    }

    public byte[] s() {
        return J7.a.d(this.f36543d);
    }

    public byte[] t() {
        return J7.a.d(this.f36542c);
    }

    public int u() {
        return this.f36540a;
    }

    public m(int i8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i9) {
        this.f36540a = 1;
        this.f36541b = i8;
        this.f36542c = J7.a.d(bArr);
        this.f36543d = J7.a.d(bArr2);
        this.f36544e = J7.a.d(bArr3);
        this.f36545f = J7.a.d(bArr4);
        this.f36547h = J7.a.d(bArr5);
        this.f36546g = i9;
    }

    private m(AbstractC1494u abstractC1494u) {
        int i8;
        C1485k v8 = C1485k.v(abstractC1494u.v(0));
        if (!v8.z(0) && !v8.z(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f36540a = v8.B();
        if (abstractC1494u.size() != 2 && abstractC1494u.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC1494u u8 = AbstractC1494u.u(abstractC1494u.v(1));
        this.f36541b = C1485k.v(u8.v(0)).B();
        this.f36542c = J7.a.d(AbstractC1489o.v(u8.v(1)).y());
        this.f36543d = J7.a.d(AbstractC1489o.v(u8.v(2)).y());
        this.f36544e = J7.a.d(AbstractC1489o.v(u8.v(3)).y());
        this.f36545f = J7.a.d(AbstractC1489o.v(u8.v(4)).y());
        if (u8.size() == 6) {
            AbstractC1499z u9 = AbstractC1499z.u(u8.v(5));
            if (u9.y() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            i8 = C1485k.u(u9, false).B();
        } else {
            if (u8.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            i8 = -1;
        }
        this.f36546g = i8;
        if (abstractC1494u.size() == 3) {
            this.f36547h = J7.a.d(AbstractC1489o.u(AbstractC1499z.u(abstractC1494u.v(2)), true).y());
        } else {
            this.f36547h = null;
        }
    }
}
