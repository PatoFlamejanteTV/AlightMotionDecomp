package c2;

/* loaded from: classes4.dex */
public abstract class F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i8, C2018d c2018d) {
        int i9 = i8 >>> 24;
        if (i9 != 0 && i9 != 1) {
            switch (i9) {
                case 16:
                case 17:
                case 18:
                case 23:
                    break;
                case 19:
                case 20:
                case 21:
                    c2018d.g(i9);
                    return;
                case 22:
                    break;
                default:
                    switch (i9) {
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            c2018d.i(i8);
                            return;
                        default:
                            throw new IllegalArgumentException();
                    }
            }
            c2018d.e(i9, (i8 & 16776960) >> 8);
            return;
        }
        c2018d.k(i8 >>> 16);
    }
}
