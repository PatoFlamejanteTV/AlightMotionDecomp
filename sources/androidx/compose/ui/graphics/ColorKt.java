package androidx.compose.ui.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ColorKt {
    @Stable
    public static final long Color(float f8, float f9, float f10, float f11, ColorSpace colorSpace) {
        float minValue = colorSpace.getMinValue(0);
        if (f8 <= colorSpace.getMaxValue(0) && minValue <= f8) {
            float minValue2 = colorSpace.getMinValue(1);
            if (f9 <= colorSpace.getMaxValue(1) && minValue2 <= f9) {
                float minValue3 = colorSpace.getMinValue(2);
                if (f10 <= colorSpace.getMaxValue(2) && minValue3 <= f10 && 0.0f <= f11 && f11 <= 1.0f) {
                    if (colorSpace.isSrgb()) {
                        return Color.m2944constructorimpl(Q5.C.b(Q5.C.b(Q5.C.b((((((int) ((f8 * 255.0f) + 0.5f)) << 16) | (((int) ((f11 * 255.0f) + 0.5f)) << 24)) | (((int) ((f9 * 255.0f) + 0.5f)) << 8)) | ((int) ((f10 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (colorSpace.getComponentCount() == 3) {
                        int id$ui_graphics_release = colorSpace.getId$ui_graphics_release();
                        if (id$ui_graphics_release != -1) {
                            short m3055constructorimpl = Float16.m3055constructorimpl(f8);
                            return Color.m2944constructorimpl(Q5.C.b(Q5.C.b(Q5.C.b(Q5.C.b(Q5.C.b(Q5.C.b(Q5.C.b(Float16.m3055constructorimpl(f9)) & 65535) << 32) | Q5.C.b(Q5.C.b(Q5.C.b(m3055constructorimpl) & 65535) << 48)) | Q5.C.b(Q5.C.b(Q5.C.b(Float16.m3055constructorimpl(f10)) & 65535) << 16)) | Q5.C.b(Q5.C.b(Q5.C.b((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | Q5.C.b(Q5.C.b(id$ui_graphics_release) & 63)));
                        }
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
                    }
                    throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f8 + ", green = " + f9 + ", blue = " + f10 + ", alpha = " + f11 + " outside the range for " + colorSpace).toString());
    }

    public static /* synthetic */ long Color$default(float f8, float f9, float f10, float f11, ColorSpace colorSpace, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            f11 = 1.0f;
        }
        if ((i8 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f8, f9, f10, f11, colorSpace);
    }

    private static final float compositeComponent(float f8, float f9, float f10, float f11, float f12) {
        if (f12 == 0.0f) {
            return 0.0f;
        }
        return ((f8 * f10) + ((f9 * f11) * (1.0f - f10))) / f12;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m2993compositeOverOWjLjI(long j8, long j9) {
        float f8;
        float f9;
        long m2945convertvNxB06k = Color.m2945convertvNxB06k(j8, Color.m2952getColorSpaceimpl(j9));
        float m2950getAlphaimpl = Color.m2950getAlphaimpl(j9);
        float m2950getAlphaimpl2 = Color.m2950getAlphaimpl(m2945convertvNxB06k);
        float f10 = 1.0f - m2950getAlphaimpl2;
        float f11 = (m2950getAlphaimpl * f10) + m2950getAlphaimpl2;
        float m2954getRedimpl = Color.m2954getRedimpl(m2945convertvNxB06k);
        float m2954getRedimpl2 = Color.m2954getRedimpl(j9);
        float f12 = 0.0f;
        if (f11 == 0.0f) {
            f8 = 0.0f;
        } else {
            f8 = ((m2954getRedimpl * m2950getAlphaimpl2) + ((m2954getRedimpl2 * m2950getAlphaimpl) * f10)) / f11;
        }
        float m2953getGreenimpl = Color.m2953getGreenimpl(m2945convertvNxB06k);
        float m2953getGreenimpl2 = Color.m2953getGreenimpl(j9);
        if (f11 == 0.0f) {
            f9 = 0.0f;
        } else {
            f9 = ((m2953getGreenimpl * m2950getAlphaimpl2) + ((m2953getGreenimpl2 * m2950getAlphaimpl) * f10)) / f11;
        }
        float m2951getBlueimpl = Color.m2951getBlueimpl(m2945convertvNxB06k);
        float m2951getBlueimpl2 = Color.m2951getBlueimpl(j9);
        if (f11 != 0.0f) {
            f12 = ((m2951getBlueimpl * m2950getAlphaimpl2) + ((m2951getBlueimpl2 * m2950getAlphaimpl) * f10)) / f11;
        }
        return Color(f8, f9, f12, f11, Color.m2952getColorSpaceimpl(j9));
    }

    @Size(4)
    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m2994getComponents8_81llA(long j8) {
        return new float[]{Color.m2954getRedimpl(j8), Color.m2953getGreenimpl(j8), Color.m2951getBlueimpl(j8), Color.m2950getAlphaimpl(j8)};
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m2995isSpecified8_81llA(long j8) {
        if (j8 != Color.Companion.m2984getUnspecified0d7_KjU()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m2996isSpecified8_81llA$annotations(long j8) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m2997isUnspecified8_81llA(long j8) {
        if (j8 == Color.Companion.m2984getUnspecified0d7_KjU()) {
            return true;
        }
        return false;
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m2998isUnspecified8_81llA$annotations(long j8) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m2999lerpjxsXWHM(long j8, long j9, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long m2945convertvNxB06k = Color.m2945convertvNxB06k(j8, oklab);
        long m2945convertvNxB06k2 = Color.m2945convertvNxB06k(j9, oklab);
        float m2950getAlphaimpl = Color.m2950getAlphaimpl(m2945convertvNxB06k);
        float m2954getRedimpl = Color.m2954getRedimpl(m2945convertvNxB06k);
        float m2953getGreenimpl = Color.m2953getGreenimpl(m2945convertvNxB06k);
        float m2951getBlueimpl = Color.m2951getBlueimpl(m2945convertvNxB06k);
        float m2950getAlphaimpl2 = Color.m2950getAlphaimpl(m2945convertvNxB06k2);
        float m2954getRedimpl2 = Color.m2954getRedimpl(m2945convertvNxB06k2);
        float m2953getGreenimpl2 = Color.m2953getGreenimpl(m2945convertvNxB06k2);
        float m2951getBlueimpl2 = Color.m2951getBlueimpl(m2945convertvNxB06k2);
        return Color.m2945convertvNxB06k(Color(MathHelpersKt.lerp(m2954getRedimpl, m2954getRedimpl2, f8), MathHelpersKt.lerp(m2953getGreenimpl, m2953getGreenimpl2, f8), MathHelpersKt.lerp(m2951getBlueimpl, m2951getBlueimpl2, f8), MathHelpersKt.lerp(m2950getAlphaimpl, m2950getAlphaimpl2, f8), oklab), Color.m2952getColorSpaceimpl(j9));
    }

    @Stable
    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m3000luminance8_81llA(long j8) {
        ColorSpace m2952getColorSpaceimpl = Color.m2952getColorSpaceimpl(j8);
        if (ColorModel.m3332equalsimpl0(m2952getColorSpaceimpl.m3341getModelxdoWZVw(), ColorModel.Companion.m3339getRgbxdoWZVw())) {
            AbstractC3292y.g(m2952getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) m2952getColorSpaceimpl).getEotfFunc$ui_graphics_release();
            return saturate((float) ((eotfFunc$ui_graphics_release.invoke(Color.m2954getRedimpl(j8)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m2953getGreenimpl(j8)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m2951getBlueimpl(j8)) * 0.0722d)));
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m3335toStringimpl(m2952getColorSpaceimpl.m3341getModelxdoWZVw()))).toString());
    }

    private static final float saturate(float f8) {
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        return f8;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m3001takeOrElseDxMtmZc(long j8, Function0 function0) {
        if (j8 == Color.Companion.m2984getUnspecified0d7_KjU()) {
            return ((Color) function0.invoke()).m2958unboximpl();
        }
        return j8;
    }

    @Stable
    @ColorInt
    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m3002toArgb8_81llA(long j8) {
        return (int) Q5.C.b(Color.m2945convertvNxB06k(j8, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 255;
        }
        return Color(i8, i9, i10, i11);
    }

    @Stable
    public static final long Color(@ColorInt int i8) {
        return Color.m2944constructorimpl(Q5.C.b(Q5.C.b(i8) << 32));
    }

    @Stable
    public static final long Color(long j8) {
        return Color.m2944constructorimpl(Q5.C.b(Q5.C.b(Q5.C.b(j8) & 4294967295L) << 32));
    }

    @Stable
    public static final long Color(@IntRange(from = 0, to = 255) int i8, @IntRange(from = 0, to = 255) int i9, @IntRange(from = 0, to = 255) int i10, @IntRange(from = 0, to = 255) int i11) {
        return Color(((i8 & 255) << 16) | ((i11 & 255) << 24) | ((i9 & 255) << 8) | (i10 & 255));
    }
}
