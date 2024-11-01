package j$.util;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public interface Z extends f0 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.f0, j$.util.Spliterator
    Z trySplit();
}
