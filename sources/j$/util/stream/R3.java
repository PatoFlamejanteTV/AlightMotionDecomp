package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class R3 extends AbstractC3033e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3018b f33366h;

    /* renamed from: i, reason: collision with root package name */
    private final IntFunction f33367i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f33368j;

    /* renamed from: k, reason: collision with root package name */
    private long f33369k;

    /* renamed from: l, reason: collision with root package name */
    private long f33370l;

    R3(R3 r32, Spliterator spliterator) {
        super(r32, spliterator);
        this.f33366h = r32.f33366h;
        this.f33367i = r32.f33367i;
        this.f33368j = r32.f33368j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public R3(AbstractC3018b abstractC3018b, AbstractC3018b abstractC3018b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC3018b2, spliterator);
        this.f33366h = abstractC3018b;
        this.f33367i = intFunction;
        this.f33368j = EnumC3037e3.ORDERED.r(abstractC3018b2.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final Object a() {
        boolean z8 = !d();
        D0 J8 = this.f33468a.J((z8 && this.f33368j && EnumC3037e3.SIZED.u(this.f33366h.f33442c)) ? this.f33366h.C(this.f33469b) : -1L, this.f33367i);
        Q3 q32 = (Q3) this.f33366h;
        boolean z9 = this.f33368j && z8;
        q32.getClass();
        P3 p32 = new P3(q32, J8, z9);
        this.f33468a.R(this.f33469b, p32);
        L0 a9 = J8.a();
        this.f33369k = a9.count();
        this.f33370l = p32.f33345b;
        return a9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final AbstractC3033e e(Spliterator spliterator) {
        return new R3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3033e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 I8;
        Object c8;
        L0 l02;
        AbstractC3033e abstractC3033e = this.f33471d;
        if (abstractC3033e != null) {
            if (this.f33368j) {
                R3 r32 = (R3) abstractC3033e;
                long j8 = r32.f33370l;
                this.f33370l = j8;
                if (j8 == r32.f33369k) {
                    this.f33370l = j8 + ((R3) this.f33472e).f33370l;
                }
            }
            R3 r33 = (R3) abstractC3033e;
            long j9 = r33.f33369k;
            R3 r34 = (R3) this.f33472e;
            this.f33369k = j9 + r34.f33369k;
            if (r33.f33369k == 0) {
                c8 = r34.c();
            } else if (r34.f33369k == 0) {
                c8 = r33.c();
            } else {
                I8 = AbstractC3134z0.I(this.f33366h.E(), (L0) ((R3) this.f33471d).c(), (L0) ((R3) this.f33472e).c());
                l02 = I8;
                if (d() && this.f33368j) {
                    l02 = l02.g(this.f33370l, l02.count(), this.f33367i);
                }
                f(l02);
            }
            I8 = (L0) c8;
            l02 = I8;
            if (d()) {
                l02 = l02.g(this.f33370l, l02.count(), this.f33367i);
            }
            f(l02);
        }
        super.onCompletion(countedCompleter);
    }
}
