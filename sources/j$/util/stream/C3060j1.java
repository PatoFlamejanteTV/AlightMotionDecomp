package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3060j1 extends V2 implements H0, B0 {
    @Override // j$.util.stream.B0, j$.util.stream.D0
    public final H0 a() {
        return this;
    }

    @Override // j$.util.stream.D0
    public final L0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3134z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j8) {
        AbstractC3134z0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.K0, j$.util.stream.L0
    public final K0 b(int i8) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.L0
    public final /* bridge */ /* synthetic */ L0 b(int i8) {
        b(i8);
        throw null;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.K0
    public final Object d() {
        return (int[]) super.d();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.K0
    public final void e(Object obj) {
        super.e((IntConsumer) obj);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void j() {
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        clear();
        u(j8);
    }

    @Override // j$.util.stream.InterfaceC3086o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3134z0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC3134z0.m(this, intFunction);
    }

    @Override // j$.util.stream.L0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.K0
    public final void q(int i8, Object obj) {
        super.q(i8, (int[]) obj);
    }

    @Override // j$.util.stream.V2, j$.util.stream.Z2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.V2, j$.util.stream.Z2, java.lang.Iterable
    public final j$.util.f0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.L0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void h(Integer[] numArr, int i8) {
        AbstractC3134z0.o(this, numArr, i8);
    }

    @Override // j$.util.stream.L0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ H0 g(long j8, long j9, IntFunction intFunction) {
        return AbstractC3134z0.u(this, j8, j9);
    }
}
