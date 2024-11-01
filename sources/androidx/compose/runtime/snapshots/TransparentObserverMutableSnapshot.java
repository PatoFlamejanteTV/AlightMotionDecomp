package androidx.compose.runtime.snapshots;

import Q5.C1413h;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsParentSnapshot;
    private final MutableSnapshot parentSnapshot;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TransparentObserverMutableSnapshot(androidx.compose.runtime.snapshots.MutableSnapshot r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.functions.Function1 r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            androidx.compose.runtime.snapshots.SnapshotIdSet$Companion r0 = androidx.compose.runtime.snapshots.SnapshotIdSet.Companion
            androidx.compose.runtime.snapshots.SnapshotIdSet r0 = r0.getEMPTY()
            if (r3 == 0) goto Le
            kotlin.jvm.functions.Function1 r1 = r3.getReadObserver$runtime_release()
            if (r1 != 0) goto L1c
        Le:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.access$getCurrentGlobalSnapshot$p()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            kotlin.jvm.functions.Function1 r1 = r1.getReadObserver$runtime_release()
        L1c:
            kotlin.jvm.functions.Function1 r4 = androidx.compose.runtime.snapshots.SnapshotKt.access$mergedReadObserver(r4, r1, r6)
            if (r3 == 0) goto L28
            kotlin.jvm.functions.Function1 r1 = r3.getWriteObserver$runtime_release()
            if (r1 != 0) goto L36
        L28:
            java.util.concurrent.atomic.AtomicReference r1 = androidx.compose.runtime.snapshots.SnapshotKt.access$getCurrentGlobalSnapshot$p()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r1 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r1
            kotlin.jvm.functions.Function1 r1 = r1.getWriteObserver$runtime_release()
        L36:
            kotlin.jvm.functions.Function1 r5 = androidx.compose.runtime.snapshots.SnapshotKt.access$mergedWriteObserver(r5, r1)
            r1 = 0
            r2.<init>(r1, r0, r4, r5)
            r2.parentSnapshot = r3
            r2.mergeParentObservers = r6
            r2.ownsParentSnapshot = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot.<init>(androidx.compose.runtime.snapshots.MutableSnapshot, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }

    private final MutableSnapshot getCurrentSnapshot() {
        AtomicReference atomicReference;
        MutableSnapshot mutableSnapshot = this.parentSnapshot;
        if (mutableSnapshot == null) {
            atomicReference = SnapshotKt.currentGlobalSnapshot;
            return (MutableSnapshot) atomicReference.get();
        }
        return mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        return getCurrentSnapshot().apply();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        MutableSnapshot mutableSnapshot;
        setDisposed$runtime_release(true);
        if (this.ownsParentSnapshot && (mutableSnapshot = this.parentSnapshot) != null) {
            mutableSnapshot.dispose();
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

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return getCurrentSnapshot().getWriteCount$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
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

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public void setModified(IdentityArraySet<StateObject> identityArraySet) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i8) {
        getCurrentSnapshot().setWriteCount$runtime_release(i8);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(Function1 function1, Function1 function12) {
        Function1 mergedWriteObserver;
        Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver$runtime_release(), false, 4, null);
        mergedWriteObserver = SnapshotKt.mergedWriteObserver(function12, getWriteObserver$runtime_release());
        if (!this.mergeParentObservers) {
            return new TransparentObserverMutableSnapshot(getCurrentSnapshot().takeNestedMutableSnapshot(null, mergedWriteObserver), mergedReadObserver$default, mergedWriteObserver, false, true);
        }
        return getCurrentSnapshot().takeNestedMutableSnapshot(mergedReadObserver$default, mergedWriteObserver);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 function1) {
        Snapshot createTransparentSnapshotWithNoParentReadObserver;
        Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver$runtime_release(), false, 4, null);
        if (!this.mergeParentObservers) {
            createTransparentSnapshotWithNoParentReadObserver = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver$default, true);
            return createTransparentSnapshotWithNoParentReadObserver;
        }
        return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2562nestedActivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2563nestedDeactivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }
}
