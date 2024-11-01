package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import i6.m;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final Object contentType;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int sizeWithSpacings;
    private final int spacing;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    @ExperimentalFoundationApi
    public /* synthetic */ LazyListMeasuredItem(int i8, List list, boolean z8, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z9, int i9, int i10, int i11, long j8, Object obj, Object obj2, AbstractC3284p abstractC3284p) {
        this(i8, list, z8, horizontal, vertical, layoutDirection, z9, i9, i10, i11, j8, obj, obj2);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m683copy4Tuh3kE(long j8, Function1 function1) {
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
    private final int m684getMainAxisgyyYBs(long j8) {
        if (this.isVertical) {
            return IntOffset.m5280getYimpl(j8);
        }
        return IntOffset.m5279getXimpl(j8);
    }

    private final int getMainAxisSize(Placeable placeable) {
        if (this.isVertical) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long m685getOffsetBjo55l4(int i8) {
        int[] iArr = this.placeableOffsets;
        int i9 = i8 * 2;
        return IntOffsetKt.IntOffset(iArr[i9], iArr[i9 + 1]);
    }

    public final Object getParentData(int i8) {
        return this.placeables.get(i8).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
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
                long m685getOffsetBjo55l4 = m685getOffsetBjo55l4(i8);
                Object parentData = getParentData(i8);
                if (parentData instanceof LazyLayoutAnimateItemModifierNode) {
                    lazyLayoutAnimateItemModifierNode = (LazyLayoutAnimateItemModifierNode) parentData;
                } else {
                    lazyLayoutAnimateItemModifierNode = null;
                }
                if (lazyLayoutAnimateItemModifierNode != null) {
                    long m720getPlacementDeltanOccac = lazyLayoutAnimateItemModifierNode.m720getPlacementDeltanOccac();
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m685getOffsetBjo55l4) + IntOffset.m5279getXimpl(m720getPlacementDeltanOccac), IntOffset.m5280getYimpl(m685getOffsetBjo55l4) + IntOffset.m5280getYimpl(m720getPlacementDeltanOccac));
                    if ((m684getMainAxisgyyYBs(m685getOffsetBjo55l4) <= mainAxisSize && m684getMainAxisgyyYBs(IntOffset) <= mainAxisSize) || (m684getMainAxisgyyYBs(m685getOffsetBjo55l4) >= i9 && m684getMainAxisgyyYBs(IntOffset) >= i9)) {
                        lazyLayoutAnimateItemModifierNode.cancelAnimation();
                    }
                    m685getOffsetBjo55l4 = IntOffset;
                }
                if (this.reverseLayout) {
                    if (this.isVertical) {
                        m5279getXimpl = IntOffset.m5279getXimpl(m685getOffsetBjo55l4);
                    } else {
                        m5279getXimpl = (this.mainAxisLayoutSize - IntOffset.m5279getXimpl(m685getOffsetBjo55l4)) - getMainAxisSize(placeable);
                    }
                    if (this.isVertical) {
                        m5280getYimpl = (this.mainAxisLayoutSize - IntOffset.m5280getYimpl(m685getOffsetBjo55l4)) - getMainAxisSize(placeable);
                    } else {
                        m5280getYimpl = IntOffset.m5280getYimpl(m685getOffsetBjo55l4);
                    }
                    m685getOffsetBjo55l4 = IntOffsetKt.IntOffset(m5279getXimpl, m5280getYimpl);
                }
                long j8 = this.visualOffset;
                long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m685getOffsetBjo55l4) + IntOffset.m5279getXimpl(j8), IntOffset.m5280getYimpl(m685getOffsetBjo55l4) + IntOffset.m5280getYimpl(j8));
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

    public final void position(int i8, int i9, int i10) {
        int i11;
        int width;
        this.offset = i8;
        if (this.isVertical) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        this.mainAxisLayoutSize = i11;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Placeable placeable = list.get(i12);
            int i13 = i12 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal != null) {
                    iArr[i13] = horizontal.align(placeable.getWidth(), i9, this.layoutDirection);
                    this.placeableOffsets[i13 + 1] = i8;
                    width = placeable.getHeight();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i13] = i8;
                int i14 = i13 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical != null) {
                    iArr2[i14] = vertical.align(placeable.getHeight(), i10);
                    width = placeable.getWidth();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            i8 += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyListMeasuredItem(int i8, List<? extends Placeable> placeables, boolean z8, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z9, int i9, int i10, int i11, long j8, Object key, Object obj) {
        AbstractC3292y.i(placeables, "placeables");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        AbstractC3292y.i(key, "key");
        this.index = i8;
        this.placeables = placeables;
        this.isVertical = z8;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z9;
        this.beforeContentPadding = i9;
        this.afterContentPadding = i10;
        this.spacing = i11;
        this.visualOffset = j8;
        this.key = key;
        this.contentType = obj;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = placeables.size();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Placeable placeable = (Placeable) placeables.get(i14);
            i12 += this.isVertical ? placeable.getHeight() : placeable.getWidth();
            i13 = Math.max(i13, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = i12;
        this.sizeWithSpacings = m.d(getSize() + this.spacing, 0);
        this.crossAxisSize = i13;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }
}
