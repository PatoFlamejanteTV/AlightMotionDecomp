package androidx.compose.runtime.external.kotlinx.collections.immutable;

import d6.InterfaceC2768b;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    /* loaded from: classes.dex */
    public interface Builder<E> extends Collection<E>, InterfaceC2768b {
        PersistentCollection<E> build();
    }

    @Override // java.util.Collection
    PersistentCollection<E> add(E e8);

    @Override // java.util.Collection
    PersistentCollection<E> addAll(Collection<? extends E> collection);

    Builder<E> builder();

    @Override // java.util.Collection
    PersistentCollection<E> clear();

    @Override // java.util.Collection
    PersistentCollection<E> remove(E e8);

    @Override // java.util.Collection
    PersistentCollection<E> removeAll(Collection<? extends E> collection);

    PersistentCollection<E> removeAll(Function1 function1);

    @Override // java.util.Collection
    PersistentCollection<E> retainAll(Collection<? extends E> collection);
}
