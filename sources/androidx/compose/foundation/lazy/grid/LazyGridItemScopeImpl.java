package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyGridItemScopeImpl implements LazyGridItemScope {
    public static final LazyGridItemScopeImpl INSTANCE = new LazyGridItemScopeImpl();

    private LazyGridItemScopeImpl() {
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemScope
    @ExperimentalFoundationApi
    public Modifier animateItemPlacement(Modifier modifier, FiniteAnimationSpec<IntOffset> animationSpec) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(animationSpec, "animationSpec");
        return modifier.then(new AnimateItemPlacementElement(animationSpec));
    }
}
