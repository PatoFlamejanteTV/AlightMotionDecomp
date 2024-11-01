package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public interface W extends f0 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.f0, j$.util.Spliterator
    W trySplit();
}
