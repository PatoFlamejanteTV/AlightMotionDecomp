package S5;

import R5.AbstractC1424h;
import d6.InterfaceC2771e;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class h extends AbstractC1424h implements Set, Serializable, InterfaceC2771e {

    /* renamed from: b, reason: collision with root package name */
    private static final a f9747b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final h f9748c = new h(d.f9723n.e());

    /* renamed from: a, reason: collision with root package name */
    private final d f9749a;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public h(d backing) {
        AbstractC3292y.i(backing, "backing");
        this.f9749a = backing;
    }

    @Override // R5.AbstractC1424h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.f9749a.j(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        this.f9749a.n();
        return super.addAll(elements);
    }

    public final Set c() {
        this.f9749a.m();
        if (size() > 0) {
            return this;
        }
        return f9748c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f9749a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f9749a.containsKey(obj);
    }

    @Override // R5.AbstractC1424h
    public int getSize() {
        return this.f9749a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9749a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f9749a.F();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f9749a.P(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        this.f9749a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC3292y.i(elements, "elements");
        this.f9749a.n();
        return super.retainAll(elements);
    }

    public h() {
        this(new d());
    }

    public h(int i8) {
        this(new d(i8));
    }
}
