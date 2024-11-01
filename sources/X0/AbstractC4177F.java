package x0;

/* renamed from: x0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4177F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj, int i8) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i8);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] c(Object[] objArr, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            a(objArr[i9], i9);
        }
        return objArr;
    }

    public static Object[] d(Object[] objArr, int i8) {
        return H.b(objArr, i8);
    }
}
