package M0;

import M0.F;

/* renamed from: M0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1335e extends F.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5716a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5717b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0.e$b */
    /* loaded from: classes3.dex */
    public static final class b extends F.c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5718a;

        /* renamed from: b, reason: collision with root package name */
        private String f5719b;

        @Override // M0.F.c.a
        public F.c a() {
            String str;
            String str2 = this.f5718a;
            if (str2 != null && (str = this.f5719b) != null) {
                return new C1335e(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f5718a == null) {
                sb.append(" key");
            }
            if (this.f5719b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // M0.F.c.a
        public F.c.a b(String str) {
            if (str != null) {
                this.f5718a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // M0.F.c.a
        public F.c.a c(String str) {
            if (str != null) {
                this.f5719b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @Override // M0.F.c
    public String b() {
        return this.f5716a;
    }

    @Override // M0.F.c
    public String c() {
        return this.f5717b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.c)) {
            return false;
        }
        F.c cVar = (F.c) obj;
        if (this.f5716a.equals(cVar.b()) && this.f5717b.equals(cVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5716a.hashCode() ^ 1000003) * 1000003) ^ this.f5717b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f5716a + ", value=" + this.f5717b + "}";
    }

    private C1335e(String str, String str2) {
        this.f5716a = str;
        this.f5717b = str2;
    }
}
