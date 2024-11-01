package D0;

/* loaded from: classes3.dex */
public abstract class E {
    public static void a(boolean z8, String str) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static Object b(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z8, String str) {
        if (z8) {
        } else {
            throw new IllegalStateException(str);
        }
    }
}
