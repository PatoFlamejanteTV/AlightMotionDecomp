package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SizeElement extends ModifierNodeElement<SizeNode> {
    private final boolean enforceIncoming;
    private final Function1 inspectorInfo;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeElement(float f8, float f9, float f10, float f11, boolean z8, Function1 function1, AbstractC3284p abstractC3284p) {
        this(f8, f9, f10, f11, z8, function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        if (Dp.m5160equalsimpl0(this.minWidth, sizeElement.minWidth) && Dp.m5160equalsimpl0(this.minHeight, sizeElement.minHeight) && Dp.m5160equalsimpl0(this.maxWidth, sizeElement.maxWidth) && Dp.m5160equalsimpl0(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m5161hashCodeimpl(this.minWidth) * 31) + Dp.m5161hashCodeimpl(this.minHeight)) * 31) + Dp.m5161hashCodeimpl(this.maxWidth)) * 31) + Dp.m5161hashCodeimpl(this.maxHeight)) * 31) + androidx.compose.foundation.a.a(this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public /* synthetic */ SizeElement(float f8, float f9, float f10, float f11, boolean z8, Function1 function1, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Dp.Companion.m5175getUnspecifiedD9Ej5fM() : f8, (i8 & 2) != 0 ? Dp.Companion.m5175getUnspecifiedD9Ej5fM() : f9, (i8 & 4) != 0 ? Dp.Companion.m5175getUnspecifiedD9Ej5fM() : f10, (i8 & 8) != 0 ? Dp.Companion.m5175getUnspecifiedD9Ej5fM() : f11, z8, function1, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SizeNode create() {
        return new SizeNode(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SizeNode node) {
        AbstractC3292y.i(node, "node");
        node.m640setMinWidth0680j_4(this.minWidth);
        node.m639setMinHeight0680j_4(this.minHeight);
        node.m638setMaxWidth0680j_4(this.maxWidth);
        node.m637setMaxHeight0680j_4(this.maxHeight);
        node.setEnforceIncoming(this.enforceIncoming);
    }

    private SizeElement(float f8, float f9, float f10, float f11, boolean z8, Function1 inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "inspectorInfo");
        this.minWidth = f8;
        this.minHeight = f9;
        this.maxWidth = f10;
        this.maxHeight = f11;
        this.enforceIncoming = z8;
        this.inspectorInfo = inspectorInfo;
    }
}
