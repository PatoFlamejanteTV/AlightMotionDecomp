package androidx.collection;

import R5.N;
import c6.InterfaceC2072n;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i8);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, InterfaceC2072n action) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        AbstractC3292y.i(action, "action");
        int size = sparseArrayCompat.size();
        for (int i8 = 0; i8 < size; i8++) {
            action.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i8)), sparseArrayCompat.valueAt(i8));
        }
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i8, T t8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i8, t8);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i8, Function0 defaultValue) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        AbstractC3292y.i(defaultValue, "defaultValue");
        T t8 = sparseArrayCompat.get(i8);
        if (t8 == null) {
            return (T) defaultValue.invoke();
        }
        return t8;
    }

    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> N keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        return new N() { // from class: androidx.collection.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.index < sparseArrayCompat.size()) {
                    return true;
                }
                return false;
            }

            @Override // R5.N
            public int nextInt() {
                SparseArrayCompat<T> sparseArrayCompat2 = sparseArrayCompat;
                int i8 = this.index;
                this.index = i8 + 1;
                return sparseArrayCompat2.keyAt(i8);
            }

            public final void setIndex(int i8) {
                this.index = i8;
            }
        };
    }

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> other) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        AbstractC3292y.i(other, "other");
        SparseArrayCompat<T> sparseArrayCompat2 = new SparseArrayCompat<>(sparseArrayCompat.size() + other.size());
        sparseArrayCompat2.putAll(sparseArrayCompat);
        sparseArrayCompat2.putAll(other);
        return sparseArrayCompat2;
    }

    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i8, Object obj) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i8, obj);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i8, T t8) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i8, t8);
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        AbstractC3292y.i(sparseArrayCompat, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArrayCompat);
    }
}
