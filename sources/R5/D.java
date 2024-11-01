package R5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public abstract class D extends C {

    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3255g {

        /* renamed from: a */
        final /* synthetic */ Iterable f9295a;

        public a(Iterable iterable) {
            this.f9295a = iterable;
        }

        @Override // k6.InterfaceC3255g
        public Iterator iterator() {
            return this.f9295a.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a */
        final /* synthetic */ int f9296a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i8) {
            super(1);
            this.f9296a = i8;
        }

        public final Object invoke(int i8) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f9296a + '.');
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    public static Comparable A0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float B0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static Comparable C0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float D0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static List E0(Iterable iterable, Object obj) {
        AbstractC3292y.i(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(iterable, 10));
        boolean z8 = false;
        for (Object obj2 : iterable) {
            boolean z9 = true;
            if (!z8 && AbstractC3292y.d(obj2, obj)) {
                z8 = true;
                z9 = false;
            }
            if (z9) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List F0(Iterable iterable, Iterable elements) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(elements, "elements");
        if (iterable instanceof Collection) {
            return AbstractC1435t.G0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC1435t.C(arrayList, iterable);
        AbstractC1435t.C(arrayList, elements);
        return arrayList;
    }

    public static List G0(Collection collection, Iterable elements) {
        AbstractC3292y.i(collection, "<this>");
        AbstractC3292y.i(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        AbstractC1435t.C(arrayList2, elements);
        return arrayList2;
    }

    public static List H0(Collection collection, Object obj) {
        AbstractC3292y.i(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List I0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return AbstractC1435t.W0(iterable);
        }
        List Y02 = Y0(iterable);
        C.a0(Y02);
        return Y02;
    }

    public static Object J0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof List) {
            return K0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object K0(List list) {
        AbstractC3292y.i(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object L0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() != 1) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object M0(List list) {
        AbstractC3292y.i(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List N0(List list, i6.i indices) {
        AbstractC3292y.i(list, "<this>");
        AbstractC3292y.i(indices, "indices");
        if (indices.isEmpty()) {
            return AbstractC1435t.m();
        }
        return AbstractC1435t.W0(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static List O0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return AbstractC1435t.W0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            AbstractC1428l.J((Comparable[]) array);
            return AbstractC1428l.c(array);
        }
        List Y02 = Y0(iterable);
        AbstractC1441z.A(Y02);
        return Y02;
    }

    public static List P0(Iterable iterable, Comparator comparator) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return AbstractC1435t.W0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            AbstractC1431o.K(array, comparator);
            return AbstractC1428l.c(array);
        }
        List Y02 = Y0(iterable);
        AbstractC1435t.B(Y02, comparator);
        return Y02;
    }

    public static List Q0(Iterable iterable, int i8) {
        AbstractC3292y.i(iterable, "<this>");
        if (i8 >= 0) {
            if (i8 == 0) {
                return AbstractC1435t.m();
            }
            if (iterable instanceof Collection) {
                if (i8 >= ((Collection) iterable).size()) {
                    return AbstractC1435t.W0(iterable);
                }
                if (i8 == 1) {
                    return AbstractC1435t.e(AbstractC1435t.l0(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i8);
            Iterator it = iterable.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i9++;
                if (i9 == i8) {
                    break;
                }
            }
            return AbstractC1437v.t(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static boolean[] R0(Collection collection) {
        AbstractC3292y.i(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            zArr[i8] = ((Boolean) it.next()).booleanValue();
            i8++;
        }
        return zArr;
    }

    public static final Collection S0(Iterable iterable, Collection destination) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static float[] T0(Collection collection) {
        AbstractC3292y.i(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            fArr[i8] = ((Number) it.next()).floatValue();
            i8++;
        }
        return fArr;
    }

    public static HashSet U0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        return (HashSet) S0(iterable, new HashSet(Q.d(AbstractC1435t.x(iterable, 12))));
    }

    public static int[] V0(Collection collection) {
        AbstractC3292y.i(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = ((Number) it.next()).intValue();
            i8++;
        }
        return iArr;
    }

    public static List W0(Iterable iterable) {
        Object next;
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return AbstractC1435t.Z0(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return AbstractC1435t.e(next);
            }
            return AbstractC1435t.m();
        }
        return AbstractC1437v.t(Y0(iterable));
    }

    public static long[] X0(Collection collection) {
        AbstractC3292y.i(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            jArr[i8] = ((Number) it.next()).longValue();
            i8++;
        }
        return jArr;
    }

    public static final List Y0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return AbstractC1435t.Z0((Collection) iterable);
        }
        return (List) S0(iterable, new ArrayList());
    }

    public static List Z0(Collection collection) {
        AbstractC3292y.i(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set a1(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) S0(iterable, new LinkedHashSet());
    }

    public static Set b1(Iterable iterable) {
        Object next;
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return (Set) S0(iterable, new LinkedHashSet(Q.d(collection.size())));
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return a0.d(next);
            }
            return a0.f();
        }
        return c0.h((Set) S0(iterable, new LinkedHashSet()));
    }

    public static InterfaceC3255g c0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        return new a(iterable);
    }

    public static final List c1(Iterable iterable, int i8, int i9, boolean z8, Function1 transform) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(transform, "transform");
        e0.a(i8, i9);
        int i10 = 1;
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i11 = size / i9;
            int i12 = 0;
            if (size % i9 == 0) {
                i10 = 0;
            }
            ArrayList arrayList = new ArrayList(i11 + i10);
            X x8 = new X(list);
            while (i12 >= 0 && i12 < size) {
                int g8 = i6.m.g(i8, size - i12);
                if (!z8 && g8 < i8) {
                    break;
                }
                x8.c(i12, g8 + i12);
                arrayList.add(transform.invoke(x8));
                i12 += i9;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator b9 = e0.b(iterable.iterator(), i8, i9, z8, true);
        while (b9.hasNext()) {
            arrayList2.add(transform.invoke((List) b9.next()));
        }
        return arrayList2;
    }

    public static boolean d0(Iterable iterable, Object obj) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (AbstractC1435t.q0(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ List d1(Iterable iterable, int i8, int i9, boolean z8, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        return c1(iterable, i8, i9, z8, function1);
    }

    public static List e0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        return AbstractC1435t.W0(AbstractC1435t.a1(iterable));
    }

    public static List e1(Iterable iterable, Iterable other) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC1435t.x(iterable, 10), AbstractC1435t.x(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(Q5.x.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static List f0(Iterable iterable, int i8) {
        ArrayList arrayList;
        AbstractC3292y.i(iterable, "<this>");
        if (i8 >= 0) {
            if (i8 == 0) {
                return AbstractC1435t.W0(iterable);
            }
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i8;
                if (size <= 0) {
                    return AbstractC1435t.m();
                }
                if (size == 1) {
                    return AbstractC1435t.e(x0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i8 < size2) {
                            arrayList.add(((List) iterable).get(i8));
                            i8++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i8);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i9 = 0;
            for (Object obj : iterable) {
                if (i9 >= i8) {
                    arrayList.add(obj);
                } else {
                    i9++;
                }
            }
            return AbstractC1437v.t(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static List g0(List list, int i8) {
        AbstractC3292y.i(list, "<this>");
        if (i8 >= 0) {
            return AbstractC1435t.Q0(list, i6.m.d(list.size() - i8, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i8 + " is less than zero.").toString());
    }

    public static Object h0(Iterable iterable, int i8) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).get(i8);
        }
        return i0(iterable, i8, new b(i8));
    }

    public static final Object i0(Iterable iterable, int i8, Function1 defaultValue) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i8 >= 0 && i8 < list.size()) {
                return list.get(i8);
            }
            return defaultValue.invoke(Integer.valueOf(i8));
        }
        if (i8 < 0) {
            return defaultValue.invoke(Integer.valueOf(i8));
        }
        int i9 = 0;
        for (Object obj : iterable) {
            int i10 = i9 + 1;
            if (i8 == i9) {
                return obj;
            }
            i9 = i10;
        }
        return defaultValue.invoke(Integer.valueOf(i8));
    }

    public static List j0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        return (List) k0(iterable, new ArrayList());
    }

    public static final Collection k0(Iterable iterable, Collection destination) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object l0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof List) {
            return AbstractC1435t.m0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object m0(List list) {
        AbstractC3292y.i(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object n0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static Object o0(List list) {
        AbstractC3292y.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object p0(List list, int i8) {
        AbstractC3292y.i(list, "<this>");
        if (i8 >= 0 && i8 < list.size()) {
            return list.get(i8);
        }
        return null;
    }

    public static int q0(Iterable iterable, Object obj) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i8 = 0;
        for (Object obj2 : iterable) {
            if (i8 < 0) {
                AbstractC1435t.w();
            }
            if (AbstractC3292y.d(obj, obj2)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static int r0(List list, Object obj) {
        AbstractC3292y.i(list, "<this>");
        return list.indexOf(obj);
    }

    public static Set s0(Iterable iterable, Iterable other) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(other, "other");
        Set a12 = AbstractC1435t.a1(iterable);
        AbstractC1435t.S(a12, other);
        return a12;
    }

    public static final Appendable t0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(buffer, "buffer");
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        buffer.append(prefix);
        int i9 = 0;
        for (Object obj : iterable) {
            i9++;
            if (i9 > 1) {
                buffer.append(separator);
            }
            if (i8 >= 0 && i9 > i8) {
                break;
            }
            l6.n.a(buffer, obj, function1);
        }
        if (i8 >= 0 && i9 > i8) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ Appendable u0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
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
        return t0(iterable, appendable, charSequence5, charSequence6, charSequence8, i10, charSequence7, function12);
    }

    public static final String v0(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated, Function1 function1) {
        AbstractC3292y.i(iterable, "<this>");
        AbstractC3292y.i(separator, "separator");
        AbstractC3292y.i(prefix, "prefix");
        AbstractC3292y.i(postfix, "postfix");
        AbstractC3292y.i(truncated, "truncated");
        String sb = ((StringBuilder) t0(iterable, new StringBuilder(), separator, prefix, postfix, i8, truncated, function1)).toString();
        AbstractC3292y.h(sb, "toString(...)");
        return sb;
    }

    public static /* synthetic */ String w0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, Function1 function1, int i9, Object obj) {
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
        return v0(iterable, charSequence, charSequence5, charSequence6, i10, charSequence7, function1);
    }

    public static final Object x0(Iterable iterable) {
        AbstractC3292y.i(iterable, "<this>");
        if (iterable instanceof List) {
            return AbstractC1435t.y0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object y0(List list) {
        AbstractC3292y.i(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(AbstractC1435t.o(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static Object z0(List list) {
        AbstractC3292y.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }
}
