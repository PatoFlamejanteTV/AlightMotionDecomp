package M0;

import M0.G;

/* loaded from: classes3.dex */
final class C extends G.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5500a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5501b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5502c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5503d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5504e;

    /* renamed from: f, reason: collision with root package name */
    private final G0.f f5505f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(String str, String str2, String str3, String str4, int i8, G0.f fVar) {
        if (str != null) {
            this.f5500a = str;
            if (str2 != null) {
                this.f5501b = str2;
                if (str3 != null) {
                    this.f5502c = str3;
                    if (str4 != null) {
                        this.f5503d = str4;
                        this.f5504e = i8;
                        if (fVar != null) {
                            this.f5505f = fVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // M0.G.a
    public String a() {
        return this.f5500a;
    }

    @Override // M0.G.a
    public int c() {
        return this.f5504e;
    }

    @Override // M0.G.a
    public G0.f d() {
        return this.f5505f;
    }

    @Override // M0.G.a
    public String e() {
        return this.f5503d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.a)) {
            return false;
        }
        G.a aVar = (G.a) obj;
        if (this.f5500a.equals(aVar.a()) && this.f5501b.equals(aVar.f()) && this.f5502c.equals(aVar.g()) && this.f5503d.equals(aVar.e()) && this.f5504e == aVar.c() && this.f5505f.equals(aVar.d())) {
            return true;
        }
        return false;
    }

    @Override // M0.G.a
    public String f() {
        return this.f5501b;
    }

    @Override // M0.G.a
    public String g() {
        return this.f5502c;
    }

    public int hashCode() {
        return ((((((((((this.f5500a.hashCode() ^ 1000003) * 1000003) ^ this.f5501b.hashCode()) * 1000003) ^ this.f5502c.hashCode()) * 1000003) ^ this.f5503d.hashCode()) * 1000003) ^ this.f5504e) * 1000003) ^ this.f5505f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f5500a + ", versionCode=" + this.f5501b + ", versionName=" + this.f5502c + ", installUuid=" + this.f5503d + ", deliveryMechanism=" + this.f5504e + ", developmentPlatformProvider=" + this.f5505f + "}";
    }
}
