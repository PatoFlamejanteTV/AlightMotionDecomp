package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SchemeNeutral extends DynamicScheme {
    public SchemeNeutral(Hct hct, boolean z8, double d8) {
        super(hct, Variant.NEUTRAL, z8, d8, TonalPalette.fromHueAndChroma(hct.getHue(), 12.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 8.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 2.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 2.0d));
    }
}
