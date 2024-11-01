package L0;

/* loaded from: classes3.dex */
final class b extends i {

    /* renamed from: b, reason: collision with root package name */
    private final String f5228b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5229c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5230d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5231e;

    /* renamed from: f, reason: collision with root package name */
    private final long f5232f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, String str2, String str3, String str4, long j8) {
        if (str != null) {
            this.f5228b = str;
            if (str2 != null) {
                this.f5229c = str2;
                if (str3 != null) {
                    this.f5230d = str3;
                    if (str4 != null) {
                        this.f5231e = str4;
                        this.f5232f = j8;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    @Override // L0.i
    public String c() {
        return this.f5229c;
    }

    @Override // L0.i
    public String d() {
        return this.f5230d;
    }

    @Override // L0.i
    public String e() {
        return this.f5228b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f5228b.equals(iVar.e()) && this.f5229c.equals(iVar.c()) && this.f5230d.equals(iVar.d()) && this.f5231e.equals(iVar.g()) && this.f5232f == iVar.f()) {
            return true;
        }
        return false;
    }

    @Override // L0.i
    public long f() {
        return this.f5232f;
    }

    @Override // L0.i
    public String g() {
        return this.f5231e;
    }

    public int hashCode() {
        int hashCode = (((((((this.f5228b.hashCode() ^ 1000003) * 1000003) ^ this.f5229c.hashCode()) * 1000003) ^ this.f5230d.hashCode()) * 1000003) ^ this.f5231e.hashCode()) * 1000003;
        long j8 = this.f5232f;
        return hashCode ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f5228b + ", parameterKey=" + this.f5229c + ", parameterValue=" + this.f5230d + ", variantId=" + this.f5231e + ", templateVersion=" + this.f5232f + "}";
    }
}
