package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.internal.ContainerHelpersKt;
import j$.util.Map;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V>, j$.util.Map {

    @Nullable
    ArrayMap<K, V>.EntrySet mEntrySet;

    @Nullable
    ArrayMap<K, V>.KeySet mKeySet;

    @Nullable
    ArrayMap<K, V>.ValueCollection mValues;

    /* loaded from: classes.dex */
    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NonNull
        public Iterator<Map.Entry<K, V>> iterator() {
            return new MapIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ArrayMap.this.size();
        }
    }

    /* loaded from: classes.dex */
    final class KeyIterator extends IndexBasedArrayIterator<K> {
        KeyIterator() {
            super(ArrayMap.this.size());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected K elementAt(int i8) {
            return ArrayMap.this.keyAt(i8);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i8) {
            ArrayMap.this.removeAt(i8);
        }
    }

    /* loaded from: classes.dex */
    final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int mEnd;
        boolean mEntryValid;
        int mIndex = -1;

        MapIterator() {
            this.mEnd = ArrayMap.this.size() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.mEntryValid) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!ContainerHelpersKt.equal(entry.getKey(), ArrayMap.this.keyAt(this.mIndex)) || !ContainerHelpersKt.equal(entry.getValue(), ArrayMap.this.valueAt(this.mIndex))) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.mEntryValid) {
                return ArrayMap.this.keyAt(this.mIndex);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.mEntryValid) {
                return ArrayMap.this.valueAt(this.mIndex);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.mIndex < this.mEnd) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            if (this.mEntryValid) {
                K keyAt = ArrayMap.this.keyAt(this.mIndex);
                V valueAt = ArrayMap.this.valueAt(this.mIndex);
                int i8 = 0;
                if (keyAt == null) {
                    hashCode = 0;
                } else {
                    hashCode = keyAt.hashCode();
                }
                if (valueAt != null) {
                    i8 = valueAt.hashCode();
                }
                return hashCode ^ i8;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.mEntryValid) {
                ArrayMap.this.removeAt(this.mIndex);
                this.mIndex--;
                this.mEnd--;
                this.mEntryValid = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v8) {
            if (this.mEntryValid) {
                return ArrayMap.this.setValueAt(this.mIndex, v8);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.mIndex++;
                this.mEntryValid = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes.dex */
    final class ValueIterator extends IndexBasedArrayIterator<V> {
        ValueIterator() {
            super(ArrayMap.this.size());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected V elementAt(int i8) {
            return ArrayMap.this.valueAt(i8);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int i8) {
            ArrayMap.this.removeAt(i8);
        }
    }

    public ArrayMap() {
    }

    static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        ArrayMap<K, V>.EntrySet entrySet = this.mEntrySet;
        if (entrySet == null) {
            ArrayMap<K, V>.EntrySet entrySet2 = new EntrySet();
            this.mEntrySet = entrySet2;
            return entrySet2;
        }
        return entrySet;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V get(@Nullable Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        ArrayMap<K, V>.KeySet keySet = this.mKeySet;
        if (keySet == null) {
            ArrayMap<K, V>.KeySet keySet2 = new KeySet();
            this.mKeySet = keySet2;
            return keySet2;
        }
        return keySet;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public void putAll(@NonNull java.util.Map<? extends K, ? extends V> map) {
        ensureCapacity(size() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V remove(@Nullable Object obj) {
        return (V) super.remove(obj);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(keyAt(size2))) {
                removeAt(size2);
            }
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        ArrayMap<K, V>.ValueCollection valueCollection = this.mValues;
        if (valueCollection == null) {
            ArrayMap<K, V>.ValueCollection valueCollection2 = new ValueCollection();
            this.mValues = valueCollection2;
            return valueCollection2;
        }
        return valueCollection;
    }

    public ArrayMap(int i8) {
        super(i8);
    }

    /* loaded from: classes.dex */
    final class KeySet implements Set<K> {
        KeySet() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k8) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(@NonNull Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ArrayMap.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@NonNull Collection<?> collection) {
            return ArrayMap.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return ArrayMap.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i8 = 0;
            for (int size = ArrayMap.this.size() - 1; size >= 0; size--) {
                K keyAt = ArrayMap.this.keyAt(size);
                if (keyAt == null) {
                    hashCode = 0;
                } else {
                    hashCode = keyAt.hashCode();
                }
                i8 += hashCode;
            }
            return i8;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int indexOfKey = ArrayMap.this.indexOfKey(obj);
            if (indexOfKey >= 0) {
                ArrayMap.this.removeAt(indexOfKey);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(@NonNull Collection<?> collection) {
            return ArrayMap.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(@NonNull Collection<?> collection) {
            return ArrayMap.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return ArrayMap.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public Object[] toArray() {
            int size = ArrayMap.this.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = ArrayMap.this.keyAt(i8);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public <T> T[] toArray(@NonNull T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i8 = 0; i8 < size; i8++) {
                tArr[i8] = ArrayMap.this.keyAt(i8);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* loaded from: classes.dex */
    final class ValueCollection implements Collection<V> {
        ValueCollection() {
        }

        @Override // java.util.Collection
        public boolean add(V v8) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(@NonNull Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            ArrayMap.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            if (ArrayMap.this.__restricted$indexOfValue(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int __restricted$indexOfValue = ArrayMap.this.__restricted$indexOfValue(obj);
            if (__restricted$indexOfValue >= 0) {
                ArrayMap.this.removeAt(__restricted$indexOfValue);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(@NonNull Collection<?> collection) {
            int size = ArrayMap.this.size();
            int i8 = 0;
            boolean z8 = false;
            while (i8 < size) {
                if (collection.contains(ArrayMap.this.valueAt(i8))) {
                    ArrayMap.this.removeAt(i8);
                    i8--;
                    size--;
                    z8 = true;
                }
                i8++;
            }
            return z8;
        }

        @Override // java.util.Collection
        public boolean retainAll(@NonNull Collection<?> collection) {
            int size = ArrayMap.this.size();
            int i8 = 0;
            boolean z8 = false;
            while (i8 < size) {
                if (!collection.contains(ArrayMap.this.valueAt(i8))) {
                    ArrayMap.this.removeAt(i8);
                    i8--;
                    size--;
                    z8 = true;
                }
                i8++;
            }
            return z8;
        }

        @Override // java.util.Collection
        public int size() {
            return ArrayMap.this.size();
        }

        @Override // java.util.Collection
        @NonNull
        public Object[] toArray() {
            int size = ArrayMap.this.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = ArrayMap.this.valueAt(i8);
            }
            return objArr;
        }

        @Override // java.util.Collection
        @NonNull
        public <T> T[] toArray(@NonNull T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i8 = 0; i8 < size; i8++) {
                tArr[i8] = ArrayMap.this.valueAt(i8);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public ArrayMap(@Nullable SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }
}
