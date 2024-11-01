package y7;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class s extends q implements J7.c {

    /* renamed from: c, reason: collision with root package name */
    private final r f41259c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f41260d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f41261e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f41262f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f41263g;

    /* renamed from: h, reason: collision with root package name */
    private volatile long f41264h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C4251b f41265i;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final r f41266a;

        /* renamed from: b, reason: collision with root package name */
        private long f41267b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f41268c = -1;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f41269d = null;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f41270e = null;

        /* renamed from: f, reason: collision with root package name */
        private byte[] f41271f = null;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f41272g = null;

        /* renamed from: h, reason: collision with root package name */
        private C4251b f41273h = null;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f41274i = null;

        /* renamed from: j, reason: collision with root package name */
        private x f41275j = null;

        public b(r rVar) {
            this.f41266a = rVar;
        }

        public s k() {
            return new s(this);
        }

        public b l(C4251b c4251b) {
            if (c4251b.b() == 0) {
                this.f41273h = new C4251b(c4251b, (1 << this.f41266a.a()) - 1);
            } else {
                this.f41273h = c4251b;
            }
            return this;
        }

        public b m(long j8) {
            this.f41267b = j8;
            return this;
        }

        public b n(long j8) {
            this.f41268c = j8;
            return this;
        }

        public b o(byte[] bArr) {
            this.f41271f = AbstractC4249A.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f41272g = AbstractC4249A.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f41270e = AbstractC4249A.c(bArr);
            return this;
        }

        public b r(byte[] bArr) {
            this.f41269d = AbstractC4249A.c(bArr);
            return this;
        }
    }

    private s(b bVar) {
        super(true, bVar.f41266a.e());
        r rVar = bVar.f41266a;
        this.f41259c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int f8 = rVar.f();
        byte[] bArr = bVar.f41274i;
        if (bArr != null) {
            if (bVar.f41275j == null) {
                throw new NullPointerException("xmss == null");
            }
            int a9 = rVar.a();
            int i8 = (a9 + 7) / 8;
            this.f41264h = AbstractC4249A.a(bArr, 0, i8);
            if (!AbstractC4249A.l(a9, this.f41264h)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f41260d = AbstractC4249A.g(bArr, i8, f8);
            int i9 = i8 + f8;
            this.f41261e = AbstractC4249A.g(bArr, i9, f8);
            int i10 = i9 + f8;
            this.f41262f = AbstractC4249A.g(bArr, i10, f8);
            int i11 = i10 + f8;
            this.f41263g = AbstractC4249A.g(bArr, i11, f8);
            int i12 = i11 + f8;
            try {
                this.f41265i = ((C4251b) AbstractC4249A.f(AbstractC4249A.g(bArr, i12, bArr.length - i12), C4251b.class)).f(bVar.f41275j.g());
                return;
            } catch (IOException e8) {
                throw new IllegalArgumentException(e8.getMessage(), e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalArgumentException(e9.getMessage(), e9);
            }
        }
        this.f41264h = bVar.f41267b;
        byte[] bArr2 = bVar.f41269d;
        if (bArr2 == null) {
            this.f41260d = new byte[f8];
        } else {
            if (bArr2.length != f8) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f41260d = bArr2;
        }
        byte[] bArr3 = bVar.f41270e;
        if (bArr3 == null) {
            this.f41261e = new byte[f8];
        } else {
            if (bArr3.length != f8) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f41261e = bArr3;
        }
        byte[] bArr4 = bVar.f41271f;
        if (bArr4 == null) {
            this.f41262f = new byte[f8];
        } else {
            if (bArr4.length != f8) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f41262f = bArr4;
        }
        byte[] bArr5 = bVar.f41272g;
        if (bArr5 == null) {
            this.f41263g = new byte[f8];
        } else {
            if (bArr5.length != f8) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f41263g = bArr5;
        }
        C4251b c4251b = bVar.f41273h;
        if (c4251b == null) {
            c4251b = (!AbstractC4249A.l(rVar.a(), bVar.f41267b) || bArr4 == null || bArr2 == null) ? new C4251b(bVar.f41268c + 1) : new C4251b(rVar, bVar.f41267b, bArr4, bArr2);
        }
        this.f41265i = c4251b;
        if (bVar.f41268c >= 0 && bVar.f41268c != this.f41265i.b()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public r b() {
        return this.f41259c;
    }

    public byte[] c() {
        byte[] f8;
        synchronized (this) {
            try {
                int f9 = this.f41259c.f();
                int a9 = (this.f41259c.a() + 7) / 8;
                byte[] bArr = new byte[a9 + f9 + f9 + f9 + f9];
                AbstractC4249A.e(bArr, AbstractC4249A.q(this.f41264h, a9), 0);
                AbstractC4249A.e(bArr, this.f41260d, a9);
                int i8 = a9 + f9;
                AbstractC4249A.e(bArr, this.f41261e, i8);
                int i9 = i8 + f9;
                AbstractC4249A.e(bArr, this.f41262f, i9);
                AbstractC4249A.e(bArr, this.f41263g, i9 + f9);
                try {
                    f8 = J7.a.f(bArr, AbstractC4249A.p(this.f41265i));
                } catch (IOException e8) {
                    throw new IllegalStateException("error serializing bds state: " + e8.getMessage(), e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8;
    }

    @Override // J7.c
    public byte[] getEncoded() {
        byte[] c8;
        synchronized (this) {
            c8 = c();
        }
        return c8;
    }
}
