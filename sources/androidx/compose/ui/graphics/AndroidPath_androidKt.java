package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public final class AndroidPath_androidKt {
    public static final Path Path() {
        return new AndroidPath(null, 1, 0 == true ? 1 : 0);
    }

    public static final android.graphics.Path asAndroidPath(Path path) {
        if (path instanceof AndroidPath) {
            return ((AndroidPath) path).getInternalPath();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final Path asComposePath(android.graphics.Path path) {
        return new AndroidPath(path);
    }
}
