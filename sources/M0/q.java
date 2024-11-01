package M0;

import M0.F;

/* loaded from: classes3.dex */
final class q extends F.e.d.a.b.AbstractC0099d {

    /* renamed from: a, reason: collision with root package name */
    private final String f5842a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5843b;

    /* renamed from: c, reason: collision with root package name */
    private final long f5844c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.AbstractC0099d.AbstractC0100a {

        /* renamed from: a, reason: collision with root package name */
        private String f5845a;

        /* renamed from: b, reason: collision with root package name */
        private String f5846b;

        /* renamed from: c, reason: collision with root package name */
        private long f5847c;

        /* renamed from: d, reason: collision with root package name */
        private byte f5848d;

        @Override // M0.F.e.d.a.b.AbstractC0099d.AbstractC0100a
        public F.e.d.a.b.AbstractC0099d a() {
            String str;
            String str2;
            if (this.f5848d == 1 && (str = this.f5845a) != null && (str2 = this.f5846b) != null) {
                return new q(str, str2, this.f5847c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5845a == null) {
                sb.append(" name");
            }
            if (this.f5846b == null) {
                sb.append(" code");
            }
            if ((1 & this.f5848d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.a.b.AbstractC0099d.AbstractC0100a
        public F.e.d.a.b.AbstractC0099d.AbstractC0100a b(long j8) {
            this.f5847c = j8;
            this.f5848d = (byte) (this.f5848d | 1);
            return this;
        }

        @Override // M0.F.e.d.a.b.AbstractC0099d.AbstractC0100a
        public F.e.d.a.b.AbstractC0099d.AbstractC0100a c(String str) {
            if (str != null) {
                this.f5846b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // M0.F.e.d.a.b.AbstractC0099d.AbstractC0100a
        public F.e.d.a.b.AbstractC0099d.AbstractC0100a d(String str) {
            if (str != null) {
                this.f5845a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // M0.F.e.d.a.b.AbstractC0099d
    public long b() {
        return this.f5844c;
    }

    @Override // M0.F.e.d.a.b.AbstractC0099d
    public String c() {
        return this.f5843b;
    }

    @Override // M0.F.e.d.a.b.AbstractC0099d
    public String d() {
        return this.f5842a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0099d)) {
            return false;
        }
        F.e.d.a.b.AbstractC0099d abstractC0099d = (F.e.d.a.b.AbstractC0099d) obj;
        if (this.f5842a.equals(abstractC0099d.d()) && this.f5843b.equals(abstractC0099d.c()) && this.f5844c == abstractC0099d.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f5842a.hashCode() ^ 1000003) * 1000003) ^ this.f5843b.hashCode()) * 1000003;
        long j8 = this.f5844c;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f5842a + ", code=" + this.f5843b + ", address=" + this.f5844c + "}";
    }

    private q(String str, String str2, long j8) {
        this.f5842a = str;
        this.f5843b = str2;
        this.f5844c = j8;
    }
}
