package y7;

import java.io.IOException;
import y7.j;

/* loaded from: classes5.dex */
public final class y extends p implements J7.c {

    /* renamed from: c, reason: collision with root package name */
    private final x f41295c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f41296d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f41297e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f41298f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f41299g;

    /* renamed from: h, reason: collision with root package name */
    private volatile C4250a f41300h;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final x f41301a;

        /* renamed from: b, reason: collision with root package name */
        private int f41302b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f41303c = -1;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f41304d = null;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f41305e = null;

        /* renamed from: f, reason: collision with root package name */
        private byte[] f41306f = null;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f41307g = null;

        /* renamed from: h, reason: collision with root package name */
        private C4250a f41308h = null;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f41309i = null;

        public b(x xVar) {
            this.f41301a = xVar;
        }

        public y j() {
            return new y(this);
        }

        public b k(C4250a c4250a) {
            this.f41308h = c4250a;
            return this;
        }

        public b l(int i8) {
            this.f41302b = i8;
            return this;
        }

        public b m(int i8) {
            this.f41303c = i8;
            return this;
        }

        public b n(byte[] bArr) {
            this.f41306f = AbstractC4249A.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.f41307g = AbstractC4249A.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f41305e = AbstractC4249A.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f41304d = AbstractC4249A.c(bArr);
            return this;
        }
    }

    private y(b bVar) {
        super(true, bVar.f41301a.f());
        x xVar = bVar.f41301a;
        this.f41295c = xVar;
        if (xVar == null) {
            throw new NullPointerException("params == null");
        }
        int h8 = xVar.h();
        byte[] bArr = bVar.f41309i;
        if (bArr != null) {
            int b9 = xVar.b();
            int a9 = J7.f.a(bArr, 0);
            if (!AbstractC4249A.l(b9, a9)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f41296d = AbstractC4249A.g(bArr, 4, h8);
            int i8 = 4 + h8;
            this.f41297e = AbstractC4249A.g(bArr, i8, h8);
            int i9 = i8 + h8;
            this.f41298f = AbstractC4249A.g(bArr, i9, h8);
            int i10 = i9 + h8;
            this.f41299g = AbstractC4249A.g(bArr, i10, h8);
            int i11 = i10 + h8;
            try {
                C4250a c4250a = (C4250a) AbstractC4249A.f(AbstractC4249A.g(bArr, i11, bArr.length - i11), C4250a.class);
                if (c4250a.b() != a9) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.f41300h = c4250a.h(bVar.f41301a.g());
                return;
            } catch (IOException e8) {
                throw new IllegalArgumentException(e8.getMessage(), e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalArgumentException(e9.getMessage(), e9);
            }
        }
        byte[] bArr2 = bVar.f41304d;
        if (bArr2 == null) {
            this.f41296d = new byte[h8];
        } else {
            if (bArr2.length != h8) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f41296d = bArr2;
        }
        byte[] bArr3 = bVar.f41305e;
        if (bArr3 == null) {
            this.f41297e = new byte[h8];
        } else {
            if (bArr3.length != h8) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f41297e = bArr3;
        }
        byte[] bArr4 = bVar.f41306f;
        if (bArr4 == null) {
            this.f41298f = new byte[h8];
        } else {
            if (bArr4.length != h8) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f41298f = bArr4;
        }
        byte[] bArr5 = bVar.f41307g;
        if (bArr5 == null) {
            this.f41299g = new byte[h8];
        } else {
            if (bArr5.length != h8) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f41299g = bArr5;
        }
        C4250a c4250a2 = bVar.f41308h;
        this.f41300h = c4250a2 == null ? (bVar.f41302b >= (1 << xVar.b()) + (-2) || bArr4 == null || bArr2 == null) ? new C4250a(xVar, (1 << xVar.b()) - 1, bVar.f41302b) : new C4250a(xVar, bArr4, bArr2, (j) new j.b().l(), bVar.f41302b) : c4250a2;
        if (bVar.f41303c >= 0 && bVar.f41303c != this.f41300h.c()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public x b() {
        return this.f41295c;
    }

    public byte[] c() {
        byte[] f8;
        synchronized (this) {
            try {
                int h8 = this.f41295c.h();
                byte[] bArr = new byte[h8 + 4 + h8 + h8 + h8];
                J7.f.d(this.f41300h.b(), bArr, 0);
                AbstractC4249A.e(bArr, this.f41296d, 4);
                int i8 = 4 + h8;
                AbstractC4249A.e(bArr, this.f41297e, i8);
                int i9 = i8 + h8;
                AbstractC4249A.e(bArr, this.f41298f, i9);
                AbstractC4249A.e(bArr, this.f41299g, i9 + h8);
                try {
                    f8 = J7.a.f(bArr, AbstractC4249A.p(this.f41300h));
                } catch (IOException e8) {
                    throw new RuntimeException("error serializing bds state: " + e8.getMessage());
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
