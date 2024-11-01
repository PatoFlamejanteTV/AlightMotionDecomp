package M0;

import M0.F;

/* loaded from: classes3.dex */
final class l extends F.e.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f5784a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5785b;

    /* renamed from: c, reason: collision with root package name */
    private final F.e.d.a f5786c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.c f5787d;

    /* renamed from: e, reason: collision with root package name */
    private final F.e.d.AbstractC0106d f5788e;

    /* renamed from: f, reason: collision with root package name */
    private final F.e.d.f f5789f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        private long f5790a;

        /* renamed from: b, reason: collision with root package name */
        private String f5791b;

        /* renamed from: c, reason: collision with root package name */
        private F.e.d.a f5792c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.c f5793d;

        /* renamed from: e, reason: collision with root package name */
        private F.e.d.AbstractC0106d f5794e;

        /* renamed from: f, reason: collision with root package name */
        private F.e.d.f f5795f;

        /* renamed from: g, reason: collision with root package name */
        private byte f5796g;

        @Override // M0.F.e.d.b
        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.f5796g == 1 && (str = this.f5791b) != null && (aVar = this.f5792c) != null && (cVar = this.f5793d) != null) {
                return new l(this.f5790a, str, aVar, cVar, this.f5794e, this.f5795f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f5796g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f5791b == null) {
                sb.append(" type");
            }
            if (this.f5792c == null) {
                sb.append(" app");
            }
            if (this.f5793d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.b
        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar != null) {
                this.f5792c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // M0.F.e.d.b
        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar != null) {
                this.f5793d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // M0.F.e.d.b
        public F.e.d.b d(F.e.d.AbstractC0106d abstractC0106d) {
            this.f5794e = abstractC0106d;
            return this;
        }

        @Override // M0.F.e.d.b
        public F.e.d.b e(F.e.d.f fVar) {
            this.f5795f = fVar;
            return this;
        }

        @Override // M0.F.e.d.b
        public F.e.d.b f(long j8) {
            this.f5790a = j8;
            this.f5796g = (byte) (this.f5796g | 1);
            return this;
        }

        @Override // M0.F.e.d.b
        public F.e.d.b g(String str) {
            if (str != null) {
                this.f5791b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(F.e.d dVar) {
            this.f5790a = dVar.f();
            this.f5791b = dVar.g();
            this.f5792c = dVar.b();
            this.f5793d = dVar.c();
            this.f5794e = dVar.d();
            this.f5795f = dVar.e();
            this.f5796g = (byte) 1;
        }
    }

    @Override // M0.F.e.d
    public F.e.d.a b() {
        return this.f5786c;
    }

    @Override // M0.F.e.d
    public F.e.d.c c() {
        return this.f5787d;
    }

    @Override // M0.F.e.d
    public F.e.d.AbstractC0106d d() {
        return this.f5788e;
    }

    @Override // M0.F.e.d
    public F.e.d.f e() {
        return this.f5789f;
    }

    public boolean equals(Object obj) {
        F.e.d.AbstractC0106d abstractC0106d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d)) {
            return false;
        }
        F.e.d dVar = (F.e.d) obj;
        if (this.f5784a == dVar.f() && this.f5785b.equals(dVar.g()) && this.f5786c.equals(dVar.b()) && this.f5787d.equals(dVar.c()) && ((abstractC0106d = this.f5788e) != null ? abstractC0106d.equals(dVar.d()) : dVar.d() == null)) {
            F.e.d.f fVar = this.f5789f;
            if (fVar == null) {
                if (dVar.e() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // M0.F.e.d
    public long f() {
        return this.f5784a;
    }

    @Override // M0.F.e.d
    public String g() {
        return this.f5785b;
    }

    @Override // M0.F.e.d
    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        long j8 = this.f5784a;
        int hashCode2 = (((((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f5785b.hashCode()) * 1000003) ^ this.f5786c.hashCode()) * 1000003) ^ this.f5787d.hashCode()) * 1000003;
        F.e.d.AbstractC0106d abstractC0106d = this.f5788e;
        int i8 = 0;
        if (abstractC0106d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC0106d.hashCode();
        }
        int i9 = (hashCode2 ^ hashCode) * 1000003;
        F.e.d.f fVar = this.f5789f;
        if (fVar != null) {
            i8 = fVar.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "Event{timestamp=" + this.f5784a + ", type=" + this.f5785b + ", app=" + this.f5786c + ", device=" + this.f5787d + ", log=" + this.f5788e + ", rollouts=" + this.f5789f + "}";
    }

    private l(long j8, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.AbstractC0106d abstractC0106d, F.e.d.f fVar) {
        this.f5784a = j8;
        this.f5785b = str;
        this.f5786c = aVar;
        this.f5787d = cVar;
        this.f5788e = abstractC0106d;
        this.f5789f = fVar;
    }
}
