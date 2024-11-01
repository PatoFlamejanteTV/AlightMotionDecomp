package L0;

/* loaded from: classes3.dex */
public final class a implements W0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final W0.a f5221a = new a();

    /* renamed from: L0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0087a implements V0.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0087a f5222a = new C0087a();

        /* renamed from: b, reason: collision with root package name */
        private static final V0.c f5223b = V0.c.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final V0.c f5224c = V0.c.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final V0.c f5225d = V0.c.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final V0.c f5226e = V0.c.d("variantId");

        /* renamed from: f, reason: collision with root package name */
        private static final V0.c f5227f = V0.c.d("templateVersion");

        private C0087a() {
        }

        @Override // V0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(i iVar, V0.e eVar) {
            eVar.a(f5223b, iVar.e());
            eVar.a(f5224c, iVar.c());
            eVar.a(f5225d, iVar.d());
            eVar.a(f5226e, iVar.g());
            eVar.d(f5227f, iVar.f());
        }
    }

    private a() {
    }

    @Override // W0.a
    public void a(W0.b bVar) {
        C0087a c0087a = C0087a.f5222a;
        bVar.a(i.class, c0087a);
        bVar.a(b.class, c0087a);
    }
}
