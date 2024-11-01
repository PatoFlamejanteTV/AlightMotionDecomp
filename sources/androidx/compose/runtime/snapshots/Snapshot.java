package androidx.compose.runtime.snapshots;

import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3290w;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class Snapshot {
    private boolean disposed;
    private int id;
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Object observe$default(Companion companion, Function1 function1, Function1 function12, Function0 function0, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                function1 = null;
            }
            if ((i8 & 2) != 0) {
                function12 = null;
            }
            return companion.observe(function1, function12, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerApplyObserver$lambda$6(InterfaceC2072n interfaceC2072n) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setApplyObservers$p(AbstractC1435t.E0(SnapshotKt.access$getApplyObservers$p(), interfaceC2072n));
                I i8 = I.f8786a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerGlobalWriteObserver$lambda$9(Function1 function1) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setGlobalWriteObservers$p(AbstractC1435t.E0(SnapshotKt.access$getGlobalWriteObservers$p(), function1));
                I i8 = I.f8786a;
            }
            SnapshotKt.access$advanceGlobalSnapshot();
        }

        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, Function1 function1, Function1 function12, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                function1 = null;
            }
            if ((i8 & 2) != 0) {
                function12 = null;
            }
            return companion.takeMutableSnapshot(function1, function12);
        }

        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, Function1 function1, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                function1 = null;
            }
            return companion.takeSnapshot(function1);
        }

        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.access$getThreadSnapshot$p().get(), null, false, 6, null);
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final <T> T global(Function0 function0) {
            Snapshot removeCurrent = removeCurrent();
            T t8 = (T) function0.invoke();
            Snapshot.Companion.restoreCurrent(removeCurrent);
            return t8;
        }

        public final boolean isApplyObserverNotificationPending() {
            if (SnapshotKt.access$getPendingApplyObserverCount$p().get() > 0) {
                return true;
            }
            return false;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(Function1 function1, Function1 function12, Function0 function0) {
            MutableSnapshot mutableSnapshot;
            Snapshot transparentObserverMutableSnapshot;
            if (function1 == null && function12 == null) {
                return (T) function0.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
            if (snapshot != null && !(snapshot instanceof MutableSnapshot)) {
                if (function1 == null) {
                    return (T) function0.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(function1);
            } else {
                if (snapshot instanceof MutableSnapshot) {
                    mutableSnapshot = (MutableSnapshot) snapshot;
                } else {
                    mutableSnapshot = null;
                }
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(mutableSnapshot, function1, function12, true, false);
            }
            try {
                Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                try {
                    return (T) function0.invoke();
                } finally {
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                transparentObserverMutableSnapshot.dispose();
            }
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            return AbstractC1435t.W0(SnapshotKt.access$getOpenSnapshots$p()).size();
        }

        public final ObserverHandle registerApplyObserver(final InterfaceC2072n interfaceC2072n) {
            SnapshotKt.access$advanceGlobalSnapshot(SnapshotKt.access$getEmptyLambda$p());
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setApplyObservers$p(AbstractC1435t.H0(SnapshotKt.access$getApplyObservers$p(), interfaceC2072n));
                I i8 = I.f8786a;
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.a
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerApplyObserver$lambda$6(InterfaceC2072n.this);
                }
            };
        }

        public final ObserverHandle registerGlobalWriteObserver(final Function1 function1) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.access$setGlobalWriteObservers$p(AbstractC1435t.H0(SnapshotKt.access$getGlobalWriteObservers$p(), function1));
                I i8 = I.f8786a;
            }
            SnapshotKt.access$advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.b
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerGlobalWriteObserver$lambda$9(Function1.this);
                }
            };
        }

        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
            if (snapshot != null) {
                SnapshotKt.access$getThreadSnapshot$p().set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(Snapshot snapshot) {
            if (snapshot != null) {
                SnapshotKt.access$getThreadSnapshot$p().set(snapshot);
            }
        }

        public final void sendApplyNotifications() {
            boolean z8;
            synchronized (SnapshotKt.getLock()) {
                IdentityArraySet<StateObject> modified$runtime_release = ((GlobalSnapshot) SnapshotKt.access$getCurrentGlobalSnapshot$p().get()).getModified$runtime_release();
                z8 = false;
                if (modified$runtime_release != null) {
                    if (modified$runtime_release.isNotEmpty()) {
                        z8 = true;
                    }
                }
            }
            if (z8) {
                SnapshotKt.access$advanceGlobalSnapshot();
            }
        }

        public final MutableSnapshot takeMutableSnapshot(Function1 function1, Function1 function12) {
            MutableSnapshot mutableSnapshot;
            MutableSnapshot takeNestedMutableSnapshot;
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            if (currentSnapshot instanceof MutableSnapshot) {
                mutableSnapshot = (MutableSnapshot) currentSnapshot;
            } else {
                mutableSnapshot = null;
            }
            if (mutableSnapshot != null && (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(function1, function12)) != null) {
                return takeNestedMutableSnapshot;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        public final Snapshot takeSnapshot(Function1 function1) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(function1);
        }

        public final <R> R withMutableSnapshot(Function0 function0) {
            MutableSnapshot takeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot makeCurrent = takeMutableSnapshot$default.makeCurrent();
                try {
                    R r8 = (R) function0.invoke();
                    AbstractC3290w.b(1);
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                    AbstractC3290w.a(1);
                    takeMutableSnapshot$default.apply().check();
                    return r8;
                } catch (Throwable th) {
                    AbstractC3290w.b(1);
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                    AbstractC3290w.a(1);
                    throw th;
                }
            } finally {
                AbstractC3290w.b(1);
                takeMutableSnapshot$default.dispose();
                AbstractC3290w.a(1);
            }
        }

        public final <T> T withoutReadObservation(Function0 function0) {
            Snapshot createNonObservableSnapshot = createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    return (T) function0.invoke();
                } finally {
                    AbstractC3290w.b(1);
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    AbstractC3290w.a(1);
                }
            } finally {
                AbstractC3290w.b(1);
                createNonObservableSnapshot.dispose();
                AbstractC3290w.a(1);
            }
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ Snapshot(int i8, SnapshotIdSet snapshotIdSet, AbstractC3284p abstractC3284p) {
        this(i8, snapshotIdSet);
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, Function1 function1, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 1) != 0) {
                function1 = null;
            }
            return snapshot.takeNestedSnapshot(function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            I i8 = I.f8786a;
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.access$setOpenSnapshots$p(SnapshotKt.access$getOpenSnapshots$p().clear(getId()));
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            I i8 = I.f8786a;
        }
    }

    public final <T> T enter(Function0 function0) {
        Snapshot makeCurrent = makeCurrent();
        try {
            return (T) function0.invoke();
        } finally {
            AbstractC3290w.b(1);
            restoreCurrent(makeCurrent);
            AbstractC3290w.a(1);
        }
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public int getId() {
        return this.id;
    }

    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    public abstract IdentityArraySet<StateObject> getModified$runtime_release();

    public abstract Function1 getReadObserver$runtime_release();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public int getWriteCount$runtime_release() {
        return 0;
    }

    public abstract Function1 getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        if (this.pinningTrackingHandle >= 0) {
            return true;
        }
        return false;
    }

    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.access$getThreadSnapshot$p().get();
        SnapshotKt.access$getThreadSnapshot$p().set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime_release */
    public abstract void mo2562nestedActivated$runtime_release(Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo2563nestedDeactivated$runtime_release(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo2565recordModified$runtime_release(StateObject stateObject);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i8 = this.pinningTrackingHandle;
        if (i8 >= 0) {
            SnapshotKt.releasePinningLocked(i8);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotKt.access$getThreadSnapshot$p().set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z8) {
        this.disposed = z8;
    }

    public void setId$runtime_release(int i8) {
        this.id = i8;
    }

    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public void setWriteCount$runtime_release(int i8) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public abstract Snapshot takeNestedSnapshot(Function1 function1);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i8 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i8;
    }

    @ExperimentalComposeApi
    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    @ExperimentalComposeApi
    public final void unsafeLeave(Snapshot snapshot) {
        if (SnapshotKt.access$getThreadSnapshot$p().get() == this) {
            restoreCurrent(snapshot);
            return;
        }
        throw new IllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot").toString());
    }

    public final void validateNotDisposed$runtime_release() {
        if (!this.disposed) {
        } else {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }

    private Snapshot(int i8, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.id = i8;
        this.pinningTrackingHandle = i8 != 0 ? SnapshotKt.trackPinning(i8, getInvalid$runtime_release()) : -1;
    }
}
