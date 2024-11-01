package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import c6.InterfaceC2073o;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {
    private final InterfaceC2073o measure;

    public LayoutElement(InterfaceC2073o interfaceC2073o) {
        this.measure = interfaceC2073o;
    }

    public static /* synthetic */ LayoutElement copy$default(LayoutElement layoutElement, InterfaceC2073o interfaceC2073o, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC2073o = layoutElement.measure;
        }
        return layoutElement.copy(interfaceC2073o);
    }

    public final InterfaceC2073o component1() {
        return this.measure;
    }

    public final LayoutElement copy(InterfaceC2073o interfaceC2073o) {
        return new LayoutElement(interfaceC2073o);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && AbstractC3292y.d(this.measure, ((LayoutElement) obj).measure);
    }

    public final InterfaceC2073o getMeasure() {
        return this.measure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(TtmlNode.TAG_LAYOUT);
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    public String toString() {
        return "LayoutElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public LayoutModifierImpl create() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(LayoutModifierImpl layoutModifierImpl) {
        layoutModifierImpl.setMeasureBlock(this.measure);
    }
}
