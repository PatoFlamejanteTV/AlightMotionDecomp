package M0;

import M0.F;

/* loaded from: classes3.dex */
final class k extends F.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f5765a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5766b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5767c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5768d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5769e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5770f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5771g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5772h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5773i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private int f5774a;

        /* renamed from: b, reason: collision with root package name */
        private String f5775b;

        /* renamed from: c, reason: collision with root package name */
        private int f5776c;

        /* renamed from: d, reason: collision with root package name */
        private long f5777d;

        /* renamed from: e, reason: collision with root package name */
        private long f5778e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5779f;

        /* renamed from: g, reason: collision with root package name */
        private int f5780g;

        /* renamed from: h, reason: collision with root package name */
        private String f5781h;

        /* renamed from: i, reason: collision with root package name */
        private String f5782i;

        /* renamed from: j, reason: collision with root package name */
        private byte f5783j;

        @Override // M0.F.e.c.a
        public F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f5783j == 63 && (str = this.f5775b) != null && (str2 = this.f5781h) != null && (str3 = this.f5782i) != null) {
                return new k(this.f5774a, str, this.f5776c, this.f5777d, this.f5778e, this.f5779f, this.f5780g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f5783j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f5775b == null) {
                sb.append(" model");
            }
            if ((this.f5783j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f5783j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f5783j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f5783j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f5783j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f5781h == null) {
                sb.append(" manufacturer");
            }
            if (this.f5782i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.c.a
        public F.e.c.a b(int i8) {
            this.f5774a = i8;
            this.f5783j = (byte) (this.f5783j | 1);
            return this;
        }

        @Override // M0.F.e.c.a
        public F.e.c.a c(int i8) {
            this.f5776c = i8;
            this.f5783j = (byte) (this.f5783j | 2);
            return this;
        }

        @Override // M0.F.e.c.a
        public F.e.c.a d(long j8) {
            this.f5778e = j8;
            this.f5783j = (byte) (this.f5783j | 8);
            return this;
        }

        @Override // M0.F.e.c.a
        public F.e.c.a e(String str) {
            if (str != null) {
                this.f5781h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // M0.F.e.c.a
        public F.e.c.a f(String str) {
            if (str != null) {
                this.f5775b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // M0.F.e.c.a
        public F.e.c.a g(String str) {
            if (str != null) {
                this.f5782i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // M0.F.e.c.a
        public F.e.c.a h(long j8) {
            this.f5777d = j8;
            this.f5783j = (byte) (this.f5783j | 4);
            return this;
        }

        @Override // M0.F.e.c.a
        public F.e.c.a i(boolean z8) {
            this.f5779f = z8;
            this.f5783j = (byte) (this.f5783j | 16);
            return this;
        }

        @Override // M0.F.e.c.a
        public F.e.c.a j(int i8) {
            this.f5780g = i8;
            this.f5783j = (byte) (this.f5783j | 32);
            return this;
        }
    }

    @Override // M0.F.e.c
    public int b() {
        return this.f5765a;
    }

    @Override // M0.F.e.c
    public int c() {
        return this.f5767c;
    }

    @Override // M0.F.e.c
    public long d() {
        return this.f5769e;
    }

    @Override // M0.F.e.c
    public String e() {
        return this.f5772h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.c)) {
            return false;
        }
        F.e.c cVar = (F.e.c) obj;
        if (this.f5765a == cVar.b() && this.f5766b.equals(cVar.f()) && this.f5767c == cVar.c() && this.f5768d == cVar.h() && this.f5769e == cVar.d() && this.f5770f == cVar.j() && this.f5771g == cVar.i() && this.f5772h.equals(cVar.e()) && this.f5773i.equals(cVar.g())) {
            return true;
        }
        return false;
    }

    @Override // M0.F.e.c
    public String f() {
        return this.f5766b;
    }

    @Override // M0.F.e.c
    public String g() {
        return this.f5773i;
    }

    @Override // M0.F.e.c
    public long h() {
        return this.f5768d;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f5765a ^ 1000003) * 1000003) ^ this.f5766b.hashCode()) * 1000003) ^ this.f5767c) * 1000003;
        long j8 = this.f5768d;
        int i9 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f5769e;
        int i10 = (i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        if (this.f5770f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return ((((((i10 ^ i8) * 1000003) ^ this.f5771g) * 1000003) ^ this.f5772h.hashCode()) * 1000003) ^ this.f5773i.hashCode();
    }

    @Override // M0.F.e.c
    public int i() {
        return this.f5771g;
    }

    @Override // M0.F.e.c
    public boolean j() {
        return this.f5770f;
    }

    public String toString() {
        return "Device{arch=" + this.f5765a + ", model=" + this.f5766b + ", cores=" + this.f5767c + ", ram=" + this.f5768d + ", diskSpace=" + this.f5769e + ", simulator=" + this.f5770f + ", state=" + this.f5771g + ", manufacturer=" + this.f5772h + ", modelClass=" + this.f5773i + "}";
    }

    private k(int i8, String str, int i9, long j8, long j9, boolean z8, int i10, String str2, String str3) {
        this.f5765a = i8;
        this.f5766b = str;
        this.f5767c = i9;
        this.f5768d = j8;
        this.f5769e = j9;
        this.f5770f = z8;
        this.f5771g = i10;
        this.f5772h = str2;
        this.f5773i = str3;
    }
}
