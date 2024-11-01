package k1;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3224a extends AbstractC3229f {

    /* renamed from: a, reason: collision with root package name */
    private final String f34371a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34372b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3224a(String str, String str2) {
        if (str != null) {
            this.f34371a = str;
            if (str2 != null) {
                this.f34372b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // k1.AbstractC3229f
    public String b() {
        return this.f34371a;
    }

    @Override // k1.AbstractC3229f
    public String c() {
        return this.f34372b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3229f)) {
            return false;
        }
        AbstractC3229f abstractC3229f = (AbstractC3229f) obj;
        if (this.f34371a.equals(abstractC3229f.b()) && this.f34372b.equals(abstractC3229f.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f34371a.hashCode() ^ 1000003) * 1000003) ^ this.f34372b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f34371a + ", version=" + this.f34372b + "}";
    }
}
