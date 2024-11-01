package w0;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class f extends AbstractC4141b {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
