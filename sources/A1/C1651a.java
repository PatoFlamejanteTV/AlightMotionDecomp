package a1;

import java.util.List;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1651a extends AbstractC1662l {

    /* renamed from: a, reason: collision with root package name */
    private final String f14040a;

    /* renamed from: b, reason: collision with root package name */
    private final List f14041b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1651a(String str, List list) {
        if (str != null) {
            this.f14040a = str;
            if (list != null) {
                this.f14041b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // a1.AbstractC1662l
    public List b() {
        return this.f14041b;
    }

    @Override // a1.AbstractC1662l
    public String c() {
        return this.f14040a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1662l)) {
            return false;
        }
        AbstractC1662l abstractC1662l = (AbstractC1662l) obj;
        if (this.f14040a.equals(abstractC1662l.c()) && this.f14041b.equals(abstractC1662l.b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f14040a.hashCode() ^ 1000003) * 1000003) ^ this.f14041b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f14040a + ", usedDates=" + this.f14041b + "}";
    }
}
