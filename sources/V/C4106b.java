package v;

import v.AbstractC4111g;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4106b extends AbstractC4111g {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4111g.a f40393a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40394b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4106b(AbstractC4111g.a aVar, long j8) {
        if (aVar != null) {
            this.f40393a = aVar;
            this.f40394b = j8;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // v.AbstractC4111g
    public long b() {
        return this.f40394b;
    }

    @Override // v.AbstractC4111g
    public AbstractC4111g.a c() {
        return this.f40393a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4111g)) {
            return false;
        }
        AbstractC4111g abstractC4111g = (AbstractC4111g) obj;
        if (this.f40393a.equals(abstractC4111g.c()) && this.f40394b == abstractC4111g.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f40393a.hashCode() ^ 1000003) * 1000003;
        long j8 = this.f40394b;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f40393a + ", nextRequestWaitMillis=" + this.f40394b + "}";
    }
}
