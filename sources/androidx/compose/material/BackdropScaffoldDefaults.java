package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BackdropScaffoldDefaults {
    public static final int $stable = 0;
    public static final BackdropScaffoldDefaults INSTANCE = new BackdropScaffoldDefaults();
    private static final float PeekHeight = Dp.m5155constructorimpl(56);
    private static final float HeaderHeight = Dp.m5155constructorimpl(48);
    private static final float FrontLayerElevation = Dp.m5155constructorimpl(1);

    private BackdropScaffoldDefaults() {
    }

    /* renamed from: getFrontLayerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1086getFrontLayerElevationD9Ej5fM() {
        return FrontLayerElevation;
    }

    @Composable
    public final long getFrontLayerScrimColor(Composer composer, int i8) {
        composer.startReplaceableGroup(1806270648);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1806270648, i8, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:517)");
        }
        long m2947copywmQWz5c$default = Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2947copywmQWz5c$default;
    }

    @Composable
    public final Shape getFrontLayerShape(Composer composer, int i8) {
        composer.startReplaceableGroup(1580588700);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1580588700, i8, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:505)");
        }
        float f8 = 16;
        CornerBasedShape copy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getLarge(), CornerSizeKt.m821CornerSize0680j_4(Dp.m5155constructorimpl(f8)), CornerSizeKt.m821CornerSize0680j_4(Dp.m5155constructorimpl(f8)), null, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return copy$default;
    }

    /* renamed from: getHeaderHeight-D9Ej5fM, reason: not valid java name */
    public final float m1087getHeaderHeightD9Ej5fM() {
        return HeaderHeight;
    }

    /* renamed from: getPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m1088getPeekHeightD9Ej5fM() {
        return PeekHeight;
    }
}
