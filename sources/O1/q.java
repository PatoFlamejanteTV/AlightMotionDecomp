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
public final class q extends b {

    /* renamed from: p, reason: collision with root package name */
    private static final Set f7052p;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f7053o;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
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
        hashSet.add("b64");
        f7052p = DesugarCollections.unmodifiableSet(hashSet);
    }

    public q(p pVar, h hVar, String str, Set set, URI uri, V1.d dVar, URI uri2, d2.c cVar, d2.c cVar2, List list, String str2, boolean z8, Map map, d2.c cVar3) {
        super(pVar, hVar, str, set, uri, dVar, uri2, cVar, cVar2, list, str2, map, cVar3);
        if (!pVar.a().equals(O1.a.f6931c.a())) {
            this.f7053o = z8;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
    }

    public static Set u() {
        return f7052p;
    }

    public static q w(d2.c cVar) {
        return x(cVar.c(), cVar);
    }

    public static q x(String str, d2.c cVar) {
        return y(d2.k.n(str, 20000), cVar);
    }

    public static q y(Map map, d2.c cVar) {
        O1.a g8 = e.g(map);
        if (g8 instanceof p) {
            a i8 = new a((p) g8).i(cVar);
            for (String str : map.keySet()) {
                if (!"alg".equals(str)) {
                    if ("typ".equals(str)) {
                        String h8 = d2.k.h(map, str);
                        if (h8 != null) {
                            i8 = i8.j(new h(h8));
                        }
                    } else if ("cty".equals(str)) {
                        i8 = i8.c(d2.k.h(map, str));
                    } else if ("crit".equals(str)) {
                        List j8 = d2.k.j(map, str);
                        if (j8 != null) {
                            i8 = i8.d(new HashSet(j8));
                        }
                    } else if ("jku".equals(str)) {
                        i8 = i8.g(d2.k.k(map, str));
                    } else if ("jwk".equals(str)) {
                        i8 = i8.f(b.r(d2.k.f(map, str)));
                    } else if ("x5u".equals(str)) {
                        i8 = i8.n(d2.k.k(map, str));
                    } else if ("x5t".equals(str)) {
                        i8 = i8.m(d2.c.f(d2.k.h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        i8 = i8.l(d2.c.f(d2.k.h(map, str)));
                    } else if ("x5c".equals(str)) {
                        i8 = i8.k(d2.n.b(d2.k.e(map, str)));
                    } else if ("kid".equals(str)) {
                        i8 = i8.h(d2.k.h(map, str));
                    } else if ("b64".equals(str)) {
                        i8 = i8.a(d2.k.b(map, str));
                    } else {
                        i8 = i8.e(str, map.get(str));
                    }
                }
            }
            return i8.b();
        }
        throw new ParseException("Not a JWS header", 0);
    }

    @Override // O1.b, O1.e
    public Map i() {
        Map i8 = super.i();
        if (!v()) {
            i8.put("b64", Boolean.FALSE);
        }
        return i8;
    }

    @Override // O1.b
    public /* bridge */ /* synthetic */ V1.d j() {
        return super.j();
    }

    @Override // O1.b
    public /* bridge */ /* synthetic */ URI k() {
        return super.k();
    }

    @Override // O1.b
    public /* bridge */ /* synthetic */ String m() {
        return super.m();
    }

    @Override // O1.b
    public /* bridge */ /* synthetic */ List n() {
        return super.n();
    }

    @Override // O1.b
    public /* bridge */ /* synthetic */ d2.c o() {
        return super.o();
    }

    @Override // O1.b
    public /* bridge */ /* synthetic */ d2.c p() {
        return super.p();
    }

    @Override // O1.b
    public /* bridge */ /* synthetic */ URI q() {
        return super.q();
    }

    public p t() {
        return (p) super.a();
    }

    public boolean v() {
        return this.f7053o;
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final p f7054a;

        /* renamed from: b, reason: collision with root package name */
        private h f7055b;

        /* renamed from: c, reason: collision with root package name */
        private String f7056c;

        /* renamed from: d, reason: collision with root package name */
        private Set f7057d;

        /* renamed from: e, reason: collision with root package name */
        private URI f7058e;

        /* renamed from: f, reason: collision with root package name */
        private V1.d f7059f;

        /* renamed from: g, reason: collision with root package name */
        private URI f7060g;

        /* renamed from: h, reason: collision with root package name */
        private d2.c f7061h;

        /* renamed from: i, reason: collision with root package name */
        private d2.c f7062i;

        /* renamed from: j, reason: collision with root package name */
        private List f7063j;

        /* renamed from: k, reason: collision with root package name */
        private String f7064k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f7065l;

        /* renamed from: m, reason: collision with root package name */
        private Map f7066m;

        /* renamed from: n, reason: collision with root package name */
        private d2.c f7067n;

        public a(p pVar) {
            this.f7065l = true;
            if (!pVar.a().equals(O1.a.f6931c.a())) {
                this.f7054a = pVar;
                return;
            }
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }

        public a a(boolean z8) {
            this.f7065l = z8;
            return this;
        }

        public q b() {
            return new q(this.f7054a, this.f7055b, this.f7056c, this.f7057d, this.f7058e, this.f7059f, this.f7060g, this.f7061h, this.f7062i, this.f7063j, this.f7064k, this.f7065l, this.f7066m, this.f7067n);
        }

        public a c(String str) {
            this.f7056c = str;
            return this;
        }

        public a d(Set set) {
            this.f7057d = set;
            return this;
        }

        public a e(String str, Object obj) {
            if (!q.u().contains(str)) {
                if (this.f7066m == null) {
                    this.f7066m = new HashMap();
                }
                this.f7066m.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a f(V1.d dVar) {
            if (dVar != null && dVar.k()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f7059f = dVar;
            return this;
        }

        public a g(URI uri) {
            this.f7058e = uri;
            return this;
        }

        public a h(String str) {
            this.f7064k = str;
            return this;
        }

        public a i(d2.c cVar) {
            this.f7067n = cVar;
            return this;
        }

        public a j(h hVar) {
            this.f7055b = hVar;
            return this;
        }

        public a k(List list) {
            this.f7063j = list;
            return this;
        }

        public a l(d2.c cVar) {
            this.f7062i = cVar;
            return this;
        }

        public a m(d2.c cVar) {
            this.f7061h = cVar;
            return this;
        }

        public a n(URI uri) {
            this.f7060g = uri;
            return this;
        }

        public a(q qVar) {
            this(qVar.t());
            this.f7055b = qVar.f();
            this.f7056c = qVar.b();
            this.f7057d = qVar.c();
            this.f7058e = qVar.k();
            this.f7059f = qVar.j();
            this.f7060g = qVar.q();
            this.f7061h = qVar.p();
            this.f7062i = qVar.o();
            this.f7063j = qVar.n();
            this.f7064k = qVar.m();
            this.f7065l = qVar.v();
            this.f7066m = qVar.e();
        }
    }
}
