package m6;

/* renamed from: m6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3375b {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f35041a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal[] f35042b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i8 = 0; i8 < 4; i8++) {
            threadLocalArr[i8] = new ThreadLocal();
        }
        f35042b = threadLocalArr;
    }

    public static final boolean a() {
        return f35041a;
    }
}
