package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3033e extends CountedCompleter {

    /* renamed from: g, reason: collision with root package name */
    private static final int f33467g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a, reason: collision with root package name */
    protected final AbstractC3018b f33468a;

    /* renamed from: b, reason: collision with root package name */
    protected Spliterator f33469b;

    /* renamed from: c, reason: collision with root package name */
    protected long f33470c;

    /* renamed from: d, reason: collision with root package name */
    protected AbstractC3033e f33471d;

    /* renamed from: e, reason: collision with root package name */
    protected AbstractC3033e f33472e;

    /* renamed from: f, reason: collision with root package name */
    private Object f33473f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3033e(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        super(null);
        this.f33468a = abstractC3018b;
        this.f33469b = spliterator;
        this.f33470c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3033e(AbstractC3033e abstractC3033e, Spliterator spliterator) {
        super(abstractC3033e);
        this.f33469b = spliterator;
        this.f33468a = abstractC3033e.f33468a;
        this.f33470c = abstractC3033e.f33470c;
    }

    public static int b() {
        return f33467g;
    }

    public static long g(long j8) {
        long j9 = j8 / f33467g;
        if (j9 > 0) {
            return j9;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c() {
        return this.f33473f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f33469b;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f33470c;
        if (j8 == 0) {
            j8 = g(estimateSize);
            this.f33470c = j8;
        }
        boolean z8 = false;
        AbstractC3033e abstractC3033e = this;
        while (estimateSize > j8 && (trySplit = spliterator.trySplit()) != null) {
            AbstractC3033e e8 = abstractC3033e.e(trySplit);
            abstractC3033e.f33471d = e8;
            AbstractC3033e e9 = abstractC3033e.e(spliterator);
            abstractC3033e.f33472e = e9;
            abstractC3033e.setPendingCount(1);
            if (z8) {
                spliterator = trySplit;
                abstractC3033e = e8;
                e8 = e9;
            } else {
                abstractC3033e = e9;
            }
            z8 = !z8;
            e8.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC3033e.f(abstractC3033e.a());
        abstractC3033e.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        return ((AbstractC3033e) getCompleter()) == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC3033e e(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Object obj) {
        this.f33473f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f33473f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f33469b = null;
        this.f33472e = null;
        this.f33471d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
