package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3021b2 extends W1 implements V1 {

    /* renamed from: b, reason: collision with root package name */
    long f33451b;

    public /* synthetic */ void accept(double d8) {
        AbstractC3134z0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i8) {
        AbstractC3134z0.k();
        throw null;
    }

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
    public final void k(long j8) {
        this.f33451b = 0L;
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
