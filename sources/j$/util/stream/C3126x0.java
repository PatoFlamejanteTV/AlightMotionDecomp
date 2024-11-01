package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3126x0 implements K3 {

    /* renamed from: a, reason: collision with root package name */
    final EnumC3122w0 f33608a;

    /* renamed from: b, reason: collision with root package name */
    final Supplier f33609b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3126x0(EnumC3042f3 enumC3042f3, EnumC3122w0 enumC3122w0, Supplier supplier) {
        this.f33608a = enumC3122w0;
        this.f33609b = supplier;
    }

    @Override // j$.util.stream.K3
    public final Object b(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        AbstractC3118v0 abstractC3118v0 = (AbstractC3118v0) this.f33609b.get();
        abstractC3018b.R(spliterator, abstractC3118v0);
        return Boolean.valueOf(abstractC3118v0.f33594b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.K3
    public final Object c(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        return (Boolean) new C3130y0(this, abstractC3018b, spliterator).invoke();
    }

    @Override // j$.util.stream.K3
    public final int d() {
        return EnumC3037e3.f33490u | EnumC3037e3.f33487r;
    }
}
