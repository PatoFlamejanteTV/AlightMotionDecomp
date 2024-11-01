package androidx.compose.runtime.collection;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MutableVectorKt {
    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i8) {
        AbstractC3292y.n(0, "T?");
        return new MutableVector<>(new Object[i8], 0);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 16;
        }
        AbstractC3292y.n(0, "T?");
        return new MutableVector(new Object[i8], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i8) {
        int size = list.size();
        if (i8 >= 0 && i8 < size) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " is out of bounds. The list has " + size + " elements.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i8, int i9) {
        int size = list.size();
        if (i8 <= i9) {
            if (i8 >= 0) {
                if (i9 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i8 + ") is less than 0.");
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i8 + ") is greater than toIndex (" + i9 + ").");
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        return new MutableVector<>(tArr, tArr.length);
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i8, Function1 function1) {
        AbstractC3292y.n(0, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] objArr = new Object[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = function1.invoke(Integer.valueOf(i9));
        }
        return new MutableVector<>(objArr, i8);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        AbstractC3292y.n(0, "T?");
        return new MutableVector<>(new Object[16], 0);
    }
}
