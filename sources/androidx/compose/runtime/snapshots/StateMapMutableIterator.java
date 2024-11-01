package androidx.compose.runtime.snapshots;

import Q5.I;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
abstract class StateMapMutableIterator<K, V> {
    private Map.Entry<? extends K, ? extends V> current;
    private final Iterator<Map.Entry<K, V>> iterator;
    private final SnapshotStateMap<K, V> map;
    private int modification;
    private Map.Entry<? extends K, ? extends V> next;

    /* JADX WARN: Multi-variable type inference failed */
    public StateMapMutableIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.map = snapshotStateMap;
        this.iterator = it;
        this.modification = snapshotStateMap.getModification$runtime_release();
        advance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void advance() {
        Map.Entry<K, V> entry;
        this.current = this.next;
        if (this.iterator.hasNext()) {
            entry = this.iterator.next();
        } else {
            entry = null;
        }
        this.next = entry;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map.Entry<K, V> getCurrent() {
        return this.current;
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    protected final int getModification() {
        return this.modification;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map.Entry<K, V> getNext() {
        return this.next;
    }

    public final boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    protected final <T> T modify(Function0 function0) {
        if (getMap().getModification$runtime_release() == this.modification) {
            T t8 = (T) function0.invoke();
            this.modification = getMap().getModification$runtime_release();
            return t8;
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        if (getMap().getModification$runtime_release() == this.modification) {
            Map.Entry<? extends K, ? extends V> entry = this.current;
            if (entry != null) {
                this.map.remove(entry.getKey());
                this.current = null;
                I i8 = I.f8786a;
                this.modification = getMap().getModification$runtime_release();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    protected final void setCurrent(Map.Entry<? extends K, ? extends V> entry) {
        this.current = entry;
    }

    protected final void setModification(int i8) {
        this.modification = i8;
    }

    protected final void setNext(Map.Entry<? extends K, ? extends V> entry) {
        this.next = entry;
    }
}
