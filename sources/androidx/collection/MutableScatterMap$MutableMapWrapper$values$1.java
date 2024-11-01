package androidx.collection;

import R5.AbstractC1435t;
import d6.InterfaceC2768b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1<V> implements Collection<V>, InterfaceC2768b {
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Collection
    public boolean add(V v8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends V> elements) {
        AbstractC3292y.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.this$0.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        AbstractC3292y.i(elements, "elements");
        Collection<? extends Object> collection = elements;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!mutableScatterMap.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.this$0._size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new MutableScatterMap$MutableMapWrapper$values$1$iterator$1(this.this$0);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (AbstractC3292y.d(mutableScatterMap.values[i11], obj)) {
                                mutableScatterMap.removeValueAt(i11);
                                return true;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    @Override // java.util.Collection
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
                            if (AbstractC1435t.d0(elements, mutableScatterMap.values[i11])) {
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

    @Override // java.util.Collection
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
                            if (!AbstractC1435t.d0(elements, mutableScatterMap.values[i11])) {
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

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC3283o.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        AbstractC3292y.i(array, "array");
        return (T[]) AbstractC3283o.b(this, array);
    }
}
