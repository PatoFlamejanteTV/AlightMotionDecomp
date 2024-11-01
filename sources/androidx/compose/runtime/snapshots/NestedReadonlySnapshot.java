package androidx.compose.runtime.snapshots;

import Q5.C1413h;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NestedReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    private final Snapshot parent;
    private final Function1 readObserver;

    public NestedReadonlySnapshot(int i8, SnapshotIdSet snapshotIdSet, Function1 function1, Snapshot snapshot) {
        super(i8, snapshotIdSet, null);
        this.parent = snapshot;
        snapshot.mo2562nestedActivated$runtime_release(this);
        if (function1 != null) {
            Function1 readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
            if (readObserver$runtime_release != null) {
                function1 = new NestedReadonlySnapshot$readObserver$1$1$1(function1, readObserver$runtime_release);
            }
        } else {
            function1 = snapshot.getReadObserver$runtime_release();
        }
        this.readObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed$runtime_release()) {
            if (getId() != this.parent.getId()) {
                closeAndReleasePinning$runtime_release();
            }
            this.parent.mo2563nestedDeactivated$runtime_release(this);
            super.dispose();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return null;
    }

    public final Snapshot getParent() {
        return this.parent;
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
        return this.parent.getRoot();
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
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2562nestedActivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2563nestedDeactivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2565recordModified$runtime_release(StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public NestedReadonlySnapshot takeNestedSnapshot(Function1 function1) {
        return new NestedReadonlySnapshot(getId(), getInvalid$runtime_release(), function1, this.parent);
    }
}
