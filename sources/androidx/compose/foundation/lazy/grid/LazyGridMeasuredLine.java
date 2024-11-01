package androidx.compose.foundation.lazy.grid;

import Q5.I;
import i6.m;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyGridMeasuredLine {
    private final int index;
    private final boolean isVertical;
    private final LazyGridMeasuredItem[] items;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final LazyGridSlots slots;
    private final List<GridItemSpan> spans;

    public LazyGridMeasuredLine(int i8, LazyGridMeasuredItem[] items, LazyGridSlots slots, List<GridItemSpan> spans, boolean z8, int i9) {
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(slots, "slots");
        AbstractC3292y.i(spans, "spans");
        this.index = i8;
        this.items = items;
        this.slots = slots;
        this.spans = spans;
        this.isVertical = z8;
        this.mainAxisSpacing = i9;
        int i10 = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : items) {
            i10 = Math.max(i10, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = i10;
        this.mainAxisSizeWithSpacings = m.d(i10 + this.mainAxisSpacing, 0);
    }

    public final int getIndex() {
        return this.index;
    }

    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        if (this.items.length == 0) {
            return true;
        }
        return false;
    }

    public final LazyGridMeasuredItem[] position(int i8, int i9, int i10) {
        int i11;
        int i12;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        int length = lazyGridMeasuredItemArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i13];
            int i16 = i14 + 1;
            int m694getCurrentLineSpanimpl = GridItemSpan.m694getCurrentLineSpanimpl(this.spans.get(i14).m697unboximpl());
            int i17 = this.slots.getPositions()[i15];
            boolean z8 = this.isVertical;
            if (z8) {
                i11 = this.index;
            } else {
                i11 = i15;
            }
            if (z8) {
                i12 = i15;
            } else {
                i12 = this.index;
            }
            lazyGridMeasuredItem.position(i8, i17, i9, i10, i11, i12);
            I i18 = I.f8786a;
            i15 += m694getCurrentLineSpanimpl;
            i13++;
            i14 = i16;
        }
        return this.items;
    }
}
