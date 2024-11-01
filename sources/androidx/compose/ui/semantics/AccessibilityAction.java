package androidx.compose.ui.semantics;

import Q5.InterfaceC1412g;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AccessibilityAction<T extends InterfaceC1412g> {
    public static final int $stable = 0;
    private final T action;
    private final String label;

    public AccessibilityAction(String str, T t8) {
        this.label = str;
        this.action = t8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        if (AbstractC3292y.d(this.label, accessibilityAction.label) && AbstractC3292y.d(this.action, accessibilityAction.action)) {
            return true;
        }
        return false;
    }

    public final T getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int i8;
        String str = this.label;
        int i9 = 0;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i10 = i8 * 31;
        T t8 = this.action;
        if (t8 != null) {
            i9 = t8.hashCode();
        }
        return i10 + i9;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
