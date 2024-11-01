package M0;

import M0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class n extends F.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final List f5812a;

    /* renamed from: b, reason: collision with root package name */
    private final F.e.d.a.b.c f5813b;

    /* renamed from: c, reason: collision with root package name */
    private final F.a f5814c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.AbstractC0099d f5815d;

    /* renamed from: e, reason: collision with root package name */
    private final List f5816e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.b.AbstractC0097b {

        /* renamed from: a, reason: collision with root package name */
        private List f5817a;

        /* renamed from: b, reason: collision with root package name */
        private F.e.d.a.b.c f5818b;

        /* renamed from: c, reason: collision with root package name */
        private F.a f5819c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.AbstractC0099d f5820d;

        /* renamed from: e, reason: collision with root package name */
        private List f5821e;

        @Override // M0.F.e.d.a.b.AbstractC0097b
        public F.e.d.a.b a() {
            List list;
            F.e.d.a.b.AbstractC0099d abstractC0099d = this.f5820d;
            if (abstractC0099d != null && (list = this.f5821e) != null) {
                return new n(this.f5817a, this.f5818b, this.f5819c, abstractC0099d, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5820d == null) {
                sb.append(" signal");
            }
            if (this.f5821e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.a.b.AbstractC0097b
        public F.e.d.a.b.AbstractC0097b b(F.a aVar) {
            this.f5819c = aVar;
            return this;
        }

        @Override // M0.F.e.d.a.b.AbstractC0097b
        public F.e.d.a.b.AbstractC0097b c(List list) {
            if (list != null) {
                this.f5821e = list;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // M0.F.e.d.a.b.AbstractC0097b
        public F.e.d.a.b.AbstractC0097b d(F.e.d.a.b.c cVar) {
            this.f5818b = cVar;
            return this;
        }

        @Override // M0.F.e.d.a.b.AbstractC0097b
        public F.e.d.a.b.AbstractC0097b e(F.e.d.a.b.AbstractC0099d abstractC0099d) {
            if (abstractC0099d != null) {
                this.f5820d = abstractC0099d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // M0.F.e.d.a.b.AbstractC0097b
        public F.e.d.a.b.AbstractC0097b f(List list) {
            this.f5817a = list;
            return this;
        }
    }

    @Override // M0.F.e.d.a.b
    public F.a b() {
        return this.f5814c;
    }

    @Override // M0.F.e.d.a.b
    public List c() {
        return this.f5816e;
    }

    @Override // M0.F.e.d.a.b
    public F.e.d.a.b.c d() {
        return this.f5813b;
    }

    @Override // M0.F.e.d.a.b
    public F.e.d.a.b.AbstractC0099d e() {
        return this.f5815d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b)) {
            return false;
        }
        F.e.d.a.b bVar = (F.e.d.a.b) obj;
        List list = this.f5812a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            F.e.d.a.b.c cVar = this.f5813b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                F.a aVar = this.f5814c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f5815d.equals(bVar.e()) && this.f5816e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // M0.F.e.d.a.b
    public List f() {
        return this.f5812a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        List list = this.f5812a;
        int i8 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i9 = (hashCode ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.f5813b;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        F.a aVar = this.f5814c;
        if (aVar != null) {
            i8 = aVar.hashCode();
        }
        return ((((i10 ^ i8) * 1000003) ^ this.f5815d.hashCode()) * 1000003) ^ this.f5816e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f5812a + ", exception=" + this.f5813b + ", appExitInfo=" + this.f5814c + ", signal=" + this.f5815d + ", binaries=" + this.f5816e + "}";
    }

    private n(List list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.AbstractC0099d abstractC0099d, List list2) {
        this.f5812a = list;
        this.f5813b = cVar;
        this.f5814c = aVar;
        this.f5815d = abstractC0099d;
        this.f5816e = list2;
    }
}
