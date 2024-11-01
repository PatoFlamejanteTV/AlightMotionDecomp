package p7;

import W6.AbstractC1487m;
import W6.AbstractC1489o;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1471a0;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;

/* renamed from: p7.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3591c extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private int f36446a;

    /* renamed from: b, reason: collision with root package name */
    private int f36447b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f36448c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f36449d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f36450e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f36451f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f36452g;

    public C3591c(int i8, int i9, I7.b bVar, I7.i iVar, I7.h hVar, I7.h hVar2, I7.a aVar) {
        this.f36446a = i8;
        this.f36447b = i9;
        this.f36448c = bVar.e();
        this.f36449d = iVar.h();
        this.f36450e = aVar.c();
        this.f36451f = hVar.a();
        this.f36452g = hVar2.a();
    }

    public static C3591c n(Object obj) {
        if (obj instanceof C3591c) {
            return (C3591c) obj;
        }
        if (obj != null) {
            return new C3591c(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        c1478e.a(new C1485k(this.f36446a));
        c1478e.a(new C1485k(this.f36447b));
        c1478e.a(new C1471a0(this.f36448c));
        c1478e.a(new C1471a0(this.f36449d));
        c1478e.a(new C1471a0(this.f36451f));
        c1478e.a(new C1471a0(this.f36452g));
        c1478e.a(new C1471a0(this.f36450e));
        return new C1479e0(c1478e);
    }

    public I7.b l() {
        return new I7.b(this.f36448c);
    }

    public I7.i m() {
        return new I7.i(l(), this.f36449d);
    }

    public int o() {
        return this.f36447b;
    }

    public int q() {
        return this.f36446a;
    }

    public I7.h r() {
        return new I7.h(this.f36451f);
    }

    public I7.h s() {
        return new I7.h(this.f36452g);
    }

    public I7.a t() {
        return new I7.a(this.f36450e);
    }

    private C3591c(AbstractC1494u abstractC1494u) {
        this.f36446a = ((C1485k) abstractC1494u.v(0)).B();
        this.f36447b = ((C1485k) abstractC1494u.v(1)).B();
        this.f36448c = ((AbstractC1489o) abstractC1494u.v(2)).y();
        this.f36449d = ((AbstractC1489o) abstractC1494u.v(3)).y();
        this.f36451f = ((AbstractC1489o) abstractC1494u.v(4)).y();
        this.f36452g = ((AbstractC1489o) abstractC1494u.v(5)).y();
        this.f36450e = ((AbstractC1489o) abstractC1494u.v(6)).y();
    }
}
