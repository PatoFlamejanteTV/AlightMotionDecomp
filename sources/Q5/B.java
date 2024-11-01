package Q5;

import R5.AbstractC1428l;
import d6.InterfaceC2767a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class B implements Collection, InterfaceC2767a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f8772a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f8773a;

        /* renamed from: b, reason: collision with root package name */
        private int f8774b;

        public a(int[] array) {
            AbstractC3292y.i(array, "array");
            this.f8773a = array;
        }

        public int a() {
            int i8 = this.f8774b;
            int[] iArr = this.f8773a;
            if (i8 < iArr.length) {
                this.f8774b = i8 + 1;
                return A.b(iArr[i8]);
            }
            throw new NoSuchElementException(String.valueOf(this.f8774b));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8774b < this.f8773a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return A.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ B(int[] iArr) {
        this.f8772a = iArr;
    }

    public static final /* synthetic */ B c(int[] iArr) {
        return new B(iArr);
    }

    public static int[] e(int i8) {
        return g(new int[i8]);
    }

    public static int[] g(int[] storage) {
        AbstractC3292y.i(storage, "storage");
        return storage;
    }

    public static boolean k(int[] iArr, int i8) {
        return AbstractC1428l.U(iArr, i8);
    }

    public static boolean l(int[] iArr, Collection elements) {
        AbstractC3292y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof A) || !AbstractC1428l.U(iArr, ((A) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(int[] iArr, Object obj) {
        if (!(obj instanceof B) || !AbstractC3292y.d(iArr, ((B) obj).y())) {
            return false;
        }
        return true;
    }

    public static final int n(int[] iArr, int i8) {
        return A.b(iArr[i8]);
    }

    public static int q(int[] iArr) {
        return iArr.length;
    }

    public static int r(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean s(int[] iArr) {
        if (iArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator t(int[] iArr) {
        return new a(iArr);
    }

    public static final void u(int[] iArr, int i8, int i9) {
        iArr[i8] = i9;
    }

    public static String v(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        return j(((A) obj).f());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        return l(this.f8772a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f8772a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return r(this.f8772a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return s(this.f8772a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return t(this.f8772a);
    }

    public boolean j(int i8) {
        return k(this.f8772a, i8);
    }

    @Override // java.util.Collection
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return q(this.f8772a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC3283o.a(this);
    }

    public String toString() {
        return v(this.f8772a);
    }

    public final /* synthetic */ int[] y() {
        return this.f8772a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3292y.i(array, "array");
        return AbstractC3283o.b(this, array);
    }
}
