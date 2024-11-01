package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TrieNodeIterator<E> {
    public static final int $stable = 8;
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer();
    private int index;

    public static /* synthetic */ void reset$default(TrieNodeIterator trieNodeIterator, Object[] objArr, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        trieNodeIterator.reset(objArr, i8);
    }

    public final E currentElement() {
        CommonFunctionsKt.m2559assert(hasNextElement());
        return (E) this.buffer[this.index];
    }

    public final TrieNode<? extends E> currentNode() {
        CommonFunctionsKt.m2559assert(hasNextNode());
        Object obj = this.buffer[this.index];
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode) obj;
    }

    public final boolean hasNextCell() {
        if (this.index < this.buffer.length) {
            return true;
        }
        return false;
    }

    public final boolean hasNextElement() {
        if (hasNextCell() && !(this.buffer[this.index] instanceof TrieNode)) {
            return true;
        }
        return false;
    }

    public final boolean hasNextNode() {
        if (hasNextCell() && (this.buffer[this.index] instanceof TrieNode)) {
            return true;
        }
        return false;
    }

    public final void moveToNextCell() {
        CommonFunctionsKt.m2559assert(hasNextCell());
        this.index++;
    }

    public final E nextElement() {
        CommonFunctionsKt.m2559assert(hasNextElement());
        Object[] objArr = this.buffer;
        int i8 = this.index;
        this.index = i8 + 1;
        return (E) objArr[i8];
    }

    public final void reset(Object[] objArr, int i8) {
        this.buffer = objArr;
        this.index = i8;
    }
}
