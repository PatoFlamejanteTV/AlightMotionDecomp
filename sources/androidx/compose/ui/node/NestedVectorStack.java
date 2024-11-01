package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class NestedVectorStack<T> {
    public static final int $stable = 8;
    private int size;
    private int[] currentIndexes = new int[16];
    private MutableVector<T>[] vectors = new MutableVector[16];

    public final boolean isNotEmpty() {
        int i8 = this.size;
        if (i8 > 0 && this.currentIndexes[i8 - 1] >= 0) {
            return true;
        }
        return false;
    }

    public final T pop() {
        int i8 = this.size;
        if (i8 > 0) {
            int i9 = i8 - 1;
            int i10 = this.currentIndexes[i9];
            MutableVector<T> mutableVector = this.vectors[i9];
            AbstractC3292y.f(mutableVector);
            if (i10 > 0) {
                this.currentIndexes[i9] = r3[i9] - 1;
            } else if (i10 == 0) {
                this.vectors[i9] = null;
                this.size--;
            }
            return mutableVector.getContent()[i10];
        }
        throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()".toString());
    }

    public final void push(MutableVector<T> mutableVector) {
        if (mutableVector.isEmpty()) {
            return;
        }
        int i8 = this.size;
        int[] iArr = this.currentIndexes;
        if (i8 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.currentIndexes = copyOf;
            MutableVector<T>[] mutableVectorArr = this.vectors;
            Object[] copyOf2 = Arrays.copyOf(mutableVectorArr, mutableVectorArr.length * 2);
            AbstractC3292y.h(copyOf2, "copyOf(this, newSize)");
            this.vectors = (MutableVector[]) copyOf2;
        }
        this.currentIndexes[i8] = mutableVector.getSize() - 1;
        this.vectors[i8] = mutableVector;
        this.size++;
    }
}
