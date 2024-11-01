package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i8) {
        this.stack = new int[i8];
    }

    private final boolean compareDiagonal(int i8, int i9) {
        int[] iArr = this.stack;
        int i10 = iArr[i8];
        int i11 = iArr[i9];
        if (i10 < i11) {
            return true;
        }
        if (i10 == i11 && iArr[i8 + 1] <= iArr[i9 + 1]) {
            return true;
        }
        return false;
    }

    private final int partition(int i8, int i9, int i10) {
        int i11 = i8 - i10;
        while (i8 < i9) {
            if (compareDiagonal(i8, i9)) {
                i11 += i10;
                swapDiagonal(i11, i8);
            }
            i8 += i10;
        }
        int i12 = i11 + i10;
        swapDiagonal(i12, i9);
        return i12;
    }

    private final void quickSort(int i8, int i9, int i10) {
        if (i8 < i9) {
            int partition = partition(i8, i9, i10);
            quickSort(i8, partition - i10, i10);
            quickSort(partition + i10, i9, i10);
        }
    }

    private final void swapDiagonal(int i8, int i9) {
        int[] iArr = this.stack;
        MyersDiffKt.access$swap(iArr, i8, i9);
        MyersDiffKt.access$swap(iArr, i8 + 1, i9 + 1);
        MyersDiffKt.access$swap(iArr, i8 + 2, i9 + 2);
    }

    public final int get(int i8) {
        return this.stack[i8];
    }

    public final int getSize() {
        return this.lastIndex;
    }

    public final boolean isNotEmpty() {
        if (this.lastIndex != 0) {
            return true;
        }
        return false;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i8 = this.lastIndex - 1;
        this.lastIndex = i8;
        return iArr[i8];
    }

    public final void pushDiagonal(int i8, int i9, int i10) {
        int i11 = this.lastIndex;
        int i12 = i11 + 3;
        int[] iArr = this.stack;
        if (i12 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.stack = copyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i11] = i8 + i10;
        iArr2[i11 + 1] = i9 + i10;
        iArr2[i11 + 2] = i10;
        this.lastIndex = i12;
    }

    public final void pushRange(int i8, int i9, int i10, int i11) {
        int i12 = this.lastIndex;
        int i13 = i12 + 4;
        int[] iArr = this.stack;
        if (i13 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.stack = copyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i12] = i8;
        iArr2[i12 + 1] = i9;
        iArr2[i12 + 2] = i10;
        iArr2[i12 + 3] = i11;
        this.lastIndex = i13;
    }

    public final void sortDiagonals() {
        int i8 = this.lastIndex;
        if (i8 % 3 == 0) {
            if (i8 > 3) {
                quickSort(0, i8 - 3, 3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Array size not a multiple of 3".toString());
    }
}
