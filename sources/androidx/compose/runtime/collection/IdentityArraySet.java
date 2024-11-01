package androidx.compose.runtime.collection;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import d6.InterfaceC2767a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IdentityArraySet<T> implements Set<T>, InterfaceC2767a {
    public static final int $stable = 8;
    private int size;
    private Object[] values = new Object[16];

    private final void checkIndexBounds(int i8) {
        if (i8 >= 0 && i8 < size()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + ", size " + size());
    }

    private final int find(Object obj) {
        int size = size() - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        Object[] objArr = this.values;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            Object obj2 = objArr[i9];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i8 = i9 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                size = i9 - 1;
            } else {
                if (obj2 == obj) {
                    return i9;
                }
                return findExactIndex(i9, obj, identityHashCode);
            }
        }
        return -(i8 + 1);
    }

    private final int findExactIndex(int i8, Object obj, int i9) {
        Object obj2;
        Object[] objArr = this.values;
        int size = size();
        for (int i10 = i8 - 1; -1 < i10; i10--) {
            Object obj3 = objArr[i10];
            if (obj3 == obj) {
                return i10;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj3) != i9) {
                break;
            }
        }
        do {
            i8++;
            if (i8 < size) {
                obj2 = objArr[i8];
                if (obj2 == obj) {
                    return i8;
                }
            } else {
                return -(size + 1);
            }
        } while (ActualJvm_jvmKt.identityHashCode(obj2) == i9);
        return -(i8 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t8) {
        int i8;
        int size = size();
        Object[] objArr = this.values;
        if (size > 0) {
            i8 = find(t8);
            if (i8 >= 0) {
                return false;
            }
        } else {
            i8 = -1;
        }
        int i9 = -(i8 + 1);
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            AbstractC1428l.i(objArr, objArr2, i9 + 1, i9, size);
            AbstractC1428l.n(objArr, objArr2, 0, 0, i9, 6, null);
            this.values = objArr2;
        } else {
            AbstractC1428l.i(objArr, objArr, i9 + 1, i9, size);
        }
        this.values[i9] = t8;
        this.size = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        AbstractC1428l.x(this.values, null, 0, 0, 6, null);
        this.size = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null || find(obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean fastAny(Function1 function1) {
        int size = size();
        if (size == 0) {
            return false;
        }
        Object[] values = getValues();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = values[i8];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void fastForEach(Function1 function1) {
        Object[] values = getValues();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = values[i8];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            function1.invoke(obj);
        }
    }

    public final T get(int i8) {
        checkIndexBounds(i8);
        T t8 = (T) this.values[i8];
        AbstractC3292y.g(t8, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t8;
    }

    public int getSize() {
        return this.size;
    }

    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (size() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new IdentityArraySet$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t8) {
        if (t8 == null) {
            return false;
        }
        int find = find(t8);
        Object[] objArr = this.values;
        int size = size();
        if (find < 0) {
            return false;
        }
        int i8 = size - 1;
        if (find < i8) {
            AbstractC1428l.i(objArr, objArr, find, find + 1, size);
        }
        objArr[i8] = null;
        this.size = size() - 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void removeValueIf(Function1 function1) {
        Object[] values = getValues();
        int size = size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = values[i9];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i8 != i9) {
                    values[i8] = obj;
                }
                i8++;
            }
        }
        for (int i10 = i8; i10 < size; i10++) {
            values[i10] = null;
        }
        this.size = i8;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC3283o.a(this);
    }

    public String toString() {
        return AbstractC1435t.w0(this, null, "[", "]", 0, null, IdentityArraySet$toString$1.INSTANCE, 25, null);
    }

    @Override // java.util.Set, java.util.Collection
    public final void addAll(Collection<? extends T> collection) {
        Object[] objArr;
        int i8;
        Object obj;
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof IdentityArraySet)) {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return;
        }
        Object[] objArr2 = this.values;
        IdentityArraySet identityArraySet = (IdentityArraySet) collection;
        Object[] objArr3 = identityArraySet.values;
        int size = size();
        int size2 = identityArraySet.size();
        int i9 = size + size2;
        boolean z8 = this.values.length < i9;
        boolean z9 = size == 0 || ActualJvm_jvmKt.identityHashCode(objArr2[size + (-1)]) < ActualJvm_jvmKt.identityHashCode(objArr3[0]);
        if (!z8 && z9) {
            AbstractC1428l.i(objArr3, objArr2, size, 0, size2);
            this.size = size() + size2;
            return;
        }
        if (z8) {
            objArr = new Object[size > size2 ? size * 2 : size2 * 2];
        } else {
            objArr = objArr2;
        }
        int i10 = size - 1;
        int i11 = size2 - 1;
        int i12 = i9 - 1;
        while (true) {
            if (i10 < 0 && i11 < 0) {
                break;
            }
            if (i10 < 0) {
                i8 = i11 - 1;
                obj = objArr3[i11];
            } else if (i11 < 0) {
                i8 = i11;
                obj = objArr2[i10];
                i10--;
            } else {
                Object obj2 = objArr2[i10];
                Object obj3 = objArr3[i11];
                int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj2);
                int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj3);
                if (identityHashCode > identityHashCode2) {
                    i10--;
                } else {
                    if (identityHashCode >= identityHashCode2) {
                        if (obj2 != obj3) {
                            int i13 = i10 - 1;
                            while (i13 >= 0) {
                                int i14 = i13 - 1;
                                Object obj4 = objArr2[i13];
                                if (ActualJvm_jvmKt.identityHashCode(obj4) != identityHashCode2) {
                                    break;
                                }
                                if (obj3 == obj4) {
                                    i11--;
                                    break;
                                }
                                i13 = i14;
                            }
                        } else {
                            i10--;
                            i11--;
                        }
                    }
                    i8 = i11 - 1;
                    obj = obj3;
                }
                i8 = i11;
                obj = obj2;
            }
            objArr[i12] = obj;
            i11 = i8;
            i12--;
        }
        if (i12 >= 0) {
            AbstractC1428l.i(objArr, objArr, 0, i12 + 1, i9);
        }
        int i15 = i9 - (i12 + 1);
        AbstractC1428l.t(objArr, null, i15, i9);
        this.values = objArr;
        this.size = i15;
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC3283o.b(this, tArr);
    }
}
