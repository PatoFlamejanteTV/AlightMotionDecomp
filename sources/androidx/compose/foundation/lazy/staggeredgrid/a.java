package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Modifier a(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
            }
            return lazyStaggeredGridItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
    }
}
