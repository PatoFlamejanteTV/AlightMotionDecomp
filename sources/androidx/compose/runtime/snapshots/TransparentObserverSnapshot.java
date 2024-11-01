package androidx.compose.runtime.snapshots;

import Q5.C1413h;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TransparentObserverSnapshot extends Snapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsPreviousSnapshot;
    private final Snapshot previousSnapshot;
    private final Function1 readObserver;
    private final Snapshot root;
    private final Function1 writeObserver;

    public TransparentObserverSnapshot(Snapshot snapshot, Function1 function1, boolean z8, boolean z9) {
        super(0, SnapshotIdSet.Companion.getEMPTY(), null);
        AtomicReference atomicReference;
        Function1 readObserver$runtime_release;
        Function1 mergedReadObserver;
        this.previousSnapshot = snapshot;
        this.mergeParentObservers = z8;
        this.ownsPreviousSnapshot = z9;
        if (snapshot == null || (readObserver$runtime_release = snapshot.getReadObserver$runtime_release()) == null) {
            atomicReference = SnapshotKt.currentGlobalSnapshot;
            readObserver$runtime_release = ((GlobalSnapshot) atomicReference.get()).getReadObserver$runtime_release();
        }
        mergedReadObserver = SnapshotKt.mergedReadObserver(function1, readObserver$runtime_release, z8);
        this.readObserver = mergedReadObserver;
        this.root = this;
    }

    private final Snapshot getCurrentSnapshot() {
        AtomicReference atomicReference;
        Snapshot snapshot = this.previousSnapshot;
        if (snapshot == null) {
            atomicReference = SnapshotKt.currentGlobalSnapshot;
            return (Snapshot) atomicReference.get();
        }
        return snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        Snapshot snapshot;
        setDisposed$runtime_release(true);
        if (this.ownsPreviousSnapshot && (snapshot = this.previousSnapshot) != null) {
            snapshot.dispose();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getId() {
        return getCurrentSnapshot().getId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo2565recordModified$runtime_release(StateObject stateObject) {
        getCurrentSnapshot().mo2565recordModified$runtime_release(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setId$runtime_release(int i8) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }

    public void setModified(IdentityArraySet<StateObject> identityArraySet) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 function1) {
        Snapshot createTransparentSnapshotWithNoParentReadObserver;
        Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver$runtime_release(), false, 4, null);
        if (!this.mergeParentObservers) {
            createTransparentSnapshotWithNoParentReadObserver = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver$default, true);
            return createTransparentSnapshotWithNoParentReadObserver;
        }
        return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
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
}
