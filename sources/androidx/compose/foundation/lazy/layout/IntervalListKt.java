package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;

/* loaded from: classes.dex */
public final class IntervalListKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalFoundationApi
    public static final <T> int binarySearch(MutableVector<IntervalList.Interval<T>> mutableVector, int i8) {
        int size = mutableVector.getSize() - 1;
        int i9 = 0;
        while (i9 < size) {
            int i10 = ((size - i9) / 2) + i9;
            int startIndex = mutableVector.getContent()[i10].getStartIndex();
            if (startIndex == i8) {
                return i10;
            }
            if (startIndex < i8) {
                i9 = i10 + 1;
                if (i8 < mutableVector.getContent()[i9].getStartIndex()) {
                    return i10;
                }
            } else {
                size = i10 - 1;
            }
        }
        return i9;
    }
}
