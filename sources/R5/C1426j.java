package R5;

import d6.InterfaceC2767a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3274f;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: R5.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1426j implements Collection, InterfaceC2767a {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f9339a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9340b;

    public C1426j(Object[] values, boolean z8) {
        AbstractC3292y.i(values, "values");
        this.f9339a = values;
        this.f9340b = z8;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return this.f9339a.length;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC1428l.W(this.f9339a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (this.f9339a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC3274f.a(this.f9339a);
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
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3292y.i(array, "array");
        return AbstractC3283o.b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1436u.b(this.f9339a, this.f9340b);
    }
}
