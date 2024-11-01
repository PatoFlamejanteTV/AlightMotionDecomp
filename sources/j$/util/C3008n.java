package j$.util;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3008n implements java.util.Collection, Serializable, Collection {
    private static final long serialVersionUID = 1820017752578914078L;

    /* renamed from: a, reason: collision with root package name */
    final java.util.Collection f33209a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3008n(java.util.Collection collection) {
        collection.getClass();
        this.f33209a = collection;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f33209a.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        return this.f33209a.containsAll(collection);
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public void forEach(Consumer consumer) {
        Collection.EL.a(this.f33209a, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f33209a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C3007m(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public Stream parallelStream() {
        return Collection.EL.b(this.f33209a);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f33209a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public Spliterator spliterator() {
        return Collection.EL.c(this.f33209a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public Stream stream() {
        return Collection.EL.stream(this.f33209a);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return this.f33209a.toArray();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f33209a.toArray(objArr);
    }

    public final String toString() {
        return this.f33209a.toString();
    }
}
