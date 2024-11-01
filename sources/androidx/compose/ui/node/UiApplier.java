package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class UiApplier extends AbstractApplier<LayoutNode> {
    public static final int $stable = 0;

    public UiApplier(LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i8, LayoutNode layoutNode) {
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i8, int i9, int i10) {
        getCurrent().move$ui_release(i8, i9, i10);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    protected void onClear() {
        getRoot().removeAll$ui_release();
    }

    @Override // androidx.compose.runtime.AbstractApplier, androidx.compose.runtime.Applier
    public void onEndChanges() {
        super.onEndChanges();
        Owner owner$ui_release = getRoot().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onEndApplyChanges();
        }
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i8, int i9) {
        getCurrent().removeAt$ui_release(i8, i9);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i8, LayoutNode layoutNode) {
        getCurrent().insertAt$ui_release(i8, layoutNode);
    }
}
