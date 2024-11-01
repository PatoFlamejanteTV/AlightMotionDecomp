package K6;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final d f4875n = new a().c().a();

    /* renamed from: o, reason: collision with root package name */
    public static final d f4876o = new a().e().b(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4877a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4878b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4879c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4880d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4881e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f4882f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4883g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4884h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4885i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f4886j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f4887k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f4888l;

    /* renamed from: m, reason: collision with root package name */
    String f4889m;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f4890a;

        /* renamed from: b, reason: collision with root package name */
        boolean f4891b;

        /* renamed from: c, reason: collision with root package name */
        int f4892c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f4893d = -1;

        /* renamed from: e, reason: collision with root package name */
        int f4894e = -1;

        /* renamed from: f, reason: collision with root package name */
        boolean f4895f;

        /* renamed from: g, reason: collision with root package name */
        boolean f4896g;

        /* renamed from: h, reason: collision with root package name */
        boolean f4897h;

        public d a() {
            return new d(this);
        }

        public a b(int i8, TimeUnit timeUnit) {
            int i9;
            if (i8 >= 0) {
                long seconds = timeUnit.toSeconds(i8);
                if (seconds > 2147483647L) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = (int) seconds;
                }
                this.f4893d = i9;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i8);
        }

        public a c() {
            this.f4890a = true;
            return this;
        }

        public a d() {
            this.f4891b = true;
            return this;
        }

        public a e() {
            this.f4895f = true;
            return this;
        }
    }

    private d(boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, String str) {
        this.f4877a = z8;
        this.f4878b = z9;
        this.f4879c = i8;
        this.f4880d = i9;
        this.f4881e = z10;
        this.f4882f = z11;
        this.f4883g = z12;
        this.f4884h = i10;
        this.f4885i = i11;
        this.f4886j = z13;
        this.f4887k = z14;
        this.f4888l = z15;
        this.f4889m = str;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f4877a) {
            sb.append("no-cache, ");
        }
        if (this.f4878b) {
            sb.append("no-store, ");
        }
        if (this.f4879c != -1) {
            sb.append("max-age=");
            sb.append(this.f4879c);
            sb.append(", ");
        }
        if (this.f4880d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f4880d);
            sb.append(", ");
        }
        if (this.f4881e) {
            sb.append("private, ");
        }
        if (this.f4882f) {
            sb.append("public, ");
        }
        if (this.f4883g) {
            sb.append("must-revalidate, ");
        }
        if (this.f4884h != -1) {
            sb.append("max-stale=");
            sb.append(this.f4884h);
            sb.append(", ");
        }
        if (this.f4885i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f4885i);
            sb.append(", ");
        }
        if (this.f4886j) {
            sb.append("only-if-cached, ");
        }
        if (this.f4887k) {
            sb.append("no-transform, ");
        }
        if (this.f4888l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static K6.d l(K6.q r22) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.d.l(K6.q):K6.d");
    }

    public boolean b() {
        return this.f4888l;
    }

    public boolean c() {
        return this.f4881e;
    }

    public boolean d() {
        return this.f4882f;
    }

    public int e() {
        return this.f4879c;
    }

    public int f() {
        return this.f4884h;
    }

    public int g() {
        return this.f4885i;
    }

    public boolean h() {
        return this.f4883g;
    }

    public boolean i() {
        return this.f4877a;
    }

    public boolean j() {
        return this.f4878b;
    }

    public boolean k() {
        return this.f4886j;
    }

    public String toString() {
        String str = this.f4889m;
        if (str == null) {
            String a9 = a();
            this.f4889m = a9;
            return a9;
        }
        return str;
    }

    d(a aVar) {
        this.f4877a = aVar.f4890a;
        this.f4878b = aVar.f4891b;
        this.f4879c = aVar.f4892c;
        this.f4880d = -1;
        this.f4881e = false;
        this.f4882f = false;
        this.f4883g = false;
        this.f4884h = aVar.f4893d;
        this.f4885i = aVar.f4894e;
        this.f4886j = aVar.f4895f;
        this.f4887k = aVar.f4896g;
        this.f4888l = aVar.f4897h;
    }
}
