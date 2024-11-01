package androidx.collection;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, InterfaceC2767a {
    private boolean canRemove;
    private int index;
    private int size;

    public IndexBasedArrayIterator(int i8) {
        this.size = i8;
    }

    protected abstract T elementAt(int i8);

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.size) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            T elementAt = elementAt(this.index);
            this.index++;
            this.canRemove = true;
            return elementAt;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.canRemove) {
            int i8 = this.index - 1;
            this.index = i8;
            removeAt(i8);
            this.size--;
            this.canRemove = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.".toString());
    }

    protected abstract void removeAt(int i8);
}
