package t;

import t.r;

/* loaded from: classes3.dex */
final class h extends r {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f39321a;

    /* loaded from: classes3.dex */
    static final class b extends r.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f39322a;

        @Override // t.r.a
        public r a() {
            return new h(this.f39322a);
        }

        @Override // t.r.a
        public r.a b(Integer num) {
            this.f39322a = num;
            return this;
        }
    }

    @Override // t.r
    public Integer b() {
        return this.f39321a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f39321a;
        Integer b9 = ((r) obj).b();
        if (num == null) {
            if (b9 == null) {
                return true;
            }
            return false;
        }
        return num.equals(b9);
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f39321a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f39321a + "}";
    }

    private h(Integer num) {
        this.f39321a = num;
    }
}
