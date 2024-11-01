package V1;

import j$.util.Objects;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class k extends d {

    /* renamed from: l, reason: collision with root package name */
    private final d2.c f10487l;

    public k(d2.c cVar, h hVar, Set set, O1.a aVar, String str, URI uri, d2.c cVar2, d2.c cVar3, List list, KeyStore keyStore) {
        super(g.f10473e, hVar, set, aVar, str, uri, cVar2, cVar3, list, keyStore);
        if (cVar != null) {
            this.f10487l = cVar;
            return;
        }
        throw new IllegalArgumentException("The key value must not be null");
    }

    public static k p(Map map) {
        g gVar = g.f10473e;
        if (gVar.equals(e.d(map))) {
            try {
                return new k(d2.k.a(map, "k"), e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
            } catch (IllegalArgumentException e8) {
                throw new ParseException(e8.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + gVar.a(), 0);
    }

    @Override // V1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k) || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f10487l, ((k) obj).f10487l);
    }

    @Override // V1.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f10487l);
    }

    @Override // V1.d
    public boolean k() {
        return true;
    }

    @Override // V1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("k", this.f10487l.toString());
        return n8;
    }
}
