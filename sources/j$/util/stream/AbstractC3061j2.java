package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3061j2 implements InterfaceC3081n2 {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC3096q2 f33526a;

    public AbstractC3061j2(InterfaceC3096q2 interfaceC3096q2) {
        this.f33526a = (InterfaceC3096q2) Objects.requireNonNull(interfaceC3096q2);
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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public void j() {
        this.f33526a.j();
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public void k(long j8) {
        this.f33526a.k(j8);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public boolean m() {
        return this.f33526a.m();
    }

    @Override // j$.util.stream.InterfaceC3081n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3134z0.e(this, d8);
    }
}
