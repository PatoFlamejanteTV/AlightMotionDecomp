package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
abstract class D3 extends AbstractList implements B4 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16272a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D3(boolean z8) {
        this.f16272a = z8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c();
        return super.addAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.B4
    public final boolean b() {
        return this.f16272a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        if (this.f16272a) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i8 = 0; i8 < size; i8++) {
            if (!get(i8).equals(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i8 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i8 = (i8 * 31) + get(i9).hashCode();
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i8);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        c();
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.B4
    public final void x() {
        if (this.f16272a) {
            this.f16272a = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection collection) {
        c();
        return super.addAll(i8, collection);
    }
}
