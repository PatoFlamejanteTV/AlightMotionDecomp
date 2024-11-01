package androidx.compose.foundation;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(29)
/* loaded from: classes.dex */
final class ExcludeFromSystemGestureElement extends ModifierNodeElement<ExcludeFromSystemGestureNode> {
    private final Function1 exclusion;

    public ExcludeFromSystemGestureElement(Function1 function1) {
        this.exclusion = function1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof ExcludeFromSystemGestureElement)) {
            return false;
        }
        return AbstractC3292y.d(this.exclusion, ((ExcludeFromSystemGestureElement) obj).exclusion);
    }

    public final Function1 getExclusion() {
        return this.exclusion;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        Function1 function1 = this.exclusion;
        if (function1 != null) {
            return function1.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        AbstractC3292y.i(inspectorInfo, "<this>");
        inspectorInfo.setName("systemGestureExclusion");
        if (this.exclusion != null) {
            inspectorInfo.getProperties().set("exclusion", this.exclusion);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @SuppressLint({"NewApi"})
    public ExcludeFromSystemGestureNode create() {
        return new ExcludeFromSystemGestureNode(this.exclusion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(ExcludeFromSystemGestureNode node) {
        AbstractC3292y.i(node, "node");
        node.setExclusion(this.exclusion);
    }
}
