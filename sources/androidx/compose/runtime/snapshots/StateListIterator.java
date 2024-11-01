package androidx.compose.runtime.snapshots;

import Q5.C1413h;
import d6.InterfaceC2767a;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class StateListIterator<T> implements ListIterator<T>, InterfaceC2767a {
    private int index;
    private int lastRequested = -1;
    private final SnapshotStateList<T> list;
    private int structure;

    public StateListIterator(SnapshotStateList<T> snapshotStateList, int i8) {
        this.list = snapshotStateList;
        this.index = i8 - 1;
        this.structure = snapshotStateList.getStructure$runtime_release();
    }

    private final void validateModification() {
        if (this.list.getStructure$runtime_release() == this.structure) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(T t8) {
        validateModification();
        this.list.add(this.index + 1, t8);
        this.lastRequested = -1;
        this.index++;
        this.structure = this.list.getStructure$runtime_release();
    }

    public final SnapshotStateList<T> getList() {
        return this.list;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.list.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.index >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        validateModification();
        int i8 = this.index + 1;
        this.lastRequested = i8;
        SnapshotStateListKt.validateRange(i8, this.list.size());
        T t8 = this.list.get(i8);
        this.index = i8;
        return t8;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        validateModification();
        SnapshotStateListKt.validateRange(this.index, this.list.size());
        int i8 = this.index;
        this.lastRequested = i8;
        this.index--;
        return this.list.get(i8);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        validateModification();
        this.list.remove(this.index);
        this.index--;
        this.lastRequested = -1;
        this.structure = this.list.getStructure$runtime_release();
    }

    @Override // java.util.ListIterator
    public void set(T t8) {
        validateModification();
        int i8 = this.lastRequested;
        if (i8 < 0) {
            SnapshotStateListKt.invalidIteratorSet();
            throw new C1413h();
        }
        this.list.set(i8, t8);
        this.structure = this.list.getStructure$runtime_release();
    }
}
