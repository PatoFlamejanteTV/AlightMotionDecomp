package androidx.compose.material3;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TouchTargetKt {
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumTouchTargetEnforcement = CompositionLocalKt.staticCompositionLocalOf(TouchTargetKt$LocalMinimumTouchTargetEnforcement$1.INSTANCE);

    @ExperimentalMaterial3Api
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumTouchTargetEnforcement() {
        return LocalMinimumTouchTargetEnforcement;
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getLocalMinimumTouchTargetEnforcement$annotations() {
    }

    public static final Modifier minimumTouchTargetSize(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TouchTargetKt$minimumTouchTargetSize$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, TouchTargetKt$minimumTouchTargetSize$2.INSTANCE);
    }
}
