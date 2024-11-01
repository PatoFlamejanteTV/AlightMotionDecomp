package y7;

/* loaded from: classes5.dex */
public final class z extends p implements J7.c {

    /* renamed from: c, reason: collision with root package name */
    private final x f41310c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41311d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f41312e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f41313f;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final x f41314a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f41315b = null;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f41316c = null;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f41317d = null;

        public b(x xVar) {
            this.f41314a = xVar;
        }

        public z e() {
            return new z(this);
        }

        public b f(byte[] bArr) {
            this.f41317d = AbstractC4249A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f41316c = AbstractC4249A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f41315b = AbstractC4249A.c(bArr);
            return this;
        }
    }

    private z(b bVar) {
        super(false, bVar.f41314a.f());
        x xVar = bVar.f41314a;
        this.f41310c = xVar;
        if (xVar == null) {
            throw new NullPointerException("params == null");
        }
        int h8 = xVar.h();
        byte[] bArr = bVar.f41317d;
        if (bArr != null) {
            if (bArr.length == h8 + h8) {
                this.f41311d = 0;
                this.f41312e = AbstractC4249A.g(bArr, 0, h8);
                this.f41313f = AbstractC4249A.g(bArr, h8, h8);
                return;
            } else {
                if (bArr.length != h8 + 4 + h8) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f41311d = J7.f.a(bArr, 0);
                this.f41312e = AbstractC4249A.g(bArr, 4, h8);
                this.f41313f = AbstractC4249A.g(bArr, 4 + h8, h8);
                return;
            }
        }
        if (xVar.e() != null) {
            this.f41311d = xVar.e().a();
        } else {
            this.f41311d = 0;
        }
        byte[] bArr2 = bVar.f41315b;
        if (bArr2 == null) {
            this.f41312e = new byte[h8];
        } else {
            if (bArr2.length != h8) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f41312e = bArr2;
        }
        byte[] bArr3 = bVar.f41316c;
        if (bArr3 == null) {
            this.f41313f = new byte[h8];
        } else {
            if (bArr3.length != h8) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f41313f = bArr3;
        }
    }

    public x b() {
        return this.f41310c;
    }

    public byte[] c() {
        return AbstractC4249A.c(this.f41313f);
    }

    public byte[] d() {
        return AbstractC4249A.c(this.f41312e);
    }

    public byte[] e() {
        byte[] bArr;
        int h8 = this.f41310c.h();
        int i8 = this.f41311d;
        int i9 = 0;
        if (i8 != 0) {
            bArr = new byte[h8 + 4 + h8];
            J7.f.d(i8, bArr, 0);
            i9 = 4;
        } else {
            bArr = new byte[h8 + h8];
        }
        AbstractC4249A.e(bArr, this.f41312e, i9);
        AbstractC4249A.e(bArr, this.f41313f, i9 + h8);
        return bArr;
    }

    @Override // J7.c
    public byte[] getEncoded() {
        return e();
    }
}
