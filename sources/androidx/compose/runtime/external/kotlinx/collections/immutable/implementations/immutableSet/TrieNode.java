package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import Q5.I;
import R5.AbstractC1428l;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TrieNode<E> {
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public TrieNode(int i8, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i8;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    private final TrieNode<E> addElementAt(int i8, E e8) {
        return new TrieNode<>(i8 | this.bitmap, TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(i8), e8));
    }

    private final int calculateSize() {
        int i8;
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int i9 = 0;
        for (Object obj : this.buffer) {
            if (obj instanceof TrieNode) {
                i8 = ((TrieNode) obj).calculateSize();
            } else {
                i8 = 1;
            }
            i9 += i8;
        }
        return i9;
    }

    private final TrieNode<E> collisionAdd(E e8) {
        if (collisionContainsElement(e8)) {
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.access$addElementAtIndex(this.buffer, 0, e8));
    }

    private final boolean collisionContainsElement(E e8) {
        return AbstractC1428l.W(this.buffer, e8);
    }

    private final TrieNode<E> collisionRemove(E e8) {
        int p02 = AbstractC1428l.p0(this.buffer, e8);
        if (p02 != -1) {
            return collisionRemoveElementAtIndex(p02);
        }
        return this;
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i8) {
        return new TrieNode<>(0, TrieNodeKt.access$removeCellAtIndex(this.buffer, i8));
    }

    private final E elementAtIndex(int i8) {
        return (E) this.buffer[i8];
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (this.buffer[i8] != trieNode.buffer[i8]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNoCellAt(int i8) {
        if ((i8 & this.bitmap) == 0) {
            return true;
        }
        return false;
    }

    private final TrieNode<E> makeNode(int i8, E e8, int i9, E e9, int i10, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        if (i10 > 30) {
            return new TrieNode<>(0, new Object[]{e8, e9}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i8, i10);
        int indexSegment2 = TrieNodeKt.indexSegment(i9, i10);
        if (indexSegment != indexSegment2) {
            if (indexSegment < indexSegment2) {
                objArr = new Object[]{e8, e9};
            } else {
                objArr = new Object[]{e9, e8};
            }
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), objArr, mutabilityOwnership);
        }
        return new TrieNode<>(1 << indexSegment, new Object[]{makeNode(i8, e8, i9, e9, i10 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i8, int i9, E e8, int i10, MutabilityOwnership mutabilityOwnership) {
        int i11;
        E elementAtIndex = elementAtIndex(i8);
        if (elementAtIndex != null) {
            i11 = elementAtIndex.hashCode();
        } else {
            i11 = 0;
        }
        return makeNode(i11, elementAtIndex, i9, e8, i10 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i8, int i9, E e8, int i10) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        copyOf[i8] = makeNodeAtIndex(i8, i9, e8, i10, null);
        return new TrieNode<>(this.bitmap, copyOf);
    }

    private final TrieNode<E> mutableAddElementAt(int i8, E e8, MutabilityOwnership mutabilityOwnership) {
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i8);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e8);
            this.bitmap = i8 | this.bitmap;
            return this;
        }
        return new TrieNode<>(i8 | this.bitmap, TrieNodeKt.access$addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e8), mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionAdd(E e8, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        if (collisionContainsElement(e8)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        if (this.ownedBy == persistentHashSetBuilder.getOwnership$runtime_release()) {
            this.buffer = TrieNodeKt.access$addElementAtIndex(this.buffer, 0, e8);
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.access$addElementAtIndex(this.buffer, 0, e8), persistentHashSetBuilder.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        boolean z8;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i8 = 0;
        for (int i9 = 0; i9 < objArr2.length; i9++) {
            boolean z9 = true;
            if (i8 <= i9) {
                z8 = true;
            } else {
                z8 = false;
            }
            CommonFunctionsKt.m2559assert(z8);
            if (!collisionContainsElement(objArr2[i9])) {
                copyOf[length + i8] = objArr2[i9];
                i8++;
                if (length + i8 > copyOf.length) {
                    z9 = false;
                }
                CommonFunctionsKt.m2559assert(z9);
            }
        }
        int length2 = i8 + this.buffer.length;
        deltaCounter.plusAssign(copyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        }
        if (AbstractC3292y.d(this.ownedBy, mutabilityOwnership)) {
            this.buffer = copyOf;
            return this;
        }
        return new TrieNode<>(0, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemove(E e8, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int p02 = AbstractC1428l.p0(this.buffer, e8);
        if (p02 != -1) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
            return mutableCollisionRemoveElementAtIndex(p02, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        boolean z8;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        if (AbstractC3292y.d(mutabilityOwnership, this.ownedBy)) {
            objArr = this.buffer;
        } else {
            objArr = new Object[this.buffer.length];
        }
        Object[] objArr2 = this.buffer;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            boolean z9 = true;
            if (i8 >= objArr2.length) {
                break;
            }
            if (i9 <= i8) {
                z8 = true;
            } else {
                z8 = false;
            }
            CommonFunctionsKt.m2559assert(z8);
            if (!trieNode.collisionContainsElement(objArr2[i8])) {
                objArr[i9] = objArr2[i8];
                i9++;
                if (i9 > objArr.length) {
                    z9 = false;
                }
                CommonFunctionsKt.m2559assert(z9);
            }
            i8++;
        }
        deltaCounter.plusAssign(this.buffer.length - i9);
        if (i9 == 0) {
            return EMPTY;
        }
        if (i9 == 1) {
            return objArr[0];
        }
        if (i9 == this.buffer.length) {
            return this;
        }
        if (i9 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i9);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i8, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, i8);
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.access$removeCellAtIndex(this.buffer, i8), mutabilityOwnership);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        boolean z8;
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        if (AbstractC3292y.d(mutabilityOwnership, this.ownedBy)) {
            objArr = this.buffer;
        } else {
            objArr = new Object[Math.min(this.buffer.length, trieNode.buffer.length)];
        }
        Object[] objArr2 = this.buffer;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            boolean z9 = true;
            if (i8 >= objArr2.length) {
                break;
            }
            if (i9 <= i8) {
                z8 = true;
            } else {
                z8 = false;
            }
            CommonFunctionsKt.m2559assert(z8);
            if (trieNode.collisionContainsElement(objArr2[i8])) {
                objArr[i9] = objArr2[i8];
                i9++;
                if (i9 > objArr.length) {
                    z9 = false;
                }
                CommonFunctionsKt.m2559assert(z9);
            }
            i8++;
        }
        deltaCounter.plusAssign(i9);
        if (i9 == 0) {
            return EMPTY;
        }
        if (i9 == 1) {
            return objArr[0];
        }
        if (i9 == this.buffer.length) {
            return this;
        }
        if (i9 != trieNode.buffer.length) {
            if (i9 == objArr.length) {
                return new TrieNode(0, objArr, mutabilityOwnership);
            }
            Object[] copyOf = Arrays.copyOf(objArr, i9);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            return new TrieNode(0, copyOf, mutabilityOwnership);
        }
        return trieNode;
    }

    private final TrieNode<E> mutableMoveElementToNode(int i8, int i9, E e8, int i10, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i8] = makeNodeAtIndex(i8, i9, e8, i10, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        copyOf[i8] = makeNodeAtIndex(i8, i9, e8, i10, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i8, int i9, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$removeCellAtIndex(this.buffer, i8);
            this.bitmap ^= i9;
            return this;
        }
        return new TrieNode<>(i9 ^ this.bitmap, TrieNodeKt.access$removeCellAtIndex(this.buffer, i8), mutabilityOwnership);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final TrieNode<E> mutableUpdateNodeAtIndex(int i8, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r02 = trieNode.buffer;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r03;
            }
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i8] = trieNode;
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        copyOf[i8] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> nodeAtIndex(int i8) {
        Object obj = this.buffer[i8];
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode<E> removeCellAtIndex(int i8, int i9) {
        return new TrieNode<>(i9 ^ this.bitmap, TrieNodeKt.access$removeCellAtIndex(this.buffer, i8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final TrieNode<E> updateNodeAtIndex(int i8, TrieNode<E> trieNode) {
        ?? r02 = trieNode.buffer;
        if (r02.length == 1) {
            ?? r03 = r02[0];
            if (!(r03 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r03;
            }
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        copyOf[i8] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf);
    }

    public final TrieNode<E> add(int i8, E e8, int i9) {
        TrieNode<E> add;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, e8);
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i9 == 30) {
                add = nodeAtIndex.collisionAdd(e8);
            } else {
                add = nodeAtIndex.add(i8, e8, i9 + 5);
            }
            if (nodeAtIndex == add) {
                return this;
            }
            return updateNodeAtIndex(indexOfCellAt$runtime_release, add);
        }
        if (AbstractC3292y.d(e8, obj)) {
            return this;
        }
        return moveElementToNode(indexOfCellAt$runtime_release, i8, e8, i9);
    }

    public final boolean contains(int i8, E e8, int i9) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i9 == 30) {
                return nodeAtIndex.collisionContainsElement(e8);
            }
            return nodeAtIndex.contains(i8, e8, i9 + 5);
        }
        return AbstractC3292y.d(e8, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(TrieNode<E> trieNode, int i8) {
        int i9;
        if (this == trieNode) {
            return true;
        }
        if (i8 > 30) {
            for (Object obj : trieNode.buffer) {
                if (!AbstractC1428l.W(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i10 = this.bitmap;
        int i11 = trieNode.bitmap;
        int i12 = i10 & i11;
        if (i12 != i11) {
            return false;
        }
        while (i12 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i12);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj2 = this.buffer[indexOfCellAt$runtime_release];
            Object obj3 = trieNode.buffer[indexOfCellAt$runtime_release2];
            boolean z8 = obj2 instanceof TrieNode;
            boolean z9 = obj3 instanceof TrieNode;
            if (z8 && z9) {
                AbstractC3292y.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                AbstractC3292y.g(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, i8 + 5)) {
                    return false;
                }
            } else if (z8) {
                AbstractC3292y.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                TrieNode trieNode2 = (TrieNode) obj2;
                if (obj3 != null) {
                    i9 = obj3.hashCode();
                } else {
                    i9 = 0;
                }
                if (!trieNode2.contains(i9, obj3, i8 + 5)) {
                    return false;
                }
            } else if (z9 || !AbstractC3292y.d(obj2, obj3)) {
                return false;
            }
            i12 ^= lowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final int indexOfCellAt$runtime_release(int i8) {
        return Integer.bitCount((i8 - 1) & this.bitmap);
    }

    public final TrieNode<E> mutableAdd(int i8, E e8, int i9, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> mutableAdd;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasNoCellAt(indexSegment)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableAddElementAt(indexSegment, e8, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i9 == 30) {
                mutableAdd = nodeAtIndex.mutableCollisionAdd(e8, persistentHashSetBuilder);
            } else {
                mutableAdd = nodeAtIndex.mutableAdd(i8, e8, i9 + 5, persistentHashSetBuilder);
            }
            if (nodeAtIndex == mutableAdd) {
                return this;
            }
            return mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableAdd, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        if (AbstractC3292y.d(e8, obj)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        return mutableMoveElementToNode(indexOfCellAt$runtime_release, i8, e8, i9, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TrieNode<E> mutableAddAll(TrieNode<E> trieNode, int i8, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> trieNode2;
        int i9;
        int i10;
        Object[] objArr;
        int i11;
        Object makeNode;
        int i12;
        TrieNode mutableAdd;
        int i13;
        if (this == trieNode) {
            deltaCounter.setCount(deltaCounter.getCount() + calculateSize());
            return this;
        }
        if (i8 > 30) {
            return mutableCollisionAddAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i14 = this.bitmap;
        int i15 = trieNode.bitmap | i14;
        if (i15 == i14 && AbstractC3292y.d(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release())) {
            trieNode2 = this;
        } else {
            trieNode2 = new TrieNode<>(i15, new Object[Integer.bitCount(i15)], persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i16 = i15;
        int i17 = 0;
        while (i16 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i16);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object[] objArr2 = trieNode2.buffer;
            if (hasNoCellAt(lowestOneBit)) {
                makeNode = trieNode.buffer[indexOfCellAt$runtime_release2];
            } else if (trieNode.hasNoCellAt(lowestOneBit)) {
                makeNode = this.buffer[indexOfCellAt$runtime_release];
            } else {
                Object obj = this.buffer[indexOfCellAt$runtime_release];
                Object obj2 = trieNode.buffer[indexOfCellAt$runtime_release2];
                boolean z8 = obj instanceof TrieNode;
                boolean z9 = obj2 instanceof TrieNode;
                if (z8 && z9) {
                    AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    AbstractC3292y.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    makeNode = ((TrieNode) obj).mutableAddAll((TrieNode) obj2, i8 + 5, deltaCounter, persistentHashSetBuilder);
                } else {
                    if (z8) {
                        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        TrieNode trieNode3 = (TrieNode) obj;
                        int size = persistentHashSetBuilder.size();
                        if (obj2 != null) {
                            i13 = obj2.hashCode();
                        } else {
                            i13 = 0;
                        }
                        mutableAdd = trieNode3.mutableAdd(i13, obj2, i8 + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.size() == size) {
                            deltaCounter.setCount(deltaCounter.getCount() + 1);
                        }
                        I i18 = I.f8786a;
                    } else if (z9) {
                        AbstractC3292y.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        TrieNode trieNode4 = (TrieNode) obj2;
                        int size2 = persistentHashSetBuilder.size();
                        if (obj != null) {
                            i12 = obj.hashCode();
                        } else {
                            i12 = 0;
                        }
                        mutableAdd = trieNode4.mutableAdd(i12, obj, i8 + 5, persistentHashSetBuilder);
                        if (persistentHashSetBuilder.size() == size2) {
                            deltaCounter.setCount(deltaCounter.getCount() + 1);
                        }
                        I i19 = I.f8786a;
                    } else if (AbstractC3292y.d(obj, obj2)) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                        I i20 = I.f8786a;
                        makeNode = obj;
                    } else {
                        if (obj != null) {
                            i9 = obj.hashCode();
                        } else {
                            i9 = 0;
                        }
                        if (obj2 != null) {
                            i10 = obj2.hashCode();
                        } else {
                            i10 = 0;
                        }
                        objArr = objArr2;
                        i11 = lowestOneBit;
                        makeNode = makeNode(i9, obj, i10, obj2, i8 + 5, persistentHashSetBuilder.getOwnership$runtime_release());
                        objArr[i17] = makeNode;
                        i17++;
                        i16 ^= i11;
                    }
                    makeNode = mutableAdd;
                }
            }
            objArr = objArr2;
            i11 = lowestOneBit;
            objArr[i17] = makeNode;
            i17++;
            i16 ^= i11;
        }
        if (elementsIdentityEquals(trieNode2)) {
            return this;
        }
        if (trieNode.elementsIdentityEquals(trieNode2)) {
            return trieNode;
        }
        return trieNode2;
    }

    public final TrieNode<E> mutableRemove(int i8, E e8, int i9, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i9 == 30) {
                mutableRemove = nodeAtIndex.mutableCollisionRemove(e8, persistentHashSetBuilder);
            } else {
                mutableRemove = nodeAtIndex.mutableRemove(i8, e8, i9 + 5, persistentHashSetBuilder);
            }
            if (this.ownedBy != persistentHashSetBuilder.getOwnership$runtime_release() && nodeAtIndex == mutableRemove) {
                return this;
            }
            return mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableRemove, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        if (AbstractC3292y.d(e8, obj)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
            return mutableRemoveCellAtIndex(indexOfCellAt$runtime_release, indexSegment, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:            if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L47;     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r17, int r18, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r19, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r20) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRetainAll(TrieNode<E> trieNode, int i8, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> trieNode2;
        TrieNode trieNode3;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        if (i8 > 30) {
            return mutableCollisionRetainAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i11 = this.bitmap & trieNode.bitmap;
        if (i11 == 0) {
            return EMPTY;
        }
        if (AbstractC3292y.d(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release()) && i11 == this.bitmap) {
            trieNode2 = this;
        } else {
            trieNode2 = new TrieNode<>(i11, new Object[Integer.bitCount(i11)], persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        while (i12 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i12);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj = this.buffer[indexOfCellAt$runtime_release];
            Object obj2 = trieNode.buffer[indexOfCellAt$runtime_release2];
            boolean z10 = obj instanceof TrieNode;
            boolean z11 = obj2 instanceof TrieNode;
            if (z10 && z11) {
                AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                AbstractC3292y.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                obj = ((TrieNode) obj).mutableRetainAll((TrieNode) obj2, i8 + 5, deltaCounter, persistentHashSetBuilder);
            } else if (z10) {
                AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                TrieNode trieNode4 = (TrieNode) obj;
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                } else {
                    i10 = 0;
                }
                if (trieNode4.contains(i10, obj2, i8 + 5)) {
                    deltaCounter.plusAssign(1);
                    obj = obj2;
                } else {
                    obj = EMPTY;
                }
            } else if (z11) {
                AbstractC3292y.g(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                TrieNode trieNode5 = (TrieNode) obj2;
                if (obj != null) {
                    i9 = obj.hashCode();
                } else {
                    i9 = 0;
                }
                if (trieNode5.contains(i9, obj, i8 + 5)) {
                    deltaCounter.plusAssign(1);
                } else {
                    obj = EMPTY;
                }
            } else if (AbstractC3292y.d(obj, obj2)) {
                deltaCounter.plusAssign(1);
            } else {
                obj = EMPTY;
            }
            if (obj != EMPTY) {
                i13 |= lowestOneBit;
            }
            trieNode2.buffer[i14] = obj;
            i14++;
            i12 ^= lowestOneBit;
        }
        int bitCount = Integer.bitCount(i13);
        if (i13 == 0) {
            return EMPTY;
        }
        if (i13 == i11) {
            if (trieNode2.elementsIdentityEquals(this)) {
                return this;
            }
            if (trieNode2.elementsIdentityEquals(trieNode)) {
                return trieNode;
            }
            return trieNode2;
        }
        if (bitCount == 1 && i8 != 0) {
            Object obj3 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime_release(i13)];
            if (obj3 instanceof TrieNode) {
                trieNode3 = new TrieNode(i13, new Object[]{obj3}, persistentHashSetBuilder.getOwnership$runtime_release());
            } else {
                return obj3;
            }
        } else {
            Object[] objArr = new Object[bitCount];
            Object[] objArr2 = trieNode2.buffer;
            int i15 = 0;
            for (int i16 = 0; i16 < objArr2.length; i16++) {
                if (i15 <= i16) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                CommonFunctionsKt.m2559assert(z8);
                if (objArr2[i16] != Companion.getEMPTY$runtime_release()) {
                    objArr[i15] = objArr2[i16];
                    i15++;
                    if (i15 <= bitCount) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    CommonFunctionsKt.m2559assert(z9);
                }
            }
            trieNode3 = new TrieNode(i13, objArr, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return trieNode3;
    }

    public final TrieNode<E> remove(int i8, E e8, int i9) {
        TrieNode<E> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i9 == 30) {
                remove = nodeAtIndex.collisionRemove(e8);
            } else {
                remove = nodeAtIndex.remove(i8, e8, i9 + 5);
            }
            if (nodeAtIndex == remove) {
                return this;
            }
            return updateNodeAtIndex(indexOfCellAt$runtime_release, remove);
        }
        if (AbstractC3292y.d(e8, obj)) {
            return removeCellAtIndex(indexOfCellAt$runtime_release, indexSegment);
        }
        return this;
    }

    public final void setBitmap(int i8) {
        this.bitmap = i8;
    }

    public final void setBuffer(Object[] objArr) {
        this.buffer = objArr;
    }

    public final void setOwnedBy(MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    public TrieNode(int i8, Object[] objArr) {
        this(i8, objArr, null);
    }
}
