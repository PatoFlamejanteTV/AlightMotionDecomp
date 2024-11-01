package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3018b implements InterfaceC3048h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3018b f33440a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3018b f33441b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f33442c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC3018b f33443d;

    /* renamed from: e, reason: collision with root package name */
    private int f33444e;

    /* renamed from: f, reason: collision with root package name */
    private int f33445f;

    /* renamed from: g, reason: collision with root package name */
    private Spliterator f33446g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33447h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f33448i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f33449j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f33450k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3018b(Spliterator spliterator, int i8, boolean z8) {
        this.f33441b = null;
        this.f33446g = spliterator;
        this.f33440a = this;
        int i9 = EnumC3037e3.f33476g & i8;
        this.f33442c = i9;
        this.f33445f = (~(i9 << 1)) & EnumC3037e3.f33481l;
        this.f33444e = 0;
        this.f33450k = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3018b(AbstractC3018b abstractC3018b, int i8) {
        if (abstractC3018b.f33447h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC3018b.f33447h = true;
        abstractC3018b.f33443d = this;
        this.f33441b = abstractC3018b;
        this.f33442c = EnumC3037e3.f33477h & i8;
        this.f33445f = EnumC3037e3.j(i8, abstractC3018b.f33445f);
        AbstractC3018b abstractC3018b2 = abstractC3018b.f33440a;
        this.f33440a = abstractC3018b2;
        if (M()) {
            abstractC3018b2.f33448i = true;
        }
        this.f33444e = abstractC3018b.f33444e + 1;
    }

    private Spliterator O(int i8) {
        int i9;
        int i10;
        AbstractC3018b abstractC3018b = this.f33440a;
        Spliterator spliterator = abstractC3018b.f33446g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC3018b.f33446g = null;
        if (abstractC3018b.f33450k && abstractC3018b.f33448i) {
            AbstractC3018b abstractC3018b2 = abstractC3018b.f33443d;
            int i11 = 1;
            while (abstractC3018b != this) {
                int i12 = abstractC3018b2.f33442c;
                if (abstractC3018b2.M()) {
                    if (EnumC3037e3.SHORT_CIRCUIT.r(i12)) {
                        i12 &= ~EnumC3037e3.f33490u;
                    }
                    spliterator = abstractC3018b2.L(abstractC3018b, spliterator);
                    if (spliterator.hasCharacteristics(64)) {
                        i9 = (~EnumC3037e3.f33489t) & i12;
                        i10 = EnumC3037e3.f33488s;
                    } else {
                        i9 = (~EnumC3037e3.f33488s) & i12;
                        i10 = EnumC3037e3.f33489t;
                    }
                    i12 = i9 | i10;
                    i11 = 0;
                }
                abstractC3018b2.f33444e = i11;
                abstractC3018b2.f33445f = EnumC3037e3.j(i12, abstractC3018b.f33445f);
                i11++;
                AbstractC3018b abstractC3018b3 = abstractC3018b2;
                abstractC3018b2 = abstractC3018b2.f33443d;
                abstractC3018b = abstractC3018b3;
            }
        }
        if (i8 != 0) {
            this.f33445f = EnumC3037e3.j(i8, this.f33445f);
        }
        return spliterator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final L0 A(IntFunction intFunction) {
        AbstractC3018b abstractC3018b;
        if (this.f33447h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33447h = true;
        if (!this.f33440a.f33450k || (abstractC3018b = this.f33441b) == null || !M()) {
            return y(O(0), true, intFunction);
        }
        this.f33444e = 0;
        return K(abstractC3018b, abstractC3018b.O(0), intFunction);
    }

    abstract L0 B(AbstractC3018b abstractC3018b, Spliterator spliterator, boolean z8, IntFunction intFunction);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long C(Spliterator spliterator) {
        if (EnumC3037e3.SIZED.r(this.f33445f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract boolean D(Spliterator spliterator, InterfaceC3096q2 interfaceC3096q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract EnumC3042f3 E();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC3042f3 F() {
        AbstractC3018b abstractC3018b = this;
        while (abstractC3018b.f33444e > 0) {
            abstractC3018b = abstractC3018b.f33441b;
        }
        return abstractC3018b.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int G() {
        return this.f33445f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean H() {
        return EnumC3037e3.ORDERED.r(this.f33445f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Spliterator I() {
        return O(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract D0 J(long j8, IntFunction intFunction);

    L0 K(AbstractC3018b abstractC3018b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator L(AbstractC3018b abstractC3018b, Spliterator spliterator) {
        return K(abstractC3018b, spliterator, new C3068l(18)).spliterator();
    }

    abstract boolean M();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC3096q2 N(int i8, InterfaceC3096q2 interfaceC3096q2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator P() {
        AbstractC3018b abstractC3018b = this.f33440a;
        if (this != abstractC3018b) {
            throw new IllegalStateException();
        }
        if (this.f33447h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33447h = true;
        Spliterator spliterator = abstractC3018b.f33446g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC3018b.f33446g = null;
        return spliterator;
    }

    abstract Spliterator Q(AbstractC3018b abstractC3018b, Supplier supplier, boolean z8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC3096q2 R(Spliterator spliterator, InterfaceC3096q2 interfaceC3096q2) {
        w(spliterator, S((InterfaceC3096q2) Objects.requireNonNull(interfaceC3096q2)));
        return interfaceC3096q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC3096q2 S(InterfaceC3096q2 interfaceC3096q2) {
        Objects.requireNonNull(interfaceC3096q2);
        AbstractC3018b abstractC3018b = this;
        while (abstractC3018b.f33444e > 0) {
            AbstractC3018b abstractC3018b2 = abstractC3018b.f33441b;
            interfaceC3096q2 = abstractC3018b.N(abstractC3018b2.f33445f, interfaceC3096q2);
            abstractC3018b = abstractC3018b2;
        }
        return interfaceC3096q2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator T(Spliterator spliterator) {
        return this.f33444e == 0 ? spliterator : Q(this, new C3013a(7, spliterator), this.f33440a.f33450k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f33447h = true;
        this.f33446g = null;
        AbstractC3018b abstractC3018b = this.f33440a;
        Runnable runnable = abstractC3018b.f33449j;
        if (runnable != null) {
            abstractC3018b.f33449j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final boolean isParallel() {
        return this.f33440a.f33450k;
    }

    @Override // j$.util.stream.InterfaceC3048h
    public final InterfaceC3048h onClose(Runnable runnable) {
        if (this.f33447h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC3018b abstractC3018b = this.f33440a;
        Runnable runnable2 = abstractC3018b.f33449j;
        if (runnable2 != null) {
            runnable = new J3(runnable2, runnable);
        }
        abstractC3018b.f33449j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final InterfaceC3048h parallel() {
        this.f33440a.f33450k = true;
        return this;
    }

    @Override // j$.util.stream.InterfaceC3048h, j$.util.stream.G
    public final InterfaceC3048h sequential() {
        this.f33440a.f33450k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC3048h
    public Spliterator spliterator() {
        if (this.f33447h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33447h = true;
        AbstractC3018b abstractC3018b = this.f33440a;
        if (this != abstractC3018b) {
            return Q(this, new C3013a(0, this), abstractC3018b.f33450k);
        }
        Spliterator spliterator = abstractC3018b.f33446g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC3018b.f33446g = null;
        return spliterator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(Spliterator spliterator, InterfaceC3096q2 interfaceC3096q2) {
        Objects.requireNonNull(interfaceC3096q2);
        if (EnumC3037e3.SHORT_CIRCUIT.r(this.f33445f)) {
            x(spliterator, interfaceC3096q2);
            return;
        }
        interfaceC3096q2.k(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC3096q2);
        interfaceC3096q2.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x(Spliterator spliterator, InterfaceC3096q2 interfaceC3096q2) {
        AbstractC3018b abstractC3018b = this;
        while (abstractC3018b.f33444e > 0) {
            abstractC3018b = abstractC3018b.f33441b;
        }
        interfaceC3096q2.k(spliterator.getExactSizeIfKnown());
        boolean D8 = abstractC3018b.D(spliterator, interfaceC3096q2);
        interfaceC3096q2.j();
        return D8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final L0 y(Spliterator spliterator, boolean z8, IntFunction intFunction) {
        if (this.f33440a.f33450k) {
            return B(this, spliterator, z8, intFunction);
        }
        D0 J8 = J(C(spliterator), intFunction);
        R(spliterator, J8);
        return J8.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object z(K3 k32) {
        if (this.f33447h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f33447h = true;
        return this.f33440a.f33450k ? k32.c(this, O(k32.d())) : k32.b(this, O(k32.d()));
    }
}
