package j$.util;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements Spliterator.OfPrimitive {

    /* renamed from: a */
    public final /* synthetic */ f0 f33159a;

    private /* synthetic */ e0(f0 f0Var) {
        this.f33159a = f0Var;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(f0 f0Var) {
        if (f0Var == null) {
            return null;
        }
        return f0Var instanceof d0 ? ((d0) f0Var).f33158a : f0Var instanceof W ? V.a((W) f0Var) : f0Var instanceof Z ? Y.a((Z) f0Var) : f0Var instanceof c0 ? b0.a((c0) f0Var) : new e0(f0Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33159a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        f0 f0Var = this.f33159a;
        if (obj instanceof e0) {
            obj = ((e0) obj).f33159a;
        }
        return f0Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33159a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f33159a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33159a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33159a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33159a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f33159a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33159a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f33159a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33159a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f33159a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f33159a.trySplit());
    }
}
