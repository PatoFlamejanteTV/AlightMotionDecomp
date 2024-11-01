package C1;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final n f701a;

    private a(n nVar) {
        this.f701a = nVar;
    }

    public static a a(b bVar) {
        n nVar = (n) bVar;
        I1.g.d(bVar, "AdSession is null");
        I1.g.l(nVar);
        I1.g.g(nVar);
        a aVar = new a(nVar);
        nVar.w().c(aVar);
        return aVar;
    }

    public void b() {
        I1.g.g(this.f701a);
        I1.g.j(this.f701a);
        if (!this.f701a.t()) {
            try {
                this.f701a.g();
            } catch (Exception unused) {
            }
        }
        if (this.f701a.t()) {
            this.f701a.A();
        }
    }

    public void c(D1.d dVar) {
        I1.g.d(dVar, "VastProperties is null");
        I1.g.c(this.f701a);
        I1.g.j(this.f701a);
        this.f701a.l(dVar.a());
    }
}
