package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class G1 implements V1, InterfaceC3081n2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33267a;

    /* renamed from: b, reason: collision with root package name */
    private double f33268b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f33269c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f33269c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        if (this.f33267a) {
            this.f33267a = false;
        } else {
            d8 = this.f33269c.applyAsDouble(this.f33268b, d8);
        }
        this.f33268b = d8;
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
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        G1 g12 = (G1) v12;
        if (g12.f33267a) {
            return;
        }
        accept(g12.f33268b);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f33267a ? j$.util.C.a() : j$.util.C.d(this.f33268b);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33267a = true;
        this.f33268b = 0.0d;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC3081n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3134z0.e(this, d8);
    }
}
