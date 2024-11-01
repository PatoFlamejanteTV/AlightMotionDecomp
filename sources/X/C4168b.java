package x;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4168b {

    /* renamed from: b, reason: collision with root package name */
    private static final C4168b f40793b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final C4171e f40794a;

    /* renamed from: x.b$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C4171e f40795a = null;

        a() {
        }

        public C4168b a() {
            return new C4168b(this.f40795a);
        }

        public a b(C4171e c4171e) {
            this.f40795a = c4171e;
            return this;
        }
    }

    C4168b(C4171e c4171e) {
        this.f40794a = c4171e;
    }

    public static a b() {
        return new a();
    }

    public C4171e a() {
        return this.f40794a;
    }
}
