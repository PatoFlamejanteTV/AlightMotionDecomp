package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3127x1 extends CountedCompleter implements InterfaceC3096q2 {

    /* renamed from: a, reason: collision with root package name */
    protected final Spliterator f33610a;

    /* renamed from: b, reason: collision with root package name */
    protected final AbstractC3018b f33611b;

    /* renamed from: c, reason: collision with root package name */
    protected final long f33612c;

    /* renamed from: d, reason: collision with root package name */
    protected long f33613d;

    /* renamed from: e, reason: collision with root package name */
    protected long f33614e;

    /* renamed from: f, reason: collision with root package name */
    protected int f33615f;

    /* renamed from: g, reason: collision with root package name */
    protected int f33616g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3127x1(Spliterator spliterator, AbstractC3018b abstractC3018b, int i8) {
        this.f33610a = spliterator;
        this.f33611b = abstractC3018b;
        this.f33612c = AbstractC3033e.g(spliterator.estimateSize());
        this.f33613d = 0L;
        this.f33614e = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3127x1(AbstractC3127x1 abstractC3127x1, Spliterator spliterator, long j8, long j9, int i8) {
        super(abstractC3127x1);
        this.f33610a = spliterator;
        this.f33611b = abstractC3127x1.f33611b;
        this.f33612c = abstractC3127x1.f33612c;
        this.f33613d = j8;
        this.f33614e = j9;
        if (j8 < 0 || j9 < 0 || (j8 + j9) - 1 >= i8) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j8), Long.valueOf(j8), Long.valueOf(j9), Integer.valueOf(i8)));
        }
    }

    public /* synthetic */ void accept(double d8) {
        AbstractC3134z0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i8) {
        AbstractC3134z0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j8) {
        AbstractC3134z0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    abstract AbstractC3127x1 b(Spliterator spliterator, long j8, long j9);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f33610a;
        AbstractC3127x1 abstractC3127x1 = this;
        while (spliterator.estimateSize() > abstractC3127x1.f33612c && (trySplit = spliterator.trySplit()) != null) {
            abstractC3127x1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC3127x1.b(trySplit, abstractC3127x1.f33613d, estimateSize).fork();
            abstractC3127x1 = abstractC3127x1.b(spliterator, abstractC3127x1.f33613d + estimateSize, abstractC3127x1.f33614e - estimateSize);
        }
        abstractC3127x1.f33611b.R(spliterator, abstractC3127x1);
        abstractC3127x1.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final void k(long j8) {
        long j9 = this.f33614e;
        if (j8 > j9) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i8 = (int) this.f33613d;
        this.f33615f = i8;
        this.f33616g = i8 + ((int) j9);
    }

    @Override // j$.util.stream.InterfaceC3096q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
