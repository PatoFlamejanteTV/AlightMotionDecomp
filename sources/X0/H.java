package x0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class H {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] a(Object[] objArr, int i8, int i9, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i8, i9, objArr2.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] b(Object[] objArr, int i8) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map c() {
        return C4186i.u();
    }
}
