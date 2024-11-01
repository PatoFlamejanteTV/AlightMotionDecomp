package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public abstract class ConstraintController<T> {
    private final ConstraintTracker<T> tracker;

    public ConstraintController(ConstraintTracker<T> tracker) {
        AbstractC3292y.i(tracker, "tracker");
        this.tracker = tracker;
    }

    public static /* synthetic */ void getReason$annotations() {
    }

    public abstract int getReason();

    public abstract boolean hasConstraint(WorkSpec workSpec);

    public final boolean isConstrained(WorkSpec workSpec) {
        AbstractC3292y.i(workSpec, "workSpec");
        return hasConstraint(workSpec) && isConstrained((ConstraintController<T>) this.tracker.readSystemState());
    }

    public abstract boolean isConstrained(T t8);

    public final InterfaceC3821f track() {
        return AbstractC3823h.e(new ConstraintController$track$1(this, null));
    }
}
