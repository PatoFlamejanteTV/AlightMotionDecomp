package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import j$.util.Set;
import j$.util.Spliterator;
import java.util.Spliterator;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public final class ImmutableSetAdapter<E> extends ImmutableCollectionAdapter<E> implements ImmutableSet<E>, Set {
    public static final int $stable = 0;

    public ImmutableSetAdapter(java.util.Set<? extends E> set) {
        super(set);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableCollectionAdapter, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableCollectionAdapter, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return Set.CC.$default$spliterator(this);
    }
}
