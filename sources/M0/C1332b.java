package M0;

import M0.F;

/* renamed from: M0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1332b extends F {

    /* renamed from: b, reason: collision with root package name */
    private final String f5666b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5667c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5668d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5669e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5670f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5671g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5672h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5673i;

    /* renamed from: j, reason: collision with root package name */
    private final String f5674j;

    /* renamed from: k, reason: collision with root package name */
    private final F.e f5675k;

    /* renamed from: l, reason: collision with root package name */
    private final F.d f5676l;

    /* renamed from: m, reason: collision with root package name */
    private final F.a f5677m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0110b extends F.b {

        /* renamed from: a, reason: collision with root package name */
        private String f5678a;

        /* renamed from: b, reason: collision with root package name */
        private String f5679b;

        /* renamed from: c, reason: collision with root package name */
        private int f5680c;

        /* renamed from: d, reason: collision with root package name */
        private String f5681d;

        /* renamed from: e, reason: collision with root package name */
        private String f5682e;

        /* renamed from: f, reason: collision with root package name */
        private String f5683f;

        /* renamed from: g, reason: collision with root package name */
        private String f5684g;

        /* renamed from: h, reason: collision with root package name */
        private String f5685h;

        /* renamed from: i, reason: collision with root package name */
        private String f5686i;

        /* renamed from: j, reason: collision with root package name */
        private F.e f5687j;

        /* renamed from: k, reason: collision with root package name */
        private F.d f5688k;

        /* renamed from: l, reason: collision with root package name */
        private F.a f5689l;

        /* renamed from: m, reason: collision with root package name */
        private byte f5690m;

        @Override // M0.F.b
        public F a() {
            if (this.f5690m == 1 && this.f5678a != null && this.f5679b != null && this.f5681d != null && this.f5685h != null && this.f5686i != null) {
                return new C1332b(this.f5678a, this.f5679b, this.f5680c, this.f5681d, this.f5682e, this.f5683f, this.f5684g, this.f5685h, this.f5686i, this.f5687j, this.f5688k, this.f5689l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5678a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f5679b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f5690m) == 0) {
                sb.append(" platform");
            }
            if (this.f5681d == null) {
                sb.append(" installationUuid");
            }
            if (this.f5685h == null) {
                sb.append(" buildVersion");
            }
            if (this.f5686i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.b
        public F.b b(F.a aVar) {
            this.f5689l = aVar;
            return this;
        }

        @Override // M0.F.b
        public F.b c(String str) {
            this.f5684g = str;
            return this;
        }

        @Override // M0.F.b
        public F.b d(String str) {
            if (str != null) {
                this.f5685h = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // M0.F.b
        public F.b e(String str) {
            if (str != null) {
                this.f5686i = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // M0.F.b
        public F.b f(String str) {
            this.f5683f = str;
            return this;
        }

        @Override // M0.F.b
        public F.b g(String str) {
            this.f5682e = str;
            return this;
        }

        @Override // M0.F.b
        public F.b h(String str) {
            if (str != null) {
                this.f5679b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // M0.F.b
        public F.b i(String str) {
            if (str != null) {
                this.f5681d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // M0.F.b
        public F.b j(F.d dVar) {
            this.f5688k = dVar;
            return this;
        }

        @Override // M0.F.b
        public F.b k(int i8) {
            this.f5680c = i8;
            this.f5690m = (byte) (this.f5690m | 1);
            return this;
        }

        @Override // M0.F.b
        public F.b l(String str) {
            if (str != null) {
                this.f5678a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // M0.F.b
        public F.b m(F.e eVar) {
            this.f5687j = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0110b() {
        }

        private C0110b(F f8) {
            this.f5678a = f8.m();
            this.f5679b = f8.i();
            this.f5680c = f8.l();
            this.f5681d = f8.j();
            this.f5682e = f8.h();
            this.f5683f = f8.g();
            this.f5684g = f8.d();
            this.f5685h = f8.e();
            this.f5686i = f8.f();
            this.f5687j = f8.n();
            this.f5688k = f8.k();
            this.f5689l = f8.c();
            this.f5690m = (byte) 1;
        }
    }

    @Override // M0.F
    public F.a c() {
        return this.f5677m;
    }

    @Override // M0.F
    public String d() {
        return this.f5672h;
    }

    @Override // M0.F
    public String e() {
        return this.f5673i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        F.e eVar;
        F.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f8 = (F) obj;
        if (this.f5666b.equals(f8.m()) && this.f5667c.equals(f8.i()) && this.f5668d == f8.l() && this.f5669e.equals(f8.j()) && ((str = this.f5670f) != null ? str.equals(f8.h()) : f8.h() == null) && ((str2 = this.f5671g) != null ? str2.equals(f8.g()) : f8.g() == null) && ((str3 = this.f5672h) != null ? str3.equals(f8.d()) : f8.d() == null) && this.f5673i.equals(f8.e()) && this.f5674j.equals(f8.f()) && ((eVar = this.f5675k) != null ? eVar.equals(f8.n()) : f8.n() == null) && ((dVar = this.f5676l) != null ? dVar.equals(f8.k()) : f8.k() == null)) {
            F.a aVar = this.f5677m;
            if (aVar == null) {
                if (f8.c() == null) {
                    return true;
                }
            } else if (aVar.equals(f8.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // M0.F
    public String f() {
        return this.f5674j;
    }

    @Override // M0.F
    public String g() {
        return this.f5671g;
    }

    @Override // M0.F
    public String h() {
        return this.f5670f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.f5666b.hashCode() ^ 1000003) * 1000003) ^ this.f5667c.hashCode()) * 1000003) ^ this.f5668d) * 1000003) ^ this.f5669e.hashCode()) * 1000003;
        String str = this.f5670f;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f5671g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        String str3 = this.f5672h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i10 ^ hashCode3) * 1000003) ^ this.f5673i.hashCode()) * 1000003) ^ this.f5674j.hashCode()) * 1000003;
        F.e eVar = this.f5675k;
        if (eVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = eVar.hashCode();
        }
        int i11 = (hashCode7 ^ hashCode4) * 1000003;
        F.d dVar = this.f5676l;
        if (dVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = dVar.hashCode();
        }
        int i12 = (i11 ^ hashCode5) * 1000003;
        F.a aVar = this.f5677m;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return i12 ^ i8;
    }

    @Override // M0.F
    public String i() {
        return this.f5667c;
    }

    @Override // M0.F
    public String j() {
        return this.f5669e;
    }

    @Override // M0.F
    public F.d k() {
        return this.f5676l;
    }

    @Override // M0.F
    public int l() {
        return this.f5668d;
    }

    @Override // M0.F
    public String m() {
        return this.f5666b;
    }

    @Override // M0.F
    public F.e n() {
        return this.f5675k;
    }

    @Override // M0.F
    protected F.b o() {
        return new C0110b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f5666b + ", gmpAppId=" + this.f5667c + ", platform=" + this.f5668d + ", installationUuid=" + this.f5669e + ", firebaseInstallationId=" + this.f5670f + ", firebaseAuthenticationToken=" + this.f5671g + ", appQualitySessionId=" + this.f5672h + ", buildVersion=" + this.f5673i + ", displayVersion=" + this.f5674j + ", session=" + this.f5675k + ", ndkPayload=" + this.f5676l + ", appExitInfo=" + this.f5677m + "}";
    }

    private C1332b(String str, String str2, int i8, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar) {
        this.f5666b = str;
        this.f5667c = str2;
        this.f5668d = i8;
        this.f5669e = str3;
        this.f5670f = str4;
        this.f5671g = str5;
        this.f5672h = str6;
        this.f5673i = str7;
        this.f5674j = str8;
        this.f5675k = eVar;
        this.f5676l = dVar;
        this.f5677m = aVar;
    }
}
