package j$.util;

import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3138u implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map f33644a;

    /* renamed from: b, reason: collision with root package name */
    private transient java.util.Set f33645b;

    /* renamed from: c, reason: collision with root package name */
    private transient java.util.Set f33646c;

    /* renamed from: d, reason: collision with root package name */
    private transient java.util.Collection f33647d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3138u(java.util.Map map) {
        map.getClass();
        this.f33644a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f33644a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f33644a.containsValue(obj);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set, j$.util.n] */
    @Override // java.util.Map
    public final java.util.Set entrySet() {
        if (this.f33646c == null) {
            this.f33646c = new C3008n(this.f33644a.entrySet());
        }
        return this.f33646c;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f33644a.equals(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        AbstractC2998d.q(this.f33644a, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f33644a.get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return AbstractC2998d.s(this.f33644a, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f33644a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f33644a.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        if (this.f33645b == null) {
            this.f33645b = DesugarCollections.unmodifiableSet(this.f33644a.keySet());
        }
        return this.f33645b;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f33644a.size();
    }

    public final String toString() {
        return this.f33644a.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.f33647d == null) {
            this.f33647d = DesugarCollections.unmodifiableCollection(this.f33644a.values());
        }
        return this.f33647d;
    }
}
