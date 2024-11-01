package x;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4169c {

    /* renamed from: c, reason: collision with root package name */
    private static final C4169c f40796c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f40797a;

    /* renamed from: b, reason: collision with root package name */
    private final b f40798b;

    /* renamed from: x.c$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f40799a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f40800b = b.REASON_UNKNOWN;

        a() {
        }

        public C4169c a() {
            return new C4169c(this.f40799a, this.f40800b);
        }

        public a b(long j8) {
            this.f40799a = j8;
            return this;
        }

        public a c(b bVar) {
            this.f40800b = bVar;
            return this;
        }
    }

    /* renamed from: x.c$b */
    /* loaded from: classes3.dex */
    public enum b implements Y0.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a, reason: collision with root package name */
        private final int f40809a;

        b(int i8) {
            this.f40809a = i8;
        }

        @Override // Y0.c
        public int getNumber() {
            return this.f40809a;
        }
    }

    C4169c(long j8, b bVar) {
        this.f40797a = j8;
        this.f40798b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f40797a;
    }

    public b b() {
        return this.f40798b;
    }
}
