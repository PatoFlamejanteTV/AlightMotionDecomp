package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class TonalPalette {
    Map<Integer, Integer> cache = new HashMap();
    double chroma;
    double hue;
    Hct keyColor;

    private TonalPalette(double d8, double d9, Hct hct) {
        this.hue = d8;
        this.chroma = d9;
        this.keyColor = hct;
    }

    private static Hct createKeyColor(double d8, double d9) {
        Hct from = Hct.from(d8, d9, 50.0d);
        Hct hct = from;
        double abs = Math.abs(from.getChroma() - d9);
        for (double d10 = 1.0d; d10 < 50.0d; d10 += 1.0d) {
            if (Math.round(d9) == Math.round(hct.getChroma())) {
                return hct;
            }
            Hct from2 = Hct.from(d8, d9, 50.0d + d10);
            double abs2 = Math.abs(from2.getChroma() - d9);
            if (abs2 < abs) {
                hct = from2;
                abs = abs2;
            }
            Hct from3 = Hct.from(d8, d9, 50.0d - d10);
            double abs3 = Math.abs(from3.getChroma() - d9);
            if (abs3 < abs) {
                hct = from3;
                abs = abs3;
            }
        }
        return hct;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d8, double d9) {
        return new TonalPalette(d8, d9, createKeyColor(d8, d9));
    }

    public static TonalPalette fromInt(int i8) {
        return fromHct(Hct.fromInt(i8));
    }

    public double getChroma() {
        return this.chroma;
    }

    public Hct getHct(double d8) {
        return Hct.from(this.hue, this.chroma, d8);
    }

    public double getHue() {
        return this.hue;
    }

    public Hct getKeyColor() {
        return this.keyColor;
    }

    public int tone(int i8) {
        Integer num = this.cache.get(Integer.valueOf(i8));
        if (num == null) {
            num = Integer.valueOf(Hct.from(this.hue, this.chroma, i8).toInt());
            this.cache.put(Integer.valueOf(i8), num);
        }
        return num.intValue();
    }
}
