package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.NavigationRailTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NavigationRailDefaults {
    public static final int $stable = 0;
    public static final NavigationRailDefaults INSTANCE = new NavigationRailDefaults();

    private NavigationRailDefaults() {
    }

    @Composable
    public final long getContainerColor(Composer composer, int i8) {
        composer.startReplaceableGroup(-1949394041);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1949394041, i8, -1, "androidx.compose.material3.NavigationRailDefaults.<get-ContainerColor> (NavigationRail.kt:263)");
        }
        long color = ColorSchemeKt.toColor(NavigationRailTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i8) {
        composer.startReplaceableGroup(-1546379058);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1546379058, i8, -1, "androidx.compose.material3.NavigationRailDefaults.<get-windowInsets> (NavigationRail.kt:270)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m650onlybOOhFvg = WindowInsetsKt.m650onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m660plusgK_yJZ4(companion.m675getVerticalJoeWqyM(), companion.m673getStartJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m650onlybOOhFvg;
    }
}
