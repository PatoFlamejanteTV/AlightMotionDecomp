package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class SelectionHandlesKt {
    private static final float HandleHeight;
    private static final float HandleWidth;
    private static final SemanticsPropertyKey<SelectionHandleInfo> SelectionHandleInfoKey = new SemanticsPropertyKey<>("SelectionHandleInfo", null, 2, null);

    static {
        float f8 = 25;
        HandleWidth = Dp.m5155constructorimpl(f8);
        HandleHeight = Dp.m5155constructorimpl(f8);
    }

    /* renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m1006getAdjustedCoordinatesk4lQ0M(long j8) {
        return OffsetKt.Offset(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8) - 1.0f);
    }

    public static final float getHandleHeight() {
        return HandleHeight;
    }

    public static final float getHandleWidth() {
        return HandleWidth;
    }

    public static final SemanticsPropertyKey<SelectionHandleInfo> getSelectionHandleInfoKey() {
        return SelectionHandleInfoKey;
    }
}
