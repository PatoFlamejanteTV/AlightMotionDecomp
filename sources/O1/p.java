package O1;

/* loaded from: classes4.dex */
public final class p extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final p f7038d = new p("HS256", x.REQUIRED);

    /* renamed from: e, reason: collision with root package name */
    public static final p f7039e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f7040f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f7041g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f7042h;

    /* renamed from: i, reason: collision with root package name */
    public static final p f7043i;

    /* renamed from: j, reason: collision with root package name */
    public static final p f7044j;

    /* renamed from: k, reason: collision with root package name */
    public static final p f7045k;

    /* renamed from: l, reason: collision with root package name */
    public static final p f7046l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f7047m;

    /* renamed from: n, reason: collision with root package name */
    public static final p f7048n;

    /* renamed from: o, reason: collision with root package name */
    public static final p f7049o;

    /* renamed from: p, reason: collision with root package name */
    public static final p f7050p;

    /* renamed from: q, reason: collision with root package name */
    public static final p f7051q;

    static {
        x xVar = x.OPTIONAL;
        f7039e = new p("HS384", xVar);
        f7040f = new p("HS512", xVar);
        x xVar2 = x.RECOMMENDED;
        f7041g = new p("RS256", xVar2);
        f7042h = new p("RS384", xVar);
        f7043i = new p("RS512", xVar);
        f7044j = new p("ES256", xVar2);
        f7045k = new p("ES256K", xVar);
        f7046l = new p("ES384", xVar);
        f7047m = new p("ES512", xVar);
        f7048n = new p("PS256", xVar);
        f7049o = new p("PS384", xVar);
        f7050p = new p("PS512", xVar);
        f7051q = new p("EdDSA", xVar);
    }

    public p(String str, x xVar) {
        super(str, xVar);
    }

    public static p c(String str) {
        p pVar = f7038d;
        if (str.equals(pVar.a())) {
            return pVar;
        }
        p pVar2 = f7039e;
        if (str.equals(pVar2.a())) {
            return pVar2;
        }
        p pVar3 = f7040f;
        if (str.equals(pVar3.a())) {
            return pVar3;
        }
        p pVar4 = f7041g;
        if (str.equals(pVar4.a())) {
            return pVar4;
        }
        p pVar5 = f7042h;
        if (str.equals(pVar5.a())) {
            return pVar5;
        }
        p pVar6 = f7043i;
        if (str.equals(pVar6.a())) {
            return pVar6;
        }
        p pVar7 = f7044j;
        if (str.equals(pVar7.a())) {
            return pVar7;
        }
        p pVar8 = f7045k;
        if (str.equals(pVar8.a())) {
            return pVar8;
        }
        p pVar9 = f7046l;
        if (str.equals(pVar9.a())) {
            return pVar9;
        }
        p pVar10 = f7047m;
        if (str.equals(pVar10.a())) {
            return pVar10;
        }
        p pVar11 = f7048n;
        if (str.equals(pVar11.a())) {
            return pVar11;
        }
        p pVar12 = f7049o;
        if (str.equals(pVar12.a())) {
            return pVar12;
        }
        p pVar13 = f7050p;
        if (str.equals(pVar13.a())) {
            return pVar13;
        }
        p pVar14 = f7051q;
        if (str.equals(pVar14.a())) {
            return pVar14;
        }
        return new p(str);
    }

    public p(String str) {
        super(str, null);
    }
}
