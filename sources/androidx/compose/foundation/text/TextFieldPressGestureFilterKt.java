package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldPressGestureFilterKt {
    public static final Modifier tapPressTextFieldModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z8, Function1 onTap) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(onTap, "onTap");
        if (z8) {
            return ComposedModifierKt.composed$default(modifier, null, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(onTap, mutableInteractionSource), 1, null);
        }
        return modifier;
    }

    public static /* synthetic */ Modifier tapPressTextFieldModifier$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return tapPressTextFieldModifier(modifier, mutableInteractionSource, z8, function1);
    }
}
