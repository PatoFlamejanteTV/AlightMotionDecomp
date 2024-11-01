package androidx.compose.foundation.lazy.staggeredgrid;

import Q5.I;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridSemanticsKt {
    @Composable
    public static final LazyLayoutSemanticState rememberLazyStaggeredGridSemanticState(final LazyStaggeredGridState state, boolean z8, Composer composer, int i8) {
        AbstractC3292y.i(state, "state");
        composer.startReplaceableGroup(1629354903);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1629354903, i8, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:27)");
        }
        Boolean valueOf = Boolean.valueOf(z8);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(state);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutSemanticState() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public Object animateScrollBy(float f8, d dVar) {
                    Object animateScrollBy$default = ScrollExtensionsKt.animateScrollBy$default(LazyStaggeredGridState.this, f8, null, dVar, 2, null);
                    if (animateScrollBy$default == b.e()) {
                        return animateScrollBy$default;
                    }
                    return I.f8786a;
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public CollectionInfo collectionInfo() {
                    return new CollectionInfo(-1, -1);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public boolean getCanScrollForward() {
                    return LazyStaggeredGridState.this.getCanScrollForward();
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getCurrentPosition() {
                    return LazyStaggeredGridState.this.getFirstVisibleItemIndex() + (LazyStaggeredGridState.this.getFirstVisibleItemScrollOffset() / 100000.0f);
                }

                @Override // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public Object scrollToItem(int i9, d dVar) {
                    Object scrollToItem$default = LazyStaggeredGridState.scrollToItem$default(LazyStaggeredGridState.this, i9, 0, dVar, 2, null);
                    if (scrollToItem$default == b.e()) {
                        return scrollToItem$default;
                    }
                    return I.f8786a;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1 = (LazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$1;
    }
}
