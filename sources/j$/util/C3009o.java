package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* renamed from: j$.util.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3009o implements ListIterator, InterfaceC3143z {

    /* renamed from: a, reason: collision with root package name */
    private final ListIterator f33210a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3009o(C3010p c3010p, int i8) {
        this.f33210a = c3010p.f33211b.listIterator(i8);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC3143z
    public final void forEachRemaining(Consumer consumer) {
        AbstractC2998d.r(this.f33210a, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f33210a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33210a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f33210a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33210a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f33210a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33210a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
