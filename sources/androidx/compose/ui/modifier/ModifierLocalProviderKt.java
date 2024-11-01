package androidx.compose.ui.modifier;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ModifierLocalProviderKt {
    @ExperimentalComposeUiApi
    public static final <T> Modifier modifierLocalProvider(Modifier modifier, ProvidableModifierLocal<T> providableModifierLocal, Function0 function0) {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1(providableModifierLocal, function0);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ModifierLocalProviderKt$modifierLocalProvider$1(providableModifierLocal, function0, noInspectorInfo));
    }
}
