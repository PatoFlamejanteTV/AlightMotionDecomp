package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import R5.AbstractC1428l;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final /* synthetic */ Object[] access$addElementAtIndex(Object[] objArr, int i8, Object obj) {
        return addElementAtIndex(objArr, i8, obj);
    }

    public static final /* synthetic */ Object[] access$removeCellAtIndex(Object[] objArr, int i8) {
        return removeCellAtIndex(objArr, i8);
    }

    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i8, E e8) {
        Object[] objArr2 = new Object[objArr.length + 1];
        AbstractC1428l.n(objArr, objArr2, 0, 0, i8, 6, null);
        AbstractC1428l.i(objArr, objArr2, i8 + 1, i8, objArr.length);
        objArr2[i8] = e8;
        return objArr2;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i8, Function1 function1) {
        boolean z8;
        int i9 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            boolean z9 = true;
            if (i9 <= i10) {
                z8 = true;
            } else {
                z8 = false;
            }
            CommonFunctionsKt.m2559assert(z8);
            if (((Boolean) function1.invoke(objArr[i10])).booleanValue()) {
                objArr2[i8 + i9] = objArr[i10];
                i9++;
                if (i8 + i9 > objArr2.length) {
                    z9 = false;
                }
                CommonFunctionsKt.m2559assert(z9);
            }
        }
        return i9;
    }

    static /* synthetic */ int filterTo$default(Object[] objArr, Object[] objArr2, int i8, Function1 function1, int i9, Object obj) {
        boolean z8;
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            function1 = TrieNodeKt$filterTo$1.INSTANCE;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            boolean z9 = true;
            if (i10 <= i11) {
                z8 = true;
            } else {
                z8 = false;
            }
            CommonFunctionsKt.m2559assert(z8);
            if (((Boolean) function1.invoke(objArr[i11])).booleanValue()) {
                objArr2[i8 + i10] = objArr[i11];
                i10++;
                if (i8 + i10 > objArr2.length) {
                    z9 = false;
                }
                CommonFunctionsKt.m2559assert(z9);
            }
        }
        return i10;
    }

    public static final int indexSegment(int i8, int i9) {
        return (i8 >> i9) & 31;
    }

    public static final Object[] removeCellAtIndex(Object[] objArr, int i8) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC1428l.n(objArr, objArr2, 0, 0, i8, 6, null);
        AbstractC1428l.i(objArr, objArr2, i8, i8 + 1, objArr.length);
        return objArr2;
    }
}
