package androidx.compose.runtime.snapshots;

import Q5.C1413h;
import Q5.I;
import R5.AbstractC1435t;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class SnapshotMapKeySet<K, V> extends SnapshotMapSet<K, V, K> {
    public SnapshotMapKeySet(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((SnapshotMapKeySet<K, V>) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!getMap().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        if (getMap().remove(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z8 = false;
            while (it.hasNext()) {
                if (getMap().remove(it.next()) != null || z8) {
                    z8 = true;
                }
            }
            return z8;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        boolean z8;
        Snapshot current;
        Object obj2;
        Set b12 = AbstractC1435t.b1(collection);
        SnapshotStateMap<K, V> map = getMap();
        boolean z9 = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateRecord firstStateRecord = map.getFirstStateRecord();
                AbstractC3292y.g(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                I i8 = I.f8786a;
            }
            AbstractC3292y.f(map$runtime_release);
            PersistentMap.Builder<K, V> builder2 = map$runtime_release.builder2();
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            while (true) {
                z8 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (!b12.contains(next.getKey())) {
                    builder2.remove(next.getKey());
                    z9 = true;
                }
            }
            I i9 = I.f8786a;
            PersistentMap<K, V> build2 = builder2.build2();
            if (AbstractC3292y.d(build2, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = map.getFirstStateRecord();
            AbstractC3292y.g(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current);
                obj2 = SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build2);
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z8 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, map);
        } while (!z8);
        return z9;
    }

    @Override // java.util.Set, java.util.Collection
    public Void add(K k8) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }

    @Override // java.util.Set, java.util.Collection
    public Void addAll(Collection<? extends K> collection) {
        SnapshotStateMapKt.unsupported();
        throw new C1413h();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public StateMapMutableKeysIterator<K, V> iterator() {
        return new StateMapMutableKeysIterator<>(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }
}
