package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static State a(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1279189910);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1279189910, i8, -1, "androidx.compose.material.TextFieldColorsWithIcons.leadingIconColor (TextFieldDefaults.kt:160)");
        }
        State<Color> leadingIconColor = textFieldColorsWithIcons.leadingIconColor(z8, z9, composer, (i8 & 126) | ((i8 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return leadingIconColor;
    }

    public static State b(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
        AbstractC3292y.i(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-712140408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-712140408, i8, -1, "androidx.compose.material.TextFieldColorsWithIcons.trailingIconColor (TextFieldDefaults.kt:177)");
        }
        State<Color> trailingIconColor = textFieldColorsWithIcons.trailingIconColor(z8, z9, composer, (i8 & 126) | ((i8 >> 3) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return trailingIconColor;
    }
}
