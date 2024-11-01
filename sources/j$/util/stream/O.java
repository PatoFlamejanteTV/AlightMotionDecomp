package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class O extends T implements InterfaceC3081n2 {

    /* renamed from: b, reason: collision with root package name */
    final DoubleConsumer f33329b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(DoubleConsumer doubleConsumer, boolean z8) {
        super(z8);
        this.f33329b = doubleConsumer;
    }

    @Override // j$.util.stream.T, j$.util.stream.InterfaceC3096q2
    public final void accept(double d8) {
        this.f33329b.accept(d8);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        abstractC3018b.R(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.K3
    public final /* bridge */ /* synthetic */ Object c(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        e(abstractC3018b, spliterator);
        return null;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC3081n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3134z0.e(this, d8);
    }
}
