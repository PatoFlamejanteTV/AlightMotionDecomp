package y7;

import y7.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final m f41229a;

    /* renamed from: b, reason: collision with root package name */
    private final h f41230b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f41231c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f41232d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(m mVar) {
        if (mVar != null) {
            this.f41229a = mVar;
            int c8 = mVar.c();
            this.f41230b = new h(mVar.b(), c8);
            this.f41231c = new byte[c8];
            this.f41232d = new byte[c8];
            return;
        }
        throw new NullPointerException("params == null");
    }

    private byte[] a(byte[] bArr, int i8, int i9, j jVar) {
        int c8 = this.f41229a.c();
        if (bArr != null) {
            if (bArr.length == c8) {
                if (jVar != null) {
                    if (jVar.d() != null) {
                        int i10 = i8 + i9;
                        if (i10 <= this.f41229a.d() - 1) {
                            if (i9 == 0) {
                                return bArr;
                            }
                            byte[] a9 = a(bArr, i8, i9 - 1, jVar);
                            j jVar2 = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).n(jVar.e()).o(i10 - 1).f(0)).l();
                            byte[] c9 = this.f41230b.c(this.f41232d, jVar2.d());
                            byte[] c10 = this.f41230b.c(this.f41232d, ((j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar2.b())).h(jVar2.c())).p(jVar2.g()).n(jVar2.e()).o(jVar2.f()).f(1)).l()).d());
                            byte[] bArr2 = new byte[c8];
                            for (int i11 = 0; i11 < c8; i11++) {
                                bArr2[i11] = (byte) (a9[i11] ^ c10[i11]);
                            }
                            return this.f41230b.a(c9, bArr2);
                        }
                        throw new IllegalArgumentException("max chain length must not be greater than w");
                    }
                    throw new NullPointerException("otsHashAddress byte array == null");
                }
                throw new NullPointerException("otsHashAddress == null");
            }
            throw new IllegalArgumentException("startHash needs to be " + c8 + "bytes");
        }
        throw new NullPointerException("startHash == null");
    }

    private byte[] b(int i8) {
        if (i8 >= 0 && i8 < this.f41229a.a()) {
            return this.f41230b.c(this.f41231c, AbstractC4249A.q(i8, 32));
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public h c() {
        return this.f41230b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m d() {
        return this.f41229a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n e(j jVar) {
        if (jVar != null) {
            byte[][] bArr = new byte[this.f41229a.a()];
            for (int i8 = 0; i8 < this.f41229a.a(); i8++) {
                jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).n(i8).o(jVar.f()).f(jVar.a())).l();
                bArr[i8] = a(b(i8), 0, this.f41229a.d() - 1, jVar);
            }
            return new n(this.f41229a, bArr);
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] f() {
        return J7.a.d(this.f41232d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] g(byte[] bArr, j jVar) {
        return this.f41230b.c(bArr, ((j) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(jVar.g()).l()).d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == this.f41229a.c()) {
                if (bArr2 != null) {
                    if (bArr2.length == this.f41229a.c()) {
                        this.f41231c = bArr;
                        this.f41232d = bArr2;
                        return;
                    }
                    throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
                }
                throw new NullPointerException("publicSeed == null");
            }
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        throw new NullPointerException("secretKeySeed == null");
    }
}
