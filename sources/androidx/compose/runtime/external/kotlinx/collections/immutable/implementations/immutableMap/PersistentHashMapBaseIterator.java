package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.NoSuchElementException;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, InterfaceC2767a {
    public static final int $stable = 8;
    private boolean hasNext = true;
    private final TrieNodeBaseIterator<K, V, T>[] path;
    private int pathLastIndex;

    public PersistentHashMapBaseIterator(TrieNode<K, V> trieNode, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        this.path = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2);
        this.pathLastIndex = 0;
        ensureNextEntryIsReady();
    }

    private final void checkHasNext() {
        if (hasNext()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    private final void ensureNextEntryIsReady() {
        if (this.path[this.pathLastIndex].hasNextKey()) {
            return;
        }
        for (int i8 = this.pathLastIndex; -1 < i8; i8--) {
            int moveToNextNodeWithData = moveToNextNodeWithData(i8);
            if (moveToNextNodeWithData == -1 && this.path[i8].hasNextNode()) {
                this.path[i8].moveToNextNode();
                moveToNextNodeWithData = moveToNextNodeWithData(i8);
            }
            if (moveToNextNodeWithData != -1) {
                this.pathLastIndex = moveToNextNodeWithData;
                return;
            }
            if (i8 > 0) {
                this.path[i8 - 1].moveToNextNode();
            }
            this.path[i8].reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release(), 0);
        }
        this.hasNext = false;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }

    private final int moveToNextNodeWithData(int i8) {
        if (this.path[i8].hasNextKey()) {
            return i8;
        }
        if (this.path[i8].hasNextNode()) {
            TrieNode<? extends K, ? extends V> currentNode = this.path[i8].currentNode();
            if (i8 == 6) {
                this.path[i8 + 1].reset(currentNode.getBuffer$runtime_release(), currentNode.getBuffer$runtime_release().length);
            } else {
                this.path[i8 + 1].reset(currentNode.getBuffer$runtime_release(), currentNode.entryCount$runtime_release() * 2);
            }
            return moveToNextNodeWithData(i8 + 1);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final K currentKey() {
        checkHasNext();
        return this.path[this.pathLastIndex].currentKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final TrieNodeBaseIterator<K, V, T>[] getPath() {
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
    public T next() {
        checkHasNext();
        T next = this.path[this.pathLastIndex].next();
        ensureNextEntryIsReady();
        return next;
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
