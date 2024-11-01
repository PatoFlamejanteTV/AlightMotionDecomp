package j$.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Objects {
    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static <T> T requireNonNull(T t8) {
        t8.getClass();
        return t8;
    }

    public static <T> T requireNonNull(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    public static String toString(Object obj) {
        return String.valueOf(obj);
    }
}
