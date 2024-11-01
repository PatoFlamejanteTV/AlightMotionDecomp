package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import R5.AbstractC1425i;
import R5.AbstractC1435t;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashSet<E> extends AbstractC1425i implements PersistentSet<E> {
    private final TrieNode<E> node;
    private final int size;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PersistentHashSet EMPTY = new PersistentHashSet(TrieNode.Companion.getEMPTY$runtime_release(), 0);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final <E> PersistentSet<E> emptyOf$runtime_release() {
            return PersistentHashSet.EMPTY;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public PersistentHashSet(TrieNode<E> trieNode, int i8) {
        this.node = trieNode;
        this.size = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentHashSet<E>) obj);
    }

    @Override // R5.AbstractC1417a, java.util.Collection
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

    @Override // R5.AbstractC1417a, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        if (collection instanceof PersistentHashSet) {
            return this.node.containsAll(((PersistentHashSet) collection).node, 0);
        }
        if (collection instanceof PersistentHashSetBuilder) {
            return this.node.containsAll(((PersistentHashSetBuilder) collection).getNode$runtime_release(), 0);
        }
        return super.containsAll(collection);
    }

    public final TrieNode<E> getNode$runtime_release() {
        return this.node;
    }

    @Override // R5.AbstractC1417a
    public int getSize() {
        return this.size;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new PersistentHashSetIterator(this.node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((PersistentHashSet<E>) obj);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> add(E e8) {
        TrieNode<E> add = this.node.add(e8 != null ? e8.hashCode() : 0, e8, 0);
        return this.node == add ? this : new PersistentHashSet(add, size() + 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> addAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet.Builder<E> builder() {
        return new PersistentHashSetBuilder(this);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> clear() {
        return Companion.emptyOf$runtime_release();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> remove(E e8) {
        TrieNode<E> remove = this.node.remove(e8 != null ? e8.hashCode() : 0, e8, 0);
        return this.node == remove ? this : new PersistentHashSet(remove, size() - 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> retainAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.retainAll(collection);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> removeAll(Collection<? extends E> collection) {
        PersistentSet.Builder<E> builder = builder();
        builder.removeAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> removeAll(Function1 function1) {
        PersistentSet.Builder<E> builder = builder();
        AbstractC1435t.I(builder, function1);
        return builder.build();
    }
}
