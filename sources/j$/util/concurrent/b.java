package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    final ConcurrentHashMap f33111a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ConcurrentHashMap concurrentHashMap) {
        this.f33111a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f33111a.clear();
    }

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == this) {
            return true;
        }
        for (Object obj : collection) {
            if (obj == null || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f33111a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        l[] lVarArr = this.f33111a.f33096a;
        boolean z8 = false;
        if (lVarArr == null) {
            return false;
        }
        if (!(collection instanceof Set) || collection.size() <= lVarArr.length) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z8 |= remove(it.next());
            }
        } else {
            Iterator it2 = iterator();
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    z8 = true;
                }
            }
        }
        return z8;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f33111a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j8 = this.f33111a.j();
        if (j8 < 0) {
            j8 = 0;
        }
        if (j8 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i8 = (int) j8;
        Object[] objArr = new Object[i8];
        Iterator it = iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i9 == i8) {
                if (i8 >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i10 = i8 < 1073741819 ? (i8 >>> 1) + 1 + i8 : 2147483639;
                objArr = Arrays.copyOf(objArr, i10);
                i8 = i10;
            }
            objArr[i9] = next;
            i9++;
        }
        return i9 == i8 ? objArr : Arrays.copyOf(objArr, i9);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j8 = this.f33111a.j();
        if (j8 < 0) {
            j8 = 0;
        }
        if (j8 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i8 = (int) j8;
        Object[] objArr2 = objArr.length >= i8 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i8);
        int length = objArr2.length;
        Iterator it = iterator();
        int i9 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i9 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i10 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArr2 = Arrays.copyOf(objArr2, i10);
                length = i10;
            }
            objArr2[i9] = next;
            i9++;
        }
        if (objArr != objArr2 || i9 >= length) {
            return i9 == length ? objArr2 : Arrays.copyOf(objArr2, i9);
        }
        objArr2[i9] = null;
        return objArr2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
