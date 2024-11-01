package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Modifier a(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5270boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
            }
            return lazyItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
    }

    public static /* synthetic */ Modifier b(LazyItemScope lazyItemScope, Modifier modifier, float f8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                f8 = 1.0f;
            }
            return lazyItemScope.fillParentMaxHeight(modifier, f8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
    }

    public static /* synthetic */ Modifier c(LazyItemScope lazyItemScope, Modifier modifier, float f8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                f8 = 1.0f;
            }
            return lazyItemScope.fillParentMaxSize(modifier, f8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
    }

    public static /* synthetic */ Modifier d(LazyItemScope lazyItemScope, Modifier modifier, float f8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                f8 = 1.0f;
            }
            return lazyItemScope.fillParentMaxWidth(modifier, f8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
    }
}
