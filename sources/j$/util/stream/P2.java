package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class P2 extends D2 {

    /* renamed from: c, reason: collision with root package name */
    private long[] f33343c;

    /* renamed from: d, reason: collision with root package name */
    private int f33344d;

    @Override // j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        long[] jArr = this.f33343c;
        int i8 = this.f33344d;
        this.f33344d = i8 + 1;
        jArr[i8] = j8;
    }

    @Override // j$.util.stream.AbstractC3071l2, j$.util.stream.InterfaceC3096q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f33343c, 0, this.f33344d);
        long j8 = this.f33344d;
        InterfaceC3096q2 interfaceC3096q2 = this.f33533a;
        interfaceC3096q2.k(j8);
        if (this.f33250b) {
            while (i8 < this.f33344d && !interfaceC3096q2.m()) {
                interfaceC3096q2.accept(this.f33343c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f33344d) {
                interfaceC3096q2.accept(this.f33343c[i8]);
                i8++;
            }
        }
        interfaceC3096q2.j();
        this.f33343c = null;
    }

    @Override // j$.util.stream.AbstractC3071l2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33343c = new long[(int) j8];
    }
}
