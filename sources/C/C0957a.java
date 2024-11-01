package C;

import C.AbstractC0961e;

/* renamed from: C.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0957a extends AbstractC0961e {

    /* renamed from: b, reason: collision with root package name */
    private final long f661b;

    /* renamed from: c, reason: collision with root package name */
    private final int f662c;

    /* renamed from: d, reason: collision with root package name */
    private final int f663d;

    /* renamed from: e, reason: collision with root package name */
    private final long f664e;

    /* renamed from: f, reason: collision with root package name */
    private final int f665f;

    /* renamed from: C.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC0961e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f666a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f667b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f668c;

        /* renamed from: d, reason: collision with root package name */
        private Long f669d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f670e;

        @Override // C.AbstractC0961e.a
        AbstractC0961e a() {
            String str = "";
            if (this.f666a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f667b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f668c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f669d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f670e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0957a(this.f666a.longValue(), this.f667b.intValue(), this.f668c.intValue(), this.f669d.longValue(), this.f670e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // C.AbstractC0961e.a
        AbstractC0961e.a b(int i8) {
            this.f668c = Integer.valueOf(i8);
            return this;
        }

        @Override // C.AbstractC0961e.a
        AbstractC0961e.a c(long j8) {
            this.f669d = Long.valueOf(j8);
            return this;
        }

        @Override // C.AbstractC0961e.a
        AbstractC0961e.a d(int i8) {
            this.f667b = Integer.valueOf(i8);
            return this;
        }

        @Override // C.AbstractC0961e.a
        AbstractC0961e.a e(int i8) {
            this.f670e = Integer.valueOf(i8);
            return this;
        }

        @Override // C.AbstractC0961e.a
        AbstractC0961e.a f(long j8) {
            this.f666a = Long.valueOf(j8);
            return this;
        }
    }

    @Override // C.AbstractC0961e
    int b() {
        return this.f663d;
    }

    @Override // C.AbstractC0961e
    long c() {
        return this.f664e;
    }

    @Override // C.AbstractC0961e
    int d() {
        return this.f662c;
    }

    @Override // C.AbstractC0961e
    int e() {
        return this.f665f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0961e)) {
            return false;
        }
        AbstractC0961e abstractC0961e = (AbstractC0961e) obj;
        if (this.f661b == abstractC0961e.f() && this.f662c == abstractC0961e.d() && this.f663d == abstractC0961e.b() && this.f664e == abstractC0961e.c() && this.f665f == abstractC0961e.e()) {
            return true;
        }
        return false;
    }

    @Override // C.AbstractC0961e
    long f() {
        return this.f661b;
    }

    public int hashCode() {
        long j8 = this.f661b;
        int i8 = (((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f662c) * 1000003) ^ this.f663d) * 1000003;
        long j9 = this.f664e;
        return this.f665f ^ ((i8 ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f661b + ", loadBatchSize=" + this.f662c + ", criticalSectionEnterTimeoutMs=" + this.f663d + ", eventCleanUpAge=" + this.f664e + ", maxBlobByteSizePerRow=" + this.f665f + "}";
    }

    private C0957a(long j8, int i8, int i9, long j9, int i10) {
        this.f661b = j8;
        this.f662c = i8;
        this.f663d = i9;
        this.f664e = j9;
        this.f665f = i10;
    }
}
