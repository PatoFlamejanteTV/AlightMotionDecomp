package androidx.compose.runtime.snapshots;

import Q5.I;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2768b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, InterfaceC2768b {
    public static final int $stable = 0;
    private StateRecord firstStateRecord = new StateListStateRecord(ExtensionsKt.persistentListOf());

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class StateListStateRecord<T> extends StateRecord {
        public static final int $stable = 8;
        private PersistentList<? extends T> list;
        private int modification;
        private int structuralChange;

        public StateListStateRecord(PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            Object obj;
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.list = ((StateListStateRecord) stateRecord).list;
                this.modification = ((StateListStateRecord) stateRecord).modification;
                this.structuralChange = ((StateListStateRecord) stateRecord).structuralChange;
                I i8 = I.f8786a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateListStateRecord(this.list);
        }

        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final int getStructuralChange$runtime_release() {
            return this.structuralChange;
        }

        public final void setList$runtime_release(PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i8) {
            this.modification = i8;
        }

        public final void setStructuralChange$runtime_release(int i8) {
            this.structuralChange = i8;
        }
    }

    private final boolean conditionalUpdate(boolean z8, Function1 function1) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z9;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    I i8 = I.f8786a;
                    AbstractC3290w.b(1);
                } catch (Throwable th) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th;
                }
            }
            AbstractC3290w.a(1);
            AbstractC3292y.f(list$runtime_release);
            PersistentList<? extends T> persistentList = (PersistentList) function1.invoke(list$runtime_release);
            z9 = false;
            if (AbstractC3292y.d(persistentList, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    obj2 = SnapshotStateListKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateListStateRecord3.setList$runtime_release(persistentList);
                                if (z8) {
                                    stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                                }
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                z9 = true;
                            }
                            AbstractC3290w.b(1);
                        } catch (Throwable th2) {
                            AbstractC3290w.b(1);
                            AbstractC3290w.a(1);
                            throw th2;
                        }
                    }
                    AbstractC3290w.a(1);
                    AbstractC3290w.b(1);
                } catch (Throwable th3) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th3;
                }
            }
            AbstractC3290w.a(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z9);
        return true;
    }

    static /* synthetic */ boolean conditionalUpdate$default(SnapshotStateList snapshotStateList, boolean z8, Function1 function1, int i8, Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z9;
        Snapshot current;
        Object obj3;
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                try {
                    StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                    AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    I i9 = I.f8786a;
                    AbstractC3290w.b(1);
                } catch (Throwable th) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th;
                }
            }
            AbstractC3290w.a(1);
            AbstractC3292y.f(list$runtime_release);
            PersistentList<? extends T> persistentList = (PersistentList) function1.invoke(list$runtime_release);
            z9 = false;
            if (AbstractC3292y.d(persistentList, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current);
                    obj3 = SnapshotStateListKt.sync;
                    synchronized (obj3) {
                        try {
                            if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateListStateRecord3.setList$runtime_release(persistentList);
                                if (z8) {
                                    stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                                }
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                z9 = true;
                            }
                            AbstractC3290w.b(1);
                        } catch (Throwable th2) {
                            AbstractC3290w.b(1);
                            AbstractC3290w.a(1);
                            throw th2;
                        }
                    }
                    AbstractC3290w.a(1);
                    AbstractC3290w.b(1);
                } catch (Throwable th3) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th3;
                }
            }
            AbstractC3290w.a(1);
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!z9);
        return true;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(Function1 function1) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        R r8;
        Snapshot current;
        Object obj2;
        boolean z8;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    I i8 = I.f8786a;
                    AbstractC3290w.b(1);
                } catch (Throwable th) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th;
                }
            }
            AbstractC3290w.a(1);
            AbstractC3292y.f(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            r8 = (R) function1.invoke(builder);
            PersistentList<T> build = builder.build();
            if (AbstractC3292y.d(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    obj2 = SnapshotStateListKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateListStateRecord3.setList$runtime_release(build);
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            AbstractC3290w.b(1);
                        } finally {
                        }
                    }
                    AbstractC3290w.a(1);
                    AbstractC3290w.b(1);
                } catch (Throwable th2) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th2;
                }
            }
            AbstractC3290w.a(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return r8;
    }

    private final boolean mutateBoolean(Function1 function1) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Object invoke;
        Snapshot current;
        Object obj2;
        boolean z8;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                I i8 = I.f8786a;
            }
            AbstractC3292y.f(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            invoke = function1.invoke(builder);
            PersistentList<T> build = builder.build();
            if (AbstractC3292y.d(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z8 = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return ((Boolean) invoke).booleanValue();
    }

    private final void update(boolean z8, Function1 function1) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z9;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    I i8 = I.f8786a;
                    AbstractC3290w.b(1);
                } catch (Throwable th) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th;
                }
            }
            AbstractC3290w.a(1);
            AbstractC3292y.f(list$runtime_release);
            PersistentList<? extends T> persistentList = (PersistentList) function1.invoke(list$runtime_release);
            if (!AbstractC3292y.d(persistentList, list$runtime_release)) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.Companion.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        obj2 = SnapshotStateListKt.sync;
                        synchronized (obj2) {
                            try {
                                if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                    stateListStateRecord3.setList$runtime_release(persistentList);
                                    if (z8) {
                                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                                    }
                                    stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                AbstractC3290w.b(1);
                            } catch (Throwable th2) {
                                AbstractC3290w.b(1);
                                AbstractC3290w.a(1);
                                throw th2;
                            }
                        }
                        AbstractC3290w.a(1);
                        AbstractC3290w.b(1);
                    } catch (Throwable th3) {
                        AbstractC3290w.b(1);
                        AbstractC3290w.a(1);
                        throw th3;
                    }
                }
                AbstractC3290w.a(1);
                SnapshotKt.notifyWrite(current, this);
            } else {
                return;
            }
        } while (!z9);
    }

    static /* synthetic */ void update$default(SnapshotStateList snapshotStateList, boolean z8, Function1 function1, int i8, Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj3;
        boolean z9;
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                try {
                    StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                    AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    I i9 = I.f8786a;
                    AbstractC3290w.b(1);
                } catch (Throwable th) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th;
                }
            }
            AbstractC3290w.a(1);
            AbstractC3292y.f(list$runtime_release);
            PersistentList<? extends T> persistentList = (PersistentList) function1.invoke(list$runtime_release);
            if (!AbstractC3292y.d(persistentList, list$runtime_release)) {
                StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.Companion.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current);
                        obj3 = SnapshotStateListKt.sync;
                        synchronized (obj3) {
                            try {
                                if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                    stateListStateRecord3.setList$runtime_release(persistentList);
                                    if (z8) {
                                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                                    }
                                    stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                AbstractC3290w.b(1);
                            } catch (Throwable th2) {
                                AbstractC3290w.b(1);
                                AbstractC3290w.a(1);
                                throw th2;
                            }
                        }
                        AbstractC3290w.a(1);
                        AbstractC3290w.b(1);
                    } catch (Throwable th3) {
                        AbstractC3290w.b(1);
                        AbstractC3290w.a(1);
                        throw th3;
                    }
                }
                AbstractC3290w.a(1);
                SnapshotKt.notifyWrite(current, snapshotStateList);
            } else {
                return;
            }
        } while (!z9);
    }

    private final <R> R withCurrent(Function1 function1) {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (R) function1.invoke(SnapshotKt.current((StateListStateRecord) firstStateRecord));
    }

    private final <R> R writable(Function1 function1) {
        Snapshot current;
        R r8;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                r8 = (R) function1.invoke(SnapshotKt.writableRecord(stateListStateRecord, this, current));
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
        SnapshotKt.notifyWrite(current, this);
        return r8;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t8) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z8;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                I i8 = I.f8786a;
            }
            AbstractC3292y.f(list$runtime_release);
            PersistentList<T> add = list$runtime_release.add((PersistentList<T>) t8);
            z8 = false;
            if (AbstractC3292y.d(add, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(add);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z8 = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection<? extends T> collection) {
        return mutateBoolean(new SnapshotStateList$addAll$1(i8, collection));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        Object obj;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                stateListStateRecord2.setList$runtime_release(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification$runtime_release() + 1);
                stateListStateRecord2.setStructuralChange$runtime_release(stateListStateRecord2.getStructuralChange$runtime_release() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(collection);
    }

    @Override // java.util.List
    public T get(int i8) {
        return getReadable$runtime_release().getList$runtime_release().get(i8);
    }

    public final List<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final StateListStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    public final int getStructure$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getStructuralChange$runtime_release();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public /* synthetic */ StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return c.a(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.setNext$runtime_release(getFirstStateRecord());
        AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (StateListStateRecord) stateRecord;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i8) {
        return removeAt(i8);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z8;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                I i8 = I.f8786a;
            }
            AbstractC3292y.f(list$runtime_release);
            PersistentList<T> removeAll = list$runtime_release.removeAll((Collection<? extends T>) collection);
            z8 = false;
            if (AbstractC3292y.d(removeAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(removeAll);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z8 = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return true;
    }

    public T removeAt(int i8) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z8;
        T t8 = get(i8);
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                I i9 = I.f8786a;
            }
            AbstractC3292y.f(list$runtime_release);
            PersistentList<T> removeAt = list$runtime_release.removeAt(i8);
            if (AbstractC3292y.d(removeAt, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(removeAt);
                        z8 = true;
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return t8;
    }

    public final void removeRange(int i8, int i9) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z8;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                I i10 = I.f8786a;
            }
            AbstractC3292y.f(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i8, i9).clear();
            PersistentList<T> build = builder.build();
            if (!AbstractC3292y.d(build, list$runtime_release)) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    obj2 = SnapshotStateListKt.sync;
                    synchronized (obj2) {
                        if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateListStateRecord3.setList$runtime_release(build);
                            z8 = true;
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                            stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        } else {
                            z8 = false;
                        }
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            } else {
                return;
            }
        } while (!z8);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        return mutateBoolean(new SnapshotStateList$retainAll$1(collection));
    }

    public final int retainAllInRange$runtime_release(Collection<? extends T> collection, int i8, int i9) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z8;
        int size = size();
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                I i10 = I.f8786a;
            }
            AbstractC3292y.f(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i8, i9).retainAll(collection);
            PersistentList<T> build = builder.build();
            if (AbstractC3292y.d(build, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z8 = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return size - size();
    }

    @Override // java.util.List
    public T set(int i8, T t8) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z8;
        T t9 = get(i8);
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                I i9 = I.f8786a;
            }
            AbstractC3292y.f(list$runtime_release);
            PersistentList<T> persistentList = list$runtime_release.set(i8, (int) t8);
            if (AbstractC3292y.d(persistentList, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(persistentList);
                        z8 = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return t9;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<T> subList(int i8, int i9) {
        if (i8 >= 0 && i8 <= i9 && i9 <= size()) {
            return new SubList(this, i8, i9);
        }
        throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC3283o.a(this);
    }

    public final List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z8;
        Snapshot current;
        Object obj2;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                I i8 = I.f8786a;
            }
            AbstractC3292y.f(list$runtime_release);
            PersistentList<T> addAll = list$runtime_release.addAll(collection);
            z8 = false;
            if (AbstractC3292y.d(addAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(addAll);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z8 = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i8) {
        return new StateListIterator(this, i8);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z8;
        Snapshot current;
        Object obj3;
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                I i8 = I.f8786a;
            }
            AbstractC3292y.f(list$runtime_release);
            PersistentList<T> remove = list$runtime_release.remove((PersistentList<T>) obj);
            z8 = false;
            if (AbstractC3292y.d(remove, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj3 = SnapshotStateListKt.sync;
                synchronized (obj3) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(remove);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z8 = true;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC3283o.b(this, tArr);
    }

    @Override // java.util.List
    public void add(int i8, T t8) {
        Object obj;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z8;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                I i9 = I.f8786a;
            }
            AbstractC3292y.f(list$runtime_release);
            PersistentList<T> add = list$runtime_release.add(i8, (int) t8);
            if (AbstractC3292y.d(add, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(add);
                        z8 = true;
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange$runtime_release() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
    }
}
