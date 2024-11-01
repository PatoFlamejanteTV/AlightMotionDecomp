package x0;

/* renamed from: x0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4190m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i8, double d8) {
        int max = Math.max(i8, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (d8 * highestOneBit))) {
            int i9 = highestOneBit << 1;
            if (i9 <= 0) {
                return 1073741824;
            }
            return i9;
        }
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i8) {
        return (int) (Integer.rotateLeft((int) (i8 * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return b(hashCode);
    }
}
