package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class AbstractListIterator<E> implements ListIterator<E>, InterfaceC2767a {
    public static final int $stable = 8;
    private int index;
    private int size;

    public AbstractListIterator(int i8, int i9) {
        this.index = i8;
        this.size = i9;
    }

    @Override // java.util.ListIterator
    public void add(E e8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void checkHasNext$runtime_release() {
        if (hasNext()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void checkHasPrevious$runtime_release() {
        if (hasPrevious()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.size) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.index > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i8) {
        this.index = i8;
    }

    public final void setSize(int i8) {
        this.size = i8;
    }
}
