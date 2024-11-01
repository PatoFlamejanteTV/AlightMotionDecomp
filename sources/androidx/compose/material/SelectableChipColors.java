package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface SelectableChipColors {
    @Composable
    State<Color> backgroundColor(boolean z8, boolean z9, Composer composer, int i8);

    @Composable
    State<Color> contentColor(boolean z8, boolean z9, Composer composer, int i8);

    @Composable
    State<Color> leadingIconColor(boolean z8, boolean z9, Composer composer, int i8);
}
