package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, InterfaceC2767a {
    public static final int $stable = 8;
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release();
    private int dataSize;
    private int index;

    public final K currentKey() {
        CommonFunctionsKt.m2559assert(hasNextKey());
        return (K) this.buffer[this.index];
    }

    public final TrieNode<? extends K, ? extends V> currentNode() {
        CommonFunctionsKt.m2559assert(hasNextNode());
        Object obj = this.buffer[this.index];
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }

    public final boolean hasNextKey() {
        if (this.index < this.dataSize) {
            return true;
        }
        return false;
    }

    public final boolean hasNextNode() {
        boolean z8;
        if (this.index >= this.dataSize) {
            z8 = true;
        } else {
            z8 = false;
        }
        CommonFunctionsKt.m2559assert(z8);
        if (this.index >= this.buffer.length) {
            return false;
        }
        return true;
    }

    public final void moveToNextKey() {
        CommonFunctionsKt.m2559assert(hasNextKey());
        this.index += 2;
    }

    public final void moveToNextNode() {
        CommonFunctionsKt.m2559assert(hasNextNode());
        this.index++;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(Object[] objArr, int i8, int i9) {
        this.buffer = objArr;
        this.dataSize = i8;
        this.index = i9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIndex(int i8) {
        this.index = i8;
    }

    public final void reset(Object[] objArr, int i8) {
        reset(objArr, i8, 0);
    }
}
