package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;

/* renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3054i0 extends AbstractC3071l2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f33519b;

    /* renamed from: c, reason: collision with root package name */
    C3034e0 f33520c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3059j0 f33521d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3054i0(C3059j0 c3059j0, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33521d = c3059j0;
        InterfaceC3096q2 interfaceC3096q22 = this.f33533a;
        Objects.requireNonNull(interfaceC3096q22);
        this.f33520c = new C3034e0(interfaceC3096q22);
    }

    @Override // j$.util.stream.InterfaceC3091p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        InterfaceC3089p0 interfaceC3089p0 = (InterfaceC3089p0) ((LongFunction) this.f33521d.f33525n).apply(j8);
        if (interfaceC3089p0 != null) {
            try {
                boolean z8 = this.f33519b;
                C3034e0 c3034e0 = this.f33520c;
                if (z8) {
                    j$.util.c0 spliterator = interfaceC3089p0.sequential().spliterator();
                    while (!this.f33533a.m() && spliterator.tryAdvance((LongConsumer) c3034e0)) {
                    }
                } else {
                    interfaceC3089p0.sequential().forEach(c3034e0);
                }
            } catch (Throwable th) {
                try {
                    interfaceC3089p0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC3089p0 != null) {
            interfaceC3089p0.close();
        }
    }

    @Override // j$.util.stream.AbstractC3071l2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33533a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC3071l2, j$.util.stream.InterfaceC3096q2
    public final boolean m() {
        this.f33519b = true;
        return this.f33533a.m();
    }
}
