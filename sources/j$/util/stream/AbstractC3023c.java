package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3023c extends AbstractC3033e {

    /* renamed from: h, reason: collision with root package name */
    protected final AtomicReference f33453h;

    /* renamed from: i, reason: collision with root package name */
    protected volatile boolean f33454i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3023c(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        super(abstractC3018b, spliterator);
        this.f33453h = new AtomicReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3023c(AbstractC3023c abstractC3023c, Spliterator spliterator) {
        super(abstractC3023c, spliterator);
        this.f33453h = abstractC3023c.f33453h;
    }

    @Override // j$.util.stream.AbstractC3033e
    public final Object c() {
        if (!d()) {
            return super.c();
        }
        Object obj = this.f33453h.get();
        return obj == null ? j() : obj;
    }

    @Override // j$.util.stream.AbstractC3033e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f33469b;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f33470c;
        if (j8 == 0) {
            j8 = AbstractC3033e.g(estimateSize);
            this.f33470c = j8;
        }
        AtomicReference atomicReference = this.f33453h;
        boolean z8 = false;
        AbstractC3023c abstractC3023c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z9 = abstractC3023c.f33454i;
            if (!z9) {
                CountedCompleter<?> completer = abstractC3023c.getCompleter();
                while (true) {
                    AbstractC3023c abstractC3023c2 = (AbstractC3023c) ((AbstractC3033e) completer);
                    if (z9 || abstractC3023c2 == null) {
                        break;
                    }
                    z9 = abstractC3023c2.f33454i;
                    completer = abstractC3023c2.getCompleter();
                }
            }
            if (z9) {
                obj = abstractC3023c.j();
                break;
            }
            if (estimateSize <= j8 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC3023c abstractC3023c3 = (AbstractC3023c) abstractC3023c.e(trySplit);
            abstractC3023c.f33471d = abstractC3023c3;
            AbstractC3023c abstractC3023c4 = (AbstractC3023c) abstractC3023c.e(spliterator);
            abstractC3023c.f33472e = abstractC3023c4;
            abstractC3023c.setPendingCount(1);
            if (z8) {
                spliterator = trySplit;
                abstractC3023c = abstractC3023c3;
                abstractC3023c3 = abstractC3023c4;
            } else {
                abstractC3023c = abstractC3023c4;
            }
            z8 = !z8;
            abstractC3023c3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = abstractC3023c.a();
        abstractC3023c.f(obj);
        abstractC3023c.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f33453h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC3033e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.f33454i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        AbstractC3023c abstractC3023c = this;
        for (AbstractC3023c abstractC3023c2 = (AbstractC3023c) ((AbstractC3033e) getCompleter()); abstractC3023c2 != null; abstractC3023c2 = (AbstractC3023c) ((AbstractC3033e) abstractC3023c2.getCompleter())) {
            if (abstractC3023c2.f33471d == abstractC3023c) {
                AbstractC3023c abstractC3023c3 = (AbstractC3023c) abstractC3023c2.f33472e;
                if (!abstractC3023c3.f33454i) {
                    abstractC3023c3.h();
                }
            }
            abstractC3023c = abstractC3023c2;
        }
    }

    protected abstract Object j();
}
