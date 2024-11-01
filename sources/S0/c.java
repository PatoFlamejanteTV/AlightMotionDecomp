package S0;

import java.util.HashMap;

/* loaded from: classes3.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f9367a;

    public c(int i8) {
        this.f9367a = i8;
    }

    private static boolean b(StackTraceElement[] stackTraceElementArr, int i8, int i9) {
        int i10 = i9 - i8;
        if (i9 + i10 > stackTraceElementArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!stackTraceElementArr[i8 + i11].equals(stackTraceElementArr[i9 + i11])) {
                return false;
            }
        }
        return true;
    }

    private static StackTraceElement[] c(StackTraceElement[] stackTraceElementArr, int i8) {
        int i9;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null && b(stackTraceElementArr, num.intValue(), i10)) {
                int intValue = i10 - num.intValue();
                if (i12 < i8) {
                    System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue);
                    i11 += intValue;
                    i12++;
                }
                i9 = (intValue - 1) + i10;
            } else {
                stackTraceElementArr2[i11] = stackTraceElementArr[i10];
                i11++;
                i9 = i10;
                i12 = 1;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i9 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        return stackTraceElementArr3;
    }

    @Override // S0.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] c8 = c(stackTraceElementArr, this.f9367a);
        if (c8.length < stackTraceElementArr.length) {
            return c8;
        }
        return stackTraceElementArr;
    }
}
