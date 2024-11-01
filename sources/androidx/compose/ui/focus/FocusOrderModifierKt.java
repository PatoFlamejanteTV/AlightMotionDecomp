package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class FocusOrderModifierKt {
    public static final Modifier focusOrder(Modifier modifier, Function1 function1) {
        return FocusPropertiesKt.focusProperties(modifier, new FocusOrderModifierKt$focusOrder$1(new FocusOrderToProperties(function1)));
    }

    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester) {
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester, Function1 function1) {
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new FocusOrderModifierKt$focusOrder$2(new FocusOrderToProperties(function1)));
    }
}
