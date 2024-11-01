package y7;

import W6.C1488n;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f41254e;

    /* renamed from: a, reason: collision with root package name */
    private final w f41255a;

    /* renamed from: b, reason: collision with root package name */
    private final x f41256b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41257c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41258d;

    static {
        HashMap hashMap = new HashMap();
        Integer a9 = J7.d.a(1);
        C1488n c1488n = Z6.a.f13974c;
        hashMap.put(a9, new r(20, 2, c1488n));
        hashMap.put(J7.d.a(2), new r(20, 4, c1488n));
        hashMap.put(J7.d.a(3), new r(40, 2, c1488n));
        hashMap.put(J7.d.a(4), new r(40, 4, c1488n));
        hashMap.put(J7.d.a(5), new r(40, 8, c1488n));
        hashMap.put(J7.d.a(6), new r(60, 3, c1488n));
        hashMap.put(J7.d.a(7), new r(60, 6, c1488n));
        hashMap.put(J7.d.a(8), new r(60, 12, c1488n));
        Integer a10 = J7.d.a(9);
        C1488n c1488n2 = Z6.a.f13978e;
        hashMap.put(a10, new r(20, 2, c1488n2));
        hashMap.put(J7.d.a(10), new r(20, 4, c1488n2));
        hashMap.put(J7.d.a(11), new r(40, 2, c1488n2));
        hashMap.put(J7.d.a(12), new r(40, 4, c1488n2));
        hashMap.put(J7.d.a(13), new r(40, 8, c1488n2));
        hashMap.put(J7.d.a(14), new r(60, 3, c1488n2));
        hashMap.put(J7.d.a(15), new r(60, 6, c1488n2));
        hashMap.put(J7.d.a(16), new r(60, 12, c1488n2));
        Integer a11 = J7.d.a(17);
        C1488n c1488n3 = Z6.a.f13994m;
        hashMap.put(a11, new r(20, 2, c1488n3));
        hashMap.put(J7.d.a(18), new r(20, 4, c1488n3));
        hashMap.put(J7.d.a(19), new r(40, 2, c1488n3));
        hashMap.put(J7.d.a(20), new r(40, 4, c1488n3));
        hashMap.put(J7.d.a(21), new r(40, 8, c1488n3));
        hashMap.put(J7.d.a(22), new r(60, 3, c1488n3));
        hashMap.put(J7.d.a(23), new r(60, 6, c1488n3));
        hashMap.put(J7.d.a(24), new r(60, 12, c1488n3));
        Integer a12 = J7.d.a(25);
        C1488n c1488n4 = Z6.a.f13996n;
        hashMap.put(a12, new r(20, 2, c1488n4));
        hashMap.put(J7.d.a(26), new r(20, 4, c1488n4));
        hashMap.put(J7.d.a(27), new r(40, 2, c1488n4));
        hashMap.put(J7.d.a(28), new r(40, 4, c1488n4));
        hashMap.put(J7.d.a(29), new r(40, 8, c1488n4));
        hashMap.put(J7.d.a(30), new r(60, 3, c1488n4));
        hashMap.put(J7.d.a(31), new r(60, 6, c1488n4));
        hashMap.put(J7.d.a(32), new r(60, 12, c1488n4));
        f41254e = DesugarCollections.unmodifiableMap(hashMap);
    }

    public r(int i8, int i9, C1488n c1488n) {
        this.f41257c = i8;
        this.f41258d = i9;
        this.f41256b = new x(j(i8, i9), c1488n);
        this.f41255a = C4253d.c(e(), f(), g(), c(), a(), i9);
    }

    public static r i(int i8) {
        return (r) f41254e.get(J7.d.a(i8));
    }

    private static int j(int i8, int i9) {
        if (i8 >= 2) {
            if (i8 % i9 == 0) {
                int i10 = i8 / i9;
                if (i10 != 1) {
                    return i10;
                }
                throw new IllegalArgumentException("height / layers must be greater than 1");
            }
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        throw new IllegalArgumentException("totalHeight must be > 1");
    }

    public int a() {
        return this.f41257c;
    }

    public int b() {
        return this.f41258d;
    }

    protected int c() {
        return this.f41256b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w d() {
        return this.f41255a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return this.f41256b.f();
    }

    public int f() {
        return this.f41256b.h();
    }

    int g() {
        return this.f41256b.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public x h() {
        return this.f41256b;
    }

    public r(int i8, int i9, d7.e eVar) {
        this(i8, i9, f.c(eVar.e()));
    }
}
