package t;

import t.p;

/* loaded from: classes3.dex */
final class f extends p {

    /* renamed from: a, reason: collision with root package name */
    private final s f39313a;

    /* renamed from: b, reason: collision with root package name */
    private final p.b f39314b;

    /* loaded from: classes3.dex */
    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private s f39315a;

        /* renamed from: b, reason: collision with root package name */
        private p.b f39316b;

        @Override // t.p.a
        public p a() {
            return new f(this.f39315a, this.f39316b);
        }

        @Override // t.p.a
        public p.a b(s sVar) {
            this.f39315a = sVar;
            return this;
        }

        @Override // t.p.a
        public p.a c(p.b bVar) {
            this.f39316b = bVar;
            return this;
        }
    }

    @Override // t.p
    public s b() {
        return this.f39313a;
    }

    @Override // t.p
    public p.b c() {
        return this.f39314b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        s sVar = this.f39313a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            p.b bVar = this.f39314b;
            if (bVar == null) {
                if (pVar.c() == null) {
                    return true;
                }
            } else if (bVar.equals(pVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        s sVar = this.f39313a;
        int i8 = 0;
        if (sVar == null) {
            hashCode = 0;
        } else {
            hashCode = sVar.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        p.b bVar = this.f39314b;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f39313a + ", productIdOrigin=" + this.f39314b + "}";
    }

    private f(s sVar, p.b bVar) {
        this.f39313a = sVar;
        this.f39314b = bVar;
    }
}
