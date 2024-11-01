package q7;

/* renamed from: q7.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC3843l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(C3836e c3836e, byte[] bArr, int i8, byte[] bArr2) {
        boolean z8;
        d7.e a9 = AbstractC3833b.a(c3836e.b());
        byte[] b9 = C3832a.f().d(bArr).i(i8).h(-32640).g(0, 22).b();
        a9.b(b9, 0, b9.length);
        d7.e a10 = AbstractC3833b.a(c3836e.b());
        byte[] b10 = C3832a.f().d(bArr).i(i8).g(0, a10.f() + 23).b();
        C3845n c3845n = new C3845n(bArr, bArr2, AbstractC3833b.a(c3836e.b()));
        c3845n.d(i8);
        c3845n.c(0);
        int d8 = c3836e.d();
        int c8 = c3836e.c();
        int g8 = (1 << c3836e.g()) - 1;
        for (int i9 = 0; i9 < d8; i9++) {
            if (i9 < d8 - 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            c3845n.a(b10, z8, 23);
            J7.f.m((short) i9, b10, 20);
            for (int i10 = 0; i10 < g8; i10++) {
                b10[22] = (byte) i10;
                a10.b(b10, 0, b10.length);
                a10.a(b10, 23);
            }
            a9.b(b10, 23, c8);
        }
        byte[] bArr3 = new byte[a9.f()];
        a9.a(bArr3, 0);
        return bArr3;
    }
}
