package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class VectorApplier extends AbstractApplier<VNode> {
    public static final int $stable = 0;

    public VectorApplier(VNode vNode) {
        super(vNode);
    }

    private final GroupComponent asGroup(VNode vNode) {
        if (vNode instanceof GroupComponent) {
            return (GroupComponent) vNode;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i8, VNode vNode) {
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i8, int i9, int i10) {
        asGroup(getCurrent()).move(i8, i9, i10);
    }

    @Override // androidx.compose.runtime.AbstractApplier
    protected void onClear() {
        GroupComponent asGroup = asGroup(getRoot());
        asGroup.remove(0, asGroup.getNumChildren());
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i8, int i9) {
        asGroup(getCurrent()).remove(i8, i9);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i8, VNode vNode) {
        asGroup(getCurrent()).insertAt(i8, vNode);
    }
}
