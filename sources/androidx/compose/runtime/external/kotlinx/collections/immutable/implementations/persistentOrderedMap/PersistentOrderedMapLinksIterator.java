package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, InterfaceC2767a {
    public static final int $stable = 8;
    private final Map<K, LinkedValue<V>> hashMap;
    private int index;
    private Object nextKey;

    public PersistentOrderedMapLinksIterator(Object obj, Map<K, LinkedValue<V>> map) {
        this.nextKey = obj;
        this.hashMap = map;
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final Object getNextKey$runtime_release() {
        return this.nextKey;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.hashMap.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i8) {
        this.index = i8;
    }

    public final void setNextKey$runtime_release(Object obj) {
        this.nextKey = obj;
    }

    @Override // java.util.Iterator
    public LinkedValue<V> next() {
        if (hasNext()) {
            LinkedValue<V> linkedValue = this.hashMap.get(this.nextKey);
            if (linkedValue != null) {
                LinkedValue<V> linkedValue2 = linkedValue;
                this.index++;
                this.nextKey = linkedValue2.getNext();
                return linkedValue2;
            }
            throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
        }
        throw new NoSuchElementException();
    }
}
