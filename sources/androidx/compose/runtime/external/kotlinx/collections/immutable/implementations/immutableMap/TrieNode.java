package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2075q;
import i6.C2979g;
import i6.m;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TrieNode<K, V> {
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

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

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(TrieNode<K, V> trieNode, int i8) {
            this.node = trieNode;
            this.sizeDelta = i8;
        }

        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final ModificationResult<K, V> replaceNode(Function1 function1) {
            setNode((TrieNode) function1.invoke(getNode()));
            return this;
        }

        public final void setNode(TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }
    }

    public TrieNode(int i8, int i9, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i8;
        this.nodeMap = i9;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    private final void accept(InterfaceC2075q interfaceC2075q, int i8, int i9) {
        interfaceC2075q.invoke(this, Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i10 = this.nodeMap;
        while (i10 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i10);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(lowestOneBit)).accept(interfaceC2075q, (Integer.numberOfTrailingZeros(lowestOneBit) << i9) + i8, i9 + 5);
            i10 -= lowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int i8, int i9, int i10, K k8, V v8, int i11, MutabilityOwnership mutabilityOwnership) {
        int i12;
        K keyAtIndex = keyAtIndex(i8);
        if (keyAtIndex != null) {
            i12 = keyAtIndex.hashCode();
        } else {
            i12 = 0;
        }
        TrieNode<K, V> makeNode = makeNode(i12, keyAtIndex, valueAtKeyIndex(i8), i10, k8, v8, i11 + 5, mutabilityOwnership);
        return TrieNodeKt.access$replaceEntryWithNode(this.buffer, i8, nodeIndex$runtime_release(i9) + 1, makeNode);
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i8 = bitCount * 2; i8 < length; i8++) {
            bitCount += nodeAtIndex$runtime_release(i8).calculateSize();
        }
        return bitCount;
    }

    private final boolean collisionContainsKey(K k8) {
        C2979g r8 = m.r(m.s(0, this.buffer.length), 2);
        int e8 = r8.e();
        int g8 = r8.g();
        int j8 = r8.j();
        if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
            while (!AbstractC3292y.d(k8, this.buffer[e8])) {
                if (e8 != g8) {
                    e8 += j8;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k8) {
        C2979g r8 = m.r(m.s(0, this.buffer.length), 2);
        int e8 = r8.e();
        int g8 = r8.g();
        int j8 = r8.j();
        if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
            while (!AbstractC3292y.d(k8, keyAtIndex(e8))) {
                if (e8 != g8) {
                    e8 += j8;
                } else {
                    return null;
                }
            }
            return valueAtKeyIndex(e8);
        }
        return null;
    }

    private final ModificationResult<K, V> collisionPut(K k8, V v8) {
        C2979g r8 = m.r(m.s(0, this.buffer.length), 2);
        int e8 = r8.e();
        int g8 = r8.g();
        int j8 = r8.j();
        if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
            while (!AbstractC3292y.d(k8, keyAtIndex(e8))) {
                if (e8 != g8) {
                    e8 += j8;
                }
            }
            if (v8 == valueAtKeyIndex(e8)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC3292y.h(copyOf, "copyOf(this, size)");
            copyOf[e8 + 1] = v8;
            return new TrieNode(0, 0, copyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, k8, v8)).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K k8) {
        C2979g r8 = m.r(m.s(0, this.buffer.length), 2);
        int e8 = r8.e();
        int g8 = r8.g();
        int j8 = r8.j();
        if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
            while (!AbstractC3292y.d(k8, keyAtIndex(e8))) {
                if (e8 != g8) {
                    e8 += j8;
                }
            }
            return collisionRemoveEntryAtIndex(e8);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i8) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(objArr, i8));
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap != trieNode.nodeMap || this.dataMap != trieNode.dataMap) {
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

    private final boolean hasNodeAt(int i8) {
        if ((i8 & this.nodeMap) != 0) {
            return true;
        }
        return false;
    }

    private final TrieNode<K, V> insertEntryAt(int i8, K k8, V v8) {
        return new TrieNode<>(i8 | this.dataMap, this.nodeMap, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(i8), k8, v8));
    }

    private final K keyAtIndex(int i8) {
        return (K) this.buffer[i8];
    }

    private final TrieNode<K, V> makeNode(int i8, K k8, V v8, int i9, K k9, V v9, int i10, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        if (i10 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k8, v8, k9, v9}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i8, i10);
        int indexSegment2 = TrieNodeKt.indexSegment(i9, i10);
        if (indexSegment != indexSegment2) {
            if (indexSegment < indexSegment2) {
                objArr = new Object[]{k8, v8, k9, v9};
            } else {
                objArr = new Object[]{k9, v9, k8, v8};
            }
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, objArr, mutabilityOwnership);
        }
        return new TrieNode<>(0, 1 << indexSegment, new Object[]{makeNode(i8, k8, v8, i9, k9, v9, i10 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<K, V> moveEntryToNode(int i8, int i9, int i10, K k8, V v8, int i11) {
        return new TrieNode<>(this.dataMap ^ i9, i9 | this.nodeMap, bufferMoveEntryToNode(i8, i9, i10, k8, v8, i11, null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K k8, V v8, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C2979g r8 = m.r(m.s(0, this.buffer.length), 2);
        int e8 = r8.e();
        int g8 = r8.g();
        int j8 = r8.j();
        if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
            while (!AbstractC3292y.d(k8, keyAtIndex(e8))) {
                if (e8 != g8) {
                    e8 += j8;
                }
            }
            persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(e8));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
                this.buffer[e8 + 1] = v8;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC3292y.h(copyOf, "copyOf(this, size)");
            copyOf[e8 + 1] = v8;
            return new TrieNode<>(0, 0, copyOf, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, k8, v8), persistentHashMapBuilder.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.nodeMap == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        CommonFunctionsKt.m2559assert(z8);
        if (this.dataMap == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        CommonFunctionsKt.m2559assert(z9);
        if (trieNode.nodeMap == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        CommonFunctionsKt.m2559assert(z10);
        if (trieNode.dataMap == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        CommonFunctionsKt.m2559assert(z11);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        int length = this.buffer.length;
        C2979g r8 = m.r(m.s(0, trieNode.buffer.length), 2);
        int e8 = r8.e();
        int g8 = r8.g();
        int j8 = r8.j();
        if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
            while (true) {
                if (!collisionContainsKey(trieNode.buffer[e8])) {
                    Object[] objArr2 = trieNode.buffer;
                    copyOf[length] = objArr2[e8];
                    copyOf[length + 1] = objArr2[e8 + 1];
                    length += 2;
                } else {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
                if (e8 == g8) {
                    break;
                }
                e8 += j8;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length != trieNode.buffer.length) {
            if (length == copyOf.length) {
                return new TrieNode<>(0, 0, copyOf, mutabilityOwnership);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            return new TrieNode<>(0, 0, copyOf2, mutabilityOwnership);
        }
        return trieNode;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k8, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C2979g r8 = m.r(m.s(0, this.buffer.length), 2);
        int e8 = r8.e();
        int g8 = r8.g();
        int j8 = r8.j();
        if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
            while (!AbstractC3292y.d(k8, keyAtIndex(e8))) {
                if (e8 != g8) {
                    e8 += j8;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(e8, persistentHashMapBuilder);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i8, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i8));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i8);
            return this;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i8), persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i8, K k8, V v8, MutabilityOwnership mutabilityOwnership) {
        int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(i8);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k8, v8);
            this.dataMap = i8 | this.dataMap;
            return this;
        }
        return new TrieNode<>(i8 | this.dataMap, this.nodeMap, TrieNodeKt.access$insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release, k8, v8), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i8, int i9, int i10, K k8, V v8, int i11, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = bufferMoveEntryToNode(i8, i9, i10, k8, v8, i11, mutabilityOwnership);
            this.dataMap ^= i9;
            this.nodeMap |= i9;
            return this;
        }
        return new TrieNode<>(this.dataMap ^ i9, i9 | this.nodeMap, bufferMoveEntryToNode(i8, i9, i10, k8, v8, i11, mutabilityOwnership), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i8, int i9, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (hasNodeAt(i8)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(i8));
            if (trieNode.hasNodeAt(i8)) {
                return nodeAtIndex$runtime_release.mutablePutAll(trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i8)), i9 + 5, deltaCounter, persistentHashMapBuilder);
            }
            if (trieNode.hasEntryAt$runtime_release(i8)) {
                int entryKeyIndex$runtime_release = trieNode.entryKeyIndex$runtime_release(i8);
                K keyAtIndex = trieNode.keyAtIndex(entryKeyIndex$runtime_release);
                V valueAtKeyIndex = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release);
                int size = persistentHashMapBuilder.size();
                if (keyAtIndex != null) {
                    i13 = keyAtIndex.hashCode();
                } else {
                    i13 = 0;
                }
                TrieNode<K, V> mutablePut = nodeAtIndex$runtime_release.mutablePut(i13, keyAtIndex, valueAtKeyIndex, i9 + 5, persistentHashMapBuilder);
                if (persistentHashMapBuilder.size() == size) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                    return mutablePut;
                }
                return mutablePut;
            }
            return nodeAtIndex$runtime_release;
        }
        if (trieNode.hasNodeAt(i8)) {
            TrieNode<K, V> nodeAtIndex$runtime_release2 = trieNode.nodeAtIndex$runtime_release(trieNode.nodeIndex$runtime_release(i8));
            if (hasEntryAt$runtime_release(i8)) {
                int entryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(i8);
                K keyAtIndex2 = keyAtIndex(entryKeyIndex$runtime_release2);
                if (keyAtIndex2 != null) {
                    i11 = keyAtIndex2.hashCode();
                } else {
                    i11 = 0;
                }
                int i15 = i9 + 5;
                if (nodeAtIndex$runtime_release2.containsKey(i11, keyAtIndex2, i15)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                } else {
                    V valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime_release2);
                    if (keyAtIndex2 != null) {
                        i12 = keyAtIndex2.hashCode();
                    } else {
                        i12 = 0;
                    }
                    return nodeAtIndex$runtime_release2.mutablePut(i12, keyAtIndex2, valueAtKeyIndex2, i15, persistentHashMapBuilder);
                }
            }
            return nodeAtIndex$runtime_release2;
        }
        int entryKeyIndex$runtime_release3 = entryKeyIndex$runtime_release(i8);
        K keyAtIndex3 = keyAtIndex(entryKeyIndex$runtime_release3);
        V valueAtKeyIndex3 = valueAtKeyIndex(entryKeyIndex$runtime_release3);
        int entryKeyIndex$runtime_release4 = trieNode.entryKeyIndex$runtime_release(i8);
        K keyAtIndex4 = trieNode.keyAtIndex(entryKeyIndex$runtime_release4);
        V valueAtKeyIndex4 = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release4);
        if (keyAtIndex3 != null) {
            i10 = keyAtIndex3.hashCode();
        } else {
            i10 = 0;
        }
        if (keyAtIndex4 != null) {
            i14 = keyAtIndex4.hashCode();
        }
        return makeNode(i10, keyAtIndex3, valueAtKeyIndex3, i14, keyAtIndex4, valueAtKeyIndex4, i9 + 5, persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i8, int i9, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(i8));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i8);
            this.dataMap ^= i9;
            return this;
        }
        return new TrieNode<>(i9 ^ this.dataMap, this.nodeMap, TrieNodeKt.access$removeEntryAtIndex(this.buffer, i8), persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i8, int i9, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.access$removeNodeAtIndex(objArr, i8);
            this.nodeMap ^= i9;
            return this;
        }
        return new TrieNode<>(this.dataMap, i9 ^ this.nodeMap, TrieNodeKt.access$removeNodeAtIndex(objArr, i8), mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i8, int i9, MutabilityOwnership mutabilityOwnership) {
        if (trieNode2 == null) {
            return mutableRemoveNodeAtIndex(i8, i9, mutabilityOwnership);
        }
        if (this.ownedBy != mutabilityOwnership && trieNode == trieNode2) {
            return this;
        }
        return mutableUpdateNodeAtIndex(i8, trieNode2, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i8, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        if (this.ownedBy == mutabilityOwnership) {
            objArr[i8] = trieNode;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        copyOf[i8] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i8, V v8, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer[i8 + 1] = v8;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime_release(persistentHashMapBuilder.getModCount$runtime_release() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        copyOf[i8 + 1] = v8;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf, persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i8, int i9) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(i9 ^ this.dataMap, this.nodeMap, TrieNodeKt.access$removeEntryAtIndex(objArr, i8));
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i8, int i9) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, i9 ^ this.nodeMap, TrieNodeKt.access$removeNodeAtIndex(objArr, i8));
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i8, int i9) {
        if (trieNode2 == null) {
            return removeNodeAtIndex(i8, i9);
        }
        if (trieNode != trieNode2) {
            return updateNodeAtIndex(i8, i9, trieNode2);
        }
        return this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i8, int i9, TrieNode<K, V> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length == 2 && trieNode.nodeMap == 0) {
            if (this.buffer.length == 1) {
                trieNode.dataMap = this.nodeMap;
                return trieNode;
            }
            return new TrieNode<>(this.dataMap ^ i9, i9 ^ this.nodeMap, TrieNodeKt.access$replaceNodeWithEntry(this.buffer, i8, entryKeyIndex$runtime_release(i9), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        copyOf[i8] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final TrieNode<K, V> updateValueAtIndex(int i8, V v8) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3292y.h(copyOf, "copyOf(this, size)");
        copyOf[i8 + 1] = v8;
        return new TrieNode<>(this.dataMap, this.nodeMap, copyOf);
    }

    private final V valueAtKeyIndex(int i8) {
        return (V) this.buffer[i8 + 1];
    }

    public final void accept$runtime_release(InterfaceC2075q interfaceC2075q) {
        accept(interfaceC2075q, 0, 0);
    }

    public final boolean containsKey(int i8, K k8, int i9) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasEntryAt$runtime_release(indexSegment)) {
            return AbstractC3292y.d(k8, keyAtIndex(entryKeyIndex$runtime_release(indexSegment)));
        }
        if (hasNodeAt(indexSegment)) {
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
            if (i9 == 30) {
                return nodeAtIndex$runtime_release.collisionContainsKey(k8);
            }
            return nodeAtIndex$runtime_release.containsKey(i8, k8, i9 + 5);
        }
        return false;
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int i8) {
        return Integer.bitCount((i8 - 1) & this.dataMap) * 2;
    }

    public final V get(int i8, K k8, int i9) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (!AbstractC3292y.d(k8, keyAtIndex(entryKeyIndex$runtime_release))) {
                return null;
            }
            return valueAtKeyIndex(entryKeyIndex$runtime_release);
        }
        if (!hasNodeAt(indexSegment)) {
            return null;
        }
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(indexSegment));
        if (i9 == 30) {
            return nodeAtIndex$runtime_release.collisionGet(k8);
        }
        return nodeAtIndex$runtime_release.get(i8, k8, i9 + 5);
    }

    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int i8) {
        if ((i8 & this.dataMap) != 0) {
            return true;
        }
        return false;
    }

    public final TrieNode<K, V> mutablePut(int i8, K k8, V v8, int i9, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutablePut;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (AbstractC3292y.d(k8, keyAtIndex(entryKeyIndex$runtime_release))) {
                persistentHashMapBuilder.setOperationResult$runtime_release(valueAtKeyIndex(entryKeyIndex$runtime_release));
                if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v8) {
                    return this;
                }
                return mutableUpdateValueAtIndex(entryKeyIndex$runtime_release, v8, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i8, k8, v8, i9, persistentHashMapBuilder.getOwnership());
        }
        if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i9 == 30) {
                mutablePut = nodeAtIndex$runtime_release.mutableCollisionPut(k8, v8, persistentHashMapBuilder);
            } else {
                mutablePut = nodeAtIndex$runtime_release.mutablePut(i8, k8, v8, i9 + 5, persistentHashMapBuilder);
            }
            if (nodeAtIndex$runtime_release == mutablePut) {
                return this;
            }
            return mutableUpdateNodeAtIndex(nodeIndex$runtime_release, mutablePut, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return mutableInsertEntryAt(indexSegment, k8, v8, persistentHashMapBuilder.getOwnership());
    }

    public final TrieNode<K, V> mutablePutAll(TrieNode<K, V> trieNode, int i8, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> trieNode2;
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        if (i8 > 30) {
            return mutableCollisionPutAll(trieNode, deltaCounter, persistentHashMapBuilder.getOwnership());
        }
        int i9 = this.nodeMap | trieNode.nodeMap;
        int i10 = this.dataMap;
        int i11 = trieNode.dataMap;
        int i12 = (i10 ^ i11) & (~i9);
        int i13 = i10 & i11;
        int i14 = i12;
        while (i13 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i13);
            if (AbstractC3292y.d(keyAtIndex(entryKeyIndex$runtime_release(lowestOneBit)), trieNode.keyAtIndex(trieNode.entryKeyIndex$runtime_release(lowestOneBit)))) {
                i14 |= lowestOneBit;
            } else {
                i9 |= lowestOneBit;
            }
            i13 ^= lowestOneBit;
        }
        if ((i9 & i14) == 0) {
            if (AbstractC3292y.d(this.ownedBy, persistentHashMapBuilder.getOwnership()) && this.dataMap == i14 && this.nodeMap == i9) {
                trieNode2 = this;
            } else {
                trieNode2 = new TrieNode<>(i14, i9, new Object[(Integer.bitCount(i14) * 2) + Integer.bitCount(i9)]);
            }
            int i15 = 0;
            int i16 = i9;
            int i17 = 0;
            while (i16 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i16);
                trieNode2.buffer[(r5.length - 1) - i17] = mutablePutAllFromOtherNodeCell(trieNode, lowestOneBit2, i8, deltaCounter, persistentHashMapBuilder);
                i17++;
                i16 ^= lowestOneBit2;
            }
            while (i14 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i14);
                int i18 = i15 * 2;
                if (!trieNode.hasEntryAt$runtime_release(lowestOneBit3)) {
                    int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(lowestOneBit3);
                    trieNode2.buffer[i18] = keyAtIndex(entryKeyIndex$runtime_release);
                    trieNode2.buffer[i18 + 1] = valueAtKeyIndex(entryKeyIndex$runtime_release);
                } else {
                    int entryKeyIndex$runtime_release2 = trieNode.entryKeyIndex$runtime_release(lowestOneBit3);
                    trieNode2.buffer[i18] = trieNode.keyAtIndex(entryKeyIndex$runtime_release2);
                    trieNode2.buffer[i18 + 1] = trieNode.valueAtKeyIndex(entryKeyIndex$runtime_release2);
                    if (hasEntryAt$runtime_release(lowestOneBit3)) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    }
                }
                i15++;
                i14 ^= lowestOneBit3;
            }
            if (elementsIdentityEquals(trieNode2)) {
                return this;
            }
            if (trieNode.elementsIdentityEquals(trieNode2)) {
                return trieNode;
            }
            return trieNode2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final TrieNode<K, V> mutableRemove(int i8, K k8, int i9, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return AbstractC3292y.d(k8, keyAtIndex(entryKeyIndex$runtime_release)) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, persistentHashMapBuilder) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        if (i9 == 30) {
            mutableRemove = nodeAtIndex$runtime_release.mutableCollisionRemove(k8, persistentHashMapBuilder);
        } else {
            mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i8, k8, i9 + 5, persistentHashMapBuilder);
        }
        return mutableReplaceNode(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, persistentHashMapBuilder.getOwnership());
    }

    public final TrieNode<K, V> nodeAtIndex$runtime_release(int i8) {
        Object obj = this.buffer[i8];
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime_release(int i8) {
        return (this.buffer.length - 1) - Integer.bitCount((i8 - 1) & this.nodeMap);
    }

    public final ModificationResult<K, V> put(int i8, K k8, V v8, int i9) {
        ModificationResult<K, V> put;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            if (AbstractC3292y.d(k8, keyAtIndex(entryKeyIndex$runtime_release))) {
                if (valueAtKeyIndex(entryKeyIndex$runtime_release) == v8) {
                    return null;
                }
                return updateValueAtIndex(entryKeyIndex$runtime_release, v8).asUpdateResult();
            }
            return moveEntryToNode(entryKeyIndex$runtime_release, indexSegment, i8, k8, v8, i9).asInsertResult();
        }
        if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
            TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
            if (i9 == 30) {
                put = nodeAtIndex$runtime_release.collisionPut(k8, v8);
                if (put == null) {
                    return null;
                }
            } else {
                put = nodeAtIndex$runtime_release.put(i8, k8, v8, i9 + 5);
                if (put == null) {
                    return null;
                }
            }
            put.setNode(updateNodeAtIndex(nodeIndex$runtime_release, indexSegment, put.getNode()));
            return put;
        }
        return insertEntryAt(indexSegment, k8, v8).asInsertResult();
    }

    public final TrieNode<K, V> remove(int i8, K k8, int i9) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return AbstractC3292y.d(k8, keyAtIndex(entryKeyIndex$runtime_release)) ? removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        if (i9 == 30) {
            remove = nodeAtIndex$runtime_release.collisionRemove(k8);
        } else {
            remove = nodeAtIndex$runtime_release.remove(i8, k8, i9 + 5);
        }
        return replaceNode(nodeAtIndex$runtime_release, remove, nodeIndex$runtime_release, indexSegment);
    }

    private final TrieNode<K, V> collisionRemove(K k8, V v8) {
        C2979g r8 = m.r(m.s(0, this.buffer.length), 2);
        int e8 = r8.e();
        int g8 = r8.g();
        int j8 = r8.j();
        if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
            while (true) {
                if (!AbstractC3292y.d(k8, keyAtIndex(e8)) || !AbstractC3292y.d(v8, valueAtKeyIndex(e8))) {
                    if (e8 == g8) {
                        break;
                    }
                    e8 += j8;
                } else {
                    return collisionRemoveEntryAtIndex(e8);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k8, V v8, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        C2979g r8 = m.r(m.s(0, this.buffer.length), 2);
        int e8 = r8.e();
        int g8 = r8.g();
        int j8 = r8.j();
        if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
            while (true) {
                if (!AbstractC3292y.d(k8, keyAtIndex(e8)) || !AbstractC3292y.d(v8, valueAtKeyIndex(e8))) {
                    if (e8 == g8) {
                        break;
                    }
                    e8 += j8;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(e8, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    public TrieNode(int i8, int i9, Object[] objArr) {
        this(i8, i9, objArr, null);
    }

    public final TrieNode<K, V> mutableRemove(int i8, K k8, V v8, int i9, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (AbstractC3292y.d(k8, keyAtIndex(entryKeyIndex$runtime_release)) && AbstractC3292y.d(v8, valueAtKeyIndex(entryKeyIndex$runtime_release))) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime_release, indexSegment, persistentHashMapBuilder) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        if (i9 == 30) {
            mutableRemove = nodeAtIndex$runtime_release.mutableCollisionRemove(k8, v8, persistentHashMapBuilder);
        } else {
            mutableRemove = nodeAtIndex$runtime_release.mutableRemove(i8, k8, v8, i9 + 5, persistentHashMapBuilder);
        }
        return mutableReplaceNode(nodeAtIndex$runtime_release, mutableRemove, nodeIndex$runtime_release, indexSegment, persistentHashMapBuilder.getOwnership());
    }

    public final TrieNode<K, V> remove(int i8, K k8, V v8, int i9) {
        TrieNode<K, V> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i8, i9);
        if (hasEntryAt$runtime_release(indexSegment)) {
            int entryKeyIndex$runtime_release = entryKeyIndex$runtime_release(indexSegment);
            return (AbstractC3292y.d(k8, keyAtIndex(entryKeyIndex$runtime_release)) && AbstractC3292y.d(v8, valueAtKeyIndex(entryKeyIndex$runtime_release))) ? removeEntryAtIndex(entryKeyIndex$runtime_release, indexSegment) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime_release = nodeIndex$runtime_release(indexSegment);
        TrieNode<K, V> nodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release);
        if (i9 == 30) {
            remove = nodeAtIndex$runtime_release.collisionRemove(k8, v8);
        } else {
            remove = nodeAtIndex$runtime_release.remove(i8, k8, v8, i9 + 5);
        }
        return replaceNode(nodeAtIndex$runtime_release, remove, nodeIndex$runtime_release, indexSegment);
    }
}
