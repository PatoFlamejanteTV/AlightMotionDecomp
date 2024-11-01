package e1;

import e1.AbstractC2786d;
import e1.C2785c;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2783a extends AbstractC2786d {

    /* renamed from: b, reason: collision with root package name */
    private final String f31524b;

    /* renamed from: c, reason: collision with root package name */
    private final C2785c.a f31525c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31526d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31527e;

    /* renamed from: f, reason: collision with root package name */
    private final long f31528f;

    /* renamed from: g, reason: collision with root package name */
    private final long f31529g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31530h;

    /* renamed from: e1.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC2786d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f31531a;

        /* renamed from: b, reason: collision with root package name */
        private C2785c.a f31532b;

        /* renamed from: c, reason: collision with root package name */
        private String f31533c;

        /* renamed from: d, reason: collision with root package name */
        private String f31534d;

        /* renamed from: e, reason: collision with root package name */
        private Long f31535e;

        /* renamed from: f, reason: collision with root package name */
        private Long f31536f;

        /* renamed from: g, reason: collision with root package name */
        private String f31537g;

        @Override // e1.AbstractC2786d.a
        public AbstractC2786d a() {
            String str = "";
            if (this.f31532b == null) {
                str = " registrationStatus";
            }
            if (this.f31535e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f31536f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C2783a(this.f31531a, this.f31532b, this.f31533c, this.f31534d, this.f31535e.longValue(), this.f31536f.longValue(), this.f31537g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e1.AbstractC2786d.a
        public AbstractC2786d.a b(String str) {
            this.f31533c = str;
            return this;
        }

        @Override // e1.AbstractC2786d.a
        public AbstractC2786d.a c(long j8) {
            this.f31535e = Long.valueOf(j8);
            return this;
        }

        @Override // e1.AbstractC2786d.a
        public AbstractC2786d.a d(String str) {
            this.f31531a = str;
            return this;
        }

        @Override // e1.AbstractC2786d.a
        public AbstractC2786d.a e(String str) {
            this.f31537g = str;
            return this;
        }

        @Override // e1.AbstractC2786d.a
        public AbstractC2786d.a f(String str) {
            this.f31534d = str;
            return this;
        }

        @Override // e1.AbstractC2786d.a
        public AbstractC2786d.a g(C2785c.a aVar) {
            if (aVar != null) {
                this.f31532b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // e1.AbstractC2786d.a
        public AbstractC2786d.a h(long j8) {
            this.f31536f = Long.valueOf(j8);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC2786d abstractC2786d) {
            this.f31531a = abstractC2786d.d();
            this.f31532b = abstractC2786d.g();
            this.f31533c = abstractC2786d.b();
            this.f31534d = abstractC2786d.f();
            this.f31535e = Long.valueOf(abstractC2786d.c());
            this.f31536f = Long.valueOf(abstractC2786d.h());
            this.f31537g = abstractC2786d.e();
        }
    }

    @Override // e1.AbstractC2786d
    public String b() {
        return this.f31526d;
    }

    @Override // e1.AbstractC2786d
    public long c() {
        return this.f31528f;
    }

    @Override // e1.AbstractC2786d
    public String d() {
        return this.f31524b;
    }

    @Override // e1.AbstractC2786d
    public String e() {
        return this.f31530h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2786d)) {
            return false;
        }
        AbstractC2786d abstractC2786d = (AbstractC2786d) obj;
        String str3 = this.f31524b;
        if (str3 != null ? str3.equals(abstractC2786d.d()) : abstractC2786d.d() == null) {
            if (this.f31525c.equals(abstractC2786d.g()) && ((str = this.f31526d) != null ? str.equals(abstractC2786d.b()) : abstractC2786d.b() == null) && ((str2 = this.f31527e) != null ? str2.equals(abstractC2786d.f()) : abstractC2786d.f() == null) && this.f31528f == abstractC2786d.c() && this.f31529g == abstractC2786d.h()) {
                String str4 = this.f31530h;
                if (str4 == null) {
                    if (abstractC2786d.e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC2786d.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e1.AbstractC2786d
    public String f() {
        return this.f31527e;
    }

    @Override // e1.AbstractC2786d
    public C2785c.a g() {
        return this.f31525c;
    }

    @Override // e1.AbstractC2786d
    public long h() {
        return this.f31529g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f31524b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f31525c.hashCode()) * 1000003;
        String str2 = this.f31526d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f31527e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i10 = (i9 ^ hashCode3) * 1000003;
        long j8 = this.f31528f;
        int i11 = (i10 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f31529g;
        int i12 = (i11 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str4 = this.f31530h;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return i12 ^ i8;
    }

    @Override // e1.AbstractC2786d
    public AbstractC2786d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f31524b + ", registrationStatus=" + this.f31525c + ", authToken=" + this.f31526d + ", refreshToken=" + this.f31527e + ", expiresInSecs=" + this.f31528f + ", tokenCreationEpochInSecs=" + this.f31529g + ", fisError=" + this.f31530h + "}";
    }

    private C2783a(String str, C2785c.a aVar, String str2, String str3, long j8, long j9, String str4) {
        this.f31524b = str;
        this.f31525c = aVar;
        this.f31526d = str2;
        this.f31527e = str3;
        this.f31528f = j8;
        this.f31529g = j9;
        this.f31530h = str4;
    }
}
