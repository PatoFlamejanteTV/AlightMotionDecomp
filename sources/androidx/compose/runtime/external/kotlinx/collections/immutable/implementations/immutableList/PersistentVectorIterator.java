package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import i6.m;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {
    public static final int $stable = 8;
    private final T[] tail;
    private final TrieIterator<T> trieIterator;

    public PersistentVectorIterator(Object[] objArr, T[] tArr, int i8, int i9, int i10) {
        super(i8, i9);
        this.tail = tArr;
        int rootSize = UtilsKt.rootSize(i9);
        this.trieIterator = new TrieIterator<>(objArr, m.g(i8, rootSize), rootSize, i10);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkHasNext$runtime_release();
        if (this.trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return this.trieIterator.next();
        }
        T[] tArr = this.tail;
        int index = getIndex();
        setIndex(index + 1);
        return tArr[index - this.trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkHasPrevious$runtime_release();
        if (getIndex() > this.trieIterator.getSize()) {
            T[] tArr = this.tail;
            setIndex(getIndex() - 1);
            return tArr[getIndex() - this.trieIterator.getSize()];
        }
        setIndex(getIndex() - 1);
        return this.trieIterator.previous();
    }
}
