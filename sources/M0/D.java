package M0;

import M0.G;

/* loaded from: classes3.dex */
final class D extends G.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f5506a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5507b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5508c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5509d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5510e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5511f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5512g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5513h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5514i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(int i8, String str, int i9, long j8, long j9, boolean z8, int i10, String str2, String str3) {
        this.f5506a = i8;
        if (str != null) {
            this.f5507b = str;
            this.f5508c = i9;
            this.f5509d = j8;
            this.f5510e = j9;
            this.f5511f = z8;
            this.f5512g = i10;
            if (str2 != null) {
                this.f5513h = str2;
                if (str3 != null) {
                    this.f5514i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // M0.G.b
    public int a() {
        return this.f5506a;
    }

    @Override // M0.G.b
    public int b() {
        return this.f5508c;
    }

    @Override // M0.G.b
    public long d() {
        return this.f5510e;
    }

    @Override // M0.G.b
    public boolean e() {
        return this.f5511f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.b)) {
            return false;
        }
        G.b bVar = (G.b) obj;
        if (this.f5506a == bVar.a() && this.f5507b.equals(bVar.g()) && this.f5508c == bVar.b() && this.f5509d == bVar.j() && this.f5510e == bVar.d() && this.f5511f == bVar.e() && this.f5512g == bVar.i() && this.f5513h.equals(bVar.f()) && this.f5514i.equals(bVar.h())) {
            return true;
        }
        return false;
    }

    @Override // M0.G.b
    public String f() {
        return this.f5513h;
    }

    @Override // M0.G.b
    public String g() {
        return this.f5507b;
    }

    @Override // M0.G.b
    public String h() {
        return this.f5514i;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((((this.f5506a ^ 1000003) * 1000003) ^ this.f5507b.hashCode()) * 1000003) ^ this.f5508c) * 1000003;
        long j8 = this.f5509d;
        int i9 = (hashCode ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        long j9 = this.f5510e;
        int i10 = (i9 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        if (this.f5511f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return ((((((i10 ^ i8) * 1000003) ^ this.f5512g) * 1000003) ^ this.f5513h.hashCode()) * 1000003) ^ this.f5514i.hashCode();
    }

    @Override // M0.G.b
    public int i() {
        return this.f5512g;
    }

    @Override // M0.G.b
    public long j() {
        return this.f5509d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f5506a + ", model=" + this.f5507b + ", availableProcessors=" + this.f5508c + ", totalRam=" + this.f5509d + ", diskSpace=" + this.f5510e + ", isEmulator=" + this.f5511f + ", state=" + this.f5512g + ", manufacturer=" + this.f5513h + ", modelClass=" + this.f5514i + "}";
    }
}
