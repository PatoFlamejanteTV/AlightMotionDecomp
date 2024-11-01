package R0;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f9112a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9113b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9114c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9115d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9116e;

    /* renamed from: f, reason: collision with root package name */
    public final double f9117f;

    /* renamed from: g, reason: collision with root package name */
    public final double f9118g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9119h;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f9120a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9121b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9122c;

        public a(boolean z8, boolean z9, boolean z10) {
            this.f9120a = z8;
            this.f9121b = z9;
            this.f9122c = z10;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9123a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9124b;

        public b(int i8, int i9) {
            this.f9123a = i8;
            this.f9124b = i9;
        }
    }

    public d(long j8, b bVar, a aVar, int i8, int i9, double d8, double d9, int i10) {
        this.f9114c = j8;
        this.f9112a = bVar;
        this.f9113b = aVar;
        this.f9115d = i8;
        this.f9116e = i9;
        this.f9117f = d8;
        this.f9118g = d9;
        this.f9119h = i10;
    }

    public boolean a(long j8) {
        if (this.f9114c < j8) {
            return true;
        }
        return false;
    }
}
