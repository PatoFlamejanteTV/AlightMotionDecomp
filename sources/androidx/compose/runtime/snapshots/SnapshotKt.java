package androidx.compose.runtime.snapshots;

import Q5.C1413h;
import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import c6.InterfaceC2072n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;
    private static List<? extends InterfaceC2072n> applyObservers;
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;
    private static final SnapshotWeakSet<StateObject> extraStateObjects;
    private static List<? extends Function1> globalWriteObservers;
    private static int nextSnapshotId;
    private static SnapshotIdSet openSnapshots;
    private static AtomicInt pendingApplyObserverCount;
    private static final SnapshotDoubleIndexHeap pinningTable;
    private static final Snapshot snapshotInitializer;
    private static final Function1 emptyLambda = SnapshotKt$emptyLambda$1.INSTANCE;
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.Companion;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        extraStateObjects = new SnapshotWeakSet<>();
        applyObservers = AbstractC1435t.m();
        globalWriteObservers = AbstractC1435t.m();
        int i8 = nextSnapshotId;
        nextSnapshotId = i8 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i8, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        snapshotInitializer = atomicReference.get();
        pendingApplyObserverCount = new AtomicInt(0);
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, int i8, int i9) {
        while (i8 < i9) {
            snapshotIdSet = snapshotIdSet.set(i8);
            i8++;
        }
        return snapshotIdSet;
    }

    public static final <T> T advanceGlobalSnapshot(Function1 function1) {
        GlobalSnapshot globalSnapshot;
        IdentityArraySet<StateObject> modified$runtime_release;
        T t8;
        Snapshot snapshot = snapshotInitializer;
        AbstractC3292y.g(snapshot, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (getLock()) {
            try {
                globalSnapshot = currentGlobalSnapshot.get();
                modified$runtime_release = globalSnapshot.getModified$runtime_release();
                if (modified$runtime_release != null) {
                    pendingApplyObserverCount.add(1);
                }
                t8 = (T) takeNewGlobalSnapshot(globalSnapshot, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (modified$runtime_release != null) {
            try {
                List<? extends InterfaceC2072n> list = applyObservers;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    list.get(i8).invoke(modified$runtime_release, globalSnapshot);
                }
            } finally {
                pendingApplyObserverCount.add(-1);
            }
        }
        synchronized (getLock()) {
            try {
                checkAndOverwriteUnusedRecordsLocked();
                if (modified$runtime_release != null) {
                    Object[] values = modified$runtime_release.getValues();
                    int size2 = modified$runtime_release.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        Object obj = values[i9];
                        AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        processForUnusedRecordsLocked((StateObject) obj);
                    }
                    I i10 = I.f8786a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }

    public static final void checkAndOverwriteUnusedRecordsLocked() {
        SnapshotWeakSet<StateObject> snapshotWeakSet = extraStateObjects;
        int size$runtime_release = snapshotWeakSet.getSize$runtime_release();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            StateObject stateObject = null;
            if (i8 >= size$runtime_release) {
                break;
            }
            WeakReference<StateObject> weakReference = snapshotWeakSet.getValues$runtime_release()[i8];
            if (weakReference != null) {
                stateObject = weakReference.get();
            }
            if (stateObject != null && !(!overwriteUnusedRecordsLocked(stateObject))) {
                if (i9 != i8) {
                    snapshotWeakSet.getValues$runtime_release()[i9] = weakReference;
                    snapshotWeakSet.getHashes$runtime_release()[i9] = snapshotWeakSet.getHashes$runtime_release()[i8];
                }
                i9++;
            }
            i8++;
        }
        for (int i10 = i9; i10 < size$runtime_release; i10++) {
            snapshotWeakSet.getValues$runtime_release()[i10] = null;
            snapshotWeakSet.getHashes$runtime_release()[i10] = 0;
        }
        if (i9 != size$runtime_release) {
            snapshotWeakSet.setSize$runtime_release(i9);
        }
    }

    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, Function1 function1, boolean z8) {
        MutableSnapshot mutableSnapshot;
        boolean z9 = snapshot instanceof MutableSnapshot;
        if (!z9 && snapshot != null) {
            return new TransparentObserverSnapshot(snapshot, function1, false, z8);
        }
        if (z9) {
            mutableSnapshot = (MutableSnapshot) snapshot;
        } else {
            mutableSnapshot = null;
        }
        return new TransparentObserverMutableSnapshot(mutableSnapshot, function1, null, false, z8);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, Function1 function1, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, function1, z8);
    }

    public static final <T extends StateRecord> T current(T t8, Snapshot snapshot) {
        T t9 = (T) readable(t8, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t9 != null) {
            return t9;
        }
        readError();
        throw new C1413h();
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        if (snapshot == null) {
            return currentGlobalSnapshot.get();
        }
        return snapshot;
    }

    private static final StateRecord findYoungestOr(StateRecord stateRecord, Function1 function1) {
        StateRecord stateRecord2 = stateRecord;
        while (stateRecord != null) {
            if (((Boolean) function1.invoke(stateRecord)).booleanValue()) {
                return stateRecord;
            }
            if (stateRecord2.getSnapshotId$runtime_release() < stateRecord.getSnapshotId$runtime_release()) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext$runtime_release();
        }
        return stateRecord2;
    }

    public static final Object getLock() {
        return lock;
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    public static final Function1 mergedReadObserver(Function1 function1, Function1 function12, boolean z8) {
        if (!z8) {
            function12 = null;
        }
        if (function1 != null && function12 != null && !AbstractC3292y.d(function1, function12)) {
            return new SnapshotKt$mergedReadObserver$1(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    public static /* synthetic */ Function1 mergedReadObserver$default(Function1 function1, Function1 function12, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = true;
        }
        return mergedReadObserver(function1, function12, z8);
    }

    public static final Function1 mergedWriteObserver(Function1 function1, Function1 function12) {
        if (function1 != null && function12 != null && !AbstractC3292y.d(function1, function12)) {
            return new SnapshotKt$mergedWriteObserver$1(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    public static final <T extends StateRecord> T newOverwritableRecordLocked(T t8, StateObject stateObject) {
        T t9 = (T) usedLocked(stateObject);
        if (t9 != null) {
            t9.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t9;
        }
        T t10 = (T) t8.create();
        t10.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t10.setNext$runtime_release(stateObject.getFirstStateRecord());
        AbstractC3292y.g(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        stateObject.prependStateRecord(t10);
        AbstractC3292y.g(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t10;
    }

    public static final <T extends StateRecord> T newWritableRecord(T t8, StateObject stateObject, Snapshot snapshot) {
        T t9;
        synchronized (getLock()) {
            t9 = (T) newWritableRecordLocked(t8, stateObject, snapshot);
        }
        return t9;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t8, StateObject stateObject, Snapshot snapshot) {
        T t9 = (T) newOverwritableRecordLocked(t8, stateObject);
        t9.assign(t8);
        t9.setSnapshotId$runtime_release(snapshot.getId());
        return t9;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        snapshot.setWriteCount$runtime_release(snapshot.getWriteCount$runtime_release() + 1);
        Function1 writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord readable;
        IdentityArraySet<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet or = mutableSnapshot2.getInvalid$runtime_release().set(mutableSnapshot2.getId()).or(mutableSnapshot2.getPreviousIds$runtime_release());
        Object[] values = modified$runtime_release.getValues();
        int size = modified$runtime_release.size();
        HashMap hashMap = null;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = values[i8];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            StateObject stateObject = (StateObject) obj;
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord readable2 = readable(firstStateRecord, id, snapshotIdSet);
            if (readable2 != null && (readable = readable(firstStateRecord, id, or)) != null && !AbstractC3292y.d(readable2, readable)) {
                StateRecord readable3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid$runtime_release());
                if (readable3 != null) {
                    StateRecord mergeRecords = stateObject.mergeRecords(readable, readable2, readable3);
                    if (mergeRecords == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(readable2, mergeRecords);
                    hashMap = hashMap;
                } else {
                    readError();
                    throw new C1413h();
                }
            }
        }
        return hashMap;
    }

    public static final <T extends StateRecord, R> R overwritable(T t8, StateObject stateObject, T t9, Function1 function1) {
        Snapshot current;
        R r8;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                r8 = (R) function1.invoke(overwritableRecord(t8, stateObject, current, t9));
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
        notifyWrite(current, stateObject);
        return r8;
    }

    public static final <T extends StateRecord> T overwritableRecord(T t8, StateObject stateObject, Snapshot snapshot, T t9) {
        T t10;
        if (snapshot.getReadOnly()) {
            snapshot.mo2565recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        if (t9.getSnapshotId$runtime_release() == id) {
            return t9;
        }
        synchronized (getLock()) {
            t10 = (T) newOverwritableRecordLocked(t8, stateObject);
        }
        t10.setSnapshotId$runtime_release(id);
        snapshot.mo2565recordModified$runtime_release(stateObject);
        return t10;
    }

    private static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        int lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId);
        StateRecord stateRecord2 = null;
        StateRecord stateRecord3 = null;
        int i8 = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            int snapshotId$runtime_release = firstStateRecord.getSnapshotId$runtime_release();
            if (snapshotId$runtime_release != 0) {
                if (snapshotId$runtime_release < lowestOrDefault) {
                    if (stateRecord2 == null) {
                        i8++;
                        stateRecord2 = firstStateRecord;
                    } else {
                        if (firstStateRecord.getSnapshotId$runtime_release() < stateRecord2.getSnapshotId$runtime_release()) {
                            stateRecord = stateRecord2;
                            stateRecord2 = firstStateRecord;
                        } else {
                            stateRecord = firstStateRecord;
                        }
                        if (stateRecord3 == null) {
                            stateRecord3 = stateObject.getFirstStateRecord();
                            StateRecord stateRecord4 = stateRecord3;
                            while (true) {
                                if (stateRecord3 != null) {
                                    if (stateRecord3.getSnapshotId$runtime_release() >= lowestOrDefault) {
                                        break;
                                    }
                                    if (stateRecord4.getSnapshotId$runtime_release() < stateRecord3.getSnapshotId$runtime_release()) {
                                        stateRecord4 = stateRecord3;
                                    }
                                    stateRecord3 = stateRecord3.getNext$runtime_release();
                                } else {
                                    stateRecord3 = stateRecord4;
                                    break;
                                }
                            }
                        }
                        stateRecord2.setSnapshotId$runtime_release(0);
                        stateRecord2.assign(stateRecord3);
                        stateRecord2 = stateRecord;
                    }
                } else {
                    i8++;
                }
            }
        }
        if (i8 <= 1) {
            return false;
        }
        return true;
    }

    public static final void processForUnusedRecordsLocked(StateObject stateObject) {
        if (overwriteUnusedRecordsLocked(stateObject)) {
            extraStateObjects.add(stateObject);
        }
    }

    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends StateRecord> T readable(T t8, int i8, SnapshotIdSet snapshotIdSet) {
        T t9 = null;
        while (t8 != null) {
            if (valid(t8, i8, snapshotIdSet) && (t9 == null || t9.getSnapshotId$runtime_release() < t8.getSnapshotId$runtime_release())) {
                t9 = t8;
            }
            t8 = (T) t8.getNext$runtime_release();
        }
        if (t9 != null) {
            return t9;
        }
        return null;
    }

    public static final void releasePinningLocked(int i8) {
        pinningTable.remove(i8);
    }

    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T> T sync(Function0 function0) {
        T t8;
        synchronized (getLock()) {
            try {
                t8 = (T) function0.invoke();
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
        return t8;
    }

    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, Function1 function1) {
        T t8 = (T) function1.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i8 = nextSnapshotId;
            nextSnapshotId = i8 + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i8, openSnapshots));
            snapshot.dispose();
            openSnapshots = openSnapshots.set(i8);
            I i9 = I.f8786a;
        }
        return t8;
    }

    public static final <T extends Snapshot> T takeNewSnapshot(Function1 function1) {
        return (T) advanceGlobalSnapshot(new SnapshotKt$takeNewSnapshot$1(function1));
    }

    public static final int trackPinning(int i8, SnapshotIdSet snapshotIdSet) {
        int add;
        int lowest = snapshotIdSet.lowest(i8);
        synchronized (getLock()) {
            add = pinningTable.add(lowest);
        }
        return add;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        int lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            if (firstStateRecord.getSnapshotId$runtime_release() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, lowestOrDefault, empty)) {
                if (stateRecord == null) {
                    stateRecord = firstStateRecord;
                } else {
                    if (firstStateRecord.getSnapshotId$runtime_release() >= stateRecord.getSnapshotId$runtime_release()) {
                        return stateRecord;
                    }
                    return firstStateRecord;
                }
            }
        }
        return null;
    }

    private static final boolean valid(int i8, int i9, SnapshotIdSet snapshotIdSet) {
        return (i9 == 0 || i9 > i8 || snapshotIdSet.get(i9)) ? false : true;
    }

    public static final void validateOpen(Snapshot snapshot) {
        MutableSnapshot mutableSnapshot;
        Object obj;
        int lowestOrDefault;
        if (!openSnapshots.get(snapshot.getId())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Snapshot is not open: id=");
            sb.append(snapshot.getId());
            sb.append(", disposed=");
            sb.append(snapshot.getDisposed$runtime_release());
            sb.append(", applied=");
            if (snapshot instanceof MutableSnapshot) {
                mutableSnapshot = (MutableSnapshot) snapshot;
            } else {
                mutableSnapshot = null;
            }
            if (mutableSnapshot != null) {
                obj = Boolean.valueOf(mutableSnapshot.getApplied$runtime_release());
            } else {
                obj = "read-only";
            }
            sb.append(obj);
            sb.append(", lowestPin=");
            synchronized (getLock()) {
                lowestOrDefault = pinningTable.lowestOrDefault(-1);
            }
            sb.append(lowestOrDefault);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public static final <T extends StateRecord, R> R withCurrent(T t8, Function1 function1) {
        return (R) function1.invoke(current(t8));
    }

    public static final <T extends StateRecord, R> R writable(T t8, StateObject stateObject, Function1 function1) {
        Snapshot current;
        R r8;
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                r8 = (R) function1.invoke(writableRecord(t8, stateObject, current));
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
        notifyWrite(current, stateObject);
        return r8;
    }

    public static final <T extends StateRecord> T writableRecord(T t8, StateObject stateObject, Snapshot snapshot) {
        if (snapshot.getReadOnly()) {
            snapshot.mo2565recordModified$runtime_release(stateObject);
        }
        T t9 = (T) readable(t8, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t9 != null) {
            if (t9.getSnapshotId$runtime_release() == snapshot.getId()) {
                return t9;
            }
            T t10 = (T) newWritableRecord(t9, stateObject, snapshot);
            snapshot.mo2565recordModified$runtime_release(stateObject);
            return t10;
        }
        readError();
        throw new C1413h();
    }

    public static final <T extends StateRecord> T current(T t8) {
        T t9;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        T t10 = (T) readable(t8, current.getId(), current.getInvalid$runtime_release());
        if (t10 != null) {
            return t10;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t9 = (T) readable(t8, current2.getId(), current2.getInvalid$runtime_release());
        }
        if (t9 != null) {
            return t9;
        }
        readError();
        throw new C1413h();
    }

    private static final boolean valid(StateRecord stateRecord, int i8, SnapshotIdSet snapshotIdSet) {
        return valid(i8, stateRecord.getSnapshotId$runtime_release(), snapshotIdSet);
    }

    public static final <T extends StateRecord> T readable(T t8, StateObject stateObject) {
        T t9;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot current = companion.getCurrent();
        Function1 readObserver$runtime_release = current.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t10 = (T) readable(t8, current.getId(), current.getInvalid$runtime_release());
        if (t10 != null) {
            return t10;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            t9 = (T) readable(firstStateRecord, current2.getId(), current2.getInvalid$runtime_release());
            if (t9 == null) {
                readError();
                throw new C1413h();
            }
        }
        return t9;
    }

    public static final <T extends StateRecord, R> R writable(T t8, StateObject stateObject, Snapshot snapshot, Function1 function1) {
        R r8;
        synchronized (getLock()) {
            try {
                r8 = (R) function1.invoke(writableRecord(t8, stateObject, snapshot));
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
        notifyWrite(snapshot, stateObject);
        return r8;
    }

    public static final <T extends StateRecord> T readable(T t8, StateObject stateObject, Snapshot snapshot) {
        Function1 readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t9 = (T) readable(t8, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t9 != null) {
            return t9;
        }
        readError();
        throw new C1413h();
    }

    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(SnapshotKt$advanceGlobalSnapshot$3.INSTANCE);
    }
}
