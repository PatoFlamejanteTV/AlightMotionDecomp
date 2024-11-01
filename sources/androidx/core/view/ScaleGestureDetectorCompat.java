package androidx.core.view;

import android.view.ScaleGestureDetector;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class ScaleGestureDetectorCompat {
    private ScaleGestureDetectorCompat() {
    }

    @Deprecated
    public static boolean isQuickScaleEnabled(Object obj) {
        return isQuickScaleEnabled((ScaleGestureDetector) obj);
    }

    @Deprecated
    public static void setQuickScaleEnabled(Object obj, boolean z8) {
        setQuickScaleEnabled((ScaleGestureDetector) obj, z8);
    }

    public static boolean isQuickScaleEnabled(@NonNull ScaleGestureDetector scaleGestureDetector) {
        return scaleGestureDetector.isQuickScaleEnabled();
    }

    public static void setQuickScaleEnabled(@NonNull ScaleGestureDetector scaleGestureDetector, boolean z8) {
        scaleGestureDetector.setQuickScaleEnabled(z8);
    }
}
