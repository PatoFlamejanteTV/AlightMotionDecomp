package androidx.compose.runtime.snapshots;

import Q5.C1413h;
import Q5.I;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class GlobalSnapshot extends MutableSnapshot {
    public static final int $stable = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GlobalSnapshot(int r4, androidx.compose.runtime.snapshots.SnapshotIdSet r5) {
        /*
            r3 = this;
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r0)
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.access$getGlobalWriteObservers$p()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = R5.AbstractC1435t.M0(r1)     // Catch: java.lang.Throwable -> L17
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L19
            androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1 r2 = new androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1     // Catch: java.lang.Throwable -> L17
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r4 = move-exception
            goto L1f
        L19:
            monitor-exit(r0)
            r0 = 0
            r3.<init>(r4, r5, r0, r2)
            return
        L1f:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.GlobalSnapshot.<init>(int, androidx.compose.runtime.snapshots.SnapshotIdSet):void");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            I i8 = I.f8786a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.advanceGlobalSnapshot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(Function1 function1, Function1 function12) {
        Snapshot takeNewSnapshot;
        takeNewSnapshot = SnapshotKt.takeNewSnapshot(new GlobalSnapshot$takeNestedMutableSnapshot$1(function1, function12));
        return (MutableSnapshot) takeNewSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 function1) {
        Snapshot takeNewSnapshot;
        takeNewSnapshot = SnapshotKt.takeNewSnapshot(new GlobalSnapshot$takeNestedSnapshot$1(function1));
        return takeNewSnapshot;
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
