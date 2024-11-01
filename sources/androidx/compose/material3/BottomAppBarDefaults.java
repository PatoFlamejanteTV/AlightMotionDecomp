package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.FabSecondaryTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BottomAppBarDefaults {
    public static final int $stable = 0;
    private static final PaddingValues ContentPadding;
    public static final BottomAppBarDefaults INSTANCE = new BottomAppBarDefaults();
    private static final float ContainerElevation = BottomAppBarTokens.INSTANCE.m1950getContainerElevationD9Ej5fM();

    static {
        float f8;
        float f9;
        f8 = AppBarKt.BottomAppBarHorizontalPadding;
        float bottomAppBarVerticalPadding = AppBarKt.getBottomAppBarVerticalPadding();
        f9 = AppBarKt.BottomAppBarHorizontalPadding;
        ContentPadding = PaddingKt.m574PaddingValuesa9UjIt4$default(f8, bottomAppBarVerticalPadding, f9, 0.0f, 8, null);
    }

    private BottomAppBarDefaults() {
    }

    @Composable
    public final long getBottomAppBarFabColor(Composer composer, int i8) {
        composer.startReplaceableGroup(-1464561486);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1464561486, i8, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-bottomAppBarFabColor> (AppBar.kt:959)");
        }
        long color = ColorSchemeKt.toColor(FabSecondaryTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getContainerColor(Composer composer, int i8) {
        composer.startReplaceableGroup(-368340078);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-368340078, i8, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-containerColor> (AppBar.kt:932)");
        }
        long color = ColorSchemeKt.toColor(BottomAppBarTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1450getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i8) {
        composer.startReplaceableGroup(688896409);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(688896409, i8, -1, "androidx.compose.material3.BottomAppBarDefaults.<get-windowInsets> (AppBar.kt:952)");
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
