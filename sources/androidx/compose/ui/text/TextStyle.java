package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class TextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextStyle Default = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, ViewCompat.MEASURED_SIZE_MASK, (AbstractC3284p) null);
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        public final TextStyle getDefault() {
            return TextStyle.Default;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i8, int i9, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion, AbstractC3284p abstractC3284p) {
        this(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, drawStyle, i8, i9, j12, textIndent, platformTextStyle, lineHeightStyle, i10, i11, textMotion);
    }

    /* renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m4680copyNs73l9s$default(TextStyle textStyle, Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i8, int i9, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion, int i12, Object obj) {
        Shadow shadow2;
        DrawStyle drawStyle2;
        DrawStyle drawStyle3;
        int i13;
        int i14;
        int i15;
        int i16;
        long j12;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        PlatformTextStyle platformTextStyle3;
        LineHeightStyle lineHeightStyle2;
        LineHeightStyle lineHeightStyle3;
        int i17;
        int i18;
        int i19;
        float alpha = (i12 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f8;
        long m4629getFontSizeXSAIIZE = (i12 & 4) != 0 ? textStyle.spanStyle.m4629getFontSizeXSAIIZE() : j8;
        FontWeight fontWeight2 = (i12 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m4630getFontStyle4Lr2A7w = (i12 & 16) != 0 ? textStyle.spanStyle.m4630getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m4631getFontSynthesisZQGJjVo = (i12 & 32) != 0 ? textStyle.spanStyle.m4631getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i12 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i12 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m4632getLetterSpacingXSAIIZE = (i12 & 256) != 0 ? textStyle.spanStyle.m4632getLetterSpacingXSAIIZE() : j9;
        BaselineShift m4627getBaselineShift5SSeXJ0 = (i12 & 512) != 0 ? textStyle.spanStyle.m4627getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i12 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i12 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m4626getBackground0d7_KjU = (i12 & 4096) != 0 ? textStyle.spanStyle.m4626getBackground0d7_KjU() : j10;
        TextDecoration textDecoration2 = (i12 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i12 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        if ((i12 & 32768) != 0) {
            shadow2 = shadow3;
            drawStyle2 = textStyle.spanStyle.getDrawStyle();
        } else {
            shadow2 = shadow3;
            drawStyle2 = drawStyle;
        }
        if ((i12 & 65536) != 0) {
            drawStyle3 = drawStyle2;
            i13 = textStyle.paragraphStyle.m4584getTextAligne0LSkKk();
        } else {
            drawStyle3 = drawStyle2;
            i13 = i8;
        }
        if ((i12 & 131072) != 0) {
            i14 = i13;
            i15 = textStyle.paragraphStyle.m4586getTextDirections_7Xco();
        } else {
            i14 = i13;
            i15 = i9;
        }
        if ((i12 & 262144) != 0) {
            i16 = i15;
            j12 = textStyle.paragraphStyle.m4582getLineHeightXSAIIZE();
        } else {
            i16 = i15;
            j12 = j11;
        }
        TextIndent textIndent3 = (524288 & i12) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        if ((i12 & 1048576) != 0) {
            textIndent2 = textIndent3;
            platformTextStyle2 = textStyle.platformStyle;
        } else {
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle;
        }
        if ((i12 & 2097152) != 0) {
            platformTextStyle3 = platformTextStyle2;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            platformTextStyle3 = platformTextStyle2;
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i12 & 4194304) != 0) {
            lineHeightStyle3 = lineHeightStyle2;
            i17 = textStyle.paragraphStyle.m4581getLineBreakrAG3T2k();
        } else {
            lineHeightStyle3 = lineHeightStyle2;
            i17 = i10;
        }
        if ((i12 & 8388608) != 0) {
            i18 = i17;
            i19 = textStyle.paragraphStyle.m4579getHyphensvmbZdU8();
        } else {
            i18 = i17;
            i19 = i11;
        }
        return textStyle.m4693copyNs73l9s(brush, alpha, m4629getFontSizeXSAIIZE, fontWeight2, m4630getFontStyle4Lr2A7w, m4631getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m4632getLetterSpacingXSAIIZE, m4627getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m4626getBackground0d7_KjU, textDecoration2, shadow2, drawStyle3, i14, i16, j12, textIndent2, platformTextStyle3, lineHeightStyle3, i18, i19, (i12 & 16777216) != 0 ? textStyle.paragraphStyle.getTextMotion() : textMotion);
    }

    /* renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m4681copyaIRg9q4$default(TextStyle textStyle, Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i8, Object obj) {
        Shadow shadow2;
        DrawStyle drawStyle2;
        DrawStyle drawStyle3;
        TextAlign textAlign2;
        TextAlign textAlign3;
        TextDirection textDirection2;
        TextDirection textDirection3;
        long j12;
        TextIndent textIndent2;
        PlatformTextStyle platformTextStyle2;
        PlatformTextStyle platformTextStyle3;
        LineHeightStyle lineHeightStyle2;
        LineHeightStyle lineHeightStyle3;
        LineBreak lineBreak2;
        LineBreak lineBreak3;
        Hyphens hyphens2;
        float alpha = (i8 & 2) != 0 ? textStyle.spanStyle.getAlpha() : f8;
        long m4629getFontSizeXSAIIZE = (i8 & 4) != 0 ? textStyle.spanStyle.m4629getFontSizeXSAIIZE() : j8;
        FontWeight fontWeight2 = (i8 & 8) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        FontStyle m4630getFontStyle4Lr2A7w = (i8 & 16) != 0 ? textStyle.spanStyle.m4630getFontStyle4Lr2A7w() : fontStyle;
        FontSynthesis m4631getFontSynthesisZQGJjVo = (i8 & 32) != 0 ? textStyle.spanStyle.m4631getFontSynthesisZQGJjVo() : fontSynthesis;
        FontFamily fontFamily2 = (i8 & 64) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily;
        String fontFeatureSettings = (i8 & 128) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long m4632getLetterSpacingXSAIIZE = (i8 & 256) != 0 ? textStyle.spanStyle.m4632getLetterSpacingXSAIIZE() : j9;
        BaselineShift m4627getBaselineShift5SSeXJ0 = (i8 & 512) != 0 ? textStyle.spanStyle.m4627getBaselineShift5SSeXJ0() : baselineShift;
        TextGeometricTransform textGeometricTransform2 = (i8 & 1024) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i8 & 2048) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long m4626getBackground0d7_KjU = (i8 & 4096) != 0 ? textStyle.spanStyle.m4626getBackground0d7_KjU() : j10;
        TextDecoration textDecoration2 = (i8 & 8192) != 0 ? textStyle.spanStyle.getTextDecoration() : textDecoration;
        Shadow shadow3 = (i8 & 16384) != 0 ? textStyle.spanStyle.getShadow() : shadow;
        if ((i8 & 32768) != 0) {
            shadow2 = shadow3;
            drawStyle2 = textStyle.spanStyle.getDrawStyle();
        } else {
            shadow2 = shadow3;
            drawStyle2 = drawStyle;
        }
        if ((i8 & 65536) != 0) {
            drawStyle3 = drawStyle2;
            textAlign2 = TextAlign.m5052boximpl(textStyle.paragraphStyle.m4584getTextAligne0LSkKk());
        } else {
            drawStyle3 = drawStyle2;
            textAlign2 = textAlign;
        }
        if ((i8 & 131072) != 0) {
            textAlign3 = textAlign2;
            textDirection2 = TextDirection.m5066boximpl(textStyle.paragraphStyle.m4586getTextDirections_7Xco());
        } else {
            textAlign3 = textAlign2;
            textDirection2 = textDirection;
        }
        if ((i8 & 262144) != 0) {
            textDirection3 = textDirection2;
            j12 = textStyle.paragraphStyle.m4582getLineHeightXSAIIZE();
        } else {
            textDirection3 = textDirection2;
            j12 = j11;
        }
        TextIndent textIndent3 = (524288 & i8) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        if ((i8 & 1048576) != 0) {
            textIndent2 = textIndent3;
            platformTextStyle2 = textStyle.platformStyle;
        } else {
            textIndent2 = textIndent3;
            platformTextStyle2 = platformTextStyle;
        }
        if ((i8 & 2097152) != 0) {
            platformTextStyle3 = platformTextStyle2;
            lineHeightStyle2 = textStyle.paragraphStyle.getLineHeightStyle();
        } else {
            platformTextStyle3 = platformTextStyle2;
            lineHeightStyle2 = lineHeightStyle;
        }
        if ((i8 & 4194304) != 0) {
            lineHeightStyle3 = lineHeightStyle2;
            lineBreak2 = LineBreak.m4972boximpl(textStyle.paragraphStyle.m4581getLineBreakrAG3T2k());
        } else {
            lineHeightStyle3 = lineHeightStyle2;
            lineBreak2 = lineBreak;
        }
        if ((i8 & 8388608) != 0) {
            lineBreak3 = lineBreak2;
            hyphens2 = Hyphens.m4962boximpl(textStyle.paragraphStyle.m4579getHyphensvmbZdU8());
        } else {
            lineBreak3 = lineBreak2;
            hyphens2 = hyphens;
        }
        return textStyle.m4694copyaIRg9q4(brush, alpha, m4629getFontSizeXSAIIZE, fontWeight2, m4630getFontStyle4Lr2A7w, m4631getFontSynthesisZQGJjVo, fontFamily2, fontFeatureSettings, m4632getLetterSpacingXSAIIZE, m4627getBaselineShift5SSeXJ0, textGeometricTransform2, localeList2, m4626getBackground0d7_KjU, textDecoration2, shadow2, drawStyle3, textAlign3, textDirection3, j12, textIndent2, platformTextStyle3, lineHeightStyle3, lineBreak3, hyphens2, (i8 & 16777216) != 0 ? textStyle.paragraphStyle.getTextMotion() : textMotion);
    }

    /* renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m4684getHyphensEaSxIns$annotations() {
    }

    /* renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m4685getLineBreakLgCVezo$annotations() {
    }

    /* renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m4686getTextAlignbuA522U$annotations() {
    }

    /* renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m4687getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    /* renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ TextStyle m4690copyCXVQc50(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        TextForegroundStyle m5080from8_81llA;
        PlatformSpanStyle platformSpanStyle;
        int m5065getUnspecifiede0LSkKk;
        int m5078getUnspecifieds_7Xco;
        int m4992getUnspecifiedrAG3T2k;
        int m4971getUnspecifiedvmbZdU8;
        if (Color.m2949equalsimpl0(j8, this.spanStyle.m4628getColor0d7_KjU())) {
            m5080from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m5080from8_81llA = TextForegroundStyle.Companion.m5080from8_81llA(j8);
        }
        TextForegroundStyle textForegroundStyle = m5080from8_81llA;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle = new SpanStyle(textForegroundStyle, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle, getDrawStyle(), (AbstractC3284p) null);
        if (textAlign != null) {
            m5065getUnspecifiede0LSkKk = textAlign.m5058unboximpl();
        } else {
            m5065getUnspecifiede0LSkKk = TextAlign.Companion.m5065getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            m5078getUnspecifieds_7Xco = textDirection.m5072unboximpl();
        } else {
            m5078getUnspecifieds_7Xco = TextDirection.Companion.m5078getUnspecifieds_7Xco();
        }
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        if (lineBreak != null) {
            m4992getUnspecifiedrAG3T2k = lineBreak.m4984unboximpl();
        } else {
            m4992getUnspecifiedrAG3T2k = LineBreak.Companion.m4992getUnspecifiedrAG3T2k();
        }
        if (hyphens != null) {
            m4971getUnspecifiedvmbZdU8 = hyphens.m4968unboximpl();
        } else {
            m4971getUnspecifiedvmbZdU8 = Hyphens.Companion.m4971getUnspecifiedvmbZdU8();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(m5065getUnspecifiede0LSkKk, m5078getUnspecifieds_7Xco, j12, textIndent, platformParagraphStyle, lineHeightStyle, m4992getUnspecifiedrAG3T2k, m4971getUnspecifiedvmbZdU8, getTextMotion(), (AbstractC3284p) null), platformTextStyle);
    }

    /* renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m4691copyHL5avdY(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent) {
        TextForegroundStyle m5080from8_81llA;
        int m5065getUnspecifiede0LSkKk;
        int m5078getUnspecifieds_7Xco;
        if (Color.m2949equalsimpl0(j8, this.spanStyle.m4628getColor0d7_KjU())) {
            m5080from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m5080from8_81llA = TextForegroundStyle.Companion.m5080from8_81llA(j8);
        }
        SpanStyle spanStyle = new SpanStyle(m5080from8_81llA, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), (AbstractC3284p) null);
        if (textAlign != null) {
            m5065getUnspecifiede0LSkKk = textAlign.m5058unboximpl();
        } else {
            m5065getUnspecifiede0LSkKk = TextAlign.Companion.m5065getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            m5078getUnspecifieds_7Xco = textDirection.m5072unboximpl();
        } else {
            m5078getUnspecifieds_7Xco = TextDirection.Companion.m5078getUnspecifieds_7Xco();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(m5065getUnspecifiede0LSkKk, m5078getUnspecifieds_7Xco, j12, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m4707getLineBreakrAG3T2k(), m4704getHyphensvmbZdU8(), getTextMotion(), (AbstractC3284p) null), this.platformStyle);
    }

    /* renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m4692copyNOaFTUo(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        TextForegroundStyle m5080from8_81llA;
        if (Color.m2949equalsimpl0(j8, this.spanStyle.m4628getColor0d7_KjU())) {
            m5080from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m5080from8_81llA = TextForegroundStyle.Companion.m5080from8_81llA(j8);
        }
        return new TextStyle(new SpanStyle(m5080from8_81llA, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, this.spanStyle.getDrawStyle(), (AbstractC3284p) null), new ParagraphStyle(textAlign != null ? textAlign.m5058unboximpl() : TextAlign.Companion.m5065getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5072unboximpl() : TextDirection.Companion.m5078getUnspecifieds_7Xco(), j12, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, m4707getLineBreakrAG3T2k(), m4704getHyphensvmbZdU8(), getTextMotion(), (AbstractC3284p) null), platformTextStyle);
    }

    /* renamed from: copy-Ns73l9s, reason: not valid java name */
    public final TextStyle m4693copyNs73l9s(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i8, int i9, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f8, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC3284p) null), new ParagraphStyle(i8, i9, j11, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i10, i11, textMotion, (AbstractC3284p) null), platformTextStyle);
    }

    /* renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ TextStyle m4694copyaIRg9q4(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        return new TextStyle(new SpanStyle(brush, f8, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC3284p) null), new ParagraphStyle(textAlign != null ? textAlign.m5058unboximpl() : TextAlign.Companion.m5065getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5072unboximpl() : TextDirection.Companion.m5078getUnspecifieds_7Xco(), j11, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m4984unboximpl() : LineBreak.Companion.m4992getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4968unboximpl() : Hyphens.Companion.m4971getUnspecifiedvmbZdU8(), textMotion, (AbstractC3284p) null), platformTextStyle);
    }

    /* renamed from: copy-p1EtxEg, reason: not valid java name */
    public final TextStyle m4695copyp1EtxEg(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i8, int i9, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion) {
        TextForegroundStyle m5080from8_81llA;
        PlatformSpanStyle platformSpanStyle;
        if (Color.m2949equalsimpl0(j8, this.spanStyle.m4628getColor0d7_KjU())) {
            m5080from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m5080from8_81llA = TextForegroundStyle.Companion.m5080from8_81llA(j8);
        }
        TextForegroundStyle textForegroundStyle = m5080from8_81llA;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle = new SpanStyle(textForegroundStyle, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle, drawStyle, (AbstractC3284p) null);
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(i8, i9, j12, textIndent, platformParagraphStyle, lineHeightStyle, i10, i11, textMotion, (AbstractC3284p) null), platformTextStyle);
    }

    /* renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ TextStyle m4696copyv2rsoow(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        TextForegroundStyle m5080from8_81llA;
        PlatformSpanStyle platformSpanStyle;
        int m5065getUnspecifiede0LSkKk;
        int m5078getUnspecifieds_7Xco;
        int m4992getUnspecifiedrAG3T2k;
        int m4971getUnspecifiedvmbZdU8;
        if (Color.m2949equalsimpl0(j8, this.spanStyle.m4628getColor0d7_KjU())) {
            m5080from8_81llA = this.spanStyle.getTextForegroundStyle$ui_text_release();
        } else {
            m5080from8_81llA = TextForegroundStyle.Companion.m5080from8_81llA(j8);
        }
        TextForegroundStyle textForegroundStyle = m5080from8_81llA;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle spanStyle = new SpanStyle(textForegroundStyle, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle, drawStyle, (AbstractC3284p) null);
        if (textAlign != null) {
            m5065getUnspecifiede0LSkKk = textAlign.m5058unboximpl();
        } else {
            m5065getUnspecifiede0LSkKk = TextAlign.Companion.m5065getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            m5078getUnspecifieds_7Xco = textDirection.m5072unboximpl();
        } else {
            m5078getUnspecifieds_7Xco = TextDirection.Companion.m5078getUnspecifieds_7Xco();
        }
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        if (lineBreak != null) {
            m4992getUnspecifiedrAG3T2k = lineBreak.m4984unboximpl();
        } else {
            m4992getUnspecifiedrAG3T2k = LineBreak.Companion.m4992getUnspecifiedrAG3T2k();
        }
        if (hyphens != null) {
            m4971getUnspecifiedvmbZdU8 = hyphens.m4968unboximpl();
        } else {
            m4971getUnspecifiedvmbZdU8 = Hyphens.Companion.m4971getUnspecifiedvmbZdU8();
        }
        return new TextStyle(spanStyle, new ParagraphStyle(m5065getUnspecifiede0LSkKk, m5078getUnspecifieds_7Xco, j12, textIndent, platformParagraphStyle, lineHeightStyle, m4992getUnspecifiedrAG3T2k, m4971getUnspecifiedvmbZdU8, textMotion, (AbstractC3284p) null), platformTextStyle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        if (AbstractC3292y.d(this.spanStyle, textStyle.spanStyle) && AbstractC3292y.d(this.paragraphStyle, textStyle.paragraphStyle) && AbstractC3292y.d(this.platformStyle, textStyle.platformStyle)) {
            return true;
        }
        return false;
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m4697getBackground0d7_KjU() {
        return this.spanStyle.m4626getBackground0d7_KjU();
    }

    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m4698getBaselineShift5SSeXJ0() {
        return this.spanStyle.m4627getBaselineShift5SSeXJ0();
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4699getColor0d7_KjU() {
        return this.spanStyle.m4628getColor0d7_KjU();
    }

    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m4700getFontSizeXSAIIZE() {
        return this.spanStyle.m4629getFontSizeXSAIIZE();
    }

    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m4701getFontStyle4Lr2A7w() {
        return this.spanStyle.m4630getFontStyle4Lr2A7w();
    }

    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m4702getFontSynthesisZQGJjVo() {
        return this.spanStyle.m4631getFontSynthesisZQGJjVo();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m4703getHyphensEaSxIns() {
        return Hyphens.m4962boximpl(m4704getHyphensvmbZdU8());
    }

    /* renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m4704getHyphensvmbZdU8() {
        return this.paragraphStyle.m4579getHyphensvmbZdU8();
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m4705getLetterSpacingXSAIIZE() {
        return this.spanStyle.m4632getLetterSpacingXSAIIZE();
    }

    /* renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m4706getLineBreakLgCVezo() {
        return LineBreak.m4972boximpl(m4707getLineBreakrAG3T2k());
    }

    /* renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m4707getLineBreakrAG3T2k() {
        return this.paragraphStyle.m4581getLineBreakrAG3T2k();
    }

    /* renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m4708getLineHeightXSAIIZE() {
        return this.paragraphStyle.m4582getLineHeightXSAIIZE();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    public final ParagraphStyle getParagraphStyle$ui_text_release() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    public final SpanStyle getSpanStyle$ui_text_release() {
        return this.spanStyle;
    }

    /* renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m4709getTextAlignbuA522U() {
        return TextAlign.m5052boximpl(m4710getTextAligne0LSkKk());
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m4710getTextAligne0LSkKk() {
        return this.paragraphStyle.m4584getTextAligne0LSkKk();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    /* renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m4711getTextDirectionmmuk1to() {
        return TextDirection.m5066boximpl(m4712getTextDirections_7Xco());
    }

    /* renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m4712getTextDirections_7Xco() {
        return this.paragraphStyle.m4586getTextDirections_7Xco();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(TextStyle textStyle) {
        if (this != textStyle && !this.spanStyle.hasSameNonLayoutAttributes$ui_text_release(textStyle.spanStyle)) {
            return false;
        }
        return true;
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle textStyle) {
        if (this != textStyle && (!AbstractC3292y.d(this.paragraphStyle, textStyle.paragraphStyle) || !this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(textStyle.spanStyle))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i8;
        int hashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        if (platformTextStyle != null) {
            i8 = platformTextStyle.hashCode();
        } else {
            i8 = 0;
        }
        return hashCode + i8;
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int i8;
        int hashCodeLayoutAffectingAttributes$ui_text_release = ((this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text_release() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        if (platformTextStyle != null) {
            i8 = platformTextStyle.hashCode();
        } else {
            i8 = 0;
        }
        return hashCodeLayoutAffectingAttributes$ui_text_release + i8;
    }

    @Stable
    public final TextStyle merge(TextStyle textStyle) {
        return (textStyle == null || AbstractC3292y.d(textStyle, Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    @Stable
    /* renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ TextStyle m4713mergeZ1GrekI(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        PlatformSpanStyle platformSpanStyle;
        int m5065getUnspecifiede0LSkKk;
        int m5078getUnspecifieds_7Xco;
        int m4992getUnspecifiedrAG3T2k;
        int m4971getUnspecifiedvmbZdU8;
        SpanStyle spanStyle = this.spanStyle;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle m4633fastMergedSHsh3o = SpanStyleKt.m4633fastMergedSHsh3o(spanStyle, j8, null, Float.NaN, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle, drawStyle);
        ParagraphStyle paragraphStyle = this.paragraphStyle;
        if (textAlign != null) {
            m5065getUnspecifiede0LSkKk = textAlign.m5058unboximpl();
        } else {
            m5065getUnspecifiede0LSkKk = TextAlign.Companion.m5065getUnspecifiede0LSkKk();
        }
        if (textDirection != null) {
            m5078getUnspecifieds_7Xco = textDirection.m5072unboximpl();
        } else {
            m5078getUnspecifieds_7Xco = TextDirection.Companion.m5078getUnspecifieds_7Xco();
        }
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        if (lineBreak != null) {
            m4992getUnspecifiedrAG3T2k = lineBreak.m4984unboximpl();
        } else {
            m4992getUnspecifiedrAG3T2k = LineBreak.Companion.m4992getUnspecifiedrAG3T2k();
        }
        if (hyphens != null) {
            m4971getUnspecifiedvmbZdU8 = hyphens.m4968unboximpl();
        } else {
            m4971getUnspecifiedvmbZdU8 = Hyphens.Companion.m4971getUnspecifiedvmbZdU8();
        }
        ParagraphStyle m4587fastMergej5T8yCg = ParagraphStyleKt.m4587fastMergej5T8yCg(paragraphStyle, m5065getUnspecifiede0LSkKk, m5078getUnspecifieds_7Xco, j12, textIndent, platformParagraphStyle, lineHeightStyle, m4992getUnspecifiedrAG3T2k, m4971getUnspecifiedvmbZdU8, textMotion);
        if (this.spanStyle == m4633fastMergedSHsh3o && this.paragraphStyle == m4587fastMergej5T8yCg) {
            return this;
        }
        return new TextStyle(m4633fastMergedSHsh3o, m4587fastMergej5T8yCg);
    }

    @Stable
    /* renamed from: merge-dA7vx0o, reason: not valid java name */
    public final TextStyle m4714mergedA7vx0o(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i8, int i9, long j12, TextIndent textIndent, LineHeightStyle lineHeightStyle, int i10, int i11, PlatformTextStyle platformTextStyle, TextMotion textMotion) {
        PlatformSpanStyle platformSpanStyle;
        SpanStyle spanStyle = this.spanStyle;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (platformTextStyle != null) {
            platformSpanStyle = platformTextStyle.getSpanStyle();
        } else {
            platformSpanStyle = null;
        }
        SpanStyle m4633fastMergedSHsh3o = SpanStyleKt.m4633fastMergedSHsh3o(spanStyle, j8, null, Float.NaN, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformSpanStyle, drawStyle);
        ParagraphStyle paragraphStyle = this.paragraphStyle;
        if (platformTextStyle != null) {
            platformParagraphStyle = platformTextStyle.getParagraphStyle();
        }
        ParagraphStyle m4587fastMergej5T8yCg = ParagraphStyleKt.m4587fastMergej5T8yCg(paragraphStyle, i8, i9, j12, textIndent, platformParagraphStyle, lineHeightStyle, i10, i11, textMotion);
        if (this.spanStyle == m4633fastMergedSHsh3o && this.paragraphStyle == m4587fastMergej5T8yCg) {
            return this;
        }
        return new TextStyle(m4633fastMergedSHsh3o, m4587fastMergej5T8yCg);
    }

    @Stable
    public final TextStyle plus(TextStyle textStyle) {
        return merge(textStyle);
    }

    @Stable
    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    @Stable
    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m2956toStringimpl(m4699getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) TextUnit.m5349toStringimpl(m4700getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m4701getFontStyle4Lr2A7w() + ", fontSynthesis=" + m4702getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) TextUnit.m5349toStringimpl(m4705getLetterSpacingXSAIIZE())) + ", baselineShift=" + m4698getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) Color.m2956toStringimpl(m4697getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) TextAlign.m5057toStringimpl(m4710getTextAligne0LSkKk())) + ", textDirection=" + ((Object) TextDirection.m5071toStringimpl(m4712getTextDirections_7Xco())) + ", lineHeight=" + ((Object) TextUnit.m5349toStringimpl(m4708getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) LineBreak.m4983toStringimpl(m4707getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) Hyphens.m4967toStringimpl(m4704getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    public /* synthetic */ TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, AbstractC3284p abstractC3284p) {
        this(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, drawStyle, textAlign, textDirection, j12, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    @Stable
    public final TextStyle plus(ParagraphStyle paragraphStyle) {
        return merge(paragraphStyle);
    }

    public /* synthetic */ TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, AbstractC3284p abstractC3284p) {
        this(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, textAlign, textDirection, j12, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens);
    }

    @Stable
    public final TextStyle plus(SpanStyle spanStyle) {
        return merge(spanStyle);
    }

    public /* synthetic */ TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, AbstractC3284p abstractC3284p) {
        this(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, textAlign, textDirection, j12, textIndent, platformTextStyle, lineHeightStyle);
    }

    public /* synthetic */ TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, AbstractC3284p abstractC3284p) {
        this(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, textAlign, textDirection, j12, textIndent);
    }

    public /* synthetic */ TextStyle(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i8, int i9, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion, AbstractC3284p abstractC3284p) {
        this(brush, f8, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, drawStyle, i8, i9, j11, textIndent, platformTextStyle, lineHeightStyle, i10, i11, textMotion);
    }

    @Stable
    public final TextStyle merge(SpanStyle spanStyle) {
        return new TextStyle(toSpanStyle().merge(spanStyle), toParagraphStyle());
    }

    public /* synthetic */ TextStyle(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, AbstractC3284p abstractC3284p) {
        this(brush, f8, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, drawStyle, textAlign, textDirection, j11, textIndent, platformTextStyle, lineHeightStyle, lineBreak, hyphens, textMotion);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    @Stable
    public final TextStyle merge(ParagraphStyle paragraphStyle) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(paragraphStyle));
    }

    public /* synthetic */ TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle, int i8, AbstractC3284p abstractC3284p) {
        this(spanStyle, paragraphStyle, (i8 & 4) != 0 ? null : platformTextStyle);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.access$createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    public /* synthetic */ TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j9, (i8 & 4) != 0 ? null : fontWeight, (i8 & 8) != 0 ? null : fontStyle, (i8 & 16) != 0 ? null : fontSynthesis, (i8 & 32) != 0 ? null : fontFamily, (i8 & 64) != 0 ? null : str, (i8 & 128) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j10, (i8 & 256) != 0 ? null : baselineShift, (i8 & 512) != 0 ? null : textGeometricTransform, (i8 & 1024) != 0 ? null : localeList, (i8 & 2048) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j11, (i8 & 4096) != 0 ? null : textDecoration, (i8 & 8192) != 0 ? null : shadow, (i8 & 16384) != 0 ? null : textAlign, (i8 & 32768) != 0 ? null : textDirection, (i8 & 65536) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j12, (i8 & 131072) != 0 ? null : textIndent, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private TextStyle(long r23, long r25, androidx.compose.ui.text.font.FontWeight r27, androidx.compose.ui.text.font.FontStyle r28, androidx.compose.ui.text.font.FontSynthesis r29, androidx.compose.ui.text.font.FontFamily r30, java.lang.String r31, long r32, androidx.compose.ui.text.style.BaselineShift r34, androidx.compose.ui.text.style.TextGeometricTransform r35, androidx.compose.ui.text.intl.LocaleList r36, long r37, androidx.compose.ui.text.style.TextDecoration r39, androidx.compose.ui.graphics.Shadow r40, androidx.compose.ui.text.style.TextAlign r41, androidx.compose.ui.text.style.TextDirection r42, long r43, androidx.compose.ui.text.style.TextIndent r45) {
        /*
            r22 = this;
            r1 = r23
            r3 = r25
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r17 = r39
            r18 = r40
            androidx.compose.ui.text.SpanStyle r0 = new androidx.compose.ui.text.SpanStyle
            r23 = r0
            r20 = 0
            r21 = 0
            r19 = 0
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21)
            androidx.compose.ui.text.ParagraphStyle r0 = new androidx.compose.ui.text.ParagraphStyle
            if (r41 == 0) goto L32
            int r1 = r41.m5058unboximpl()
            goto L38
        L32:
            androidx.compose.ui.text.style.TextAlign$Companion r1 = androidx.compose.ui.text.style.TextAlign.Companion
            int r1 = r1.m5065getUnspecifiede0LSkKk()
        L38:
            if (r42 == 0) goto L3f
            int r2 = r42.m5072unboximpl()
            goto L45
        L3f:
            androidx.compose.ui.text.style.TextDirection$Companion r2 = androidx.compose.ui.text.style.TextDirection.Companion
            int r2 = r2.m5078getUnspecifieds_7Xco()
        L45:
            androidx.compose.ui.text.style.LineBreak$Companion r3 = androidx.compose.ui.text.style.LineBreak.Companion
            int r3 = r3.m4992getUnspecifiedrAG3T2k()
            androidx.compose.ui.text.style.Hyphens$Companion r4 = androidx.compose.ui.text.style.Hyphens.Companion
            int r4 = r4.m4971getUnspecifiedvmbZdU8()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r24 = r0
            r25 = r1
            r26 = r2
            r27 = r43
            r29 = r45
            r30 = r7
            r31 = r8
            r32 = r3
            r33 = r4
            r34 = r5
            r35 = r6
            r24.<init>(r25, r26, r27, r29, r30, r31, r32, r33, r34, r35)
            r1 = 0
            r2 = r22
            r3 = r23
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextStyle.<init>(long, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextAlign, androidx.compose.ui.text.style.TextDirection, long, androidx.compose.ui.text.style.TextIndent):void");
    }

    public /* synthetic */ TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j9, (i8 & 4) != 0 ? null : fontWeight, (i8 & 8) != 0 ? null : fontStyle, (i8 & 16) != 0 ? null : fontSynthesis, (i8 & 32) != 0 ? null : fontFamily, (i8 & 64) != 0 ? null : str, (i8 & 128) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j10, (i8 & 256) != 0 ? null : baselineShift, (i8 & 512) != 0 ? null : textGeometricTransform, (i8 & 1024) != 0 ? null : localeList, (i8 & 2048) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j11, (i8 & 4096) != 0 ? null : textDecoration, (i8 & 8192) != 0 ? null : shadow, (i8 & 16384) != 0 ? null : textAlign, (i8 & 32768) != 0 ? null : textDirection, (i8 & 65536) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j12, (i8 & 131072) != 0 ? null : textIndent, (i8 & 262144) != 0 ? null : platformTextStyle, (i8 & 524288) != 0 ? null : lineHeightStyle, null);
    }

    private TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle) {
        this(new SpanStyle(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, (AbstractC3284p) null), new ParagraphStyle(textAlign != null ? textAlign.m5058unboximpl() : TextAlign.Companion.m5065getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5072unboximpl() : TextDirection.Companion.m5078getUnspecifieds_7Xco(), j12, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, LineBreak.Companion.m4992getUnspecifiedrAG3T2k(), Hyphens.Companion.m4971getUnspecifiedvmbZdU8(), (TextMotion) null, (AbstractC3284p) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j9, (i8 & 4) != 0 ? null : fontWeight, (i8 & 8) != 0 ? null : fontStyle, (i8 & 16) != 0 ? null : fontSynthesis, (i8 & 32) != 0 ? null : fontFamily, (i8 & 64) != 0 ? null : str, (i8 & 128) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j10, (i8 & 256) != 0 ? null : baselineShift, (i8 & 512) != 0 ? null : textGeometricTransform, (i8 & 1024) != 0 ? null : localeList, (i8 & 2048) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j11, (i8 & 4096) != 0 ? null : textDecoration, (i8 & 8192) != 0 ? null : shadow, (i8 & 16384) != 0 ? null : textAlign, (i8 & 32768) != 0 ? null : textDirection, (i8 & 65536) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j12, (i8 & 131072) != 0 ? null : textIndent, (i8 & 262144) != 0 ? null : platformTextStyle, (i8 & 524288) != 0 ? null : lineHeightStyle, (i8 & 1048576) != 0 ? null : lineBreak, (i8 & 2097152) != 0 ? null : hyphens, null);
    }

    private TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        this(new SpanStyle(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, (DrawStyle) null, 32768, (AbstractC3284p) null), new ParagraphStyle(textAlign != null ? textAlign.m5058unboximpl() : TextAlign.Companion.m5065getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5072unboximpl() : TextDirection.Companion.m5078getUnspecifieds_7Xco(), j12, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m4984unboximpl() : LineBreak.Companion.m4992getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4968unboximpl() : Hyphens.Companion.m4971getUnspecifiedvmbZdU8(), (TextMotion) null, 256, (AbstractC3284p) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j8, (i8 & 2) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j9, (i8 & 4) != 0 ? null : fontWeight, (i8 & 8) != 0 ? null : fontStyle, (i8 & 16) != 0 ? null : fontSynthesis, (i8 & 32) != 0 ? null : fontFamily, (i8 & 64) != 0 ? null : str, (i8 & 128) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j10, (i8 & 256) != 0 ? null : baselineShift, (i8 & 512) != 0 ? null : textGeometricTransform, (i8 & 1024) != 0 ? null : localeList, (i8 & 2048) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j11, (i8 & 4096) != 0 ? null : textDecoration, (i8 & 8192) != 0 ? null : shadow, (i8 & 16384) != 0 ? null : drawStyle, (i8 & 32768) != 0 ? null : textAlign, (i8 & 65536) != 0 ? null : textDirection, (i8 & 131072) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j12, (i8 & 262144) != 0 ? null : textIndent, (i8 & 524288) != 0 ? null : platformTextStyle, (i8 & 1048576) != 0 ? null : lineHeightStyle, (i8 & 2097152) != 0 ? null : lineBreak, (i8 & 4194304) != 0 ? null : hyphens, (i8 & 8388608) != 0 ? null : textMotion, (AbstractC3284p) null);
    }

    private TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC3284p) null), new ParagraphStyle(textAlign != null ? textAlign.m5058unboximpl() : TextAlign.Companion.m5065getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5072unboximpl() : TextDirection.Companion.m5078getUnspecifieds_7Xco(), j12, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m4984unboximpl() : LineBreak.Companion.m4992getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4968unboximpl() : Hyphens.Companion.m4971getUnspecifiedvmbZdU8(), textMotion, (AbstractC3284p) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i8, int i9, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion, int i12, AbstractC3284p abstractC3284p) {
        this((i12 & 1) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j8, (i12 & 2) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j9, (i12 & 4) != 0 ? null : fontWeight, (i12 & 8) != 0 ? null : fontStyle, (i12 & 16) != 0 ? null : fontSynthesis, (i12 & 32) != 0 ? null : fontFamily, (i12 & 64) != 0 ? null : str, (i12 & 128) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j10, (i12 & 256) != 0 ? null : baselineShift, (i12 & 512) != 0 ? null : textGeometricTransform, (i12 & 1024) != 0 ? null : localeList, (i12 & 2048) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j11, (i12 & 4096) != 0 ? null : textDecoration, (i12 & 8192) != 0 ? null : shadow, (i12 & 16384) != 0 ? null : drawStyle, (i12 & 32768) != 0 ? TextAlign.Companion.m5065getUnspecifiede0LSkKk() : i8, (i12 & 65536) != 0 ? TextDirection.Companion.m5078getUnspecifieds_7Xco() : i9, (i12 & 131072) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j12, (i12 & 262144) != 0 ? null : textIndent, (i12 & 524288) != 0 ? null : platformTextStyle, (i12 & 1048576) != 0 ? null : lineHeightStyle, (i12 & 2097152) != 0 ? LineBreak.Companion.m4992getUnspecifiedrAG3T2k() : i10, (i12 & 4194304) != 0 ? Hyphens.Companion.m4971getUnspecifiedvmbZdU8() : i11, (i12 & 8388608) != 0 ? null : textMotion, (AbstractC3284p) null);
    }

    private TextStyle(long j8, long j9, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j10, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j11, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i8, int i9, long j12, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion) {
        this(new SpanStyle(j8, j9, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j10, baselineShift, textGeometricTransform, localeList, j11, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC3284p) null), new ParagraphStyle(i8, i9, j12, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i10, i11, textMotion, (AbstractC3284p) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i8, int i9, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion, int i12, AbstractC3284p abstractC3284p) {
        this(brush, (i12 & 2) != 0 ? Float.NaN : f8, (i12 & 4) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j8, (i12 & 8) != 0 ? null : fontWeight, (i12 & 16) != 0 ? null : fontStyle, (i12 & 32) != 0 ? null : fontSynthesis, (i12 & 64) != 0 ? null : fontFamily, (i12 & 128) != 0 ? null : str, (i12 & 256) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j9, (i12 & 512) != 0 ? null : baselineShift, (i12 & 1024) != 0 ? null : textGeometricTransform, (i12 & 2048) != 0 ? null : localeList, (i12 & 4096) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j10, (i12 & 8192) != 0 ? null : textDecoration, (i12 & 16384) != 0 ? null : shadow, (32768 & i12) != 0 ? null : drawStyle, (65536 & i12) != 0 ? TextAlign.Companion.m5065getUnspecifiede0LSkKk() : i8, (131072 & i12) != 0 ? TextDirection.Companion.m5078getUnspecifieds_7Xco() : i9, (262144 & i12) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j11, (524288 & i12) != 0 ? null : textIndent, (1048576 & i12) != 0 ? null : platformTextStyle, (2097152 & i12) != 0 ? null : lineHeightStyle, (4194304 & i12) != 0 ? LineBreak.Companion.m4992getUnspecifiedrAG3T2k() : i10, (8388608 & i12) != 0 ? Hyphens.Companion.m4971getUnspecifiedvmbZdU8() : i11, (i12 & 16777216) != 0 ? null : textMotion, (AbstractC3284p) null);
    }

    private TextStyle(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int i8, int i9, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i10, int i11, TextMotion textMotion) {
        this(new SpanStyle(brush, f8, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC3284p) null), new ParagraphStyle(i8, i9, j11, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, i10, i11, textMotion, (AbstractC3284p) null), platformTextStyle);
    }

    public /* synthetic */ TextStyle(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion, int i8, AbstractC3284p abstractC3284p) {
        this(brush, (i8 & 2) != 0 ? Float.NaN : f8, (i8 & 4) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j8, (i8 & 8) != 0 ? null : fontWeight, (i8 & 16) != 0 ? null : fontStyle, (i8 & 32) != 0 ? null : fontSynthesis, (i8 & 64) != 0 ? null : fontFamily, (i8 & 128) != 0 ? null : str, (i8 & 256) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j9, (i8 & 512) != 0 ? null : baselineShift, (i8 & 1024) != 0 ? null : textGeometricTransform, (i8 & 2048) != 0 ? null : localeList, (i8 & 4096) != 0 ? Color.Companion.m2984getUnspecified0d7_KjU() : j10, (i8 & 8192) != 0 ? null : textDecoration, (i8 & 16384) != 0 ? null : shadow, (32768 & i8) != 0 ? null : drawStyle, (65536 & i8) != 0 ? null : textAlign, (131072 & i8) != 0 ? null : textDirection, (262144 & i8) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j11, (524288 & i8) != 0 ? null : textIndent, (1048576 & i8) != 0 ? null : platformTextStyle, (2097152 & i8) != 0 ? null : lineHeightStyle, (4194304 & i8) != 0 ? null : lineBreak, (8388608 & i8) != 0 ? null : hyphens, (i8 & 16777216) != 0 ? null : textMotion, (AbstractC3284p) null);
    }

    private TextStyle(Brush brush, float f8, long j8, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j9, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j10, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long j11, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        this(new SpanStyle(brush, f8, j8, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j9, baselineShift, textGeometricTransform, localeList, j10, textDecoration, shadow, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, drawStyle, (AbstractC3284p) null), new ParagraphStyle(textAlign != null ? textAlign.m5058unboximpl() : TextAlign.Companion.m5065getUnspecifiede0LSkKk(), textDirection != null ? textDirection.m5072unboximpl() : TextDirection.Companion.m5078getUnspecifieds_7Xco(), j11, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphStyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.m4984unboximpl() : LineBreak.Companion.m4992getUnspecifiedrAG3T2k(), hyphens != null ? hyphens.m4968unboximpl() : Hyphens.Companion.m4971getUnspecifiedvmbZdU8(), textMotion, (AbstractC3284p) null), platformTextStyle);
    }
}
