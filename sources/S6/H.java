package s6;

/* loaded from: classes5.dex */
abstract /* synthetic */ class H {

    /* renamed from: a, reason: collision with root package name */
    private static final int f39168a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f39168a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
