package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import R5.AbstractC1419c;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public abstract class AbstractPersistentList<E> extends AbstractC1419c implements PersistentList<E> {
    public static final int $stable = 0;

    @Override // R5.AbstractC1417a, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // R5.AbstractC1417a, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // R5.AbstractC1419c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // R5.AbstractC1419c, java.util.List
    public ListIterator<E> listIterator() {
        return (ListIterator<E>) listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((AbstractPersistentList<E>) obj);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> addAll(Collection<? extends E> collection) {
        PersistentList.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> clear() {
        return UtilsKt.persistentVectorOf();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> remove(E e8) {
        int indexOf = indexOf(e8);
        return indexOf != -1 ? removeAt(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(Collection<? extends E> collection) {
        return removeAll((Function1) new AbstractPersistentList$removeAll$1(collection));
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> retainAll(Collection<? extends E> collection) {
        return removeAll((Function1) new AbstractPersistentList$retainAll$1(collection));
    }

    @Override // R5.AbstractC1419c, java.util.List
    public ImmutableList<E> subList(int i8, int i9) {
        return a.a(this, i8, i9);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(int i8, Collection<? extends E> collection) {
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i8, collection);
        return builder.build();
    }
}
