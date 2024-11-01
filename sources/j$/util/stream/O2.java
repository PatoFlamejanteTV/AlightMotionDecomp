package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class O2 extends C2 {

    /* renamed from: c, reason: collision with root package name */
    private int[] f33335c;

    /* renamed from: d, reason: collision with root package name */
    private int f33336d;

    @Override // j$.util.stream.InterfaceC3086o2, j$.util.stream.InterfaceC3096q2
    public final void accept(int i8) {
        int[] iArr = this.f33335c;
        int i9 = this.f33336d;
        this.f33336d = i9 + 1;
        iArr[i9] = i8;
    }

    @Override // j$.util.stream.AbstractC3066k2, j$.util.stream.InterfaceC3096q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f33335c, 0, this.f33336d);
        long j8 = this.f33336d;
        InterfaceC3096q2 interfaceC3096q2 = this.f33529a;
        interfaceC3096q2.k(j8);
        if (this.f33244b) {
            while (i8 < this.f33336d && !interfaceC3096q2.m()) {
                interfaceC3096q2.accept(this.f33335c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f33336d) {
                interfaceC3096q2.accept(this.f33335c[i8]);
                i8++;
            }
        }
        interfaceC3096q2.j();
        this.f33335c = null;
    }

    @Override // j$.util.stream.AbstractC3066k2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33335c = new int[(int) j8];
    }
}
