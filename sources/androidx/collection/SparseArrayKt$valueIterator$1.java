package androidx.collection;

import d6.InterfaceC2767a;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class SparseArrayKt$valueIterator$1<T> implements Iterator<T>, InterfaceC2767a {
    final /* synthetic */ SparseArrayCompat<T> $this_valueIterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArrayKt$valueIterator$1(SparseArrayCompat<T> sparseArrayCompat) {
        this.$this_valueIterator = sparseArrayCompat;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.$this_valueIterator.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        SparseArrayCompat<T> sparseArrayCompat = this.$this_valueIterator;
        int i8 = this.index;
        this.index = i8 + 1;
        return sparseArrayCompat.valueAt(i8);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i8) {
        this.index = i8;
    }
}
