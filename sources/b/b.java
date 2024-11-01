package B;

import java.util.Map;

/* loaded from: classes3.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final E.a f296a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f297b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(E.a aVar, Map map) {
        if (aVar != null) {
            this.f296a = aVar;
            if (map != null) {
                this.f297b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // B.f
    E.a e() {
        return this.f296a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f296a.equals(fVar.e()) && this.f297b.equals(fVar.h())) {
            return true;
        }
        return false;
    }

    @Override // B.f
    Map h() {
        return this.f297b;
    }

    public int hashCode() {
        return ((this.f296a.hashCode() ^ 1000003) * 1000003) ^ this.f297b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f296a + ", values=" + this.f297b + "}";
    }
}
