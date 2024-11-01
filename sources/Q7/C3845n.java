package q7;

/* renamed from: q7.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3845n {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f37654a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f37655b;

    /* renamed from: c, reason: collision with root package name */
    private final d7.e f37656c;

    /* renamed from: d, reason: collision with root package name */
    private int f37657d;

    /* renamed from: e, reason: collision with root package name */
    private int f37658e;

    public C3845n(byte[] bArr, byte[] bArr2, d7.e eVar) {
        this.f37654a = bArr;
        this.f37655b = bArr2;
        this.f37656c = eVar;
    }

    public void a(byte[] bArr, boolean z8, int i8) {
        b(bArr, i8);
        if (z8) {
            this.f37658e++;
        }
    }

    public byte[] b(byte[] bArr, int i8) {
        if (bArr.length >= this.f37656c.f()) {
            d7.e eVar = this.f37656c;
            byte[] bArr2 = this.f37654a;
            eVar.b(bArr2, 0, bArr2.length);
            this.f37656c.c((byte) (this.f37657d >>> 24));
            this.f37656c.c((byte) (this.f37657d >>> 16));
            this.f37656c.c((byte) (this.f37657d >>> 8));
            this.f37656c.c((byte) this.f37657d);
            this.f37656c.c((byte) (this.f37658e >>> 8));
            this.f37656c.c((byte) this.f37658e);
            this.f37656c.c((byte) -1);
            d7.e eVar2 = this.f37656c;
            byte[] bArr3 = this.f37655b;
            eVar2.b(bArr3, 0, bArr3.length);
            this.f37656c.a(bArr, i8);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    public void c(int i8) {
        this.f37658e = i8;
    }

    public void d(int i8) {
        this.f37657d = i8;
    }
}
