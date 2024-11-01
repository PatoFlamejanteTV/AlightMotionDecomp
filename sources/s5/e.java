package S5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class e extends a {

    /* renamed from: a, reason: collision with root package name */
    private final d f9744a;

    public e(d backing) {
        AbstractC3292y.i(backing, "backing");
        this.f9744a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f9744a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        return this.f9744a.p(elements);
    }

    @Override // S5.a
    public boolean containsEntry(Map.Entry element) {
        AbstractC3292y.i(element, "element");
        return this.f9744a.q(element);
    }

    @Override // R5.AbstractC1424h
    public int getSize() {
        return this.f9744a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9744a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f9744a.v();
    }

    @Override // S5.a
    public boolean remove(Map.Entry element) {
        AbstractC3292y.i(element, "element");
        return this.f9744a.M(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        this.f9744a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        this.f9744a.n();
        return super.retainAll(elements);
    }

    @Override // R5.AbstractC1424h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry element) {
        AbstractC3292y.i(element, "element");
        throw new UnsupportedOperationException();
    }
}
