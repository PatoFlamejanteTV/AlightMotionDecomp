package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3133z extends AbstractC3061j2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f33624b;

    /* renamed from: c, reason: collision with root package name */
    C3102s f33625c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3121w f33626d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3133z(C3121w c3121w, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33626d = c3121w;
        InterfaceC3096q2 interfaceC3096q22 = this.f33526a;
        Objects.requireNonNull(interfaceC3096q22);
        this.f33625c = new C3102s(interfaceC3096q22);
    }

    @Override // j$.util.stream.InterfaceC3081n2, j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        G g8 = (G) ((DoubleFunction) this.f33626d.f33600n).apply(d8);
        if (g8 != null) {
            try {
                boolean z8 = this.f33624b;
                C3102s c3102s = this.f33625c;
                if (z8) {
                    j$.util.W spliterator = g8.sequential().spliterator();
                    while (!this.f33526a.m() && spliterator.tryAdvance((DoubleConsumer) c3102s)) {
                    }
                } else {
                    g8.sequential().forEach(c3102s);
                }
            } catch (Throwable th) {
                try {
                    g8.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (g8 != null) {
            g8.close();
        }
    }

    @Override // j$.util.stream.AbstractC3061j2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33526a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC3061j2, j$.util.stream.InterfaceC3096q2
    public final boolean m() {
        this.f33624b = true;
        return this.f33526a.m();
    }
}
