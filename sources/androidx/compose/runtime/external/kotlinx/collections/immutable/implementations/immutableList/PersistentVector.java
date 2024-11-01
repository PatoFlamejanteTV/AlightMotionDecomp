package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import R5.AbstractC1428l;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import i6.m;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {
    public static final int $stable = 8;
    private final Object[] root;
    private final int rootShift;
    private final int size;
    private final Object[] tail;

    public PersistentVector(Object[] objArr, Object[] objArr2, int i8, int i9) {
        boolean z8;
        this.root = objArr;
        this.tail = objArr2;
        this.size = i8;
        this.rootShift = i9;
        if (size() > 32) {
            if (size() - UtilsKt.rootSize(size()) <= m.g(objArr2.length, 32)) {
                z8 = true;
            } else {
                z8 = false;
            }
            CommonFunctionsKt.m2559assert(z8);
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    private final Object[] bufferFor(int i8) {
        if (rootSize() <= i8) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i9 = this.rootShift; i9 > 0; i9 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i8, i9)];
            AbstractC3292y.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i8, int i9, Object obj, ObjectRef objectRef) {
        Object[] copyOf;
        int indexSegment = UtilsKt.indexSegment(i9, i8);
        if (i8 == 0) {
            if (indexSegment == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            }
            AbstractC1428l.i(objArr, copyOf, indexSegment + 1, indexSegment, 31);
            objectRef.setValue(objArr[31]);
            copyOf[indexSegment] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
        int i10 = i8 - 5;
        Object obj2 = objArr[indexSegment];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        AbstractC3292y.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[indexSegment] = insertIntoRoot((Object[]) obj2, i10, i9, obj, objectRef);
        int i11 = indexSegment + 1;
        while (i11 < 32 && copyOf2[i11] != null) {
            Object obj3 = objArr[i11];
            AbstractC3292y.g(obj3, str);
            Object[] objArr2 = copyOf2;
            objArr2[i11] = insertIntoRoot((Object[]) obj3, i10, 0, objectRef.getValue(), objectRef);
            i11++;
            copyOf2 = objArr2;
            str = str;
        }
        return copyOf2;
    }

    private final PersistentVector<E> insertIntoTail(Object[] objArr, int i8, Object obj) {
        int size = size() - rootSize();
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            AbstractC1428l.i(this.tail, copyOf, i8 + 1, i8, size);
            copyOf[i8] = obj;
            return new PersistentVector<>(objArr, copyOf, size() + 1, this.rootShift);
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[31];
        AbstractC1428l.i(objArr2, copyOf, i8 + 1, i8, size - 1);
        copyOf[i8] = obj;
        return pushFilledTail(objArr, copyOf, UtilsKt.presizedBufferWith(obj2));
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i8, int i9, ObjectRef objectRef) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i9, i8);
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
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        copyOf[indexSegment] = pullLastBuffer;
        return copyOf;
    }

    private final PersistentList<E> pullLastBufferFromRoot(Object[] objArr, int i8, int i9) {
        if (i9 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                AbstractC3292y.h(objArr, "copyOf(this, newSize)");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i9, i8 - 1, objectRef);
        AbstractC3292y.f(pullLastBuffer);
        Object value = objectRef.getValue();
        AbstractC3292y.g(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        if (pullLastBuffer[1] == null) {
            Object obj = pullLastBuffer[0];
            AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return new PersistentVector((Object[]) obj, objArr2, i8, i9 - 5);
        }
        return new PersistentVector(pullLastBuffer, objArr2, i8, i9);
    }

    private final PersistentVector<E> pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i8 = this.rootShift;
        if (size > (1 << i8)) {
            Object[] presizedBufferWith = UtilsKt.presizedBufferWith(objArr);
            int i9 = this.rootShift + 5;
            return new PersistentVector<>(pushTail(presizedBufferWith, i9, objArr2), objArr3, size() + 1, i9);
        }
        return new PersistentVector<>(pushTail(objArr, i8, objArr2), objArr3, size() + 1, this.rootShift);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:            if (r4 == null) goto L6;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] pushTail(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.AbstractC3292y.h(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.pushTail(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector.pushTail(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i8, int i9, ObjectRef objectRef) {
        Object[] copyOf;
        int indexSegment = UtilsKt.indexSegment(i9, i8);
        int i10 = 31;
        if (i8 == 0) {
            if (indexSegment == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            }
            AbstractC1428l.i(objArr, copyOf, indexSegment, indexSegment + 1, 32);
            copyOf[31] = objectRef.getValue();
            objectRef.setValue(objArr[indexSegment]);
            return copyOf;
        }
        if (objArr[31] == null) {
            i10 = UtilsKt.indexSegment(rootSize() - 1, i8);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
        int i11 = i8 - 5;
        int i12 = indexSegment + 1;
        if (i12 <= i10) {
            while (true) {
                Object obj = copyOf2[i10];
                AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i10] = removeFromRootAt((Object[]) obj, i11, 0, objectRef);
                if (i10 == i12) {
                    break;
                }
                i10--;
            }
        }
        Object obj2 = copyOf2[indexSegment];
        AbstractC3292y.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[indexSegment] = removeFromRootAt((Object[]) obj2, i11, i9, objectRef);
        return copyOf2;
    }

    private final PersistentList<E> removeFromTailAt(Object[] objArr, int i8, int i9, int i10) {
        boolean z8;
        int size = size() - i8;
        if (i10 < size) {
            z8 = true;
        } else {
            z8 = false;
        }
        CommonFunctionsKt.m2559assert(z8);
        if (size == 1) {
            return pullLastBufferFromRoot(objArr, i8, i9);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        int i11 = size - 1;
        if (i10 < i11) {
            AbstractC1428l.i(this.tail, copyOf, i10, i10 + 1, size);
        }
        copyOf[i11] = null;
        return new PersistentVector(objArr, copyOf, (i8 + size) - 1, i9);
    }

    private final int rootSize() {
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i8, int i9, Object obj) {
        int indexSegment = UtilsKt.indexSegment(i9, i8);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        if (i8 == 0) {
            copyOf[indexSegment] = obj;
        } else {
            Object obj2 = copyOf[indexSegment];
            AbstractC3292y.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[indexSegment] = setInRoot((Object[]) obj2, i8 - 5, i9, obj);
        }
        return copyOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentVector<E>) obj);
    }

    @Override // R5.AbstractC1419c, java.util.List
    public E get(int i8) {
        ListImplementation.checkElementIndex$runtime_release(i8, size());
        return (E) bufferFor(i8)[i8 & 31];
    }

    @Override // R5.AbstractC1419c, R5.AbstractC1417a
    public int getSize() {
        return this.size;
    }

    @Override // R5.AbstractC1419c, java.util.List
    public ListIterator<E> listIterator(int i8) {
        ListImplementation.checkPositionIndex$runtime_release(i8, size());
        return new PersistentVectorIterator(this.root, this.tail, i8, size(), (this.rootShift / 5) + 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int i8) {
        ListImplementation.checkElementIndex$runtime_release(i8, size());
        int rootSize = rootSize();
        if (i8 >= rootSize) {
            return removeFromTailAt(this.root, rootSize, this.rootShift, i8 - rootSize);
        }
        return removeFromTailAt(removeFromRootAt(this.root, this.rootShift, i8, new ObjectRef(this.tail[0])), rootSize, this.rootShift, 0);
    }

    @Override // R5.AbstractC1419c, java.util.List
    public PersistentList<E> set(int i8, E e8) {
        ListImplementation.checkElementIndex$runtime_release(i8, size());
        if (rootSize() <= i8) {
            Object[] copyOf = Arrays.copyOf(this.tail, 32);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            copyOf[i8 & 31] = e8;
            return new PersistentVector(this.root, copyOf, size(), this.rootShift);
        }
        return new PersistentVector(setInRoot(this.root, this.rootShift, i8, e8), this.tail, size(), this.rootShift);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E e8) {
        int size = size() - rootSize();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.tail, 32);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            copyOf[size] = e8;
            return new PersistentVector(this.root, copyOf, size() + 1, this.rootShift);
        }
        return pushFilledTail(this.root, this.tail, UtilsKt.presizedBufferWith(e8));
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(Function1 function1) {
        PersistentVectorBuilder<E> builder = builder();
        builder.removeAllWithPredicate(function1);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i8, E e8) {
        ListImplementation.checkPositionIndex$runtime_release(i8, size());
        if (i8 == size()) {
            return add((PersistentVector<E>) e8);
        }
        int rootSize = rootSize();
        if (i8 >= rootSize) {
            return insertIntoTail(this.root, i8 - rootSize, e8);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return insertIntoTail(insertIntoRoot(this.root, this.rootShift, i8, e8, objectRef), 0, objectRef.getValue());
    }
}
