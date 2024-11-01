package B;

import B.f;
import java.util.Set;

/* loaded from: classes3.dex */
final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f298a;

    /* renamed from: b, reason: collision with root package name */
    private final long f299b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f300c;

    /* loaded from: classes3.dex */
    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f301a;

        /* renamed from: b, reason: collision with root package name */
        private Long f302b;

        /* renamed from: c, reason: collision with root package name */
        private Set f303c;

        @Override // B.f.b.a
        public f.b a() {
            String str = "";
            if (this.f301a == null) {
                str = " delta";
            }
            if (this.f302b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f303c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f301a.longValue(), this.f302b.longValue(), this.f303c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // B.f.b.a
        public f.b.a b(long j8) {
            this.f301a = Long.valueOf(j8);
            return this;
        }

        @Override // B.f.b.a
        public f.b.a c(Set set) {
            if (set != null) {
                this.f303c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // B.f.b.a
        public f.b.a d(long j8) {
            this.f302b = Long.valueOf(j8);
            return this;
        }
    }

    @Override // B.f.b
    long b() {
        return this.f298a;
    }

    @Override // B.f.b
    Set c() {
        return this.f300c;
    }

    @Override // B.f.b
    long d() {
        return this.f299b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        if (this.f298a == bVar.b() && this.f299b == bVar.d() && this.f300c.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f298a;
        int i8 = (((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003;
        long j9 = this.f299b;
        return this.f300c.hashCode() ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f298a + ", maxAllowedDelay=" + this.f299b + ", flags=" + this.f300c + "}";
    }

    private c(long j8, long j9, Set set) {
        this.f298a = j8;
        this.f299b = j9;
        this.f300c = set;
    }
}
