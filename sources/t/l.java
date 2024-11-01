package t;

/* loaded from: classes3.dex */
final class l extends v {

    /* renamed from: a, reason: collision with root package name */
    private final long f39357a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(long j8) {
        this.f39357a = j8;
    }

    @Override // t.v
    public long c() {
        return this.f39357a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v) && this.f39357a == ((v) obj).c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f39357a;
        return 1000003 ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f39357a + "}";
    }
}
