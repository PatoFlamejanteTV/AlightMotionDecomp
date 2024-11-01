package androidx.compose.material3;

import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class IncludeFontPaddingHelper_androidKt {
    public static final TextStyle copyAndSetFontPadding(TextStyle style, boolean z8) {
        TextStyle m4692copyNOaFTUo;
        AbstractC3292y.i(style, "style");
        m4692copyNOaFTUo = style.m4692copyNOaFTUo((r44 & 1) != 0 ? style.spanStyle.m4628getColor0d7_KjU() : 0L, (r44 & 2) != 0 ? style.spanStyle.m4629getFontSizeXSAIIZE() : 0L, (r44 & 4) != 0 ? style.spanStyle.getFontWeight() : null, (r44 & 8) != 0 ? style.spanStyle.m4630getFontStyle4Lr2A7w() : null, (r44 & 16) != 0 ? style.spanStyle.m4631getFontSynthesisZQGJjVo() : null, (r44 & 32) != 0 ? style.spanStyle.getFontFamily() : null, (r44 & 64) != 0 ? style.spanStyle.getFontFeatureSettings() : null, (r44 & 128) != 0 ? style.spanStyle.m4632getLetterSpacingXSAIIZE() : 0L, (r44 & 256) != 0 ? style.spanStyle.m4627getBaselineShift5SSeXJ0() : null, (r44 & 512) != 0 ? style.spanStyle.getTextGeometricTransform() : null, (r44 & 1024) != 0 ? style.spanStyle.getLocaleList() : null, (r44 & 2048) != 0 ? style.spanStyle.m4626getBackground0d7_KjU() : 0L, (r44 & 4096) != 0 ? style.spanStyle.getTextDecoration() : null, (r44 & 8192) != 0 ? style.spanStyle.getShadow() : null, (r44 & 16384) != 0 ? TextAlign.m5052boximpl(style.paragraphStyle.m4584getTextAligne0LSkKk()) : null, (r44 & 32768) != 0 ? TextDirection.m5066boximpl(style.paragraphStyle.m4586getTextDirections_7Xco()) : null, (r44 & 65536) != 0 ? style.paragraphStyle.m4582getLineHeightXSAIIZE() : 0L, (r44 & 131072) != 0 ? style.paragraphStyle.getTextIndent() : null, (r44 & 262144) != 0 ? style.platformStyle : new PlatformTextStyle(z8), (r44 & 524288) != 0 ? style.paragraphStyle.getLineHeightStyle() : null);
        return m4692copyNOaFTUo;
    }
}
