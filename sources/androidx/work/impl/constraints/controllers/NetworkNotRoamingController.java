package androidx.work.impl.constraints.controllers;

import android.os.Build;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class NetworkNotRoamingController extends ConstraintController<NetworkState> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG;
    private final int reason;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        String tagWithPrefix = Logger.tagWithPrefix("NetworkNotRoamingCtrlr");
        AbstractC3292y.h(tagWithPrefix, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        TAG = tagWithPrefix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkNotRoamingController(ConstraintTracker<NetworkState> tracker) {
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
        if (workSpec.constraints.getRequiredNetworkType() == NetworkType.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(NetworkState value) {
        AbstractC3292y.i(value, "value");
        if (Build.VERSION.SDK_INT < 24) {
            Logger.get().debug(TAG, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (value.isConnected()) {
                return false;
            }
        } else if (value.isConnected() && value.isNotRoaming()) {
            return false;
        }
        return true;
    }
}
