package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    l[] f33129a;

    /* renamed from: b, reason: collision with root package name */
    l f33130b = null;

    /* renamed from: c, reason: collision with root package name */
    o f33131c;

    /* renamed from: d, reason: collision with root package name */
    o f33132d;

    /* renamed from: e, reason: collision with root package name */
    int f33133e;

    /* renamed from: f, reason: collision with root package name */
    int f33134f;

    /* renamed from: g, reason: collision with root package name */
    int f33135g;

    /* renamed from: h, reason: collision with root package name */
    final int f33136h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(l[] lVarArr, int i8, int i9, int i10) {
        this.f33129a = lVarArr;
        this.f33136h = i8;
        this.f33133e = i9;
        this.f33134f = i9;
        this.f33135g = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final l a() {
        l[] lVarArr;
        int length;
        int i8;
        o oVar;
        o oVar2;
        l lVar = this.f33130b;
        if (lVar != null) {
            lVar = lVar.f33124d;
        }
        while (lVar == null) {
            if (this.f33134f >= this.f33135g || (lVarArr = this.f33129a) == null || (length = lVarArr.length) <= (i8 = this.f33133e) || i8 < 0) {
                this.f33130b = null;
                return null;
            }
            l k8 = ConcurrentHashMap.k(lVarArr, i8);
            if (k8 == null || k8.f33121a >= 0) {
                lVar = k8;
            } else if (k8 instanceof g) {
                this.f33129a = ((g) k8).f33114e;
                o oVar3 = this.f33132d;
                if (oVar3 != null) {
                    this.f33132d = oVar3.f33128d;
                    oVar2 = oVar3;
                } else {
                    oVar2 = new Object();
                }
                oVar2.f33127c = lVarArr;
                oVar2.f33125a = length;
                oVar2.f33126b = i8;
                oVar2.f33128d = this.f33131c;
                this.f33131c = oVar2;
                lVar = null;
            } else {
                lVar = k8 instanceof q ? ((q) k8).f33140f : null;
            }
            if (this.f33131c != null) {
                while (true) {
                    oVar = this.f33131c;
                    if (oVar == null) {
                        break;
                    }
                    int i9 = this.f33133e;
                    int i10 = oVar.f33125a;
                    int i11 = i9 + i10;
                    this.f33133e = i11;
                    if (i11 < length) {
                        break;
                    }
                    this.f33133e = oVar.f33126b;
                    this.f33129a = oVar.f33127c;
                    oVar.f33127c = null;
                    o oVar4 = oVar.f33128d;
                    oVar.f33128d = this.f33132d;
                    this.f33131c = oVar4;
                    this.f33132d = oVar;
                    length = i10;
                }
                if (oVar == null) {
                    int i12 = this.f33133e + this.f33136h;
                    this.f33133e = i12;
                    if (i12 >= length) {
                        int i13 = this.f33134f + 1;
                        this.f33134f = i13;
                        this.f33133e = i13;
                    }
                }
            } else {
                int i14 = i8 + this.f33136h;
                this.f33133e = i14;
                if (i14 >= length) {
                    int i15 = this.f33134f + 1;
                    this.f33134f = i15;
                    this.f33133e = i15;
                }
            }
        }
        this.f33130b = lVar;
        return lVar;
    }
}
