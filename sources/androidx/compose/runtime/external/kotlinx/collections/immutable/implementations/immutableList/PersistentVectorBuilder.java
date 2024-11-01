package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import R5.AbstractC1422f;
import R5.AbstractC1428l;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.m;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3274f;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends AbstractC1422f implements PersistentList.Builder<E> {
    public static final int $stable = 8;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList<? extends E> vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    public PersistentVectorBuilder(PersistentList<? extends E> persistentList, Object[] objArr, Object[] objArr2, int i8) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i8;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] bufferFor(int i8) {
        if (rootSize() <= i8) {
            return this.tail;
        }
        Object[] objArr = this.root;
        AbstractC3292y.f(objArr);
        for (int i9 = this.rootShift; i9 > 0; i9 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i8, i9)];
            AbstractC3292y.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i8, Iterator<? extends Object> it) {
        while (i8 < 32 && it.hasNext()) {
            objArr[i8] = it.next();
            i8++;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i8, int i9, Object obj, ObjectRef objectRef) {
        Object obj2;
        int indexSegment = UtilsKt.indexSegment(i9, i8);
        if (i8 == 0) {
            objectRef.setValue(objArr[31]);
            Object[] i10 = AbstractC1428l.i(objArr, makeMutable(objArr), indexSegment + 1, indexSegment, 31);
            i10[indexSegment] = obj;
            return i10;
        }
        Object[] makeMutable = makeMutable(objArr);
        int i11 = i8 - 5;
        Object obj3 = makeMutable[indexSegment];
        AbstractC3292y.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = insertIntoRoot((Object[]) obj3, i11, i9, obj, objectRef);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj2 = makeMutable[indexSegment]) == null) {
                break;
            }
            AbstractC3292y.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            makeMutable[indexSegment] = insertIntoRoot((Object[]) obj2, i11, 0, objectRef.getValue(), objectRef);
        }
        return makeMutable;
    }

    private final void insertIntoTail(Object[] objArr, int i8, E e8) {
        int tailSize = tailSize();
        Object[] makeMutable = makeMutable(this.tail);
        if (tailSize < 32) {
            AbstractC1428l.i(this.tail, makeMutable, i8 + 1, i8, tailSize);
            makeMutable[i8] = e8;
            this.root = objArr;
            this.tail = makeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr2 = this.tail;
        Object obj = objArr2[31];
        AbstractC1428l.i(objArr2, makeMutable, i8 + 1, i8, 31);
        makeMutable[i8] = e8;
        pushFilledTail(objArr, makeMutable, mutableBufferWith(obj));
    }

    private final boolean isMutable(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.ownership) {
            return true;
        }
        return false;
    }

    private final ListIterator<Object[]> leafBufferIterator(int i8) {
        Object[] objArr = this.root;
        if (objArr != null) {
            int rootSize = rootSize() >> 5;
            ListImplementation.checkPositionIndex$runtime_release(i8, rootSize);
            int i9 = this.rootShift;
            if (i9 == 0) {
                return new SingleElementListIterator(objArr, i8);
            }
            return new TrieIterator(objArr, i8, rootSize, i9 / 5);
        }
        throw new IllegalStateException("Invalid root".toString());
    }

    private final Object[] makeMutable(Object[] objArr) {
        if (objArr == null) {
            return mutableBuffer();
        }
        if (isMutable(objArr)) {
            return objArr;
        }
        return AbstractC1428l.n(objArr, mutableBuffer(), 0, 0, m.g(objArr.length, 32), 6, null);
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i8) {
        if (isMutable(objArr)) {
            return AbstractC1428l.i(objArr, objArr, i8, 0, 32 - i8);
        }
        return AbstractC1428l.i(objArr, mutableBuffer(), i8, 0, 32 - i8);
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] objArr, int i8, int i9) {
        if (i9 >= 0) {
            if (i9 == 0) {
                return objArr;
            }
            int indexSegment = UtilsKt.indexSegment(i8, i9);
            Object obj = objArr[indexSegment];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object nullifyAfter = nullifyAfter((Object[]) obj, i8, i9 - 5);
            if (indexSegment < 31) {
                int i10 = indexSegment + 1;
                if (objArr[i10] != null) {
                    if (isMutable(objArr)) {
                        AbstractC1428l.t(objArr, null, i10, 32);
                    }
                    objArr = AbstractC1428l.i(objArr, mutableBuffer(), 0, 0, i10);
                }
            }
            if (nullifyAfter != objArr[indexSegment]) {
                Object[] makeMutable = makeMutable(objArr);
                makeMutable[indexSegment] = nullifyAfter;
                return makeMutable;
            }
            return objArr;
        }
        throw new IllegalArgumentException("shift should be positive".toString());
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i8, int i9, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i9 - 1, i8);
        if (i8 == 5) {
            objectRef.setValue(objArr[indexSegment]);
            pullLastBuffer = null;
        } else {
            Object obj = objArr[indexSegment];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            pullLastBuffer = pullLastBuffer((Object[]) obj, i8 - 5, i9, objectRef);
        }
        if (pullLastBuffer == null && indexSegment == 0) {
            return null;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = pullLastBuffer;
        return makeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i8, int i9) {
        if (i9 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i8;
            this.rootShift = i9;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        AbstractC3292y.f(objArr);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i9, i8, objectRef);
        AbstractC3292y.f(pullLastBuffer);
        Object value = objectRef.getValue();
        AbstractC3292y.g(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = i8;
        if (pullLastBuffer[1] == null) {
            this.root = (Object[]) pullLastBuffer[0];
            this.rootShift = i9 - 5;
        } else {
            this.root = pullLastBuffer;
            this.rootShift = i9;
        }
    }

    private final Object[] pushBuffers(Object[] objArr, int i8, int i9, Iterator<Object[]> it) {
        if (it.hasNext()) {
            if (i9 >= 0) {
                if (i9 == 0) {
                    return it.next();
                }
                Object[] makeMutable = makeMutable(objArr);
                int indexSegment = UtilsKt.indexSegment(i8, i9);
                int i10 = i9 - 5;
                makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], i8, i10, it);
                while (true) {
                    indexSegment++;
                    if (indexSegment >= 32 || !it.hasNext()) {
                        break;
                    }
                    makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], 0, i10, it);
                }
                return makeMutable;
            }
            throw new IllegalArgumentException("negative shift".toString());
        }
        throw new IllegalArgumentException("invalid buffersIterator".toString());
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i8, Object[][] objArr2) {
        Object[] makeMutable;
        Iterator<Object[]> a9 = AbstractC3274f.a(objArr2);
        int i9 = i8 >> 5;
        int i10 = this.rootShift;
        if (i9 < (1 << i10)) {
            makeMutable = pushBuffers(objArr, i8, i10, a9);
        } else {
            makeMutable = makeMutable(objArr);
        }
        while (a9.hasNext()) {
            this.rootShift += 5;
            makeMutable = mutableBufferWith(makeMutable);
            int i11 = this.rootShift;
            pushBuffers(makeMutable, 1 << i11, i11, a9);
        }
        return makeMutable;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i8 = this.rootShift;
        if (size > (1 << i8)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i8);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i8) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, i8);
        Object[] makeMutable = makeMutable(objArr);
        if (i8 == 5) {
            makeMutable[indexSegment] = objArr2;
        } else {
            makeMutable[indexSegment] = pushTail((Object[]) makeMutable[indexSegment], objArr2, i8 - 5);
        }
        return makeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(Function1 function1, Object[] objArr, int i8, int i9, ObjectRef objectRef, List<Object[]> list, List<Object[]> list2) {
        Object[] mutableBuffer;
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = objectRef.getValue();
        AbstractC3292y.g(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        Object[] objArr3 = objArr2;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i9 == 32) {
                    if (!list.isEmpty()) {
                        mutableBuffer = list.remove(list.size() - 1);
                    } else {
                        mutableBuffer = mutableBuffer();
                    }
                    objArr3 = mutableBuffer;
                    i9 = 0;
                }
                objArr3[i9] = obj;
                i9++;
            }
        }
        objectRef.setValue(objArr3);
        if (objArr2 != objectRef.getValue()) {
            list2.add(objArr2);
        }
        return i9;
    }

    private final int removeAllFromTail(Function1 function1, int i8, ObjectRef objectRef) {
        boolean z8;
        int removeAll = removeAll(function1, this.tail, i8, objectRef);
        if (removeAll == i8) {
            if (objectRef.getValue() == this.tail) {
                z8 = true;
            } else {
                z8 = false;
            }
            CommonFunctionsKt.m2559assert(z8);
            return i8;
        }
        Object value = objectRef.getValue();
        AbstractC3292y.g(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        AbstractC1428l.t(objArr, null, removeAll, i8);
        this.tail = objArr;
        this.size = size() - (i8 - removeAll);
        return removeAll;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i8, int i9, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i9, i8);
        int i10 = 31;
        if (i8 == 0) {
            Object obj = objArr[indexSegment];
            Object[] i11 = AbstractC1428l.i(objArr, makeMutable(objArr), indexSegment, indexSegment + 1, 32);
            i11[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return i11;
        }
        if (objArr[31] == null) {
            i10 = UtilsKt.indexSegment(rootSize() - 1, i8);
        }
        Object[] makeMutable = makeMutable(objArr);
        int i12 = i8 - 5;
        int i13 = indexSegment + 1;
        if (i13 <= i10) {
            while (true) {
                Object obj2 = makeMutable[i10];
                AbstractC3292y.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                makeMutable[i10] = removeFromRootAt((Object[]) obj2, i12, 0, objectRef);
                if (i10 == i13) {
                    break;
                }
                i10--;
            }
        }
        Object obj3 = makeMutable[indexSegment];
        AbstractC3292y.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = removeFromRootAt((Object[]) obj3, i12, i9, objectRef);
        return makeMutable;
    }

    private final Object removeFromTailAt(Object[] objArr, int i8, int i9, int i10) {
        boolean z8;
        int size = size() - i8;
        if (i10 < size) {
            z8 = true;
        } else {
            z8 = false;
        }
        CommonFunctionsKt.m2559assert(z8);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(objArr, i8, i9);
            return obj;
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[i10];
        Object[] i11 = AbstractC1428l.i(objArr2, makeMutable(objArr2), i10, i10 + 1, size);
        i11[size - 1] = null;
        this.root = objArr;
        this.tail = i11;
        this.size = (i8 + size) - 1;
        this.rootShift = i9;
        return obj2;
    }

    private final Object[] retainFirst(Object[] objArr, int i8) {
        if ((i8 & 31) == 0) {
            if (i8 == 0) {
                this.rootShift = 0;
                return null;
            }
            int i9 = i8 - 1;
            while (true) {
                int i10 = this.rootShift;
                if ((i9 >> i10) == 0) {
                    this.rootShift = i10 - 5;
                    Object[] objArr2 = objArr[0];
                    AbstractC3292y.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr = objArr2;
                } else {
                    return nullifyAfter(objArr, i9, i10);
                }
            }
        } else {
            throw new IllegalArgumentException("invalid size".toString());
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i8, int i9, E e8, ObjectRef objectRef) {
        int indexSegment = UtilsKt.indexSegment(i9, i8);
        Object[] makeMutable = makeMutable(objArr);
        if (i8 == 0) {
            if (makeMutable != objArr) {
                ((AbstractList) this).modCount++;
            }
            objectRef.setValue(makeMutable[indexSegment]);
            makeMutable[indexSegment] = e8;
            return makeMutable;
        }
        Object obj = makeMutable[indexSegment];
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        makeMutable[indexSegment] = setInRoot((Object[]) obj, i8 - 5, i9, e8, objectRef);
        return makeMutable;
    }

    private final Object[] shiftLeafBuffers(int i8, int i9, Object[][] objArr, int i10, Object[] objArr2) {
        if (this.root != null) {
            ListIterator<Object[]> leafBufferIterator = leafBufferIterator(rootSize() >> 5);
            while (leafBufferIterator.previousIndex() != i8) {
                Object[] previous = leafBufferIterator.previous();
                AbstractC1428l.i(previous, objArr2, 0, 32 - i9, 32);
                objArr2 = makeMutableShiftingRight(previous, i9);
                i10--;
                objArr[i10] = objArr2;
            }
            return leafBufferIterator.previous();
        }
        throw new IllegalStateException("root is null".toString());
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i8, Object[] objArr, int i9, Object[][] objArr2, int i10, Object[] objArr3) {
        Object[] mutableBuffer;
        if (i10 >= 1) {
            Object[] makeMutable = makeMutable(objArr);
            objArr2[0] = makeMutable;
            int i11 = i8 & 31;
            int size = ((i8 + collection.size()) - 1) & 31;
            int i12 = (i9 - i11) + size;
            if (i12 < 32) {
                AbstractC1428l.i(makeMutable, objArr3, size + 1, i11, i9);
            } else {
                int i13 = i12 - 31;
                if (i10 == 1) {
                    mutableBuffer = makeMutable;
                } else {
                    mutableBuffer = mutableBuffer();
                    i10--;
                    objArr2[i10] = mutableBuffer;
                }
                int i14 = i9 - i13;
                AbstractC1428l.i(makeMutable, objArr3, 0, i14, i9);
                AbstractC1428l.i(makeMutable, mutableBuffer, size + 1, i11, i14);
                objArr3 = mutableBuffer;
            }
            Iterator<? extends E> it = collection.iterator();
            copyToBuffer(makeMutable, i11, it);
            for (int i15 = 1; i15 < i10; i15++) {
                objArr2[i15] = copyToBuffer(mutableBuffer(), 0, it);
            }
            copyToBuffer(objArr3, 0, it);
            return;
        }
        throw new IllegalArgumentException("requires at least one nullBuffer".toString());
    }

    private final int tailSize(int i8) {
        return i8 <= 32 ? i8 : i8 - UtilsKt.rootSize(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e8) {
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        if (tailSize < 32) {
            Object[] makeMutable = makeMutable(this.tail);
            makeMutable[tailSize] = e8;
            this.tail = makeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e8));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        Iterator<? extends E> it = collection.iterator();
        if (32 - tailSize >= collection.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), tailSize, it);
            this.size = size() + collection.size();
        } else {
            int size = ((collection.size() + tailSize) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = copyToBuffer(makeMutable(this.tail), tailSize, it);
            for (int i8 = 1; i8 < size; i8++) {
                objArr[i8] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + collection.size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i8) {
        ListImplementation.checkElementIndex$runtime_release(i8, size());
        return (E) bufferFor(i8)[i8 & 31];
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    @Override // R5.AbstractC1422f
    public int getSize() {
        return this.size;
    }

    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        return removeAllWithPredicate(new PersistentVectorBuilder$removeAll$1(collection));
    }

    public final boolean removeAllWithPredicate(Function1 function1) {
        boolean removeAll = removeAll(function1);
        if (removeAll) {
            ((AbstractList) this).modCount++;
        }
        return removeAll;
    }

    @Override // R5.AbstractC1422f
    public E removeAt(int i8) {
        ListImplementation.checkElementIndex$runtime_release(i8, size());
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i8 >= rootSize) {
            return (E) removeFromTailAt(this.root, rootSize, this.rootShift, i8 - rootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        AbstractC3292y.f(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i8, objectRef), rootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i8, E e8) {
        ListImplementation.checkElementIndex$runtime_release(i8, size());
        if (rootSize() <= i8) {
            Object[] makeMutable = makeMutable(this.tail);
            if (makeMutable != this.tail) {
                ((AbstractList) this).modCount++;
            }
            int i9 = i8 & 31;
            E e9 = (E) makeMutable[i9];
            makeMutable[i9] = e8;
            this.tail = makeMutable;
            return e9;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        AbstractC3292y.f(objArr);
        this.root = setInRoot(objArr, this.rootShift, i8, e8, objectRef);
        return (E) objectRef.getValue();
    }

    public final void setRootShift$runtime_release(int i8) {
        this.rootShift = i8;
    }

    private final boolean removeAll(Function1 function1) {
        Object[] pushBuffers;
        int tailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(function1, tailSize, objectRef) != tailSize;
        }
        ListIterator<Object[]> leafBufferIterator = leafBufferIterator(0);
        int i8 = 32;
        while (i8 == 32 && leafBufferIterator.hasNext()) {
            i8 = removeAll(function1, leafBufferIterator.next(), 32, objectRef);
        }
        if (i8 == 32) {
            CommonFunctionsKt.m2559assert(!leafBufferIterator.hasNext());
            int removeAllFromTail = removeAllFromTail(function1, tailSize, objectRef);
            if (removeAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return removeAllFromTail != tailSize;
        }
        int previousIndex = leafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i9 = i8;
        while (leafBufferIterator.hasNext()) {
            i9 = recyclableRemoveAll(function1, leafBufferIterator.next(), 32, i9, objectRef, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i10 = previousIndex;
        int recyclableRemoveAll = recyclableRemoveAll(function1, this.tail, tailSize, i9, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        AbstractC3292y.g(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        AbstractC1428l.t(objArr, null, recyclableRemoveAll, 32);
        if (arrayList.isEmpty()) {
            pushBuffers = this.root;
            AbstractC3292y.f(pushBuffers);
        } else {
            pushBuffers = pushBuffers(this.root, i10, this.rootShift, arrayList.iterator());
        }
        int size = i10 + (arrayList.size() << 5);
        this.root = retainFirst(pushBuffers, size);
        this.tail = objArr;
        this.size = size + recyclableRemoveAll;
        return true;
    }

    private final int tailSize() {
        return tailSize(size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = UtilsKt.persistentVectorOf();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.tail, size());
                    AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
                    persistentVector = new SmallPersistentVector(copyOf);
                }
            } else {
                Object[] objArr3 = this.root;
                AbstractC3292y.f(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i8) {
        ListImplementation.checkPositionIndex$runtime_release(i8, size());
        return new PersistentVectorMutableIterator(this, i8);
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i8, int i9, Object[][] objArr, int i10, Object[] objArr2) {
        if (this.root != null) {
            int i11 = i8 >> 5;
            Object[] shiftLeafBuffers = shiftLeafBuffers(i11, i9, objArr, i10, objArr2);
            int rootSize = i10 - (((rootSize() >> 5) - 1) - i11);
            if (rootSize < i10) {
                objArr2 = objArr[rootSize];
                AbstractC3292y.f(objArr2);
            }
            splitToBuffers(collection, i8, shiftLeafBuffers, 32, objArr, rootSize, objArr2);
            return;
        }
        throw new IllegalStateException("root is null".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i8, E e8) {
        ListImplementation.checkPositionIndex$runtime_release(i8, size());
        if (i8 == size()) {
            add(e8);
            return;
        }
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i8 >= rootSize) {
            insertIntoTail(this.root, i8 - rootSize, e8);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        AbstractC3292y.f(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i8, e8, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection<? extends E> collection) {
        Object[] i9;
        ListImplementation.checkPositionIndex$runtime_release(i8, size());
        if (i8 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (i8 >> 5) << 5;
        int size = (((size() - i10) + collection.size()) - 1) / 32;
        if (size == 0) {
            CommonFunctionsKt.m2559assert(i8 >= rootSize());
            int i11 = i8 & 31;
            int size2 = ((i8 + collection.size()) - 1) & 31;
            Object[] objArr = this.tail;
            Object[] i12 = AbstractC1428l.i(objArr, makeMutable(objArr), size2 + 1, i11, tailSize());
            copyToBuffer(i12, i11, collection.iterator());
            this.tail = i12;
            this.size = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int tailSize = tailSize();
        int tailSize2 = tailSize(size() + collection.size());
        if (i8 >= rootSize()) {
            i9 = mutableBuffer();
            splitToBuffers(collection, i8, this.tail, tailSize, objArr2, size, i9);
        } else if (tailSize2 > tailSize) {
            int i13 = tailSize2 - tailSize;
            i9 = makeMutableShiftingRight(this.tail, i13);
            insertIntoRoot(collection, i8, i13, objArr2, size, i9);
        } else {
            int i14 = tailSize - tailSize2;
            i9 = AbstractC1428l.i(this.tail, mutableBuffer(), 0, i14, tailSize);
            int i15 = 32 - i14;
            Object[] makeMutableShiftingRight = makeMutableShiftingRight(this.tail, i15);
            int i16 = size - 1;
            objArr2[i16] = makeMutableShiftingRight;
            insertIntoRoot(collection, i8, i15, objArr2, i16, makeMutableShiftingRight);
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i10, objArr2);
        this.tail = i9;
        this.size = size() + collection.size();
        return true;
    }

    private final int removeAll(Function1 function1, Object[] objArr, int i8, ObjectRef objectRef) {
        Object[] objArr2 = objArr;
        int i9 = i8;
        boolean z8 = false;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z8) {
                    objArr2 = makeMutable(objArr);
                    z8 = true;
                    i9 = i10;
                }
            } else if (z8) {
                objArr2[i9] = obj;
                i9++;
            }
        }
        objectRef.setValue(objArr2);
        return i9;
    }
}
