package l0;

import Q.AbstractC1396p;

/* renamed from: l0.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3295A {
    public static String a(String str, String[] strArr, String[] strArr2) {
        boolean equals;
        AbstractC1396p.l(strArr);
        AbstractC1396p.l(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i8 = 0; i8 < min; i8++) {
            String str2 = strArr[i8];
            if (str == null && str2 == null) {
                equals = true;
            } else if (str == null) {
                equals = false;
            } else {
                equals = str.equals(str2);
            }
            if (equals) {
                return strArr2[i8];
            }
        }
        return null;
    }
}
