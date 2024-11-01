package J0;

import n1.InterfaceC3389b;

/* renamed from: J0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1257n implements InterfaceC3389b {

    /* renamed from: a, reason: collision with root package name */
    private final D f3930a;

    /* renamed from: b, reason: collision with root package name */
    private final C1256m f3931b;

    public C1257n(D d8, P0.g gVar) {
        this.f3930a = d8;
        this.f3931b = new C1256m(gVar);
    }

    @Override // n1.InterfaceC3389b
    public boolean a() {
        return this.f3930a.d();
    }

    @Override // n1.InterfaceC3389b
    public InterfaceC3389b.a b() {
        return InterfaceC3389b.a.CRASHLYTICS;
    }

    @Override // n1.InterfaceC3389b
    public void c(InterfaceC3389b.C0806b c0806b) {
        G0.g.f().b("App Quality Sessions session changed: " + c0806b);
        this.f3931b.h(c0806b.a());
    }

    public String d(String str) {
        return this.f3931b.c(str);
    }

    public void e(String str) {
        this.f3931b.i(str);
    }
}
