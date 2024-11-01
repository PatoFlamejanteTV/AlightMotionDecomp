package M0;

import M0.F;

/* loaded from: classes3.dex */
final class o extends F.e.d.a.b.AbstractC0095a {

    /* renamed from: a, reason: collision with root package name */
    private final long f5822a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5823b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5824c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5825d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.AbstractC0095a.AbstractC0096a {

        /* renamed from: a, reason: collision with root package name */
        private long f5826a;

        /* renamed from: b, reason: collision with root package name */
        private long f5827b;

        /* renamed from: c, reason: collision with root package name */
        private String f5828c;

        /* renamed from: d, reason: collision with root package name */
        private String f5829d;

        /* renamed from: e, reason: collision with root package name */
        private byte f5830e;

        @Override // M0.F.e.d.a.b.AbstractC0095a.AbstractC0096a
        public F.e.d.a.b.AbstractC0095a a() {
            String str;
            if (this.f5830e == 3 && (str = this.f5828c) != null) {
                return new o(this.f5826a, this.f5827b, str, this.f5829d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f5830e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f5830e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f5828c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.a.b.AbstractC0095a.AbstractC0096a
        public F.e.d.a.b.AbstractC0095a.AbstractC0096a b(long j8) {
            this.f5826a = j8;
            this.f5830e = (byte) (this.f5830e | 1);
            return this;
        }

        @Override // M0.F.e.d.a.b.AbstractC0095a.AbstractC0096a
        public F.e.d.a.b.AbstractC0095a.AbstractC0096a c(String str) {
            if (str != null) {
                this.f5828c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // M0.F.e.d.a.b.AbstractC0095a.AbstractC0096a
        public F.e.d.a.b.AbstractC0095a.AbstractC0096a d(long j8) {
            this.f5827b = j8;
            this.f5830e = (byte) (this.f5830e | 2);
            return this;
        }

        @Override // M0.F.e.d.a.b.AbstractC0095a.AbstractC0096a
        public F.e.d.a.b.AbstractC0095a.AbstractC0096a e(String str) {
            this.f5829d = str;
            return this;
        }
    }

    @Override // M0.F.e.d.a.b.AbstractC0095a
    public long b() {
        return this.f5822a;
    }

    @Override // M0.F.e.d.a.b.AbstractC0095a
    public String c() {
        return this.f5824c;
    }

    @Override // M0.F.e.d.a.b.AbstractC0095a
    public long d() {
        return this.f5823b;
    }

    @Override // M0.F.e.d.a.b.AbstractC0095a
    public String e() {
        return this.f5825d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0095a)) {
            return false;
        }
        F.e.d.a.b.AbstractC0095a abstractC0095a = (F.e.d.a.b.AbstractC0095a) obj;
        if (this.f5822a == abstractC0095a.b() && this.f5823b == abstractC0095a.d() && this.f5824c.equals(abstractC0095a.c())) {
            String str = this.f5825d;
            if (str == null) {
                if (abstractC0095a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0095a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j8 = this.f5822a;
        long j9 = this.f5823b;
        int hashCode2 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f5824c.hashCode()) * 1000003;
        String str = this.f5825d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f5822a + ", size=" + this.f5823b + ", name=" + this.f5824c + ", uuid=" + this.f5825d + "}";
    }

    private o(long j8, long j9, String str, String str2) {
        this.f5822a = j8;
        this.f5823b = j9;
        this.f5824c = str;
        this.f5825d = str2;
    }
}
