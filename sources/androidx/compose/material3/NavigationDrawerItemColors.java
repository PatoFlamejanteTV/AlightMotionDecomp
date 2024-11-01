package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

@Stable
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public interface NavigationDrawerItemColors {
    @Composable
    State<Color> badgeColor(boolean z8, Composer composer, int i8);

    @Composable
    State<Color> containerColor(boolean z8, Composer composer, int i8);

    @Composable
    State<Color> iconColor(boolean z8, Composer composer, int i8);

    @Composable
    State<Color> textColor(boolean z8, Composer composer, int i8);
}
