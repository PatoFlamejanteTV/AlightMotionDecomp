package H;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    protected Boolean f3165a;

    /* renamed from: b, reason: collision with root package name */
    protected String f3166b;

    public f() {
        this.f3165a = Boolean.FALSE;
    }

    public final f a(String str) {
        this.f3166b = str;
        return this;
    }

    public f(g gVar) {
        boolean z8;
        String str;
        this.f3165a = Boolean.FALSE;
        g.b(gVar);
        z8 = gVar.f3169b;
        this.f3165a = Boolean.valueOf(z8);
        str = gVar.f3170c;
        this.f3166b = str;
    }
}
