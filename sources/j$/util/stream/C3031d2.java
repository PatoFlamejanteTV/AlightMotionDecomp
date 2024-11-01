package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3031d2 extends AbstractC3076m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33462b = 1;

    /* renamed from: c, reason: collision with root package name */
    boolean f33463c;

    /* renamed from: d, reason: collision with root package name */
    Object f33464d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC3018b f33465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3031d2(Y y8, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33465e = y8;
        InterfaceC3096q2 interfaceC3096q22 = this.f33538a;
        Objects.requireNonNull(interfaceC3096q22);
        this.f33464d = new W(interfaceC3096q22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3031d2(C3059j0 c3059j0, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33465e = c3059j0;
        InterfaceC3096q2 interfaceC3096q22 = this.f33538a;
        Objects.requireNonNull(interfaceC3096q22);
        this.f33464d = new C3034e0(interfaceC3096q22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3031d2(C3121w c3121w, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33465e = c3121w;
        InterfaceC3096q2 interfaceC3096q22 = this.f33538a;
        Objects.requireNonNull(interfaceC3096q22);
        this.f33464d = new C3102s(interfaceC3096q22);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        switch (this.f33462b) {
            case 0:
                InterfaceC3089p0 interfaceC3089p0 = (InterfaceC3089p0) ((Function) ((C3059j0) this.f33465e).f33525n).apply(obj);
                if (interfaceC3089p0 != null) {
                    try {
                        boolean z8 = this.f33463c;
                        C3034e0 c3034e0 = (C3034e0) this.f33464d;
                        if (z8) {
                            j$.util.c0 spliterator = interfaceC3089p0.sequential().spliterator();
                            while (!this.f33538a.m() && spliterator.tryAdvance((LongConsumer) c3034e0)) {
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
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((Function) ((Y) this.f33465e).f33421n).apply(obj);
                if (intStream != null) {
                    try {
                        boolean z9 = this.f33463c;
                        W w8 = (W) this.f33464d;
                        if (z9) {
                            j$.util.Z spliterator2 = intStream.sequential().spliterator();
                            while (!this.f33538a.m() && spliterator2.tryAdvance((IntConsumer) w8)) {
                            }
                        } else {
                            intStream.sequential().forEach(w8);
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                G g8 = (G) ((Function) ((C3121w) this.f33465e).f33600n).apply(obj);
                if (g8 != null) {
                    try {
                        boolean z10 = this.f33463c;
                        C3102s c3102s = (C3102s) this.f33464d;
                        if (z10) {
                            j$.util.W spliterator3 = g8.sequential().spliterator();
                            while (!this.f33538a.m() && spliterator3.tryAdvance((DoubleConsumer) c3102s)) {
                            }
                        } else {
                            g8.sequential().forEach(c3102s);
                        }
                    } catch (Throwable th5) {
                        try {
                            g8.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (g8 != null) {
                    g8.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        switch (this.f33462b) {
            case 0:
                this.f33538a.k(-1L);
                return;
            case 1:
                this.f33538a.k(-1L);
                return;
            default:
                this.f33538a.k(-1L);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC3076m2, j$.util.stream.InterfaceC3096q2
    public final boolean m() {
        switch (this.f33462b) {
            case 0:
                this.f33463c = true;
                return this.f33538a.m();
            case 1:
                this.f33463c = true;
                return this.f33538a.m();
            default:
                this.f33463c = true;
                return this.f33538a.m();
        }
    }
}
