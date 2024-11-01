package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class InteractiveComponentSizeKt {
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumInteractiveComponentEnforcement;
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumTouchTargetEnforcement;
    private static final long minimumInteractiveComponentSize;

    static {
        ProvidableCompositionLocal<Boolean> staticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(InteractiveComponentSizeKt$LocalMinimumInteractiveComponentEnforcement$1.INSTANCE);
        LocalMinimumInteractiveComponentEnforcement = staticCompositionLocalOf;
        LocalMinimumTouchTargetEnforcement = staticCompositionLocalOf;
        float f8 = 48;
        minimumInteractiveComponentSize = DpKt.m5177DpSizeYgX7TsA(Dp.m5155constructorimpl(f8), Dp.m5155constructorimpl(f8));
    }

    @ExperimentalMaterialApi
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumInteractiveComponentEnforcement() {
        return LocalMinimumInteractiveComponentEnforcement;
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }

    @ExperimentalMaterialApi
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumTouchTargetEnforcement() {
        return LocalMinimumTouchTargetEnforcement;
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getLocalMinimumTouchTargetEnforcement$annotations() {
    }

    public static final Modifier minimumInteractiveComponentSize(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new InteractiveComponentSizeKt$minimumInteractiveComponentSize$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, InteractiveComponentSizeKt$minimumInteractiveComponentSize$2.INSTANCE);
    }
}
