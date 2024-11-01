package y7;

import y7.o;

/* loaded from: classes5.dex */
final class i extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f41217e;

    /* renamed from: f, reason: collision with root package name */
    private final int f41218f;

    /* renamed from: g, reason: collision with root package name */
    private final int f41219g;

    private i(b bVar) {
        super(bVar);
        this.f41217e = bVar.f41220e;
        this.f41218f = bVar.f41221f;
        this.f41219g = bVar.f41222g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.o
    public byte[] d() {
        byte[] d8 = super.d();
        J7.f.d(this.f41217e, d8, 16);
        J7.f.d(this.f41218f, d8, 20);
        J7.f.d(this.f41219g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f41217e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f41218f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int g() {
        return this.f41219g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f41220e;

        /* renamed from: f, reason: collision with root package name */
        private int f41221f;

        /* renamed from: g, reason: collision with root package name */
        private int f41222g;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(1);
            this.f41220e = 0;
            this.f41221f = 0;
            this.f41222g = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o l() {
            return new i(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f41220e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b o(int i8) {
            this.f41221f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b p(int i8) {
            this.f41222g = i8;
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
