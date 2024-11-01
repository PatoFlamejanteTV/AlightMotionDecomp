package M0;

import M0.F;

/* loaded from: classes3.dex */
final class x extends F.e.d.AbstractC0107e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f5900a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5901b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.AbstractC0107e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5902a;

        /* renamed from: b, reason: collision with root package name */
        private String f5903b;

        @Override // M0.F.e.d.AbstractC0107e.b.a
        public F.e.d.AbstractC0107e.b a() {
            String str;
            String str2 = this.f5902a;
            if (str2 != null && (str = this.f5903b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5902a == null) {
                sb.append(" rolloutId");
            }
            if (this.f5903b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.AbstractC0107e.b.a
        public F.e.d.AbstractC0107e.b.a b(String str) {
            if (str != null) {
                this.f5902a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override // M0.F.e.d.AbstractC0107e.b.a
        public F.e.d.AbstractC0107e.b.a c(String str) {
            if (str != null) {
                this.f5903b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    @Override // M0.F.e.d.AbstractC0107e.b
    public String b() {
        return this.f5900a;
    }

    @Override // M0.F.e.d.AbstractC0107e.b
    public String c() {
        return this.f5901b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.AbstractC0107e.b)) {
            return false;
        }
        F.e.d.AbstractC0107e.b bVar = (F.e.d.AbstractC0107e.b) obj;
        if (this.f5900a.equals(bVar.b()) && this.f5901b.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5900a.hashCode() ^ 1000003) * 1000003) ^ this.f5901b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f5900a + ", variantId=" + this.f5901b + "}";
    }

    private x(String str, String str2) {
        this.f5900a = str;
        this.f5901b = str2;
    }
}
