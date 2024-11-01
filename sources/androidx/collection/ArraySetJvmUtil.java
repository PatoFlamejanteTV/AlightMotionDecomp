package androidx.collection;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T[] resizeForToArray(T[] tArr, int i8) {
        if (tArr.length < i8) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i8));
        }
        if (tArr.length > i8) {
            tArr[i8] = null;
        }
        return tArr;
    }
}
