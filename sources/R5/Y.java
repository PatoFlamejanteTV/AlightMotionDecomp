package R5;

import d6.InterfaceC2767a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class Y extends AbstractC1419c {

    /* renamed from: a, reason: collision with root package name */
    private final List f9309a;

    /* loaded from: classes5.dex */
    public static final class a implements ListIterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private final ListIterator f9310a;

        a(int i8) {
            int Z8;
            List list = Y.this.f9309a;
            Z8 = B.Z(Y.this, i8);
            this.f9310a = list.listIterator(Z8);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f9310a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f9310a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f9310a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int Y8;
            Y8 = B.Y(Y.this, this.f9310a.previousIndex());
            return Y8;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f9310a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int Y8;
            Y8 = B.Y(Y.this, this.f9310a.nextIndex());
            return Y8;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public Y(List delegate) {
        AbstractC3292y.i(delegate, "delegate");
        this.f9309a = delegate;
    }

    @Override // R5.AbstractC1419c, java.util.List
    public Object get(int i8) {
        int X8;
        List list = this.f9309a;
        X8 = B.X(this, i8);
        return list.get(X8);
    }

    @Override // R5.AbstractC1419c, R5.AbstractC1417a
    public int getSize() {
        return this.f9309a.size();
    }

    @Override // R5.AbstractC1419c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // R5.AbstractC1419c, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // R5.AbstractC1419c, java.util.List
    public ListIterator listIterator(int i8) {
        return new a(i8);
    }
}
