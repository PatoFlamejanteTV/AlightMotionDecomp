package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class R1 implements V1, InterfaceC3086o2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f33357a;

    /* renamed from: b, reason: collision with root package name */
    private int f33358b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f33359c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R1(IntBinaryOperator intBinaryOperator) {
        this.f33359c = intBinaryOperator;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void accept(double d8) {
        AbstractC3134z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void accept(int i8) {
        if (this.f33357a) {
            this.f33357a = false;
        } else {
            i8 = this.f33359c.applyAsInt(this.f33358b, i8);
        }
        this.f33358b = i8;
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

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.V1
    public final void f(V1 v12) {
        R1 r12 = (R1) v12;
        if (r12.f33357a) {
            return;
        }
        accept(r12.f33358b);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f33357a ? j$.util.D.a() : j$.util.D.d(this.f33358b);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33357a = true;
        this.f33358b = 0;
    }

    @Override // j$.util.stream.InterfaceC3086o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3134z0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}