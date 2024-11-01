package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ModifierLocalConsumerKt {
    @Stable
    @ExperimentalComposeUiApi
    public static final Modifier modifierLocalConsumer(Modifier modifier, Function1 function1) {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ModifierLocalConsumerKt$modifierLocalConsumer$$inlined$debugInspectorInfo$1(function1);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new ModifierLocalConsumerImpl(function1, noInspectorInfo));
    }
}
