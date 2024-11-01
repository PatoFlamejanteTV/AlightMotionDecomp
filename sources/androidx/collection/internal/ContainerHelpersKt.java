package androidx.collection.internal;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ContainerHelpersKt {
    public static final int[] EMPTY_INTS = new int[0];
    public static final long[] EMPTY_LONGS = new long[0];
    public static final Object[] EMPTY_OBJECTS = new Object[0];

    public static final int binarySearch(int[] array, int i8, int i9) {
        AbstractC3292y.i(array, "array");
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = array[i12];
            if (i13 < i9) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i9) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final boolean equal(Object obj, Object obj2) {
        return AbstractC3292y.d(obj, obj2);
    }

    public static final int idealByteArraySize(int i8) {
        for (int i9 = 4; i9 < 32; i9++) {
            int i10 = (1 << i9) - 12;
            if (i8 <= i10) {
                return i10;
            }
        }
        return i8;
    }

    public static final int idealIntArraySize(int i8) {
        return idealByteArraySize(i8 * 4) / 4;
    }

    public static final int idealLongArraySize(int i8) {
        return idealByteArraySize(i8 * 8) / 8;
    }

    public static final int binarySearch(long[] array, int i8, long j8) {
        AbstractC3292y.i(array, "array");
        int i9 = i8 - 1;
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) >>> 1;
            long j9 = array[i11];
            if (j9 < j8) {
                i10 = i11 + 1;
            } else {
                if (j9 <= j8) {
                    return i11;
                }
                i9 = i11 - 1;
            }
        }
        return ~i10;
    }
}
