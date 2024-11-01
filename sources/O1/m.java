package O1;

import j$.util.DesugarCollections;
import java.net.URI;
import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class m extends b {

    /* renamed from: y, reason: collision with root package name */
    private static final Set f6994y;

    /* renamed from: o, reason: collision with root package name */
    private final d f6995o;

    /* renamed from: p, reason: collision with root package name */
    private final V1.d f6996p;

    /* renamed from: q, reason: collision with root package name */
    private final c f6997q;

    /* renamed from: r, reason: collision with root package name */
    private final d2.c f6998r;

    /* renamed from: s, reason: collision with root package name */
    private final d2.c f6999s;

    /* renamed from: t, reason: collision with root package name */
    private final d2.c f7000t;

    /* renamed from: u, reason: collision with root package name */
    private final int f7001u;

    /* renamed from: v, reason: collision with root package name */
    private final d2.c f7002v;

    /* renamed from: w, reason: collision with root package name */
    private final d2.c f7003w;

    /* renamed from: x, reason: collision with root package name */
    private final String f7004x;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final i f7005a;

        /* renamed from: b, reason: collision with root package name */
        private final d f7006b;

        /* renamed from: c, reason: collision with root package name */
        private h f7007c;

        /* renamed from: d, reason: collision with root package name */
        private String f7008d;

        /* renamed from: e, reason: collision with root package name */
        private Set f7009e;

        /* renamed from: f, reason: collision with root package name */
        private URI f7010f;

        /* renamed from: g, reason: collision with root package name */
        private V1.d f7011g;

        /* renamed from: h, reason: collision with root package name */
        private URI f7012h;

        /* renamed from: i, reason: collision with root package name */
        private d2.c f7013i;

        /* renamed from: j, reason: collision with root package name */
        private d2.c f7014j;

        /* renamed from: k, reason: collision with root package name */
        private List f7015k;

        /* renamed from: l, reason: collision with root package name */
        private String f7016l;

        /* renamed from: m, reason: collision with root package name */
        private V1.d f7017m;

        /* renamed from: n, reason: collision with root package name */
        private c f7018n;

        /* renamed from: o, reason: collision with root package name */
        private d2.c f7019o;

        /* renamed from: p, reason: collision with root package name */
        private d2.c f7020p;

        /* renamed from: q, reason: collision with root package name */
        private d2.c f7021q;

        /* renamed from: r, reason: collision with root package name */
        private int f7022r;

        /* renamed from: s, reason: collision with root package name */
        private d2.c f7023s;

        /* renamed from: t, reason: collision with root package name */
        private d2.c f7024t;

        /* renamed from: u, reason: collision with root package name */
        private String f7025u;

        /* renamed from: v, reason: collision with root package name */
        private Map f7026v;

        /* renamed from: w, reason: collision with root package name */
        private d2.c f7027w;

        public a(i iVar, d dVar) {
            if (!iVar.a().equals(O1.a.f6931c.a())) {
                this.f7005a = iVar;
                if (dVar != null) {
                    this.f7006b = dVar;
                    return;
                }
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
        }

        public a a(d2.c cVar) {
            this.f7019o = cVar;
            return this;
        }

        public a b(d2.c cVar) {
            this.f7020p = cVar;
            return this;
        }

        public a c(d2.c cVar) {
            this.f7024t = cVar;
            return this;
        }

        public m d() {
            return new m(this.f7005a, this.f7006b, this.f7007c, this.f7008d, this.f7009e, this.f7010f, this.f7011g, this.f7012h, this.f7013i, this.f7014j, this.f7015k, this.f7016l, this.f7017m, this.f7018n, this.f7019o, this.f7020p, this.f7021q, this.f7022r, this.f7023s, this.f7024t, this.f7025u, this.f7026v, this.f7027w);
        }

        public a e(c cVar) {
            this.f7018n = cVar;
            return this;
        }

        public a f(String str) {
            this.f7008d = str;
            return this;
        }

        public a g(Set set) {
            this.f7009e = set;
            return this;
        }

        public a h(String str, Object obj) {
            if (!m.w().contains(str)) {
                if (this.f7026v == null) {
                    this.f7026v = new HashMap();
                }
                this.f7026v.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a i(V1.d dVar) {
            this.f7017m = dVar;
            return this;
        }

        public a j(d2.c cVar) {
            this.f7023s = cVar;
            return this;
        }

        public a k(V1.d dVar) {
            if (dVar != null && dVar.k()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f7011g = dVar;
            return this;
        }

        public a l(URI uri) {
            this.f7010f = uri;
            return this;
        }

        public a m(String str) {
            this.f7016l = str;
            return this;
        }

        public a n(d2.c cVar) {
            this.f7027w = cVar;
            return this;
        }

        public a o(int i8) {
            if (i8 >= 0) {
                this.f7022r = i8;
                return this;
            }
            throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
        }

        public a p(d2.c cVar) {
            this.f7021q = cVar;
            return this;
        }

        public a q(String str) {
            this.f7025u = str;
            return this;
        }

        public a r(h hVar) {
            this.f7007c = hVar;
            return this;
        }

        public a s(List list) {
            this.f7015k = list;
            return this;
        }

        public a t(d2.c cVar) {
            this.f7014j = cVar;
            return this;
        }

        public a u(d2.c cVar) {
            this.f7013i = cVar;
            return this;
        }

        public a v(URI uri) {
            this.f7012h = uri;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add("skid");
        hashSet.add("authTag");
        f6994y = DesugarCollections.unmodifiableSet(hashSet);
    }

    public m(O1.a aVar, d dVar, h hVar, String str, Set set, URI uri, V1.d dVar2, URI uri2, d2.c cVar, d2.c cVar2, List list, String str2, V1.d dVar3, c cVar3, d2.c cVar4, d2.c cVar5, d2.c cVar6, int i8, d2.c cVar7, d2.c cVar8, String str3, Map map, d2.c cVar9) {
        super(aVar, hVar, str, set, uri, dVar2, uri2, cVar, cVar2, list, str2, map, cVar9);
        if (aVar.a().equals(O1.a.f6931c.a())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (dVar != null) {
            if (dVar3 != null && dVar3.k()) {
                throw new IllegalArgumentException("Ephemeral public key should not be a private key");
            }
            this.f6995o = dVar;
            this.f6996p = dVar3;
            this.f6997q = cVar3;
            this.f6998r = cVar4;
            this.f6999s = cVar5;
            this.f7000t = cVar6;
            this.f7001u = i8;
            this.f7002v = cVar7;
            this.f7003w = cVar8;
            this.f7004x = str3;
            return;
        }
        throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
    }

    private static d A(Map map) {
        return d.d(d2.k.h(map, "enc"));
    }

    public static Set w() {
        return f6994y;
    }

    public static m x(d2.c cVar) {
        return y(cVar.c(), cVar);
    }

    public static m y(String str, d2.c cVar) {
        return z(d2.k.n(str, 20000), cVar);
    }

    public static m z(Map map, d2.c cVar) {
        O1.a g8 = e.g(map);
        if (g8 instanceof i) {
            a n8 = new a((i) g8, A(map)).n(cVar);
            for (String str : map.keySet()) {
                if (!"alg".equals(str) && !"enc".equals(str)) {
                    if ("typ".equals(str)) {
                        String h8 = d2.k.h(map, str);
                        if (h8 != null) {
                            n8 = n8.r(new h(h8));
                        }
                    } else if ("cty".equals(str)) {
                        n8 = n8.f(d2.k.h(map, str));
                    } else if ("crit".equals(str)) {
                        List j8 = d2.k.j(map, str);
                        if (j8 != null) {
                            n8 = n8.g(new HashSet(j8));
                        }
                    } else if ("jku".equals(str)) {
                        n8 = n8.l(d2.k.k(map, str));
                    } else if ("jwk".equals(str)) {
                        n8 = n8.k(b.r(d2.k.f(map, str)));
                    } else if ("x5u".equals(str)) {
                        n8 = n8.v(d2.k.k(map, str));
                    } else if ("x5t".equals(str)) {
                        n8 = n8.u(d2.c.f(d2.k.h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        n8 = n8.t(d2.c.f(d2.k.h(map, str)));
                    } else if ("x5c".equals(str)) {
                        n8 = n8.s(d2.n.b(d2.k.e(map, str)));
                    } else if ("kid".equals(str)) {
                        n8 = n8.m(d2.k.h(map, str));
                    } else if ("epk".equals(str)) {
                        n8 = n8.i(V1.d.m(d2.k.f(map, str)));
                    } else if ("zip".equals(str)) {
                        String h9 = d2.k.h(map, str);
                        if (h9 != null) {
                            n8 = n8.e(new c(h9));
                        }
                    } else if ("apu".equals(str)) {
                        n8 = n8.a(d2.c.f(d2.k.h(map, str)));
                    } else if ("apv".equals(str)) {
                        n8 = n8.b(d2.c.f(d2.k.h(map, str)));
                    } else if ("p2s".equals(str)) {
                        n8 = n8.p(d2.c.f(d2.k.h(map, str)));
                    } else if ("p2c".equals(str)) {
                        n8 = n8.o(d2.k.d(map, str));
                    } else if ("iv".equals(str)) {
                        n8 = n8.j(d2.c.f(d2.k.h(map, str)));
                    } else if ("tag".equals(str)) {
                        n8 = n8.c(d2.c.f(d2.k.h(map, str)));
                    } else if ("skid".equals(str)) {
                        n8 = n8.q(d2.k.h(map, str));
                    } else {
                        n8 = n8.h(str, map.get(str));
                    }
                }
            }
            return n8.d();
        }
        throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
    }

    @Override // O1.b, O1.e
    public Map i() {
        Map i8 = super.i();
        d dVar = this.f6995o;
        if (dVar != null) {
            i8.put("enc", dVar.toString());
        }
        V1.d dVar2 = this.f6996p;
        if (dVar2 != null) {
            i8.put("epk", dVar2.n());
        }
        c cVar = this.f6997q;
        if (cVar != null) {
            i8.put("zip", cVar.toString());
        }
        d2.c cVar2 = this.f6998r;
        if (cVar2 != null) {
            i8.put("apu", cVar2.toString());
        }
        d2.c cVar3 = this.f6999s;
        if (cVar3 != null) {
            i8.put("apv", cVar3.toString());
        }
        d2.c cVar4 = this.f7000t;
        if (cVar4 != null) {
            i8.put("p2s", cVar4.toString());
        }
        int i9 = this.f7001u;
        if (i9 > 0) {
            i8.put("p2c", Integer.valueOf(i9));
        }
        d2.c cVar5 = this.f7002v;
        if (cVar5 != null) {
            i8.put("iv", cVar5.toString());
        }
        d2.c cVar6 = this.f7003w;
        if (cVar6 != null) {
            i8.put("tag", cVar6.toString());
        }
        String str = this.f7004x;
        if (str != null) {
            i8.put("skid", str);
        }
        return i8;
    }

    public i t() {
        return (i) super.a();
    }

    public c u() {
        return this.f6997q;
    }

    public d v() {
        return this.f6995o;
    }
}
