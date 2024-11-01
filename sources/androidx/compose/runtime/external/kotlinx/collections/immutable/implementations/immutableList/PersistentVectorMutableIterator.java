package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import i6.m;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T>, InterfaceC2767a {
    public static final int $stable = 8;
    private final PersistentVectorBuilder<T> builder;
    private int expectedModCount;
    private int lastIteratedIndex;
    private TrieIterator<? extends T> trieIterator;

    public PersistentVectorMutableIterator(PersistentVectorBuilder<T> persistentVectorBuilder, int i8) {
        super(i8, persistentVectorBuilder.size());
        this.builder = persistentVectorBuilder;
        this.expectedModCount = persistentVectorBuilder.getModCount$runtime_release();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    private final void checkForComodification() {
        if (this.expectedModCount == this.builder.getModCount$runtime_release()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkHasIterated() {
        if (this.lastIteratedIndex != -1) {
        } else {
            throw new IllegalStateException();
        }
    }

    private final void reset() {
        setSize(this.builder.size());
        this.expectedModCount = this.builder.getModCount$runtime_release();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    private final void setupTrieIterator() {
        Object[] root$runtime_release = this.builder.getRoot$runtime_release();
        if (root$runtime_release == null) {
            this.trieIterator = null;
            return;
        }
        int rootSize = UtilsKt.rootSize(this.builder.size());
        int g8 = m.g(getIndex(), rootSize);
        int rootShift$runtime_release = (this.builder.getRootShift$runtime_release() / 5) + 1;
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            this.trieIterator = new TrieIterator<>(root$runtime_release, g8, rootSize, rootShift$runtime_release);
        } else {
            AbstractC3292y.f(trieIterator);
            trieIterator.reset$runtime_release(root$runtime_release, g8, rootSize, rootShift$runtime_release);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void add(T t8) {
        checkForComodification();
        this.builder.add(getIndex(), t8);
        setIndex(getIndex() + 1);
        reset();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        checkHasNext$runtime_release();
        this.lastIteratedIndex = getIndex();
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            Object[] tail$runtime_release = this.builder.getTail$runtime_release();
            int index = getIndex();
            setIndex(index + 1);
            return (T) tail$runtime_release[index];
        }
        if (trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return trieIterator.next();
        }
        Object[] tail$runtime_release2 = this.builder.getTail$runtime_release();
        int index2 = getIndex();
        setIndex(index2 + 1);
        return (T) tail$runtime_release2[index2 - trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkForComodification();
        checkHasPrevious$runtime_release();
        this.lastIteratedIndex = getIndex() - 1;
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            Object[] tail$runtime_release = this.builder.getTail$runtime_release();
            setIndex(getIndex() - 1);
            return (T) tail$runtime_release[getIndex()];
        }
        if (getIndex() > trieIterator.getSize()) {
            Object[] tail$runtime_release2 = this.builder.getTail$runtime_release();
            setIndex(getIndex() - 1);
            return (T) tail$runtime_release2[getIndex() - trieIterator.getSize()];
        }
        setIndex(getIndex() - 1);
        return trieIterator.previous();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public void remove() {
        checkForComodification();
        checkHasIterated();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            setIndex(this.lastIteratedIndex);
        }
        reset();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void set(T t8) {
        checkForComodification();
        checkHasIterated();
        this.builder.set(this.lastIteratedIndex, t8);
        this.expectedModCount = this.builder.getModCount$runtime_release();
        setupTrieIterator();
    }
}
