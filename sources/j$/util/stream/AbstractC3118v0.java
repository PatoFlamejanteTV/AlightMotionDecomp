package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3118v0 implements InterfaceC3096q2 {

    /* renamed from: a, reason: collision with root package name */
    boolean f33593a;

    /* renamed from: b, reason: collision with root package name */
    boolean f33594b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3118v0(EnumC3122w0 enumC3122w0) {
        boolean z8;
        z8 = enumC3122w0.f33603b;
        this.f33594b = !z8;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public /* synthetic */ void accept(double d8) {
        AbstractC3134z0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public /* synthetic */ void accept(int i8) {
        AbstractC3134z0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC3096q2, j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public /* synthetic */ void accept(long j8) {
        AbstractC3134z0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void k(long j8) {
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final boolean m() {
        return this.f33593a;
    }
}
