package y7;

import y7.o;

/* loaded from: classes5.dex */
final class g extends o {

    /* renamed from: e, reason: collision with root package name */
    private final int f41210e;

    /* renamed from: f, reason: collision with root package name */
    private final int f41211f;

    /* renamed from: g, reason: collision with root package name */
    private final int f41212g;

    private g(b bVar) {
        super(bVar);
        this.f41210e = 0;
        this.f41211f = bVar.f41213e;
        this.f41212g = bVar.f41214f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.o
    public byte[] d() {
        byte[] d8 = super.d();
        J7.f.d(this.f41210e, d8, 16);
        J7.f.d(this.f41211f, d8, 20);
        J7.f.d(this.f41212g, d8, 24);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e() {
        return this.f41211f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int f() {
        return this.f41212g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class b extends o.a {

        /* renamed from: e, reason: collision with root package name */
        private int f41213e;

        /* renamed from: f, reason: collision with root package name */
        private int f41214f;

        /* JADX INFO: Access modifiers changed from: protected */
        public b() {
            super(2);
            this.f41213e = 0;
            this.f41214f = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public o k() {
            return new g(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b m(int i8) {
            this.f41213e = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public b n(int i8) {
            this.f41214f = i8;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y7.o.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }
    }
}
