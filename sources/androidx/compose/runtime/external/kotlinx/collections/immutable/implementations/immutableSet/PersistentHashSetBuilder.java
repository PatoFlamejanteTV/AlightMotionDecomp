package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import R5.AbstractC1424h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashSetBuilder<E> extends AbstractC1424h implements PersistentSet.Builder<E> {
    public static final int $stable = 8;
    private int modCount;
    private TrieNode<E> node;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private PersistentHashSet<E> set;
    private int size;

    public PersistentHashSetBuilder(PersistentHashSet<E> persistentHashSet) {
        this.set = persistentHashSet;
        this.node = this.set.getNode$runtime_release();
        this.size = this.set.size();
    }

    @Override // R5.AbstractC1424h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e8) {
        int i8;
        int size = size();
        TrieNode<E> trieNode = this.node;
        if (e8 != null) {
            i8 = e8.hashCode();
        } else {
            i8 = 0;
        }
        this.node = trieNode.mutableAdd(i8, e8, 0, this);
        if (size == size()) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        PersistentHashSet<E> persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.build();
            } else {
                persistentHashSet = null;
            }
        }
        if (persistentHashSet != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            TrieNode<E> mutableAddAll = this.node.mutableAddAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
            int size2 = (collection.size() + size) - deltaCounter.getCount();
            if (size != size2) {
                this.node = mutableAddAll;
                setSize(size2);
            }
            if (size == size()) {
                return false;
            }
            return true;
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        TrieNode<E> eMPTY$runtime_release = TrieNode.Companion.getEMPTY$runtime_release();
        AbstractC3292y.g(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.node = eMPTY$runtime_release;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i8;
        TrieNode<E> trieNode = this.node;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        return trieNode.contains(i8, obj, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        if (collection instanceof PersistentHashSet) {
            return this.node.containsAll(((PersistentHashSet) collection).getNode$runtime_release(), 0);
        }
        if (collection instanceof PersistentHashSetBuilder) {
            return this.node.containsAll(((PersistentHashSetBuilder) collection).node, 0);
        }
        return super.containsAll(collection);
    }

    public final int getModCount$runtime_release() {
        return this.modCount;
    }

    public final TrieNode<E> getNode$runtime_release() {
        return this.node;
    }

    public final MutabilityOwnership getOwnership$runtime_release() {
        return this.ownership;
    }

    @Override // R5.AbstractC1424h
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i8;
        int size = size();
        TrieNode<E> trieNode = this.node;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        this.node = trieNode.mutableRemove(i8, obj, 0, this);
        if (size == size()) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        PersistentHashSet<E> persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.build();
            } else {
                persistentHashSet = null;
            }
        }
        if (persistentHashSet != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            Object mutableRemoveAll = this.node.mutableRemoveAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
            int count = size - deltaCounter.getCount();
            if (count == 0) {
                clear();
            } else if (count != size) {
                AbstractC3292y.g(mutableRemoveAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                this.node = (TrieNode) mutableRemoveAll;
                setSize(count);
            }
            if (size == size()) {
                return false;
            }
            return true;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        PersistentHashSet<E> persistentHashSet;
        PersistentHashSetBuilder persistentHashSetBuilder;
        if (collection instanceof PersistentHashSet) {
            persistentHashSet = (PersistentHashSet) collection;
        } else {
            persistentHashSet = null;
        }
        if (persistentHashSet == null) {
            if (collection instanceof PersistentHashSetBuilder) {
                persistentHashSetBuilder = (PersistentHashSetBuilder) collection;
            } else {
                persistentHashSetBuilder = null;
            }
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.build();
            } else {
                persistentHashSet = null;
            }
        }
        if (persistentHashSet != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            Object mutableRetainAll = this.node.mutableRetainAll(persistentHashSet.getNode$runtime_release(), 0, deltaCounter, this);
            int count = deltaCounter.getCount();
            if (count == 0) {
                clear();
            } else if (count != size) {
                AbstractC3292y.g(mutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                this.node = (TrieNode) mutableRetainAll;
                setSize(count);
            }
            if (size == size()) {
                return false;
            }
            return true;
        }
        return super.retainAll(collection);
    }

    public void setSize(int i8) {
        this.size = i8;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentHashSet<E> build() {
        PersistentHashSet<E> persistentHashSet;
        if (this.node == this.set.getNode$runtime_release()) {
            persistentHashSet = this.set;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashSet = new PersistentHashSet<>(this.node, size());
        }
        this.set = persistentHashSet;
        return persistentHashSet;
    }
}
