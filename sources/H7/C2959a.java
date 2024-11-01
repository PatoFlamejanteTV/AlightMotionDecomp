package h7;

/* renamed from: h7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2959a implements InterfaceC2960b {

    /* renamed from: a, reason: collision with root package name */
    private long[] f32655a;

    @Override // h7.InterfaceC2960b
    public void a(byte[] bArr) {
        this.f32655a = d.d(bArr);
    }

    @Override // h7.InterfaceC2960b
    public void b(long j8, byte[] bArr) {
        long[] l8 = d.l();
        if (j8 > 0) {
            long[] jArr = new long[2];
            d.f(this.f32655a, jArr);
            do {
                if ((1 & j8) != 0) {
                    d.j(l8, jArr);
                }
                d.m(jArr, jArr);
                j8 >>>= 1;
            } while (j8 > 0);
        }
        d.b(l8, bArr);
    }
}
