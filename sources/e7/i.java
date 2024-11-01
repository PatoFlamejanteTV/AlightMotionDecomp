package e7;

/* loaded from: classes5.dex */
public class i extends AbstractC2833b {
    public i(int i8) {
        super(s(i8));
    }

    private static int s(int i8) {
        if (i8 != 224 && i8 != 256 && i8 != 384 && i8 != 512) {
            throw new IllegalArgumentException("'bitLength' " + i8 + " not supported for SHA-3");
        }
        return i8;
    }

    @Override // e7.AbstractC2833b, d7.e
    public int a(byte[] bArr, int i8) {
        l(2, 2);
        return super.a(bArr, i8);
    }

    @Override // d7.e
    public String e() {
        return "SHA3-" + this.f31734e;
    }
}
