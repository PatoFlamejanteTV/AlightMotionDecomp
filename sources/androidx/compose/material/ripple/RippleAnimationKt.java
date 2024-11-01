package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m5155constructorimpl(10);
    private static final int FadeInDuration = 75;
    private static final int FadeOutDuration = 150;
    private static final int RadiusDuration = 225;

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m1416getRippleEndRadiuscSwnlzA(Density getRippleEndRadius, boolean z8, long j8) {
        AbstractC3292y.i(getRippleEndRadius, "$this$getRippleEndRadius");
        float m2710getDistanceimpl = Offset.m2710getDistanceimpl(OffsetKt.Offset(Size.m2781getWidthimpl(j8), Size.m2778getHeightimpl(j8))) / 2.0f;
        if (z8) {
            return m2710getDistanceimpl + getRippleEndRadius.mo425toPx0680j_4(BoundedRippleExtraRadius);
        }
        return m2710getDistanceimpl;
    }

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m1417getRippleStartRadiusuvyYCjk(long j8) {
        return Math.max(Size.m2781getWidthimpl(j8), Size.m2778getHeightimpl(j8)) * 0.3f;
    }
}
