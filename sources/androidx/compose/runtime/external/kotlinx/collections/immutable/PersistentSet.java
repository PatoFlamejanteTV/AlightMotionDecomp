package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import d6.InterfaceC2771e;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {

    /* loaded from: classes.dex */
    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, InterfaceC2771e {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
        PersistentSet<E> build();
    }

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> add(E e8);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> addAll(Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    Builder<E> builder();

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> clear();

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> remove(E e8);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> removeAll(Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> removeAll(Function1 function1);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> retainAll(Collection<? extends E> collection);
}
