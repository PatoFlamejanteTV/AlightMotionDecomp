package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import R5.AbstractC1435t;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, InterfaceC2767a {
    public static final int $stable = 8;
    private boolean hasNext;
    private final List<TrieNodeIterator<E>> path;
    private int pathLastIndex;

    public PersistentHashSetIterator(TrieNode<E> trieNode) {
        List<TrieNodeIterator<E>> s8 = AbstractC1435t.s(new TrieNodeIterator());
        this.path = s8;
        this.hasNext = true;
        TrieNodeIterator.reset$default(s8.get(0), trieNode.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        ensureNextElementIsReady();
    }

    private final void ensureNextElementIsReady() {
        if (this.path.get(this.pathLastIndex).hasNextElement()) {
            return;
        }
        for (int i8 = this.pathLastIndex; -1 < i8; i8--) {
            int moveToNextNodeWithData = moveToNextNodeWithData(i8);
            if (moveToNextNodeWithData == -1 && this.path.get(i8).hasNextCell()) {
                this.path.get(i8).moveToNextCell();
                moveToNextNodeWithData = moveToNextNodeWithData(i8);
            }
            if (moveToNextNodeWithData != -1) {
                this.pathLastIndex = moveToNextNodeWithData;
                return;
            }
            if (i8 > 0) {
                this.path.get(i8 - 1).moveToNextCell();
            }
            this.path.get(i8).reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }

    private final int moveToNextNodeWithData(int i8) {
        if (this.path.get(i8).hasNextElement()) {
            return i8;
        }
        if (this.path.get(i8).hasNextNode()) {
            TrieNode<? extends E> currentNode = this.path.get(i8).currentNode();
            int i9 = i8 + 1;
            if (i9 == this.path.size()) {
                this.path.add(new TrieNodeIterator<>());
            }
            TrieNodeIterator.reset$default(this.path.get(i9), currentNode.getBuffer(), 0, 2, null);
            return moveToNextNodeWithData(i9);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final E currentElement() {
        CommonFunctionsKt.m2559assert(hasNext());
        return this.path.get(this.pathLastIndex).currentElement();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<TrieNodeIterator<E>> getPath() {
        return this.path;
    }

    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        if (this.hasNext) {
            E nextElement = this.path.get(this.pathLastIndex).nextElement();
            ensureNextElementIsReady();
            return nextElement;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setPathLastIndex(int i8) {
        this.pathLastIndex = i8;
    }
}
