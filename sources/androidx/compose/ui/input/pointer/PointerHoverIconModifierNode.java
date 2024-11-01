package androidx.compose.ui.input.pointer;

import Q5.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.T;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean cursorInBoundsOfNode;
    private PointerIcon icon;
    private boolean overrideDescendants;
    private final String traverseKey;

    public /* synthetic */ PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(pointerIcon, (i8 & 2) != 0 ? false : z8);
    }

    private final void displayDefaultIcon() {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(null);
        }
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        PointerHoverIconModifierNode findOverridingAncestorNode = findOverridingAncestorNode();
        if (findOverridingAncestorNode == null || (pointerIcon = findOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(pointerIcon);
        }
    }

    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        I i8;
        T t8 = new T();
        TraversableNodeKt.traverseAncestors(this, new PointerHoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1(t8));
        PointerHoverIconModifierNode pointerHoverIconModifierNode = (PointerHoverIconModifierNode) t8.f34573a;
        if (pointerHoverIconModifierNode != null) {
            pointerHoverIconModifierNode.displayIcon();
            i8 = I.f8786a;
        } else {
            i8 = null;
        }
        if (i8 == null) {
            displayDefaultIcon();
        }
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        PointerHoverIconModifierNode pointerHoverIconModifierNode;
        if (!this.cursorInBoundsOfNode) {
            return;
        }
        if (this.overrideDescendants || (pointerHoverIconModifierNode = findDescendantNodeWithCursorInBounds()) == null) {
            pointerHoverIconModifierNode = this;
        }
        pointerHoverIconModifierNode.displayIcon();
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        O o8 = new O();
        o8.f34569a = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new PointerHoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1(o8));
        }
        if (o8.f34569a) {
            displayIcon();
        }
    }

    private final PointerHoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        T t8 = new T();
        TraversableNodeKt.traverseDescendants(this, new PointerHoverIconModifierNode$findDescendantNodeWithCursorInBounds$1(t8));
        return (PointerHoverIconModifierNode) t8.f34573a;
    }

    private final PointerHoverIconModifierNode findOverridingAncestorNode() {
        T t8 = new T();
        TraversableNodeKt.traverseAncestors(this, new PointerHoverIconModifierNode$findOverridingAncestorNode$1(t8));
        return (PointerHoverIconModifierNode) t8.f34573a;
    }

    private final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return androidx.compose.ui.node.f.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        androidx.compose.ui.node.f.b(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.cursorInBoundsOfNode = false;
        displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo242onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j8) {
        if (pointerEventPass == PointerEventPass.Main) {
            int m3935getType7fucELk = pointerEvent.m3935getType7fucELk();
            PointerEventType.Companion companion = PointerEventType.Companion;
            if (PointerEventType.m3942equalsimpl0(m3935getType7fucELk, companion.m3946getEnter7fucELk())) {
                this.cursorInBoundsOfNode = true;
                displayIconIfDescendantsDoNotHavePriority();
            } else if (PointerEventType.m3942equalsimpl0(pointerEvent.m3935getType7fucELk(), companion.m3947getExit7fucELk())) {
                this.cursorInBoundsOfNode = false;
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        androidx.compose.ui.node.f.c(this);
    }

    public final void setIcon(PointerIcon pointerIcon) {
        if (!AbstractC3292y.d(this.icon, pointerIcon)) {
            this.icon = pointerIcon;
            if (this.cursorInBoundsOfNode) {
                displayIconIfDescendantsDoNotHavePriority();
            }
        }
    }

    public final void setOverrideDescendants(boolean z8) {
        if (this.overrideDescendants != z8) {
            this.overrideDescendants = z8;
            if (z8) {
                if (this.cursorInBoundsOfNode) {
                    displayIcon();
                }
            } else if (this.cursorInBoundsOfNode) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return androidx.compose.ui.node.f.d(this);
    }

    public PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z8) {
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
        this.icon = pointerIcon;
        this.overrideDescendants = z8;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }
}
