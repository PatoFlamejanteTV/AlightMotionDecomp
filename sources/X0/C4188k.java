package x0;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: x0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4188k extends G implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f40893a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4188k(Comparator comparator) {
        this.f40893a = (Comparator) w0.h.i(comparator);
    }

    @Override // x0.G, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f40893a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4188k) {
            return this.f40893a.equals(((C4188k) obj).f40893a);
        }
        return false;
    }

    public int hashCode() {
        return this.f40893a.hashCode();
    }

    public String toString() {
        return this.f40893a.toString();
    }
}
