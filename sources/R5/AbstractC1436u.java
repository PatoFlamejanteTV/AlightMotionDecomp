package R5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: R5.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1436u {
    public static List a(List builder) {
        AbstractC3292y.i(builder, "builder");
        return ((S5.b) builder).u();
    }

    public static final Object[] b(Object[] objArr, boolean z8) {
        AbstractC3292y.i(objArr, "<this>");
        if (!z8 || !AbstractC3292y.d(objArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
            AbstractC3292y.h(copyOf, "copyOf(...)");
            return copyOf;
        }
        return objArr;
    }

    public static List c() {
        return new S5.b(0, 1, null);
    }

    public static List d(int i8) {
        return new S5.b(i8);
    }

    public static List e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC3292y.h(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Object[] f(int i8, Object[] array) {
        AbstractC3292y.i(array, "array");
        if (i8 < array.length) {
            array[i8] = null;
        }
        return array;
    }
}
