package j$.util;

import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3010p extends C3008n implements java.util.List, List {
    private static final long serialVersionUID = -283967356065247728L;

    /* renamed from: b, reason: collision with root package name */
    final java.util.List f33211b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3010p(java.util.List list) {
        super(list);
        this.f33211b = list;
    }

    private Object readResolve() {
        java.util.List list = this.f33211b;
        return list instanceof RandomAccess ? new C3010p(list) : this;
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i8, java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.f33211b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i8) {
        return this.f33211b.get(i8);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f33211b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f33211b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f33211b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C3009o(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i8) {
        return new C3009o(this, i8);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public java.util.List subList(int i8, int i9) {
        return new C3010p(this.f33211b.subList(i8, i9));
    }
}
