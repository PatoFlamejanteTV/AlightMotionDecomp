package androidx.compose.foundation.pager;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import c6.InterfaceC2074p;
import j6.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.I;

/* loaded from: classes.dex */
public final class LazyLayoutPagerKt {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a3, code lost:            if (r8 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L20;     */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Pager-fs30GE4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m780Pagerfs30GE4(androidx.compose.ui.Modifier r34, androidx.compose.foundation.pager.PagerState r35, androidx.compose.foundation.layout.PaddingValues r36, boolean r37, androidx.compose.foundation.gestures.Orientation r38, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r39, boolean r40, int r41, float r42, androidx.compose.foundation.pager.PageSize r43, androidx.compose.ui.input.nestedscroll.NestedScrollConnection r44, kotlin.jvm.functions.Function1 r45, androidx.compose.ui.Alignment.Horizontal r46, androidx.compose.ui.Alignment.Vertical r47, c6.InterfaceC2074p r48, androidx.compose.runtime.Composer r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt.m780Pagerfs30GE4(androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior, boolean, int, float, androidx.compose.foundation.pager.PageSize, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, c6.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final Modifier dragDirectionDetector(Modifier modifier, PagerState pagerState) {
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, pagerState, new LazyLayoutPagerKt$dragDirectionDetector$1(pagerState, null)));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final Function0 rememberPagerItemProviderLambda(PagerState pagerState, InterfaceC2074p interfaceC2074p, Function1 function1, Function0 function0, Composer composer, int i8) {
        composer.startReplaceableGroup(-1372505274);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372505274, i8, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:234)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(interfaceC2074p, composer, (i8 >> 3) & 14);
        Object[] objArr = {pagerState, rememberUpdatedState, function1, function0};
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (int i9 = 0; i9 < 4; i9++) {
            z8 |= composer.changed(objArr[i9]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1(rememberUpdatedState, function1, function0)), pagerState));
            rememberedValue = new I(derivedStateOf) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // j6.j
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        j jVar = (j) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jVar;
    }
}
