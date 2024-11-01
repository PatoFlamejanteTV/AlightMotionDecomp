package androidx.compose.foundation.gestures.snapping;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SnapPositionInLayoutKt {
    public static final float calculateDistanceToDesiredSnapPosition(Density density, int i8, int i9, int i10, int i11, int i12, int i13, SnapPositionInLayout snapPositionInLayout) {
        AbstractC3292y.i(density, "<this>");
        AbstractC3292y.i(snapPositionInLayout, "snapPositionInLayout");
        return i12 - snapPositionInLayout.position(density, (i8 - i9) - i10, i11, i13);
    }
}
