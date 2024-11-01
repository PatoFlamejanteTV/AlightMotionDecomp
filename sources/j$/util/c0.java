package j$.util;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public interface c0 extends f0 {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.f0, j$.util.Spliterator
    c0 trySplit();
}
