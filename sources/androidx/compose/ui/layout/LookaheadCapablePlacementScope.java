package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LookaheadCapablePlacementScope extends Placeable.PlacementScope {
    private final LookaheadCapablePlaceable within;

    public LookaheadCapablePlacementScope(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.within = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutCoordinates getCoordinates() {
        LayoutCoordinates coordinates;
        if (this.within.isPlacingForAlignment$ui_release()) {
            coordinates = null;
        } else {
            coordinates = this.within.getCoordinates();
        }
        if (coordinates == null) {
            this.within.getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
        }
        return coordinates;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutDirection getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.within.getMeasuredWidth();
    }
}
