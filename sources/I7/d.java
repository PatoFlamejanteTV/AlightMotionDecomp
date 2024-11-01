package I7;

/* loaded from: classes5.dex */
public abstract class d {
    public static int[] a(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        boolean z8;
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z9 = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (iArr[length] == iArr2[length]) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 &= z8;
        }
        return z9;
    }
}
