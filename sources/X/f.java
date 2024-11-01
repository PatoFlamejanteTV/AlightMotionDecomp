package x;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f40820c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f40821a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40822b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f40823a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f40824b = 0;

        a() {
        }

        public f a() {
            return new f(this.f40823a, this.f40824b);
        }

        public a b(long j8) {
            this.f40824b = j8;
            return this;
        }

        public a c(long j8) {
            this.f40823a = j8;
            return this;
        }
    }

    f(long j8, long j9) {
        this.f40821a = j8;
        this.f40822b = j9;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f40822b;
    }

    public long b() {
        return this.f40821a;
    }
}
