package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import i6.m;

/* loaded from: classes.dex */
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i8, int i9, int i10, int i11) {
        if (i9 >= i8) {
            if (i11 >= i10) {
                if (i8 >= 0 && i10 >= 0) {
                    return Constraints.Companion.m5130createConstraintsZbe2FdA$ui_unit_release(i8, i9, i10, i11);
                }
                throw new IllegalArgumentException(("minWidth(" + i8 + ") and minHeight(" + i10 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i11 + ") must be >= than minHeight(" + i10 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i9 + ") must be >= than minWidth(" + i8 + ')').toString());
    }

    public static /* synthetic */ long Constraints$default(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = 0;
        }
        if ((i12 & 2) != 0) {
            i9 = Integer.MAX_VALUE;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return Constraints(i8, i9, i10, i11);
    }

    private static final int addMaxWithMinimum(int i8, int i9) {
        if (i8 != Integer.MAX_VALUE) {
            return m.d(i8 + i9, 0);
        }
        return i8;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m5134constrain4WqzIAM(long j8, long j9) {
        return IntSizeKt.IntSize(m.k(IntSize.m5321getWidthimpl(j9), Constraints.m5125getMinWidthimpl(j8), Constraints.m5123getMaxWidthimpl(j8)), m.k(IntSize.m5320getHeightimpl(j9), Constraints.m5124getMinHeightimpl(j8), Constraints.m5122getMaxHeightimpl(j8)));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m5135constrainN9IONVI(long j8, long j9) {
        return Constraints(m.k(Constraints.m5125getMinWidthimpl(j9), Constraints.m5125getMinWidthimpl(j8), Constraints.m5123getMaxWidthimpl(j8)), m.k(Constraints.m5123getMaxWidthimpl(j9), Constraints.m5125getMinWidthimpl(j8), Constraints.m5123getMaxWidthimpl(j8)), m.k(Constraints.m5124getMinHeightimpl(j9), Constraints.m5124getMinHeightimpl(j8), Constraints.m5122getMaxHeightimpl(j8)), m.k(Constraints.m5122getMaxHeightimpl(j9), Constraints.m5124getMinHeightimpl(j8), Constraints.m5122getMaxHeightimpl(j8)));
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m5136constrainHeightK40F9xA(long j8, int i8) {
        return m.k(i8, Constraints.m5124getMinHeightimpl(j8), Constraints.m5122getMaxHeightimpl(j8));
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m5137constrainWidthK40F9xA(long j8, int i8) {
        return m.k(i8, Constraints.m5125getMinWidthimpl(j8), Constraints.m5123getMaxWidthimpl(j8));
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m5138isSatisfiedBy4WqzIAM(long j8, long j9) {
        int m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(j8);
        int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
        int m5321getWidthimpl = IntSize.m5321getWidthimpl(j9);
        if (m5125getMinWidthimpl <= m5321getWidthimpl && m5321getWidthimpl <= m5123getMaxWidthimpl) {
            int m5124getMinHeightimpl = Constraints.m5124getMinHeightimpl(j8);
            int m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
            int m5320getHeightimpl = IntSize.m5320getHeightimpl(j9);
            if (m5124getMinHeightimpl <= m5320getHeightimpl && m5320getHeightimpl <= m5122getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m5139offsetNN6EwU(long j8, int i8, int i9) {
        return Constraints(m.d(Constraints.m5125getMinWidthimpl(j8) + i8, 0), addMaxWithMinimum(Constraints.m5123getMaxWidthimpl(j8), i8), m.d(Constraints.m5124getMinHeightimpl(j8) + i9, 0), addMaxWithMinimum(Constraints.m5122getMaxHeightimpl(j8), i9));
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m5140offsetNN6EwU$default(long j8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i8 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return m5139offsetNN6EwU(j8, i8, i9);
    }
}
