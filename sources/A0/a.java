package A0;

/* loaded from: classes.dex */
final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    private final long f69a;

    /* renamed from: b, reason: collision with root package name */
    private final long f70b;

    /* renamed from: c, reason: collision with root package name */
    private final long f71c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j8, long j9, long j10) {
        this.f69a = j8;
        this.f70b = j9;
        this.f71c = j10;
    }

    @Override // A0.p
    public long b() {
        return this.f70b;
    }

    @Override // A0.p
    public long c() {
        return this.f69a;
    }

    @Override // A0.p
    public long d() {
        return this.f71c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f69a == pVar.c() && this.f70b == pVar.b() && this.f71c == pVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f69a;
        long j9 = this.f70b;
        int i8 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f71c;
        return ((int) ((j10 >>> 32) ^ j10)) ^ i8;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f69a + ", elapsedRealtime=" + this.f70b + ", uptimeMillis=" + this.f71c + "}";
    }
}
