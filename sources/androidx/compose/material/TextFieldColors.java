package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

@Stable
/* loaded from: classes.dex */
public interface TextFieldColors {
    @Composable
    State<Color> backgroundColor(boolean z8, Composer composer, int i8);

    @Composable
    State<Color> cursorColor(boolean z8, Composer composer, int i8);

    @Composable
    State<Color> indicatorColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8);

    @Composable
    State<Color> labelColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8);

    @Composable
    State<Color> leadingIconColor(boolean z8, boolean z9, Composer composer, int i8);

    @Composable
    State<Color> placeholderColor(boolean z8, Composer composer, int i8);

    @Composable
    State<Color> textColor(boolean z8, Composer composer, int i8);

    @Composable
    State<Color> trailingIconColor(boolean z8, boolean z9, Composer composer, int i8);
}
