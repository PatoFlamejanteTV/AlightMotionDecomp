package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class U extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3018b f33398a;

    /* renamed from: b, reason: collision with root package name */
    private Spliterator f33399b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33400c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f33401d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3096q2 f33402e;

    /* renamed from: f, reason: collision with root package name */
    private final U f33403f;

    /* renamed from: g, reason: collision with root package name */
    private L0 f33404g;

    U(U u8, Spliterator spliterator, U u9) {
        super(u8);
        this.f33398a = u8.f33398a;
        this.f33399b = spliterator;
        this.f33400c = u8.f33400c;
        this.f33401d = u8.f33401d;
        this.f33402e = u8.f33402e;
        this.f33403f = u9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public U(AbstractC3018b abstractC3018b, Spliterator spliterator, InterfaceC3096q2 interfaceC3096q2) {
        super(null);
        this.f33398a = abstractC3018b;
        this.f33399b = spliterator;
        this.f33400c = AbstractC3033e.g(spliterator.estimateSize());
        this.f33401d = new ConcurrentHashMap(Math.max(16, AbstractC3033e.b() << 1));
        this.f33402e = interfaceC3096q2;
        this.f33403f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f33399b;
        long j8 = this.f33400c;
        boolean z8 = false;
        U u8 = this;
        while (spliterator.estimateSize() > j8 && (trySplit = spliterator.trySplit()) != null) {
            U u9 = new U(u8, trySplit, u8.f33403f);
            U u10 = new U(u8, spliterator, u9);
            u8.addToPendingCount(1);
            u10.addToPendingCount(1);
            u8.f33401d.put(u9, u10);
            if (u8.f33403f != null) {
                u9.addToPendingCount(1);
                if (u8.f33401d.replace(u8.f33403f, u8, u9)) {
                    u8.addToPendingCount(-1);
                } else {
                    u9.addToPendingCount(-1);
                }
            }
            if (z8) {
                spliterator = trySplit;
                u8 = u9;
                u9 = u10;
            } else {
                u8 = u10;
            }
            z8 = !z8;
            u9.fork();
        }
        if (u8.getPendingCount() > 0) {
            C3083o c3083o = new C3083o(14);
            AbstractC3018b abstractC3018b = u8.f33398a;
            D0 J8 = abstractC3018b.J(abstractC3018b.C(spliterator), c3083o);
            u8.f33398a.R(spliterator, J8);
            u8.f33404g = J8.a();
            u8.f33399b = null;
        }
        u8.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 l02 = this.f33404g;
        if (l02 != null) {
            l02.forEach(this.f33402e);
            this.f33404g = null;
        } else {
            Spliterator spliterator = this.f33399b;
            if (spliterator != null) {
                this.f33398a.R(spliterator, this.f33402e);
                this.f33399b = null;
            }
        }
        U u8 = (U) this.f33401d.remove(this);
        if (u8 != null) {
            u8.tryComplete();
        }
    }
}
