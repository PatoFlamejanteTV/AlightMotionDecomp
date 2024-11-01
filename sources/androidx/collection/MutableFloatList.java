package androidx.collection;

import R5.AbstractC1428l;
import androidx.annotation.IntRange;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = mutableFloatList._size;
        }
        mutableFloatList.trim(i8);
    }

    public final boolean add(float f8) {
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i8 = this._size;
        fArr[i8] = f8;
        this._size = i8 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i8, float[] elements) {
        int i9;
        AbstractC3292y.i(elements, "elements");
        if (i8 >= 0 && i8 <= (i9 = this._size)) {
            if (elements.length == 0) {
                return false;
            }
            ensureCapacity(i9 + elements.length);
            float[] fArr = this.content;
            int i10 = this._size;
            if (i8 != i10) {
                AbstractC1428l.f(fArr, fArr, elements.length + i8, i8, i10);
            }
            AbstractC1428l.k(elements, fArr, i8, 0, 0, 12, null);
            this._size += elements.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i8) {
        float[] fArr = this.content;
        if (fArr.length < i8) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(i8, (fArr.length * 3) / 2));
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(float f8) {
        remove(f8);
    }

    public final void plusAssign(FloatList elements) {
        AbstractC3292y.i(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(float f8) {
        int indexOf = indexOf(f8);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(float[] elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        for (float f8 : elements) {
            remove(f8);
        }
        return i8 != this._size;
    }

    public final float removeAt(@IntRange(from = 0) int i8) {
        int i9;
        if (i8 >= 0 && i8 < (i9 = this._size)) {
            float[] fArr = this.content;
            float f8 = fArr[i8];
            if (i8 != i9 - 1) {
                AbstractC1428l.f(fArr, fArr, i8, i8 + 1, i9);
            }
            this._size--;
            return f8;
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
                        float[] fArr = this.content;
                        AbstractC1428l.f(fArr, fArr, i8, i9, i10);
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

    public final boolean retainAll(float[] elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        float[] fArr = this.content;
        int i9 = i8 - 1;
        while (true) {
            int i10 = 0;
            int i11 = -1;
            if (-1 >= i9) {
                break;
            }
            float f8 = fArr[i9];
            int length = elements.length;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (elements[i10] == f8) {
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

    public final float set(@IntRange(from = 0) int i8, float f8) {
        if (i8 >= 0 && i8 < this._size) {
            float[] fArr = this.content;
            float f9 = fArr[i8];
            fArr[i8] = f8;
            return f9;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i8);
        sb.append(" must be between 0 .. ");
        sb.append(this._size - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void sort() {
        AbstractC1428l.G(this.content, 0, this._size);
    }

    public final void sortDescending() {
        AbstractC1428l.M0(this.content, 0, this._size);
    }

    public final void trim(int i8) {
        int max = Math.max(i8, this._size);
        float[] fArr = this.content;
        if (fArr.length > max) {
            float[] copyOf = Arrays.copyOf(fArr, max);
            AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public /* synthetic */ MutableFloatList(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 16 : i8);
    }

    public final void minusAssign(float[] elements) {
        AbstractC3292y.i(elements, "elements");
        for (float f8 : elements) {
            remove(f8);
        }
    }

    public final void plusAssign(float[] elements) {
        AbstractC3292y.i(elements, "elements");
        addAll(this._size, elements);
    }

    public MutableFloatList(int i8) {
        super(i8, null);
    }

    public final void plusAssign(float f8) {
        add(f8);
    }

    public final void add(@IntRange(from = 0) int i8, float f8) {
        int i9;
        if (i8 >= 0 && i8 <= (i9 = this._size)) {
            ensureCapacity(i9 + 1);
            float[] fArr = this.content;
            int i10 = this._size;
            if (i8 != i10) {
                AbstractC1428l.f(fArr, fArr, i8 + 1, i8, i10);
            }
            fArr[i8] = f8;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final void minusAssign(FloatList elements) {
        AbstractC3292y.i(elements, "elements");
        float[] fArr = elements.content;
        int i8 = elements._size;
        for (int i9 = 0; i9 < i8; i9++) {
            remove(fArr[i9]);
        }
    }

    public final boolean removeAll(FloatList elements) {
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

    public final boolean retainAll(FloatList elements) {
        AbstractC3292y.i(elements, "elements");
        int i8 = this._size;
        float[] fArr = this.content;
        for (int i9 = i8 - 1; -1 < i9; i9--) {
            if (!elements.contains(fArr[i9])) {
                removeAt(i9);
            }
        }
        return i8 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i8, FloatList elements) {
        AbstractC3292y.i(elements, "elements");
        if (i8 >= 0 && i8 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            float[] fArr = this.content;
            int i9 = this._size;
            if (i8 != i9) {
                AbstractC1428l.f(fArr, fArr, elements._size + i8, i8, i9);
            }
            AbstractC1428l.f(elements.content, fArr, i8, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i8 + " must be in 0.." + this._size);
    }

    public final boolean addAll(FloatList elements) {
        AbstractC3292y.i(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(float[] elements) {
        AbstractC3292y.i(elements, "elements");
        return addAll(this._size, elements);
    }
}
