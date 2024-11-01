package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface ChipColors {
    @Composable
    State<Color> backgroundColor(boolean z8, Composer composer, int i8);

    @Composable
    State<Color> contentColor(boolean z8, Composer composer, int i8);

    @Composable
    State<Color> leadingIconContentColor(boolean z8, Composer composer, int i8);
}
