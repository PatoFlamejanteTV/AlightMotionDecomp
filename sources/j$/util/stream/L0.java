package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
interface L0 {
    L0 b(int i8);

    long count();

    void forEach(Consumer consumer);

    L0 g(long j8, long j9, IntFunction intFunction);

    void h(Object[] objArr, int i8);

    Object[] n(IntFunction intFunction);

    int p();

    Spliterator spliterator();
}
