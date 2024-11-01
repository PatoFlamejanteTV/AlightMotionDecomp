package S5;

import R5.AbstractC1424h;
import d6.InterfaceC2771e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class f extends AbstractC1424h implements Set, InterfaceC2771e {

    /* renamed from: a, reason: collision with root package name */
    private final d f9745a;

    public f(d backing) {
        AbstractC3292y.i(backing, "backing");
        this.f9745a = backing;
    }

    @Override // R5.AbstractC1424h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f9745a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f9745a.containsKey(obj);
    }

    @Override // R5.AbstractC1424h
    public int getSize() {
        return this.f9745a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9745a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f9745a.F();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f9745a.P(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        this.f9745a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        this.f9745a.n();
        return super.retainAll(elements);
    }
}
