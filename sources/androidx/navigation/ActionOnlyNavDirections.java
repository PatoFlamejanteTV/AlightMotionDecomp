package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ActionOnlyNavDirections implements NavDirections {
    private final int actionId;
    private final Bundle arguments = new Bundle();

    public ActionOnlyNavDirections(int i8) {
        this.actionId = i8;
    }

    public static /* synthetic */ ActionOnlyNavDirections copy$default(ActionOnlyNavDirections actionOnlyNavDirections, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = actionOnlyNavDirections.actionId;
        }
        return actionOnlyNavDirections.copy(i8);
    }

    public final int component1() {
        return this.actionId;
    }

    public final ActionOnlyNavDirections copy(int i8) {
        return new ActionOnlyNavDirections(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC3292y.d(ActionOnlyNavDirections.class, obj.getClass()) && getActionId() == ((ActionOnlyNavDirections) obj).getActionId()) {
            return true;
        }
        return false;
    }

    @Override // androidx.navigation.NavDirections
    public int getActionId() {
        return this.actionId;
    }

    @Override // androidx.navigation.NavDirections
    public Bundle getArguments() {
        return this.arguments;
    }

    public int hashCode() {
        return 31 + getActionId();
    }

    public String toString() {
        return "ActionOnlyNavDirections(actionId=" + getActionId() + ')';
    }
}
