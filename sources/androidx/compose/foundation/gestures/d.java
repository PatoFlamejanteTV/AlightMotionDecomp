package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ void a(TransformScope transformScope, float f8, long j8, float f9, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                f8 = 1.0f;
            }
            if ((i8 & 2) != 0) {
                j8 = Offset.Companion.m2728getZeroF1C5BW0();
            }
            if ((i8 & 4) != 0) {
                f9 = 0.0f;
            }
            transformScope.mo355transformByd4ec7I(f8, j8, f9);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
    }
}
