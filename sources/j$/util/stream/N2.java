package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class N2 extends B2 {

    /* renamed from: c, reason: collision with root package name */
    private double[] f33326c;

    /* renamed from: d, reason: collision with root package name */
    private int f33327d;

    @Override // j$.util.stream.InterfaceC3081n2, j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        double[] dArr = this.f33326c;
        int i8 = this.f33327d;
        this.f33327d = i8 + 1;
        dArr[i8] = d8;
    }

    @Override // j$.util.stream.AbstractC3061j2, j$.util.stream.InterfaceC3096q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f33326c, 0, this.f33327d);
        long j8 = this.f33327d;
        InterfaceC3096q2 interfaceC3096q2 = this.f33526a;
        interfaceC3096q2.k(j8);
        if (this.f33238b) {
            while (i8 < this.f33327d && !interfaceC3096q2.m()) {
                interfaceC3096q2.accept(this.f33326c[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f33327d) {
                interfaceC3096q2.accept(this.f33326c[i8]);
                i8++;
            }
        }
        interfaceC3096q2.j();
        this.f33326c = null;
    }

    @Override // j$.util.stream.AbstractC3061j2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33326c = new double[(int) j8];
    }
}
