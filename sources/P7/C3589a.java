package p7;

import W6.AbstractC1487m;
import W6.AbstractC1489o;
import W6.AbstractC1492s;
import W6.AbstractC1494u;
import W6.C1471a0;
import W6.C1478e;
import W6.C1479e0;
import W6.C1485k;
import c7.C2081a;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3589a extends AbstractC1487m {

    /* renamed from: a, reason: collision with root package name */
    private int f36436a;

    /* renamed from: b, reason: collision with root package name */
    private int f36437b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f36438c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f36439d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f36440e;

    /* renamed from: f, reason: collision with root package name */
    private C2081a f36441f;

    public C3589a(int i8, int i9, I7.b bVar, I7.i iVar, I7.h hVar, C2081a c2081a) {
        this.f36436a = i8;
        this.f36437b = i9;
        this.f36438c = bVar.e();
        this.f36439d = iVar.h();
        this.f36440e = hVar.a();
        this.f36441f = c2081a;
    }

    public static C3589a o(Object obj) {
        if (obj instanceof C3589a) {
            return (C3589a) obj;
        }
        if (obj != null) {
            return new C3589a(AbstractC1494u.u(obj));
        }
        return null;
    }

    @Override // W6.AbstractC1487m, W6.InterfaceC1476d
    public AbstractC1492s d() {
        C1478e c1478e = new C1478e();
        c1478e.a(new C1485k(this.f36436a));
        c1478e.a(new C1485k(this.f36437b));
        c1478e.a(new C1471a0(this.f36438c));
        c1478e.a(new C1471a0(this.f36439d));
        c1478e.a(new C1471a0(this.f36440e));
        c1478e.a(this.f36441f);
        return new C1479e0(c1478e);
    }

    public C2081a l() {
        return this.f36441f;
    }

    public I7.b m() {
        return new I7.b(this.f36438c);
    }

    public I7.i n() {
        return new I7.i(m(), this.f36439d);
    }

    public int q() {
        return this.f36437b;
    }

    public int r() {
        return this.f36436a;
    }

    public I7.h s() {
        return new I7.h(this.f36440e);
    }

    private C3589a(AbstractC1494u abstractC1494u) {
        this.f36436a = ((C1485k) abstractC1494u.v(0)).B();
        this.f36437b = ((C1485k) abstractC1494u.v(1)).B();
        this.f36438c = ((AbstractC1489o) abstractC1494u.v(2)).y();
        this.f36439d = ((AbstractC1489o) abstractC1494u.v(3)).y();
        this.f36440e = ((AbstractC1489o) abstractC1494u.v(4)).y();
        this.f36441f = C2081a.m(abstractC1494u.v(5));
    }
}
