package j$.util;

import j$.util.List;
import j$.util.Set;
import j$.util.stream.AbstractC3134z0;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public interface Collection<E> {

    /* renamed from: j$.util.Collection$-CC */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static Stream $default$parallelStream(java.util.Collection collection) {
            return AbstractC3134z0.g0(EL.c(collection), true);
        }

        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            Objects.requireNonNull(predicate);
            Iterator<E> it = collection.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z8 = true;
                }
            }
            return z8;
        }

        public static Spliterator $default$spliterator(java.util.Collection collection) {
            return new s0(0, (java.util.Collection) Objects.requireNonNull(collection));
        }

        public static Stream $default$stream(java.util.Collection collection) {
            return AbstractC3134z0.g0(EL.c(collection), false);
        }
    }

    /* renamed from: j$.util.Collection$-EL */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class EL {
        public static void a(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }

        public static /* synthetic */ Stream b(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).parallelStream() : CC.$default$parallelStream(collection);
        }

        public static Spliterator c(java.util.Collection collection) {
            if (collection instanceof Collection) {
                return ((Collection) collection).spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                return new s0(17, (java.util.Collection) Objects.requireNonNull((LinkedHashSet) collection));
            }
            if (!(collection instanceof SortedSet)) {
                return collection instanceof java.util.Set ? Set.CC.$default$spliterator((java.util.Set) collection) : collection instanceof java.util.List ? List.CC.$default$spliterator((java.util.List) collection) : CC.$default$spliterator(collection);
            }
            SortedSet sortedSet = (SortedSet) collection;
            return new T(sortedSet, sortedSet);
        }

        public static /* synthetic */ Stream stream(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).stream() : CC.$default$stream(collection);
        }
    }

    void forEach(Consumer<? super E> consumer);

    Stream<E> parallelStream();

    boolean removeIf(Predicate<? super E> predicate);

    Spliterator<E> spliterator();

    Stream<E> stream();

    <T> T[] toArray(IntFunction<T[]> intFunction);
}
