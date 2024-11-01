package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3047g3 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final boolean f33505a;

    /* renamed from: b, reason: collision with root package name */
    final AbstractC3018b f33506b;

    /* renamed from: c, reason: collision with root package name */
    private Supplier f33507c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f33508d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC3096q2 f33509e;

    /* renamed from: f, reason: collision with root package name */
    BooleanSupplier f33510f;

    /* renamed from: g, reason: collision with root package name */
    long f33511g;

    /* renamed from: h, reason: collision with root package name */
    AbstractC3028d f33512h;

    /* renamed from: i, reason: collision with root package name */
    boolean f33513i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3047g3(AbstractC3018b abstractC3018b, Spliterator spliterator, boolean z8) {
        this.f33506b = abstractC3018b;
        this.f33507c = null;
        this.f33508d = spliterator;
        this.f33505a = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3047g3(AbstractC3018b abstractC3018b, Supplier supplier, boolean z8) {
        this.f33506b = abstractC3018b;
        this.f33507c = supplier;
        this.f33508d = null;
        this.f33505a = z8;
    }

    private boolean b() {
        while (this.f33512h.count() == 0) {
            if (this.f33509e.m() || !this.f33510f.getAsBoolean()) {
                if (this.f33513i) {
                    return false;
                }
                this.f33509e.j();
                this.f33513i = true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        AbstractC3028d abstractC3028d = this.f33512h;
        if (abstractC3028d == null) {
            if (this.f33513i) {
                return false;
            }
            c();
            d();
            this.f33511g = 0L;
            this.f33509e.k(this.f33508d.getExactSizeIfKnown());
            return b();
        }
        long j8 = this.f33511g + 1;
        this.f33511g = j8;
        boolean z8 = j8 < abstractC3028d.count();
        if (z8) {
            return z8;
        }
        this.f33511g = 0L;
        this.f33512h.clear();
        return b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.f33508d == null) {
            this.f33508d = (Spliterator) this.f33507c.get();
            this.f33507c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int z8 = EnumC3037e3.z(this.f33506b.G()) & EnumC3037e3.f33475f;
        return (z8 & 64) != 0 ? (z8 & (-16449)) | (this.f33508d.characteristics() & 16448) : z8;
    }

    abstract void d();

    abstract AbstractC3047g3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f33508d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC2998d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC3037e3.SIZED.r(this.f33506b.G())) {
            return this.f33508d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2998d.e(this, i8);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f33508d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f33505a || this.f33512h != null || this.f33513i) {
            return null;
        }
        c();
        Spliterator trySplit = this.f33508d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return e(trySplit);
    }
}
