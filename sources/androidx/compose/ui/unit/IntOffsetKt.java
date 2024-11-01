package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import e6.AbstractC2829a;

/* loaded from: classes.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i8, int i9) {
        return IntOffset.m5273constructorimpl((i9 & 4294967295L) | (i8 << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m5290lerp81ZRxRo(long j8, long j9, float f8) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m5279getXimpl(j8), IntOffset.m5279getXimpl(j9), f8), MathHelpersKt.lerp(IntOffset.m5280getYimpl(j8), IntOffset.m5280getYimpl(j9), f8));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m5291minusNvtHpc(long j8, long j9) {
        return OffsetKt.Offset(Offset.m2712getXimpl(j8) - IntOffset.m5279getXimpl(j9), Offset.m2713getYimpl(j8) - IntOffset.m5280getYimpl(j9));
    }

    @Stable
    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m5292minusoCl6YwE(long j8, long j9) {
        return OffsetKt.Offset(IntOffset.m5279getXimpl(j8) - Offset.m2712getXimpl(j9), IntOffset.m5280getYimpl(j8) - Offset.m2713getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m5293plusNvtHpc(long j8, long j9) {
        return OffsetKt.Offset(Offset.m2712getXimpl(j8) + IntOffset.m5279getXimpl(j9), Offset.m2713getYimpl(j8) + IntOffset.m5280getYimpl(j9));
    }

    @Stable
    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m5294plusoCl6YwE(long j8, long j9) {
        return OffsetKt.Offset(IntOffset.m5279getXimpl(j8) + Offset.m2712getXimpl(j9), IntOffset.m5280getYimpl(j8) + Offset.m2713getYimpl(j9));
    }

    @Stable
    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m5295roundk4lQ0M(long j8) {
        return IntOffset(AbstractC2829a.d(Offset.m2712getXimpl(j8)), AbstractC2829a.d(Offset.m2713getYimpl(j8)));
    }

    @Stable
    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m5296toOffsetgyyYBs(long j8) {
        return OffsetKt.Offset(IntOffset.m5279getXimpl(j8), IntOffset.m5280getYimpl(j8));
    }
}
