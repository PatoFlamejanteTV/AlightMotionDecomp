package O1;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final m f6989a;

    /* renamed from: b, reason: collision with root package name */
    private final d2.c f6990b;

    /* renamed from: c, reason: collision with root package name */
    private final d2.c f6991c;

    /* renamed from: d, reason: collision with root package name */
    private final d2.c f6992d;

    /* renamed from: e, reason: collision with root package name */
    private final d2.c f6993e;

    public j(m mVar, d2.c cVar, d2.c cVar2, d2.c cVar3, d2.c cVar4) {
        this.f6989a = mVar;
        this.f6990b = cVar;
        this.f6991c = cVar2;
        if (cVar3 != null) {
            this.f6992d = cVar3;
            this.f6993e = cVar4;
            return;
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    public d2.c a() {
        return this.f6993e;
    }

    public d2.c b() {
        return this.f6992d;
    }

    public d2.c c() {
        return this.f6990b;
    }

    public m d() {
        return this.f6989a;
    }

    public d2.c e() {
        return this.f6991c;
    }
}
