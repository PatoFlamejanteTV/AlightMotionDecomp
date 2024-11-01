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
import u7.C4104a;
import v7.AbstractC4137a;

/* loaded from: classes5.dex */
public class f extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private C1485k f36507a;

    /* renamed from: b, reason: collision with root package name */
    private C1488n f36508b;

    /* renamed from: c, reason: collision with root package name */
    private byte[][] f36509c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f36510d;

    /* renamed from: e, reason: collision with root package name */
    private byte[][] f36511e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f36512f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f36513g;

    /* renamed from: h, reason: collision with root package name */
    private C4104a[] f36514h;

    private f(AbstractC1494u abstractC1494u) {
        int i8 = 0;
        if (abstractC1494u.v(0) instanceof C1485k) {
            this.f36507a = C1485k.v(abstractC1494u.v(0));
        } else {
            this.f36508b = C1488n.B(abstractC1494u.v(0));
        }
        AbstractC1494u abstractC1494u2 = (AbstractC1494u) abstractC1494u.v(1);
        this.f36509c = new byte[abstractC1494u2.size()];
        for (int i9 = 0; i9 < abstractC1494u2.size(); i9++) {
            this.f36509c[i9] = ((AbstractC1489o) abstractC1494u2.v(i9)).y();
        }
        this.f36510d = ((AbstractC1489o) ((AbstractC1494u) abstractC1494u.v(2)).v(0)).y();
        AbstractC1494u abstractC1494u3 = (AbstractC1494u) abstractC1494u.v(3);
        this.f36511e = new byte[abstractC1494u3.size()];
        for (int i10 = 0; i10 < abstractC1494u3.size(); i10++) {
            this.f36511e[i10] = ((AbstractC1489o) abstractC1494u3.v(i10)).y();
        }
        this.f36512f = ((AbstractC1489o) ((AbstractC1494u) abstractC1494u.v(4)).v(0)).y();
        this.f36513g = ((AbstractC1489o) ((AbstractC1494u) abstractC1494u.v(5)).v(0)).y();
        AbstractC1494u abstractC1494u4 = (AbstractC1494u) abstractC1494u.v(6);
        byte[][][][] bArr = new byte[abstractC1494u4.size()][][];
        byte[][][][] bArr2 = new byte[abstractC1494u4.size()][][];
        byte[][][] bArr3 = new byte[abstractC1494u4.size()][];
        byte[][] bArr4 = new byte[abstractC1494u4.size()];
        int i11 = 0;
        while (i11 < abstractC1494u4.size()) {
            AbstractC1494u abstractC1494u5 = (AbstractC1494u) abstractC1494u4.v(i11);
            AbstractC1494u abstractC1494u6 = (AbstractC1494u) abstractC1494u5.v(i8);
            bArr[i11] = new byte[abstractC1494u6.size()][];
            for (int i12 = 0; i12 < abstractC1494u6.size(); i12++) {
                AbstractC1494u abstractC1494u7 = (AbstractC1494u) abstractC1494u6.v(i12);
                bArr[i11][i12] = new byte[abstractC1494u7.size()];
                for (int i13 = 0; i13 < abstractC1494u7.size(); i13++) {
                    bArr[i11][i12][i13] = ((AbstractC1489o) abstractC1494u7.v(i13)).y();
                }
            }
            AbstractC1494u abstractC1494u8 = (AbstractC1494u) abstractC1494u5.v(1);
            bArr2[i11] = new byte[abstractC1494u8.size()][];
            for (int i14 = 0; i14 < abstractC1494u8.size(); i14++) {
                AbstractC1494u abstractC1494u9 = (AbstractC1494u) abstractC1494u8.v(i14);
                bArr2[i11][i14] = new byte[abstractC1494u9.size()];
                for (int i15 = 0; i15 < abstractC1494u9.size(); i15++) {
                    bArr2[i11][i14][i15] = ((AbstractC1489o) abstractC1494u9.v(i15)).y();
                }
            }
            AbstractC1494u abstractC1494u10 = (AbstractC1494u) abstractC1494u5.v(2);
            bArr3[i11] = new byte[abstractC1494u10.size()];
            for (int i16 = 0; i16 < abstractC1494u10.size(); i16++) {
                bArr3[i11][i16] = ((AbstractC1489o) abstractC1494u10.v(i16)).y();
            }
            bArr4[i11] = ((AbstractC1489o) abstractC1494u5.v(3)).y();
            i11++;
            i8 = 0;
        }
        int length = this.f36513g.length - 1;
        this.f36514h = new C4104a[length];
        int i17 = 0;
        while (i17 < length) {
            byte[] bArr5 = this.f36513g;
            int i18 = i17 + 1;
            this.f36514h[i17] = new C4104a(bArr5[i17], bArr5[i18], AbstractC4137a.f(bArr[i17]), AbstractC4137a.f(bArr2[i17]), AbstractC4137a.d(bArr3[i17]), AbstractC4137a.b(bArr4[i17]));
            i17 = i18;
        }
    }

    public static f n(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        InterfaceC1476d interfaceC1476d = this.f36507a;
        if (interfaceC1476d == null) {
            interfaceC1476d = this.f36508b;
        }
        c1478e.a(interfaceC1476d);
        C1478e c1478e2 = new C1478e();
        int i8 = 0;
        while (true) {
            byte[][] bArr = this.f36509c;
            if (i8 >= bArr.length) {
                break;
            }
            c1478e2.a(new C1471a0(bArr[i8]));
            i8++;
        }
        c1478e.a(new C1479e0(c1478e2));
        C1478e c1478e3 = new C1478e();
        c1478e3.a(new C1471a0(this.f36510d));
        c1478e.a(new C1479e0(c1478e3));
        C1478e c1478e4 = new C1478e();
        int i9 = 0;
        while (true) {
            byte[][] bArr2 = this.f36511e;
            if (i9 >= bArr2.length) {
                break;
            }
            c1478e4.a(new C1471a0(bArr2[i9]));
            i9++;
        }
        c1478e.a(new C1479e0(c1478e4));
        C1478e c1478e5 = new C1478e();
        c1478e5.a(new C1471a0(this.f36512f));
        c1478e.a(new C1479e0(c1478e5));
        C1478e c1478e6 = new C1478e();
        c1478e6.a(new C1471a0(this.f36513g));
        c1478e.a(new C1479e0(c1478e6));
        C1478e c1478e7 = new C1478e();
        for (int i10 = 0; i10 < this.f36514h.length; i10++) {
            C1478e c1478e8 = new C1478e();
            byte[][][] e8 = AbstractC4137a.e(this.f36514h[i10].a());
            C1478e c1478e9 = new C1478e();
            for (byte[][] bArr3 : e8) {
                C1478e c1478e10 = new C1478e();
                int i11 = 0;
                while (true) {
                    if (i11 < bArr3.length) {
                        c1478e10.a(new C1471a0(bArr3[i11]));
                        i11++;
                    }
                }
                c1478e9.a(new C1479e0(c1478e10));
            }
            c1478e8.a(new C1479e0(c1478e9));
            byte[][][] e9 = AbstractC4137a.e(this.f36514h[i10].b());
            C1478e c1478e11 = new C1478e();
            for (byte[][] bArr4 : e9) {
                C1478e c1478e12 = new C1478e();
                int i12 = 0;
                while (true) {
                    if (i12 < bArr4.length) {
                        c1478e12.a(new C1471a0(bArr4[i12]));
                        i12++;
                    }
                }
                c1478e11.a(new C1479e0(c1478e12));
            }
            c1478e8.a(new C1479e0(c1478e11));
            byte[][] c8 = AbstractC4137a.c(this.f36514h[i10].d());
            C1478e c1478e13 = new C1478e();
            for (byte[] bArr5 : c8) {
                c1478e13.a(new C1471a0(bArr5));
            }
            c1478e8.a(new C1479e0(c1478e13));
            c1478e8.a(new C1471a0(AbstractC4137a.a(this.f36514h[i10].c())));
            c1478e7.a(new C1479e0(c1478e8));
        }
        c1478e.a(new C1479e0(c1478e7));
        return new C1479e0(c1478e);
    }

    public short[] l() {
        return AbstractC4137a.b(this.f36510d);
    }

    public short[] m() {
        return AbstractC4137a.b(this.f36512f);
    }

    public short[][] o() {
        return AbstractC4137a.d(this.f36509c);
    }

    public short[][] q() {
        return AbstractC4137a.d(this.f36511e);
    }

    public C4104a[] r() {
        return this.f36514h;
    }

    public int[] s() {
        return AbstractC4137a.g(this.f36513g);
    }

    public f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C4104a[] c4104aArr) {
        this.f36507a = new C1485k(1L);
        this.f36509c = AbstractC4137a.c(sArr);
        this.f36510d = AbstractC4137a.a(sArr2);
        this.f36511e = AbstractC4137a.c(sArr3);
        this.f36512f = AbstractC4137a.a(sArr4);
        this.f36513g = AbstractC4137a.h(iArr);
        this.f36514h = c4104aArr;
    }
}
