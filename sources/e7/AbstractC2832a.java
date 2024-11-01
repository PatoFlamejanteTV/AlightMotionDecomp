package e7;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2832a implements d7.e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f31726a = new byte[4];

    /* renamed from: b, reason: collision with root package name */
    private int f31727b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f31728c;

    @Override // d7.e
    public void b(byte[] bArr, int i8, int i9) {
        int i10 = 0;
        int max = Math.max(0, i9);
        if (this.f31727b != 0) {
            int i11 = 0;
            while (true) {
                if (i11 < max) {
                    byte[] bArr2 = this.f31726a;
                    int i12 = this.f31727b;
                    int i13 = i12 + 1;
                    this.f31727b = i13;
                    int i14 = i11 + 1;
                    bArr2[i12] = bArr[i11 + i8];
                    if (i13 == 4) {
                        j(bArr2, 0);
                        this.f31727b = 0;
                        i10 = i14;
                        break;
                    }
                    i11 = i14;
                } else {
                    i10 = i11;
                    break;
                }
            }
        }
        int i15 = ((max - i10) & (-4)) + i10;
        while (i10 < i15) {
            j(bArr, i8 + i10);
            i10 += 4;
        }
        while (i10 < max) {
            byte[] bArr3 = this.f31726a;
            int i16 = this.f31727b;
            this.f31727b = i16 + 1;
            bArr3[i16] = bArr[i10 + i8];
            i10++;
        }
        this.f31728c += max;
    }

    @Override // d7.e
    public void c(byte b9) {
        byte[] bArr = this.f31726a;
        int i8 = this.f31727b;
        int i9 = i8 + 1;
        this.f31727b = i9;
        bArr[i8] = b9;
        if (i9 == bArr.length) {
            j(bArr, 0);
            this.f31727b = 0;
        }
        this.f31728c++;
    }

    public void g() {
        long j8 = this.f31728c << 3;
        byte b9 = Byte.MIN_VALUE;
        while (true) {
            c(b9);
            if (this.f31727b != 0) {
                b9 = 0;
            } else {
                i(j8);
                h();
                return;
            }
        }
    }

    protected abstract void h();

    protected abstract void i(long j8);

    protected abstract void j(byte[] bArr, int i8);

    public void k() {
        this.f31728c = 0L;
        this.f31727b = 0;
        int i8 = 0;
        while (true) {
            byte[] bArr = this.f31726a;
            if (i8 < bArr.length) {
                bArr[i8] = 0;
                i8++;
            } else {
                return;
            }
        }
    }
}
