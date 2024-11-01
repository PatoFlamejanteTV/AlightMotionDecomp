package androidx.compose.runtime.snapshots;

import Q5.C1413h;
import d6.InterfaceC2767a;
import java.util.ListIterator;
import kotlin.jvm.internal.Q;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
public final class SubList$listIterator$1<T> implements ListIterator<T>, InterfaceC2767a {
    final /* synthetic */ Q $current;
    final /* synthetic */ SubList<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubList$listIterator$1(Q q8, SubList<T> subList) {
        this.$current = q8;
        this.this$0 = subList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        add((SubList$listIterator$1<T>) obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.$current.f34571a < this.this$0.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.$current.f34571a >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        int i8 = this.$current.f34571a + 1;
        SnapshotStateListKt.validateRange(i8, this.this$0.size());
        this.$current.f34571a = i8;
        return this.this$0.get(i8);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.$current.f34571a + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        int i8 = this.$current.f34571a;
        SnapshotStateListKt.validateRange(i8, this.this$0.size());
        this.$current.f34571a = i8 - 1;
        return this.this$0.get(i8);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.$current.f34571a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        set((SubList$listIterator$1<T>) obj);
    }

    @Override // java.util.ListIterator
    public Void add(T t8) {
        SnapshotStateListKt.modificationError();
        throw new C1413h();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Void remove() {
        SnapshotStateListKt.modificationError();
        throw new C1413h();
    }

    @Override // java.util.ListIterator
    public Void set(T t8) {
        SnapshotStateListKt.modificationError();
        throw new C1413h();
    }
}
