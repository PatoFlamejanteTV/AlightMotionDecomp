package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import R5.AbstractC1428l;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int ENTRY_SIZE = 2;
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final /* synthetic */ Object[] access$insertEntryAtIndex(Object[] objArr, int i8, Object obj, Object obj2) {
        return insertEntryAtIndex(objArr, i8, obj, obj2);
    }

    public static final /* synthetic */ Object[] access$removeEntryAtIndex(Object[] objArr, int i8) {
        return removeEntryAtIndex(objArr, i8);
    }

    public static final /* synthetic */ Object[] access$removeNodeAtIndex(Object[] objArr, int i8) {
        return removeNodeAtIndex(objArr, i8);
    }

    public static final /* synthetic */ Object[] access$replaceEntryWithNode(Object[] objArr, int i8, int i9, TrieNode trieNode) {
        return replaceEntryWithNode(objArr, i8, i9, trieNode);
    }

    public static final /* synthetic */ Object[] access$replaceNodeWithEntry(Object[] objArr, int i8, int i9, Object obj, Object obj2) {
        return replaceNodeWithEntry(objArr, i8, i9, obj, obj2);
    }

    public static final int indexSegment(int i8, int i9) {
        return (i8 >> i9) & 31;
    }

    public static final <K, V> Object[] insertEntryAtIndex(Object[] objArr, int i8, K k8, V v8) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC1428l.n(objArr, objArr2, 0, 0, i8, 6, null);
        AbstractC1428l.i(objArr, objArr2, i8 + 2, i8, objArr.length);
        objArr2[i8] = k8;
        objArr2[i8 + 1] = v8;
        return objArr2;
    }

    public static final Object[] removeEntryAtIndex(Object[] objArr, int i8) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC1428l.n(objArr, objArr2, 0, 0, i8, 6, null);
        AbstractC1428l.i(objArr, objArr2, i8, i8 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] removeNodeAtIndex(Object[] objArr, int i8) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC1428l.n(objArr, objArr2, 0, 0, i8, 6, null);
        AbstractC1428l.i(objArr, objArr2, i8, i8 + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] replaceEntryWithNode(Object[] objArr, int i8, int i9, TrieNode<?, ?> trieNode) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC1428l.n(objArr, objArr2, 0, 0, i8, 6, null);
        AbstractC1428l.i(objArr, objArr2, i8, i8 + 2, i9);
        objArr2[i9 - 2] = trieNode;
        AbstractC1428l.i(objArr, objArr2, i9 - 1, i9, objArr.length);
        return objArr2;
    }

    public static final <K, V> Object[] replaceNodeWithEntry(Object[] objArr, int i8, int i9, K k8, V v8) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
        AbstractC1428l.i(copyOf, copyOf, i8 + 2, i8 + 1, objArr.length);
        AbstractC1428l.i(copyOf, copyOf, i9 + 2, i9, i8);
        copyOf[i9] = k8;
        copyOf[i9 + 1] = v8;
        return copyOf;
    }
}
