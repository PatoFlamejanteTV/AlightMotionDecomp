package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;

/* loaded from: classes.dex */
public final class UtilsKt {
    public static final int LOG_MAX_BUFFER_SIZE = 5;
    public static final int MAX_BUFFER_SIZE = 32;
    public static final int MAX_BUFFER_SIZE_MINUS_ONE = 31;
    public static final int MUTABLE_BUFFER_SIZE = 33;

    public static final int indexSegment(int i8, int i9) {
        return (i8 >> i9) & 31;
    }

    public static final <E> PersistentList<E> persistentVectorOf() {
        return SmallPersistentVector.Companion.getEMPTY();
    }

    public static final Object[] presizedBufferWith(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int rootSize(int i8) {
        return (i8 - 1) & (-32);
    }
}
