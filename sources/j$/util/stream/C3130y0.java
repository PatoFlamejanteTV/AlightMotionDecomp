package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3130y0 extends AbstractC3023c {

    /* renamed from: j, reason: collision with root package name */
    private final C3126x0 f33621j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3130y0(C3126x0 c3126x0, AbstractC3018b abstractC3018b, Spliterator spliterator) {
        super(abstractC3018b, spliterator);
        this.f33621j = c3126x0;
    }

    C3130y0(C3130y0 c3130y0, Spliterator spliterator) {
        super(c3130y0, spliterator);
        this.f33621j = c3130y0.f33621j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final Object a() {
        boolean z8;
        AbstractC3018b abstractC3018b = this.f33468a;
        AbstractC3118v0 abstractC3118v0 = (AbstractC3118v0) this.f33621j.f33609b.get();
        abstractC3018b.R(this.f33469b, abstractC3118v0);
        boolean z9 = abstractC3118v0.f33594b;
        z8 = this.f33621j.f33608a.f33603b;
        if (z9 == z8) {
            Boolean valueOf = Boolean.valueOf(z9);
            AtomicReference atomicReference = this.f33453h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final AbstractC3033e e(Spliterator spliterator) {
        return new C3130y0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3023c
    protected final Object j() {
        boolean z8;
        z8 = this.f33621j.f33608a.f33603b;
        return Boolean.valueOf(!z8);
    }
}
