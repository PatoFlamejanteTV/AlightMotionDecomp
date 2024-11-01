package S5;

import R5.AbstractC1419c;
import R5.AbstractC1422f;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import d6.InterfaceC2767a;
import d6.InterfaceC2768b;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class b extends AbstractC1422f implements List, RandomAccess, Serializable, InterfaceC2768b {

    /* renamed from: d, reason: collision with root package name */
    private static final C0208b f9705d = new C0208b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final b f9706e;

    /* renamed from: a, reason: collision with root package name */
    private Object[] f9707a;

    /* renamed from: b, reason: collision with root package name */
    private int f9708b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9709c;

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1422f implements List, RandomAccess, Serializable, InterfaceC2768b {

        /* renamed from: a, reason: collision with root package name */
        private Object[] f9710a;

        /* renamed from: b, reason: collision with root package name */
        private final int f9711b;

        /* renamed from: c, reason: collision with root package name */
        private int f9712c;

        /* renamed from: d, reason: collision with root package name */
        private final a f9713d;

        /* renamed from: e, reason: collision with root package name */
        private final b f9714e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: S5.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0207a implements ListIterator, InterfaceC2767a {

            /* renamed from: a, reason: collision with root package name */
            private final a f9715a;

            /* renamed from: b, reason: collision with root package name */
            private int f9716b;

            /* renamed from: c, reason: collision with root package name */
            private int f9717c;

            /* renamed from: d, reason: collision with root package name */
            private int f9718d;

            public C0207a(a list, int i8) {
                AbstractC3292y.i(list, "list");
                this.f9715a = list;
                this.f9716b = i8;
                this.f9717c = -1;
                this.f9718d = ((AbstractList) list).modCount;
            }

            private final void a() {
                if (((AbstractList) this.f9715a.f9714e).modCount == this.f9718d) {
                } else {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                a();
                a aVar = this.f9715a;
                int i8 = this.f9716b;
                this.f9716b = i8 + 1;
                aVar.add(i8, obj);
                this.f9717c = -1;
                this.f9718d = ((AbstractList) this.f9715a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                if (this.f9716b < this.f9715a.f9712c) {
                    return true;
                }
                return false;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                if (this.f9716b > 0) {
                    return true;
                }
                return false;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                a();
                if (this.f9716b < this.f9715a.f9712c) {
                    int i8 = this.f9716b;
                    this.f9716b = i8 + 1;
                    this.f9717c = i8;
                    return this.f9715a.f9710a[this.f9715a.f9711b + this.f9717c];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f9716b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                a();
                int i8 = this.f9716b;
                if (i8 > 0) {
                    int i9 = i8 - 1;
                    this.f9716b = i9;
                    this.f9717c = i9;
                    return this.f9715a.f9710a[this.f9715a.f9711b + this.f9717c];
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f9716b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i8 = this.f9717c;
                if (i8 != -1) {
                    this.f9715a.remove(i8);
                    this.f9716b = this.f9717c;
                    this.f9717c = -1;
                    this.f9718d = ((AbstractList) this.f9715a).modCount;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                a();
                int i8 = this.f9717c;
                if (i8 != -1) {
                    this.f9715a.set(i8, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
        }

        public a(Object[] backing, int i8, int i9, a aVar, b root) {
            AbstractC3292y.i(backing, "backing");
            AbstractC3292y.i(root, "root");
            this.f9710a = backing;
            this.f9711b = i8;
            this.f9712c = i9;
            this.f9713d = aVar;
            this.f9714e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void m(int i8, Collection collection, int i9) {
            u();
            a aVar = this.f9713d;
            if (aVar == null) {
                this.f9714e.r(i8, collection, i9);
            } else {
                aVar.m(i8, collection, i9);
            }
            this.f9710a = this.f9714e.f9707a;
            this.f9712c += i9;
        }

        private final void n(int i8, Object obj) {
            u();
            a aVar = this.f9713d;
            if (aVar == null) {
                this.f9714e.t(i8, obj);
            } else {
                aVar.n(i8, obj);
            }
            this.f9710a = this.f9714e.f9707a;
            this.f9712c++;
        }

        private final void o() {
            if (((AbstractList) this.f9714e).modCount == ((AbstractList) this).modCount) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        private final void q() {
            if (!t()) {
            } else {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean r(List list) {
            boolean h8;
            h8 = S5.c.h(this.f9710a, this.f9711b, this.f9712c, list);
            return h8;
        }

        private final boolean t() {
            return this.f9714e.f9709c;
        }

        private final void u() {
            ((AbstractList) this).modCount++;
        }

        private final Object v(int i8) {
            Object D8;
            u();
            a aVar = this.f9713d;
            if (aVar == null) {
                D8 = this.f9714e.D(i8);
            } else {
                D8 = aVar.v(i8);
            }
            this.f9712c--;
            return D8;
        }

        private final void y(int i8, int i9) {
            if (i9 > 0) {
                u();
            }
            a aVar = this.f9713d;
            if (aVar == null) {
                this.f9714e.E(i8, i9);
            } else {
                aVar.y(i8, i9);
            }
            this.f9712c -= i9;
        }

        private final int z(int i8, int i9, Collection collection, boolean z8) {
            int F8;
            a aVar = this.f9713d;
            if (aVar == null) {
                F8 = this.f9714e.F(i8, i9, collection, z8);
            } else {
                F8 = aVar.z(i8, i9, collection, z8);
            }
            if (F8 > 0) {
                u();
            }
            this.f9712c -= F8;
            return F8;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            q();
            o();
            n(this.f9711b + this.f9712c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            AbstractC3292y.i(elements, "elements");
            q();
            o();
            int size = elements.size();
            m(this.f9711b + this.f9712c, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            q();
            o();
            y(this.f9711b, this.f9712c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            o();
            if (obj != this && (!(obj instanceof List) || !r((List) obj))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i8) {
            o();
            AbstractC1419c.Companion.b(i8, this.f9712c);
            return this.f9710a[this.f9711b + i8];
        }

        @Override // R5.AbstractC1422f
        public int getSize() {
            o();
            return this.f9712c;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i8;
            o();
            i8 = S5.c.i(this.f9710a, this.f9711b, this.f9712c);
            return i8;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            o();
            for (int i8 = 0; i8 < this.f9712c; i8++) {
                if (AbstractC3292y.d(this.f9710a[this.f9711b + i8], obj)) {
                    return i8;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            o();
            if (this.f9712c == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            o();
            for (int i8 = this.f9712c - 1; i8 >= 0; i8--) {
                if (AbstractC3292y.d(this.f9710a[this.f9711b + i8], obj)) {
                    return i8;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            q();
            o();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            if (indexOf >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            AbstractC3292y.i(elements, "elements");
            q();
            o();
            if (z(this.f9711b, this.f9712c, elements, false) <= 0) {
                return false;
            }
            return true;
        }

        @Override // R5.AbstractC1422f
        public Object removeAt(int i8) {
            q();
            o();
            AbstractC1419c.Companion.b(i8, this.f9712c);
            return v(this.f9711b + i8);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            AbstractC3292y.i(elements, "elements");
            q();
            o();
            if (z(this.f9711b, this.f9712c, elements, true) > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i8, Object obj) {
            q();
            o();
            AbstractC1419c.Companion.b(i8, this.f9712c);
            Object[] objArr = this.f9710a;
            int i9 = this.f9711b;
            Object obj2 = objArr[i9 + i8];
            objArr[i9 + i8] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i8, int i9) {
            AbstractC1419c.Companion.d(i8, i9, this.f9712c);
            return new a(this.f9710a, this.f9711b + i8, i9 - i8, this, this.f9714e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            AbstractC3292y.i(array, "array");
            o();
            int length = array.length;
            int i8 = this.f9712c;
            if (length < i8) {
                Object[] objArr = this.f9710a;
                int i9 = this.f9711b;
                Object[] copyOfRange = Arrays.copyOfRange(objArr, i9, i8 + i9, array.getClass());
                AbstractC3292y.h(copyOfRange, "copyOfRange(...)");
                return copyOfRange;
            }
            Object[] objArr2 = this.f9710a;
            int i10 = this.f9711b;
            AbstractC1428l.i(objArr2, array, 0, i10, i8 + i10);
            return AbstractC1435t.f(this.f9712c, array);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String j8;
            o();
            j8 = S5.c.j(this.f9710a, this.f9711b, this.f9712c, this);
            return j8;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i8) {
            o();
            AbstractC1419c.Companion.c(i8, this.f9712c);
            return new C0207a(this, i8);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i8, Object obj) {
            q();
            o();
            AbstractC1419c.Companion.c(i8, this.f9712c);
            n(this.f9711b + i8, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i8, Collection elements) {
            AbstractC3292y.i(elements, "elements");
            q();
            o();
            AbstractC1419c.Companion.c(i8, this.f9712c);
            int size = elements.size();
            m(this.f9711b + i8, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            o();
            Object[] objArr = this.f9710a;
            int i8 = this.f9711b;
            return AbstractC1428l.p(objArr, i8, this.f9712c + i8);
        }
    }

    /* renamed from: S5.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C0208b {
        private C0208b() {
        }

        public /* synthetic */ C0208b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class c implements ListIterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private final b f9719a;

        /* renamed from: b, reason: collision with root package name */
        private int f9720b;

        /* renamed from: c, reason: collision with root package name */
        private int f9721c;

        /* renamed from: d, reason: collision with root package name */
        private int f9722d;

        public c(b list, int i8) {
            AbstractC3292y.i(list, "list");
            this.f9719a = list;
            this.f9720b = i8;
            this.f9721c = -1;
            this.f9722d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f9719a).modCount == this.f9722d) {
            } else {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            b bVar = this.f9719a;
            int i8 = this.f9720b;
            this.f9720b = i8 + 1;
            bVar.add(i8, obj);
            this.f9721c = -1;
            this.f9722d = ((AbstractList) this.f9719a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f9720b < this.f9719a.f9708b) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f9720b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f9720b < this.f9719a.f9708b) {
                int i8 = this.f9720b;
                this.f9720b = i8 + 1;
                this.f9721c = i8;
                return this.f9719a.f9707a[this.f9721c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f9720b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i8 = this.f9720b;
            if (i8 > 0) {
                int i9 = i8 - 1;
                this.f9720b = i9;
                this.f9721c = i9;
                return this.f9719a.f9707a[this.f9721c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f9720b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i8 = this.f9721c;
            if (i8 != -1) {
                this.f9719a.remove(i8);
                this.f9720b = this.f9721c;
                this.f9721c = -1;
                this.f9722d = ((AbstractList) this.f9719a).modCount;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i8 = this.f9721c;
            if (i8 != -1) {
                this.f9719a.set(i8, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        b bVar = new b(0);
        bVar.f9709c = true;
        f9706e = bVar;
    }

    public b(int i8) {
        this.f9707a = S5.c.d(i8);
    }

    private final void A(int i8) {
        z(this.f9708b + i8);
    }

    private final void B(int i8, int i9) {
        A(i9);
        Object[] objArr = this.f9707a;
        AbstractC1428l.i(objArr, objArr, i8 + i9, i8, this.f9708b);
        this.f9708b += i9;
    }

    private final void C() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(int i8) {
        C();
        Object[] objArr = this.f9707a;
        Object obj = objArr[i8];
        AbstractC1428l.i(objArr, objArr, i8, i8 + 1, this.f9708b);
        S5.c.f(this.f9707a, this.f9708b - 1);
        this.f9708b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(int i8, int i9) {
        if (i9 > 0) {
            C();
        }
        Object[] objArr = this.f9707a;
        AbstractC1428l.i(objArr, objArr, i8, i8 + i9, this.f9708b);
        Object[] objArr2 = this.f9707a;
        int i10 = this.f9708b;
        S5.c.g(objArr2, i10 - i9, i10);
        this.f9708b -= i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F(int i8, int i9, Collection collection, boolean z8) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = i8 + i10;
            if (collection.contains(this.f9707a[i12]) == z8) {
                Object[] objArr = this.f9707a;
                i10++;
                objArr[i11 + i8] = objArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = i9 - i11;
        Object[] objArr2 = this.f9707a;
        AbstractC1428l.i(objArr2, objArr2, i8 + i11, i9 + i8, this.f9708b);
        Object[] objArr3 = this.f9707a;
        int i14 = this.f9708b;
        S5.c.g(objArr3, i14 - i13, i14);
        if (i13 > 0) {
            C();
        }
        this.f9708b -= i13;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(int i8, Collection collection, int i9) {
        C();
        B(i8, i9);
        Iterator it = collection.iterator();
        for (int i10 = 0; i10 < i9; i10++) {
            this.f9707a[i8 + i10] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(int i8, Object obj) {
        C();
        B(i8, 1);
        this.f9707a[i8] = obj;
    }

    private final void v() {
        if (!this.f9709c) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean y(List list) {
        boolean h8;
        h8 = S5.c.h(this.f9707a, 0, this.f9708b, list);
        return h8;
    }

    private final void z(int i8) {
        if (i8 >= 0) {
            Object[] objArr = this.f9707a;
            if (i8 > objArr.length) {
                this.f9707a = S5.c.e(this.f9707a, AbstractC1419c.Companion.e(objArr.length, i8));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        v();
        t(this.f9708b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        v();
        int size = elements.size();
        r(this.f9708b, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        v();
        E(0, this.f9708b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof List) || !y((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        AbstractC1419c.Companion.b(i8, this.f9708b);
        return this.f9707a[i8];
    }

    @Override // R5.AbstractC1422f
    public int getSize() {
        return this.f9708b;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i8;
        i8 = S5.c.i(this.f9707a, 0, this.f9708b);
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i8 = 0; i8 < this.f9708b; i8++) {
            if (AbstractC3292y.d(this.f9707a[i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (this.f9708b == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i8 = this.f9708b - 1; i8 >= 0; i8--) {
            if (AbstractC3292y.d(this.f9707a[i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        v();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        v();
        if (F(0, this.f9708b, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // R5.AbstractC1422f
    public Object removeAt(int i8) {
        v();
        AbstractC1419c.Companion.b(i8, this.f9708b);
        return D(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        v();
        if (F(0, this.f9708b, elements, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        v();
        AbstractC1419c.Companion.b(i8, this.f9708b);
        Object[] objArr = this.f9707a;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i8, int i9) {
        AbstractC1419c.Companion.d(i8, i9, this.f9708b);
        return new a(this.f9707a, i8, i9 - i8, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC3292y.i(array, "array");
        int length = array.length;
        int i8 = this.f9708b;
        if (length < i8) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f9707a, 0, i8, array.getClass());
            AbstractC3292y.h(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC1428l.i(this.f9707a, array, 0, 0, i8);
        return AbstractC1435t.f(this.f9708b, array);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j8;
        j8 = S5.c.j(this.f9707a, 0, this.f9708b, this);
        return j8;
    }

    public final List u() {
        v();
        this.f9709c = true;
        if (this.f9708b > 0) {
            return this;
        }
        return f9706e;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i8) {
        AbstractC1419c.Companion.c(i8, this.f9708b);
        return new c(this, i8);
    }

    public /* synthetic */ b(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 10 : i8);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        v();
        AbstractC1419c.Companion.c(i8, this.f9708b);
        t(i8, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection elements) {
        AbstractC3292y.i(elements, "elements");
        v();
        AbstractC1419c.Companion.c(i8, this.f9708b);
        int size = elements.size();
        r(i8, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC1428l.p(this.f9707a, 0, this.f9708b);
    }
}
