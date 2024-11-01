package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, InterfaceC2767a {
    public static final int $stable = 8;
    private final PersistentHashMapBuilder<K, V> builder;
    private int expectedModCount;
    private K lastIteratedKey;
    private boolean nextWasInvoked;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder, TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.getNode$runtime_release(), trieNodeBaseIteratorArr);
        this.builder = persistentHashMapBuilder;
        this.expectedModCount = persistentHashMapBuilder.getModCount$runtime_release();
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

    private final void resetPath(int i8, TrieNode<?, ?> trieNode, K k8, int i9) {
        int i10 = i9 * 5;
        if (i10 > 30) {
            getPath()[i9].reset(trieNode.getBuffer$runtime_release(), trieNode.getBuffer$runtime_release().length, 0);
            while (!AbstractC3292y.d(getPath()[i9].currentKey(), k8)) {
                getPath()[i9].moveToNextKey();
            }
            setPathLastIndex(i9);
            return;
        }
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i10);
        if (trieNode.hasEntryAt$runtime_release(indexSegment)) {
            getPath()[i9].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, trieNode.entryKeyIndex$runtime_release(indexSegment));
            setPathLastIndex(i9);
        } else {
            int nodeIndex$runtime_release = trieNode.nodeIndex$runtime_release(indexSegment);
            TrieNode<?, ?> nodeAtIndex$runtime_release = trieNode.nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            getPath()[i9].reset(trieNode.getBuffer$runtime_release(), trieNode.entryCount$runtime_release() * 2, nodeIndex$runtime_release);
            resetPath(i8, nodeAtIndex$runtime_release, k8, i9 + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        this.lastIteratedKey = currentKey();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public void remove() {
        int i8;
        checkNextWasInvoked();
        if (hasNext()) {
            K currentKey = currentKey();
            PersistentHashMapBuilder<K, V> persistentHashMapBuilder = this.builder;
            Z.c(persistentHashMapBuilder).remove(this.lastIteratedKey);
            if (currentKey != null) {
                i8 = currentKey.hashCode();
            } else {
                i8 = 0;
            }
            resetPath(i8, this.builder.getNode$runtime_release(), currentKey, 0);
        } else {
            PersistentHashMapBuilder<K, V> persistentHashMapBuilder2 = this.builder;
            Z.c(persistentHashMapBuilder2).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }

    public final void setValue(K k8, V v8) {
        int i8;
        if (!this.builder.containsKey(k8)) {
            return;
        }
        if (hasNext()) {
            K currentKey = currentKey();
            this.builder.put(k8, v8);
            if (currentKey != null) {
                i8 = currentKey.hashCode();
            } else {
                i8 = 0;
            }
            resetPath(i8, this.builder.getNode$runtime_release(), currentKey, 0);
        } else {
            this.builder.put(k8, v8);
        }
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }
}
