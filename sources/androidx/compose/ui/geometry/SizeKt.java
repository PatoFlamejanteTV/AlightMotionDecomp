package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SizeKt {
    @Stable
    public static final long Size(float f8, float f9) {
        return Size.m2772constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m2791getCenteruvyYCjk(long j8) {
        return OffsetKt.Offset(Size.m2781getWidthimpl(j8) / 2.0f, Size.m2778getHeightimpl(j8) / 2.0f);
    }

    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m2792getCenteruvyYCjk$annotations(long j8) {
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m2793isSpecifieduvyYCjk(long j8) {
        if (j8 != Size.Companion.m2789getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m2794isSpecifieduvyYCjk$annotations(long j8) {
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m2795isUnspecifieduvyYCjk(long j8) {
        if (j8 == Size.Companion.m2789getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m2796isUnspecifieduvyYCjk$annotations(long j8) {
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m2797lerpVgWVRYQ(long j8, long j9, float f8) {
        return Size(MathHelpersKt.lerp(Size.m2781getWidthimpl(j8), Size.m2781getWidthimpl(j9), f8), MathHelpersKt.lerp(Size.m2778getHeightimpl(j8), Size.m2778getHeightimpl(j9), f8));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m2798takeOrElseTmRCtEA(long j8, Function0 function0) {
        if (j8 == Size.Companion.m2789getUnspecifiedNHjbRc()) {
            return ((Size) function0.invoke()).m2786unboximpl();
        }
        return j8;
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m2801timesd16Qtg0(int i8, long j8) {
        return Size.m2784times7Ah8Wj8(j8, i8);
    }

    @Stable
    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m2802toRectuvyYCjk(long j8) {
        return RectKt.m2752Recttz77jQw(Offset.Companion.m2728getZeroF1C5BW0(), j8);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m2799timesd16Qtg0(double d8, long j8) {
        return Size.m2784times7Ah8Wj8(j8, (float) d8);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m2800timesd16Qtg0(float f8, long j8) {
        return Size.m2784times7Ah8Wj8(j8, f8);
    }
}
