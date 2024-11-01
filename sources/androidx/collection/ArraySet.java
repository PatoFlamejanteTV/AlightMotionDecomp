package androidx.collection;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.collection.internal.ContainerHelpersKt;
import d6.InterfaceC2768b;
import d6.InterfaceC2771e;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3274f;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E>, InterfaceC2768b, InterfaceC2771e {
    private int _size;
    private Object[] array;
    private int[] hashes;

    /* loaded from: classes.dex */
    private final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected E elementAt(int i8) {
            return ArraySet.this.valueAt(i8);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i8) {
            ArraySet.this.removeAt(i8);
        }
    }

    public ArraySet() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e8) {
        int i8;
        int indexOf;
        int i9 = get_size$collection();
        boolean z8 = false;
        if (e8 == null) {
            indexOf = ArraySetKt.indexOfNull(this);
            i8 = 0;
        } else {
            int hashCode = e8.hashCode();
            i8 = hashCode;
            indexOf = ArraySetKt.indexOf(this, e8, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i10 = ~indexOf;
        if (i9 >= getHashes$collection().length) {
            int i11 = 8;
            if (i9 >= 8) {
                i11 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i11 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i11);
            if (i9 == get_size$collection()) {
                if (getHashes$collection().length == 0) {
                    z8 = true;
                }
                if (!z8) {
                    AbstractC1428l.l(hashes$collection, getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                    AbstractC1428l.n(array$collection, getArray$collection(), 0, 0, array$collection.length, 6, null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i9) {
            int i12 = i10 + 1;
            AbstractC1428l.g(getHashes$collection(), getHashes$collection(), i12, i10, i9);
            AbstractC1428l.i(getArray$collection(), getArray$collection(), i12, i10, i9);
        }
        if (i9 == get_size$collection() && i10 < getHashes$collection().length) {
            getHashes$collection()[i10] = i8;
            getArray$collection()[i10] = e8;
            set_size$collection(get_size$collection() + 1);
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public final void addAll(ArraySet<? extends E> array) {
        AbstractC3292y.i(array, "array");
        int i8 = array.get_size$collection();
        ensureCapacity(get_size$collection() + i8);
        if (get_size$collection() != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                add(array.valueAt(i9));
            }
            return;
        }
        if (i8 > 0) {
            AbstractC1428l.l(array.getHashes$collection(), getHashes$collection(), 0, 0, i8, 6, null);
            AbstractC1428l.n(array.getArray$collection(), getArray$collection(), 0, 0, i8, 6, null);
            if (get_size$collection() == 0) {
                set_size$collection(i8);
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void ensureCapacity(int i8) {
        int i9 = get_size$collection();
        if (getHashes$collection().length < i8) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i8);
            if (get_size$collection() > 0) {
                AbstractC1428l.l(hashes$collection, getHashes$collection(), 0, 0, get_size$collection(), 6, null);
                AbstractC1428l.n(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6, null);
            }
        }
        if (get_size$collection() == i9) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int i8 = get_size$collection();
                for (int i9 = 0; i9 < i8; i9++) {
                    if (((Set) obj).contains(valueAt(i9))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final Object[] getArray$collection() {
        return this.array;
    }

    public final int[] getHashes$collection() {
        return this.hashes;
    }

    public int getSize() {
        return this._size;
    }

    public final int get_size$collection() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$collection = getHashes$collection();
        int i8 = get_size$collection();
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += hashes$collection[i10];
        }
        return i9;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return ArraySetKt.indexOfNull(this);
        }
        return ArraySetKt.indexOf(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (get_size$collection() <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(ArraySet<? extends E> array) {
        AbstractC3292y.i(array, "array");
        int i8 = array.get_size$collection();
        int i9 = get_size$collection();
        for (int i10 = 0; i10 < i8; i10++) {
            remove(array.valueAt(i10));
        }
        return i9 != get_size$collection();
    }

    public final E removeAt(int i8) {
        int i9 = get_size$collection();
        E e8 = (E) getArray$collection()[i8];
        if (i9 <= 1) {
            clear();
        } else {
            int i10 = i9 - 1;
            int i11 = 8;
            if (getHashes$collection().length > 8 && get_size$collection() < getHashes$collection().length / 3) {
                if (get_size$collection() > 8) {
                    i11 = get_size$collection() + (get_size$collection() >> 1);
                }
                int[] hashes$collection = getHashes$collection();
                Object[] array$collection = getArray$collection();
                ArraySetKt.allocArrays(this, i11);
                if (i8 > 0) {
                    AbstractC1428l.l(hashes$collection, getHashes$collection(), 0, 0, i8, 6, null);
                    AbstractC1428l.n(array$collection, getArray$collection(), 0, 0, i8, 6, null);
                }
                if (i8 < i10) {
                    int i12 = i8 + 1;
                    AbstractC1428l.g(hashes$collection, getHashes$collection(), i8, i12, i9);
                    AbstractC1428l.i(array$collection, getArray$collection(), i8, i12, i9);
                }
            } else {
                if (i8 < i10) {
                    int i13 = i8 + 1;
                    AbstractC1428l.g(getHashes$collection(), getHashes$collection(), i8, i13, i9);
                    AbstractC1428l.i(getArray$collection(), getArray$collection(), i8, i13, i9);
                }
                getArray$collection()[i10] = null;
            }
            if (i9 == get_size$collection()) {
                set_size$collection(i10);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e8;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        AbstractC3292y.i(elements, "elements");
        boolean z8 = false;
        for (int i8 = get_size$collection() - 1; -1 < i8; i8--) {
            if (!AbstractC1435t.d0(elements, getArray$collection()[i8])) {
                removeAt(i8);
                z8 = true;
            }
        }
        return z8;
    }

    public final void setArray$collection(Object[] objArr) {
        AbstractC3292y.i(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void setHashes$collection(int[] iArr) {
        AbstractC3292y.i(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i8) {
        this._size = i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC1428l.p(this.array, 0, this._size);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(get_size$collection() * 14);
        sb.append('{');
        int i8 = get_size$collection();
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            E valueAt = valueAt(i9);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final E valueAt(int i8) {
        return (E) getArray$collection()[i8];
    }

    public ArraySet(int i8) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i8 > 0) {
            ArraySetKt.allocArrays(this, i8);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        AbstractC3292y.i(array, "array");
        T[] result = (T[]) ArraySetJvmUtil.resizeForToArray(array, this._size);
        AbstractC1428l.i(this.array, result, 0, 0, this._size);
        AbstractC3292y.h(result, "result");
        return result;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= remove(it.next());
        }
        return z8;
    }

    public /* synthetic */ ArraySet(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 0 : i8);
    }

    public ArraySet(ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        ensureCapacity(get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= add(it.next());
        }
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator a9 = AbstractC3274f.a(eArr);
            while (a9.hasNext()) {
                add(a9.next());
            }
        }
    }
}
