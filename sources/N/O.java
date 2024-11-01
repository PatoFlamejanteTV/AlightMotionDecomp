package N;

/* loaded from: classes3.dex */
abstract class O {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i8) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i9 = 0; i9 < 6; i9++) {
            int i10 = iArr[i9];
            int i11 = i10 - 1;
            if (i10 != 0) {
                if (i11 == i8) {
                    return i10;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
