package S5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class c {
    public static final Object[] d(int i8) {
        if (i8 >= 0) {
            return new Object[i8];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final Object[] e(Object[] objArr, int i8) {
        AbstractC3292y.i(objArr, "<this>");
        Object[] copyOf = Arrays.copyOf(objArr, i8);
        AbstractC3292y.h(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final void f(Object[] objArr, int i8) {
        AbstractC3292y.i(objArr, "<this>");
        objArr[i8] = null;
    }

    public static final void g(Object[] objArr, int i8, int i9) {
        AbstractC3292y.i(objArr, "<this>");
        while (i8 < i9) {
            f(objArr, i8);
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Object[] objArr, int i8, int i9, List list) {
        if (i9 != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!AbstractC3292y.d(objArr[i8 + i10], list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(Object[] objArr, int i8, int i9) {
        int i10;
        int i11 = 1;
        for (int i12 = 0; i12 < i9; i12++) {
            Object obj = objArr[i8 + i12];
            int i13 = i11 * 31;
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 = i13 + i10;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Object[] objArr, int i8, int i9, Collection collection) {
        StringBuilder sb = new StringBuilder((i9 * 3) + 2);
        sb.append("[");
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i8 + i10];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "toString(...)");
        return sb2;
    }
}
