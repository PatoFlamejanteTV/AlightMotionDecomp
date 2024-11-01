package M0;

import M0.F;

/* loaded from: classes3.dex */
final class z extends F.e.AbstractC0108e {

    /* renamed from: a, reason: collision with root package name */
    private final int f5906a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5907b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5908c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5909d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.AbstractC0108e.a {

        /* renamed from: a, reason: collision with root package name */
        private int f5910a;

        /* renamed from: b, reason: collision with root package name */
        private String f5911b;

        /* renamed from: c, reason: collision with root package name */
        private String f5912c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f5913d;

        /* renamed from: e, reason: collision with root package name */
        private byte f5914e;

        @Override // M0.F.e.AbstractC0108e.a
        public F.e.AbstractC0108e a() {
            String str;
            String str2;
            if (this.f5914e == 3 && (str = this.f5911b) != null && (str2 = this.f5912c) != null) {
                return new z(this.f5910a, str, str2, this.f5913d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f5914e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f5911b == null) {
                sb.append(" version");
            }
            if (this.f5912c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f5914e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.AbstractC0108e.a
        public F.e.AbstractC0108e.a b(String str) {
            if (str != null) {
                this.f5912c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // M0.F.e.AbstractC0108e.a
        public F.e.AbstractC0108e.a c(boolean z8) {
            this.f5913d = z8;
            this.f5914e = (byte) (this.f5914e | 2);
            return this;
        }

        @Override // M0.F.e.AbstractC0108e.a
        public F.e.AbstractC0108e.a d(int i8) {
            this.f5910a = i8;
            this.f5914e = (byte) (this.f5914e | 1);
            return this;
        }

        @Override // M0.F.e.AbstractC0108e.a
        public F.e.AbstractC0108e.a e(String str) {
            if (str != null) {
                this.f5911b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // M0.F.e.AbstractC0108e
    public String b() {
        return this.f5908c;
    }

    @Override // M0.F.e.AbstractC0108e
    public int c() {
        return this.f5906a;
    }

    @Override // M0.F.e.AbstractC0108e
    public String d() {
        return this.f5907b;
    }

    @Override // M0.F.e.AbstractC0108e
    public boolean e() {
        return this.f5909d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.AbstractC0108e)) {
            return false;
        }
        F.e.AbstractC0108e abstractC0108e = (F.e.AbstractC0108e) obj;
        if (this.f5906a == abstractC0108e.c() && this.f5907b.equals(abstractC0108e.d()) && this.f5908c.equals(abstractC0108e.b()) && this.f5909d == abstractC0108e.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f5906a ^ 1000003) * 1000003) ^ this.f5907b.hashCode()) * 1000003) ^ this.f5908c.hashCode()) * 1000003;
        if (this.f5909d) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return hashCode ^ i8;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f5906a + ", version=" + this.f5907b + ", buildVersion=" + this.f5908c + ", jailbroken=" + this.f5909d + "}";
    }

    private z(int i8, String str, String str2, boolean z8) {
        this.f5906a = i8;
        this.f5907b = str;
        this.f5908c = str2;
        this.f5909d = z8;
    }
}
