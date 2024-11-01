package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IntStack {
    public static final int $stable = 8;
    private int[] slots = new int[10];
    private int tos;

    public final void clear() {
        this.tos = 0;
    }

    public final int getSize() {
        return this.tos;
    }

    public final int indexOf(int i8) {
        int i9 = this.tos;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.slots[i10] == i8) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.tos == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.tos != 0) {
            return true;
        }
        return false;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peekOr(int i8) {
        if (this.tos > 0) {
            return peek();
        }
        return i8;
    }

    public final int pop() {
        int[] iArr = this.slots;
        int i8 = this.tos - 1;
        this.tos = i8;
        return iArr[i8];
    }

    public final void push(int i8) {
        int i9 = this.tos;
        int[] iArr = this.slots;
        if (i9 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.slots = copyOf;
        }
        int[] iArr2 = this.slots;
        int i10 = this.tos;
        this.tos = i10 + 1;
        iArr2[i10] = i8;
    }

    public final int peek(int i8) {
        return this.slots[i8];
    }
}
