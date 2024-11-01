package j$.util;

import j$.util.Map;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2998d {
    public static void a(W w8, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            w8.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (x0.f33660a) {
                x0.a(w8.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            w8.forEachRemaining((DoubleConsumer) new F(consumer));
        }
    }

    public static void b(Z z8, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            z8.forEachRemaining((IntConsumer) consumer);
        } else {
            if (x0.f33660a) {
                x0.a(z8.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            z8.forEachRemaining((IntConsumer) new J(consumer));
        }
    }

    public static void c(c0 c0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            c0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (x0.f33660a) {
                x0.a(c0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            c0Var.forEachRemaining((LongConsumer) new N(consumer));
        }
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i8) {
        return (spliterator.characteristics() & i8) == i8;
    }

    public static boolean f(W w8, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return w8.tryAdvance((DoubleConsumer) consumer);
        }
        if (x0.f33660a) {
            x0.a(w8.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return w8.tryAdvance((DoubleConsumer) new F(consumer));
    }

    public static boolean g(Z z8, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return z8.tryAdvance((IntConsumer) consumer);
        }
        if (x0.f33660a) {
            x0.a(z8.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return z8.tryAdvance((IntConsumer) new J(consumer));
    }

    public static boolean h(c0 c0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return c0Var.tryAdvance((LongConsumer) consumer);
        }
        if (x0.f33660a) {
            x0.a(c0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return c0Var.tryAdvance((LongConsumer) new N(consumer));
    }

    public static B i(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? B.d(optional.get()) : B.a();
    }

    public static C j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C.d(optionalDouble.getAsDouble()) : C.a();
    }

    public static D k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? D.d(optionalInt.getAsInt()) : D.a();
    }

    public static E l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? E.d(optionalLong.getAsLong()) : E.a();
    }

    public static Optional m(B b9) {
        if (b9 == null) {
            return null;
        }
        return b9.c() ? Optional.of(b9.b()) : Optional.empty();
    }

    public static OptionalDouble n(C c8) {
        if (c8 == null) {
            return null;
        }
        return c8.c() ? OptionalDouble.of(c8.b()) : OptionalDouble.empty();
    }

    public static OptionalInt o(D d8) {
        if (d8 == null) {
            return null;
        }
        return d8.c() ? OptionalInt.of(d8.b()) : OptionalInt.empty();
    }

    public static OptionalLong p(E e8) {
        if (e8 == null) {
            return null;
        }
        return e8.c() ? OptionalLong.of(e8.b()) : OptionalLong.empty();
    }

    public static /* synthetic */ void q(java.util.Map map, BiConsumer biConsumer) {
        if (map instanceof Map) {
            ((Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            j$.util.concurrent.u.a((ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    public static void r(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC3143z) {
            ((InterfaceC3143z) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static Object s(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof Map) {
            return ((Map) map).getOrDefault(obj, obj2);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$getOrDefault(map, obj, obj2);
        }
        Object obj3 = ((ConcurrentMap) map).get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public static /* synthetic */ Object t(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public static void u(java.util.List list, Comparator comparator) {
        if (list instanceof List) {
            ((List) list).sort(comparator);
            return;
        }
        Object[] array = list.toArray();
        Arrays.sort(array, comparator);
        ListIterator listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
    }

    public static C2996c v(Comparator comparator, Comparator comparator2) {
        if (!(comparator instanceof InterfaceC2999e)) {
            Objects.requireNonNull(comparator2);
            return new C2996c(comparator, comparator2, 0);
        }
        EnumC3000f enumC3000f = (EnumC3000f) ((InterfaceC2999e) comparator);
        enumC3000f.getClass();
        Objects.requireNonNull(comparator2);
        return new C2996c(enumC3000f, comparator2, 0);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
