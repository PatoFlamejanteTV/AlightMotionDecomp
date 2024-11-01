package androidx.compose.runtime.snapshots;

import Q5.I;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2770d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, InterfaceC2770d {
    public static final int $stable = 0;
    private StateRecord firstStateRecord = new StateMapStateRecord(ExtensionsKt.persistentHashMapOf());
    private final Set<Map.Entry<K, V>> entries = new SnapshotMapEntrySet(this);
    private final Set<K> keys = new SnapshotMapKeySet(this);
    private final Collection<V> values = new SnapshotMapValueSet(this);

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        public static final int $stable = 8;
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            Object obj;
            AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                I i8 = I.f8786a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateMapStateRecord(this.map);
        }

        public final PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setMap$runtime_release(PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        public final void setModification$runtime_release(int i8) {
            this.modification = i8;
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(Function1 function1) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        R r8;
        Snapshot current;
        Object obj2;
        boolean z8;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    I i8 = I.f8786a;
                    AbstractC3290w.b(1);
                } catch (Throwable th) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th;
                }
            }
            AbstractC3290w.a(1);
            AbstractC3292y.f(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            r8 = (R) function1.invoke(builder);
            PersistentMap<K, V> build = builder.build();
            if (AbstractC3292y.d(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj2 = SnapshotStateMapKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateMapStateRecord3.setMap$runtime_release(build);
                                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
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

    private final void update(Function1 function1) {
        Snapshot current;
        Object obj;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        PersistentMap<K, V> persistentMap = (PersistentMap) function1.invoke(stateMapStateRecord.getMap$runtime_release());
        if (persistentMap != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj = SnapshotStateMapKt.sync;
                    synchronized (obj) {
                        try {
                            stateMapStateRecord3.setMap$runtime_release(persistentMap);
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                            AbstractC3290w.b(1);
                        } catch (Throwable th) {
                            AbstractC3290w.b(1);
                            AbstractC3290w.a(1);
                            throw th;
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
        }
    }

    private final <R> R withCurrent(Function1 function1) {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (R) function1.invoke(SnapshotKt.current((StateMapStateRecord) firstStateRecord));
    }

    private final <R> R writable(Function1 function1) {
        Snapshot current;
        R r8;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) firstStateRecord;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                r8 = (R) function1.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
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

    public final boolean all$runtime_release(Function1 function1) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (!((Boolean) function1.invoke((Map.Entry) it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(Function1 function1) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (((Boolean) function1.invoke((Map.Entry) it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        Object obj;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap$runtime_release();
        PersistentMap<K, V> persistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentHashMapOf != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                obj = SnapshotStateMapKt.sync;
                synchronized (obj) {
                    stateMapStateRecord3.setMap$runtime_release(persistentHashMapOf);
                    stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                }
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().get(obj);
    }

    public final Map<K, V> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime_release();
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification$runtime_release();
    }

    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    public Collection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public /* synthetic */ StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return c.a(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC3292y.g(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (StateMapStateRecord) stateRecord;
    }

    @Override // java.util.Map
    public V put(K k8, V v8) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        V put;
        Snapshot current;
        Object obj2;
        boolean z8;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                I i8 = I.f8786a;
            }
            AbstractC3292y.f(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            put = builder.put(k8, v8);
            PersistentMap<K, V> build = builder.build();
            if (AbstractC3292y.d(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                obj2 = SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z8 = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z8;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                I i8 = I.f8786a;
            }
            AbstractC3292y.f(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            builder.putAll(map);
            PersistentMap<K, V> build = builder.build();
            if (!AbstractC3292y.d(build, map$runtime_release)) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj2 = SnapshotStateMapKt.sync;
                    synchronized (obj2) {
                        if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateMapStateRecord3.setMap$runtime_release(build);
                            z8 = true;
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
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

    @Override // java.util.Map
    public V remove(Object obj) {
        Object obj2;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        V remove;
        Snapshot current;
        Object obj3;
        boolean z8;
        do {
            obj2 = SnapshotStateMapKt.sync;
            synchronized (obj2) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                I i8 = I.f8786a;
            }
            AbstractC3292y.f(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            remove = builder.remove(obj);
            PersistentMap<K, V> build = builder.build();
            if (AbstractC3292y.d(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                obj3 = SnapshotStateMapKt.sync;
                synchronized (obj3) {
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z8 = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z8);
        return remove;
    }

    public final boolean removeIf$runtime_release(Function1 function1) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        Object obj2;
        boolean z8;
        boolean z9 = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    I i8 = I.f8786a;
                    AbstractC3290w.b(1);
                } catch (Throwable th) {
                    AbstractC3290w.b(1);
                    AbstractC3290w.a(1);
                    throw th;
                }
            }
            AbstractC3290w.a(1);
            AbstractC3292y.f(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (((Boolean) function1.invoke(entry)).booleanValue()) {
                    builder.remove(entry.getKey());
                    z9 = true;
                }
            }
            I i9 = I.f8786a;
            PersistentMap<K, V> build = builder.build();
            if (AbstractC3292y.d(build, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    obj2 = SnapshotStateMapKt.sync;
                    synchronized (obj2) {
                        try {
                            if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateMapStateRecord3.setMap$runtime_release(build);
                                stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
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
        return z9;
    }

    public final boolean removeValue$runtime_release(V v8) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3292y.d(((Map.Entry) obj).getValue(), v8)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final Map<K, V> toMap() {
        return getReadable$runtime_release().getMap$runtime_release();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
