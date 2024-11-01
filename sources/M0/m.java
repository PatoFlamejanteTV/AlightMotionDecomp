package M0;

import M0.F;
import java.util.List;

/* loaded from: classes3.dex */
final class m extends F.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final F.e.d.a.b f5797a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5798b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5799c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f5800d;

    /* renamed from: e, reason: collision with root package name */
    private final F.e.d.a.c f5801e;

    /* renamed from: f, reason: collision with root package name */
    private final List f5802f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5803g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends F.e.d.a.AbstractC0094a {

        /* renamed from: a, reason: collision with root package name */
        private F.e.d.a.b f5804a;

        /* renamed from: b, reason: collision with root package name */
        private List f5805b;

        /* renamed from: c, reason: collision with root package name */
        private List f5806c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f5807d;

        /* renamed from: e, reason: collision with root package name */
        private F.e.d.a.c f5808e;

        /* renamed from: f, reason: collision with root package name */
        private List f5809f;

        /* renamed from: g, reason: collision with root package name */
        private int f5810g;

        /* renamed from: h, reason: collision with root package name */
        private byte f5811h;

        @Override // M0.F.e.d.a.AbstractC0094a
        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.f5811h == 1 && (bVar = this.f5804a) != null) {
                return new m(bVar, this.f5805b, this.f5806c, this.f5807d, this.f5808e, this.f5809f, this.f5810g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5804a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f5811h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.e.d.a.AbstractC0094a
        public F.e.d.a.AbstractC0094a b(List list) {
            this.f5809f = list;
            return this;
        }

        @Override // M0.F.e.d.a.AbstractC0094a
        public F.e.d.a.AbstractC0094a c(Boolean bool) {
            this.f5807d = bool;
            return this;
        }

        @Override // M0.F.e.d.a.AbstractC0094a
        public F.e.d.a.AbstractC0094a d(F.e.d.a.c cVar) {
            this.f5808e = cVar;
            return this;
        }

        @Override // M0.F.e.d.a.AbstractC0094a
        public F.e.d.a.AbstractC0094a e(List list) {
            this.f5805b = list;
            return this;
        }

        @Override // M0.F.e.d.a.AbstractC0094a
        public F.e.d.a.AbstractC0094a f(F.e.d.a.b bVar) {
            if (bVar != null) {
                this.f5804a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // M0.F.e.d.a.AbstractC0094a
        public F.e.d.a.AbstractC0094a g(List list) {
            this.f5806c = list;
            return this;
        }

        @Override // M0.F.e.d.a.AbstractC0094a
        public F.e.d.a.AbstractC0094a h(int i8) {
            this.f5810g = i8;
            this.f5811h = (byte) (this.f5811h | 1);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(F.e.d.a aVar) {
            this.f5804a = aVar.f();
            this.f5805b = aVar.e();
            this.f5806c = aVar.g();
            this.f5807d = aVar.c();
            this.f5808e = aVar.d();
            this.f5809f = aVar.b();
            this.f5810g = aVar.h();
            this.f5811h = (byte) 1;
        }
    }

    @Override // M0.F.e.d.a
    public List b() {
        return this.f5802f;
    }

    @Override // M0.F.e.d.a
    public Boolean c() {
        return this.f5800d;
    }

    @Override // M0.F.e.d.a
    public F.e.d.a.c d() {
        return this.f5801e;
    }

    @Override // M0.F.e.d.a
    public List e() {
        return this.f5798b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        F.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a)) {
            return false;
        }
        F.e.d.a aVar = (F.e.d.a) obj;
        if (this.f5797a.equals(aVar.f()) && ((list = this.f5798b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f5799c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f5800d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f5801e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f5802f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f5803g == aVar.h()) {
            return true;
        }
        return false;
    }

    @Override // M0.F.e.d.a
    public F.e.d.a.b f() {
        return this.f5797a;
    }

    @Override // M0.F.e.d.a
    public List g() {
        return this.f5799c;
    }

    @Override // M0.F.e.d.a
    public int h() {
        return this.f5803g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f5797a.hashCode() ^ 1000003) * 1000003;
        List list = this.f5798b;
        int i8 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i9 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f5799c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        Boolean bool = this.f5800d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        F.e.d.a.c cVar = this.f5801e;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        List list3 = this.f5802f;
        if (list3 != null) {
            i8 = list3.hashCode();
        }
        return ((i12 ^ i8) * 1000003) ^ this.f5803g;
    }

    @Override // M0.F.e.d.a
    public F.e.d.a.AbstractC0094a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f5797a + ", customAttributes=" + this.f5798b + ", internalKeys=" + this.f5799c + ", background=" + this.f5800d + ", currentProcessDetails=" + this.f5801e + ", appProcessDetails=" + this.f5802f + ", uiOrientation=" + this.f5803g + "}";
    }

    private m(F.e.d.a.b bVar, List list, List list2, Boolean bool, F.e.d.a.c cVar, List list3, int i8) {
        this.f5797a = bVar;
        this.f5798b = list;
        this.f5799c = list2;
        this.f5800d = bool;
        this.f5801e = cVar;
        this.f5802f = list3;
        this.f5803g = i8;
    }
}
