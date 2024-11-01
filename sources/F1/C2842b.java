package f1;

import f1.AbstractC2846f;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2842b extends AbstractC2846f {

    /* renamed from: a, reason: collision with root package name */
    private final String f31828a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31829b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2846f.b f31830c;

    /* renamed from: f1.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0732b extends AbstractC2846f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f31831a;

        /* renamed from: b, reason: collision with root package name */
        private Long f31832b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC2846f.b f31833c;

        @Override // f1.AbstractC2846f.a
        public AbstractC2846f a() {
            String str = "";
            if (this.f31832b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2842b(this.f31831a, this.f31832b.longValue(), this.f31833c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.AbstractC2846f.a
        public AbstractC2846f.a b(AbstractC2846f.b bVar) {
            this.f31833c = bVar;
            return this;
        }

        @Override // f1.AbstractC2846f.a
        public AbstractC2846f.a c(String str) {
            this.f31831a = str;
            return this;
        }

        @Override // f1.AbstractC2846f.a
        public AbstractC2846f.a d(long j8) {
            this.f31832b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // f1.AbstractC2846f
    public AbstractC2846f.b b() {
        return this.f31830c;
    }

    @Override // f1.AbstractC2846f
    public String c() {
        return this.f31828a;
    }

    @Override // f1.AbstractC2846f
    public long d() {
        return this.f31829b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2846f)) {
            return false;
        }
        AbstractC2846f abstractC2846f = (AbstractC2846f) obj;
        String str = this.f31828a;
        if (str != null ? str.equals(abstractC2846f.c()) : abstractC2846f.c() == null) {
            if (this.f31829b == abstractC2846f.d()) {
                AbstractC2846f.b bVar = this.f31830c;
                if (bVar == null) {
                    if (abstractC2846f.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(abstractC2846f.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f31828a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j8 = this.f31829b;
        int i9 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        AbstractC2846f.b bVar = this.f31830c;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "TokenResult{token=" + this.f31828a + ", tokenExpirationTimestamp=" + this.f31829b + ", responseCode=" + this.f31830c + "}";
    }

    private C2842b(String str, long j8, AbstractC2846f.b bVar) {
        this.f31828a = str;
        this.f31829b = j8;
        this.f31830c = bVar;
    }
}
