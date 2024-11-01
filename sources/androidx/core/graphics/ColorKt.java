package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class ColorKt {
    public static final int component1(@ColorInt int i8) {
        return (i8 >> 24) & 255;
    }

    public static final int component2(@ColorInt int i8) {
        return (i8 >> 16) & 255;
    }

    public static final int component3(@ColorInt int i8) {
        return (i8 >> 8) & 255;
    }

    public static final int component4(@ColorInt int i8) {
        return i8 & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@ColorInt int i8, ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(i8, colorSpace);
        return convert;
    }

    public static final int getAlpha(@ColorInt int i8) {
        return (i8 >> 24) & 255;
    }

    public static final int getBlue(@ColorInt int i8) {
        return i8 & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final ColorSpace getColorSpace(long j8) {
        ColorSpace colorSpace;
        colorSpace = Color.colorSpace(j8);
        return colorSpace;
    }

    public static final int getGreen(@ColorInt int i8) {
        return (i8 >> 8) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(@ColorInt int i8) {
        float luminance;
        luminance = Color.luminance(i8);
        return luminance;
    }

    public static final int getRed(@ColorInt int i8) {
        return (i8 >> 16) & 255;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isSrgb(long j8) {
        boolean isSrgb;
        isSrgb = Color.isSrgb(j8);
        return isSrgb;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean isWideGamut(long j8) {
        boolean isWideGamut;
        isWideGamut = Color.isWideGamut(j8);
        return isWideGamut;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color plus(Color color, Color color2) {
        return ColorUtils.compositeColors(color2, color);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color toColor(@ColorInt int i8) {
        Color valueOf;
        valueOf = Color.valueOf(i8);
        return valueOf;
    }

    @ColorInt
    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final int toColorInt(long j8) {
        int argb;
        argb = Color.toArgb(j8);
        return argb;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long toColorLong(@ColorInt int i8) {
        long pack;
        pack = Color.pack(i8);
        return pack;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component1(Color color) {
        float component;
        component = color.getComponent(0);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component2(Color color) {
        float component;
        component = color.getComponent(1);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component3(Color color) {
        float component;
        component = color.getComponent(2);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component4(Color color) {
        float component;
        component = color.getComponent(3);
        return component;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(@ColorInt int i8, ColorSpace colorSpace) {
        long convert;
        convert = Color.convert(i8, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getAlpha(long j8) {
        float alpha;
        alpha = Color.alpha(j8);
        return alpha;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getBlue(long j8) {
        float blue;
        blue = Color.blue(j8);
        return blue;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getGreen(long j8) {
        float green;
        green = Color.green(j8);
        return green;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getLuminance(long j8) {
        float luminance;
        luminance = Color.luminance(j8);
        return luminance;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float getRed(long j8) {
        float red;
        red = Color.red(j8);
        return red;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color toColor(long j8) {
        Color valueOf;
        valueOf = Color.valueOf(j8);
        return valueOf;
    }

    @ColorInt
    public static final int toColorInt(String str) {
        return Color.parseColor(str);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component1(long j8) {
        float red;
        red = Color.red(j8);
        return red;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component2(long j8) {
        float green;
        green = Color.green(j8);
        return green;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component3(long j8) {
        float blue;
        blue = Color.blue(j8);
        return blue;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float component4(long j8) {
        float alpha;
        alpha = Color.alpha(j8);
        return alpha;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long j8, ColorSpace.Named named) {
        ColorSpace colorSpace;
        long convert;
        colorSpace = ColorSpace.get(named);
        convert = Color.convert(j8, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long convertTo(long j8, ColorSpace colorSpace) {
        long convert;
        convert = Color.convert(j8, colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color convertTo(Color color, ColorSpace.Named named) {
        ColorSpace colorSpace;
        Color convert;
        colorSpace = ColorSpace.get(named);
        convert = color.convert(colorSpace);
        return convert;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Color convertTo(Color color, ColorSpace colorSpace) {
        Color convert;
        convert = color.convert(colorSpace);
        return convert;
    }
}
