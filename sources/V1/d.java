package V1;

import d2.C2747a;
import d2.n;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final g f10450a;

    /* renamed from: b, reason: collision with root package name */
    private final h f10451b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f10452c;

    /* renamed from: d, reason: collision with root package name */
    private final O1.a f10453d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10454e;

    /* renamed from: f, reason: collision with root package name */
    private final URI f10455f;

    /* renamed from: g, reason: collision with root package name */
    private final d2.c f10456g;

    /* renamed from: h, reason: collision with root package name */
    private final d2.c f10457h;

    /* renamed from: i, reason: collision with root package name */
    private final List f10458i;

    /* renamed from: j, reason: collision with root package name */
    private final List f10459j;

    /* renamed from: k, reason: collision with root package name */
    private final KeyStore f10460k;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(g gVar, h hVar, Set set, O1.a aVar, String str, URI uri, d2.c cVar, d2.c cVar2, List list, KeyStore keyStore) {
        if (gVar != null) {
            this.f10450a = gVar;
            if (i.a(hVar, set)) {
                this.f10451b = hVar;
                this.f10452c = set;
                this.f10453d = aVar;
                this.f10454e = str;
                this.f10455f = uri;
                this.f10456g = cVar;
                this.f10457h = cVar2;
                if (list != null && list.isEmpty()) {
                    throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
                }
                this.f10458i = list;
                try {
                    this.f10459j = n.a(list);
                    this.f10460k = keyStore;
                    return;
                } catch (ParseException e8) {
                    throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e8.getMessage(), e8);
                }
            }
            throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
    }

    public static d m(Map map) {
        String h8 = d2.k.h(map, "kty");
        if (h8 != null) {
            g b9 = g.b(h8);
            if (b9 == g.f10471c) {
                return b.y(map);
            }
            if (b9 == g.f10472d) {
                return l.q(map);
            }
            if (b9 == g.f10473e) {
                return k.p(map);
            }
            if (b9 == g.f10474f) {
                return j.p(map);
            }
            throw new ParseException("Unsupported key type \"kty\" parameter: " + b9, 0);
        }
        throw new ParseException("Missing key type \"kty\" parameter", 0);
    }

    public O1.a a() {
        return this.f10453d;
    }

    public String b() {
        return this.f10454e;
    }

    public Set c() {
        return this.f10452c;
    }

    public KeyStore d() {
        return this.f10460k;
    }

    public h e() {
        return this.f10451b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Objects.equals(this.f10450a, dVar.f10450a) && Objects.equals(this.f10451b, dVar.f10451b) && Objects.equals(this.f10452c, dVar.f10452c) && Objects.equals(this.f10453d, dVar.f10453d) && Objects.equals(this.f10454e, dVar.f10454e) && Objects.equals(this.f10455f, dVar.f10455f) && Objects.equals(this.f10456g, dVar.f10456g) && Objects.equals(this.f10457h, dVar.f10457h) && Objects.equals(this.f10458i, dVar.f10458i) && Objects.equals(this.f10460k, dVar.f10460k)) {
            return true;
        }
        return false;
    }

    public List f() {
        List list = this.f10459j;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public List g() {
        List list = this.f10458i;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public d2.c h() {
        return this.f10457h;
    }

    public int hashCode() {
        return Objects.hash(this.f10450a, this.f10451b, this.f10452c, this.f10453d, this.f10454e, this.f10455f, this.f10456g, this.f10457h, this.f10458i, this.f10460k);
    }

    public d2.c i() {
        return this.f10456g;
    }

    public URI j() {
        return this.f10455f;
    }

    public abstract boolean k();

    public Map n() {
        Map l8 = d2.k.l();
        l8.put("kty", this.f10450a.a());
        h hVar = this.f10451b;
        if (hVar != null) {
            l8.put("use", hVar.a());
        }
        if (this.f10452c != null) {
            List a9 = d2.j.a();
            Iterator it = this.f10452c.iterator();
            while (it.hasNext()) {
                a9.add(((f) it.next()).a());
            }
            l8.put("key_ops", a9);
        }
        O1.a aVar = this.f10453d;
        if (aVar != null) {
            l8.put("alg", aVar.a());
        }
        String str = this.f10454e;
        if (str != null) {
            l8.put("kid", str);
        }
        URI uri = this.f10455f;
        if (uri != null) {
            l8.put("x5u", uri.toString());
        }
        d2.c cVar = this.f10456g;
        if (cVar != null) {
            l8.put("x5t", cVar.toString());
        }
        d2.c cVar2 = this.f10457h;
        if (cVar2 != null) {
            l8.put("x5t#S256", cVar2.toString());
        }
        if (this.f10458i != null) {
            List a10 = d2.j.a();
            Iterator it2 = this.f10458i.iterator();
            while (it2.hasNext()) {
                a10.add(((C2747a) it2.next()).toString());
            }
            l8.put("x5c", a10);
        }
        return l8;
    }

    public String o() {
        return d2.k.o(n());
    }

    public String toString() {
        return d2.k.o(n());
    }
}
