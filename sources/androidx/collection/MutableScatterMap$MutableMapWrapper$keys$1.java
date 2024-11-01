package androidx.collection;

import R5.AbstractC1435t;
import d6.InterfaceC2771e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$keys$1<K> implements Set<K>, InterfaceC2771e {
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends K> elements) {
        AbstractC3292y.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC3292y.i(elements, "elements");
        Collection<? extends Object> collection = elements;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!mutableScatterMap.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.this$0._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<K> iterator() {
        return new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(this.this$0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:            if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:            r12 = -1;     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean remove(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.collection.MutableScatterMap<K, V> r2 = r0.this$0
            if (r1 == 0) goto Ld
            int r4 = r19.hashCode()
            goto Le
        Ld:
            r4 = 0
        Le:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r2._capacity
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L1e:
            long[] r8 = r2.metadata
            int r9 = r4 >> 3
            r10 = r4 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r14 = r8[r9]
            int r8 = 64 - r10
            long r8 = r14 << r8
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r5
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r14
            long r10 = r10 ^ r8
            long r14 = r10 - r14
            long r10 = ~r10
            long r10 = r10 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r14
        L4b:
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 == 0) goto L6b
            int r12 = java.lang.Long.numberOfTrailingZeros(r10)
            int r12 = r12 >> 3
            int r12 = r12 + r4
            r12 = r12 & r6
            java.lang.Object[] r3 = r2.keys
            r3 = r3[r12]
            boolean r3 = kotlin.jvm.internal.AbstractC3292y.d(r3, r1)
            if (r3 == 0) goto L64
            goto L75
        L64:
            r16 = 1
            long r16 = r10 - r16
            long r10 = r10 & r16
            goto L4b
        L6b:
            long r10 = ~r8
            r3 = 6
            long r10 = r10 << r3
            long r8 = r8 & r10
            long r8 = r8 & r14
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 == 0) goto L7f
            r12 = -1
        L75:
            if (r12 < 0) goto L7d
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            r1.removeValueAt(r12)
            return r13
        L7d:
            r3 = 0
            return r3
        L7f:
            r3 = 0
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        AbstractC3292y.i(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        boolean z8 = false;
        if (length >= 0) {
            int i8 = 0;
            boolean z9 = false;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (AbstractC1435t.d0(elements, mutableScatterMap.keys[i11])) {
                                mutableScatterMap.removeValueAt(i11);
                                z9 = true;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        return z9;
                    }
                }
                if (i8 != length) {
                    i8++;
                } else {
                    z8 = z9;
                    break;
                }
            }
        }
        return z8;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        AbstractC3292y.i(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        boolean z8 = false;
        if (length >= 0) {
            int i8 = 0;
            boolean z9 = false;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (!AbstractC1435t.d0(elements, mutableScatterMap.keys[i11])) {
                                mutableScatterMap.removeValueAt(i11);
                                z9 = true;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        return z9;
                    }
                }
                if (i8 != length) {
                    i8++;
                } else {
                    z8 = z9;
                    break;
                }
            }
        }
        return z8;
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
    public <T> T[] toArray(T[] array) {
        AbstractC3292y.i(array, "array");
        return (T[]) AbstractC3283o.b(this, array);
    }
}
