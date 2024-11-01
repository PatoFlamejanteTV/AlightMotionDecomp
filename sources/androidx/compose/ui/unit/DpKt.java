package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import i6.m;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m5176DpOffsetYgX7TsA(float f8, float f9) {
        return DpOffset.m5211constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m5177DpSizeYgX7TsA(float f8, float f9) {
        return DpSize.m5244constructorimpl((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m5178coerceAtLeastYgX7TsA(float f8, float f9) {
        return Dp.m5155constructorimpl(m.c(f8, f9));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m5179coerceAtMostYgX7TsA(float f8, float f9) {
        return Dp.m5155constructorimpl(m.f(f8, f9));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m5180coerceIn2z7ARbQ(float f8, float f9, float f10) {
        return Dp.m5155constructorimpl(m.j(f8, f9, f10));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m5181getCenterEaSLcWc(long j8) {
        return m5176DpOffsetYgX7TsA(Dp.m5155constructorimpl(DpSize.m5253getWidthD9Ej5fM(j8) / 2.0f), Dp.m5155constructorimpl(DpSize.m5251getHeightD9Ej5fM(j8) / 2.0f));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5182getCenterEaSLcWc$annotations(long j8) {
    }

    public static final float getDp(int i8) {
        return Dp.m5155constructorimpl(i8);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d8) {
    }

    public static final float getHeight(DpRect dpRect) {
        return Dp.m5155constructorimpl(dpRect.m5237getBottomD9Ej5fM() - dpRect.m5240getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(DpRect dpRect) {
        return m5177DpSizeYgX7TsA(Dp.m5155constructorimpl(dpRect.m5239getRightD9Ej5fM() - dpRect.m5238getLeftD9Ej5fM()), Dp.m5155constructorimpl(dpRect.m5237getBottomD9Ej5fM() - dpRect.m5240getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(DpRect dpRect) {
        return Dp.m5155constructorimpl(dpRect.m5239getRightD9Ej5fM() - dpRect.m5238getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m5183isFinite0680j_4(float f8) {
        return !(f8 == Float.POSITIVE_INFINITY);
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5184isFinite0680j_4$annotations(float f8) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m5185isSpecified0680j_4(float f8) {
        return !Float.isNaN(f8);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5186isSpecified0680j_4$annotations(float f8) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m5187isSpecifiedEaSLcWc(long j8) {
        if (j8 != DpSize.Companion.m5262getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5188isSpecifiedEaSLcWc$annotations(long j8) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m5189isSpecifiedjoFl9I(long j8) {
        if (j8 != DpOffset.Companion.m5225getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m5190isSpecifiedjoFl9I$annotations(long j8) {
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m5191isUnspecified0680j_4(float f8) {
        return Float.isNaN(f8);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m5192isUnspecified0680j_4$annotations(float f8) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m5193isUnspecifiedEaSLcWc(long j8) {
        if (j8 == DpSize.Companion.m5262getUnspecifiedMYxV2XQ()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m5194isUnspecifiedEaSLcWc$annotations(long j8) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m5195isUnspecifiedjoFl9I(long j8) {
        if (j8 == DpOffset.Companion.m5225getUnspecifiedRKDOV3M()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m5196isUnspecifiedjoFl9I$annotations(long j8) {
    }

    @Stable
    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m5197lerpIDex15A(long j8, long j9, float f8) {
        return m5177DpSizeYgX7TsA(m5198lerpMdfbLM(DpSize.m5253getWidthD9Ej5fM(j8), DpSize.m5253getWidthD9Ej5fM(j9), f8), m5198lerpMdfbLM(DpSize.m5251getHeightD9Ej5fM(j8), DpSize.m5251getHeightD9Ej5fM(j9), f8));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m5198lerpMdfbLM(float f8, float f9, float f10) {
        return Dp.m5155constructorimpl(MathHelpersKt.lerp(f8, f9, f10));
    }

    @Stable
    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m5199lerpxhh869w(long j8, long j9, float f8) {
        return m5176DpOffsetYgX7TsA(m5198lerpMdfbLM(DpOffset.m5216getXD9Ej5fM(j8), DpOffset.m5216getXD9Ej5fM(j9), f8), m5198lerpMdfbLM(DpOffset.m5218getYD9Ej5fM(j8), DpOffset.m5218getYD9Ej5fM(j9), f8));
    }

    @Stable
    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m5200maxYgX7TsA(float f8, float f9) {
        return Dp.m5155constructorimpl(Math.max(f8, f9));
    }

    @Stable
    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m5201minYgX7TsA(float f8, float f9) {
        return Dp.m5155constructorimpl(Math.min(f8, f9));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m5202takeOrElseD5KLDUw(float f8, Function0 function0) {
        if (!(!Float.isNaN(f8))) {
            return ((Dp) function0.invoke()).m5169unboximpl();
        }
        return f8;
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m5203takeOrElsegVKV90s(long j8, Function0 function0) {
        if (j8 == DpOffset.Companion.m5225getUnspecifiedRKDOV3M()) {
            return ((DpOffset) function0.invoke()).m5224unboximpl();
        }
        return j8;
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m5204takeOrElseitqla9I(long j8, Function0 function0) {
        if (j8 == DpSize.Companion.m5262getUnspecifiedMYxV2XQ()) {
            return ((DpSize) function0.invoke()).m5261unboximpl();
        }
        return j8;
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5206times3ABfNKs(float f8, float f9) {
        return Dp.m5155constructorimpl(f8 * f9);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m5209times6HolHcs(int i8, long j8) {
        return DpSize.m5259timesGh9hcWk(j8, i8);
    }

    public static final float getDp(double d8) {
        return Dp.m5155constructorimpl((float) d8);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f8) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5205times3ABfNKs(double d8, float f8) {
        return Dp.m5155constructorimpl(((float) d8) * f8);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m5208times6HolHcs(float f8, long j8) {
        return DpSize.m5258timesGh9hcWk(j8, f8);
    }

    public static final float getDp(float f8) {
        return Dp.m5155constructorimpl(f8);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i8) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m5207times3ABfNKs(int i8, float f8) {
        return Dp.m5155constructorimpl(i8 * f8);
    }
}
