package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3076m2 implements InterfaceC3096q2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3096q2 f33538a;

    public AbstractC3076m2(InterfaceC3096q2 interfaceC3096q2) {
        this.f33538a = (InterfaceC3096q2) Objects.requireNonNull(interfaceC3096q2);
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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public void j() {
        this.f33538a.j();
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public void k(long j8) {
        this.f33538a.k(j8);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public boolean m() {
        return this.f33538a.m();
    }
}
