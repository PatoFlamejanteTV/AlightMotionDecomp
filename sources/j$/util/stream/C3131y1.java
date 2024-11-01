package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3131y1 extends C3017a3 implements L0, D0 {
    @Override // j$.util.stream.D0
    public final L0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3134z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void accept(int i8) {
        AbstractC3134z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3134z0.l();
        throw null;
    }

    @Override // j$.util.stream.L0
    public final L0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ L0 g(long j8, long j9, IntFunction intFunction) {
        return AbstractC3134z0.w(this, j8, j9, intFunction);
    }

    @Override // j$.util.stream.L0
    public final void h(Object[] objArr, int i8) {
        long j8 = i8;
        long count = count() + j8;
        if (count > objArr.length || count < j8) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f33460c == 0) {
            System.arraycopy(this.f33438e, 0, objArr, i8, this.f33459b);
            return;
        }
        for (int i9 = 0; i9 < this.f33460c; i9++) {
            Object[] objArr2 = this.f33439f[i9];
            System.arraycopy(objArr2, 0, objArr, i8, objArr2.length);
            i8 += this.f33439f[i9].length;
        }
        int i10 = this.f33459b;
        if (i10 > 0) {
            System.arraycopy(this.f33438e, 0, objArr, i8, i10);
        }
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void j() {
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        clear();
        r(j8);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.L0
    public final Object[] n(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int p() {
        return 0;
    }
}
