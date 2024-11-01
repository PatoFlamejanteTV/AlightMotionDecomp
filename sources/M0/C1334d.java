package M0;

import M0.F;

/* renamed from: M0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1334d extends F.a.AbstractC0091a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5710a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5711b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5712c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0.d$b */
    /* loaded from: classes3.dex */
    public static final class b extends F.a.AbstractC0091a.AbstractC0092a {

        /* renamed from: a, reason: collision with root package name */
        private String f5713a;

        /* renamed from: b, reason: collision with root package name */
        private String f5714b;

        /* renamed from: c, reason: collision with root package name */
        private String f5715c;

        @Override // M0.F.a.AbstractC0091a.AbstractC0092a
        public F.a.AbstractC0091a a() {
            String str;
            String str2;
            String str3 = this.f5713a;
            if (str3 != null && (str = this.f5714b) != null && (str2 = this.f5715c) != null) {
                return new C1334d(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5713a == null) {
                sb.append(" arch");
            }
            if (this.f5714b == null) {
                sb.append(" libraryName");
            }
            if (this.f5715c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.a.AbstractC0091a.AbstractC0092a
        public F.a.AbstractC0091a.AbstractC0092a b(String str) {
            if (str != null) {
                this.f5713a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // M0.F.a.AbstractC0091a.AbstractC0092a
        public F.a.AbstractC0091a.AbstractC0092a c(String str) {
            if (str != null) {
                this.f5715c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // M0.F.a.AbstractC0091a.AbstractC0092a
        public F.a.AbstractC0091a.AbstractC0092a d(String str) {
            if (str != null) {
                this.f5714b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    @Override // M0.F.a.AbstractC0091a
    public String b() {
        return this.f5710a;
    }

    @Override // M0.F.a.AbstractC0091a
    public String c() {
        return this.f5712c;
    }

    @Override // M0.F.a.AbstractC0091a
    public String d() {
        return this.f5711b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a.AbstractC0091a)) {
            return false;
        }
        F.a.AbstractC0091a abstractC0091a = (F.a.AbstractC0091a) obj;
        if (this.f5710a.equals(abstractC0091a.b()) && this.f5711b.equals(abstractC0091a.d()) && this.f5712c.equals(abstractC0091a.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5710a.hashCode() ^ 1000003) * 1000003) ^ this.f5711b.hashCode()) * 1000003) ^ this.f5712c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f5710a + ", libraryName=" + this.f5711b + ", buildId=" + this.f5712c + "}";
    }

    private C1334d(String str, String str2, String str3) {
        this.f5710a = str;
        this.f5711b = str2;
        this.f5712c = str3;
    }
}
