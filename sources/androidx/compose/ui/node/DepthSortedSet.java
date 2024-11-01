package androidx.compose.ui.node;

import Q5.InterfaceC1416k;
import Q5.l;
import Q5.o;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DepthSortedSet {
    public static final int $stable = 8;
    private final Comparator<LayoutNode> DepthComparator;
    private final boolean extraAssertions;
    private final InterfaceC1416k mapOfOriginalDepth$delegate = l.a(o.f8805c, DepthSortedSet$mapOfOriginalDepth$2.INSTANCE);
    private final TreeSet<LayoutNode> set;

    public DepthSortedSet(boolean z8) {
        this.extraAssertions = z8;
        Comparator<LayoutNode> comparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1
            @Override // java.util.Comparator
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                int k8 = AbstractC3292y.k(layoutNode.getDepth$ui_release(), layoutNode2.getDepth$ui_release());
                return k8 != 0 ? k8 : AbstractC3292y.k(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        };
        this.DepthComparator = comparator;
        this.set = new TreeSet<>(comparator);
    }

    private final Map<LayoutNode, Integer> getMapOfOriginalDepth() {
        return (Map) this.mapOfOriginalDepth$delegate.getValue();
    }

    public final void add(LayoutNode layoutNode) {
        if (layoutNode.isAttached()) {
            if (this.extraAssertions) {
                Integer num = getMapOfOriginalDepth().get(layoutNode);
                if (num == null) {
                    getMapOfOriginalDepth().put(layoutNode, Integer.valueOf(layoutNode.getDepth$ui_release()));
                } else {
                    if (num.intValue() != layoutNode.getDepth$ui_release()) {
                        throw new IllegalStateException("invalid node depth".toString());
                    }
                }
            }
            this.set.add(layoutNode);
            return;
        }
        throw new IllegalStateException("DepthSortedSet.add called on an unattached node".toString());
    }

    public final boolean contains(LayoutNode layoutNode) {
        boolean contains = this.set.contains(layoutNode);
        if (this.extraAssertions && contains != getMapOfOriginalDepth().containsKey(layoutNode)) {
            throw new IllegalStateException("inconsistency in TreeSet".toString());
        }
        return contains;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final LayoutNode pop() {
        LayoutNode first = this.set.first();
        remove(first);
        return first;
    }

    public final void popEach(Function1 function1) {
        while (!isEmpty()) {
            function1.invoke(pop());
        }
    }

    public final boolean remove(LayoutNode layoutNode) {
        Integer num;
        if (layoutNode.isAttached()) {
            boolean remove = this.set.remove(layoutNode);
            if (this.extraAssertions) {
                Integer remove2 = getMapOfOriginalDepth().remove(layoutNode);
                if (remove) {
                    num = Integer.valueOf(layoutNode.getDepth$ui_release());
                } else {
                    num = null;
                }
                if (!AbstractC3292y.d(remove2, num)) {
                    throw new IllegalStateException("invalid node depth".toString());
                }
            }
            return remove;
        }
        throw new IllegalStateException("DepthSortedSet.remove called on an unattached node".toString());
    }

    public String toString() {
        return this.set.toString();
    }
}
