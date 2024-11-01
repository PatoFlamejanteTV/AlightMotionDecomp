package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import R5.AbstractC1424h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedSetBuilder<E> extends AbstractC1424h implements PersistentSet.Builder<E> {
    public static final int $stable = 8;
    private Object firstElement;
    private final PersistentHashMapBuilder<E, Links> hashMapBuilder;
    private Object lastElement;
    private PersistentOrderedSet<E> set;

    public PersistentOrderedSetBuilder(PersistentOrderedSet<E> persistentOrderedSet) {
        this.set = persistentOrderedSet;
        this.firstElement = persistentOrderedSet.getFirstElement$runtime_release();
        this.lastElement = this.set.getLastElement$runtime_release();
        this.hashMapBuilder = this.set.getHashMap$runtime_release().builder2();
    }

    @Override // R5.AbstractC1424h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e8) {
        if (this.hashMapBuilder.containsKey(e8)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = e8;
            this.lastElement = e8;
            this.hashMapBuilder.put(e8, new Links());
            return true;
        }
        Links links = this.hashMapBuilder.get(this.lastElement);
        AbstractC3292y.f(links);
        this.hashMapBuilder.put(this.lastElement, links.withNext(e8));
        this.hashMapBuilder.put(e8, new Links(this.lastElement));
        this.lastElement = e8;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstElement = endOfChain;
        this.lastElement = endOfChain;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    public final Object getFirstElement$runtime_release() {
        return this.firstElement;
    }

    public final PersistentHashMapBuilder<E, Links> getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    @Override // R5.AbstractC1424h
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Links remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return false;
        }
        if (remove.getHasPrevious()) {
            Links links = this.hashMapBuilder.get(remove.getPrevious());
            AbstractC3292y.f(links);
            this.hashMapBuilder.put(remove.getPrevious(), links.withNext(remove.getNext()));
        } else {
            this.firstElement = remove.getNext();
        }
        if (remove.getHasNext()) {
            Links links2 = this.hashMapBuilder.get(remove.getNext());
            AbstractC3292y.f(links2);
            this.hashMapBuilder.put(remove.getNext(), links2.withPrevious(remove.getPrevious()));
            return true;
        }
        this.lastElement = remove.getPrevious();
        return true;
    }

    public final void setFirstElement$runtime_release(Object obj) {
        this.firstElement = obj;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentSet<E> build() {
        PersistentOrderedSet<E> persistentOrderedSet;
        PersistentHashMap<E, Links> build2 = this.hashMapBuilder.build2();
        if (build2 == this.set.getHashMap$runtime_release()) {
            CommonFunctionsKt.m2559assert(this.firstElement == this.set.getFirstElement$runtime_release());
            CommonFunctionsKt.m2559assert(this.lastElement == this.set.getLastElement$runtime_release());
            persistentOrderedSet = this.set;
        } else {
            persistentOrderedSet = new PersistentOrderedSet<>(this.firstElement, this.lastElement, build2);
        }
        this.set = persistentOrderedSet;
        return persistentOrderedSet;
    }
}
