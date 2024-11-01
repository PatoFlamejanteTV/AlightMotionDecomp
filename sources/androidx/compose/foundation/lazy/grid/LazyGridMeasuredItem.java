package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import i6.m;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private int column;
    private final Object contentType;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private long offset;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private int row;
    private final long size;
    private final long visualOffset;

    public /* synthetic */ LazyGridMeasuredItem(int i8, Object obj, boolean z8, int i9, int i10, boolean z9, LayoutDirection layoutDirection, int i11, int i12, List list, long j8, Object obj2, AbstractC3284p abstractC3284p) {
        this(i8, obj, z8, i9, i10, z9, layoutDirection, i11, i12, list, j8, obj2);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m711copy4Tuh3kE(long j8, Function1 function1) {
        int intValue;
        if (this.isVertical) {
            intValue = IntOffset.m5279getXimpl(j8);
        } else {
            intValue = ((Number) function1.invoke(Integer.valueOf(IntOffset.m5279getXimpl(j8)))).intValue();
        }
        boolean z8 = this.isVertical;
        int m5280getYimpl = IntOffset.m5280getYimpl(j8);
        if (z8) {
            m5280getYimpl = ((Number) function1.invoke(Integer.valueOf(m5280getYimpl))).intValue();
        }
        return IntOffsetKt.IntOffset(intValue, m5280getYimpl);
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m712getMainAxisgyyYBs(long j8) {
        if (this.isVertical) {
            return IntOffset.m5280getYimpl(j8);
        }
        return IntOffset.m5279getXimpl(j8);
    }

    public static /* synthetic */ void position$default(LazyGridMeasuredItem lazyGridMeasuredItem, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Object obj) {
        int i15;
        int i16;
        if ((i14 & 16) != 0) {
            i15 = -1;
        } else {
            i15 = i12;
        }
        if ((i14 & 32) != 0) {
            i16 = -1;
        } else {
            i16 = i13;
        }
        lazyGridMeasuredItem.position(i8, i9, i10, i11, i15, i16);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisOffset() {
        if (this.isVertical) {
            return IntOffset.m5279getXimpl(mo707getOffsetnOccac());
        }
        return IntOffset.m5280getYimpl(mo707getOffsetnOccac());
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getOffset-nOcc-ac */
    public long mo707getOffsetnOccac() {
        return this.offset;
    }

    public final Object getParentData(int i8) {
        return this.placeables.get(i8).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* renamed from: getSize-YbymL2g */
    public long mo708getSizeYbymL2g() {
        return this.size;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final void place(Placeable.PlacementScope scope) {
        LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode;
        int m5279getXimpl;
        int m5280getYimpl;
        AbstractC3292y.i(scope, "scope");
        if (this.mainAxisLayoutSize != Integer.MIN_VALUE) {
            int placeablesCount = getPlaceablesCount();
            for (int i8 = 0; i8 < placeablesCount; i8++) {
                Placeable placeable = this.placeables.get(i8);
                int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
                int i9 = this.maxMainAxisOffset;
                long mo707getOffsetnOccac = mo707getOffsetnOccac();
                Object parentData = getParentData(i8);
                if (parentData instanceof LazyLayoutAnimateItemModifierNode) {
                    lazyLayoutAnimateItemModifierNode = (LazyLayoutAnimateItemModifierNode) parentData;
                } else {
                    lazyLayoutAnimateItemModifierNode = null;
                }
                if (lazyLayoutAnimateItemModifierNode != null) {
                    long m720getPlacementDeltanOccac = lazyLayoutAnimateItemModifierNode.m720getPlacementDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(mo707getOffsetnOccac) + IntOffset.m5279getXimpl(m720getPlacementDeltanOccac), IntOffset.m5280getYimpl(mo707getOffsetnOccac) + IntOffset.m5280getYimpl(m720getPlacementDeltanOccac));
                    if ((m712getMainAxisgyyYBs(mo707getOffsetnOccac) <= mainAxisSize && m712getMainAxisgyyYBs(IntOffset) <= mainAxisSize) || (m712getMainAxisgyyYBs(mo707getOffsetnOccac) >= i9 && m712getMainAxisgyyYBs(IntOffset) >= i9)) {
                        lazyLayoutAnimateItemModifierNode.cancelAnimation();
                    }
                    mo707getOffsetnOccac = IntOffset;
                }
                if (this.reverseLayout) {
                    if (this.isVertical) {
                        m5279getXimpl = IntOffset.m5279getXimpl(mo707getOffsetnOccac);
                    } else {
                        m5279getXimpl = (this.mainAxisLayoutSize - IntOffset.m5279getXimpl(mo707getOffsetnOccac)) - getMainAxisSize(placeable);
                    }
                    if (this.isVertical) {
                        m5280getYimpl = (this.mainAxisLayoutSize - IntOffset.m5280getYimpl(mo707getOffsetnOccac)) - getMainAxisSize(placeable);
                    } else {
                        m5280getYimpl = IntOffset.m5280getYimpl(mo707getOffsetnOccac);
                    }
                    mo707getOffsetnOccac = IntOffsetKt.IntOffset(m5279getXimpl, m5280getYimpl);
                }
                long j8 = this.visualOffset;
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(mo707getOffsetnOccac) + IntOffset.m5279getXimpl(j8), IntOffset.m5280getYimpl(mo707getOffsetnOccac) + IntOffset.m5280getYimpl(j8));
                if (this.isVertical) {
                    Placeable.PlacementScope.m4149placeWithLayeraW9wM$default(scope, placeable, IntOffset2, 0.0f, null, 6, null);
                } else {
                    Placeable.PlacementScope.m4148placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffset2, 0.0f, null, 6, null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void position(int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14;
        long IntOffset;
        boolean z8 = this.isVertical;
        if (z8) {
            i14 = i11;
        } else {
            i14 = i10;
        }
        this.mainAxisLayoutSize = i14;
        if (!z8) {
            i10 = i11;
        }
        if (z8 && this.layoutDirection == LayoutDirection.Rtl) {
            i9 = (i10 - i9) - this.crossAxisSize;
        }
        if (z8) {
            IntOffset = IntOffsetKt.IntOffset(i9, i8);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i8, i9);
        }
        this.offset = IntOffset;
        this.row = i12;
        this.column = i13;
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridMeasuredItem(int i8, Object key, boolean z8, int i9, int i10, boolean z9, LayoutDirection layoutDirection, int i11, int i12, List<? extends Placeable> placeables, long j8, Object obj) {
        long IntSize;
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        AbstractC3292y.i(placeables, "placeables");
        this.index = i8;
        this.key = key;
        this.isVertical = z8;
        this.crossAxisSize = i9;
        this.reverseLayout = z9;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.placeables = placeables;
        this.visualOffset = j8;
        this.contentType = obj;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = placeables.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Placeable placeable = (Placeable) placeables.get(i14);
            i13 = Math.max(i13, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i13;
        this.mainAxisSizeWithSpacings = m.d(i10 + i13, 0);
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(this.crossAxisSize, i13);
        } else {
            IntSize = IntSizeKt.IntSize(i13, this.crossAxisSize);
        }
        this.size = IntSize;
        this.offset = IntOffset.Companion.m5289getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
