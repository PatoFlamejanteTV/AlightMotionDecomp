package M0;

import M0.F;

/* loaded from: classes3.dex */
final class i extends F.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5753a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5754b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5755c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5756d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5757e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5758f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.a.AbstractC0093a {

        /* renamed from: a, reason: collision with root package name */
        private String f5759a;

        /* renamed from: b, reason: collision with root package name */
        private String f5760b;

        /* renamed from: c, reason: collision with root package name */
        private String f5761c;

        /* renamed from: d, reason: collision with root package name */
        private String f5762d;

        /* renamed from: e, reason: collision with root package name */
        private String f5763e;

        /* renamed from: f, reason: collision with root package name */
        private String f5764f;

        @Override // M0.F.e.a.AbstractC0093a
        public F.e.a a() {
            String str;
            String str2 = this.f5759a;
            if (str2 != null && (str = this.f5760b) != null) {
                return new i(str2, str, this.f5761c, null, this.f5762d, this.f5763e, this.f5764f);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5759a == null) {
                sb.append(" identifier");
            }
            if (this.f5760b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.a.AbstractC0093a
        public F.e.a.AbstractC0093a b(String str) {
            this.f5763e = str;
            return this;
        }

        @Override // M0.F.e.a.AbstractC0093a
        public F.e.a.AbstractC0093a c(String str) {
            this.f5764f = str;
            return this;
        }

        @Override // M0.F.e.a.AbstractC0093a
        public F.e.a.AbstractC0093a d(String str) {
            this.f5761c = str;
            return this;
        }

        @Override // M0.F.e.a.AbstractC0093a
        public F.e.a.AbstractC0093a e(String str) {
            if (str != null) {
                this.f5759a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // M0.F.e.a.AbstractC0093a
        public F.e.a.AbstractC0093a f(String str) {
            this.f5762d = str;
            return this;
        }

        @Override // M0.F.e.a.AbstractC0093a
        public F.e.a.AbstractC0093a g(String str) {
            if (str != null) {
                this.f5760b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // M0.F.e.a
    public String b() {
        return this.f5757e;
    }

    @Override // M0.F.e.a
    public String c() {
        return this.f5758f;
    }

    @Override // M0.F.e.a
    public String d() {
        return this.f5755c;
    }

    @Override // M0.F.e.a
    public String e() {
        return this.f5753a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.a)) {
            return false;
        }
        F.e.a aVar = (F.e.a) obj;
        if (this.f5753a.equals(aVar.e()) && this.f5754b.equals(aVar.h()) && ((str = this.f5755c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
            aVar.g();
            String str2 = this.f5756d;
            if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                String str3 = this.f5757e;
                if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                    String str4 = this.f5758f;
                    if (str4 == null) {
                        if (aVar.c() == null) {
                            return true;
                        }
                    } else if (str4.equals(aVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // M0.F.e.a
    public String f() {
        return this.f5756d;
    }

    @Override // M0.F.e.a
    public F.e.a.b g() {
        return null;
    }

    @Override // M0.F.e.a
    public String h() {
        return this.f5754b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f5753a.hashCode() ^ 1000003) * 1000003) ^ this.f5754b.hashCode()) * 1000003;
        String str = this.f5755c;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.f5756d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        String str3 = this.f5757e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        String str4 = this.f5758f;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return i11 ^ i8;
    }

    public String toString() {
        return "Application{identifier=" + this.f5753a + ", version=" + this.f5754b + ", displayVersion=" + this.f5755c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f5756d + ", developmentPlatform=" + this.f5757e + ", developmentPlatformVersion=" + this.f5758f + "}";
    }

    private i(String str, String str2, String str3, F.e.a.b bVar, String str4, String str5, String str6) {
        this.f5753a = str;
        this.f5754b = str2;
        this.f5755c = str3;
        this.f5756d = str4;
        this.f5757e = str5;
        this.f5758f = str6;
    }
}
