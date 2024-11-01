package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NavigationBarDefaults {
    public static final int $stable = 0;
    public static final NavigationBarDefaults INSTANCE = new NavigationBarDefaults();
    private static final float Elevation = NavigationBarTokens.INSTANCE.m2197getContainerElevationD9Ej5fM();

    private NavigationBarDefaults() {
    }

    @Composable
    public final long getContainerColor(Composer composer, int i8) {
        composer.startReplaceableGroup(1528098623);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1528098623, i8, -1, "androidx.compose.material3.NavigationBarDefaults.<get-containerColor> (NavigationBar.kt:265)");
        }
        long color = ColorSchemeKt.toColor(NavigationBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1672getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i8) {
        composer.startReplaceableGroup(-1938678202);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1938678202, i8, -1, "androidx.compose.material3.NavigationBarDefaults.<get-windowInsets> (NavigationBar.kt:272)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m650onlybOOhFvg = WindowInsetsKt.m650onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m660plusgK_yJZ4(companion.m670getHorizontalJoeWqyM(), companion.m668getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m650onlybOOhFvg;
    }
}
