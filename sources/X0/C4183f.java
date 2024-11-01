package x0;

import java.io.Serializable;

/* renamed from: x0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4183f extends G implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final w0.c f40868a;

    /* renamed from: b, reason: collision with root package name */
    final G f40869b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4183f(w0.c cVar, G g8) {
        this.f40868a = (w0.c) w0.h.i(cVar);
        this.f40869b = (G) w0.h.i(g8);
    }

    @Override // x0.G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f40869b.compare(this.f40868a.apply(obj), this.f40868a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4183f)) {
            return false;
        }
        C4183f c4183f = (C4183f) obj;
        if (this.f40868a.equals(c4183f.f40868a) && this.f40869b.equals(c4183f.f40869b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return w0.f.b(this.f40868a, this.f40869b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f40869b);
        String valueOf2 = String.valueOf(this.f40868a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
