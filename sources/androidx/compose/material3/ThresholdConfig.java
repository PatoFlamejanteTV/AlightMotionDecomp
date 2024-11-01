package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public interface ThresholdConfig {
    float computeThreshold(Density density, float f8, float f9);
}
