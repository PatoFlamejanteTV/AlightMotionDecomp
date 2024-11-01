package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ProgressIndicatorDefaults {
    public static final int $stable = 0;
    public static final ProgressIndicatorDefaults INSTANCE = new ProgressIndicatorDefaults();
    private static final float CircularStrokeWidth = CircularProgressIndicatorTokens.INSTANCE.m1972getActiveIndicatorWidthD9Ej5fM();
    private static final SpringSpec<Float> ProgressAnimationSpec = new SpringSpec<>(1.0f, 50.0f, Float.valueOf(0.001f));

    private ProgressIndicatorDefaults() {
    }

    @Composable
    public final long getCircularColor(Composer composer, int i8) {
        composer.startReplaceableGroup(1803349725);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1803349725, i8, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:400)");
        }
        long color = ColorSchemeKt.toColor(CircularProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getCircularStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m1715getCircularStrokeWidthD9Ej5fM() {
        return CircularStrokeWidth;
    }

    @Composable
    public final long getLinearColor(Composer composer, int i8) {
        composer.startReplaceableGroup(-914312983);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-914312983, i8, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:396)");
        }
        long color = ColorSchemeKt.toColor(LinearProgressIndicatorTokens.INSTANCE.getActiveIndicatorColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getLinearTrackColor(Composer composer, int i8) {
        composer.startReplaceableGroup(1677541593);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677541593, i8, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:404)");
        }
        long color = ColorSchemeKt.toColor(LinearProgressIndicatorTokens.INSTANCE.getTrackColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    public final SpringSpec<Float> getProgressAnimationSpec() {
        return ProgressAnimationSpec;
    }
}
