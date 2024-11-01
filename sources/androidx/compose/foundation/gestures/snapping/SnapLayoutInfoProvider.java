package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.unit.Density;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface SnapLayoutInfoProvider {
    float calculateApproachOffset(Density density, float f8);

    float calculateSnapStepSize(Density density);

    float calculateSnappingOffset(Density density, float f8);
}
