package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class DynamicScheme {
    public final double contrastLevel;
    public final TonalPalette errorPalette = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    public final boolean isDark;
    public final TonalPalette neutralPalette;
    public final TonalPalette neutralVariantPalette;
    public final TonalPalette primaryPalette;
    public final TonalPalette secondaryPalette;
    public final int sourceColorArgb;
    public final Hct sourceColorHct;
    public final TonalPalette tertiaryPalette;
    public final Variant variant;

    public DynamicScheme(Hct hct, Variant variant, boolean z8, double d8, TonalPalette tonalPalette, TonalPalette tonalPalette2, TonalPalette tonalPalette3, TonalPalette tonalPalette4, TonalPalette tonalPalette5) {
        this.sourceColorArgb = hct.toInt();
        this.sourceColorHct = hct;
        this.variant = variant;
        this.isDark = z8;
        this.contrastLevel = d8;
        this.primaryPalette = tonalPalette;
        this.secondaryPalette = tonalPalette2;
        this.tertiaryPalette = tonalPalette3;
        this.neutralPalette = tonalPalette4;
        this.neutralVariantPalette = tonalPalette5;
    }

    public static double getRotatedHue(Hct hct, double[] dArr, double[] dArr2) {
        double hue = hct.getHue();
        int i8 = 0;
        if (dArr2.length == 1) {
            return MathUtils.sanitizeDegreesDouble(hue + dArr2[0]);
        }
        int length = dArr.length;
        while (i8 <= length - 2) {
            double d8 = dArr[i8];
            int i9 = i8 + 1;
            double d9 = dArr[i9];
            if (d8 < hue && hue < d9) {
                return MathUtils.sanitizeDegreesDouble(hue + dArr2[i8]);
            }
            i8 = i9;
        }
        return hue;
    }
}
