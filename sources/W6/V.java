package W6;

/* loaded from: classes5.dex */
public class V extends C1483i {
    public V(byte[] bArr) {
        super(bArr);
    }

    private byte[] A() {
        byte[] bArr = this.f10850a;
        if (bArr[bArr.length - 1] == 90) {
            if (!v()) {
                byte[] bArr2 = this.f10850a;
                byte[] bArr3 = new byte[bArr2.length + 4];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
                System.arraycopy(J7.h.d("0000Z"), 0, bArr3, this.f10850a.length - 1, 5);
                return bArr3;
            }
            if (!y()) {
                byte[] bArr4 = this.f10850a;
                byte[] bArr5 = new byte[bArr4.length + 2];
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
                System.arraycopy(J7.h.d("00Z"), 0, bArr5, this.f10850a.length - 1, 3);
                return bArr5;
            }
            if (u()) {
                int length = this.f10850a.length - 2;
                while (length > 0 && this.f10850a[length] == 48) {
                    length--;
                }
                byte[] bArr6 = this.f10850a;
                if (bArr6[length] == 46) {
                    byte[] bArr7 = new byte[length + 1];
                    System.arraycopy(bArr6, 0, bArr7, 0, length);
                    bArr7[length] = 90;
                    return bArr7;
                }
                byte[] bArr8 = new byte[length + 2];
                int i8 = length + 1;
                System.arraycopy(bArr6, 0, bArr8, 0, i8);
                bArr8[i8] = 90;
                return bArr8;
            }
            return this.f10850a;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.C1483i, W6.AbstractC1492s
    public void m(C1491q c1491q, boolean z8) {
        c1491q.n(z8, 24, A());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.C1483i, W6.AbstractC1492s
    public int n() {
        int length = A().length;
        return E0.a(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.C1483i, W6.AbstractC1492s
    public AbstractC1492s s() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // W6.C1483i, W6.AbstractC1492s
    public AbstractC1492s t() {
        return this;
    }
}
