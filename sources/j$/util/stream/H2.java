package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class H2 extends D2 {

    /* renamed from: c, reason: collision with root package name */
    private X2 f33281c;

    @Override // j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        this.f33281c.accept(j8);
    }

    @Override // j$.util.stream.AbstractC3071l2, j$.util.stream.InterfaceC3096q2
    public final void j() {
        long[] jArr = (long[]) this.f33281c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC3096q2 interfaceC3096q2 = this.f33533a;
        interfaceC3096q2.k(length);
        int i8 = 0;
        if (this.f33250b) {
            int length2 = jArr.length;
            while (i8 < length2) {
                long j8 = jArr[i8];
                if (interfaceC3096q2.m()) {
                    break;
                }
                interfaceC3096q2.accept(j8);
                i8++;
            }
        } else {
            int length3 = jArr.length;
            while (i8 < length3) {
                interfaceC3096q2.accept(jArr[i8]);
                i8++;
            }
        }
        interfaceC3096q2.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.X2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    @Override // j$.util.stream.AbstractC3071l2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33281c = j8 > 0 ? new Z2((int) j8) : new Z2();
    }
}
