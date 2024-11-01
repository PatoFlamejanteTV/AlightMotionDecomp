package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class OnRemeasuredModifierKt {
    @Stable
    public static final Modifier onSizeChanged(Modifier modifier, Function1 function1) {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new OnRemeasuredModifierKt$onSizeChanged$$inlined$debugInspectorInfo$1(function1);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new OnSizeChangedModifier(function1, noInspectorInfo));
    }
}
