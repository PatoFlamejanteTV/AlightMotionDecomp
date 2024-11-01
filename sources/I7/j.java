package I7;

/* loaded from: classes5.dex */
public abstract class j {
    public static int a(int i8) {
        int i9 = -1;
        while (i8 != 0) {
            i9++;
            i8 >>>= 1;
        }
        return i9;
    }

    public static int b(int i8, int i9) {
        while (true) {
            int i10 = i9;
            int i11 = i8;
            i8 = i10;
            if (i8 != 0) {
                i9 = e(i11, i8);
            } else {
                return i11;
            }
        }
    }

    public static boolean c(int i8) {
        if (i8 == 0) {
            return false;
        }
        int a9 = a(i8) >>> 1;
        int i9 = 2;
        for (int i10 = 0; i10 < a9; i10++) {
            i9 = d(i9, i9, i8);
            if (b(i9 ^ 2, i8) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(int i8, int i9, int i10) {
        int e8 = e(i8, i10);
        int e9 = e(i9, i10);
        int i11 = 0;
        if (e9 != 0) {
            int a9 = 1 << a(i10);
            while (e8 != 0) {
                if (((byte) (e8 & 1)) == 1) {
                    i11 ^= e9;
                }
                e8 >>>= 1;
                e9 <<= 1;
                if (e9 >= a9) {
                    e9 ^= i10;
                }
            }
        }
        return i11;
    }

    public static int e(int i8, int i9) {
        if (i9 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (a(i8) >= a(i9)) {
            i8 ^= i9 << (a(i8) - a(i9));
        }
        return i8;
    }
}
