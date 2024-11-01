package i1;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2965a {

    /* renamed from: p, reason: collision with root package name */
    private static final C2965a f32676p = new C0759a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f32677a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32678b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32679c;

    /* renamed from: d, reason: collision with root package name */
    private final c f32680d;

    /* renamed from: e, reason: collision with root package name */
    private final d f32681e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32682f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32683g;

    /* renamed from: h, reason: collision with root package name */
    private final int f32684h;

    /* renamed from: i, reason: collision with root package name */
    private final int f32685i;

    /* renamed from: j, reason: collision with root package name */
    private final String f32686j;

    /* renamed from: k, reason: collision with root package name */
    private final long f32687k;

    /* renamed from: l, reason: collision with root package name */
    private final b f32688l;

    /* renamed from: m, reason: collision with root package name */
    private final String f32689m;

    /* renamed from: n, reason: collision with root package name */
    private final long f32690n;

    /* renamed from: o, reason: collision with root package name */
    private final String f32691o;

    /* renamed from: i1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0759a {

        /* renamed from: a, reason: collision with root package name */
        private long f32692a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f32693b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f32694c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f32695d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f32696e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f32697f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f32698g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f32699h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f32700i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f32701j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f32702k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f32703l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f32704m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f32705n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f32706o = "";

        C0759a() {
        }

        public C2965a a() {
            return new C2965a(this.f32692a, this.f32693b, this.f32694c, this.f32695d, this.f32696e, this.f32697f, this.f32698g, this.f32699h, this.f32700i, this.f32701j, this.f32702k, this.f32703l, this.f32704m, this.f32705n, this.f32706o);
        }

        public C0759a b(String str) {
            this.f32704m = str;
            return this;
        }

        public C0759a c(String str) {
            this.f32698g = str;
            return this;
        }

        public C0759a d(String str) {
            this.f32706o = str;
            return this;
        }

        public C0759a e(b bVar) {
            this.f32703l = bVar;
            return this;
        }

        public C0759a f(String str) {
            this.f32694c = str;
            return this;
        }

        public C0759a g(String str) {
            this.f32693b = str;
            return this;
        }

        public C0759a h(c cVar) {
            this.f32695d = cVar;
            return this;
        }

        public C0759a i(String str) {
            this.f32697f = str;
            return this;
        }

        public C0759a j(int i8) {
            this.f32699h = i8;
            return this;
        }

        public C0759a k(long j8) {
            this.f32692a = j8;
            return this;
        }

        public C0759a l(d dVar) {
            this.f32696e = dVar;
            return this;
        }

        public C0759a m(String str) {
            this.f32701j = str;
            return this;
        }

        public C0759a n(int i8) {
            this.f32700i = i8;
            return this;
        }
    }

    /* renamed from: i1.a$b */
    /* loaded from: classes4.dex */
    public enum b implements Y0.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f32711a;

        b(int i8) {
            this.f32711a = i8;
        }

        @Override // Y0.c
        public int getNumber() {
            return this.f32711a;
        }
    }

    /* renamed from: i1.a$c */
    /* loaded from: classes4.dex */
    public enum c implements Y0.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f32717a;

        c(int i8) {
            this.f32717a = i8;
        }

        @Override // Y0.c
        public int getNumber() {
            return this.f32717a;
        }
    }

    /* renamed from: i1.a$d */
    /* loaded from: classes4.dex */
    public enum d implements Y0.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f32723a;

        d(int i8) {
            this.f32723a = i8;
        }

        @Override // Y0.c
        public int getNumber() {
            return this.f32723a;
        }
    }

    C2965a(long j8, String str, String str2, c cVar, d dVar, String str3, String str4, int i8, int i9, String str5, long j9, b bVar, String str6, long j10, String str7) {
        this.f32677a = j8;
        this.f32678b = str;
        this.f32679c = str2;
        this.f32680d = cVar;
        this.f32681e = dVar;
        this.f32682f = str3;
        this.f32683g = str4;
        this.f32684h = i8;
        this.f32685i = i9;
        this.f32686j = str5;
        this.f32687k = j9;
        this.f32688l = bVar;
        this.f32689m = str6;
        this.f32690n = j10;
        this.f32691o = str7;
    }

    public static C0759a p() {
        return new C0759a();
    }

    public String a() {
        return this.f32689m;
    }

    public long b() {
        return this.f32687k;
    }

    public long c() {
        return this.f32690n;
    }

    public String d() {
        return this.f32683g;
    }

    public String e() {
        return this.f32691o;
    }

    public b f() {
        return this.f32688l;
    }

    public String g() {
        return this.f32679c;
    }

    public String h() {
        return this.f32678b;
    }

    public c i() {
        return this.f32680d;
    }

    public String j() {
        return this.f32682f;
    }

    public int k() {
        return this.f32684h;
    }

    public long l() {
        return this.f32677a;
    }

    public d m() {
        return this.f32681e;
    }

    public String n() {
        return this.f32686j;
    }

    public int o() {
        return this.f32685i;
    }
}
