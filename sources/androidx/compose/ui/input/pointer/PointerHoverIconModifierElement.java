package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends ModifierNodeElement<PointerHoverIconModifierNode> {
    public static final int $stable = 0;
    private final PointerIcon icon;
    private final boolean overrideDescendants;

    public /* synthetic */ PointerHoverIconModifierElement(PointerIcon pointerIcon, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(pointerIcon, (i8 & 2) != 0 ? false : z8);
    }

    public static /* synthetic */ PointerHoverIconModifierElement copy$default(PointerHoverIconModifierElement pointerHoverIconModifierElement, PointerIcon pointerIcon, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            pointerIcon = pointerHoverIconModifierElement.icon;
        }
        if ((i8 & 2) != 0) {
            z8 = pointerHoverIconModifierElement.overrideDescendants;
        }
        return pointerHoverIconModifierElement.copy(pointerIcon, z8);
    }

    public final PointerIcon component1() {
        return this.icon;
    }

    public final boolean component2() {
        return this.overrideDescendants;
    }

    public final PointerHoverIconModifierElement copy(PointerIcon pointerIcon, boolean z8) {
        return new PointerHoverIconModifierElement(pointerIcon, z8);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return AbstractC3292y.d(this.icon, pointerHoverIconModifierElement.icon) && this.overrideDescendants == pointerHoverIconModifierElement.overrideDescendants;
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.icon.hashCode() * 31) + androidx.compose.foundation.a.a(this.overrideDescendants);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerHoverIcon");
        inspectorInfo.getProperties().set(RewardPlus.ICON, this.icon);
        inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(this.overrideDescendants));
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ')';
    }

    public PointerHoverIconModifierElement(PointerIcon pointerIcon, boolean z8) {
        this.icon = pointerIcon;
        this.overrideDescendants = z8;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PointerHoverIconModifierNode create() {
        return new PointerHoverIconModifierNode(this.icon, this.overrideDescendants);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        pointerHoverIconModifierNode.setIcon(this.icon);
        pointerHoverIconModifierNode.setOverrideDescendants(this.overrideDescendants);
    }
}
