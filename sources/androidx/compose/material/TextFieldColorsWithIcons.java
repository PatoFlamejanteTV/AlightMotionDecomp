package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface TextFieldColorsWithIcons extends TextFieldColors {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Composable
        @Deprecated
        public static State<Color> leadingIconColor(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
            State<Color> a9;
            AbstractC3292y.i(interactionSource, "interactionSource");
            a9 = b.a(textFieldColorsWithIcons, z8, z9, interactionSource, composer, i8);
            return a9;
        }

        @Composable
        @Deprecated
        public static State<Color> trailingIconColor(TextFieldColorsWithIcons textFieldColorsWithIcons, boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8) {
            State<Color> b9;
            AbstractC3292y.i(interactionSource, "interactionSource");
            b9 = b.b(textFieldColorsWithIcons, z8, z9, interactionSource, composer, i8);
            return b9;
        }
    }

    @Composable
    State<Color> leadingIconColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8);

    @Composable
    State<Color> trailingIconColor(boolean z8, boolean z9, InteractionSource interactionSource, Composer composer, int i8);
}
