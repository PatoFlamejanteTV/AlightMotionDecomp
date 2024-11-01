package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {
    public static final int $stable = 0;
    private final boolean mergeDescendants;
    private final Function1 properties;

    public AppendedSemanticsElement(boolean z8, Function1 function1) {
        this.mergeDescendants = z8;
        this.properties = function1;
    }

    public static /* synthetic */ AppendedSemanticsElement copy$default(AppendedSemanticsElement appendedSemanticsElement, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = appendedSemanticsElement.mergeDescendants;
        }
        if ((i8 & 2) != 0) {
            function1 = appendedSemanticsElement.properties;
        }
        return appendedSemanticsElement.copy(z8, function1);
    }

    public final boolean component1() {
        return this.mergeDescendants;
    }

    public final Function1 component2() {
        return this.properties;
    }

    public final AppendedSemanticsElement copy(boolean z8, Function1 function1) {
        return new AppendedSemanticsElement(z8, function1);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.mergeDescendants == appendedSemanticsElement.mergeDescendants && AbstractC3292y.d(this.properties, appendedSemanticsElement.properties);
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public /* synthetic */ int getId() {
        return a.a(this);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final Function1 getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(this.mergeDescendants);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (androidx.compose.foundation.a.a(this.mergeDescendants) * 31) + this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("semantics");
        inspectorInfo.getProperties().set("mergeDescendants", Boolean.valueOf(this.mergeDescendants));
        SemanticsModifierKt.addSemanticsPropertiesFrom(inspectorInfo, getSemanticsConfiguration());
    }

    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.mergeDescendants + ", properties=" + this.properties + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(this.mergeDescendants, false, this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(CoreSemanticsModifierNode coreSemanticsModifierNode) {
        coreSemanticsModifierNode.setMergeDescendants(this.mergeDescendants);
        coreSemanticsModifierNode.setProperties(this.properties);
    }
}
