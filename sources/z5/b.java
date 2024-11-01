package z5;

import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public abstract class b {
    private static int a(int i8) {
        if (i8 < 3) {
            return i8 + 1;
        }
        if (i8 < 1073741824) {
            return (int) ((i8 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap b(int i8) {
        return new LinkedHashMap(a(i8));
    }
}
