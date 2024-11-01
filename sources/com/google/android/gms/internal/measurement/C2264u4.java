package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2264u4 extends D3 implements InterfaceC2304z4, InterfaceC2165i5, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f17025d;

    /* renamed from: e, reason: collision with root package name */
    private static final C2264u4 f17026e;

    /* renamed from: b, reason: collision with root package name */
    private int[] f17027b;

    /* renamed from: c, reason: collision with root package name */
    private int f17028c;

    static {
        int[] iArr = new int[0];
        f17025d = iArr;
        f17026e = new C2264u4(iArr, 0, false);
    }

    private C2264u4(int[] iArr, int i8, boolean z8) {
        super(z8);
        this.f17027b = iArr;
        this.f17028c = i8;
    }

    public static C2264u4 e() {
        return f17026e;
    }

    private static int k(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String l(int i8) {
        return "Index:" + i8 + ", Size:" + this.f17028c;
    }

    private final void m(int i8) {
        if (i8 >= 0 && i8 < this.f17028c) {
        } else {
            throw new IndexOutOfBoundsException(l(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i8 >= 0 && i8 <= (i9 = this.f17028c)) {
            int[] iArr = this.f17027b;
            if (i9 < iArr.length) {
                System.arraycopy(iArr, i8, iArr, i8 + 1, i9 - i8);
            } else {
                int[] iArr2 = new int[k(iArr.length)];
                System.arraycopy(this.f17027b, 0, iArr2, 0, i8);
                System.arraycopy(this.f17027b, i8, iArr2, i8 + 1, this.f17028c - i8);
                this.f17027b = iArr2;
            }
            this.f17027b[i8] = intValue;
            this.f17028c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(l(i8));
    }

    @Override // com.google.android.gms.internal.measurement.D3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        AbstractC2256t4.e(collection);
        if (!(collection instanceof C2264u4)) {
            return super.addAll(collection);
        }
        C2264u4 c2264u4 = (C2264u4) collection;
        int i8 = c2264u4.f17028c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f17028c;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            int[] iArr = this.f17027b;
            if (i10 > iArr.length) {
                this.f17027b = Arrays.copyOf(iArr, i10);
            }
            System.arraycopy(c2264u4.f17027b, 0, this.f17027b, this.f17028c, c2264u4.f17028c);
            this.f17028c = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i8) {
        m(i8);
        return this.f17027b[i8];
    }

    @Override // com.google.android.gms.internal.measurement.D3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2264u4)) {
            return super.equals(obj);
        }
        C2264u4 c2264u4 = (C2264u4) obj;
        if (this.f17028c != c2264u4.f17028c) {
            return false;
        }
        int[] iArr = c2264u4.f17027b;
        for (int i8 = 0; i8 < this.f17028c; i8++) {
            if (this.f17027b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i8) {
        c();
        int i9 = this.f17028c;
        int[] iArr = this.f17027b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[k(iArr.length)];
            System.arraycopy(this.f17027b, 0, iArr2, 0, this.f17028c);
            this.f17027b = iArr2;
        }
        int[] iArr3 = this.f17027b;
        int i10 = this.f17028c;
        this.f17028c = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        return Integer.valueOf(d(i8));
    }

    @Override // com.google.android.gms.internal.measurement.B4
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2304z4 a(int i8) {
        int[] copyOf;
        if (i8 >= this.f17028c) {
            if (i8 == 0) {
                copyOf = f17025d;
            } else {
                copyOf = Arrays.copyOf(this.f17027b, i8);
            }
            return new C2264u4(copyOf, this.f17028c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.D3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f17028c; i9++) {
            i8 = (i8 * 31) + this.f17027b[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f17027b[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i8) {
        int[] iArr = this.f17027b;
        if (i8 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f17027b = new int[Math.max(i8, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i8) {
            length = k(length);
        }
        this.f17027b = Arrays.copyOf(this.f17027b, length);
    }

    @Override // com.google.android.gms.internal.measurement.D3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        c();
        m(i8);
        int[] iArr = this.f17027b;
        int i9 = iArr[i8];
        if (i8 < this.f17028c - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f17028c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        c();
        if (i9 >= i8) {
            int[] iArr = this.f17027b;
            System.arraycopy(iArr, i9, iArr, i8, this.f17028c - i9);
            this.f17028c -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        m(i8);
        int[] iArr = this.f17027b;
        int i9 = iArr[i8];
        iArr[i8] = intValue;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17028c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
