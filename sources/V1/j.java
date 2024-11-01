package V1;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class j extends d {

    /* renamed from: q, reason: collision with root package name */
    public static final Set f10481q = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(a.f10419i, a.f10420j, a.f10421k, a.f10422l)));

    /* renamed from: l, reason: collision with root package name */
    private final a f10482l;

    /* renamed from: m, reason: collision with root package name */
    private final d2.c f10483m;

    /* renamed from: n, reason: collision with root package name */
    private final byte[] f10484n;

    /* renamed from: o, reason: collision with root package name */
    private final d2.c f10485o;

    /* renamed from: p, reason: collision with root package name */
    private final byte[] f10486p;

    public j(a aVar, d2.c cVar, h hVar, Set set, O1.a aVar2, String str, URI uri, d2.c cVar2, d2.c cVar3, List list, KeyStore keyStore) {
        super(g.f10474f, hVar, set, aVar2, str, uri, cVar2, cVar3, list, keyStore);
        if (aVar != null) {
            if (f10481q.contains(aVar)) {
                this.f10482l = aVar;
                if (cVar != null) {
                    this.f10483m = cVar;
                    this.f10484n = cVar.a();
                    this.f10485o = null;
                    this.f10486p = null;
                    return;
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static j p(Map map) {
        g gVar = g.f10474f;
        if (gVar.equals(e.d(map))) {
            try {
                a e8 = a.e(d2.k.h(map, "crv"));
                d2.c a9 = d2.k.a(map, "x");
                d2.c a10 = d2.k.a(map, "d");
                try {
                    if (a10 == null) {
                        return new j(e8, a9, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                    }
                    return new j(e8, a9, a10, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                } catch (IllegalArgumentException e9) {
                    throw new ParseException(e9.getMessage(), 0);
                }
            } catch (IllegalArgumentException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + gVar.a(), 0);
    }

    @Override // V1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j) || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        if (Objects.equals(this.f10482l, jVar.f10482l) && Objects.equals(this.f10483m, jVar.f10483m) && Arrays.equals(this.f10484n, jVar.f10484n) && Objects.equals(this.f10485o, jVar.f10485o) && Arrays.equals(this.f10486p, jVar.f10486p)) {
            return true;
        }
        return false;
    }

    @Override // V1.d
    public int hashCode() {
        return (((Objects.hash(Integer.valueOf(super.hashCode()), this.f10482l, this.f10483m, this.f10485o) * 31) + Arrays.hashCode(this.f10484n)) * 31) + Arrays.hashCode(this.f10486p);
    }

    @Override // V1.d
    public boolean k() {
        if (this.f10485o != null) {
            return true;
        }
        return false;
    }

    @Override // V1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("crv", this.f10482l.toString());
        n8.put("x", this.f10483m.toString());
        d2.c cVar = this.f10485o;
        if (cVar != null) {
            n8.put("d", cVar.toString());
        }
        return n8;
    }

    public j(a aVar, d2.c cVar, d2.c cVar2, h hVar, Set set, O1.a aVar2, String str, URI uri, d2.c cVar3, d2.c cVar4, List list, KeyStore keyStore) {
        super(g.f10474f, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            if (f10481q.contains(aVar)) {
                this.f10482l = aVar;
                if (cVar != null) {
                    this.f10483m = cVar;
                    this.f10484n = cVar.a();
                    if (cVar2 != null) {
                        this.f10485o = cVar2;
                        this.f10486p = cVar2.a();
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' parameter must not be null");
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
