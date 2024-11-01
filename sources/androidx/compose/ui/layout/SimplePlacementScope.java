package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class SimplePlacementScope extends Placeable.PlacementScope {
    private final LayoutDirection parentLayoutDirection;
    private final int parentWidth;

    public SimplePlacementScope(int i8, LayoutDirection layoutDirection) {
        this.parentWidth = i8;
        this.parentLayoutDirection = layoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.Placeable.PlacementScope
    public int getParentWidth() {
        return this.parentWidth;
    }
}
