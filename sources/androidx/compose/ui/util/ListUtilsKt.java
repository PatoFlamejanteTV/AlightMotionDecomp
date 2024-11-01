package androidx.compose.ui.util;

import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t8, Function1 function1) {
        boolean z8;
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(t8));
            return;
        }
        if (t8 == 0) {
            z8 = true;
        } else {
            z8 = t8 instanceof CharSequence;
        }
        if (z8) {
            appendable.append((CharSequence) t8);
        } else if (t8 instanceof Character) {
            appendable.append(((Character) t8).charValue());
        } else {
            appendable.append(String.valueOf(t8));
        }
    }

    public static final <T> boolean fastAll(List<? extends T> list, Function1 function1) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!((Boolean) function1.invoke(list.get(i8))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, Function1 function1) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((Boolean) function1.invoke(list.get(i8))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T, K> List<T> fastDistinctBy(List<? extends T> list, Function1 function1) {
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            T t8 = list.get(i8);
            if (hashSet.add(function1.invoke(t8))) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilter(List<? extends T> list, Function1 function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            T t8 = list.get(i8);
            if (((Boolean) function1.invoke(t8)).booleanValue()) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNotNull(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            T t8 = list.get(i8);
            if (t8 != null) {
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public static final <T> T fastFirst(List<? extends T> list, Function1 function1) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            T t8 = list.get(i8);
            if (((Boolean) function1.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T> T fastFirstOrNull(List<? extends T> list, Function1 function1) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            T t8 = list.get(i8);
            if (((Boolean) function1.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        return null;
    }

    public static final <T, R> List<R> fastFlatMap(List<? extends T> list, Function1 function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC1435t.C(arrayList, (Iterable) function1.invoke(list.get(i8)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r8, InterfaceC2072n interfaceC2072n) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            r8 = (R) interfaceC2072n.invoke(r8, list.get(i8));
        }
        return r8;
    }

    public static final <T> void fastForEach(List<? extends T> list, Function1 function1) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            function1.invoke(list.get(i8));
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, InterfaceC2072n interfaceC2072n) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC2072n.invoke(Integer.valueOf(i8), list.get(i8));
        }
    }

    public static final <T> void fastForEachReversed(List<? extends T> list, Function1 function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i8 = size - 1;
            function1.invoke(list.get(size));
            if (i8 >= 0) {
                size = i8;
            } else {
                return;
            }
        }
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a9, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1) {
        a9.append(charSequence2);
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            T t8 = list.get(i10);
            i9++;
            if (i9 > 1) {
                a9.append(charSequence);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            appendElement(a9, t8, function1);
        }
        if (i8 >= 0 && i9 > i8) {
            a9.append(charSequence4);
        }
        a9.append(charSequence3);
        return a9;
    }

    static /* synthetic */ Appendable fastJoinTo$default(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i10;
        CharSequence charSequence7;
        Function1 function12;
        if ((i9 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i9 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i9 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i9 & 16) != 0) {
            i10 = -1;
        } else {
            i10 = i8;
        }
        if ((i9 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i9 & 64) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        return fastJoinTo(list, appendable, charSequence5, charSequence6, charSequence8, i10, charSequence7, function12);
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1) {
        return ((StringBuilder) fastJoinTo(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i8, charSequence4, function1)).toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
        CharSequence charSequence5;
        int i10;
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i9 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i9 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i9 & 8) != 0) {
            i10 = -1;
        } else {
            i10 = i8;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i9 & 32) != 0) {
            function1 = null;
        }
        return fastJoinToString(list, charSequence, charSequence5, charSequence6, i10, charSequence7, function1);
    }

    public static final <T> T fastLastOrNull(List<? extends T> list, Function1 function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i8 = size - 1;
            T t8 = list.get(size);
            if (((Boolean) function1.invoke(t8)).booleanValue()) {
                return t8;
            }
            if (i8 >= 0) {
                size = i8;
            } else {
                return null;
            }
        }
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, Function1 function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(function1.invoke(list.get(i8)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexed(List<? extends T> list, InterfaceC2072n interfaceC2072n) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(interfaceC2072n.invoke(Integer.valueOf(i8), list.get(i8)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> list, InterfaceC2072n interfaceC2072n) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object invoke = interfaceC2072n.invoke(Integer.valueOf(i8), list.get(i8));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, Function1 function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object invoke = function1.invoke(list.get(i8));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c8, Function1 function1) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            c8.add(function1.invoke(list.get(i8)));
        }
        return c8;
    }

    public static final <T, R extends Comparable<? super R>> T fastMaxBy(List<? extends T> list, Function1 function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t8 = list.get(0);
        Comparable comparable = (Comparable) function1.invoke(t8);
        int o8 = AbstractC1435t.o(list);
        int i8 = 1;
        if (1 <= o8) {
            while (true) {
                T t9 = list.get(i8);
                Comparable comparable2 = (Comparable) function1.invoke(t9);
                if (comparable.compareTo(comparable2) < 0) {
                    t8 = t9;
                    comparable = comparable2;
                }
                if (i8 == o8) {
                    break;
                }
                i8++;
            }
        }
        return t8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> list, Function1 function1) {
        if (list.isEmpty()) {
            return null;
        }
        R r8 = (R) function1.invoke(list.get(0));
        int o8 = AbstractC1435t.o(list);
        int i8 = 1;
        if (1 <= o8) {
            while (true) {
                Comparable comparable = (Comparable) function1.invoke(list.get(i8));
                if (comparable.compareTo(r8) > 0) {
                    r8 = comparable;
                }
                if (i8 == o8) {
                    break;
                }
                i8++;
            }
        }
        return r8;
    }

    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(List<? extends T> list, Function1 function1) {
        if (list.isEmpty()) {
            return null;
        }
        T t8 = list.get(0);
        Comparable comparable = (Comparable) function1.invoke(t8);
        int o8 = AbstractC1435t.o(list);
        int i8 = 1;
        if (1 <= o8) {
            while (true) {
                T t9 = list.get(i8);
                Comparable comparable2 = (Comparable) function1.invoke(t9);
                if (comparable.compareTo(comparable2) > 0) {
                    t8 = t9;
                    comparable = comparable2;
                }
                if (i8 == o8) {
                    break;
                }
                i8++;
            }
        }
        return t8;
    }

    public static final <S, T extends S> S fastReduce(List<? extends T> list, InterfaceC2072n interfaceC2072n) {
        if (!list.isEmpty()) {
            S s8 = (S) AbstractC1435t.m0(list);
            int o8 = AbstractC1435t.o(list);
            int i8 = 1;
            if (1 <= o8) {
                while (true) {
                    s8 = (S) interfaceC2072n.invoke(s8, list.get(i8));
                    if (i8 == o8) {
                        break;
                    }
                    i8++;
                }
            }
            return s8;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static final <T> int fastSumBy(List<? extends T> list, Function1 function1) {
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += ((Number) function1.invoke(list.get(i9))).intValue();
        }
        return i8;
    }

    public static final <T, R, V> List<V> fastZip(List<? extends T> list, List<? extends R> list2, InterfaceC2072n interfaceC2072n) {
        int min = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(interfaceC2072n.invoke(list.get(i8), list2.get(i8)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, InterfaceC2072n interfaceC2072n) {
        if (list.size() != 0 && list.size() != 1) {
            ArrayList arrayList = new ArrayList();
            int i8 = 0;
            T t8 = list.get(0);
            int o8 = AbstractC1435t.o(list);
            while (i8 < o8) {
                i8++;
                T t9 = list.get(i8);
                arrayList.add(interfaceC2072n.invoke(t8, t9));
                t8 = t9;
            }
            return arrayList;
        }
        return AbstractC1435t.m();
    }
}
