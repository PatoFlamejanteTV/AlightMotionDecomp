package androidx.collection;

import R5.AbstractC1428l;
import androidx.annotation.IntRange;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = mutableLongList._size;
        }
        mutableLongList.trim(i8);
    }

    public final boolean add(long j8) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i8 = this._size;
        jArr[i8] = j8;
        this._size = i8 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i8, long[] elements) {
        int i9;
        AbstractC3292y.i(elements, "elements");
        if (i8 >= 0 && i8 <= (i9 = this._size)) {
            if (elements.length == 0) {
                return false;
            }
            ensureCapacity(i9 + elements.length);
            long[] jArr = this.content;
            int i10 = this._size;
            if (i8 != i10) {
                AbstractC1428l.h(jArr, jArr, elements.length + i8, i8, i10);
            }
            AbstractC1428l.m(elements, jArr, i8, 0, 0, 12, null);
            this._size += elements.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i8) {
        long[] jArr = this.content;
        if (jArr.length < i8) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i8, (jArr.length * 3) / 2));
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long j8) {
        remove(j8);
    }

    public final void plusAssign(LongList elements) {
        AbstractC3292y.i(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(long j8) {
        int indexOf = indexOf(j8);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(long[] elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        for (long j8 : elements) {
            remove(j8);
        }
        return i8 != this._size;
    }

    public final long removeAt(@IntRange(from = 0) int i8) {
        int i9;
        if (i8 >= 0 && i8 < (i9 = this._size)) {
            long[] jArr = this.content;
            long j8 = jArr[i8];
            if (i8 != i9 - 1) {
                AbstractC1428l.h(jArr, jArr, i8, i8 + 1, i9);
            }
            this._size--;
            return j8;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i8);
        sb.append(" must be in 0..");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void removeRange(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        int i10;
        if (i8 >= 0 && i8 <= (i10 = this._size) && i9 >= 0 && i9 <= i10) {
            if (i9 >= i8) {
                if (i9 != i8) {
                    if (i9 < i10) {
                        long[] jArr = this.content;
                        AbstractC1428l.h(jArr, jArr, i8, i9, i10);
                    }
                    this._size -= i9 - i8;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i8 + ") is more than end (" + i9 + ')');
        }
        throw new IndexOutOfBoundsException("Start (" + i8 + ") and end (" + i9 + ") must be in 0.." + this._size);
    }

    public final boolean retainAll(long[] elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        long[] jArr = this.content;
        int i9 = i8 - 1;
        while (true) {
            int i10 = 0;
            int i11 = -1;
            if (-1 >= i9) {
                break;
            }
            long j8 = jArr[i9];
            int length = elements.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (elements[i10] == j8) {
                    i11 = i10;
                    break;
                }
                i10++;
            }
            if (i11 < 0) {
                removeAt(i9);
            }
            i9--;
        }
        return i8 != this._size;
    }

    public final long set(@IntRange(from = 0) int i8, long j8) {
        if (i8 >= 0 && i8 < this._size) {
            long[] jArr = this.content;
            long j9 = jArr[i8];
            jArr[i8] = j8;
            return j9;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i8);
        sb.append(" must be between 0 .. ");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void sort() {
        AbstractC1428l.I(this.content, 0, this._size);
    }

    public final void sortDescending() {
        AbstractC1428l.O0(this.content, 0, this._size);
    }

    public final void trim(int i8) {
        int max = Math.max(i8, this._size);
        long[] jArr = this.content;
        if (jArr.length > max) {
            long[] copyOf = Arrays.copyOf(jArr, max);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public /* synthetic */ MutableLongList(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 16 : i8);
    }

    public final void minusAssign(long[] elements) {
        AbstractC3292y.i(elements, "elements");
        for (long j8 : elements) {
            remove(j8);
        }
    }

    public final void plusAssign(long[] elements) {
        AbstractC3292y.i(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableLongList(int i8) {
        super(i8, null);
    }

    public final void plusAssign(long j8) {
        add(j8);
    }

    public final void add(@IntRange(from = 0) int i8, long j8) {
        int i9;
        if (i8 >= 0 && i8 <= (i9 = this._size)) {
            ensureCapacity(i9 + 1);
            long[] jArr = this.content;
            int i10 = this._size;
            if (i8 != i10) {
                AbstractC1428l.h(jArr, jArr, i8 + 1, i8, i10);
            }
            jArr[i8] = j8;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final void minusAssign(LongList elements) {
        AbstractC3292y.i(elements, "elements");
        long[] jArr = elements.content;
        int i8 = elements._size;
        for (int i9 = 0; i9 < i8; i9++) {
            remove(jArr[i9]);
        }
    }

    public final boolean removeAll(LongList elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        int i9 = elements._size - 1;
        if (i9 >= 0) {
            int i10 = 0;
            while (true) {
                remove(elements.get(i10));
                if (i10 == i9) {
                    break;
                }
                i10++;
            }
        }
        return i8 != this._size;
    }

    public final boolean retainAll(LongList elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        long[] jArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (!elements.contains(jArr[i9])) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i8, LongList elements) {
        AbstractC3292y.i(elements, "elements");
        if (i8 >= 0 && i8 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            long[] jArr = this.content;
            int i9 = this._size;
            if (i8 != i9) {
                AbstractC1428l.h(jArr, jArr, elements._size + i8, i8, i9);
            }
            AbstractC1428l.h(elements.content, jArr, i8, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final boolean addAll(LongList elements) {
        AbstractC3292y.i(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(long[] elements) {
        AbstractC3292y.i(elements, "elements");
        return addAll(this._size, elements);
    }
}
