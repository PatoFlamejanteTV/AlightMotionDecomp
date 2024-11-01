package p7;

import W6.AbstractC1487m;
import W6.AbstractC1489o;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1471a0;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;
import W6.C1488n;
import W6.InterfaceC1476d;
import v7.AbstractC4137a;

/* loaded from: classes5.dex */
public class g extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private C1485k f36515a;

    /* renamed from: b, reason: collision with root package name */
    private C1488n f36516b;

    /* renamed from: c, reason: collision with root package name */
    private C1485k f36517c;

    /* renamed from: d, reason: collision with root package name */
    private byte[][] f36518d;

    /* renamed from: e, reason: collision with root package name */
    private byte[][] f36519e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f36520f;

    public g(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f36515a = new C1485k(0L);
        this.f36517c = new C1485k(i8);
        this.f36518d = AbstractC4137a.c(sArr);
        this.f36519e = AbstractC4137a.c(sArr2);
        this.f36520f = AbstractC4137a.a(sArr3);
    }

    public static g q(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        InterfaceC1476d interfaceC1476d = this.f36515a;
        if (interfaceC1476d == null) {
            interfaceC1476d = this.f36516b;
        }
        c1478e.a(interfaceC1476d);
        c1478e.a(this.f36517c);
        C1478e c1478e2 = new C1478e();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            byte[][] bArr = this.f36518d;
            if (i9 >= bArr.length) {
                break;
            }
            c1478e2.a(new C1471a0(bArr[i9]));
            i9++;
        }
        c1478e.a(new C1479e0(c1478e2));
        C1478e c1478e3 = new C1478e();
        while (true) {
            byte[][] bArr2 = this.f36519e;
            if (i8 < bArr2.length) {
                c1478e3.a(new C1471a0(bArr2[i8]));
                i8++;
            } else {
                c1478e.a(new C1479e0(c1478e3));
                C1478e c1478e4 = new C1478e();
                c1478e4.a(new C1471a0(this.f36520f));
                c1478e.a(new C1479e0(c1478e4));
                return new C1479e0(c1478e);
            }
        }
    }

    public short[][] l() {
        return AbstractC4137a.d(this.f36518d);
    }

    public short[] m() {
        return AbstractC4137a.b(this.f36520f);
    }

    public short[][] n() {
        return AbstractC4137a.d(this.f36519e);
    }

    public int o() {
        return this.f36517c.B();
    }

    private g(AbstractC1494u abstractC1494u) {
        if (abstractC1494u.v(0) instanceof C1485k) {
            this.f36515a = C1485k.v(abstractC1494u.v(0));
        } else {
            this.f36516b = C1488n.B(abstractC1494u.v(0));
        }
        this.f36517c = C1485k.v(abstractC1494u.v(1));
        AbstractC1494u u8 = AbstractC1494u.u(abstractC1494u.v(2));
        this.f36518d = new byte[u8.size()];
        for (int i8 = 0; i8 < u8.size(); i8++) {
            this.f36518d[i8] = AbstractC1489o.v(u8.v(i8)).y();
        }
        AbstractC1494u abstractC1494u2 = (AbstractC1494u) abstractC1494u.v(3);
        this.f36519e = new byte[abstractC1494u2.size()];
        for (int i9 = 0; i9 < abstractC1494u2.size(); i9++) {
            this.f36519e[i9] = AbstractC1489o.v(abstractC1494u2.v(i9)).y();
        }
        this.f36520f = AbstractC1489o.v(((AbstractC1494u) abstractC1494u.v(4)).v(0)).y();
    }
}
