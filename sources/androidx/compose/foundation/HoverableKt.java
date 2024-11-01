package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class HoverableKt {
    public static final Modifier hoverable(Modifier modifier, MutableInteractionSource interactionSource, boolean z8) {
        Modifier modifier2;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(interactionSource, "interactionSource");
        if (z8) {
            modifier2 = new HoverableElement(interactionSource);
        } else {
            modifier2 = Modifier.Companion;
        }
        return modifier.then(modifier2);
    }

    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return hoverable(modifier, mutableInteractionSource, z8);
    }
}
