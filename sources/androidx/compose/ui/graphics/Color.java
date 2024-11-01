package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Color {
    private final long value;
    public static final Companion Companion = new Companion(null);
    private static final long Black = ColorKt.Color(4278190080L);
    private static final long DarkGray = ColorKt.Color(4282664004L);
    private static final long Gray = ColorKt.Color(4287137928L);
    private static final long LightGray = ColorKt.Color(4291611852L);
    private static final long White = ColorKt.Color(4294967295L);
    private static final long Red = ColorKt.Color(4294901760L);
    private static final long Green = ColorKt.Color(4278255360L);
    private static final long Blue = ColorKt.Color(4278190335L);
    private static final long Yellow = ColorKt.Color(4294967040L);
    private static final long Cyan = ColorKt.Color(4278255615L);
    private static final long Magenta = ColorKt.Color(4294902015L);
    private static final long Transparent = ColorKt.Color(0);
    private static final long Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getBlack-0d7_KjU$annotations */
        public static /* synthetic */ void m2959getBlack0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getBlue-0d7_KjU$annotations */
        public static /* synthetic */ void m2960getBlue0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getCyan-0d7_KjU$annotations */
        public static /* synthetic */ void m2961getCyan0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getDarkGray-0d7_KjU$annotations */
        public static /* synthetic */ void m2962getDarkGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGray-0d7_KjU$annotations */
        public static /* synthetic */ void m2963getGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getGreen-0d7_KjU$annotations */
        public static /* synthetic */ void m2964getGreen0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getLightGray-0d7_KjU$annotations */
        public static /* synthetic */ void m2965getLightGray0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getMagenta-0d7_KjU$annotations */
        public static /* synthetic */ void m2966getMagenta0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getRed-0d7_KjU$annotations */
        public static /* synthetic */ void m2967getRed0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getTransparent-0d7_KjU$annotations */
        public static /* synthetic */ void m2968getTransparent0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-0d7_KjU$annotations */
        public static /* synthetic */ void m2969getUnspecified0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getWhite-0d7_KjU$annotations */
        public static /* synthetic */ void m2970getWhite0d7_KjU$annotations() {
        }

        @Stable
        /* renamed from: getYellow-0d7_KjU$annotations */
        public static /* synthetic */ void m2971getYellow0d7_KjU$annotations() {
        }

        /* renamed from: hsl-JlNiLsg$default */
        public static /* synthetic */ long m2972hslJlNiLsg$default(Companion companion, float f8, float f9, float f10, float f11, Rgb rgb, int i8, Object obj) {
            float f12;
            if ((i8 & 8) != 0) {
                f12 = 1.0f;
            } else {
                f12 = f11;
            }
            if ((i8 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2987hslJlNiLsg(f8, f9, f10, f12, rgb);
        }

        private final float hslToRgbComponent(int i8, float f8, float f9, float f10) {
            float f11 = (i8 + (f8 / 30.0f)) % 12.0f;
            return f10 - ((f9 * Math.min(f10, 1.0f - f10)) * Math.max(-1.0f, Math.min(f11 - 3, Math.min(9 - f11, 1.0f))));
        }

        /* renamed from: hsv-JlNiLsg$default */
        public static /* synthetic */ long m2973hsvJlNiLsg$default(Companion companion, float f8, float f9, float f10, float f11, Rgb rgb, int i8, Object obj) {
            float f12;
            if ((i8 & 8) != 0) {
                f12 = 1.0f;
            } else {
                f12 = f11;
            }
            if ((i8 & 16) != 0) {
                rgb = ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2988hsvJlNiLsg(f8, f9, f10, f12, rgb);
        }

        private final float hsvToRgbComponent(int i8, float f8, float f9, float f10) {
            float f11 = (i8 + (f8 / 60.0f)) % 6.0f;
            return f10 - ((f9 * f10) * Math.max(0.0f, Math.min(f11, Math.min(4 - f11, 1.0f))));
        }

        /* renamed from: getBlack-0d7_KjU */
        public final long m2974getBlack0d7_KjU() {
            return Color.Black;
        }

        /* renamed from: getBlue-0d7_KjU */
        public final long m2975getBlue0d7_KjU() {
            return Color.Blue;
        }

        /* renamed from: getCyan-0d7_KjU */
        public final long m2976getCyan0d7_KjU() {
            return Color.Cyan;
        }

        /* renamed from: getDarkGray-0d7_KjU */
        public final long m2977getDarkGray0d7_KjU() {
            return Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU */
        public final long m2978getGray0d7_KjU() {
            return Color.Gray;
        }

        /* renamed from: getGreen-0d7_KjU */
        public final long m2979getGreen0d7_KjU() {
            return Color.Green;
        }

        /* renamed from: getLightGray-0d7_KjU */
        public final long m2980getLightGray0d7_KjU() {
            return Color.LightGray;
        }

        /* renamed from: getMagenta-0d7_KjU */
        public final long m2981getMagenta0d7_KjU() {
            return Color.Magenta;
        }

        /* renamed from: getRed-0d7_KjU */
        public final long m2982getRed0d7_KjU() {
            return Color.Red;
        }

        /* renamed from: getTransparent-0d7_KjU */
        public final long m2983getTransparent0d7_KjU() {
            return Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU */
        public final long m2984getUnspecified0d7_KjU() {
            return Color.Unspecified;
        }

        /* renamed from: getWhite-0d7_KjU */
        public final long m2985getWhite0d7_KjU() {
            return Color.White;
        }

        /* renamed from: getYellow-0d7_KjU */
        public final long m2986getYellow0d7_KjU() {
            return Color.Yellow;
        }

        /* renamed from: hsl-JlNiLsg */
        public final long m2987hslJlNiLsg(float f8, float f9, float f10, float f11, Rgb rgb) {
            if (0.0f <= f8 && f8 <= 360.0f && 0.0f <= f9 && f9 <= 1.0f && 0.0f <= f10 && f10 <= 1.0f) {
                return ColorKt.Color(hslToRgbComponent(0, f8, f9, f10), hslToRgbComponent(8, f8, f9, f10), hslToRgbComponent(4, f8, f9, f10), f11, rgb);
            }
            throw new IllegalArgumentException(("HSL (" + f8 + ", " + f9 + ", " + f10 + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        /* renamed from: hsv-JlNiLsg */
        public final long m2988hsvJlNiLsg(float f8, float f9, float f10, float f11, Rgb rgb) {
            if (0.0f <= f8 && f8 <= 360.0f && 0.0f <= f9 && f9 <= 1.0f && 0.0f <= f10 && f10 <= 1.0f) {
                return ColorKt.Color(hsvToRgbComponent(5, f8, f9, f10), hsvToRgbComponent(3, f8, f9, f10), hsvToRgbComponent(1, f8, f9, f10), f11, rgb);
            }
            throw new IllegalArgumentException(("HSV (" + f8 + ", " + f9 + ", " + f10 + ") must be in range (0..360, 0..1, 0..1)").toString());
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private /* synthetic */ Color(long j8) {
        this.value = j8;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Color m2938boximpl(long j8) {
        return new Color(j8);
    }

    @Stable
    /* renamed from: component1-impl */
    public static final float m2939component1impl(long j8) {
        return m2954getRedimpl(j8);
    }

    @Stable
    /* renamed from: component2-impl */
    public static final float m2940component2impl(long j8) {
        return m2953getGreenimpl(j8);
    }

    @Stable
    /* renamed from: component3-impl */
    public static final float m2941component3impl(long j8) {
        return m2951getBlueimpl(j8);
    }

    @Stable
    /* renamed from: component4-impl */
    public static final float m2942component4impl(long j8) {
        return m2950getAlphaimpl(j8);
    }

    @Stable
    /* renamed from: component5-impl */
    public static final ColorSpace m2943component5impl(long j8) {
        return m2952getColorSpaceimpl(j8);
    }

    /* renamed from: constructor-impl */
    public static long m2944constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: convert-vNxB06k */
    public static final long m2945convertvNxB06k(long j8, ColorSpace colorSpace) {
        ColorSpace m2952getColorSpaceimpl = m2952getColorSpaceimpl(j8);
        if (AbstractC3292y.d(colorSpace, m2952getColorSpaceimpl)) {
            return j8;
        }
        return ColorSpaceKt.m3344connectYBCOT_4$default(m2952getColorSpaceimpl, colorSpace, 0, 2, null).mo3346transformToColorwmQWz5c$ui_graphics_release(m2954getRedimpl(j8), m2953getGreenimpl(j8), m2951getBlueimpl(j8), m2950getAlphaimpl(j8));
    }

    @Stable
    /* renamed from: copy-wmQWz5c */
    public static final long m2946copywmQWz5c(long j8, float f8, float f9, float f10, float f11) {
        return ColorKt.Color(f9, f10, f11, f8, m2952getColorSpaceimpl(j8));
    }

    /* renamed from: copy-wmQWz5c$default */
    public static /* synthetic */ long m2947copywmQWz5c$default(long j8, float f8, float f9, float f10, float f11, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m2950getAlphaimpl(j8);
        }
        float f12 = f8;
        if ((i8 & 2) != 0) {
            f9 = m2954getRedimpl(j8);
        }
        float f13 = f9;
        if ((i8 & 4) != 0) {
            f10 = m2953getGreenimpl(j8);
        }
        float f14 = f10;
        if ((i8 & 8) != 0) {
            f11 = m2951getBlueimpl(j8);
        }
        return m2946copywmQWz5c(j8, f12, f13, f14, f11);
    }

    /* renamed from: equals-impl */
    public static boolean m2948equalsimpl(long j8, Object obj) {
        return (obj instanceof Color) && j8 == ((Color) obj).m2958unboximpl();
    }

    /* renamed from: equals-impl0 */
    public static final boolean m2949equalsimpl0(long j8, long j9) {
        return Q5.C.d(j8, j9);
    }

    @Stable
    public static /* synthetic */ void getAlpha$annotations() {
    }

    /* renamed from: getAlpha-impl */
    public static final float m2950getAlphaimpl(long j8) {
        float c8;
        float f8;
        if (Q5.C.b(63 & j8) == 0) {
            c8 = (float) Q5.K.c(Q5.C.b(Q5.C.b(j8 >>> 56) & 255));
            f8 = 255.0f;
        } else {
            c8 = (float) Q5.K.c(Q5.C.b(Q5.C.b(j8 >>> 6) & 1023));
            f8 = 1023.0f;
        }
        return c8 / f8;
    }

    @Stable
    public static /* synthetic */ void getBlue$annotations() {
    }

    /* renamed from: getBlue-impl */
    public static final float m2951getBlueimpl(long j8) {
        if (Q5.C.b(63 & j8) == 0) {
            return ((float) Q5.K.c(Q5.C.b(Q5.C.b(j8 >>> 32) & 255))) / 255.0f;
        }
        return Float16.m3072toFloatimpl(Float16.m3056constructorimpl((short) Q5.C.b(Q5.C.b(j8 >>> 16) & 65535)));
    }

    @Stable
    public static /* synthetic */ void getColorSpace$annotations() {
    }

    /* renamed from: getColorSpace-impl */
    public static final ColorSpace m2952getColorSpaceimpl(long j8) {
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) Q5.C.b(j8 & 63)];
    }

    @Stable
    public static /* synthetic */ void getGreen$annotations() {
    }

    /* renamed from: getGreen-impl */
    public static final float m2953getGreenimpl(long j8) {
        if (Q5.C.b(63 & j8) == 0) {
            return ((float) Q5.K.c(Q5.C.b(Q5.C.b(j8 >>> 40) & 255))) / 255.0f;
        }
        return Float16.m3072toFloatimpl(Float16.m3056constructorimpl((short) Q5.C.b(Q5.C.b(j8 >>> 32) & 65535)));
    }

    @Stable
    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: getRed-impl */
    public static final float m2954getRedimpl(long j8) {
        if (Q5.C.b(63 & j8) == 0) {
            return ((float) Q5.K.c(Q5.C.b(Q5.C.b(j8 >>> 48) & 255))) / 255.0f;
        }
        return Float16.m3072toFloatimpl(Float16.m3056constructorimpl((short) Q5.C.b(Q5.C.b(j8 >>> 48) & 65535)));
    }

    /* renamed from: hashCode-impl */
    public static int m2955hashCodeimpl(long j8) {
        return Q5.C.e(j8);
    }

    /* renamed from: toString-impl */
    public static String m2956toStringimpl(long j8) {
        return "Color(" + m2954getRedimpl(j8) + ", " + m2953getGreenimpl(j8) + ", " + m2951getBlueimpl(j8) + ", " + m2950getAlphaimpl(j8) + ", " + m2952getColorSpaceimpl(j8).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m2948equalsimpl(this.value, obj);
    }

    /* renamed from: getValue-s-VKNKU */
    public final long m2957getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return m2955hashCodeimpl(this.value);
    }

    public String toString() {
        return m2956toStringimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ long m2958unboximpl() {
        return this.value;
    }
}
