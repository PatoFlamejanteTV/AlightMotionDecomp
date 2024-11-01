package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingValuesImpl(float f8, float f9, float f10, float f11, AbstractC3284p abstractC3284p) {
        this(f8, f9, f10, f11);
    }

    @Stable
    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m594getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m595getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m596getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m597getTopD9Ej5fM$annotations() {
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo527calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo528calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.start;
        }
        return this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo529calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            return this.end;
        }
        return this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo530calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        if (!Dp.m5160equalsimpl0(this.start, paddingValuesImpl.start) || !Dp.m5160equalsimpl0(this.top, paddingValuesImpl.top) || !Dp.m5160equalsimpl0(this.end, paddingValuesImpl.end) || !Dp.m5160equalsimpl0(this.bottom, paddingValuesImpl.bottom)) {
            return false;
        }
        return true;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m598getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m599getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m600getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m601getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m5161hashCodeimpl(this.start) * 31) + Dp.m5161hashCodeimpl(this.top)) * 31) + Dp.m5161hashCodeimpl(this.end)) * 31) + Dp.m5161hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) Dp.m5166toStringimpl(this.start)) + ", top=" + ((Object) Dp.m5166toStringimpl(this.top)) + ", end=" + ((Object) Dp.m5166toStringimpl(this.end)) + ", bottom=" + ((Object) Dp.m5166toStringimpl(this.bottom)) + ')';
    }

    private PaddingValuesImpl(float f8, float f9, float f10, float f11) {
        this.start = f8;
        this.top = f9;
        this.end = f10;
        this.bottom = f11;
    }

    public /* synthetic */ PaddingValuesImpl(float f8, float f9, float f10, float f11, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Dp.m5155constructorimpl(0) : f8, (i8 & 2) != 0 ? Dp.m5155constructorimpl(0) : f9, (i8 & 4) != 0 ? Dp.m5155constructorimpl(0) : f10, (i8 & 8) != 0 ? Dp.m5155constructorimpl(0) : f11, null);
    }
}
