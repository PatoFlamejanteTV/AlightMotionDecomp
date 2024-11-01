package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class N extends AbstractC3023c {

    /* renamed from: j, reason: collision with root package name */
    private final H f33318j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f33319k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(H h8, boolean z8, AbstractC3018b abstractC3018b, Spliterator spliterator) {
        super(abstractC3018b, spliterator);
        this.f33319k = z8;
        this.f33318j = h8;
    }

    N(N n8, Spliterator spliterator) {
        super(n8, spliterator);
        this.f33319k = n8.f33319k;
        this.f33318j = n8.f33318j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final Object a() {
        AbstractC3018b abstractC3018b = this.f33468a;
        L3 l32 = (L3) this.f33318j.f33279d.get();
        abstractC3018b.R(this.f33469b, l32);
        Object obj = l32.get();
        if (!this.f33319k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f33453h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC3033e abstractC3033e = this;
        while (true) {
            if (abstractC3033e != null) {
                AbstractC3033e abstractC3033e2 = (AbstractC3033e) abstractC3033e.getCompleter();
                if (abstractC3033e2 != null && abstractC3033e2.f33471d != abstractC3033e) {
                    i();
                    break;
                }
                abstractC3033e = abstractC3033e2;
            } else {
                AtomicReference atomicReference2 = this.f33453h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final AbstractC3033e e(Spliterator spliterator) {
        return new N(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3023c
    protected final Object j() {
        return this.f33318j.f33277b;
    }

    @Override // j$.util.stream.AbstractC3033e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f33319k) {
            N n8 = (N) this.f33471d;
            N n9 = null;
            while (true) {
                if (n8 != n9) {
                    Object c8 = n8.c();
                    if (c8 != null && this.f33318j.f33278c.test(c8)) {
                        f(c8);
                        AbstractC3033e abstractC3033e = this;
                        while (true) {
                            if (abstractC3033e != null) {
                                AbstractC3033e abstractC3033e2 = (AbstractC3033e) abstractC3033e.getCompleter();
                                if (abstractC3033e2 != null && abstractC3033e2.f33471d != abstractC3033e) {
                                    i();
                                    break;
                                }
                                abstractC3033e = abstractC3033e2;
                            } else {
                                AtomicReference atomicReference = this.f33453h;
                                while (!atomicReference.compareAndSet(null, c8) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        n9 = n8;
                        n8 = (N) this.f33472e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
