package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class PersistentOrderedSetIterator<E> implements Iterator<E>, InterfaceC2767a {
    public static final int $stable = 8;
    private int index;
    private final Map<E, Links> map;
    private Object nextElement;

    public PersistentOrderedSetIterator(Object obj, Map<E, Links> map) {
        this.nextElement = obj;
        this.map = map;
    }

    private final void checkHasNext() {
        if (hasNext()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final Map<E, Links> getMap$runtime_release() {
        return this.map;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.map.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() {
        checkHasNext();
        E e8 = (E) this.nextElement;
        this.index++;
        Links links = this.map.get(e8);
        if (links != null) {
            this.nextElement = links.getNext();
            return e8;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e8 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex$runtime_release(int i8) {
        this.index = i8;
    }
}
