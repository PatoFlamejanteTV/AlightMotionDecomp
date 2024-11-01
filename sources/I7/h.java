package I7;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private int[] f3819a;

    public h(byte[] bArr) {
        if (bArr.length > 4) {
            int e8 = f.e(bArr, 0);
            int a9 = e.a(e8 - 1);
            if (bArr.length == (e8 * a9) + 4) {
                this.f3819a = new int[e8];
                for (int i8 = 0; i8 < e8; i8++) {
                    this.f3819a[i8] = f.f(bArr, (i8 * a9) + 4, a9);
                }
                if (b(this.f3819a)) {
                    return;
                } else {
                    throw new IllegalArgumentException("invalid encoding");
                }
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    private boolean b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i8 : iArr) {
            if (i8 < 0 || i8 >= length || zArr[i8]) {
                return false;
            }
            zArr[i8] = true;
        }
        return true;
    }

    public byte[] a() {
        int length = this.f3819a.length;
        int a9 = e.a(length - 1);
        byte[] bArr = new byte[(length * a9) + 4];
        f.a(length, bArr, 0);
        for (int i8 = 0; i8 < length; i8++) {
            f.b(this.f3819a[i8], bArr, (i8 * a9) + 4, a9);
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return d.b(this.f3819a, ((h) obj).f3819a);
    }

    public int hashCode() {
        return J7.a.n(this.f3819a);
    }

    public String toString() {
        String str = "[" + this.f3819a[0];
        for (int i8 = 1; i8 < this.f3819a.length; i8++) {
            str = str + ", " + this.f3819a[i8];
        }
        return str + "]";
    }
}
