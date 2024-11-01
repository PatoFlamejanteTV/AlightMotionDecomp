package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class StateRecord {
    public static final int $stable = 8;
    private StateRecord next;
    private int snapshotId = SnapshotKt.currentSnapshot().getId();

    public abstract void assign(StateRecord stateRecord);

    public abstract StateRecord create();

    public final StateRecord getNext$runtime_release() {
        return this.next;
    }

    public final int getSnapshotId$runtime_release() {
        return this.snapshotId;
    }

    public final void setNext$runtime_release(StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public final void setSnapshotId$runtime_release(int i8) {
        this.snapshotId = i8;
    }
}
