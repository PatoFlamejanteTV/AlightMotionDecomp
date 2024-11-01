package androidx.compose.ui.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
public final class TextMeasurerHelperKt {
    private static final int DefaultCacheSize = 8;

    @Composable
    public static final TextMeasurer rememberTextMeasurer(int i8, Composer composer, int i9, int i10) {
        composer.startReplaceableGroup(1538166871);
        if ((i10 & 1) != 0) {
            i8 = DefaultCacheSize;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1538166871, i9, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        Object[] objArr = {resolver, density, layoutDirection, Integer.valueOf(i8)};
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            z8 |= composer.changed(objArr[i11]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextMeasurer(resolver, density, layoutDirection, i8);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextMeasurer textMeasurer = (TextMeasurer) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textMeasurer;
    }
}
