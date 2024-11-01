package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;
    private final DepthSortedSet lookaheadSet;
    private final DepthSortedSet set;

    public DepthSortedSetsForDifferentPasses(boolean z8) {
        this.lookaheadSet = new DepthSortedSet(z8);
        this.set = new DepthSortedSet(z8);
    }

    public final void add(LayoutNode layoutNode, boolean z8) {
        if (z8) {
            this.lookaheadSet.add(layoutNode);
        } else if (!this.lookaheadSet.contains(layoutNode)) {
            this.set.add(layoutNode);
        }
    }

    public final boolean contains(LayoutNode layoutNode, boolean z8) {
        boolean contains = this.lookaheadSet.contains(layoutNode);
        return z8 ? contains : contains || this.set.contains(layoutNode);
    }

    public final boolean isEmpty() {
        return this.set.isEmpty() && this.lookaheadSet.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final LayoutNode pop() {
        if (!this.lookaheadSet.isEmpty()) {
            return this.lookaheadSet.pop();
        }
        return this.set.pop();
    }

    public final void popEach(InterfaceC2072n interfaceC2072n) {
        while (isNotEmpty()) {
            boolean z8 = !this.lookaheadSet.isEmpty();
            interfaceC2072n.invoke((z8 ? this.lookaheadSet : this.set).pop(), Boolean.valueOf(z8));
        }
    }

    public final boolean remove(LayoutNode layoutNode, boolean z8) {
        if (z8) {
            return this.lookaheadSet.remove(layoutNode);
        }
        return this.set.remove(layoutNode);
    }

    public final boolean isEmpty(boolean z8) {
        return (z8 ? this.lookaheadSet : this.set).isEmpty();
    }

    public final boolean contains(LayoutNode layoutNode) {
        return this.lookaheadSet.contains(layoutNode) || this.set.contains(layoutNode);
    }

    public final boolean remove(LayoutNode layoutNode) {
        return this.set.remove(layoutNode) || this.lookaheadSet.remove(layoutNode);
    }
}
