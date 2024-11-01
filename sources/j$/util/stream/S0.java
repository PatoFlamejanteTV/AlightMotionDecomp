package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class S0 extends AbstractC3033e {

    /* renamed from: h, reason: collision with root package name */
    protected final AbstractC3018b f33372h;

    /* renamed from: i, reason: collision with root package name */
    protected final LongFunction f33373i;

    /* renamed from: j, reason: collision with root package name */
    protected final BinaryOperator f33374j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(S0 s02, Spliterator spliterator) {
        super(s02, spliterator);
        this.f33372h = s02.f33372h;
        this.f33373i = s02.f33373i;
        this.f33374j = s02.f33374j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S0(AbstractC3018b abstractC3018b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC3018b, spliterator);
        this.f33372h = abstractC3018b;
        this.f33373i = longFunction;
        this.f33374j = binaryOperator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public AbstractC3033e e(Spliterator spliterator) {
        return new S0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final L0 a() {
        D0 d02 = (D0) this.f33373i.apply(this.f33372h.C(this.f33469b));
        this.f33372h.R(this.f33469b, d02);
        return d02.a();
    }

    @Override // j$.util.stream.AbstractC3033e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC3033e abstractC3033e = this.f33471d;
        if (abstractC3033e != null) {
            f((L0) this.f33374j.apply((L0) ((S0) abstractC3033e).c(), (L0) ((S0) this.f33472e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}
