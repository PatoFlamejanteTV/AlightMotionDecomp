package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ListImplementation {
    public static final int $stable = 0;
    public static final ListImplementation INSTANCE = new ListImplementation();

    private ListImplementation() {
    }

    public static final void checkElementIndex$runtime_release(int i8, int i9) {
        if (i8 >= 0 && i8 < i9) {
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
    }

    public static final void checkPositionIndex$runtime_release(int i8, int i9) {
        if (i8 >= 0 && i8 <= i9) {
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
    }

    public static final void checkRangeIndexes$runtime_release(int i8, int i9, int i10) {
        if (i8 >= 0 && i9 <= i10) {
            if (i8 <= i9) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i8 + " > toIndex: " + i9);
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i9 + ", size: " + i10);
    }

    public static final boolean orderedEquals$runtime_release(Collection<?> collection, Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!AbstractC3292y.d(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final int orderedHashCode$runtime_release(Collection<?> collection) {
        int i8;
        int i9 = 1;
        for (Object obj : collection) {
            int i10 = i9 * 31;
            if (obj != null) {
                i8 = obj.hashCode();
            } else {
                i8 = 0;
            }
            i9 = i10 + i8;
        }
        return i9;
    }
}
