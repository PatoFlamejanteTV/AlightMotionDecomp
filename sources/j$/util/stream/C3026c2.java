package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3026c2 extends AbstractC3033e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3134z0 f33456h;

    C3026c2(C3026c2 c3026c2, Spliterator spliterator) {
        super(c3026c2, spliterator);
        this.f33456h = c3026c2.f33456h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3026c2(AbstractC3134z0 abstractC3134z0, AbstractC3018b abstractC3018b, Spliterator spliterator) {
        super(abstractC3018b, spliterator);
        this.f33456h = abstractC3134z0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final Object a() {
        AbstractC3018b abstractC3018b = this.f33468a;
        V1 f02 = this.f33456h.f0();
        abstractC3018b.R(this.f33469b, f02);
        return f02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final AbstractC3033e e(Spliterator spliterator) {
        return new C3026c2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3033e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC3033e abstractC3033e = this.f33471d;
        if (abstractC3033e != null) {
            V1 v12 = (V1) ((C3026c2) abstractC3033e).c();
            v12.f((V1) ((C3026c2) this.f33472e).c());
            f(v12);
        }
        super.onCompletion(countedCompleter);
    }
}
