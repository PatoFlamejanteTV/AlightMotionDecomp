package androidx.core.util;

import android.util.SparseArray;
import d6.InterfaceC2767a;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes3.dex */
public final class SparseArrayKt$valueIterator$1<T> implements Iterator<T>, InterfaceC2767a {
    final /* synthetic */ SparseArray<T> $this_valueIterator;
    private int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArrayKt$valueIterator$1(SparseArray<T> sparseArray) {
        this.$this_valueIterator = sparseArray;
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
        SparseArray<T> sparseArray = this.$this_valueIterator;
        int i8 = this.index;
        this.index = i8 + 1;
        return sparseArray.valueAt(i8);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i8) {
        this.index = i8;
    }
}
