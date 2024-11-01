package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyItemScopeImpl implements LazyItemScope {
    private MutableIntState maxWidthState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
    private MutableIntState maxHeightState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @ExperimentalFoundationApi
    public Modifier animateItemPlacement(Modifier modifier, FiniteAnimationSpec<IntOffset> animationSpec) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(animationSpec, "animationSpec");
        return modifier.then(new AnimateItemPlacementElement(animationSpec));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public Modifier fillParentMaxHeight(Modifier modifier, float f8) {
        AbstractC3292y.i(modifier, "<this>");
        return modifier.then(new ParentSizeElement(f8, null, this.maxHeightState, "fillParentMaxHeight", 2, null));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public Modifier fillParentMaxSize(Modifier modifier, float f8) {
        AbstractC3292y.i(modifier, "<this>");
        return modifier.then(new ParentSizeElement(f8, this.maxWidthState, this.maxHeightState, "fillParentMaxSize"));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    public Modifier fillParentMaxWidth(Modifier modifier, float f8) {
        AbstractC3292y.i(modifier, "<this>");
        return modifier.then(new ParentSizeElement(f8, this.maxWidthState, null, "fillParentMaxWidth", 4, null));
    }

    public final void setMaxSize(int i8, int i9) {
        this.maxWidthState.setIntValue(i8);
        this.maxHeightState.setIntValue(i9);
    }
}
