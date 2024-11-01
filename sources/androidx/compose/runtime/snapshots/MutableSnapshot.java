package androidx.compose.runtime.snapshots;

import Q5.I;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;
    private List<? extends StateObject> merged;
    private IdentityArraySet<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final Function1 readObserver;
    private int snapshots;
    private int writeCount;
    private final Function1 writeObserver;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyIntArray = new int[0];

    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public MutableSnapshot(int i8, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12) {
        super(i8, snapshotIdSet, null);
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = SnapshotIdSet.Companion.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    private final void abandon() {
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            validateNotApplied();
            setModified(null);
            int id = getId();
            Object[] values = modified$runtime_release.getValues();
            int size = modified$runtime_release.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = values[i8];
                AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (StateRecord firstStateRecord = ((StateObject) obj).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
                    if (firstStateRecord.getSnapshotId$runtime_release() == id || AbstractC1435t.d0(this.previousIds, Integer.valueOf(firstStateRecord.getSnapshotId$runtime_release()))) {
                        firstStateRecord.setSnapshotId$runtime_release(0);
                    }
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i8 = 0; i8 < length; i8++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i8]);
        }
    }

    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                function1 = null;
            }
            if ((i8 & 2) != 0) {
                function12 = null;
            }
            return mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
    }

    private final void validateNotApplied() {
        if (!this.applied) {
        } else {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    private final void validateNotAppliedOrPinned() {
        if (this.applied && ((Snapshot) this).pinningTrackingHandle < 0) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }

    public final <T> T advance$runtime_release(Function0 function0) {
        int i8;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime_release(getId());
        T t8 = (T) function0.invoke();
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                try {
                    i8 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i8 + 1;
                    setId$runtime_release(i8);
                    snapshotIdSet = SnapshotKt.openSnapshots;
                    SnapshotKt.openSnapshots = snapshotIdSet.set(getId());
                    I i9 = I.f8786a;
                    AbstractC3290w.b(1);
                } catch (Throwable th) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th;
                }
            }
            AbstractC3290w.a(1);
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return t8;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7 A[LOOP:0: B:25:0x00c5->B:26:0x00c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2 A[LOOP:1: B:32:0x00e0->B:33:0x00e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed$runtime_release()) {
            super.dispose();
            mo2563nestedDeactivated$runtime_release(this);
        }
    }

    public final boolean getApplied$runtime_release() {
        return this.applied;
    }

    public final List<StateObject> getMerged$runtime_release() {
        return this.merged;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public IdentityArraySet<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.previousIds;
    }

    public final int[] getPreviousPinnedSnapshots$runtime_release() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null || !modified$runtime_release.isNotEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:            r15 = androidx.compose.runtime.snapshots.SnapshotKt.readable(r11, getId(), r2);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.snapshots.SnapshotApplyResult innerApplyLocked$runtime_release(int r19, java.util.Map<androidx.compose.runtime.snapshots.StateRecord, ? extends androidx.compose.runtime.snapshots.StateRecord> r20, androidx.compose.runtime.snapshots.SnapshotIdSet r21) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.innerApplyLocked$runtime_release(int, java.util.Map, androidx.compose.runtime.snapshots.SnapshotIdSet):androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo2562nestedActivated$runtime_release(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo2563nestedDeactivated$runtime_release(Snapshot snapshot) {
        int i8 = this.snapshots;
        if (i8 > 0) {
            int i9 = i8 - 1;
            this.snapshots = i9;
            if (i9 == 0 && !this.applied) {
                abandon();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("no pending nested snapshots".toString());
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (!this.applied && !getDisposed$runtime_release()) {
            advance$runtime_release();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo2565recordModified$runtime_release(StateObject stateObject) {
        IdentityArraySet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = new IdentityArraySet<>();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(stateObject);
    }

    public final void recordPrevious$runtime_release(int i8) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(i8);
            I i9 = I.f8786a;
        }
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshotIdSet) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshotIdSet);
            I i8 = I.f8786a;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int i8) {
        if (i8 >= 0) {
            this.previousPinnedSnapshots = AbstractC1428l.A(this.previousPinnedSnapshots, i8);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.previousPinnedSnapshots;
        if (iArr2.length != 0) {
            iArr = AbstractC1428l.B(iArr2, iArr);
        }
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void setApplied$runtime_release(boolean z8) {
        this.applied = z8;
    }

    public final void setMerged$runtime_release(List<? extends StateObject> list) {
        this.merged = list;
    }

    public void setModified(IdentityArraySet<StateObject> identityArraySet) {
        this.modified = identityArraySet;
    }

    public final void setPreviousIds$runtime_release(SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i8) {
        this.writeCount = i8;
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1 function1, Function1 function12) {
        int i8;
        SnapshotIdSet snapshotIdSet;
        NestedMutableSnapshot nestedMutableSnapshot;
        Function1 mergedWriteObserver;
        int i9;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            i8 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i8 + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(i8);
            SnapshotIdSet invalid$runtime_release = getInvalid$runtime_release();
            setInvalid$runtime_release(invalid$runtime_release.set(i8));
            SnapshotIdSet addRange = SnapshotKt.addRange(invalid$runtime_release, getId() + 1, i8);
            Function1 mergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver$runtime_release(), false, 4, null);
            mergedWriteObserver = SnapshotKt.mergedWriteObserver(function12, getWriteObserver$runtime_release());
            nestedMutableSnapshot = new NestedMutableSnapshot(i8, addRange, mergedReadObserver$default, mergedWriteObserver, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                i9 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i9 + 1;
                setId$runtime_release(i9);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getId());
                I i10 = I.f8786a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 function1) {
        int i8;
        SnapshotIdSet snapshotIdSet;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        int i9;
        SnapshotIdSet snapshotIdSet2;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            i8 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i8 + 1;
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(i8);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i8, SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, i8), function1, this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                i9 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i9 + 1;
                setId$runtime_release(i9);
                snapshotIdSet2 = SnapshotKt.openSnapshots;
                SnapshotKt.openSnapshots = snapshotIdSet2.set(getId());
                I i10 = I.f8786a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    public final void advance$runtime_release() {
        int i8;
        SnapshotIdSet snapshotIdSet;
        recordPrevious$runtime_release(getId());
        I i9 = I.f8786a;
        if (getApplied$runtime_release() || getDisposed$runtime_release()) {
            return;
        }
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            i8 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i8 + 1;
            setId$runtime_release(i8);
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(getId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
    }
}
