package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OffsetPxElement extends ModifierNodeElement<OffsetPxNode> {
    private final Function1 inspectorInfo;
    private final Function1 offset;
    private final boolean rtlAware;

    public OffsetPxElement(Function1 offset, boolean z8, Function1 inspectorInfo) {
        AbstractC3292y.i(offset, "offset");
        AbstractC3292y.i(inspectorInfo, "inspectorInfo");
        this.offset = offset;
        this.rtlAware = z8;
        this.inspectorInfo = inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        if (offsetPxElement != null && AbstractC3292y.d(this.offset, offsetPxElement.offset) && this.rtlAware == offsetPxElement.rtlAware) {
            return true;
        }
        return false;
    }

    public final Function1 getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final Function1 getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.offset.hashCode() * 31) + androidx.compose.foundation.a.a(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.offset + ", rtlAware=" + this.rtlAware + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OffsetPxNode create() {
        return new OffsetPxNode(this.offset, this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OffsetPxNode node) {
        AbstractC3292y.i(node, "node");
        node.setOffset(this.offset);
        node.setRtlAware(this.rtlAware);
    }
}
