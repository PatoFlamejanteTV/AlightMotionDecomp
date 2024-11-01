package androidx.compose.material.pullrefresh;

import U5.d;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class PullRefreshKt {
    @ExperimentalMaterialApi
    public static final Modifier pullRefresh(Modifier modifier, PullRefreshState state, boolean z8) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$1(state, z8) : InspectableValueKt.getNoInspectorInfo(), pullRefresh(Modifier.Companion, new PullRefreshKt$pullRefresh$2$1(state), new PullRefreshKt$pullRefresh$2$2(state), z8));
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, PullRefreshState pullRefreshState, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return pullRefresh(modifier, pullRefreshState, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object pullRefresh$lambda$1$onRelease(PullRefreshState pullRefreshState, float f8, d dVar) {
        return b.b(pullRefreshState.onRelease$material_release(f8));
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier modifier, Function1 function1, InterfaceC2072n interfaceC2072n, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        return pullRefresh(modifier, function1, interfaceC2072n, z8);
    }

    @ExperimentalMaterialApi
    public static final Modifier pullRefresh(Modifier modifier, Function1 onPull, InterfaceC2072n onRelease, boolean z8) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(onPull, "onPull");
        AbstractC3292y.i(onRelease, "onRelease");
        return InspectableValueKt.inspectableWrapper(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2(onPull, onRelease, z8) : InspectableValueKt.getNoInspectorInfo(), NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, new PullRefreshNestedScrollConnection(onPull, onRelease, z8), null, 2, null));
    }
}
