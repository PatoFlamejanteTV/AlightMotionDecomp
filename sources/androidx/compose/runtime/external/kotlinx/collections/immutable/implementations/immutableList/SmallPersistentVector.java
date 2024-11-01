package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import R5.AbstractC1428l;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {
    private final Object[] buffer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public SmallPersistentVector(Object[] objArr) {
        boolean z8;
        this.buffer = objArr;
        if (objArr.length <= 32) {
            z8 = true;
        } else {
            z8 = false;
        }
        CommonFunctionsKt.m2559assert(z8);
    }

    private final Object[] bufferOfSize(int i8) {
        return new Object[i8];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((SmallPersistentVector<E>) obj);
    }

    @Override // R5.AbstractC1419c, java.util.List
    public E get(int i8) {
        ListImplementation.checkElementIndex$runtime_release(i8, size());
        return (E) this.buffer[i8];
    }

    @Override // R5.AbstractC1419c, R5.AbstractC1417a
    public int getSize() {
        return this.buffer.length;
    }

    @Override // R5.AbstractC1419c, java.util.List
    public int indexOf(Object obj) {
        return AbstractC1428l.p0(this.buffer, obj);
    }

    @Override // R5.AbstractC1419c, java.util.List
    public int lastIndexOf(Object obj) {
        return AbstractC1428l.B0(this.buffer, obj);
    }

    @Override // R5.AbstractC1419c, java.util.List
    public ListIterator<E> listIterator(int i8) {
        ListImplementation.checkPositionIndex$runtime_release(i8, size());
        return new BufferIterator(this.buffer, i8, size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int i8) {
        ListImplementation.checkElementIndex$runtime_release(i8, size());
        if (size() == 1) {
            return EMPTY;
        }
        Object[] copyOf = Arrays.copyOf(this.buffer, size() - 1);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        AbstractC1428l.i(this.buffer, copyOf, i8, i8 + 1, size());
        return new SmallPersistentVector(copyOf);
    }

    @Override // R5.AbstractC1419c, java.util.List
    public PersistentList<E> set(int i8, E e8) {
        ListImplementation.checkElementIndex$runtime_release(i8, size());
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        copyOf[i8] = e8;
        return new SmallPersistentVector(copyOf);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E e8) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.buffer, size() + 1);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = e8;
            return new SmallPersistentVector(copyOf);
        }
        return new PersistentVector(this.buffer, UtilsKt.presizedBufferWith(e8), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> addAll(Collection<? extends E> collection) {
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.buffer, size() + collection.size());
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            int size = size();
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                copyOf[size] = it.next();
                size++;
            }
            return new SmallPersistentVector(copyOf);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(Function1 function1) {
        Object[] objArr = this.buffer;
        int size = size();
        int size2 = size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size2; i8++) {
            Object obj = this.buffer[i8];
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                if (!z8) {
                    Object[] objArr2 = this.buffer;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    AbstractC3292y.h(objArr, "copyOf(this, size)");
                    z8 = true;
                    size = i8;
                }
            } else if (z8) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return EMPTY;
        }
        return new SmallPersistentVector(AbstractC1428l.p(objArr, 0, size));
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i8, E e8) {
        ListImplementation.checkPositionIndex$runtime_release(i8, size());
        if (i8 == size()) {
            return add((SmallPersistentVector<E>) e8);
        }
        if (size() < 32) {
            Object[] bufferOfSize = bufferOfSize(size() + 1);
            AbstractC1428l.n(this.buffer, bufferOfSize, 0, 0, i8, 6, null);
            AbstractC1428l.i(this.buffer, bufferOfSize, i8 + 1, i8, size());
            bufferOfSize[i8] = e8;
            return new SmallPersistentVector(bufferOfSize);
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        AbstractC1428l.i(this.buffer, copyOf, i8 + 1, i8, size() - 1);
        copyOf[i8] = e8;
        return new PersistentVector(copyOf, UtilsKt.presizedBufferWith(this.buffer[31]), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(int i8, Collection<? extends E> collection) {
        ListImplementation.checkPositionIndex$runtime_release(i8, size());
        if (size() + collection.size() <= 32) {
            Object[] bufferOfSize = bufferOfSize(size() + collection.size());
            AbstractC1428l.n(this.buffer, bufferOfSize, 0, 0, i8, 6, null);
            AbstractC1428l.i(this.buffer, bufferOfSize, collection.size() + i8, i8, size());
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                bufferOfSize[i8] = it.next();
                i8++;
            }
            return new SmallPersistentVector(bufferOfSize);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i8, collection);
        return builder.build();
    }
}
