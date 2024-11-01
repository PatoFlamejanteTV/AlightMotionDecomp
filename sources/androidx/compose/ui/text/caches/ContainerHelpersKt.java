package androidx.compose.ui.text.caches;

/* loaded from: classes.dex */
public final class ContainerHelpersKt {
    public static final int[] EMPTY_INTS = new int[0];
    public static final Object[] EMPTY_OBJECTS = new Object[0];

    public static final int binarySearchInternal(int[] iArr, int i8, int i9) {
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = iArr[i12];
            if (i13 < i9) {
                i11 = i12 + 1;
            } else if (i13 > i9) {
                i10 = i12 - 1;
            } else {
                return i12;
            }
        }
        return ~i11;
    }
}
