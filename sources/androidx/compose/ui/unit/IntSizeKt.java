package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.SizeKt;

/* loaded from: classes.dex */
public final class IntSizeKt {
    @Stable
    public static final long IntSize(int i8, int i9) {
        return IntSize.m5316constructorimpl((i9 & 4294967295L) | (i8 << 32));
    }

    /* renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m5327getCenterozmzZPI(long j8) {
        return IntOffsetKt.IntOffset(IntSize.m5321getWidthimpl(j8) / 2, IntSize.m5320getHeightimpl(j8) / 2);
    }

    @Stable
    /* renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m5328getCenterozmzZPI$annotations(long j8) {
    }

    @Stable
    /* renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m5329timesO0kMr_c(int i8, long j8) {
        return IntSize.m5323timesYEO4UFw(j8, i8);
    }

    @Stable
    /* renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m5330toIntRectozmzZPI(long j8) {
        return IntRectKt.m5311IntRectVbeCjmY(IntOffset.Companion.m5289getZeronOccac(), j8);
    }

    @Stable
    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m5331toSizeozmzZPI(long j8) {
        return SizeKt.Size(IntSize.m5321getWidthimpl(j8), IntSize.m5320getHeightimpl(j8));
    }
}
