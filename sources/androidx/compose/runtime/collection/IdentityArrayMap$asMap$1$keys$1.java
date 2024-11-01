package androidx.compose.runtime.collection;

import d6.InterfaceC2767a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3283o;

/* JADX INFO: Add missing generic type declarations: [Key] */
/* loaded from: classes.dex */
public final class IdentityArrayMap$asMap$1$keys$1<Key> implements Set<Key>, InterfaceC2767a {
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IdentityArrayMap$asMap$1$keys$1(IdentityArrayMap<Key, Value> identityArrayMap) {
        this.this$0 = identityArrayMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Key key) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Key> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.this$0.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.this$0.getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Key> iterator() {
        return AbstractC3258j.b(new IdentityArrayMap$asMap$1$keys$1$iterator$1(this.this$0, null)).iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC3283o.b(this, tArr);
    }
}
