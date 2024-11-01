package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class K1 extends W1 implements V1 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f33300b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BiFunction f33301c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BinaryOperator f33302d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f33300b = obj;
        this.f33301c = biFunction;
        this.f33302d = binaryOperator;
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
        this.f33416a = this.f33301c.apply(this.f33416a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        this.f33416a = this.f33302d.apply(this.f33416a, ((K1) v12).f33416a);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33416a = this.f33300b;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
