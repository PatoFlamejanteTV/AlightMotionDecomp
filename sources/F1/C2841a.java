package f1;

import f1.AbstractC2844d;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2841a extends AbstractC2844d {

    /* renamed from: a, reason: collision with root package name */
    private final String f31818a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31819b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31820c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2846f f31821d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC2844d.b f31822e;

    /* renamed from: f1.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC2844d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f31823a;

        /* renamed from: b, reason: collision with root package name */
        private String f31824b;

        /* renamed from: c, reason: collision with root package name */
        private String f31825c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC2846f f31826d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC2844d.b f31827e;

        @Override // f1.AbstractC2844d.a
        public AbstractC2844d a() {
            return new C2841a(this.f31823a, this.f31824b, this.f31825c, this.f31826d, this.f31827e);
        }

        @Override // f1.AbstractC2844d.a
        public AbstractC2844d.a b(AbstractC2846f abstractC2846f) {
            this.f31826d = abstractC2846f;
            return this;
        }

        @Override // f1.AbstractC2844d.a
        public AbstractC2844d.a c(String str) {
            this.f31824b = str;
            return this;
        }

        @Override // f1.AbstractC2844d.a
        public AbstractC2844d.a d(String str) {
            this.f31825c = str;
            return this;
        }

        @Override // f1.AbstractC2844d.a
        public AbstractC2844d.a e(AbstractC2844d.b bVar) {
            this.f31827e = bVar;
            return this;
        }

        @Override // f1.AbstractC2844d.a
        public AbstractC2844d.a f(String str) {
            this.f31823a = str;
            return this;
        }
    }

    @Override // f1.AbstractC2844d
    public AbstractC2846f b() {
        return this.f31821d;
    }

    @Override // f1.AbstractC2844d
    public String c() {
        return this.f31819b;
    }

    @Override // f1.AbstractC2844d
    public String d() {
        return this.f31820c;
    }

    @Override // f1.AbstractC2844d
    public AbstractC2844d.b e() {
        return this.f31822e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2844d)) {
            return false;
        }
        AbstractC2844d abstractC2844d = (AbstractC2844d) obj;
        String str = this.f31818a;
        if (str != null ? str.equals(abstractC2844d.f()) : abstractC2844d.f() == null) {
            String str2 = this.f31819b;
            if (str2 != null ? str2.equals(abstractC2844d.c()) : abstractC2844d.c() == null) {
                String str3 = this.f31820c;
                if (str3 != null ? str3.equals(abstractC2844d.d()) : abstractC2844d.d() == null) {
                    AbstractC2846f abstractC2846f = this.f31821d;
                    if (abstractC2846f != null ? abstractC2846f.equals(abstractC2844d.b()) : abstractC2844d.b() == null) {
                        AbstractC2844d.b bVar = this.f31822e;
                        if (bVar == null) {
                            if (abstractC2844d.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(abstractC2844d.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // f1.AbstractC2844d
    public String f() {
        return this.f31818a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f31818a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f31819b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        String str3 = this.f31820c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        AbstractC2846f abstractC2846f = this.f31821d;
        if (abstractC2846f == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC2846f.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        AbstractC2844d.b bVar = this.f31822e;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i12 ^ i8;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f31818a + ", fid=" + this.f31819b + ", refreshToken=" + this.f31820c + ", authToken=" + this.f31821d + ", responseCode=" + this.f31822e + "}";
    }

    private C2841a(String str, String str2, String str3, AbstractC2846f abstractC2846f, AbstractC2844d.b bVar) {
        this.f31818a = str;
        this.f31819b = str2;
        this.f31820c = str3;
        this.f31821d = abstractC2846f;
        this.f31822e = bVar;
    }
}
