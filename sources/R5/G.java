package R5;

import d6.InterfaceC2767a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class G implements List, Serializable, RandomAccess, InterfaceC2767a {

    /* renamed from: a, reason: collision with root package name */
    public static final G f9298a = new G();

    private G() {
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(Void element) {
        AbstractC3292y.i(element, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return c((Void) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        return elements.isEmpty();
    }

    @Override // java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void get(int i8) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i8 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if ((obj instanceof List) && ((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    public int g() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return j((Void) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return F.f9297a;
    }

    public int j(Void element) {
        AbstractC3292y.i(element, "element");
        return -1;
    }

    public int k(Void element) {
        AbstractC3292y.i(element, "element");
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return k((Void) obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return F.f9297a;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.List
    public List subList(int i8, int i9) {
        if (i8 == 0 && i9 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i9);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC3283o.a(this);
    }

    public String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i8) {
        if (i8 == 0) {
            return F.f9297a;
        }
        throw new IndexOutOfBoundsException("Index: " + i8);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3292y.i(array, "array");
        return AbstractC3283o.b(this, array);
    }
}
