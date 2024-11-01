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
public final class z implements Collection, InterfaceC2767a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8826a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator, InterfaceC2767a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f8827a;

        /* renamed from: b, reason: collision with root package name */
        private int f8828b;

        public a(byte[] array) {
            AbstractC3292y.i(array, "array");
            this.f8827a = array;
        }

        public byte a() {
            int i8 = this.f8828b;
            byte[] bArr = this.f8827a;
            if (i8 < bArr.length) {
                this.f8828b = i8 + 1;
                return y.b(bArr[i8]);
            }
            throw new NoSuchElementException(String.valueOf(this.f8828b));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8828b < this.f8827a.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return y.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ z(byte[] bArr) {
        this.f8826a = bArr;
    }

    public static final /* synthetic */ z c(byte[] bArr) {
        return new z(bArr);
    }

    public static byte[] e(int i8) {
        return g(new byte[i8]);
    }

    public static byte[] g(byte[] storage) {
        AbstractC3292y.i(storage, "storage");
        return storage;
    }

    public static boolean k(byte[] bArr, byte b9) {
        return AbstractC1428l.S(bArr, b9);
    }

    public static boolean l(byte[] bArr, Collection elements) {
        AbstractC3292y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof y) || !AbstractC1428l.S(bArr, ((y) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(byte[] bArr, Object obj) {
        if (!(obj instanceof z) || !AbstractC3292y.d(bArr, ((z) obj).y())) {
            return false;
        }
        return true;
    }

    public static final byte n(byte[] bArr, int i8) {
        return y.b(bArr[i8]);
    }

    public static int q(byte[] bArr) {
        return bArr.length;
    }

    public static int r(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean s(byte[] bArr) {
        if (bArr.length == 0) {
            return true;
        }
        return false;
    }

    public static Iterator t(byte[] bArr) {
        return new a(bArr);
    }

    public static final void u(byte[] bArr, int i8, byte b9) {
        bArr[i8] = b9;
    }

    public static String v(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (!(obj instanceof y)) {
            return false;
        }
        return j(((y) obj).f());
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        return l(this.f8826a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.f8826a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return r(this.f8826a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return s(this.f8826a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return t(this.f8826a);
    }

    public boolean j(byte b9) {
        return k(this.f8826a, b9);
    }

    @Override // java.util.Collection
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int size() {
        return q(this.f8826a);
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
        return v(this.f8826a);
    }

    public final /* synthetic */ byte[] y() {
        return this.f8826a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3292y.i(array, "array");
        return AbstractC3283o.b(this, array);
    }
}
