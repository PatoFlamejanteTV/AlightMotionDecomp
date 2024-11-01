package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;

@Stable
/* loaded from: classes.dex */
public interface ButtonElevation {
    @Composable
    State<Dp> elevation(boolean z8, InteractionSource interactionSource, Composer composer, int i8);
}
