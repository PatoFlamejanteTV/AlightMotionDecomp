package V;

import Q.AbstractC1394n;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class b {
    public static boolean a(int[] iArr, int i8) {
        if (iArr != null) {
            for (int i9 : iArr) {
                if (i9 == i8) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int i8;
        if (objArr != null) {
            i8 = objArr.length;
        } else {
            i8 = 0;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                break;
            }
            if (AbstractC1394n.a(objArr[i9], obj)) {
                if (i9 >= 0) {
                    return true;
                }
            } else {
                i9++;
            }
        }
        return false;
    }

    public static ArrayList c() {
        return new ArrayList();
    }
}
