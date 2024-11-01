package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class I4 extends D3 implements InterfaceC2288x4, InterfaceC2165i5, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f16326d;

    /* renamed from: e, reason: collision with root package name */
    private static final I4 f16327e;

    /* renamed from: b, reason: collision with root package name */
    private long[] f16328b;

    /* renamed from: c, reason: collision with root package name */
    private int f16329c;

    static {
        long[] jArr = new long[0];
        f16326d = jArr;
        f16327e = new I4(jArr, 0, false);
    }

    private I4(long[] jArr, int i8, boolean z8) {
        super(z8);
        this.f16328b = jArr;
        this.f16329c = i8;
    }

    public static I4 e() {
        return f16327e;
    }

    private static int j(int i8) {
        return Math.max(((i8 * 3) / 2) + 1, 10);
    }

    private final String k(int i8) {
        return "Index:" + i8 + ", Size:" + this.f16329c;
    }

    private final void l(int i8) {
        if (i8 >= 0 && i8 < this.f16329c) {
        } else {
            throw new IndexOutOfBoundsException(k(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        long longValue = ((Long) obj).longValue();
        c();
        if (i8 >= 0 && i8 <= (i9 = this.f16329c)) {
            long[] jArr = this.f16328b;
            if (i9 < jArr.length) {
                System.arraycopy(jArr, i8, jArr, i8 + 1, i9 - i8);
            } else {
                long[] jArr2 = new long[j(jArr.length)];
                System.arraycopy(this.f16328b, 0, jArr2, 0, i8);
                System.arraycopy(this.f16328b, i8, jArr2, i8 + 1, this.f16329c - i8);
                this.f16328b = jArr2;
            }
            this.f16328b[i8] = longValue;
            this.f16329c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(k(i8));
    }

    @Override // com.google.android.gms.internal.measurement.D3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        AbstractC2256t4.e(collection);
        if (!(collection instanceof I4)) {
            return super.addAll(collection);
        }
        I4 i42 = (I4) collection;
        int i8 = i42.f16329c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f16329c;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            long[] jArr = this.f16328b;
            if (i10 > jArr.length) {
                this.f16328b = Arrays.copyOf(jArr, i10);
            }
            System.arraycopy(i42.f16328b, 0, this.f16328b, this.f16329c, i42.f16329c);
            this.f16329c = i10;
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

    public final void d(long j8) {
        c();
        int i8 = this.f16329c;
        long[] jArr = this.f16328b;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[j(jArr.length)];
            System.arraycopy(this.f16328b, 0, jArr2, 0, this.f16329c);
            this.f16328b = jArr2;
        }
        long[] jArr3 = this.f16328b;
        int i9 = this.f16329c;
        this.f16329c = i9 + 1;
        jArr3[i9] = j8;
    }

    @Override // com.google.android.gms.internal.measurement.D3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I4)) {
            return super.equals(obj);
        }
        I4 i42 = (I4) obj;
        if (this.f16329c != i42.f16329c) {
            return false;
        }
        long[] jArr = i42.f16328b;
        for (int i8 = 0; i8 < this.f16329c; i8++) {
            if (this.f16328b[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2288x4
    public final long f(int i8) {
        l(i8);
        return this.f16328b[i8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i8) {
        long[] jArr = this.f16328b;
        if (i8 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f16328b = new long[Math.max(i8, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i8) {
            length = j(length);
        }
        this.f16328b = Arrays.copyOf(this.f16328b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        return Long.valueOf(f(i8));
    }

    @Override // com.google.android.gms.internal.measurement.B4
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2288x4 a(int i8) {
        long[] copyOf;
        if (i8 >= this.f16329c) {
            if (i8 == 0) {
                copyOf = f16326d;
            } else {
                copyOf = Arrays.copyOf(this.f16328b, i8);
            }
            return new I4(copyOf, this.f16329c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.D3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f16329c; i9++) {
            i8 = (i8 * 31) + AbstractC2256t4.b(this.f16328b[i9]);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f16328b[i8] == longValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.D3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        c();
        l(i8);
        long[] jArr = this.f16328b;
        long j8 = jArr[i8];
        if (i8 < this.f16329c - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f16329c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        c();
        if (i9 >= i8) {
            long[] jArr = this.f16328b;
            System.arraycopy(jArr, i9, jArr, i8, this.f16329c - i9);
            this.f16329c -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        l(i8);
        long[] jArr = this.f16328b;
        long j8 = jArr[i8];
        jArr[i8] = longValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16329c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
