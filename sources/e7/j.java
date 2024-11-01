package e7;

/* loaded from: classes5.dex */
public class j extends AbstractC2834c {
    @Override // d7.e
    public int a(byte[] bArr, int i8) {
        n();
        J7.f.i(this.f31741e, bArr, i8);
        J7.f.i(this.f31742f, bArr, i8 + 8);
        J7.f.i(this.f31743g, bArr, i8 + 16);
        J7.f.i(this.f31744h, bArr, i8 + 24);
        J7.f.i(this.f31745i, bArr, i8 + 32);
        J7.f.i(this.f31746j, bArr, i8 + 40);
        J7.f.i(this.f31747k, bArr, i8 + 48);
        J7.f.i(this.f31748l, bArr, i8 + 56);
        r();
        return 64;
    }

    @Override // d7.e
    public String e() {
        return "SHA-512";
    }

    @Override // d7.e
    public int f() {
        return 64;
    }

    @Override // e7.AbstractC2834c
    public void r() {
        super.r();
        this.f31741e = 7640891576956012808L;
        this.f31742f = -4942790177534073029L;
        this.f31743g = 4354685564936845355L;
        this.f31744h = -6534734903238641935L;
        this.f31745i = 5840696475078001361L;
        this.f31746j = -7276294671716946913L;
        this.f31747k = 2270897969802886507L;
        this.f31748l = 6620516959819538809L;
    }
}
