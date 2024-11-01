package R5;

import d6.InterfaceC2767a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: R5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1419c extends AbstractC1417a implements List, InterfaceC2767a {
    public static final a Companion = new a(null);
    private static final int maxArraySize = 2147483639;

    /* renamed from: R5.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final void a(int i8, int i9, int i10) {
            if (i8 >= 0 && i9 <= i10) {
                if (i8 <= i9) {
                    return;
                }
                throw new IllegalArgumentException("startIndex: " + i8 + " > endIndex: " + i9);
            }
            throw new IndexOutOfBoundsException("startIndex: " + i8 + ", endIndex: " + i9 + ", size: " + i10);
        }

        public final void b(int i8, int i9) {
            if (i8 >= 0 && i8 < i9) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
        }

        public final void c(int i8, int i9) {
            if (i8 >= 0 && i8 <= i9) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
        }

        public final void d(int i8, int i9, int i10) {
            if (i8 >= 0 && i9 <= i10) {
                if (i8 <= i9) {
                    return;
                }
                throw new IllegalArgumentException("fromIndex: " + i8 + " > toIndex: " + i9);
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i9 + ", size: " + i10);
        }

        public final int e(int i8, int i9) {
            int i10 = i8 + (i8 >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - AbstractC1419c.maxArraySize > 0) {
                if (i9 > AbstractC1419c.maxArraySize) {
                    return Integer.MAX_VALUE;
                }
                return AbstractC1419c.maxArraySize;
            }
            return i10;
        }

        public final boolean f(Collection c8, Collection other) {
            AbstractC3292y.i(c8, "c");
            AbstractC3292y.i(other, "other");
            if (c8.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c8.iterator();
            while (it2.hasNext()) {
                if (!AbstractC3292y.d(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection c8) {
            int i8;
            AbstractC3292y.i(c8, "c");
            int i9 = 1;
            for (Object obj : c8) {
                int i10 = i9 * 31;
                if (obj != null) {
                    i8 = obj.hashCode();
                } else {
                    i8 = 0;
                }
                i9 = i10 + i8;
            }
            return i9;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R5.c$b */
    /* loaded from: classes5.dex */
    public class b implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private int f9322a;

        public b() {
        }

        protected final int a() {
            return this.f9322a;
        }

        protected final void b(int i8) {
            this.f9322a = i8;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9322a < AbstractC1419c.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                AbstractC1419c abstractC1419c = AbstractC1419c.this;
                int i8 = this.f9322a;
                this.f9322a = i8 + 1;
                return abstractC1419c.get(i8);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: R5.c$c, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private class C0194c extends b implements ListIterator, InterfaceC2767a {
        public C0194c(int i8) {
            super();
            AbstractC1419c.Companion.c(i8, AbstractC1419c.this.size());
            b(i8);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (a() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (hasPrevious()) {
                AbstractC1419c abstractC1419c = AbstractC1419c.this;
                b(a() - 1);
                return abstractC1419c.get(a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: R5.c$d */
    /* loaded from: classes5.dex */
    private static final class d extends AbstractC1419c implements RandomAccess {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1419c f9325a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9326b;

        /* renamed from: c, reason: collision with root package name */
        private int f9327c;

        public d(AbstractC1419c list, int i8, int i9) {
            AbstractC3292y.i(list, "list");
            this.f9325a = list;
            this.f9326b = i8;
            AbstractC1419c.Companion.d(i8, i9, list.size());
            this.f9327c = i9 - i8;
        }

        @Override // R5.AbstractC1419c, java.util.List
        public Object get(int i8) {
            AbstractC1419c.Companion.b(i8, this.f9327c);
            return this.f9325a.get(this.f9326b + i8);
        }

        @Override // R5.AbstractC1419c, R5.AbstractC1417a
        public int getSize() {
            return this.f9327c;
        }
    }

    @Override // java.util.List
    public void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return Companion.f(this, (Collection) obj);
    }

    public abstract Object get(int i8);

    @Override // R5.AbstractC1417a
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.g(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (!AbstractC3292y.d(it.next(), obj)) {
                i8++;
            } else {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC3292y.d(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<Object> listIterator() {
        return new C0194c(0);
    }

    @Override // java.util.List
    public Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i8, int i9) {
        return new d(this, i8, i9);
    }

    public ListIterator<Object> listIterator(int i8) {
        return new C0194c(i8);
    }
}
