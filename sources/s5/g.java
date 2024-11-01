package S5;

import R5.AbstractC1421e;
import d6.InterfaceC2768b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class g extends AbstractC1421e implements Collection, InterfaceC2768b {

    /* renamed from: a, reason: collision with root package name */
    private final d f9746a;

    public g(d backing) {
        AbstractC3292y.i(backing, "backing");
        this.f9746a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f9746a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f9746a.containsValue(obj);
    }

    @Override // R5.AbstractC1421e
    public int getSize() {
        return this.f9746a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f9746a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f9746a.T();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f9746a.R(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        this.f9746a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        this.f9746a.n();
        return super.retainAll(elements);
    }
}
