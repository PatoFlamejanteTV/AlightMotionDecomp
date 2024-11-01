package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class U1 implements V1, InterfaceC3091p2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33405a;

    /* renamed from: b, reason: collision with root package name */
    private long f33406b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f33407c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U1(LongBinaryOperator longBinaryOperator) {
        this.f33407c = longBinaryOperator;
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
    public final void accept(long j8) {
        if (this.f33405a) {
            this.f33405a = false;
        } else {
            j8 = this.f33407c.applyAsLong(this.f33406b, j8);
        }
        this.f33406b = j8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        U1 u12 = (U1) v12;
        if (u12.f33405a) {
            return;
        }
        accept(u12.f33406b);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f33405a ? j$.util.E.a() : j$.util.E.d(this.f33406b);
    }

    @Override // j$.util.stream.InterfaceC3091p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3134z0.i(this, l8);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33405a = true;
        this.f33406b = 0L;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
