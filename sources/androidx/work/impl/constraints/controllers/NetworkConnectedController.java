package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NetworkConnectedController extends ConstraintController<NetworkState> {
    private final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkConnectedController(ConstraintTracker<NetworkState> tracker) {
        super(tracker);
        AbstractC3292y.i(tracker, "tracker");
        this.reason = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public int getReason() {
        return this.reason;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        AbstractC3292y.i(workSpec, "workSpec");
        if (workSpec.constraints.getRequiredNetworkType() == NetworkType.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(NetworkState value) {
        AbstractC3292y.i(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!value.isConnected() || !value.isValidated()) {
                return true;
            }
        } else if (!value.isConnected()) {
            return true;
        }
        return false;
    }
}
