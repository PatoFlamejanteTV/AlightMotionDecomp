package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private boolean deactivated;
    private final MutableSnapshot parent;

    public NestedMutableSnapshot(int i8, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12, MutableSnapshot mutableSnapshot) {
        super(i8, snapshotIdSet, function1, function12);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo2562nestedActivated$runtime_release(this);
    }

    private final void deactivate() {
        if (!this.deactivated) {
            this.deactivated = true;
            this.parent.mo2563nestedDeactivated$runtime_release(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:11:0x002e, B:13:0x0033, B:16:0x003a, B:21:0x0054, B:23:0x005c, B:24:0x006e, B:26:0x0076, B:27:0x007b, B:32:0x0062, B:33:0x006b), top: B:10:0x002e }] */
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            r7 = this;
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent
            boolean r0 = r0.getApplied$runtime_release()
            if (r0 != 0) goto Lbf
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent
            boolean r0 = r0.getDisposed$runtime_release()
            if (r0 == 0) goto L12
            goto Lbf
        L12:
            androidx.compose.runtime.collection.IdentityArraySet r0 = r7.getModified$runtime_release()
            int r1 = r7.getId()
            r2 = 0
            if (r0 == 0) goto L28
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r7.parent
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r3.getInvalid$runtime_release()
            java.util.Map r3 = androidx.compose.runtime.snapshots.SnapshotKt.access$optimisticMerges(r3, r7, r4)
            goto L29
        L28:
            r3 = r2
        L29:
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.SnapshotKt.access$validateOpen(r7)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L6b
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L3a
            goto L6b
        L3a:
            androidx.compose.runtime.snapshots.MutableSnapshot r5 = r7.parent     // Catch: java.lang.Throwable -> L60
            int r5 = r5.getId()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.MutableSnapshot r6 = r7.parent     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r6.getInvalid$runtime_release()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotApplyResult r3 = r7.innerApplyLocked$runtime_release(r5, r3, r6)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r5 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE     // Catch: java.lang.Throwable -> L60
            boolean r5 = kotlin.jvm.internal.AbstractC3292y.d(r3, r5)     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L54
            monitor-exit(r4)
            return r3
        L54:
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r7.parent     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.collection.IdentityArraySet r3 = r3.getModified$runtime_release()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L60
            goto L6e
        L60:
            r0 = move-exception
            goto Lbd
        L62:
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r7.parent     // Catch: java.lang.Throwable -> L60
            r3.setModified(r0)     // Catch: java.lang.Throwable -> L60
            r7.setModified(r2)     // Catch: java.lang.Throwable -> L60
            goto L6e
        L6b:
            r7.closeAndReleasePinning$runtime_release()     // Catch: java.lang.Throwable -> L60
        L6e:
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            int r0 = r0.getId()     // Catch: java.lang.Throwable -> L60
            if (r0 >= r1) goto L7b
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            r0.advance$runtime_release()     // Catch: java.lang.Throwable -> L60
        L7b:
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r0.getInvalid$runtime_release()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.clear(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r7.getPreviousIds$runtime_release()     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.andNot(r3)     // Catch: java.lang.Throwable -> L60
            r0.setInvalid$runtime_release(r2)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            r0.recordPrevious$runtime_release(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            int r1 = r7.takeoverPinnedSnapshot$runtime_release()     // Catch: java.lang.Throwable -> L60
            r0.recordPreviousPinnedSnapshot$runtime_release(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r7.getPreviousIds$runtime_release()     // Catch: java.lang.Throwable -> L60
            r0.recordPreviousList$runtime_release(r1)     // Catch: java.lang.Throwable -> L60
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r7.parent     // Catch: java.lang.Throwable -> L60
            int[] r1 = r7.getPreviousPinnedSnapshots$runtime_release()     // Catch: java.lang.Throwable -> L60
            r0.recordPreviousPinnedSnapshots$runtime_release(r1)     // Catch: java.lang.Throwable -> L60
            Q5.I r0 = Q5.I.f8786a     // Catch: java.lang.Throwable -> L60
            monitor-exit(r4)
            r0 = 1
            r7.setApplied$runtime_release(r0)
            r7.deactivate()
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r0 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE
            return r0
        Lbd:
            monitor-exit(r4)
            throw r0
        Lbf:
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure r0 = new androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.NestedMutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed$runtime_release()) {
            super.dispose();
            deactivate();
        }
    }

    public final MutableSnapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }
}
