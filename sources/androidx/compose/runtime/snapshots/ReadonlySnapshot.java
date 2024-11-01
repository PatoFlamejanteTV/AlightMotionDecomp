package androidx.compose.runtime.snapshots;

import Q5.C1413h;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    private final Function1 readObserver;
    private int snapshots;

    public ReadonlySnapshot(int i8, SnapshotIdSet snapshotIdSet, Function1 function1) {
        super(i8, snapshotIdSet, null);
        this.readObserver = function1;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed$runtime_release()) {
            mo2563nestedDeactivated$runtime_release(this);
            super.dispose();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo2562nestedActivated$runtime_release(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo2563nestedDeactivated$runtime_release(Snapshot snapshot) {
        int i8 = this.snapshots - 1;
        this.snapshots = i8;
        if (i8 == 0) {
            closeAndReleasePinning$runtime_release();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo2565recordModified$runtime_release(StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new C1413h();
    }

    public void setModified(IdentityArraySet<StateObject> identityArraySet) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 function1) {
        SnapshotKt.validateOpen(this);
        return new NestedReadonlySnapshot(getId(), getInvalid$runtime_release(), function1, this);
    }
}
