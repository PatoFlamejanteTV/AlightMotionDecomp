package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {
    public static final int $stable = 0;
    private final Function1 properties;

    public ClearAndSetSemanticsElement(Function1 function1) {
        this.properties = function1;
    }

    public static /* synthetic */ ClearAndSetSemanticsElement copy$default(ClearAndSetSemanticsElement clearAndSetSemanticsElement, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = clearAndSetSemanticsElement.properties;
        }
        return clearAndSetSemanticsElement.copy(function1);
    }

    public final Function1 component1() {
        return this.properties;
    }

    public final ClearAndSetSemanticsElement copy(Function1 function1) {
        return new ClearAndSetSemanticsElement(function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && AbstractC3292y.d(this.properties, ((ClearAndSetSemanticsElement) obj).properties);
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public /* synthetic */ int getId() {
        return a.a(this);
    }

    public final Function1 getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(true);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clearAndSetSemantics");
        SemanticsModifierKt.addSemanticsPropertiesFrom(inspectorInfo, getSemanticsConfiguration());
    }

    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.properties + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(false, true, this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(CoreSemanticsModifierNode coreSemanticsModifierNode) {
        coreSemanticsModifierNode.setProperties(this.properties);
    }
}
