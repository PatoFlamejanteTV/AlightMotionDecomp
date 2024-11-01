package androidx.core.content.res;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
final class GrowingArrayUtils {
    private GrowingArrayUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
    public static <T> T[] append(T[] tArr, int i8, T t8) {
        if (i8 + 1 > tArr.length) {
            ?? r02 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i8));
            System.arraycopy(tArr, 0, r02, 0, i8);
            tArr = r02;
        }
        tArr[i8] = t8;
        return tArr;
    }

    public static int growSize(int i8) {
        if (i8 <= 4) {
            return 8;
        }
        return i8 * 2;
    }

    public static <T> T[] insert(T[] tArr, int i8, int i9, T t8) {
        if (i8 + 1 <= tArr.length) {
            System.arraycopy(tArr, i9, tArr, i9 + 1, i8 - i9);
            tArr[i9] = t8;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i8)));
        System.arraycopy(tArr, 0, tArr2, 0, i9);
        tArr2[i9] = t8;
        System.arraycopy(tArr, i9, tArr2, i9 + 1, tArr.length - i9);
        return tArr2;
    }

    public static int[] append(int[] iArr, int i8, int i9) {
        if (i8 + 1 > iArr.length) {
            int[] iArr2 = new int[growSize(i8)];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            iArr = iArr2;
        }
        iArr[i8] = i9;
        return iArr;
    }

    public static int[] insert(int[] iArr, int i8, int i9, int i10) {
        if (i8 + 1 <= iArr.length) {
            System.arraycopy(iArr, i9, iArr, i9 + 1, i8 - i9);
            iArr[i9] = i10;
            return iArr;
        }
        int[] iArr2 = new int[growSize(i8)];
        System.arraycopy(iArr, 0, iArr2, 0, i9);
        iArr2[i9] = i10;
        System.arraycopy(iArr, i9, iArr2, i9 + 1, iArr.length - i9);
        return iArr2;
    }

    public static long[] append(long[] jArr, int i8, long j8) {
        if (i8 + 1 > jArr.length) {
            long[] jArr2 = new long[growSize(i8)];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            jArr = jArr2;
        }
        jArr[i8] = j8;
        return jArr;
    }

    public static boolean[] append(boolean[] zArr, int i8, boolean z8) {
        if (i8 + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[growSize(i8)];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            zArr = zArr2;
        }
        zArr[i8] = z8;
        return zArr;
    }

    public static long[] insert(long[] jArr, int i8, int i9, long j8) {
        if (i8 + 1 <= jArr.length) {
            System.arraycopy(jArr, i9, jArr, i9 + 1, i8 - i9);
            jArr[i9] = j8;
            return jArr;
        }
        long[] jArr2 = new long[growSize(i8)];
        System.arraycopy(jArr, 0, jArr2, 0, i9);
        jArr2[i9] = j8;
        System.arraycopy(jArr, i9, jArr2, i9 + 1, jArr.length - i9);
        return jArr2;
    }

    public static boolean[] insert(boolean[] zArr, int i8, int i9, boolean z8) {
        if (i8 + 1 <= zArr.length) {
            System.arraycopy(zArr, i9, zArr, i9 + 1, i8 - i9);
            zArr[i9] = z8;
            return zArr;
        }
        boolean[] zArr2 = new boolean[growSize(i8)];
        System.arraycopy(zArr, 0, zArr2, 0, i9);
        zArr2[i9] = z8;
        System.arraycopy(zArr, i9, zArr2, i9 + 1, zArr.length - i9);
        return zArr2;
    }
}
