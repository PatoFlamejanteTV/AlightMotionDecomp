package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
abstract class W0 extends N0 implements K0 {
    @Override // j$.util.stream.K0
    public final Object d() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object c8 = c((int) count);
        q(0, c8);
        return c8;
    }

    @Override // j$.util.stream.K0
    public final void e(Object obj) {
        ((K0) this.f33320a).e(obj);
        ((K0) this.f33321b).e(obj);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC3134z0.m(this, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void q(int i8, Object obj) {
        L0 l02 = this.f33320a;
        ((K0) l02).q(i8, obj);
        ((K0) this.f33321b).q(i8 + ((int) ((K0) l02).count()), obj);
    }

    public final String toString() {
        long count = count();
        String name = getClass().getName();
        return count < 32 ? String.format("%s[%s.%s]", name, this.f33320a, this.f33321b) : String.format("%s[size=%d]", name, Long.valueOf(count()));
    }
}
