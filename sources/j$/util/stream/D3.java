package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
abstract class D3 extends G3 implements j$.util.f0 {
    protected abstract void e(Object obj);

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC3067k3 abstractC3067k3 = null;
        while (true) {
            F3 d8 = d();
            if (d8 == F3.NO_MORE) {
                return;
            }
            F3 f32 = F3.MAYBE_MORE;
            Spliterator spliterator = this.f33271a;
            if (d8 != f32) {
                ((j$.util.f0) spliterator).forEachRemaining(obj);
                return;
            }
            int i8 = this.f33273c;
            if (abstractC3067k3 == null) {
                abstractC3067k3 = g(i8);
            } else {
                abstractC3067k3.f33530b = 0;
            }
            long j8 = 0;
            while (((j$.util.f0) spliterator).tryAdvance(abstractC3067k3)) {
                j8++;
                if (j8 >= i8) {
                    break;
                }
            }
            if (j8 == 0) {
                return;
            } else {
                abstractC3067k3.b(obj, b(j8));
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    protected abstract AbstractC3067k3 g(int i8);

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2998d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2998d.e(this, i8);
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != F3.NO_MORE && ((j$.util.f0) this.f33271a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
