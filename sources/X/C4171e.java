package x;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4171e {

    /* renamed from: c, reason: collision with root package name */
    private static final C4171e f40815c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f40816a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40817b;

    /* renamed from: x.e$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f40818a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f40819b = 0;

        a() {
        }

        public C4171e a() {
            return new C4171e(this.f40818a, this.f40819b);
        }

        public a b(long j8) {
            this.f40818a = j8;
            return this;
        }

        public a c(long j8) {
            this.f40819b = j8;
            return this;
        }
    }

    C4171e(long j8, long j9) {
        this.f40816a = j8;
        this.f40817b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f40816a;
    }

    public long b() {
        return this.f40817b;
    }
}
