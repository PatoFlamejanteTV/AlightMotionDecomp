package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import R5.AbstractC1428l;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.Z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, InterfaceC2767a {
    public static final int $stable = 8;
    private final PersistentHashSetBuilder<E> builder;
    private int expectedModCount;
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    public PersistentHashSetMutableIterator(PersistentHashSetBuilder<E> persistentHashSetBuilder) {
        super(persistentHashSetBuilder.getNode$runtime_release());
        this.builder = persistentHashSetBuilder;
        this.expectedModCount = persistentHashSetBuilder.getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.builder.getModCount$runtime_release() == this.expectedModCount) {
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

    private final boolean isCollision(TrieNode<?> trieNode) {
        if (trieNode.getBitmap() == 0) {
            return true;
        }
        return false;
    }

    private final void resetPath(int i8, TrieNode<?> trieNode, E e8, int i9) {
        boolean z8 = true;
        if (isCollision(trieNode)) {
            int p02 = AbstractC1428l.p0(trieNode.getBuffer(), e8);
            if (p02 == -1) {
                z8 = false;
            }
            CommonFunctionsKt.m2559assert(z8);
            getPath().get(i9).reset(trieNode.getBuffer(), p02);
            setPathLastIndex(i9);
            return;
        }
        int indexOfCellAt$runtime_release = trieNode.indexOfCellAt$runtime_release(1 << TrieNodeKt.indexSegment(i8, i9 * 5));
        getPath().get(i9).reset(trieNode.getBuffer(), indexOfCellAt$runtime_release);
        Object obj = trieNode.getBuffer()[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            resetPath(i8, (TrieNode) obj, e8, i9 + 1);
        } else {
            setPathLastIndex(i9);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public E next() {
        checkForComodification();
        E e8 = (E) super.next();
        this.lastIteratedElement = e8;
        this.nextWasInvoked = true;
        return e8;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public void remove() {
        int i8;
        checkNextWasInvoked();
        if (hasNext()) {
            E currentElement = currentElement();
            PersistentHashSetBuilder<E> persistentHashSetBuilder = this.builder;
            Z.a(persistentHashSetBuilder).remove(this.lastIteratedElement);
            if (currentElement != null) {
                i8 = currentElement.hashCode();
            } else {
                i8 = 0;
            }
            resetPath(i8, this.builder.getNode$runtime_release(), currentElement, 0);
        } else {
            PersistentHashSetBuilder<E> persistentHashSetBuilder2 = this.builder;
            Z.a(persistentHashSetBuilder2).remove(this.lastIteratedElement);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }
}
