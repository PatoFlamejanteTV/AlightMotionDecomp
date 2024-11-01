package androidx.compose.runtime.snapshots;

import R5.N;
import d6.InterfaceC2768b;
import i6.m;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SubList<T> implements List<T>, InterfaceC2768b {
    private final int offset;
    private final SnapshotStateList<T> parentList;
    private int size;
    private int structure;

    public SubList(SnapshotStateList<T> snapshotStateList, int i8, int i9) {
        this.parentList = snapshotStateList;
        this.offset = i8;
        this.structure = snapshotStateList.getStructure$runtime_release();
        this.size = i9 - i8;
    }

    private final void validateModification() {
        if (this.parentList.getStructure$runtime_release() == this.structure) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t8) {
        validateModification();
        this.parentList.add(this.offset + size(), t8);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection<? extends T> collection) {
        validateModification();
        boolean addAll = this.parentList.addAll(i8 + this.offset, collection);
        if (addAll) {
            this.size = size() + collection.size();
            this.structure = this.parentList.getStructure$runtime_release();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i8 = this.offset;
            snapshotStateList.removeRange(i8, size() + i8);
            this.size = 0;
            this.structure = this.parentList.getStructure$runtime_release();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public T get(int i8) {
        validateModification();
        SnapshotStateListKt.validateRange(i8, size());
        return this.parentList.get(this.offset + i8);
    }

    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        validateModification();
        int i8 = this.offset;
        Iterator<T> it = m.s(i8, size() + i8).iterator();
        while (it.hasNext()) {
            int nextInt = ((N) it).nextInt();
            if (AbstractC3292y.d(obj, this.parentList.get(nextInt))) {
                return nextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        validateModification();
        int size = this.offset + size();
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!AbstractC3292y.d(obj, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i8) {
        return removeAt(i8);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z8 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z8) {
                    z8 = true;
                }
            }
            return z8;
        }
    }

    public T removeAt(int i8) {
        validateModification();
        T remove = this.parentList.remove(this.offset + i8);
        this.size = size() - 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i8 = this.offset;
        int retainAllInRange$runtime_release = snapshotStateList.retainAllInRange$runtime_release(collection, i8, size() + i8);
        if (retainAllInRange$runtime_release > 0) {
            this.structure = this.parentList.getStructure$runtime_release();
            this.size = size() - retainAllInRange$runtime_release;
        }
        if (retainAllInRange$runtime_release > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public T set(int i8, T t8) {
        SnapshotStateListKt.validateRange(i8, size());
        validateModification();
        T t9 = this.parentList.set(i8 + this.offset, t8);
        this.structure = this.parentList.getStructure$runtime_release();
        return t9;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<T> subList(int i8, int i9) {
        if (i8 >= 0 && i8 <= i9 && i9 <= size()) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i10 = this.offset;
            return new SubList(snapshotStateList, i8 + i10, i9 + i10);
        }
        throw new IllegalArgumentException("fromIndex or toIndex are out of bounds".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC3283o.a(this);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i8) {
        validateModification();
        Q q8 = new Q();
        q8.f34571a = i8 - 1;
        return new SubList$listIterator$1(q8, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC3283o.b(this, tArr);
    }

    @Override // java.util.List
    public void add(int i8, T t8) {
        validateModification();
        this.parentList.add(this.offset + i8, t8);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        return addAll(size(), collection);
    }
}
