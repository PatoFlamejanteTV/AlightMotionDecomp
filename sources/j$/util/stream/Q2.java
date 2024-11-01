package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class Q2 extends E2 {

    /* renamed from: d, reason: collision with root package name */
    private Object[] f33353d;

    /* renamed from: e, reason: collision with root package name */
    private int f33354e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f33353d;
        int i8 = this.f33354e;
        this.f33354e = i8 + 1;
        objArr[i8] = obj;
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public final void j() {
        int i8 = 0;
        Arrays.sort(this.f33353d, 0, this.f33354e, this.f33256b);
        long j8 = this.f33354e;
        InterfaceC3096q2 interfaceC3096q2 = this.f33538a;
        interfaceC3096q2.k(j8);
        if (this.f33257c) {
            while (i8 < this.f33354e && !interfaceC3096q2.m()) {
                interfaceC3096q2.accept((InterfaceC3096q2) this.f33353d[i8]);
                i8++;
            }
        } else {
            while (i8 < this.f33354e) {
                interfaceC3096q2.accept((InterfaceC3096q2) this.f33353d[i8]);
                i8++;
            }
        }
        interfaceC3096q2.j();
        this.f33353d = null;
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33353d = new Object[(int) j8];
    }
}
