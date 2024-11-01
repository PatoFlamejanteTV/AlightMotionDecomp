package y7;

/* loaded from: classes5.dex */
public final class t extends q implements J7.c {

    /* renamed from: c, reason: collision with root package name */
    private final r f41276c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41277d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f41278e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f41279f;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final r f41280a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f41281b = null;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f41282c = null;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f41283d = null;

        public b(r rVar) {
            this.f41280a = rVar;
        }

        public t e() {
            return new t(this);
        }

        public b f(byte[] bArr) {
            this.f41283d = AbstractC4249A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f41282c = AbstractC4249A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f41281b = AbstractC4249A.c(bArr);
            return this;
        }
    }

    private t(b bVar) {
        super(false, bVar.f41280a.e());
        r rVar = bVar.f41280a;
        this.f41276c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int f8 = rVar.f();
        byte[] bArr = bVar.f41283d;
        if (bArr != null) {
            if (bArr.length == f8 + f8) {
                this.f41277d = 0;
                this.f41278e = AbstractC4249A.g(bArr, 0, f8);
                this.f41279f = AbstractC4249A.g(bArr, f8, f8);
                return;
            } else {
                if (bArr.length != f8 + 4 + f8) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f41277d = J7.f.a(bArr, 0);
                this.f41278e = AbstractC4249A.g(bArr, 4, f8);
                this.f41279f = AbstractC4249A.g(bArr, 4 + f8, f8);
                return;
            }
        }
        if (rVar.d() != null) {
            this.f41277d = rVar.d().a();
        } else {
            this.f41277d = 0;
        }
        byte[] bArr2 = bVar.f41281b;
        if (bArr2 == null) {
            this.f41278e = new byte[f8];
        } else {
            if (bArr2.length != f8) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f41278e = bArr2;
        }
        byte[] bArr3 = bVar.f41282c;
        if (bArr3 == null) {
            this.f41279f = new byte[f8];
        } else {
            if (bArr3.length != f8) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f41279f = bArr3;
        }
    }

    public r b() {
        return this.f41276c;
    }

    public byte[] c() {
        return AbstractC4249A.c(this.f41279f);
    }

    public byte[] d() {
        return AbstractC4249A.c(this.f41278e);
    }

    public byte[] e() {
        byte[] bArr;
        int f8 = this.f41276c.f();
        int i8 = this.f41277d;
        int i9 = 0;
        if (i8 != 0) {
            bArr = new byte[f8 + 4 + f8];
            J7.f.d(i8, bArr, 0);
            i9 = 4;
        } else {
            bArr = new byte[f8 + f8];
        }
        AbstractC4249A.e(bArr, this.f41278e, i9);
        AbstractC4249A.e(bArr, this.f41279f, i9 + f8);
        return bArr;
    }

    @Override // J7.c
    public byte[] getEncoded() {
        return e();
    }
}
