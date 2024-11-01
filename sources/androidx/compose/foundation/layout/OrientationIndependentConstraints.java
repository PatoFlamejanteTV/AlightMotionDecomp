package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j8) {
        this.value = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m543boximpl(long j8) {
        return new OrientationIndependentConstraints(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m545constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m547copyyUG9Ft0(long j8, int i8, int i9, int i10, int i11) {
        return m544constructorimpl(i8, i9, i10, i11);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m548copyyUG9Ft0$default(long j8, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = Constraints.m5125getMinWidthimpl(j8);
        }
        int i13 = i8;
        if ((i12 & 2) != 0) {
            i9 = Constraints.m5123getMaxWidthimpl(j8);
        }
        int i14 = i9;
        if ((i12 & 4) != 0) {
            i10 = Constraints.m5124getMinHeightimpl(j8);
        }
        int i15 = i10;
        if ((i12 & 8) != 0) {
            i11 = Constraints.m5122getMaxHeightimpl(j8);
        }
        return m547copyyUG9Ft0(j8, i13, i14, i15, i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m549equalsimpl(long j8, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m5116equalsimpl0(j8, ((OrientationIndependentConstraints) obj).m561unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m550equalsimpl0(long j8, long j9) {
        return Constraints.m5116equalsimpl0(j8, j9);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m551getCrossAxisMaximpl(long j8) {
        return Constraints.m5122getMaxHeightimpl(j8);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m552getCrossAxisMinimpl(long j8) {
        return Constraints.m5124getMinHeightimpl(j8);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m553getMainAxisMaximpl(long j8) {
        return Constraints.m5123getMaxWidthimpl(j8);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m554getMainAxisMinimpl(long j8) {
        return Constraints.m5125getMinWidthimpl(j8);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m555hashCodeimpl(long j8) {
        return Constraints.m5126hashCodeimpl(j8);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m556maxHeightimpl(long j8, LayoutOrientation orientation) {
        AbstractC3292y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return Constraints.m5122getMaxHeightimpl(j8);
        }
        return Constraints.m5123getMaxWidthimpl(j8);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m557maxWidthimpl(long j8, LayoutOrientation orientation) {
        AbstractC3292y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return Constraints.m5123getMaxWidthimpl(j8);
        }
        return Constraints.m5122getMaxHeightimpl(j8);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m558stretchCrossAxisq4ezo7Y(long j8) {
        int m5124getMinHeightimpl;
        int m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(j8);
        int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
        if (Constraints.m5122getMaxHeightimpl(j8) != Integer.MAX_VALUE) {
            m5124getMinHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
        } else {
            m5124getMinHeightimpl = Constraints.m5124getMinHeightimpl(j8);
        }
        return m544constructorimpl(m5125getMinWidthimpl, m5123getMaxWidthimpl, m5124getMinHeightimpl, Constraints.m5122getMaxHeightimpl(j8));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m559toBoxConstraintsOenEA2s(long j8, LayoutOrientation orientation) {
        AbstractC3292y.i(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return ConstraintsKt.Constraints(Constraints.m5125getMinWidthimpl(j8), Constraints.m5123getMaxWidthimpl(j8), Constraints.m5124getMinHeightimpl(j8), Constraints.m5122getMaxHeightimpl(j8));
        }
        return ConstraintsKt.Constraints(Constraints.m5124getMinHeightimpl(j8), Constraints.m5122getMaxHeightimpl(j8), Constraints.m5125getMinWidthimpl(j8), Constraints.m5123getMaxWidthimpl(j8));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m560toStringimpl(long j8) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m5128toStringimpl(j8)) + ')';
    }

    public boolean equals(Object obj) {
        return m549equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m555hashCodeimpl(this.value);
    }

    public String toString() {
        return m560toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m561unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m544constructorimpl(int i8, int i9, int i10, int i11) {
        return m545constructorimpl(ConstraintsKt.Constraints(i8, i9, i10, i11));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m546constructorimpl(long j8, LayoutOrientation orientation) {
        AbstractC3292y.i(orientation, "orientation");
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        return m544constructorimpl(orientation == layoutOrientation ? Constraints.m5125getMinWidthimpl(j8) : Constraints.m5124getMinHeightimpl(j8), orientation == layoutOrientation ? Constraints.m5123getMaxWidthimpl(j8) : Constraints.m5122getMaxHeightimpl(j8), orientation == layoutOrientation ? Constraints.m5124getMinHeightimpl(j8) : Constraints.m5125getMinWidthimpl(j8), orientation == layoutOrientation ? Constraints.m5122getMaxHeightimpl(j8) : Constraints.m5123getMaxWidthimpl(j8));
    }
}
