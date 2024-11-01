package androidx.compose.runtime;

import Q5.I;
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
public class SnapshotMutableIntStateImpl extends StateObjectImpl implements MutableIntState, SnapshotMutableState<Integer> {
    public static final int $stable = 0;
    private IntStateStateRecord next;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class IntStateStateRecord extends StateRecord {
        private int value;

        public IntStateStateRecord(int i8) {
            this.value = i8;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.value = ((IntStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new IntStateStateRecord(this.value);
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i8) {
            this.value = i8;
        }
    }

    public SnapshotMutableIntStateImpl(int i8) {
        this.next = new IntStateStateRecord(i8);
    }

    @InternalComposeApi
    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // androidx.compose.runtime.MutableState
    public Function1 component2() {
        return new SnapshotMutableIntStateImpl$component2$1(this);
    }

    public final int getDebuggerDisplayValue() {
        return ((IntStateStateRecord) SnapshotKt.current(this.next)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.IntState
    public int getIntValue() {
        return ((IntStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Integer> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.IntState, androidx.compose.runtime.State
    public /* synthetic */ Integer getValue() {
        return k.a(this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        AbstractC3292y.g(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        AbstractC3292y.g(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((IntStateStateRecord) stateRecord2).getValue() != ((IntStateStateRecord) stateRecord3).getValue()) {
            return null;
        }
        return stateRecord2;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.next = (IntStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableIntState
    public void setIntValue(int i8) {
        Snapshot current;
        IntStateStateRecord intStateStateRecord = (IntStateStateRecord) SnapshotKt.current(this.next);
        if (intStateStateRecord.getValue() != i8) {
            IntStateStateRecord intStateStateRecord2 = this.next;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((IntStateStateRecord) SnapshotKt.overwritableRecord(intStateStateRecord2, this, current, intStateStateRecord)).setValue(i8);
                I i9 = I.f8786a;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // androidx.compose.runtime.MutableIntState
    public /* synthetic */ void setValue(int i8) {
        k.c(this, i8);
    }

    public String toString() {
        return "MutableIntState(value=" + ((IntStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Integer component1() {
        return Integer.valueOf(getIntValue());
    }

    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.IntState, androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ Object getValue() {
        Object value;
        value = getValue();
        return value;
    }

    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState
    public /* bridge */ /* synthetic */ void setValue(Integer num) {
        setValue(num.intValue());
    }
}
