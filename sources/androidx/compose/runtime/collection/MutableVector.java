package androidx.compose.runtime.collection;

import Q5.C1413h;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import d6.InterfaceC2767a;
import d6.InterfaceC2768b;
import i6.i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3283o;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;
    private T[] content;
    private List<T> list;
    private int size;

    /* loaded from: classes.dex */
    private static final class MutableVectorList<T> implements List<T>, InterfaceC2768b {
        private final MutableVector<T> vector;

        public MutableVectorList(MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t8) {
            return this.vector.add(t8);
        }

        @Override // java.util.List
        public boolean addAll(int i8, Collection<? extends T> collection) {
            return this.vector.addAll(i8, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            return this.vector.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i8) {
            MutableVectorKt.checkIndex(this, i8);
            return this.vector.getContent()[i8];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.vector.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i8) {
            return removeAt(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            return this.vector.removeAll(collection);
        }

        public T removeAt(int i8) {
            MutableVectorKt.checkIndex(this, i8);
            return this.vector.removeAt(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            return this.vector.retainAll(collection);
        }

        @Override // java.util.List
        public T set(int i8, T t8) {
            MutableVectorKt.checkIndex(this, i8);
            return this.vector.set(i8, t8);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i8, int i9) {
            MutableVectorKt.checkSubIndex(this, i8, i9);
            return new SubList(this, i8, i9);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC3283o.a(this);
        }

        @Override // java.util.List
        public void add(int i8, T t8) {
            this.vector.add(i8, t8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            return this.vector.addAll(collection);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i8) {
            return new VectorListIterator(this, i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.vector.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC3283o.b(this, tArr);
        }
    }

    /* loaded from: classes.dex */
    private static final class SubList<T> implements List<T>, InterfaceC2768b {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i8, int i9) {
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
        public boolean addAll(int i8, Collection<? extends T> collection) {
            this.list.addAll(i8 + this.start, collection);
            this.end += collection.size();
            return collection.size() > 0;
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
        public boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i8) {
            MutableVectorKt.checkIndex(this, i8);
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
            return new VectorListIterator(this, 0);
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
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i8) {
            return removeAt(i8);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            int i8 = this.end;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i8 != this.end) {
                return true;
            }
            return false;
        }

        public T removeAt(int i8) {
            MutableVectorKt.checkIndex(this, i8);
            this.end--;
            return this.list.remove(i8 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            int i8 = this.end;
            int i9 = i8 - 1;
            int i10 = this.start;
            if (i10 <= i9) {
                while (true) {
                    if (!collection.contains(this.list.get(i9))) {
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
            MutableVectorKt.checkIndex(this, i8);
            return this.list.set(i8 + this.start, t8);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public List<T> subList(int i8, int i9) {
            MutableVectorKt.checkSubIndex(this, i8, i9);
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
            return new VectorListIterator(this, i8);
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
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC3283o.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            this.list.addAll(this.end, collection);
            this.end += collection.size();
            return collection.size() > 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class VectorListIterator<T> implements ListIterator<T>, InterfaceC2767a {
        private int index;
        private final List<T> list;

        public VectorListIterator(List<T> list, int i8) {
            this.list = list;
            this.index = i8;
        }

        @Override // java.util.ListIterator
        public void add(T t8) {
            this.list.add(this.index, t8);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.index < this.list.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.index > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i8 = this.index;
            this.index = i8 + 1;
            return list.get(i8);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i8 = this.index - 1;
            this.index = i8;
            return this.list.get(i8);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i8 = this.index - 1;
            this.index = i8;
            this.list.remove(i8);
        }

        @Override // java.util.ListIterator
        public void set(T t8) {
            this.list.set(this.index, t8);
        }
    }

    public MutableVector(T[] tArr, int i8) {
        this.content = tArr;
        this.size = i8;
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean add(T t8) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i8 = this.size;
        tArr[i8] = t8;
        this.size = i8 + 1;
        return true;
    }

    public final boolean addAll(int i8, List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + list.size());
        T[] tArr = this.content;
        if (i8 != this.size) {
            AbstractC1428l.i(tArr, tArr, list.size() + i8, i8, this.size);
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            tArr[i8 + i9] = list.get(i9);
        }
        this.size += list.size();
        return true;
    }

    public final boolean any(Function1 function1) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i8 = 0;
            while (!((Boolean) function1.invoke(content[i8])).booleanValue()) {
                i8++;
                if (i8 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list == null) {
            MutableVectorList mutableVectorList = new MutableVectorList(this);
            this.list = mutableVectorList;
            return mutableVectorList;
        }
        return list;
    }

    public final void clear() {
        T[] tArr = this.content;
        int size = getSize();
        while (true) {
            size--;
            if (-1 < size) {
                tArr[size] = null;
            } else {
                this.size = 0;
                return;
            }
        }
    }

    public final boolean contains(T t8) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i8 = 0; !AbstractC3292y.d(getContent()[i8], t8); i8++) {
                if (i8 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(List<? extends T> list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!contains(list.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(MutableVector<T> mutableVector) {
        if (mutableVector.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i8 = 0; AbstractC3292y.d(mutableVector.getContent()[i8], getContent()[i8]); i8++) {
                if (i8 != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i8) {
        T[] tArr = this.content;
        if (tArr.length < i8) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i8, tArr.length * 2));
            AbstractC3292y.h(tArr2, "copyOf(this, newSize)");
            this.content = tArr2;
        }
    }

    public final T first() {
        if (!isEmpty()) {
            return getContent()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[0];
    }

    public final <R> R fold(R r8, InterfaceC2072n interfaceC2072n) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i8 = 0;
            do {
                r8 = (R) interfaceC2072n.invoke(r8, content[i8]);
                i8++;
            } while (i8 < size);
        }
        return r8;
    }

    public final <R> R foldIndexed(R r8, InterfaceC2073o interfaceC2073o) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i8 = 0;
            do {
                r8 = (R) interfaceC2073o.invoke(Integer.valueOf(i8), r8, content[i8]);
                i8++;
            } while (i8 < size);
        }
        return r8;
    }

    public final <R> R foldRight(R r8, InterfaceC2072n interfaceC2072n) {
        int size = getSize();
        if (size > 0) {
            int i8 = size - 1;
            T[] content = getContent();
            do {
                r8 = (R) interfaceC2072n.invoke(content[i8], r8);
                i8--;
            } while (i8 >= 0);
        }
        return r8;
    }

    public final <R> R foldRightIndexed(R r8, InterfaceC2073o interfaceC2073o) {
        int size = getSize();
        if (size > 0) {
            int i8 = size - 1;
            T[] content = getContent();
            do {
                r8 = (R) interfaceC2073o.invoke(Integer.valueOf(i8), content[i8], r8);
                i8--;
            } while (i8 >= 0);
        }
        return r8;
    }

    public final void forEach(Function1 function1) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i8 = 0;
            do {
                function1.invoke(content[i8]);
                i8++;
            } while (i8 < size);
        }
    }

    public final void forEachIndexed(InterfaceC2072n interfaceC2072n) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i8 = 0;
            do {
                interfaceC2072n.invoke(Integer.valueOf(i8), content[i8]);
                i8++;
            } while (i8 < size);
        }
    }

    public final void forEachReversed(Function1 function1) {
        int size = getSize();
        if (size > 0) {
            int i8 = size - 1;
            T[] content = getContent();
            do {
                function1.invoke(content[i8]);
                i8--;
            } while (i8 >= 0);
        }
    }

    public final void forEachReversedIndexed(InterfaceC2072n interfaceC2072n) {
        if (getSize() > 0) {
            int size = getSize() - 1;
            T[] content = getContent();
            do {
                interfaceC2072n.invoke(Integer.valueOf(size), content[size]);
                size--;
            } while (size >= 0);
        }
    }

    public final T get(int i8) {
        return getContent()[i8];
    }

    public final T[] getContent() {
        return this.content;
    }

    public final i getIndices() {
        return new i(0, getSize() - 1);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T t8) {
        int i8 = this.size;
        if (i8 > 0) {
            T[] tArr = this.content;
            int i9 = 0;
            while (!AbstractC3292y.d(t8, tArr[i9])) {
                i9++;
                if (i9 >= i8) {
                    return -1;
                }
            }
            return i9;
        }
        return -1;
    }

    public final int indexOfFirst(Function1 function1) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i8 = 0;
            while (!((Boolean) function1.invoke(content[i8])).booleanValue()) {
                i8++;
                if (i8 >= size) {
                    return -1;
                }
            }
            return i8;
        }
        return -1;
    }

    public final int indexOfLast(Function1 function1) {
        int size = getSize();
        if (size > 0) {
            int i8 = size - 1;
            T[] content = getContent();
            while (!((Boolean) function1.invoke(content[i8])).booleanValue()) {
                i8--;
                if (i8 < 0) {
                    return -1;
                }
            }
            return i8;
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.size != 0) {
            return true;
        }
        return false;
    }

    public final T last() {
        if (!isEmpty()) {
            return getContent()[getSize() - 1];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int lastIndexOf(T t8) {
        int i8 = this.size;
        if (i8 > 0) {
            int i9 = i8 - 1;
            T[] tArr = this.content;
            while (!AbstractC3292y.d(t8, tArr[i9])) {
                i9--;
                if (i9 < 0) {
                    return -1;
                }
            }
            return i9;
        }
        return -1;
    }

    public final T lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[getSize() - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] map(Function1 function1) {
        int size = getSize();
        AbstractC3292y.n(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i8 = 0; i8 < size; i8++) {
            rArr[i8] = function1.invoke(getContent()[i8]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] mapIndexed(InterfaceC2072n interfaceC2072n) {
        int size = getSize();
        AbstractC3292y.n(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i8 = 0; i8 < size; i8++) {
            rArr[i8] = interfaceC2072n.invoke(Integer.valueOf(i8), getContent()[i8]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(InterfaceC2072n interfaceC2072n) {
        int size = getSize();
        int i8 = 0;
        AbstractC3292y.n(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i9 = 0;
            do {
                Object invoke = interfaceC2072n.invoke(Integer.valueOf(i8), content[i8]);
                if (invoke != null) {
                    objArr[i9] = invoke;
                    i9++;
                }
                i8++;
            } while (i8 < size);
            i8 = i9;
        }
        return new MutableVector<>(objArr, i8);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1 function1) {
        int size = getSize();
        int i8 = 0;
        AbstractC3292y.n(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i9 = 0;
            do {
                Object invoke = function1.invoke(content[i8]);
                if (invoke != null) {
                    objArr[i9] = invoke;
                    i9++;
                }
                i8++;
            } while (i8 < size);
            i8 = i9;
        }
        return new MutableVector<>(objArr, i8);
    }

    public final void minusAssign(T t8) {
        remove(t8);
    }

    public final void plusAssign(T t8) {
        add(t8);
    }

    public final boolean remove(T t8) {
        int indexOf = indexOf(t8);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(List<? extends T> list) {
        int i8 = this.size;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            remove(list.get(i9));
        }
        return i8 != this.size;
    }

    public final T removeAt(int i8) {
        T[] tArr = this.content;
        T t8 = tArr[i8];
        if (i8 != getSize() - 1) {
            AbstractC1428l.i(tArr, tArr, i8, i8 + 1, this.size);
        }
        int i9 = this.size - 1;
        this.size = i9;
        tArr[i9] = null;
        return t8;
    }

    public final void removeIf(Function1 function1) {
        int size = getSize();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            if (((Boolean) function1.invoke(getContent()[i9])).booleanValue()) {
                i8++;
            } else if (i8 > 0) {
                getContent()[i9 - i8] = getContent()[i9];
            }
        }
        int i10 = size - i8;
        AbstractC1428l.t(getContent(), null, i10, size);
        setSize(i10);
    }

    public final void removeRange(int i8, int i9) {
        if (i9 > i8) {
            int i10 = this.size;
            if (i9 < i10) {
                T[] tArr = this.content;
                AbstractC1428l.i(tArr, tArr, i8, i9, i10);
            }
            int i11 = this.size - (i9 - i8);
            int size = getSize() - 1;
            if (i11 <= size) {
                int i12 = i11;
                while (true) {
                    this.content[i12] = null;
                    if (i12 == size) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.size = i11;
        }
    }

    public final boolean retainAll(Collection<? extends T> collection) {
        int i8 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!collection.contains(getContent()[size])) {
                removeAt(size);
            }
        }
        if (i8 != this.size) {
            return true;
        }
        return false;
    }

    public final boolean reversedAny(Function1 function1) {
        int size = getSize();
        if (size > 0) {
            int i8 = size - 1;
            T[] content = getContent();
            while (!((Boolean) function1.invoke(content[i8])).booleanValue()) {
                i8--;
                if (i8 < 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final T set(int i8, T t8) {
        T[] tArr = this.content;
        T t9 = tArr[i8];
        tArr[i8] = t8;
        return t9;
    }

    public final void setContent(T[] tArr) {
        this.content = tArr;
    }

    public final void setSize(int i8) {
        this.size = i8;
    }

    public final void sortWith(Comparator<T> comparator) {
        AbstractC1428l.L(this.content, comparator, 0, this.size);
    }

    public final int sumBy(Function1 function1) {
        int size = getSize();
        int i8 = 0;
        if (size > 0) {
            T[] content = getContent();
            int i9 = 0;
            do {
                i8 += ((Number) function1.invoke(content[i9])).intValue();
                i9++;
            } while (i9 < size);
        }
        return i8;
    }

    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean containsAll(Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final T firstOrNull(Function1 function1) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        T[] content = getContent();
        int i8 = 0;
        do {
            T t8 = content[i8];
            if (((Boolean) function1.invoke(t8)).booleanValue()) {
                return t8;
            }
            i8++;
        } while (i8 < size);
        return null;
    }

    public final void add(int i8, T t8) {
        ensureCapacity(this.size + 1);
        T[] tArr = this.content;
        int i9 = this.size;
        if (i8 != i9) {
            AbstractC1428l.i(tArr, tArr, i8 + 1, i8, i9);
        }
        tArr[i8] = t8;
        this.size++;
    }

    public final T first(Function1 function1) {
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i8 = 0;
            do {
                T t8 = content[i8];
                if (((Boolean) function1.invoke(t8)).booleanValue()) {
                    return t8;
                }
                i8++;
            } while (i8 < size);
        }
        throwNoSuchElementException();
        throw new C1413h();
    }

    public final T lastOrNull(Function1 function1) {
        int size = getSize();
        if (size <= 0) {
            return null;
        }
        int i8 = size - 1;
        T[] content = getContent();
        do {
            T t8 = content[i8];
            if (((Boolean) function1.invoke(t8)).booleanValue()) {
                return t8;
            }
            i8--;
        } while (i8 >= 0);
        return null;
    }

    public final T last(Function1 function1) {
        int size = getSize();
        if (size > 0) {
            int i8 = size - 1;
            T[] content = getContent();
            do {
                T t8 = content[i8];
                if (((Boolean) function1.invoke(t8)).booleanValue()) {
                    return t8;
                }
                i8--;
            } while (i8 >= 0);
        }
        throwNoSuchElementException();
        throw new C1413h();
    }

    public final boolean removeAll(MutableVector<T> mutableVector) {
        int i8 = this.size;
        int size = mutableVector.getSize() - 1;
        if (size >= 0) {
            int i9 = 0;
            while (true) {
                remove(mutableVector.getContent()[i9]);
                if (i9 == size) {
                    break;
                }
                i9++;
            }
        }
        return i8 != this.size;
    }

    public final boolean containsAll(MutableVector<T> mutableVector) {
        i iVar = new i(0, mutableVector.getSize() - 1);
        int e8 = iVar.e();
        int g8 = iVar.g();
        if (e8 <= g8) {
            while (contains(mutableVector.getContent()[e8])) {
                if (e8 != g8) {
                    e8++;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean removeAll(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i8 = this.size;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i8 != this.size;
    }

    public final boolean addAll(int i8, MutableVector<T> mutableVector) {
        if (mutableVector.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + mutableVector.size);
        T[] tArr = this.content;
        int i9 = this.size;
        if (i8 != i9) {
            AbstractC1428l.i(tArr, tArr, mutableVector.size + i8, i8, i9);
        }
        AbstractC1428l.i(mutableVector.content, tArr, i8, 0, mutableVector.size);
        this.size += mutableVector.size;
        return true;
    }

    public final boolean addAll(List<? extends T> list) {
        return addAll(getSize(), (List) list);
    }

    public final boolean addAll(MutableVector<T> mutableVector) {
        return addAll(getSize(), mutableVector);
    }

    public final boolean addAll(T[] tArr) {
        if (tArr.length == 0) {
            return false;
        }
        ensureCapacity(this.size + tArr.length);
        AbstractC1428l.n(tArr, this.content, this.size, 0, 0, 12, null);
        this.size += tArr.length;
        return true;
    }

    public final boolean addAll(int i8, Collection<? extends T> collection) {
        int i9 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        ensureCapacity(this.size + collection.size());
        T[] tArr = this.content;
        if (i8 != this.size) {
            AbstractC1428l.i(tArr, tArr, collection.size() + i8, i8, this.size);
        }
        for (T t8 : collection) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC1435t.w();
            }
            tArr[i9 + i8] = t8;
            i9 = i10;
        }
        this.size += collection.size();
        return true;
    }

    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.size, collection);
    }
}
