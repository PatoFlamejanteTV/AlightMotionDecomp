package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AlertDialogDefaults {
    public static final int $stable = 0;
    public static final AlertDialogDefaults INSTANCE = new AlertDialogDefaults();
    private static final float TonalElevation = DialogTokens.INSTANCE.m2032getContainerElevationD9Ej5fM();

    private AlertDialogDefaults() {
    }

    @Composable
    public final long getContainerColor(Composer composer, int i8) {
        composer.startReplaceableGroup(-285850401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-285850401, i8, -1, "androidx.compose.material3.AlertDialogDefaults.<get-containerColor> (AndroidAlertDialog.android.kt:133)");
        }
        long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getIconContentColor(Composer composer, int i8) {
        composer.startReplaceableGroup(1074292351);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1074292351, i8, -1, "androidx.compose.material3.AlertDialogDefaults.<get-iconContentColor> (AndroidAlertDialog.android.kt:136)");
        }
        long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getIconColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final Shape getShape(Composer composer, int i8) {
        composer.startReplaceableGroup(-331760525);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-331760525, i8, -1, "androidx.compose.material3.AlertDialogDefaults.<get-shape> (AndroidAlertDialog.android.kt:130)");
        }
        Shape shape = ShapesKt.toShape(DialogTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    public final long getTextContentColor(Composer composer, int i8) {
        composer.startReplaceableGroup(-1352479489);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1352479489, i8, -1, "androidx.compose.material3.AlertDialogDefaults.<get-textContentColor> (AndroidAlertDialog.android.kt:142)");
        }
        long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    public final long getTitleContentColor(Composer composer, int i8) {
        composer.startReplaceableGroup(11981687);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(11981687, i8, -1, "androidx.compose.material3.AlertDialogDefaults.<get-titleContentColor> (AndroidAlertDialog.android.kt:139)");
        }
        long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getHeadlineColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m1427getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }
}
