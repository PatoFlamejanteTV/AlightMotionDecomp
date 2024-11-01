package androidx.collection;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.annotation.IntRange;
import d6.InterfaceC2767a;
import d6.InterfaceC2768b;
import i6.i;
import i6.m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k6.AbstractC3258j;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    /* loaded from: classes.dex */
    private static final class MutableObjectListIterator<T> implements ListIterator<T>, InterfaceC2767a {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list, int i8) {
            AbstractC3292y.i(list, "list");
            this.list = list;
            this.prevIndex = i8 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t8) {
            List<T> list = this.list;
            int i8 = this.prevIndex + 1;
            this.prevIndex = i8;
            list.add(i8, t8);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.prevIndex < this.list.size() - 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.prevIndex >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i8 = this.prevIndex + 1;
            this.prevIndex = i8;
            return list.get(i8);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i8 = this.prevIndex;
            this.prevIndex = i8 - 1;
            return list.get(i8);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T t8) {
            this.list.set(this.prevIndex, t8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class ObjectListMutableList<T> implements List<T>, InterfaceC2768b {
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(MutableObjectList<T> objectList) {
            AbstractC3292y.i(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t8) {
            return this.objectList.add(t8);
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection<? extends T> elements) {
            AbstractC3292y.i(elements, "elements");
            return this.objectList.addAll(i8, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.objectList.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            AbstractC3292y.i(elements, "elements");
            return this.objectList.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int i8) {
            ObjectListKt.checkIndex(this, i8);
            return this.objectList.get(i8);
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.objectList.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.objectList.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i8) {
            return removeAt(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            AbstractC3292y.i(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        public T removeAt(int i8) {
            ObjectListKt.checkIndex(this, i8);
            return this.objectList.removeAt(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            AbstractC3292y.i(elements, "elements");
            return this.objectList.retainAll((Collection<? extends T>) elements);
        }

        @Override // java.util.List
        public T set(int i8, T t8) {
            ObjectListKt.checkIndex(this, i8);
            return this.objectList.set(i8, t8);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i8, int i9) {
            ObjectListKt.checkSubIndex(this, i8, i9);
            return new SubList(this, i8, i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC3283o.a(this);
        }

        @Override // java.util.List
        public void add(int i8, T t8) {
            this.objectList.add(i8, t8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            AbstractC3292y.i(elements, "elements");
            return this.objectList.addAll(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i8) {
            return new MutableObjectListIterator(this, i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.objectList.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            AbstractC3292y.i(array, "array");
            return (T[]) AbstractC3283o.b(this, array);
        }
    }

    /* loaded from: classes.dex */
    private static final class SubList<T> implements List<T>, InterfaceC2768b {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i8, int i9) {
            AbstractC3292y.i(list, "list");
            this.list = list;
            this.start = i8;
            this.end = i9;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t8) {
            List<T> list = this.list;
            int i8 = this.end;
            this.end = i8 + 1;
            list.add(i8, t8);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection<? extends T> elements) {
            AbstractC3292y.i(elements, "elements");
            this.list.addAll(i8 + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i8 = this.end - 1;
            int i9 = this.start;
            if (i9 <= i8) {
                while (true) {
                    this.list.remove(i8);
                    if (i8 == i9) {
                        break;
                    } else {
                        i8--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i8 = this.end;
            for (int i9 = this.start; i9 < i8; i9++) {
                if (AbstractC3292y.d(this.list.get(i9), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            AbstractC3292y.i(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i8) {
            ObjectListKt.checkIndex(this, i8);
            return this.list.get(i8 + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i8 = this.end;
            for (int i9 = this.start; i9 < i8; i9++) {
                if (AbstractC3292y.d(this.list.get(i9), obj)) {
                    return i9 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.end == this.start) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i8 = this.end - 1;
            int i9 = this.start;
            if (i9 <= i8) {
                while (!AbstractC3292y.d(this.list.get(i8), obj)) {
                    if (i8 != i9) {
                        i8--;
                    } else {
                        return -1;
                    }
                }
                return i8 - this.start;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i8) {
            return removeAt(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            AbstractC3292y.i(elements, "elements");
            int i8 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i8 != this.end) {
                return true;
            }
            return false;
        }

        public T removeAt(int i8) {
            ObjectListKt.checkIndex(this, i8);
            this.end--;
            return this.list.remove(i8 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            AbstractC3292y.i(elements, "elements");
            int i8 = this.end;
            int i9 = i8 - 1;
            int i10 = this.start;
            if (i10 <= i9) {
                while (true) {
                    if (!elements.contains(this.list.get(i9))) {
                        this.list.remove(i9);
                        this.end--;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9--;
                }
            }
            if (i8 != this.end) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public T set(int i8, T t8) {
            ObjectListKt.checkIndex(this, i8);
            return this.list.set(i8 + this.start, t8);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i8, int i9) {
            ObjectListKt.checkSubIndex(this, i8, i9);
            return new SubList(this, i8, i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC3283o.a(this);
        }

        @Override // java.util.List
        public void add(int i8, T t8) {
            this.list.add(i8 + this.start, t8);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i8) {
            return new MutableObjectListIterator(this, i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i8 = this.end;
            for (int i9 = this.start; i9 < i8; i9++) {
                if (AbstractC3292y.d(this.list.get(i9), obj)) {
                    this.list.remove(i9);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            AbstractC3292y.i(array, "array");
            return (T[]) AbstractC3283o.b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            AbstractC3292y.i(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = mutableObjectList._size;
        }
        mutableObjectList.trim(i8);
    }

    public final boolean add(E e8) {
        ensureCapacity(this._size + 1);
        Object[] objArr = this.content;
        int i8 = this._size;
        objArr[i8] = e8;
        this._size = i8 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i8, E[] elements) {
        int i9;
        AbstractC3292y.i(elements, "elements");
        if (i8 >= 0 && i8 <= (i9 = this._size)) {
            if (elements.length == 0) {
                return false;
            }
            ensureCapacity(i9 + elements.length);
            Object[] objArr = this.content;
            int i10 = this._size;
            if (i8 != i10) {
                AbstractC1428l.i(objArr, objArr, elements.length + i8, i8, i10);
            }
            AbstractC1428l.n(elements, objArr, i8, 0, 0, 12, null);
            this._size += elements.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    @Override // androidx.collection.ObjectList
    public List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList == null) {
            ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
            this.list = objectListMutableList2;
            return objectListMutableList2;
        }
        return objectListMutableList;
    }

    public final void clear() {
        AbstractC1428l.t(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int i8) {
        Object[] objArr = this.content;
        if (objArr.length < i8) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i8, (objArr.length * 3) / 2));
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(E e8) {
        remove(e8);
    }

    public final void plusAssign(ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements._size);
        AbstractC1428l.i(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    public final boolean remove(E e8) {
        int indexOf = indexOf(e8);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(E[] elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        for (E e8 : elements) {
            remove(e8);
        }
        return i8 != this._size;
    }

    public final E removeAt(@IntRange(from = 0) int i8) {
        int i9;
        if (i8 >= 0 && i8 < (i9 = this._size)) {
            Object[] objArr = this.content;
            E e8 = (E) objArr[i8];
            if (i8 != i9 - 1) {
                AbstractC1428l.i(objArr, objArr, i8, i8 + 1, i9);
            }
            int i10 = this._size - 1;
            this._size = i10;
            objArr[i10] = null;
            return e8;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i8);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void removeIf(Function1 predicate) {
        AbstractC3292y.i(predicate, "predicate");
        int i8 = this._size;
        Object[] objArr = this.content;
        int i9 = 0;
        i s8 = m.s(0, i8);
        int e8 = s8.e();
        int g8 = s8.g();
        if (e8 <= g8) {
            while (true) {
                objArr[e8 - i9] = objArr[e8];
                if (((Boolean) predicate.invoke(objArr[e8])).booleanValue()) {
                    i9++;
                }
                if (e8 == g8) {
                    break;
                } else {
                    e8++;
                }
            }
        }
        AbstractC1428l.t(objArr, null, i8 - i9, i8);
        this._size -= i9;
    }

    public final void removeRange(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        int i10;
        if (i8 >= 0 && i8 <= (i10 = this._size) && i9 >= 0 && i9 <= i10) {
            if (i9 >= i8) {
                if (i9 != i8) {
                    if (i9 < i10) {
                        Object[] objArr = this.content;
                        AbstractC1428l.i(objArr, objArr, i8, i9, i10);
                    }
                    int i11 = this._size;
                    int i12 = i11 - (i9 - i8);
                    AbstractC1428l.t(this.content, null, i12, i11);
                    this._size = i12;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i8 + ") is more than end (" + i9 + ')');
        }
        throw new IndexOutOfBoundsException("Start (" + i8 + ") and end (" + i9 + ") must be in 0.." + this._size);
    }

    public final boolean retainAll(E[] elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        Object[] objArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (AbstractC1428l.p0(elements, objArr[i9]) < 0) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final E set(@IntRange(from = 0) int i8, E e8) {
        if (i8 >= 0 && i8 < this._size) {
            Object[] objArr = this.content;
            E e9 = (E) objArr[i8];
            objArr[i8] = e8;
            return e9;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i8);
        sb.append(" must be between 0 .. ");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void trim(int i8) {
        int max = Math.max(i8, this._size);
        Object[] objArr = this.content;
        if (objArr.length > max) {
            Object[] copyOf = Arrays.copyOf(objArr, max);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public /* synthetic */ MutableObjectList(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 16 : i8);
    }

    public final void minusAssign(List<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        int size = elements.size();
        for (int i8 = 0; i8 < size; i8++) {
            remove(elements.get(i8));
        }
    }

    public MutableObjectList(int i8) {
        super(i8, null);
    }

    public final void add(@IntRange(from = 0) int i8, E e8) {
        int i9;
        if (i8 >= 0 && i8 <= (i9 = this._size)) {
            ensureCapacity(i9 + 1);
            Object[] objArr = this.content;
            int i10 = this._size;
            if (i8 != i10) {
                AbstractC1428l.i(objArr, objArr, i8 + 1, i8, i10);
            }
            objArr[i8] = e8;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final void minusAssign(E[] elements) {
        AbstractC3292y.i(elements, "elements");
        for (E e8 : elements) {
            remove(e8);
        }
    }

    public final boolean removeAll(ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        minusAssign((ObjectList) elements);
        return i8 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        Object[] objArr = elements.content;
        int i8 = elements._size;
        for (int i9 = 0; i9 < i8; i9++) {
            remove(objArr[i9]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        Object[] objArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (!elements.contains(objArr[i9])) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final boolean removeAll(ScatterSet<E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        minusAssign((ScatterSet) elements);
        return i8 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> elements) {
        AbstractC3292y.i(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        ensureCapacity(this._size + elements.getSize());
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        add(objArr[(i8 << 3) + i10]);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final boolean addAll(@IntRange(from = 0) int i8, Collection<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        if (i8 >= 0 && i8 <= this._size) {
            int i9 = 0;
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements.size());
            Object[] objArr = this.content;
            if (i8 != this._size) {
                AbstractC1428l.i(objArr, objArr, elements.size() + i8, i8, this._size);
            }
            for (Object obj : elements) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    AbstractC1435t.w();
                }
                objArr[i9 + i8] = obj;
                i9 = i10;
            }
            this._size += elements.size();
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> elements) {
        AbstractC3292y.i(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j8 = jArr[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        remove(objArr[(i8 << 3) + i10]);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final boolean removeAll(List<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        minusAssign((List) elements);
        return i8 != this._size;
    }

    public final boolean retainAll(Collection<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        Object[] objArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (!elements.contains(objArr[i9])) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        minusAssign((Iterable) elements);
        return i8 != this._size;
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(E[] elements) {
        AbstractC3292y.i(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        ensureCapacity(this._size + elements.length);
        AbstractC1428l.n(elements, this.content, this._size, 0, 0, 12, null);
        this._size += elements.length;
    }

    public final boolean removeAll(InterfaceC3255g elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        minusAssign(elements);
        return i8 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(InterfaceC3255g elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(Iterable<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        Object[] objArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (!AbstractC1435t.d0(elements, objArr[i9])) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final void plusAssign(List<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i8 = this._size;
        ensureCapacity(elements.size() + i8);
        Object[] objArr = this.content;
        int size = elements.size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9 + i8] = elements.get(i9);
        }
        this._size += elements.size();
    }

    public final boolean addAll(@IntRange(from = 0) int i8, ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        if (i8 >= 0 && i8 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            Object[] objArr = this.content;
            int i9 = this._size;
            if (i8 != i9) {
                AbstractC1428l.i(objArr, objArr, elements._size + i8, i8, i9);
            }
            AbstractC1428l.i(elements.content, objArr, i8, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final boolean retainAll(InterfaceC3255g elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        Object[] objArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (!AbstractC3258j.n(elements, objArr[i9])) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final void plusAssign(E e8) {
        add(e8);
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(InterfaceC3255g elements) {
        AbstractC3292y.i(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(ObjectList<E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        plusAssign((ObjectList) elements);
        return i8 != this._size;
    }

    public final boolean addAll(ScatterSet<E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        plusAssign((ScatterSet) elements);
        return i8 != this._size;
    }

    public final boolean addAll(E[] elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        plusAssign((Object[]) elements);
        return i8 != this._size;
    }

    public final boolean addAll(List<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        plusAssign((List) elements);
        return i8 != this._size;
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        plusAssign((Iterable) elements);
        return i8 != this._size;
    }

    public final boolean addAll(InterfaceC3255g elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        plusAssign(elements);
        return i8 != this._size;
    }
}
