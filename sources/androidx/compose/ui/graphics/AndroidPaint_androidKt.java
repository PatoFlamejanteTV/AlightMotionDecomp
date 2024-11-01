package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;

/* loaded from: classes.dex */
public final class AndroidPaint_androidKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final Paint asComposePaint(android.graphics.Paint paint) {
        return new AndroidPaint(paint);
    }

    public static final float getNativeAlpha(android.graphics.Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(android.graphics.Paint paint) {
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(android.graphics.Paint paint) {
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(android.graphics.Paint paint) {
        if (!paint.isFilterBitmap()) {
            return FilterQuality.Companion.m3049getNonefv9h1I();
        }
        return FilterQuality.Companion.m3047getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(android.graphics.Paint paint) {
        int i8;
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i8 = -1;
        } else {
            i8 = WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return StrokeCap.Companion.m3278getButtKaPHkGw();
                }
                return StrokeCap.Companion.m3280getSquareKaPHkGw();
            }
            return StrokeCap.Companion.m3279getRoundKaPHkGw();
        }
        return StrokeCap.Companion.m3278getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(android.graphics.Paint paint) {
        int i8;
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i8 = -1;
        } else {
            i8 = WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return StrokeJoin.Companion.m3289getMiterLxFBmk8();
                }
                return StrokeJoin.Companion.m3290getRoundLxFBmk8();
            }
            return StrokeJoin.Companion.m3288getBevelLxFBmk8();
        }
        return StrokeJoin.Companion.m3289getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(android.graphics.Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(android.graphics.Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(android.graphics.Paint paint) {
        int i8;
        Paint.Style style = paint.getStyle();
        if (style == null) {
            i8 = -1;
        } else {
            i8 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        }
        if (i8 == 1) {
            return PaintingStyle.Companion.m3196getStrokeTiuSbCo();
        }
        return PaintingStyle.Companion.m3195getFillTiuSbCo();
    }

    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(7);
    }

    public static final void setNativeAlpha(android.graphics.Paint paint, float f8) {
        paint.setAlpha((int) Math.rint(f8 * 255.0f));
    }

    public static final void setNativeAntiAlias(android.graphics.Paint paint, boolean z8) {
        paint.setAntiAlias(z8);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m2838setNativeBlendModeGB0RdKg(android.graphics.Paint paint, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m3328setBlendModeGB0RdKg(paint, i8);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m2805toPorterDuffModes9anfk8(i8)));
        }
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m2839setNativeColor4WTKRHQ(android.graphics.Paint paint, long j8) {
        paint.setColor(ColorKt.m3002toArgb8_81llA(j8));
    }

    public static final void setNativeColorFilter(android.graphics.Paint paint, ColorFilter colorFilter) {
        android.graphics.ColorFilter colorFilter2;
        if (colorFilter != null) {
            colorFilter2 = AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter);
        } else {
            colorFilter2 = null;
        }
        paint.setColorFilter(colorFilter2);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m2840setNativeFilterQuality50PEsBU(android.graphics.Paint paint, int i8) {
        paint.setFilterBitmap(!FilterQuality.m3042equalsimpl0(i8, FilterQuality.Companion.m3049getNonefv9h1I()));
    }

    public static final void setNativePathEffect(android.graphics.Paint paint, PathEffect pathEffect) {
        android.graphics.PathEffect pathEffect2;
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        if (androidPathEffect != null) {
            pathEffect2 = androidPathEffect.getNativePathEffect();
        } else {
            pathEffect2 = null;
        }
        paint.setPathEffect(pathEffect2);
    }

    public static final void setNativeShader(android.graphics.Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m2841setNativeStrokeCapCSYIeUk(android.graphics.Paint paint, int i8) {
        Paint.Cap cap;
        StrokeCap.Companion companion = StrokeCap.Companion;
        if (StrokeCap.m3274equalsimpl0(i8, companion.m3280getSquareKaPHkGw())) {
            cap = Paint.Cap.SQUARE;
        } else if (StrokeCap.m3274equalsimpl0(i8, companion.m3279getRoundKaPHkGw())) {
            cap = Paint.Cap.ROUND;
        } else if (StrokeCap.m3274equalsimpl0(i8, companion.m3278getButtKaPHkGw())) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m2842setNativeStrokeJoinkLtJ_vA(android.graphics.Paint paint, int i8) {
        Paint.Join join;
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        if (StrokeJoin.m3284equalsimpl0(i8, companion.m3289getMiterLxFBmk8())) {
            join = Paint.Join.MITER;
        } else if (StrokeJoin.m3284equalsimpl0(i8, companion.m3288getBevelLxFBmk8())) {
            join = Paint.Join.BEVEL;
        } else if (StrokeJoin.m3284equalsimpl0(i8, companion.m3290getRoundLxFBmk8())) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void setNativeStrokeMiterLimit(android.graphics.Paint paint, float f8) {
        paint.setStrokeMiter(f8);
    }

    public static final void setNativeStrokeWidth(android.graphics.Paint paint, float f8) {
        paint.setStrokeWidth(f8);
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m2843setNativeStyle5YerkU(android.graphics.Paint paint, int i8) {
        Paint.Style style;
        if (PaintingStyle.m3191equalsimpl0(i8, PaintingStyle.Companion.m3196getStrokeTiuSbCo())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }
}
