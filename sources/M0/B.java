package M0;

import M0.G;

/* loaded from: classes3.dex */
final class B extends G {

    /* renamed from: a, reason: collision with root package name */
    private final G.a f5497a;

    /* renamed from: b, reason: collision with root package name */
    private final G.c f5498b;

    /* renamed from: c, reason: collision with root package name */
    private final G.b f5499c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(G.a aVar, G.c cVar, G.b bVar) {
        if (aVar != null) {
            this.f5497a = aVar;
            if (cVar != null) {
                this.f5498b = cVar;
                if (bVar != null) {
                    this.f5499c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // M0.G
    public G.a a() {
        return this.f5497a;
    }

    @Override // M0.G
    public G.b c() {
        return this.f5499c;
    }

    @Override // M0.G
    public G.c d() {
        return this.f5498b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        if (this.f5497a.equals(g8.a()) && this.f5498b.equals(g8.d()) && this.f5499c.equals(g8.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5497a.hashCode() ^ 1000003) * 1000003) ^ this.f5498b.hashCode()) * 1000003) ^ this.f5499c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f5497a + ", osData=" + this.f5498b + ", deviceData=" + this.f5499c + "}";
    }
}
