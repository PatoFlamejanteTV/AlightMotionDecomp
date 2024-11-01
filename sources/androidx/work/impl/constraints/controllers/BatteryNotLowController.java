package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.BatteryNotLowTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class BatteryNotLowController extends ConstraintController<Boolean> {
    private final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryNotLowController(BatteryNotLowTracker tracker) {
        super(tracker);
        AbstractC3292y.i(tracker, "tracker");
        this.reason = 5;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public int getReason() {
        return this.reason;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        AbstractC3292y.i(workSpec, "workSpec");
        return workSpec.constraints.requiresBatteryNotLow();
    }

    public boolean isConstrained(boolean z8) {
        return !z8;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public /* bridge */ /* synthetic */ boolean isConstrained(Boolean bool) {
        return isConstrained(bool.booleanValue());
    }
}
