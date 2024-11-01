package C;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0958b extends AbstractC0967k {

    /* renamed from: a, reason: collision with root package name */
    private final long f671a;

    /* renamed from: b, reason: collision with root package name */
    private final u.p f672b;

    /* renamed from: c, reason: collision with root package name */
    private final u.i f673c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0958b(long j8, u.p pVar, u.i iVar) {
        this.f671a = j8;
        if (pVar != null) {
            this.f672b = pVar;
            if (iVar != null) {
                this.f673c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // C.AbstractC0967k
    public u.i b() {
        return this.f673c;
    }

    @Override // C.AbstractC0967k
    public long c() {
        return this.f671a;
    }

    @Override // C.AbstractC0967k
    public u.p d() {
        return this.f672b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0967k)) {
            return false;
        }
        AbstractC0967k abstractC0967k = (AbstractC0967k) obj;
        if (this.f671a == abstractC0967k.c() && this.f672b.equals(abstractC0967k.d()) && this.f673c.equals(abstractC0967k.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j8 = this.f671a;
        return this.f673c.hashCode() ^ ((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.f672b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f671a + ", transportContext=" + this.f672b + ", event=" + this.f673c + "}";
    }
}
