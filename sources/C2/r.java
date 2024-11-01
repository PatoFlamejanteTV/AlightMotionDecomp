package c2;

/* loaded from: classes4.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    final s f15340a;

    /* renamed from: b, reason: collision with root package name */
    final s f15341b;

    /* renamed from: c, reason: collision with root package name */
    final s f15342c;

    /* renamed from: d, reason: collision with root package name */
    final int f15343d;

    /* renamed from: e, reason: collision with root package name */
    final String f15344e;

    /* renamed from: f, reason: collision with root package name */
    r f15345f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(s sVar, s sVar2, s sVar3, int i8, String str) {
        this.f15340a = sVar;
        this.f15341b = sVar2;
        this.f15342c = sVar3;
        this.f15343d = i8;
        this.f15344e = str;
    }

    static int a(r rVar) {
        int i8 = 0;
        while (rVar != null) {
            i8++;
            rVar = rVar.f15345f;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(r rVar) {
        return (a(rVar) * 8) + 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(r rVar, C2018d c2018d) {
        c2018d.k(a(rVar));
        while (rVar != null) {
            c2018d.k(rVar.f15340a.f15350d).k(rVar.f15341b.f15350d).k(rVar.f15342c.f15350d).k(rVar.f15343d);
            rVar = rVar.f15345f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r d(r rVar, s sVar, s sVar2) {
        int i8;
        if (rVar == null) {
            return null;
        }
        r d8 = d(rVar.f15345f, sVar, sVar2);
        rVar.f15345f = d8;
        s sVar3 = rVar.f15340a;
        int i9 = sVar3.f15350d;
        s sVar4 = rVar.f15341b;
        int i10 = sVar4.f15350d;
        int i11 = sVar.f15350d;
        if (sVar2 == null) {
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = sVar2.f15350d;
        }
        if (i11 < i10 && i8 > i9) {
            if (i11 <= i9) {
                if (i8 >= i10) {
                    return d8;
                }
                return new r(rVar, sVar2, sVar4);
            }
            if (i8 >= i10) {
                return new r(rVar, sVar3, sVar);
            }
            rVar.f15345f = new r(rVar, sVar2, sVar4);
            return new r(rVar, rVar.f15340a, sVar);
        }
        return rVar;
    }

    r(r rVar, s sVar, s sVar2) {
        this(sVar, sVar2, rVar.f15342c, rVar.f15343d, rVar.f15344e);
        this.f15345f = rVar.f15345f;
    }
}
