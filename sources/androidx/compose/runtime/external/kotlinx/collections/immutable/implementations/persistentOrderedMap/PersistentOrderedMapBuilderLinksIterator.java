package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, InterfaceC2767a {
    public static final int $stable = 8;
    private final PersistentOrderedMapBuilder<K, V> builder;
    private int expectedModCount;
    private int index;
    private Object lastIteratedKey = EndOfChain.INSTANCE;
    private Object nextKey;
    private boolean nextWasInvoked;

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.nextKey = obj;
        this.builder = persistentOrderedMapBuilder;
        this.expectedModCount = persistentOrderedMapBuilder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if (this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release() == this.expectedModCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkHasNext() {
        if (hasNext()) {
        } else {
            throw new NoSuchElementException();
        }
    }

    private final void checkNextWasInvoked() {
        if (this.nextWasInvoked) {
        } else {
            throw new IllegalStateException();
        }
    }

    public final PersistentOrderedMapBuilder<K, V> getBuilder$runtime_release() {
        return this.builder;
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final Object getLastIteratedKey$runtime_release() {
        return this.lastIteratedKey;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.builder.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        Z.c(this.builder).remove(this.lastIteratedKey);
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        this.index--;
    }

    public final void setIndex$runtime_release(int i8) {
        this.index = i8;
    }

    public final void setLastIteratedKey$runtime_release(Object obj) {
        this.lastIteratedKey = obj;
    }

    @Override // java.util.Iterator
    public LinkedValue<V> next() {
        checkForComodification();
        checkHasNext();
        this.lastIteratedKey = this.nextKey;
        this.nextWasInvoked = true;
        this.index++;
        LinkedValue<V> linkedValue = this.builder.getHashMapBuilder$runtime_release().get(this.nextKey);
        if (linkedValue != null) {
            LinkedValue<V> linkedValue2 = linkedValue;
            this.nextKey = linkedValue2.getNext();
            return linkedValue2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
    }
}
