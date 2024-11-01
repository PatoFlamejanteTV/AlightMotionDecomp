package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class AspectRatioElement extends ModifierNodeElement<AspectRatioNode> {
    private final float aspectRatio;
    private final Function1 inspectorInfo;
    private final boolean matchHeightConstraintsFirst;

    public AspectRatioElement(float f8, boolean z8, Function1 inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "inspectorInfo");
        this.aspectRatio = f8;
        this.matchHeightConstraintsFirst = z8;
        this.inspectorInfo = inspectorInfo;
        if (f8 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f8 + " must be > 0").toString());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        AspectRatioElement aspectRatioElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioElement) {
            aspectRatioElement = (AspectRatioElement) obj;
        } else {
            aspectRatioElement = null;
        }
        if (aspectRatioElement != null && this.aspectRatio == aspectRatioElement.aspectRatio && this.matchHeightConstraintsFirst == ((AspectRatioElement) obj).matchHeightConstraintsFirst) {
            return true;
        }
        return false;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final Function1 getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Float.floatToIntBits(this.aspectRatio) * 31) + androidx.compose.foundation.a.a(this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public AspectRatioNode create() {
        return new AspectRatioNode(this.aspectRatio, this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(AspectRatioNode node) {
        AbstractC3292y.i(node, "node");
        node.setAspectRatio(this.aspectRatio);
        node.setMatchHeightConstraintsFirst(this.matchHeightConstraintsFirst);
    }
}
