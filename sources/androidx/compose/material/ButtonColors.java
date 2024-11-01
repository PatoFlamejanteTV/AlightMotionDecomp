package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

@Stable
/* loaded from: classes.dex */
public interface ButtonColors {
    @Composable
    State<Color> backgroundColor(boolean z8, Composer composer, int i8);

    @Composable
    State<Color> contentColor(boolean z8, Composer composer, int i8);
}
