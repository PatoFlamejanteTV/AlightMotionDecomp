package androidx.compose.foundation.lazy.staggeredgrid;

/* loaded from: classes.dex */
public final class LazyStaggeredGridCellsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] calculateCellsCrossAxisSizeImpl(int i8, int i9, int i10) {
        int i11;
        int i12 = i8 - (i10 * (i9 - 1));
        int i13 = i12 / i9;
        int i14 = i12 % i9;
        int[] iArr = new int[i9];
        for (int i15 = 0; i15 < i9; i15++) {
            if (i15 < i14) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            iArr[i15] = i11 + i13;
        }
        return iArr;
    }
}
