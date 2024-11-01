package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class ParentSizeElement extends ModifierNodeElement<ParentSizeNode> {
    private final float fraction;
    private final State<Integer> heightState;
    private final String inspectorName;
    private final State<Integer> widthState;

    public /* synthetic */ ParentSizeElement(float f8, State state, State state2, String str, int i8, AbstractC3284p abstractC3284p) {
        this(f8, (i8 & 2) != 0 ? null : state, (i8 & 4) != 0 ? null : state2, str);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeNode)) {
            return false;
        }
        ParentSizeNode parentSizeNode = (ParentSizeNode) obj;
        if (this.fraction == parentSizeNode.getFraction() && AbstractC3292y.d(this.widthState, parentSizeNode.getWidthState()) && AbstractC3292y.d(this.heightState, parentSizeNode.getHeightState())) {
            return true;
        }
        return false;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    public final String getInspectorName() {
        return this.inspectorName;
    }

    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int i8;
        State<Integer> state = this.widthState;
        int i9 = 0;
        if (state != null) {
            i8 = state.hashCode();
        } else {
            i8 = 0;
        }
        int i10 = i8 * 31;
        State<Integer> state2 = this.heightState;
        if (state2 != null) {
            i9 = state2.hashCode();
        }
        return ((i10 + i9) * 31) + Float.floatToIntBits(this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.setValue(Float.valueOf(this.fraction));
    }

    public ParentSizeElement(float f8, State<Integer> state, State<Integer> state2, String inspectorName) {
        AbstractC3292y.i(inspectorName, "inspectorName");
        this.fraction = f8;
        this.widthState = state;
        this.heightState = state2;
        this.inspectorName = inspectorName;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public ParentSizeNode create() {
        return new ParentSizeNode(this.fraction, this.widthState, this.heightState);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ParentSizeNode node) {
        AbstractC3292y.i(node, "node");
        node.setFraction(this.fraction);
        node.setWidthState(this.widthState);
        node.setHeightState(this.heightState);
    }
}
