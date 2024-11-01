package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PointerIdArray {
    public static final int $stable = 8;
    private long[] internalArray = new long[2];
    private int size;

    public final boolean add(long j8) {
        if (!contains(j8)) {
            set(this.size, j8);
            return true;
        }
        return false;
    }

    /* renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m4075add0FcD4WY(long j8) {
        return add(j8);
    }

    public final void clear() {
        this.size = 0;
    }

    public final boolean contains(long j8) {
        int i8 = this.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.internalArray[i9] == j8) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m4076contains0FcD4WY(long j8) {
        return contains(j8);
    }

    /* renamed from: get-_I2yYro, reason: not valid java name */
    public final long m4077get_I2yYro(int i8) {
        return PointerId.m3973constructorimpl(this.internalArray[i8]);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public final boolean remove(long j8) {
        int i8 = this.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (j8 == m4077get_I2yYro(i9)) {
                removeAt(i9);
                return true;
            }
        }
        return false;
    }

    /* renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m4078remove0FcD4WY(long j8) {
        return remove(j8);
    }

    public final boolean removeAt(int i8) {
        int i9 = this.size;
        if (i8 < i9) {
            int i10 = i9 - 1;
            while (i8 < i10) {
                long[] jArr = this.internalArray;
                int i11 = i8 + 1;
                jArr[i8] = jArr[i11];
                i8 = i11;
            }
            this.size--;
            return true;
        }
        return false;
    }

    public final void set(int i8, long j8) {
        long[] jArr = this.internalArray;
        if (i8 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i8 + 1, jArr.length * 2));
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.internalArray = copyOf;
        }
        this.internalArray[i8] = j8;
        if (i8 >= this.size) {
            this.size = i8 + 1;
        }
    }

    /* renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m4079setDmW0f2w(int i8, long j8) {
        set(i8, j8);
    }
}
