package androidx.compose.material3;

import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DividerDefaults {
    public static final int $stable = 0;
    public static final DividerDefaults INSTANCE = new DividerDefaults();
    private static final float Thickness = DividerTokens.INSTANCE.m2034getThicknessD9Ej5fM();

    private DividerDefaults() {
    }

    @Composable
    public final long getColor(Composer composer, int i8) {
        composer.startReplaceableGroup(77461041);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(77461041, i8, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:67)");
        }
        long color = ColorSchemeKt.toColor(DividerTokens.INSTANCE.getColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getThickness-D9Ej5fM, reason: not valid java name */
    public final float m1579getThicknessD9Ej5fM() {
        return Thickness;
    }
}
