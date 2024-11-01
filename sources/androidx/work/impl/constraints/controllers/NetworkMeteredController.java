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
public final class NetworkMeteredController extends ConstraintController<NetworkState> {
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
        String tagWithPrefix = Logger.tagWithPrefix("NetworkMeteredCtrlr");
        AbstractC3292y.h(tagWithPrefix, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        TAG = tagWithPrefix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkMeteredController(ConstraintTracker<NetworkState> tracker) {
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
        if (workSpec.constraints.getRequiredNetworkType() == NetworkType.METERED) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(NetworkState value) {
        AbstractC3292y.i(value, "value");
        if (Build.VERSION.SDK_INT < 26) {
            Logger.get().debug(TAG, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (value.isConnected()) {
                return false;
            }
        } else if (value.isConnected() && value.isMetered()) {
            return false;
        }
        return true;
    }
}
