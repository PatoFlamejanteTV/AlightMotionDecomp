package b7;

import W6.AbstractC1472b;
import W6.AbstractC1487m;
import W6.AbstractC1489o;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.AbstractC1496w;
import W6.AbstractC1499z;
import W6.C1471a0;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;
import W6.InterfaceC1476d;
import W6.Q;
import W6.h0;
import c7.C2081a;
import java.util.Enumeration;

/* renamed from: b7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1992b extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private C1485k f15079a;

    /* renamed from: b, reason: collision with root package name */
    private C2081a f15080b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC1489o f15081c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC1496w f15082d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC1472b f15083e;

    private C1992b(AbstractC1494u abstractC1494u) {
        Enumeration y8 = abstractC1494u.y();
        C1485k v8 = C1485k.v(y8.nextElement());
        this.f15079a = v8;
        int q8 = q(v8);
        this.f15080b = C2081a.m(y8.nextElement());
        this.f15081c = AbstractC1489o.v(y8.nextElement());
        int i8 = -1;
        while (y8.hasMoreElements()) {
            AbstractC1499z abstractC1499z = (AbstractC1499z) y8.nextElement();
            int y9 = abstractC1499z.y();
            if (y9 <= i8) {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
            if (y9 == 0) {
                this.f15082d = AbstractC1496w.v(abstractC1499z, false);
            } else {
                if (y9 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                }
                if (q8 < 1) {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                this.f15083e = Q.B(abstractC1499z, false);
            }
            i8 = y9;
        }
    }

    public static C1992b m(Object obj) {
        if (obj instanceof C1992b) {
            return (C1992b) obj;
        }
        if (obj != null) {
            return new C1992b(AbstractC1494u.u(obj));
        }
        return null;
    }

    private static int q(C1485k c1485k) {
        int B8 = c1485k.B();
        if (B8 >= 0 && B8 <= 1) {
            return B8;
        }
        throw new IllegalArgumentException("invalid version for private key info");
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e(5);
        c1478e.a(this.f15079a);
        c1478e.a(this.f15080b);
        c1478e.a(this.f15081c);
        AbstractC1496w abstractC1496w = this.f15082d;
        if (abstractC1496w != null) {
            c1478e.a(new h0(false, 0, abstractC1496w));
        }
        AbstractC1472b abstractC1472b = this.f15083e;
        if (abstractC1472b != null) {
            c1478e.a(new h0(false, 1, abstractC1472b));
        }
        return new C1479e0(c1478e);
    }

    public AbstractC1496w l() {
        return this.f15082d;
    }

    public C2081a n() {
        return this.f15080b;
    }

    public AbstractC1472b o() {
        return this.f15083e;
    }

    public InterfaceC1476d r() {
        return AbstractC1492s.q(this.f15081c.y());
    }

    public C1992b(C2081a c2081a, InterfaceC1476d interfaceC1476d) {
        this(c2081a, interfaceC1476d, null, null);
    }

    public C1992b(C2081a c2081a, InterfaceC1476d interfaceC1476d, AbstractC1496w abstractC1496w) {
        this(c2081a, interfaceC1476d, abstractC1496w, null);
    }

    public C1992b(C2081a c2081a, InterfaceC1476d interfaceC1476d, AbstractC1496w abstractC1496w, byte[] bArr) {
        this.f15079a = new C1485k(bArr != null ? J7.b.f4512b : J7.b.f4511a);
        this.f15080b = c2081a;
        this.f15081c = new C1471a0(interfaceC1476d);
        this.f15082d = abstractC1496w;
        this.f15083e = bArr == null ? null : new Q(bArr);
    }
}
