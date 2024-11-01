package e7;

/* loaded from: classes5.dex */
public class h extends AbstractC2834c {
    @Override // d7.e
    public int a(byte[] bArr, int i8) {
        n();
        J7.f.i(this.f31741e, bArr, i8);
        J7.f.i(this.f31742f, bArr, i8 + 8);
        J7.f.i(this.f31743g, bArr, i8 + 16);
        J7.f.i(this.f31744h, bArr, i8 + 24);
        J7.f.i(this.f31745i, bArr, i8 + 32);
        J7.f.i(this.f31746j, bArr, i8 + 40);
        r();
        return 48;
    }

    @Override // d7.e
    public String e() {
        return "SHA-384";
    }

    @Override // d7.e
    public int f() {
        return 48;
    }

    @Override // e7.AbstractC2834c
    public void r() {
        super.r();
        this.f31741e = -3766243637369397544L;
        this.f31742f = 7105036623409894663L;
        this.f31743g = -7973340178411365097L;
        this.f31744h = 1526699215303891257L;
        this.f31745i = 7436329637833083697L;
        this.f31746j = -8163818279084223215L;
        this.f31747k = -2662702644619276377L;
        this.f31748l = 5167115440072839076L;
    }
}
