package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MeasuredPage implements PageInfo {
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ MeasuredPage(int i8, int i9, List list, long j8, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z8, AbstractC3284p abstractC3284p) {
        this(i8, i9, list, j8, obj, orientation, horizontal, vertical, layoutDirection, z8);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m781copy4Tuh3kE(long j8, Function1 function1) {
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

    private final int getMainAxisSize(Placeable placeable) {
        if (this.isVertical) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m782getOffsetBjo55l4(int i8) {
        int[] iArr = this.placeableOffsets;
        int i9 = i8 * 2;
        return IntOffsetKt.IntOffset(iArr[i9], iArr[i9 + 1]);
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    public final Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope scope) {
        int m5279getXimpl;
        int m5280getYimpl;
        AbstractC3292y.i(scope, "scope");
        if (this.mainAxisLayoutSize != Integer.MIN_VALUE) {
            int size = this.placeables.size();
            for (int i8 = 0; i8 < size; i8++) {
                Placeable placeable = this.placeables.get(i8);
                long m782getOffsetBjo55l4 = m782getOffsetBjo55l4(i8);
                if (this.reverseLayout) {
                    if (this.isVertical) {
                        m5279getXimpl = IntOffset.m5279getXimpl(m782getOffsetBjo55l4);
                    } else {
                        m5279getXimpl = (this.mainAxisLayoutSize - IntOffset.m5279getXimpl(m782getOffsetBjo55l4)) - getMainAxisSize(placeable);
                    }
                    if (this.isVertical) {
                        m5280getYimpl = (this.mainAxisLayoutSize - IntOffset.m5280getYimpl(m782getOffsetBjo55l4)) - getMainAxisSize(placeable);
                    } else {
                        m5280getYimpl = IntOffset.m5280getYimpl(m782getOffsetBjo55l4);
                    }
                    m782getOffsetBjo55l4 = IntOffsetKt.IntOffset(m5279getXimpl, m5280getYimpl);
                }
                long j8 = this.visualOffset;
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m782getOffsetBjo55l4) + IntOffset.m5279getXimpl(j8), IntOffset.m5280getYimpl(m782getOffsetBjo55l4) + IntOffset.m5280getYimpl(j8));
                if (this.isVertical) {
                    Placeable.PlacementScope.m4149placeWithLayeraW9wM$default(scope, placeable, IntOffset, 0.0f, null, 6, null);
                } else {
                    Placeable.PlacementScope.m4148placeRelativeWithLayeraW9wM$default(scope, placeable, IntOffset, 0.0f, null, 6, null);
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i8, int i9, List<? extends Placeable> placeables, long j8, Object key, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z8) {
        AbstractC3292y.i(placeables, "placeables");
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(orientation, "orientation");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        this.index = i8;
        this.size = i9;
        this.placeables = placeables;
        this.visualOffset = j8;
        this.key = key;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z8;
        this.isVertical = orientation == Orientation.Vertical;
        int size = placeables.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Placeable placeable = (Placeable) placeables.get(i11);
            i10 = Math.max(i10, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = i10;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }
}
