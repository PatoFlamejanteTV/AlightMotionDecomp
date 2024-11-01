package y7;

import W6.C1488n;

/* loaded from: classes5.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final w f41236a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41237b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41238c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41239d;

    /* renamed from: e, reason: collision with root package name */
    private final int f41240e;

    /* renamed from: f, reason: collision with root package name */
    private final int f41241f;

    /* renamed from: g, reason: collision with root package name */
    private final C1488n f41242g;

    /* JADX INFO: Access modifiers changed from: protected */
    public m(C1488n c1488n) {
        if (c1488n != null) {
            this.f41242g = c1488n;
            d7.e a9 = f.a(c1488n);
            int h8 = AbstractC4249A.h(a9);
            this.f41237b = h8;
            this.f41238c = 16;
            int ceil = (int) Math.ceil((h8 * 8) / AbstractC4249A.o(16));
            this.f41240e = ceil;
            int floor = ((int) Math.floor(AbstractC4249A.o((16 - 1) * ceil) / AbstractC4249A.o(16))) + 1;
            this.f41241f = floor;
            int i8 = ceil + floor;
            this.f41239d = i8;
            l c8 = l.c(a9.e(), h8, 16, i8);
            this.f41236a = c8;
            if (c8 != null) {
                return;
            }
            throw new IllegalArgumentException("cannot find OID for digest algorithm: " + a9.e());
        }
        throw new NullPointerException("treeDigest == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a() {
        return this.f41239d;
    }

    public C1488n b() {
        return this.f41242g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c() {
        return this.f41237b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int d() {
        return this.f41238c;
    }
}
