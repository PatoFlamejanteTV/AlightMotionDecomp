package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class V extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private Spliterator f33411a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3096q2 f33412b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3018b f33413c;

    /* renamed from: d, reason: collision with root package name */
    private long f33414d;

    V(V v8, Spliterator spliterator) {
        super(v8);
        this.f33411a = spliterator;
        this.f33412b = v8.f33412b;
        this.f33414d = v8.f33414d;
        this.f33413c = v8.f33413c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V(AbstractC3018b abstractC3018b, Spliterator spliterator, InterfaceC3096q2 interfaceC3096q2) {
        super(null);
        this.f33412b = interfaceC3096q2;
        this.f33413c = abstractC3018b;
        this.f33411a = spliterator;
        this.f33414d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f33411a;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f33414d;
        if (j8 == 0) {
            j8 = AbstractC3033e.g(estimateSize);
            this.f33414d = j8;
        }
        boolean r8 = EnumC3037e3.SHORT_CIRCUIT.r(this.f33413c.G());
        InterfaceC3096q2 interfaceC3096q2 = this.f33412b;
        boolean z8 = false;
        V v8 = this;
        while (true) {
            if (r8 && interfaceC3096q2.m()) {
                break;
            }
            if (estimateSize <= j8 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            V v9 = new V(v8, trySplit);
            v8.addToPendingCount(1);
            if (z8) {
                spliterator = trySplit;
            } else {
                V v10 = v8;
                v8 = v9;
                v9 = v10;
            }
            z8 = !z8;
            v8.fork();
            v8 = v9;
            estimateSize = spliterator.estimateSize();
        }
        v8.f33413c.w(spliterator, interfaceC3096q2);
        v8.f33411a = null;
        v8.propagateCompletion();
    }
}
