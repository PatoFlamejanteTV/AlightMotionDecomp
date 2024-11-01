package z5;

/* loaded from: classes5.dex */
public abstract class j {

    /* loaded from: classes5.dex */
    class a implements i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N5.a f41561a;

        a(N5.a aVar) {
            this.f41561a = aVar;
        }

        @Override // N5.a
        public Object get() {
            return this.f41561a.get();
        }
    }

    public static i a(N5.a aVar) {
        h.b(aVar);
        return new a(aVar);
    }
}
