package androidx.compose.runtime.snapshots;

import R5.AbstractC1428l;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    private int firstFreeHandle;
    private int[] handles;
    private int size;
    private int[] values = new int[16];
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i8 = 0;
        while (i8 < 16) {
            int i9 = i8 + 1;
            iArr[i8] = i9;
            i8 = i9;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i8 = length * 2;
            int[] iArr = new int[i8];
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9 + 1;
                iArr[i9] = i10;
                i9 = i10;
            }
            AbstractC1428l.l(this.handles, iArr, 0, 0, 0, 14, null);
            this.handles = iArr;
        }
        int i11 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i11];
        return i11;
    }

    private final void ensure(int i8) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (i8 <= length) {
            return;
        }
        int i9 = length * 2;
        int[] iArr2 = new int[i9];
        int[] iArr3 = new int[i9];
        AbstractC1428l.l(iArr, iArr2, 0, 0, 0, 14, null);
        AbstractC1428l.l(this.index, iArr3, 0, 0, 0, 14, null);
        this.values = iArr2;
        this.index = iArr3;
    }

    private final void freeHandle(int i8) {
        this.handles[i8] = this.firstFreeHandle;
        this.firstFreeHandle = i8;
    }

    public static /* synthetic */ int lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(i8);
    }

    private final void shiftDown(int i8) {
        int i9;
        int[] iArr = this.values;
        int i10 = this.size >> 1;
        while (i8 < i10) {
            int i11 = (i8 + 1) << 1;
            int i12 = i11 - 1;
            if (i11 < this.size && (i9 = iArr[i11]) < iArr[i12]) {
                if (i9 < iArr[i8]) {
                    swap(i11, i8);
                    i8 = i11;
                } else {
                    return;
                }
            } else if (iArr[i12] < iArr[i8]) {
                swap(i12, i8);
                i8 = i12;
            } else {
                return;
            }
        }
    }

    private final void shiftUp(int i8) {
        int[] iArr = this.values;
        int i9 = iArr[i8];
        while (i8 > 0) {
            int i10 = ((i8 + 1) >> 1) - 1;
            if (iArr[i10] > i9) {
                swap(i10, i8);
                i8 = i10;
            } else {
                return;
            }
        }
    }

    private final void swap(int i8, int i9) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i10 = iArr[i8];
        iArr[i8] = iArr[i9];
        iArr[i9] = i10;
        int i11 = iArr2[i8];
        iArr2[i8] = iArr2[i9];
        iArr2[i9] = i11;
        iArr3[iArr2[i8]] = i8;
        iArr3[iArr2[i9]] = i9;
    }

    public final int add(int i8) {
        ensure(this.size + 1);
        int i9 = this.size;
        this.size = i9 + 1;
        int allocateHandle = allocateHandle();
        this.values[i9] = i8;
        this.index[i9] = allocateHandle;
        this.handles[allocateHandle] = i9;
        shiftUp(i9);
        return allocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final int lowestOrDefault(int i8) {
        if (this.size > 0) {
            return this.values[0];
        }
        return i8;
    }

    public final void remove(int i8) {
        int i9 = this.handles[i8];
        swap(i9, this.size - 1);
        this.size--;
        shiftUp(i9);
        shiftDown(i9);
        freeHandle(i8);
    }

    public final void validate() {
        int i8 = this.size;
        int i9 = 1;
        while (i9 < i8) {
            int i10 = i9 + 1;
            int[] iArr = this.values;
            if (iArr[(i10 >> 1) - 1] <= iArr[i9]) {
                i9 = i10;
            } else {
                throw new IllegalStateException(("Index " + i9 + " is out of place").toString());
            }
        }
    }

    public final void validateHandle(int i8, int i9) {
        int i10 = this.handles[i8];
        if (this.index[i10] == i8) {
            if (this.values[i10] == i9) {
                return;
            }
            throw new IllegalStateException(("Value for handle " + i8 + " was " + this.values[i10] + " but was supposed to be " + i9).toString());
        }
        throw new IllegalStateException(("Index for handle " + i8 + " is corrupted").toString());
    }
}
