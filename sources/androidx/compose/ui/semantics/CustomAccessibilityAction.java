package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;
    private final Function0 action;
    private final String label;

    public CustomAccessibilityAction(String str, Function0 function0) {
        this.label = str;
        this.action = function0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        if (AbstractC3292y.d(this.label, customAccessibilityAction.label) && AbstractC3292y.d(this.action, customAccessibilityAction.action)) {
            return true;
        }
        return false;
    }

    public final Function0 getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
