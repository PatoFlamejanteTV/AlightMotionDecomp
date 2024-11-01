package M0;

import M0.F;

/* loaded from: classes3.dex */
final class w extends F.e.d.AbstractC0107e {

    /* renamed from: a, reason: collision with root package name */
    private final F.e.d.AbstractC0107e.b f5891a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5892b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5893c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5894d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.AbstractC0107e.a {

        /* renamed from: a, reason: collision with root package name */
        private F.e.d.AbstractC0107e.b f5895a;

        /* renamed from: b, reason: collision with root package name */
        private String f5896b;

        /* renamed from: c, reason: collision with root package name */
        private String f5897c;

        /* renamed from: d, reason: collision with root package name */
        private long f5898d;

        /* renamed from: e, reason: collision with root package name */
        private byte f5899e;

        @Override // M0.F.e.d.AbstractC0107e.a
        public F.e.d.AbstractC0107e a() {
            F.e.d.AbstractC0107e.b bVar;
            String str;
            String str2;
            if (this.f5899e == 1 && (bVar = this.f5895a) != null && (str = this.f5896b) != null && (str2 = this.f5897c) != null) {
                return new w(bVar, str, str2, this.f5898d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5895a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f5896b == null) {
                sb.append(" parameterKey");
            }
            if (this.f5897c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f5899e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.AbstractC0107e.a
        public F.e.d.AbstractC0107e.a b(String str) {
            if (str != null) {
                this.f5896b = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override // M0.F.e.d.AbstractC0107e.a
        public F.e.d.AbstractC0107e.a c(String str) {
            if (str != null) {
                this.f5897c = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override // M0.F.e.d.AbstractC0107e.a
        public F.e.d.AbstractC0107e.a d(F.e.d.AbstractC0107e.b bVar) {
            if (bVar != null) {
                this.f5895a = bVar;
                return this;
            }
            throw new NullPointerException("Null rolloutVariant");
        }

        @Override // M0.F.e.d.AbstractC0107e.a
        public F.e.d.AbstractC0107e.a e(long j8) {
            this.f5898d = j8;
            this.f5899e = (byte) (this.f5899e | 1);
            return this;
        }
    }

    @Override // M0.F.e.d.AbstractC0107e
    public String b() {
        return this.f5892b;
    }

    @Override // M0.F.e.d.AbstractC0107e
    public String c() {
        return this.f5893c;
    }

    @Override // M0.F.e.d.AbstractC0107e
    public F.e.d.AbstractC0107e.b d() {
        return this.f5891a;
    }

    @Override // M0.F.e.d.AbstractC0107e
    public long e() {
        return this.f5894d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.AbstractC0107e)) {
            return false;
        }
        F.e.d.AbstractC0107e abstractC0107e = (F.e.d.AbstractC0107e) obj;
        if (this.f5891a.equals(abstractC0107e.d()) && this.f5892b.equals(abstractC0107e.b()) && this.f5893c.equals(abstractC0107e.c()) && this.f5894d == abstractC0107e.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.f5891a.hashCode() ^ 1000003) * 1000003) ^ this.f5892b.hashCode()) * 1000003) ^ this.f5893c.hashCode()) * 1000003;
        long j8 = this.f5894d;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f5891a + ", parameterKey=" + this.f5892b + ", parameterValue=" + this.f5893c + ", templateVersion=" + this.f5894d + "}";
    }

    private w(F.e.d.AbstractC0107e.b bVar, String str, String str2, long j8) {
        this.f5891a = bVar;
        this.f5892b = str;
        this.f5893c = str2;
        this.f5894d = j8;
    }
}
