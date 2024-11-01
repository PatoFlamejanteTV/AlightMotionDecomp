package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SingleElementListIterator<E> extends AbstractListIterator<E> {
    public static final int $stable = 0;
    private final E element;

    public SingleElementListIterator(E e8, int i8) {
        super(i8, 1);
        this.element = e8;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        checkHasNext$runtime_release();
        setIndex(getIndex() + 1);
        return this.element;
    }

    @Override // java.util.ListIterator
    public E previous() {
        checkHasPrevious$runtime_release();
        setIndex(getIndex() - 1);
        return this.element;
    }
}
