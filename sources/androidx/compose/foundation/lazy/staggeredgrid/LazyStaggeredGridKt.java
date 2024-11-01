package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    public static final void m751LazyStaggeredGridLJWHXA8(LazyStaggeredGridState state, Orientation orientation, InterfaceC2072n slots, Modifier modifier, PaddingValues paddingValues, boolean z8, FlingBehavior flingBehavior, boolean z9, float f8, float f9, Function1 content, Composer composer, int i8, int i9, int i10) {
        Modifier modifier2;
        PaddingValues paddingValues2;
        boolean z10;
        FlingBehavior flingBehavior2;
        int i11;
        boolean z11;
        float f10;
        float f11;
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(slots, "slots");
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1320541636);
        if ((i10 & 8) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i10 & 16) != 0) {
            paddingValues2 = PaddingKt.m570PaddingValues0680j_4(Dp.m5155constructorimpl(0));
        } else {
            paddingValues2 = paddingValues;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        } else {
            z10 = z8;
        }
        if ((i10 & 64) != 0) {
            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
            i11 = i8 & (-3670017);
        } else {
            flingBehavior2 = flingBehavior;
            i11 = i8;
        }
        if ((i10 & 128) != 0) {
            z11 = true;
        } else {
            z11 = z9;
        }
        if ((i10 & 256) != 0) {
            f10 = Dp.m5155constructorimpl(0);
        } else {
            f10 = f8;
        }
        if ((i10 & 512) != 0) {
            f11 = Dp.m5155constructorimpl(0);
        } else {
            f11 = f9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1320541636, i11, i9, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:39)");
        }
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(startRestartGroup, 6);
        Function0 rememberStaggeredGridItemProviderLambda = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(state, content, startRestartGroup, ((i9 << 3) & 112) | 8);
        int i12 = i11 >> 6;
        int i13 = i11 >> 9;
        int i14 = i11;
        boolean z12 = z10;
        Modifier modifier3 = modifier2;
        InterfaceC2072n m760rememberStaggeredGridMeasurePolicynbWgWpA = LazyStaggeredGridMeasurePolicyKt.m760rememberStaggeredGridMeasurePolicynbWgWpA(state, rememberStaggeredGridItemProviderLambda, paddingValues2, z10, orientation, f10, f11, slots, startRestartGroup, (i12 & 7168) | (i12 & 896) | 8 | ((i11 << 9) & 57344) | (i13 & 458752) | (3670016 & i13) | ((i11 << 15) & 29360128));
        LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState = LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(state, z12, startRestartGroup, ((i14 >> 12) & 112) | 8);
        ScrollPositionUpdater(rememberStaggeredGridItemProviderLambda, state, startRestartGroup, 64);
        int i15 = (i14 << 6) & 7168;
        boolean z13 = z11;
        LazyLayoutKt.LazyLayout(rememberStaggeredGridItemProviderLambda, ScrollableKt.scrollable(OverscrollKt.overscroll(LazyStaggeredGridBeyondBoundsModifierKt.lazyStaggeredGridBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier3.then(state.getRemeasurementModifier$foundation_release()).then(state.getAwaitLayoutModifier$foundation_release()), rememberStaggeredGridItemProviderLambda, rememberLazyStaggeredGridSemanticState, orientation, z13, z12, startRestartGroup, (i13 & 57344) | i15 | (i14 & 458752)), orientation), state, z12, orientation, startRestartGroup, (i13 & 896) | 64 | i15), overscrollEffect), state, orientation, overscrollEffect, z13, scrollableDefaults.reverseDirection((LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z12), flingBehavior2, state.getMutableInteractionSource$foundation_release()), state.getPrefetchState$foundation_release(), m760rememberStaggeredGridMeasurePolicynbWgWpA, startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyStaggeredGridKt$LazyStaggeredGrid$1(state, orientation, slots, modifier3, paddingValues2, z12, flingBehavior2, z11, f10, f11, content, i8, i9, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ScrollPositionUpdater(Function0 function0, LazyStaggeredGridState lazyStaggeredGridState, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(661612410);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(661612410, i8, -1, "androidx.compose.foundation.lazy.staggeredgrid.ScrollPositionUpdater (LazyStaggeredGrid.kt:120)");
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) function0.invoke();
        if (lazyLayoutItemProvider.getItemCount() > 0) {
            LazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release$default(lazyStaggeredGridState, lazyLayoutItemProvider, null, 2, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyStaggeredGridKt$ScrollPositionUpdater$1(function0, lazyStaggeredGridState, i8));
        }
    }
}
