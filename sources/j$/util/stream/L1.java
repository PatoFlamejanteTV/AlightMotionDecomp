package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class L1 implements V1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33305a;

    /* renamed from: b, reason: collision with root package name */
    private Object f33306b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f33307c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L1(BinaryOperator binaryOperator) {
        this.f33307c = binaryOperator;
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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        if (this.f33305a) {
            this.f33305a = false;
        } else {
            obj = this.f33307c.apply(this.f33306b, obj);
        }
        this.f33306b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        L1 l12 = (L1) v12;
        if (l12.f33305a) {
            return;
        }
        o(l12.f33306b);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f33305a ? j$.util.B.a() : j$.util.B.d(this.f33306b);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33305a = true;
        this.f33306b = null;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
