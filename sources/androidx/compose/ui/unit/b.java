package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static float a(FontScaling fontScaling, long j8) {
        if (TextUnitType.m5370equalsimpl0(TextUnit.m5341getTypeUIouoOA(j8), TextUnitType.Companion.m5375getSpUIouoOA())) {
            FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
            if (fontScaleConverterFactory.isNonLinearFontScalingActive(fontScaling.getFontScale()) && !FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
                FontScaleConverter forScale = fontScaleConverterFactory.forScale(fontScaling.getFontScale());
                if (forScale == null) {
                    return Dp.m5155constructorimpl(TextUnit.m5342getValueimpl(j8) * fontScaling.getFontScale());
                }
                return Dp.m5155constructorimpl(forScale.convertSpToDp(TextUnit.m5342getValueimpl(j8)));
            }
            return Dp.m5155constructorimpl(TextUnit.m5342getValueimpl(j8) * fontScaling.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static long b(FontScaling fontScaling, float f8) {
        float fontScale;
        FontScaleConverterFactory fontScaleConverterFactory = FontScaleConverterFactory.INSTANCE;
        if (fontScaleConverterFactory.isNonLinearFontScalingActive(fontScaling.getFontScale()) && !FontScalingKt.getDisableNonLinearFontScalingInCompose()) {
            FontScaleConverter forScale = fontScaleConverterFactory.forScale(fontScaling.getFontScale());
            if (forScale != null) {
                fontScale = forScale.convertDpToSp(f8);
            } else {
                fontScale = f8 / fontScaling.getFontScale();
            }
            return TextUnitKt.getSp(fontScale);
        }
        return TextUnitKt.getSp(f8 / fontScaling.getFontScale());
    }

    public static /* synthetic */ float c(FontScaling fontScaling, long j8) {
        return a(fontScaling, j8);
    }

    public static /* synthetic */ long d(FontScaling fontScaling, float f8) {
        return b(fontScaling, f8);
    }
}
