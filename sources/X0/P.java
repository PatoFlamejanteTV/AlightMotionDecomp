package x0;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes3.dex */
abstract class P {
    public static Comparator a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        if (comparator == null) {
            return G.c();
        }
        return comparator;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        w0.h.i(comparator);
        w0.h.i(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (iterable instanceof O) {
            comparator2 = ((O) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }
}
