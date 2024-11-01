package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3014a0 extends AbstractC3066k2 {

    /* renamed from: b, reason: collision with root package name */
    boolean f33435b;

    /* renamed from: c, reason: collision with root package name */
    W f33436c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Y f33437d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3014a0(Y y8, InterfaceC3096q2 interfaceC3096q2) {
        super(interfaceC3096q2);
        this.f33437d = y8;
        InterfaceC3096q2 interfaceC3096q22 = this.f33529a;
        Objects.requireNonNull(interfaceC3096q22);
        this.f33436c = new W(interfaceC3096q22);
    }

    @Override // j$.util.stream.InterfaceC3086o2, j$.util.stream.InterfaceC3096q2
    public final void accept(int i8) {
        IntStream intStream = (IntStream) ((IntFunction) this.f33437d.f33421n).apply(i8);
        if (intStream != null) {
            try {
                boolean z8 = this.f33435b;
                W w8 = this.f33436c;
                if (z8) {
                    j$.util.Z spliterator = intStream.sequential().spliterator();
                    while (!this.f33529a.m() && spliterator.tryAdvance((IntConsumer) w8)) {
                    }
                } else {
                    intStream.sequential().forEach(w8);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC3066k2, j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        this.f33529a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC3066k2, j$.util.stream.InterfaceC3096q2
    public final boolean m() {
        this.f33435b = true;
        return this.f33529a.m();
    }
}
