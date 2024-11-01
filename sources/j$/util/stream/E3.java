package j$.util.stream;

import j$.util.AbstractC2998d;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class E3 extends G3 implements Spliterator, Consumer {

    /* renamed from: f, reason: collision with root package name */
    Object f33258f;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33258f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator, j$.util.stream.G3] */
    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new G3(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C3072l3 c3072l3 = null;
        while (true) {
            F3 d8 = d();
            if (d8 == F3.NO_MORE) {
                return;
            }
            F3 f32 = F3.MAYBE_MORE;
            Spliterator spliterator = this.f33271a;
            if (d8 != f32) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i8 = this.f33273c;
            if (c3072l3 == null) {
                c3072l3 = new C3072l3(i8);
            } else {
                c3072l3.f33539a = 0;
            }
            long j8 = 0;
            while (spliterator.tryAdvance(c3072l3)) {
                j8++;
                if (j8 >= i8) {
                    break;
                }
            }
            if (j8 == 0) {
                return;
            }
            long b9 = b(j8);
            for (int i9 = 0; i9 < b9; i9++) {
                consumer.accept(c3072l3.f33534b[i9]);
            }
        }
    }

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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != F3.NO_MORE && this.f33271a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.accept(this.f33258f);
                this.f33258f = null;
                return true;
            }
        }
        return false;
    }
}
