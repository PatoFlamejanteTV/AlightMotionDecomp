package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import d6.InterfaceC2768b;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {

    /* loaded from: classes.dex */
    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, InterfaceC2768b {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
        PersistentList<E> build();
    }

    @Override // java.util.List
    PersistentList<E> add(int i8, E e8);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> add(E e8);

    @Override // java.util.List
    PersistentList<E> addAll(int i8, Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> addAll(Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    Builder<E> builder();

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> clear();

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> remove(E e8);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> removeAll(Collection<? extends E> collection);

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> removeAll(Function1 function1);

    PersistentList<E> removeAt(int i8);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> retainAll(Collection<? extends E> collection);

    @Override // java.util.List
    PersistentList<E> set(int i8, E e8);
}
