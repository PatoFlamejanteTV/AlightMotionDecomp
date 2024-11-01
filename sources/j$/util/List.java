package j$.util;

import java.util.Comparator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public interface List<E> extends Collection<E> {

    /* renamed from: j$.util.List$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static Spliterator $default$spliterator(java.util.List list) {
            return list instanceof RandomAccess ? new C2994a(list) : new s0(16, (java.util.Collection) Objects.requireNonNull(list));
        }
    }

    void replaceAll(UnaryOperator<E> unaryOperator);

    void sort(Comparator<? super E> comparator);

    @Override // java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    Spliterator<E> spliterator();
}
