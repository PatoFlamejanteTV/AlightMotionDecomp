package M0;

import M0.F;

/* loaded from: classes3.dex */
final class u extends F.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f5876a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5877b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5878c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5879d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5880e;

    /* renamed from: f, reason: collision with root package name */
    private final long f5881f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f5882a;

        /* renamed from: b, reason: collision with root package name */
        private int f5883b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f5884c;

        /* renamed from: d, reason: collision with root package name */
        private int f5885d;

        /* renamed from: e, reason: collision with root package name */
        private long f5886e;

        /* renamed from: f, reason: collision with root package name */
        private long f5887f;

        /* renamed from: g, reason: collision with root package name */
        private byte f5888g;

        @Override // M0.F.e.d.c.a
        public F.e.d.c a() {
            if (this.f5888g != 31) {
                StringBuilder sb = new StringBuilder();
                if ((this.f5888g & 1) == 0) {
                    sb.append(" batteryVelocity");
                }
                if ((this.f5888g & 2) == 0) {
                    sb.append(" proximityOn");
                }
                if ((this.f5888g & 4) == 0) {
                    sb.append(" orientation");
                }
                if ((this.f5888g & 8) == 0) {
                    sb.append(" ramUsed");
                }
                if ((this.f5888g & 16) == 0) {
                    sb.append(" diskUsed");
                }
                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
            }
            return new u(this.f5882a, this.f5883b, this.f5884c, this.f5885d, this.f5886e, this.f5887f);
        }

        @Override // M0.F.e.d.c.a
        public F.e.d.c.a b(Double d8) {
            this.f5882a = d8;
            return this;
        }

        @Override // M0.F.e.d.c.a
        public F.e.d.c.a c(int i8) {
            this.f5883b = i8;
            this.f5888g = (byte) (this.f5888g | 1);
            return this;
        }

        @Override // M0.F.e.d.c.a
        public F.e.d.c.a d(long j8) {
            this.f5887f = j8;
            this.f5888g = (byte) (this.f5888g | 16);
            return this;
        }

        @Override // M0.F.e.d.c.a
        public F.e.d.c.a e(int i8) {
            this.f5885d = i8;
            this.f5888g = (byte) (this.f5888g | 4);
            return this;
        }

        @Override // M0.F.e.d.c.a
        public F.e.d.c.a f(boolean z8) {
            this.f5884c = z8;
            this.f5888g = (byte) (this.f5888g | 2);
            return this;
        }

        @Override // M0.F.e.d.c.a
        public F.e.d.c.a g(long j8) {
            this.f5886e = j8;
            this.f5888g = (byte) (this.f5888g | 8);
            return this;
        }
    }

    @Override // M0.F.e.d.c
    public Double b() {
        return this.f5876a;
    }

    @Override // M0.F.e.d.c
    public int c() {
        return this.f5877b;
    }

    @Override // M0.F.e.d.c
    public long d() {
        return this.f5881f;
    }

    @Override // M0.F.e.d.c
    public int e() {
        return this.f5879d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.c)) {
            return false;
        }
        F.e.d.c cVar = (F.e.d.c) obj;
        Double d8 = this.f5876a;
        if (d8 != null ? d8.equals(cVar.b()) : cVar.b() == null) {
            if (this.f5877b == cVar.c() && this.f5878c == cVar.g() && this.f5879d == cVar.e() && this.f5880e == cVar.f() && this.f5881f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // M0.F.e.d.c
    public long f() {
        return this.f5880e;
    }

    @Override // M0.F.e.d.c
    public boolean g() {
        return this.f5878c;
    }

    public int hashCode() {
        int hashCode;
        int i8;
        Double d8 = this.f5876a;
        if (d8 == null) {
            hashCode = 0;
        } else {
            hashCode = d8.hashCode();
        }
        int i9 = (((hashCode ^ 1000003) * 1000003) ^ this.f5877b) * 1000003;
        if (this.f5878c) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i10 = (((i9 ^ i8) * 1000003) ^ this.f5879d) * 1000003;
        long j8 = this.f5880e;
        long j9 = this.f5881f;
        return ((i10 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f5876a + ", batteryVelocity=" + this.f5877b + ", proximityOn=" + this.f5878c + ", orientation=" + this.f5879d + ", ramUsed=" + this.f5880e + ", diskUsed=" + this.f5881f + "}";
    }

    private u(Double d8, int i8, boolean z8, int i9, long j8, long j9) {
        this.f5876a = d8;
        this.f5877b = i8;
        this.f5878c = z8;
        this.f5879d = i9;
        this.f5880e = j8;
        this.f5881f = j9;
    }
}
