package M0;

import M0.F;

/* loaded from: classes3.dex */
final class v extends F.e.d.AbstractC0106d {

    /* renamed from: a, reason: collision with root package name */
    private final String f5889a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.AbstractC0106d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5890a;

        @Override // M0.F.e.d.AbstractC0106d.a
        public F.e.d.AbstractC0106d a() {
            String str = this.f5890a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // M0.F.e.d.AbstractC0106d.a
        public F.e.d.AbstractC0106d.a b(String str) {
            if (str != null) {
                this.f5890a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @Override // M0.F.e.d.AbstractC0106d
    public String b() {
        return this.f5889a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0106d) {
            return this.f5889a.equals(((F.e.d.AbstractC0106d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f5889a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f5889a + "}";
    }

    private v(String str) {
        this.f5889a = str;
    }
}
