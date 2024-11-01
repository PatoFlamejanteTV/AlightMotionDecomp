package t;

import t.s;

/* loaded from: classes3.dex */
final class i extends s {

    /* renamed from: a, reason: collision with root package name */
    private final r f39323a;

    /* loaded from: classes3.dex */
    static final class b extends s.a {

        /* renamed from: a, reason: collision with root package name */
        private r f39324a;

        @Override // t.s.a
        public s a() {
            return new i(this.f39324a);
        }

        @Override // t.s.a
        public s.a b(r rVar) {
            this.f39324a = rVar;
            return this;
        }
    }

    @Override // t.s
    public r b() {
        return this.f39323a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f39323a;
        r b9 = ((s) obj).b();
        if (rVar == null) {
            if (b9 == null) {
                return true;
            }
            return false;
        }
        return rVar.equals(b9);
    }

    public int hashCode() {
        int hashCode;
        r rVar = this.f39323a;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f39323a + "}";
    }

    private i(r rVar) {
        this.f39323a = rVar;
    }
}
