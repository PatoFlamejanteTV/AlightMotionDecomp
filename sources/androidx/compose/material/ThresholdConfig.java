package androidx.compose.material;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;

@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface ThresholdConfig {
    float computeThreshold(Density density, float f8, float f9);
}
