package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static void a(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, float[] fArr) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    public static /* synthetic */ void b(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, float[] fArr) {
        a(layoutCoordinates, layoutCoordinates2, fArr);
    }

    public static /* synthetic */ Rect c(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
    }
}
