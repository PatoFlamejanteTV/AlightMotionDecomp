package M0;

import M0.G;

/* loaded from: classes3.dex */
final class E extends G.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5515a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5516b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5517c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(String str, String str2, boolean z8) {
        if (str != null) {
            this.f5515a = str;
            if (str2 != null) {
                this.f5516b = str2;
                this.f5517c = z8;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // M0.G.c
    public boolean b() {
        return this.f5517c;
    }

    @Override // M0.G.c
    public String c() {
        return this.f5516b;
    }

    @Override // M0.G.c
    public String d() {
        return this.f5515a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.c)) {
            return false;
        }
        G.c cVar = (G.c) obj;
        if (this.f5515a.equals(cVar.d()) && this.f5516b.equals(cVar.c()) && this.f5517c == cVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i8;
        int hashCode = (((this.f5515a.hashCode() ^ 1000003) * 1000003) ^ this.f5516b.hashCode()) * 1000003;
        if (this.f5517c) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return hashCode ^ i8;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f5515a + ", osCodeName=" + this.f5516b + ", isRooted=" + this.f5517c + "}";
    }
}
