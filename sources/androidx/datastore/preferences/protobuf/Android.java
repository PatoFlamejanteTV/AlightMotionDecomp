package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
final class Android {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC;
    private static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    static {
        boolean z8;
        if (!ASSUME_ANDROID && getClassForName("org.robolectric.Robolectric") != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        IS_ROBOLECTRIC = z8;
    }

    private Android() {
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isOnAndroidDevice() {
        if (!ASSUME_ANDROID && (MEMORY_CLASS == null || IS_ROBOLECTRIC)) {
            return false;
        }
        return true;
    }
}
