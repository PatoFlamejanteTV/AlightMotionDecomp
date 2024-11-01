package R5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: R5.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1437v extends AbstractC1436u {
    public static ArrayList g(Object... elements) {
        AbstractC3292y.i(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C1426j(elements, true));
    }

    public static final Collection h(Object[] objArr) {
        AbstractC3292y.i(objArr, "<this>");
        return new C1426j(objArr, false);
    }

    public static int i(List list, int i8, int i9, Function1 comparison) {
        AbstractC3292y.i(list, "<this>");
        AbstractC3292y.i(comparison, "comparison");
        u(list.size(), i8, i9);
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int intValue = ((Number) comparison.invoke(list.get(i11))).intValue();
            if (intValue < 0) {
                i8 = i11 + 1;
            } else if (intValue > 0) {
                i10 = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i8 + 1);
    }

    public static final int j(List list, Comparable comparable, int i8, int i9) {
        AbstractC3292y.i(list, "<this>");
        u(list.size(), i8, i9);
        int i10 = i9 - 1;
        while (i8 <= i10) {
            int i11 = (i8 + i10) >>> 1;
            int a9 = T5.a.a((Comparable) list.get(i11), comparable);
            if (a9 < 0) {
                i8 = i11 + 1;
            } else if (a9 > 0) {
                i10 = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i8 + 1);
    }

    public static /* synthetic */ int k(List list, int i8, int i9, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = list.size();
        }
        return AbstractC1435t.i(list, i8, i9, function1);
    }

    public static /* synthetic */ int l(List list, Comparable comparable, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = list.size();
        }
        return j(list, comparable, i8, i9);
    }

    public static List m() {
        return G.f9298a;
    }

    public static i6.i n(Collection collection) {
        AbstractC3292y.i(collection, "<this>");
        return new i6.i(0, collection.size() - 1);
    }

    public static int o(List list) {
        AbstractC3292y.i(list, "<this>");
        return list.size() - 1;
    }

    public static List p(Object... elements) {
        AbstractC3292y.i(elements, "elements");
        if (elements.length > 0) {
            return AbstractC1428l.c(elements);
        }
        return AbstractC1435t.m();
    }

    public static List q(Object obj) {
        if (obj != null) {
            return AbstractC1435t.e(obj);
        }
        return AbstractC1435t.m();
    }

    public static List r(Object... elements) {
        AbstractC3292y.i(elements, "elements");
        return AbstractC1428l.Z(elements);
    }

    public static List s(Object... elements) {
        AbstractC3292y.i(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C1426j(elements, true));
    }

    public static final List t(List list) {
        AbstractC3292y.i(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return AbstractC1435t.e(list.get(0));
            }
            return list;
        }
        return AbstractC1435t.m();
    }

    private static final void u(int i8, int i9, int i10) {
        if (i9 <= i10) {
            if (i9 >= 0) {
                if (i10 <= i8) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i8 + ").");
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i9 + ") is less than zero.");
        }
        throw new IllegalArgumentException("fromIndex (" + i9 + ") is greater than toIndex (" + i10 + ").");
    }

    public static void v() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void w() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
