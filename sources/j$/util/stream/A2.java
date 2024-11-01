package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class A2 extends AbstractC3023c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC3018b f33229j;

    /* renamed from: k, reason: collision with root package name */
    private final IntFunction f33230k;

    /* renamed from: l, reason: collision with root package name */
    private final long f33231l;

    /* renamed from: m, reason: collision with root package name */
    private final long f33232m;

    /* renamed from: n, reason: collision with root package name */
    private long f33233n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f33234o;

    A2(A2 a22, Spliterator spliterator) {
        super(a22, spliterator);
        this.f33229j = a22.f33229j;
        this.f33230k = a22.f33230k;
        this.f33231l = a22.f33231l;
        this.f33232m = a22.f33232m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A2(AbstractC3018b abstractC3018b, AbstractC3018b abstractC3018b2, Spliterator spliterator, IntFunction intFunction, long j8, long j9) {
        super(abstractC3018b2, spliterator);
        this.f33229j = abstractC3018b;
        this.f33230k = intFunction;
        this.f33231l = j8;
        this.f33232m = j9;
    }

    private long k(long j8) {
        if (this.f33234o) {
            return this.f33233n;
        }
        A2 a22 = (A2) this.f33471d;
        A2 a23 = (A2) this.f33472e;
        if (a22 == null || a23 == null) {
            return this.f33233n;
        }
        long k8 = a22.k(j8);
        return k8 >= j8 ? k8 : k8 + a23.k(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final Object a() {
        if (d()) {
            D0 J8 = this.f33229j.J(EnumC3037e3.SIZED.u(this.f33229j.f33442c) ? this.f33229j.C(this.f33469b) : -1L, this.f33230k);
            InterfaceC3096q2 N8 = this.f33229j.N(this.f33468a.G(), J8);
            AbstractC3018b abstractC3018b = this.f33468a;
            abstractC3018b.x(this.f33469b, abstractC3018b.S(N8));
            return J8.a();
        }
        D0 J9 = this.f33229j.J(-1L, this.f33230k);
        if (this.f33231l == 0) {
            InterfaceC3096q2 N9 = this.f33229j.N(this.f33468a.G(), J9);
            AbstractC3018b abstractC3018b2 = this.f33468a;
            abstractC3018b2.x(this.f33469b, abstractC3018b2.S(N9));
        } else {
            this.f33468a.R(this.f33469b, J9);
        }
        L0 a9 = J9.a();
        this.f33233n = a9.count();
        this.f33234o = true;
        this.f33469b = null;
        return a9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3033e
    public final AbstractC3033e e(Spliterator spliterator) {
        return new A2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3023c
    protected final void h() {
        this.f33454i = true;
        if (this.f33234o) {
            f(AbstractC3134z0.L(this.f33229j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC3023c
    protected final Object j() {
        return AbstractC3134z0.L(this.f33229j.E());
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:            if (r2 >= r0) goto L52;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    @Override // j$.util.stream.AbstractC3033e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.A2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
