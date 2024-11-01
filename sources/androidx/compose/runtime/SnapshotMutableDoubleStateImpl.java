package androidx.compose.runtime;

import Q5.I;
import android.os.Build;
import androidx.compose.runtime.internal.FloatingPointEquality_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public class SnapshotMutableDoubleStateImpl extends StateObjectImpl implements MutableDoubleState, SnapshotMutableState<Double> {
    public static final int $stable = 0;
    private DoubleStateStateRecord next;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class DoubleStateStateRecord extends StateRecord {
        private double value;

        public DoubleStateStateRecord(double d8) {
            this.value = d8;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.value = ((DoubleStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new DoubleStateStateRecord(this.value);
        }

        public final double getValue() {
            return this.value;
        }

        public final void setValue(double d8) {
            this.value = d8;
        }
    }

    public SnapshotMutableDoubleStateImpl(double d8) {
        this.next = new DoubleStateStateRecord(d8);
    }

    @Override // androidx.compose.runtime.MutableState
    public Function1 component2() {
        return new SnapshotMutableDoubleStateImpl$component2$1(this);
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    public double getDoubleValue() {
        return ((DoubleStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Double> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    public /* synthetic */ Double getValue() {
        return i.a(this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        AbstractC3292y.g(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        AbstractC3292y.g(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        double value = ((DoubleStateStateRecord) stateRecord2).getValue();
        double value2 = ((DoubleStateStateRecord) stateRecord3).getValue();
        if (Build.VERSION.SDK_INT >= 23) {
            if (value == value2) {
                return stateRecord2;
            }
        } else if (!FloatingPointEquality_androidKt.isNan(value) && !FloatingPointEquality_androidKt.isNan(value2) && value == value2) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.next = (DoubleStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public void setDoubleValue(double d8) {
        Snapshot current;
        DoubleStateStateRecord doubleStateStateRecord = (DoubleStateStateRecord) SnapshotKt.current(this.next);
        double value = doubleStateStateRecord.getValue();
        if (Build.VERSION.SDK_INT >= 23) {
            if (value == d8) {
                return;
            }
        } else if (!FloatingPointEquality_androidKt.isNan(value) && !FloatingPointEquality_androidKt.isNan(d8) && value == d8) {
            return;
        }
        DoubleStateStateRecord doubleStateStateRecord2 = this.next;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            ((DoubleStateStateRecord) SnapshotKt.overwritableRecord(doubleStateStateRecord2, this, current, doubleStateStateRecord)).setValue(d8);
            I i8 = I.f8786a;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public /* synthetic */ void setValue(double d8) {
        i.c(this, d8);
    }

    public String toString() {
        return "MutableDoubleState(value=" + ((DoubleStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Double component1() {
        return Double.valueOf(getDoubleValue());
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ Object getValue() {
        Object value;
        value = getValue();
        return value;
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.MutableState
    public /* bridge */ /* synthetic */ void setValue(Double d8) {
        setValue(d8.doubleValue());
    }
}
