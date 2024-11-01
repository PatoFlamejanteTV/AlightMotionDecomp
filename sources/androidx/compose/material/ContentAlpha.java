package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ContentAlpha {
    public static final int $stable = 0;
    public static final ContentAlpha INSTANCE = new ContentAlpha();

    private ContentAlpha() {
    }

    @Composable
    private final float contentAlpha(float f8, float f9, Composer composer, int i8) {
        composer.startReplaceableGroup(-1528360391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1528360391, i8, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:70)");
        }
        long m2958unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
        if (!MaterialTheme.INSTANCE.getColors(composer, 6).isLight() ? ColorKt.m3000luminance8_81llA(m2958unboximpl) >= 0.5d : ColorKt.m3000luminance8_81llA(m2958unboximpl) <= 0.5d) {
            f8 = f9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return f8;
    }

    @Composable
    public final float getDisabled(Composer composer, int i8) {
        composer.startReplaceableGroup(621183615);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(621183615, i8, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:56)");
        }
        float contentAlpha = contentAlpha(0.38f, 0.38f, composer, ((i8 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    @Composable
    public final float getHigh(Composer composer, int i8) {
        composer.startReplaceableGroup(629162431);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(629162431, i8, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:34)");
        }
        float contentAlpha = contentAlpha(1.0f, 0.87f, composer, ((i8 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return contentAlpha;
    }

    @Composable
    public final float getMedium(Composer composer, int i8) {
        composer.startReplaceableGroup(1999054879);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1999054879, i8, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:45)");
        }
        float contentAlpha = contentAlpha(0.74f, 0.6f, composer, ((i8 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return contentAlpha;
    }
}
