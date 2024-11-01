package y7;

import W6.C1488n;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: i, reason: collision with root package name */
    private static final Map f41286i;

    /* renamed from: a, reason: collision with root package name */
    private final w f41287a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41288b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41289c;

    /* renamed from: d, reason: collision with root package name */
    private final C1488n f41290d;

    /* renamed from: e, reason: collision with root package name */
    private final int f41291e;

    /* renamed from: f, reason: collision with root package name */
    private final String f41292f;

    /* renamed from: g, reason: collision with root package name */
    private final int f41293g;

    /* renamed from: h, reason: collision with root package name */
    private final m f41294h;

    static {
        HashMap hashMap = new HashMap();
        Integer a9 = J7.d.a(1);
        C1488n c1488n = Z6.a.f13974c;
        hashMap.put(a9, new x(10, c1488n));
        hashMap.put(J7.d.a(2), new x(16, c1488n));
        hashMap.put(J7.d.a(3), new x(20, c1488n));
        Integer a10 = J7.d.a(4);
        C1488n c1488n2 = Z6.a.f13978e;
        hashMap.put(a10, new x(10, c1488n2));
        hashMap.put(J7.d.a(5), new x(16, c1488n2));
        hashMap.put(J7.d.a(6), new x(20, c1488n2));
        Integer a11 = J7.d.a(7);
        C1488n c1488n3 = Z6.a.f13994m;
        hashMap.put(a11, new x(10, c1488n3));
        hashMap.put(J7.d.a(8), new x(16, c1488n3));
        hashMap.put(J7.d.a(9), new x(20, c1488n3));
        Integer a12 = J7.d.a(10);
        C1488n c1488n4 = Z6.a.f13996n;
        hashMap.put(a12, new x(10, c1488n4));
        hashMap.put(J7.d.a(11), new x(16, c1488n4));
        hashMap.put(J7.d.a(12), new x(20, c1488n4));
        f41286i = DesugarCollections.unmodifiableMap(hashMap);
    }

    public x(int i8, C1488n c1488n) {
        if (i8 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (c1488n == null) {
            throw new NullPointerException("digest == null");
        }
        this.f41288b = i8;
        this.f41289c = a();
        String b9 = f.b(c1488n);
        this.f41292f = b9;
        this.f41290d = c1488n;
        m mVar = new m(c1488n);
        this.f41294h = mVar;
        int c8 = mVar.c();
        this.f41293g = c8;
        int d8 = mVar.d();
        this.f41291e = d8;
        this.f41287a = e.c(b9, c8, d8, mVar.a(), i8);
    }

    private int a() {
        int i8 = 2;
        while (true) {
            int i9 = this.f41288b;
            if (i8 <= i9) {
                if ((i9 - i8) % 2 == 0) {
                    return i8;
                }
                i8++;
            } else {
                throw new IllegalStateException("should never happen...");
            }
        }
    }

    public static x k(int i8) {
        return (x) f41286i.get(J7.d.a(i8));
    }

    public int b() {
        return this.f41288b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f41289c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f41294h.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w e() {
        return this.f41287a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.f41292f;
    }

    public C1488n g() {
        return this.f41290d;
    }

    public int h() {
        return this.f41293g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k i() {
        return new k(this.f41294h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f41291e;
    }

    public x(int i8, d7.e eVar) {
        this(i8, f.c(eVar.e()));
    }
}
