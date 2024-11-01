package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

@Stable
/* loaded from: classes.dex */
public interface RadioButtonColors {
    @Composable
    State<Color> radioColor(boolean z8, boolean z9, Composer composer, int i8);
}
