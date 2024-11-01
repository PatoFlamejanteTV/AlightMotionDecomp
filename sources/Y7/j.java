package y7;

import y7.o;

/* loaded from: classes5.dex */
final class j extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f41223e;

    /* renamed from: f, reason: collision with root package name */
    private final int f41224f;

    /* renamed from: g, reason: collision with root package name */
    private final int f41225g;

    private j(b bVar) {
        super(bVar);
        this.f41223e = bVar.f41226e;
        this.f41224f = bVar.f41227f;
        this.f41225g = bVar.f41228g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.o
    public byte[] d() {
        byte[] d8 = super.d();
        J7.f.d(this.f41223e, d8, 16);
        J7.f.d(this.f41224f, d8, 20);
        J7.f.d(this.f41225g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f41224f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f41225g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.f41223e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f41226e;

        /* renamed from: f, reason: collision with root package name */
        private int f41227f;

        /* renamed from: g, reason: collision with root package name */
        private int f41228g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(0);
            this.f41226e = 0;
            this.f41227f = 0;
            this.f41228g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o l() {
            return new j(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f41227f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i8) {
            this.f41228g = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i8) {
            this.f41226e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y7.o.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }
    }
}
