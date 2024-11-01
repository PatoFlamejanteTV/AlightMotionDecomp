package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.j5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2174j5 extends D3 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f16786d;

    /* renamed from: e, reason: collision with root package name */
    private static final C2174j5 f16787e;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f16788b;

    /* renamed from: c, reason: collision with root package name */
    private int f16789c;

    static {
        Object[] objArr = new Object[0];
        f16786d = objArr;
        f16787e = new C2174j5(objArr, 0, false);
    }

    private C2174j5(Object[] objArr, int i8, boolean z8) {
        super(z8);
        this.f16788b = objArr;
        this.f16789c = i8;
    }

    private static int e(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    public static C2174j5 g() {
        return f16787e;
    }

    private final String j(int i8) {
        return "Index:" + i8 + ", Size:" + this.f16789c;
    }

    private final void k(int i8) {
        if (i8 >= 0 && i8 < this.f16789c) {
        } else {
            throw new IndexOutOfBoundsException(j(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.B4
    public final /* synthetic */ B4 a(int i8) {
        Object[] copyOf;
        if (i8 >= this.f16789c) {
            if (i8 == 0) {
                copyOf = f16786d;
            } else {
                copyOf = Arrays.copyOf(this.f16788b, i8);
            }
            return new C2174j5(copyOf, this.f16789c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i8, Object obj) {
        int i9;
        c();
        if (i8 >= 0 && i8 <= (i9 = this.f16789c)) {
            Object[] objArr = this.f16788b;
            if (i9 < objArr.length) {
                System.arraycopy(objArr, i8, objArr, i8 + 1, i9 - i8);
            } else {
                Object[] objArr2 = new Object[e(objArr.length)];
                System.arraycopy(this.f16788b, 0, objArr2, 0, i8);
                System.arraycopy(this.f16788b, i8, objArr2, i8 + 1, this.f16789c - i8);
                this.f16788b = objArr2;
            }
            this.f16788b[i8] = obj;
            this.f16789c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i8) {
        Object[] objArr = this.f16788b;
        if (i8 <= objArr.length) {
            return;
        }
        if (objArr.length == 0) {
            this.f16788b = new Object[Math.max(i8, 10)];
            return;
        }
        int length = objArr.length;
        while (length < i8) {
            length = e(length);
        }
        this.f16788b = Arrays.copyOf(this.f16788b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        k(i8);
        return this.f16788b[i8];
    }

    @Override // com.google.android.gms.internal.measurement.D3, java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        c();
        k(i8);
        Object[] objArr = this.f16788b;
        Object obj = objArr[i8];
        if (i8 < this.f16789c - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (r2 - i8) - 1);
        }
        this.f16789c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i8, Object obj) {
        c();
        k(i8);
        Object[] objArr = this.f16788b;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16789c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i8 = this.f16789c;
        Object[] objArr = this.f16788b;
        if (i8 == objArr.length) {
            this.f16788b = Arrays.copyOf(this.f16788b, e(objArr.length));
        }
        Object[] objArr2 = this.f16788b;
        int i9 = this.f16789c;
        this.f16789c = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
