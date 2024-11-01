package y7;

import W6.C1488n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final d7.e f41215a;

    /* renamed from: b, reason: collision with root package name */
    private final int f41216b;

    /* JADX INFO: Access modifiers changed from: protected */
    public h(C1488n c1488n, int i8) {
        if (c1488n != null) {
            this.f41215a = f.a(c1488n);
            this.f41216b = i8;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    private byte[] d(int i8, byte[] bArr, byte[] bArr2) {
        byte[] q8 = AbstractC4249A.q(i8, this.f41216b);
        this.f41215a.b(q8, 0, q8.length);
        this.f41215a.b(bArr, 0, bArr.length);
        this.f41215a.b(bArr2, 0, bArr2.length);
        int i9 = this.f41216b;
        byte[] bArr3 = new byte[i9];
        d7.e eVar = this.f41215a;
        if (eVar instanceof d7.i) {
            ((d7.i) eVar).d(bArr3, 0, i9);
        } else {
            eVar.a(bArr3, 0);
        }
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i8 = this.f41216b;
        if (length == i8) {
            if (bArr2.length == i8) {
                return d(0, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong in length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i8 = this.f41216b;
        if (length == i8) {
            if (bArr2.length == i8 * 2) {
                return d(1, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong in length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.f41216b) {
            if (bArr2.length == 32) {
                return d(3, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong address length");
        }
        throw new IllegalArgumentException("wrong key length");
    }
}
