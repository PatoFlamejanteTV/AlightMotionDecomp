package P;

import O.a;
import Q.AbstractC1394n;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1378b {

    /* renamed from: a, reason: collision with root package name */
    private final int f7955a;

    /* renamed from: b, reason: collision with root package name */
    private final O.a f7956b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f7957c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7958d;

    private C1378b(O.a aVar, a.d dVar, String str) {
        this.f7956b = aVar;
        this.f7957c = dVar;
        this.f7958d = str;
        this.f7955a = AbstractC1394n.b(aVar, dVar, str);
    }

    public static C1378b a(O.a aVar, a.d dVar, String str) {
        return new C1378b(aVar, dVar, str);
    }

    public final String b() {
        return this.f7956b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1378b)) {
            return false;
        }
        C1378b c1378b = (C1378b) obj;
        if (!AbstractC1394n.a(this.f7956b, c1378b.f7956b) || !AbstractC1394n.a(this.f7957c, c1378b.f7957c) || !AbstractC1394n.a(this.f7958d, c1378b.f7958d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7955a;
    }
}
