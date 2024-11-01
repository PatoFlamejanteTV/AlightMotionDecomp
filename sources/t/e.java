package t;

import t.o;

/* loaded from: classes3.dex */
final class e extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.b f39309a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4000a f39310b;

    /* loaded from: classes3.dex */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.b f39311a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC4000a f39312b;

        @Override // t.o.a
        public o a() {
            return new e(this.f39311a, this.f39312b);
        }

        @Override // t.o.a
        public o.a b(AbstractC4000a abstractC4000a) {
            this.f39312b = abstractC4000a;
            return this;
        }

        @Override // t.o.a
        public o.a c(o.b bVar) {
            this.f39311a = bVar;
            return this;
        }
    }

    @Override // t.o
    public AbstractC4000a b() {
        return this.f39310b;
    }

    @Override // t.o
    public o.b c() {
        return this.f39309a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f39309a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            AbstractC4000a abstractC4000a = this.f39310b;
            if (abstractC4000a == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (abstractC4000a.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        o.b bVar = this.f39309a;
        int i8 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        AbstractC4000a abstractC4000a = this.f39310b;
        if (abstractC4000a != null) {
            i8 = abstractC4000a.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f39309a + ", androidClientInfo=" + this.f39310b + "}";
    }

    private e(o.b bVar, AbstractC4000a abstractC4000a) {
        this.f39309a = bVar;
        this.f39310b = abstractC4000a;
    }
}
