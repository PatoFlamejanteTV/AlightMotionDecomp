package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.Z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedSetMutableIterator<E> extends PersistentOrderedSetIterator<E> implements Iterator<E>, InterfaceC2767a {
    public static final int $stable = 8;
    private final PersistentOrderedSetBuilder<E> builder;
    private int expectedModCount;
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    public PersistentOrderedSetMutableIterator(PersistentOrderedSetBuilder<E> persistentOrderedSetBuilder) {
        super(persistentOrderedSetBuilder.getFirstElement$runtime_release(), persistentOrderedSetBuilder.getHashMapBuilder$runtime_release());
        this.builder = persistentOrderedSetBuilder;
        this.expectedModCount = persistentOrderedSetBuilder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release() == this.expectedModCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if (this.nextWasInvoked) {
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public E next() {
        checkForComodification();
        E e8 = (E) super.next();
        this.lastIteratedElement = e8;
        this.nextWasInvoked = true;
        return e8;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        Z.a(this.builder).remove(this.lastIteratedElement);
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        setIndex$runtime_release(getIndex$runtime_release() - 1);
    }
}
