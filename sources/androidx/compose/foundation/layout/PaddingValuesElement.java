package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PaddingValuesElement extends ModifierNodeElement<PaddingValuesModifier> {
    private final Function1 inspectorInfo;
    private final PaddingValues paddingValues;

    public PaddingValuesElement(PaddingValues paddingValues, Function1 inspectorInfo) {
        AbstractC3292y.i(paddingValues, "paddingValues");
        AbstractC3292y.i(inspectorInfo, "inspectorInfo");
        this.paddingValues = paddingValues;
        this.inspectorInfo = inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (obj instanceof PaddingValuesElement) {
            paddingValuesElement = (PaddingValuesElement) obj;
        } else {
            paddingValuesElement = null;
        }
        if (paddingValuesElement == null) {
            return false;
        }
        return AbstractC3292y.d(this.paddingValues, paddingValuesElement.paddingValues);
    }

    public final Function1 getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PaddingValuesModifier create() {
        return new PaddingValuesModifier(this.paddingValues);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PaddingValuesModifier node) {
        AbstractC3292y.i(node, "node");
        node.setPaddingValues(this.paddingValues);
    }
}
