package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* loaded from: classes.dex */
public final class AndroidDensity_androidKt {
    public static final Density Density(Context context) {
        FontScaleConverter forScale;
        float f8 = context.getResources().getConfiguration().fontScale;
        if (FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
            forScale = new LinearFontScaleConverter(f8);
        } else {
            forScale = FontScaleConverterFactory.INSTANCE.forScale(f8);
            if (forScale == null) {
                forScale = new LinearFontScaleConverter(f8);
            }
        }
        return new DensityWithConverter(context.getResources().getDisplayMetrics().density, f8, forScale);
    }
}
