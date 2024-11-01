package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract /* synthetic */ class W0 {
    public static /* synthetic */ boolean a(PathMeasure pathMeasure, float f8, float f9, Path path, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 8) != 0) {
                z8 = true;
            }
            return pathMeasure.getSegment(f8, f9, path, z8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
    }
}
