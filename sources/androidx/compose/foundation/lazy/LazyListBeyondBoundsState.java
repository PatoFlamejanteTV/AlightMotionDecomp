package androidx.compose.foundation.lazy;

import R5.AbstractC1435t;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.ui.layout.Remeasurement;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyListBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    private final int beyondBoundsItemCount;
    private final LazyListState state;

    public LazyListBeyondBoundsState(LazyListState state, int i8) {
        AbstractC3292y.i(state, "state");
        this.state = state;
        this.beyondBoundsItemCount = i8;
    }

    public final int getBeyondBoundsItemCount() {
        return this.beyondBoundsItemCount;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return Math.max(0, this.state.getFirstVisibleItemIndex() - this.beyondBoundsItemCount);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return Math.min(getItemCount() - 1, ((LazyListItemInfo) AbstractC1435t.y0(this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex() + this.beyondBoundsItemCount);
    }

    public final LazyListState getState() {
        return this.state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public void remeasure() {
        Remeasurement remeasurement$foundation_release = this.state.getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }
}
