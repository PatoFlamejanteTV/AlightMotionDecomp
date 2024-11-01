package y7;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private final int f41244a;

    /* renamed from: b, reason: collision with root package name */
    private final long f41245b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41246c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41247d;

    /* loaded from: classes5.dex */
    protected static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f41248a;

        /* renamed from: b, reason: collision with root package name */
        private int f41249b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f41250c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f41251d = 0;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(int i8) {
            this.f41248a = i8;
        }

        protected abstract a e();

        /* JADX INFO: Access modifiers changed from: protected */
        public a f(int i8) {
            this.f41251d = i8;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a g(int i8) {
            this.f41249b = i8;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a h(long j8) {
            this.f41250c = j8;
            return e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(a aVar) {
        this.f41244a = aVar.f41249b;
        this.f41245b = aVar.f41250c;
        this.f41246c = aVar.f41248a;
        this.f41247d = aVar.f41251d;
    }

    public final int a() {
        return this.f41247d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b() {
        return this.f41244a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long c() {
        return this.f41245b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] d() {
        byte[] bArr = new byte[32];
        J7.f.d(this.f41244a, bArr, 0);
        J7.f.i(this.f41245b, bArr, 4);
        J7.f.d(this.f41246c, bArr, 12);
        J7.f.d(this.f41247d, bArr, 28);
        return bArr;
    }
}
