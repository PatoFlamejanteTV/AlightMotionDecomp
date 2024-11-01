package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class PullRefreshIndicatorTransformKt {
    @ExperimentalMaterialApi
    public static final Modifier pullRefreshIndicatorTransform(Modifier modifier, PullRefreshState state, boolean z8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$$inlined$debugInspectorInfo$1(state, z8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(Modifier.Companion, PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$1.INSTANCE), new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2(state, z8)));
    }

    public static /* synthetic */ Modifier pullRefreshIndicatorTransform$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return pullRefreshIndicatorTransform(modifier, pullRefreshState, z8);
    }
}
