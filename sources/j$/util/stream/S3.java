package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S3 extends AbstractC3023c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC3018b f33379j;

    /* renamed from: k, reason: collision with root package name */
    private final IntFunction f33380k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f33381l;

    /* renamed from: m, reason: collision with root package name */
    private long f33382m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f33383n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f33384o;

    S3(S3 s32, Spliterator spliterator) {
        super(s32, spliterator);
        this.f33379j = s32.f33379j;
        this.f33380k = s32.f33380k;
        this.f33381l = s32.f33381l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S3(AbstractC3018b abstractC3018b, AbstractC3018b abstractC3018b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC3018b2, spliterator);
        this.f33379j = abstractC3018b;
        this.f33380k = intFunction;
        this.f33381l = EnumC3037e3.ORDERED.r(abstractC3018b2.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final Object a() {
        D0 J8 = this.f33468a.J(-1L, this.f33380k);
        InterfaceC3096q2 N8 = this.f33379j.N(this.f33468a.G(), J8);
        AbstractC3018b abstractC3018b = this.f33468a;
        boolean x8 = abstractC3018b.x(this.f33469b, abstractC3018b.S(N8));
        this.f33383n = x8;
        if (x8) {
            i();
        }
        L0 a9 = J8.a();
        this.f33382m = a9.count();
        return a9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final AbstractC3033e e(Spliterator spliterator) {
        return new S3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3023c
    protected final void h() {
        this.f33454i = true;
        if (this.f33381l && this.f33384o) {
            f(AbstractC3134z0.L(this.f33379j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC3023c
    protected final Object j() {
        return AbstractC3134z0.L(this.f33379j.E());
    }

    @Override // j$.util.stream.AbstractC3033e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object I8;
        Object c8;
        AbstractC3033e abstractC3033e = this.f33471d;
        if (abstractC3033e != null) {
            this.f33383n = ((S3) abstractC3033e).f33383n | ((S3) this.f33472e).f33383n;
            if (this.f33381l && this.f33454i) {
                this.f33382m = 0L;
                I8 = AbstractC3134z0.L(this.f33379j.E());
            } else {
                if (this.f33381l) {
                    S3 s32 = (S3) this.f33471d;
                    if (s32.f33383n) {
                        this.f33382m = s32.f33382m;
                        I8 = (L0) s32.c();
                    }
                }
                S3 s33 = (S3) this.f33471d;
                long j8 = s33.f33382m;
                S3 s34 = (S3) this.f33472e;
                this.f33382m = j8 + s34.f33382m;
                if (s33.f33382m == 0) {
                    c8 = s34.c();
                } else if (s34.f33382m == 0) {
                    c8 = s33.c();
                } else {
                    I8 = AbstractC3134z0.I(this.f33379j.E(), (L0) ((S3) this.f33471d).c(), (L0) ((S3) this.f33472e).c());
                }
                I8 = (L0) c8;
            }
            f(I8);
        }
        this.f33384o = true;
        super.onCompletion(countedCompleter);
    }
}
