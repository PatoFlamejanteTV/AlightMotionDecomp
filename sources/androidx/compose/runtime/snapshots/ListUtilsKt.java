package androidx.compose.runtime.snapshots;

import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

    public static final <T> List<T> fastFilterIndexed(List<? extends T> list, InterfaceC2072n interfaceC2072n) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            T t8 = list.get(i8);
            if (((Boolean) interfaceC2072n.invoke(Integer.valueOf(i8), t8)).booleanValue()) {
                arrayList.add(t8);
            }
        }
        return arrayList;
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

    public static final <T, K> Map<K, List<T>> fastGroupBy(List<? extends T> list, Function1 function1) {
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            T t8 = list.get(i8);
            Object invoke = function1.invoke(t8);
            Object obj = hashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(invoke, obj);
            }
            ((ArrayList) obj).add(t8);
        }
        return hashMap;
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

    public static final <T, R> List<R> fastMap(List<? extends T> list, Function1 function1) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(function1.invoke(list.get(i8)));
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

    public static final <T> Set<T> fastToSet(List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            hashSet.add(list.get(i8));
        }
        return hashSet;
    }
}
