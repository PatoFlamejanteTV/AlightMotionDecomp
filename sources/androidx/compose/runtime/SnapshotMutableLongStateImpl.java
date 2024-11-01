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
public class SnapshotMutableLongStateImpl extends StateObjectImpl implements MutableLongState, SnapshotMutableState<Long> {
    public static final int $stable = 0;
    private LongStateStateRecord next;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class LongStateStateRecord extends StateRecord {
        private long value;

        public LongStateStateRecord(long j8) {
            this.value = j8;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.value = ((LongStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new LongStateStateRecord(this.value);
        }

        public final long getValue() {
            return this.value;
        }

        public final void setValue(long j8) {
            this.value = j8;
        }
    }

    public SnapshotMutableLongStateImpl(long j8) {
        this.next = new LongStateStateRecord(j8);
    }

    @Override // androidx.compose.runtime.MutableState
    public Function1 component2() {
        return new SnapshotMutableLongStateImpl$component2$1(this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public long getLongValue() {
        return ((LongStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Long> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState, androidx.compose.runtime.State
    public /* synthetic */ Long getValue() {
        return l.a(this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObjectImpl, androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        AbstractC3292y.g(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        AbstractC3292y.g(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((LongStateStateRecord) stateRecord2).getValue() != ((LongStateStateRecord) stateRecord3).getValue()) {
            return null;
        }
        return stateRecord2;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (LongStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableLongState
    public void setLongValue(long j8) {
        Snapshot current;
        LongStateStateRecord longStateStateRecord = (LongStateStateRecord) SnapshotKt.current(this.next);
        if (longStateStateRecord.getValue() != j8) {
            LongStateStateRecord longStateStateRecord2 = this.next;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((LongStateStateRecord) SnapshotKt.overwritableRecord(longStateStateRecord2, this, current, longStateStateRecord)).setValue(j8);
                I i8 = I.f8786a;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // androidx.compose.runtime.MutableLongState
    public /* synthetic */ void setValue(long j8) {
        l.c(this, j8);
    }

    public String toString() {
        return "MutableLongState(value=" + ((LongStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Long component1() {
        return Long.valueOf(getLongValue());
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState, androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ Object getValue() {
        Object value;
        value = getValue();
        return value;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.MutableState
    public /* bridge */ /* synthetic */ void setValue(Long l8) {
        setValue(l8.longValue());
    }
}
