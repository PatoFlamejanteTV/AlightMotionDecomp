package M0;

import M0.F;

/* loaded from: classes3.dex */
final class s extends F.e.d.a.b.AbstractC0101e.AbstractC0103b {

    /* renamed from: a, reason: collision with root package name */
    private final long f5856a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5857b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5858c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5859d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5860e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a {

        /* renamed from: a, reason: collision with root package name */
        private long f5861a;

        /* renamed from: b, reason: collision with root package name */
        private String f5862b;

        /* renamed from: c, reason: collision with root package name */
        private String f5863c;

        /* renamed from: d, reason: collision with root package name */
        private long f5864d;

        /* renamed from: e, reason: collision with root package name */
        private int f5865e;

        /* renamed from: f, reason: collision with root package name */
        private byte f5866f;

        @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a
        public F.e.d.a.b.AbstractC0101e.AbstractC0103b a() {
            String str;
            if (this.f5866f == 7 && (str = this.f5862b) != null) {
                return new s(this.f5861a, str, this.f5863c, this.f5864d, this.f5865e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f5866f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f5862b == null) {
                sb.append(" symbol");
            }
            if ((this.f5866f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f5866f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a
        public F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a b(String str) {
            this.f5863c = str;
            return this;
        }

        @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a
        public F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a c(int i8) {
            this.f5865e = i8;
            this.f5866f = (byte) (this.f5866f | 4);
            return this;
        }

        @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a
        public F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a d(long j8) {
            this.f5864d = j8;
            this.f5866f = (byte) (this.f5866f | 2);
            return this;
        }

        @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a
        public F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a e(long j8) {
            this.f5861a = j8;
            this.f5866f = (byte) (this.f5866f | 1);
            return this;
        }

        @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a
        public F.e.d.a.b.AbstractC0101e.AbstractC0103b.AbstractC0104a f(String str) {
            if (str != null) {
                this.f5862b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b
    public String b() {
        return this.f5858c;
    }

    @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b
    public int c() {
        return this.f5860e;
    }

    @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b
    public long d() {
        return this.f5859d;
    }

    @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b
    public long e() {
        return this.f5856a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0101e.AbstractC0103b)) {
            return false;
        }
        F.e.d.a.b.AbstractC0101e.AbstractC0103b abstractC0103b = (F.e.d.a.b.AbstractC0101e.AbstractC0103b) obj;
        if (this.f5856a == abstractC0103b.e() && this.f5857b.equals(abstractC0103b.f()) && ((str = this.f5858c) != null ? str.equals(abstractC0103b.b()) : abstractC0103b.b() == null) && this.f5859d == abstractC0103b.d() && this.f5860e == abstractC0103b.c()) {
            return true;
        }
        return false;
    }

    @Override // M0.F.e.d.a.b.AbstractC0101e.AbstractC0103b
    public String f() {
        return this.f5857b;
    }

    public int hashCode() {
        int hashCode;
        long j8 = this.f5856a;
        int hashCode2 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f5857b.hashCode()) * 1000003;
        String str = this.f5858c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode2 ^ hashCode) * 1000003;
        long j9 = this.f5859d;
        return this.f5860e ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f5856a + ", symbol=" + this.f5857b + ", file=" + this.f5858c + ", offset=" + this.f5859d + ", importance=" + this.f5860e + "}";
    }

    private s(long j8, String str, String str2, long j9, int i8) {
        this.f5856a = j8;
        this.f5857b = str;
        this.f5858c = str2;
        this.f5859d = j9;
        this.f5860e = i8;
    }
}
