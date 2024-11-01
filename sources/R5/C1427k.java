package R5;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: R5.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1427k extends AbstractC1422f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9341d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f9342e = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    private int f9343a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f9344b;

    /* renamed from: c, reason: collision with root package name */
    private int f9345c;

    /* renamed from: R5.k$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C1427k(int i8) {
        Object[] objArr;
        if (i8 == 0) {
            objArr = f9342e;
        } else if (i8 > 0) {
            objArr = new Object[i8];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i8);
        }
        this.f9344b = objArr;
    }

    private final void C(int i8, int i9) {
        int u8 = u(this.f9343a + (i8 - 1));
        int u9 = u(this.f9343a + (i9 - 1));
        while (i8 > 0) {
            int i10 = u8 + 1;
            int min = Math.min(i8, Math.min(i10, u9 + 1));
            Object[] objArr = this.f9344b;
            int i11 = u9 - min;
            int i12 = u8 - min;
            AbstractC1428l.i(objArr, objArr, i11 + 1, i12 + 1, i10);
            u8 = r(i12);
            u9 = r(i11);
            i8 -= min;
        }
    }

    private final void D(int i8, int i9) {
        int u8 = u(this.f9343a + i9);
        int u9 = u(this.f9343a + i8);
        int size = size();
        while (true) {
            size -= i9;
            if (size > 0) {
                Object[] objArr = this.f9344b;
                i9 = Math.min(size, Math.min(objArr.length - u8, objArr.length - u9));
                Object[] objArr2 = this.f9344b;
                int i10 = u8 + i9;
                AbstractC1428l.i(objArr2, objArr2, u9, u8, i10);
                u8 = u(i10);
                u9 = u(u9 + i9);
            } else {
                return;
            }
        }
    }

    private final void g(int i8, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f9344b.length;
        while (i8 < length && it.hasNext()) {
            this.f9344b[i8] = it.next();
            i8++;
        }
        int i9 = this.f9343a;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f9344b[i10] = it.next();
        }
        this.f9345c = size() + collection.size();
    }

    private final void j(int i8) {
        Object[] objArr = new Object[i8];
        Object[] objArr2 = this.f9344b;
        AbstractC1428l.i(objArr2, objArr, 0, this.f9343a, objArr2.length);
        Object[] objArr3 = this.f9344b;
        int length = objArr3.length;
        int i9 = this.f9343a;
        AbstractC1428l.i(objArr3, objArr, length - i9, 0, i9);
        this.f9343a = 0;
        this.f9344b = objArr;
    }

    private final int k(int i8) {
        if (i8 == 0) {
            return AbstractC1428l.i0(this.f9344b);
        }
        return i8 - 1;
    }

    private final void m(int i8) {
        if (i8 >= 0) {
            Object[] objArr = this.f9344b;
            if (i8 <= objArr.length) {
                return;
            }
            if (objArr == f9342e) {
                this.f9344b = new Object[i6.m.d(i8, 10)];
                return;
            } else {
                j(AbstractC1419c.Companion.e(objArr.length, i8));
                return;
            }
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final int o(int i8) {
        if (i8 == AbstractC1428l.i0(this.f9344b)) {
            return 0;
        }
        return i8 + 1;
    }

    private final int r(int i8) {
        if (i8 < 0) {
            return i8 + this.f9344b.length;
        }
        return i8;
    }

    private final void t(int i8, int i9) {
        if (i8 < i9) {
            AbstractC1428l.t(this.f9344b, null, i8, i9);
            return;
        }
        Object[] objArr = this.f9344b;
        AbstractC1428l.t(objArr, null, i8, objArr.length);
        AbstractC1428l.t(this.f9344b, null, 0, i9);
    }

    private final int u(int i8) {
        Object[] objArr = this.f9344b;
        if (i8 >= objArr.length) {
            return i8 - objArr.length;
        }
        return i8;
    }

    private final void v() {
        ((AbstractList) this).modCount++;
    }

    public final Object A() {
        if (!isEmpty()) {
            v();
            int u8 = u(this.f9343a + AbstractC1435t.o(this));
            Object[] objArr = this.f9344b;
            Object obj = objArr[u8];
            objArr[u8] = null;
            this.f9345c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object B() {
        if (isEmpty()) {
            return null;
        }
        return A();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        e(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        v();
        m(size() + elements.size());
        g(u(this.f9343a + size()), elements);
        return true;
    }

    public final void c(Object obj) {
        v();
        m(size() + 1);
        int k8 = k(this.f9343a);
        this.f9343a = k8;
        this.f9344b[k8] = obj;
        this.f9345c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            v();
            t(this.f9343a, u(this.f9343a + size()));
        }
        this.f9343a = 0;
        this.f9345c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void e(Object obj) {
        v();
        m(size() + 1);
        this.f9344b[u(this.f9343a + size())] = obj;
        this.f9345c = size() + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f9344b[this.f9343a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i8) {
        AbstractC1419c.Companion.b(i8, size());
        return this.f9344b[u(this.f9343a + i8)];
    }

    @Override // R5.AbstractC1422f
    public int getSize() {
        return this.f9345c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i8;
        int u8 = u(this.f9343a + size());
        int i9 = this.f9343a;
        if (i9 < u8) {
            while (i9 < u8) {
                if (AbstractC3292y.d(obj, this.f9344b[i9])) {
                    i8 = this.f9343a;
                } else {
                    i9++;
                }
            }
            return -1;
        }
        if (i9 >= u8) {
            int length = this.f9344b.length;
            while (true) {
                if (i9 < length) {
                    if (AbstractC3292y.d(obj, this.f9344b[i9])) {
                        i8 = this.f9343a;
                        break;
                    }
                    i9++;
                } else {
                    for (int i10 = 0; i10 < u8; i10++) {
                        if (AbstractC3292y.d(obj, this.f9344b[i10])) {
                            i9 = i10 + this.f9344b.length;
                            i8 = this.f9343a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i9 - i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f9344b[u(this.f9343a + AbstractC1435t.o(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int i02;
        int i8;
        int u8 = u(this.f9343a + size());
        int i9 = this.f9343a;
        if (i9 < u8) {
            i02 = u8 - 1;
            if (i9 <= i02) {
                while (!AbstractC3292y.d(obj, this.f9344b[i02])) {
                    if (i02 != i9) {
                        i02--;
                    }
                }
                i8 = this.f9343a;
                return i02 - i8;
            }
            return -1;
        }
        if (i9 > u8) {
            int i10 = u8 - 1;
            while (true) {
                if (-1 < i10) {
                    if (AbstractC3292y.d(obj, this.f9344b[i10])) {
                        i02 = i10 + this.f9344b.length;
                        i8 = this.f9343a;
                        break;
                    }
                    i10--;
                } else {
                    i02 = AbstractC1428l.i0(this.f9344b);
                    int i11 = this.f9343a;
                    if (i11 <= i02) {
                        while (!AbstractC3292y.d(obj, this.f9344b[i02])) {
                            if (i02 != i11) {
                                i02--;
                            }
                        }
                        i8 = this.f9343a;
                    }
                }
            }
        }
        return -1;
    }

    public final Object n() {
        if (isEmpty()) {
            return null;
        }
        return this.f9344b[this.f9343a];
    }

    public final Object q() {
        if (isEmpty()) {
            return null;
        }
        return this.f9344b[u(this.f9343a + AbstractC1435t.o(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        int u8;
        AbstractC3292y.i(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f9344b.length != 0) {
            int u9 = u(this.f9343a + size());
            int i8 = this.f9343a;
            if (i8 < u9) {
                u8 = i8;
                while (i8 < u9) {
                    Object obj = this.f9344b[i8];
                    if (!elements.contains(obj)) {
                        this.f9344b[u8] = obj;
                        u8++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                AbstractC1428l.t(this.f9344b, null, u8, u9);
            } else {
                int length = this.f9344b.length;
                int i9 = i8;
                boolean z9 = false;
                while (i8 < length) {
                    Object[] objArr = this.f9344b;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (!elements.contains(obj2)) {
                        this.f9344b[i9] = obj2;
                        i9++;
                    } else {
                        z9 = true;
                    }
                    i8++;
                }
                u8 = u(i9);
                for (int i10 = 0; i10 < u9; i10++) {
                    Object[] objArr2 = this.f9344b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (!elements.contains(obj3)) {
                        this.f9344b[u8] = obj3;
                        u8 = o(u8);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                v();
                this.f9345c = r(u8 - this.f9343a);
            }
        }
        return z8;
    }

    @Override // R5.AbstractC1422f
    public Object removeAt(int i8) {
        AbstractC1419c.Companion.b(i8, size());
        if (i8 == AbstractC1435t.o(this)) {
            return A();
        }
        if (i8 == 0) {
            return y();
        }
        v();
        int u8 = u(this.f9343a + i8);
        Object obj = this.f9344b[u8];
        if (i8 < (size() >> 1)) {
            int i9 = this.f9343a;
            if (u8 >= i9) {
                Object[] objArr = this.f9344b;
                AbstractC1428l.i(objArr, objArr, i9 + 1, i9, u8);
            } else {
                Object[] objArr2 = this.f9344b;
                AbstractC1428l.i(objArr2, objArr2, 1, 0, u8);
                Object[] objArr3 = this.f9344b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i10 = this.f9343a;
                AbstractC1428l.i(objArr3, objArr3, i10 + 1, i10, objArr3.length - 1);
            }
            Object[] objArr4 = this.f9344b;
            int i11 = this.f9343a;
            objArr4[i11] = null;
            this.f9343a = o(i11);
        } else {
            int u9 = u(this.f9343a + AbstractC1435t.o(this));
            if (u8 <= u9) {
                Object[] objArr5 = this.f9344b;
                AbstractC1428l.i(objArr5, objArr5, u8, u8 + 1, u9 + 1);
            } else {
                Object[] objArr6 = this.f9344b;
                AbstractC1428l.i(objArr6, objArr6, u8, u8 + 1, objArr6.length);
                Object[] objArr7 = this.f9344b;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC1428l.i(objArr7, objArr7, 0, 1, u9 + 1);
            }
            this.f9344b[u9] = null;
        }
        this.f9345c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i8, int i9) {
        AbstractC1419c.Companion.d(i8, i9, size());
        int i10 = i9 - i8;
        if (i10 == 0) {
            return;
        }
        if (i10 == size()) {
            clear();
            return;
        }
        if (i10 == 1) {
            remove(i8);
            return;
        }
        v();
        if (i8 < size() - i9) {
            C(i8, i9);
            int u8 = u(this.f9343a + i10);
            t(this.f9343a, u8);
            this.f9343a = u8;
        } else {
            D(i8, i9);
            int u9 = u(this.f9343a + size());
            t(r(u9 - i10), u9);
        }
        this.f9345c = size() - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        int u8;
        AbstractC3292y.i(elements, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f9344b.length != 0) {
            int u9 = u(this.f9343a + size());
            int i8 = this.f9343a;
            if (i8 < u9) {
                u8 = i8;
                while (i8 < u9) {
                    Object obj = this.f9344b[i8];
                    if (elements.contains(obj)) {
                        this.f9344b[u8] = obj;
                        u8++;
                    } else {
                        z8 = true;
                    }
                    i8++;
                }
                AbstractC1428l.t(this.f9344b, null, u8, u9);
            } else {
                int length = this.f9344b.length;
                int i9 = i8;
                boolean z9 = false;
                while (i8 < length) {
                    Object[] objArr = this.f9344b;
                    Object obj2 = objArr[i8];
                    objArr[i8] = null;
                    if (elements.contains(obj2)) {
                        this.f9344b[i9] = obj2;
                        i9++;
                    } else {
                        z9 = true;
                    }
                    i8++;
                }
                u8 = u(i9);
                for (int i10 = 0; i10 < u9; i10++) {
                    Object[] objArr2 = this.f9344b;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        this.f9344b[u8] = obj3;
                        u8 = o(u8);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                v();
                this.f9345c = r(u8 - this.f9343a);
            }
        }
        return z8;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i8, Object obj) {
        AbstractC1419c.Companion.b(i8, size());
        int u8 = u(this.f9343a + i8);
        Object[] objArr = this.f9344b;
        Object obj2 = objArr[u8];
        objArr[u8] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC3292y.i(array, "array");
        if (array.length < size()) {
            array = AbstractC1429m.a(array, size());
        }
        int u8 = u(this.f9343a + size());
        int i8 = this.f9343a;
        if (i8 < u8) {
            AbstractC1428l.n(this.f9344b, array, 0, i8, u8, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f9344b;
            AbstractC1428l.i(objArr, array, 0, this.f9343a, objArr.length);
            Object[] objArr2 = this.f9344b;
            AbstractC1428l.i(objArr2, array, objArr2.length - this.f9343a, 0, u8);
        }
        return AbstractC1435t.f(size(), array);
    }

    public final Object y() {
        if (!isEmpty()) {
            v();
            Object[] objArr = this.f9344b;
            int i8 = this.f9343a;
            Object obj = objArr[i8];
            objArr[i8] = null;
            this.f9343a = o(i8);
            this.f9345c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object z() {
        if (isEmpty()) {
            return null;
        }
        return y();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, Object obj) {
        AbstractC1419c.Companion.c(i8, size());
        if (i8 == size()) {
            e(obj);
            return;
        }
        if (i8 == 0) {
            c(obj);
            return;
        }
        v();
        m(size() + 1);
        int u8 = u(this.f9343a + i8);
        if (i8 < ((size() + 1) >> 1)) {
            int k8 = k(u8);
            int k9 = k(this.f9343a);
            int i9 = this.f9343a;
            if (k8 >= i9) {
                Object[] objArr = this.f9344b;
                objArr[k9] = objArr[i9];
                AbstractC1428l.i(objArr, objArr, i9, i9 + 1, k8 + 1);
            } else {
                Object[] objArr2 = this.f9344b;
                AbstractC1428l.i(objArr2, objArr2, i9 - 1, i9, objArr2.length);
                Object[] objArr3 = this.f9344b;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC1428l.i(objArr3, objArr3, 0, 1, k8 + 1);
            }
            this.f9344b[k8] = obj;
            this.f9343a = k9;
        } else {
            int u9 = u(this.f9343a + size());
            if (u8 < u9) {
                Object[] objArr4 = this.f9344b;
                AbstractC1428l.i(objArr4, objArr4, u8 + 1, u8, u9);
            } else {
                Object[] objArr5 = this.f9344b;
                AbstractC1428l.i(objArr5, objArr5, 1, 0, u9);
                Object[] objArr6 = this.f9344b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC1428l.i(objArr6, objArr6, u8 + 1, u8, objArr6.length - 1);
            }
            this.f9344b[u8] = obj;
        }
        this.f9345c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection elements) {
        AbstractC3292y.i(elements, "elements");
        AbstractC1419c.Companion.c(i8, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i8 == size()) {
            return addAll(elements);
        }
        v();
        m(size() + elements.size());
        int u8 = u(this.f9343a + size());
        int u9 = u(this.f9343a + i8);
        int size = elements.size();
        if (i8 < ((size() + 1) >> 1)) {
            int i9 = this.f9343a;
            int i10 = i9 - size;
            if (u9 < i9) {
                Object[] objArr = this.f9344b;
                AbstractC1428l.i(objArr, objArr, i10, i9, objArr.length);
                if (size >= u9) {
                    Object[] objArr2 = this.f9344b;
                    AbstractC1428l.i(objArr2, objArr2, objArr2.length - size, 0, u9);
                } else {
                    Object[] objArr3 = this.f9344b;
                    AbstractC1428l.i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f9344b;
                    AbstractC1428l.i(objArr4, objArr4, 0, size, u9);
                }
            } else if (i10 >= 0) {
                Object[] objArr5 = this.f9344b;
                AbstractC1428l.i(objArr5, objArr5, i10, i9, u9);
            } else {
                Object[] objArr6 = this.f9344b;
                i10 += objArr6.length;
                int i11 = u9 - i9;
                int length = objArr6.length - i10;
                if (length >= i11) {
                    AbstractC1428l.i(objArr6, objArr6, i10, i9, u9);
                } else {
                    AbstractC1428l.i(objArr6, objArr6, i10, i9, i9 + length);
                    Object[] objArr7 = this.f9344b;
                    AbstractC1428l.i(objArr7, objArr7, 0, this.f9343a + length, u9);
                }
            }
            this.f9343a = i10;
            g(r(u9 - size), elements);
        } else {
            int i12 = u9 + size;
            if (u9 < u8) {
                int i13 = size + u8;
                Object[] objArr8 = this.f9344b;
                if (i13 <= objArr8.length) {
                    AbstractC1428l.i(objArr8, objArr8, i12, u9, u8);
                } else if (i12 >= objArr8.length) {
                    AbstractC1428l.i(objArr8, objArr8, i12 - objArr8.length, u9, u8);
                } else {
                    int length2 = u8 - (i13 - objArr8.length);
                    AbstractC1428l.i(objArr8, objArr8, 0, length2, u8);
                    Object[] objArr9 = this.f9344b;
                    AbstractC1428l.i(objArr9, objArr9, i12, u9, length2);
                }
            } else {
                Object[] objArr10 = this.f9344b;
                AbstractC1428l.i(objArr10, objArr10, size, 0, u8);
                Object[] objArr11 = this.f9344b;
                if (i12 >= objArr11.length) {
                    AbstractC1428l.i(objArr11, objArr11, i12 - objArr11.length, u9, objArr11.length);
                } else {
                    AbstractC1428l.i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f9344b;
                    AbstractC1428l.i(objArr12, objArr12, i12, u9, objArr12.length - size);
                }
            }
            g(u9, elements);
        }
        return true;
    }

    public C1427k() {
        this.f9344b = f9342e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
