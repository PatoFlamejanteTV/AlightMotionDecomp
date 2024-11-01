package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class TopAppBarDefaults {
    public static final int $stable = 0;
    public static final TopAppBarDefaults INSTANCE = new TopAppBarDefaults();

    private TopAppBarDefaults() {
    }

    @Composable
    /* renamed from: centerAlignedTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m1926centerAlignedTopAppBarColorszjMxDiM(long j8, long j9, long j10, long j11, long j12, Composer composer, int i8, int i9) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        composer.startReplaceableGroup(1896017784);
        if ((i9 & 1) != 0) {
            j13 = ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j13 = j8;
        }
        if ((i9 & 2) != 0) {
            j14 = ColorSchemeKt.m1542applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j13, TopAppBarSmallTokens.INSTANCE.m2391getOnScrollContainerElevationD9Ej5fM());
        } else {
            j14 = j9;
        }
        if ((i9 & 4) != 0) {
            j15 = ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        } else {
            j15 = j10;
        }
        if ((i9 & 8) != 0) {
            j16 = ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getHeadlineColor(), composer, 6);
        } else {
            j16 = j11;
        }
        if ((i9 & 16) != 0) {
            j17 = ColorSchemeKt.toColor(TopAppBarSmallCenteredTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        } else {
            j17 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896017784, i8, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:582)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(j13, j14, j15, j16, j17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }

    @Composable
    @ExperimentalMaterial3Api
    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(TopAppBarState topAppBarState, Function0 function0, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(959086674);
        if ((i9 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i9 & 2) != 0) {
            function0 = TopAppBarDefaults$enterAlwaysScrollBehavior$1.INSTANCE;
        }
        if ((i9 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i9 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959086674, i8, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:695)");
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = new EnterAlwaysScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterAlwaysScrollBehavior;
    }

    @Composable
    @ExperimentalMaterial3Api
    public final TopAppBarScrollBehavior exitUntilCollapsedScrollBehavior(TopAppBarState topAppBarState, Function0 function0, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(-1757023234);
        if ((i9 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i9 & 2) != 0) {
            function0 = TopAppBarDefaults$exitUntilCollapsedScrollBehavior$1.INSTANCE;
        }
        if ((i9 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i9 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1757023234, i8, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:728)");
        }
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = new ExitUntilCollapsedScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return exitUntilCollapsedScrollBehavior;
    }

    @Composable
    public final WindowInsets getWindowInsets(Composer composer, int i8) {
        composer.startReplaceableGroup(2143182847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143182847, i8, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:567)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 8);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m650onlybOOhFvg = WindowInsetsKt.m650onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m660plusgK_yJZ4(companion.m670getHorizontalJoeWqyM(), companion.m674getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m650onlybOOhFvg;
    }

    @Composable
    /* renamed from: largeTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m1927largeTopAppBarColorszjMxDiM(long j8, long j9, long j10, long j11, long j12, Composer composer, int i8, int i9) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        composer.startReplaceableGroup(-1471507700);
        if ((i9 & 1) != 0) {
            j13 = ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j13 = j8;
        }
        if ((i9 & 2) != 0) {
            j14 = ColorSchemeKt.m1542applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j13, TopAppBarSmallTokens.INSTANCE.m2391getOnScrollContainerElevationD9Ej5fM());
        } else {
            j14 = j9;
        }
        if ((i9 & 4) != 0) {
            j15 = ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        } else {
            j15 = j10;
        }
        if ((i9 & 8) != 0) {
            j16 = ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getHeadlineColor(), composer, 6);
        } else {
            j16 = j11;
        }
        if ((i9 & 16) != 0) {
            j17 = ColorSchemeKt.toColor(TopAppBarLargeTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        } else {
            j17 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471507700, i8, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:644)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(j13, j14, j15, j16, j17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }

    @Composable
    /* renamed from: mediumTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m1928mediumTopAppBarColorszjMxDiM(long j8, long j9, long j10, long j11, long j12, Composer composer, int i8, int i9) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        composer.startReplaceableGroup(-582474442);
        if ((i9 & 1) != 0) {
            j13 = ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j13 = j8;
        }
        if ((i9 & 2) != 0) {
            j14 = ColorSchemeKt.m1542applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j13, TopAppBarSmallTokens.INSTANCE.m2391getOnScrollContainerElevationD9Ej5fM());
        } else {
            j14 = j9;
        }
        if ((i9 & 4) != 0) {
            j15 = ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        } else {
            j15 = j10;
        }
        if ((i9 & 8) != 0) {
            j16 = ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getHeadlineColor(), composer, 6);
        } else {
            j16 = j11;
        }
        if ((i9 & 16) != 0) {
            j17 = ColorSchemeKt.toColor(TopAppBarMediumTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        } else {
            j17 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-582474442, i8, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:613)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(j13, j14, j15, j16, j17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }

    @Composable
    @ExperimentalMaterial3Api
    public final TopAppBarScrollBehavior pinnedScrollBehavior(TopAppBarState topAppBarState, Function0 function0, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(286497075);
        if ((i9 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i9 & 2) != 0) {
            function0 = TopAppBarDefaults$pinnedScrollBehavior$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286497075, i8, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:673)");
        }
        PinnedScrollBehavior pinnedScrollBehavior = new PinnedScrollBehavior(topAppBarState, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pinnedScrollBehavior;
    }

    @Composable
    /* renamed from: smallTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m1929smallTopAppBarColorszjMxDiM(long j8, long j9, long j10, long j11, long j12, Composer composer, int i8, int i9) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        composer.startReplaceableGroup(-1717201472);
        if ((i9 & 1) != 0) {
            j13 = ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getContainerColor(), composer, 6);
        } else {
            j13 = j8;
        }
        if ((i9 & 2) != 0) {
            j14 = ColorSchemeKt.m1542applyTonalElevationHht5A8o(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j13, TopAppBarSmallTokens.INSTANCE.m2391getOnScrollContainerElevationD9Ej5fM());
        } else {
            j14 = j9;
        }
        if ((i9 & 4) != 0) {
            j15 = ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getLeadingIconColor(), composer, 6);
        } else {
            j15 = j10;
        }
        if ((i9 & 8) != 0) {
            j16 = ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getHeadlineColor(), composer, 6);
        } else {
            j16 = j11;
        }
        if ((i9 & 16) != 0) {
            j17 = ColorSchemeKt.toColor(TopAppBarSmallTokens.INSTANCE.getTrailingIconColor(), composer, 6);
        } else {
            j17 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1717201472, i8, -1, "androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors (AppBar.kt:544)");
        }
        TopAppBarColors topAppBarColors = new TopAppBarColors(j13, j14, j15, j16, j17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColors;
    }
}
