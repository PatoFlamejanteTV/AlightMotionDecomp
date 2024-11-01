package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class ScrollingLayoutElement extends ModifierNodeElement<ScrollingLayoutNode> {
    private final boolean isReversed;
    private final boolean isVertical;
    private final ScrollState scrollState;

    public ScrollingLayoutElement(ScrollState scrollState, boolean z8, boolean z9) {
        AbstractC3292y.i(scrollState, "scrollState");
        this.scrollState = scrollState;
        this.isReversed = z8;
        this.isVertical = z9;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        if (!AbstractC3292y.d(this.scrollState, scrollingLayoutElement.scrollState) || this.isReversed != scrollingLayoutElement.isReversed || this.isVertical != scrollingLayoutElement.isVertical) {
            return false;
        }
        return true;
    }

    public final ScrollState getScrollState() {
        return this.scrollState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.scrollState.hashCode() * 31) + a.a(this.isReversed)) * 31) + a.a(this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("layoutInScroll");
        inspectorInfo.getProperties().set("state", this.scrollState);
        inspectorInfo.getProperties().set("isReversed", Boolean.valueOf(this.isReversed));
        inspectorInfo.getProperties().set("isVertical", Boolean.valueOf(this.isVertical));
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ScrollingLayoutNode create() {
        return new ScrollingLayoutNode(this.scrollState, this.isReversed, this.isVertical);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ScrollingLayoutNode node) {
        AbstractC3292y.i(node, "node");
        node.setScrollerState(this.scrollState);
        node.setReversed(this.isReversed);
        node.setVertical(this.isVertical);
    }
}
