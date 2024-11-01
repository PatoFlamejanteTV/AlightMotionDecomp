package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import i6.m;

/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m952finalConstraintstfFHcEY(long j8, boolean z8, int i8, float f8) {
        return ConstraintsKt.Constraints$default(0, m954finalMaxWidthtfFHcEY(j8, z8, i8, f8), 0, Constraints.m5122getMaxHeightimpl(j8), 5, null);
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m953finalMaxLinesxdlQI24(boolean z8, int i8, int i9) {
        if (!z8 && TextOverflow.m5101equalsimpl0(i8, TextOverflow.Companion.m5109getEllipsisgIe3tQ8())) {
            return 1;
        }
        return m.d(i9, 1);
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m954finalMaxWidthtfFHcEY(long j8, boolean z8, int i8, float f8) {
        int m5123getMaxWidthimpl;
        if ((z8 || TextOverflow.m5101equalsimpl0(i8, TextOverflow.Companion.m5109getEllipsisgIe3tQ8())) && Constraints.m5119getHasBoundedWidthimpl(j8)) {
            m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
        } else {
            m5123getMaxWidthimpl = Integer.MAX_VALUE;
        }
        if (Constraints.m5125getMinWidthimpl(j8) != m5123getMaxWidthimpl) {
            return m.k(TextDelegateKt.ceilToIntPx(f8), Constraints.m5125getMinWidthimpl(j8), m5123getMaxWidthimpl);
        }
        return m5123getMaxWidthimpl;
    }
}
