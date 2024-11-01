package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;

@Stable
/* loaded from: classes.dex */
public interface CheckboxColors {
    @Composable
    State<Color> borderColor(boolean z8, ToggleableState toggleableState, Composer composer, int i8);

    @Composable
    State<Color> boxColor(boolean z8, ToggleableState toggleableState, Composer composer, int i8);

    @Composable
    State<Color> checkmarkColor(ToggleableState toggleableState, Composer composer, int i8);
}
