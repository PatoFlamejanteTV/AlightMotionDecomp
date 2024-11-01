package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m2983getTransparent0d7_KjU();
        DefaultColor = companion.m2974getBlack0d7_KjU();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:            if (androidx.compose.ui.unit.TextUnit.m5339equalsimpl0(r26, r21.m4629getFontSizeXSAIIZE()) == false) goto L7;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0059, code lost:            if (androidx.compose.ui.graphics.Color.m2949equalsimpl0(r22, r21.getTextForegroundStyle$ui_text_release().mo4957getColor0d7_KjU()) == false) goto L7;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0065, code lost:            if (kotlin.jvm.internal.AbstractC3292y.d(r6, r21.m4630getFontStyle4Lr2A7w()) == false) goto L7;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0071, code lost:            if (kotlin.jvm.internal.AbstractC3292y.d(r5, r21.getFontWeight()) == false) goto L7;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0079, code lost:            if (r31 != r21.getFontFamily()) goto L7;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x008d, code lost:            if (androidx.compose.ui.unit.TextUnit.m5339equalsimpl0(r33, r21.m4632getLetterSpacingXSAIIZE()) == false) goto L7;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.text.SpanStyle m4633fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle r21, long r22, androidx.compose.ui.graphics.Brush r24, float r25, long r26, androidx.compose.ui.text.font.FontWeight r28, androidx.compose.ui.text.font.FontStyle r29, androidx.compose.ui.text.font.FontSynthesis r30, androidx.compose.ui.text.font.FontFamily r31, java.lang.String r32, long r33, androidx.compose.ui.text.style.BaselineShift r35, androidx.compose.ui.text.style.TextGeometricTransform r36, androidx.compose.ui.text.intl.LocaleList r37, long r38, androidx.compose.ui.text.style.TextDecoration r40, androidx.compose.ui.graphics.Shadow r41, androidx.compose.ui.text.PlatformSpanStyle r42, androidx.compose.ui.graphics.drawscope.DrawStyle r43) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyleKt.m4633fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }

    public static final SpanStyle lerp(SpanStyle spanStyle, SpanStyle spanStyle2, float f8) {
        float m4944constructorimpl;
        float m4944constructorimpl2;
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text_release(), spanStyle2.getTextForegroundStyle$ui_text_release(), f8);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f8);
        long m4634lerpTextUnitInheritableC3pnCVY = m4634lerpTextUnitInheritableC3pnCVY(spanStyle.m4629getFontSizeXSAIIZE(), spanStyle2.m4629getFontSizeXSAIIZE(), f8);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f8);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m4630getFontStyle4Lr2A7w(), spanStyle2.m4630getFontStyle4Lr2A7w(), f8);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m4631getFontSynthesisZQGJjVo(), spanStyle2.m4631getFontSynthesisZQGJjVo(), f8);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f8);
        long m4634lerpTextUnitInheritableC3pnCVY2 = m4634lerpTextUnitInheritableC3pnCVY(spanStyle.m4632getLetterSpacingXSAIIZE(), spanStyle2.m4632getLetterSpacingXSAIIZE(), f8);
        BaselineShift m4627getBaselineShift5SSeXJ0 = spanStyle.m4627getBaselineShift5SSeXJ0();
        if (m4627getBaselineShift5SSeXJ0 != null) {
            m4944constructorimpl = m4627getBaselineShift5SSeXJ0.m4949unboximpl();
        } else {
            m4944constructorimpl = BaselineShift.m4944constructorimpl(0.0f);
        }
        BaselineShift m4627getBaselineShift5SSeXJ02 = spanStyle2.m4627getBaselineShift5SSeXJ0();
        if (m4627getBaselineShift5SSeXJ02 != null) {
            m4944constructorimpl2 = m4627getBaselineShift5SSeXJ02.m4949unboximpl();
        } else {
            m4944constructorimpl2 = BaselineShift.m4944constructorimpl(0.0f);
        }
        float m4956lerpjWV1Mfo = BaselineShiftKt.m4956lerpjWV1Mfo(m4944constructorimpl, m4944constructorimpl2, f8);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp3 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f8);
        LocaleList localeList = (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f8);
        long m2999lerpjxsXWHM = ColorKt.m2999lerpjxsXWHM(spanStyle.m4626getBackground0d7_KjU(), spanStyle2.m4626getBackground0d7_KjU(), f8);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f8);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(lerp, m4634lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m4634lerpTextUnitInheritableC3pnCVY2, BaselineShift.m4943boximpl(m4956lerpjWV1Mfo), lerp3, localeList, m2999lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f8), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f8), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f8), (AbstractC3284p) null);
    }

    public static final <T> T lerpDiscrete(T t8, T t9, float f8) {
        return ((double) f8) < 0.5d ? t8 : t9;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f8) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f8);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m4634lerpTextUnitInheritableC3pnCVY(long j8, long j9, float f8) {
        if (!TextUnitKt.m5360isUnspecifiedR2X_6o(j8) && !TextUnitKt.m5360isUnspecifiedR2X_6o(j9)) {
            return TextUnitKt.m5362lerpC3pnCVY(j8, j9, f8);
        }
        return ((TextUnit) lerpDiscrete(TextUnit.m5332boximpl(j8), TextUnit.m5332boximpl(j9), f8)).m5351unboximpl();
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    public static final SpanStyle resolveSpanStyleDefaults(SpanStyle spanStyle) {
        long m4629getFontSizeXSAIIZE;
        int m4786getNormal_LCdwA;
        int m4796getAllGVVA2EU;
        long m4632getLetterSpacingXSAIIZE;
        float m4953getNoney9eOQZs;
        TextForegroundStyle takeOrElse = spanStyle.getTextForegroundStyle$ui_text_release().takeOrElse(SpanStyleKt$resolveSpanStyleDefaults$1.INSTANCE);
        if (TextUnitKt.m5360isUnspecifiedR2X_6o(spanStyle.m4629getFontSizeXSAIIZE())) {
            m4629getFontSizeXSAIIZE = DefaultFontSize;
        } else {
            m4629getFontSizeXSAIIZE = spanStyle.m4629getFontSizeXSAIIZE();
        }
        long j8 = m4629getFontSizeXSAIIZE;
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle m4630getFontStyle4Lr2A7w = spanStyle.m4630getFontStyle4Lr2A7w();
        if (m4630getFontStyle4Lr2A7w != null) {
            m4786getNormal_LCdwA = m4630getFontStyle4Lr2A7w.m4782unboximpl();
        } else {
            m4786getNormal_LCdwA = FontStyle.Companion.m4786getNormal_LCdwA();
        }
        FontStyle m4776boximpl = FontStyle.m4776boximpl(m4786getNormal_LCdwA);
        FontSynthesis m4631getFontSynthesisZQGJjVo = spanStyle.m4631getFontSynthesisZQGJjVo();
        if (m4631getFontSynthesisZQGJjVo != null) {
            m4796getAllGVVA2EU = m4631getFontSynthesisZQGJjVo.m4795unboximpl();
        } else {
            m4796getAllGVVA2EU = FontSynthesis.Companion.m4796getAllGVVA2EU();
        }
        FontSynthesis m4787boximpl = FontSynthesis.m4787boximpl(m4796getAllGVVA2EU);
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        if (TextUnitKt.m5360isUnspecifiedR2X_6o(spanStyle.m4632getLetterSpacingXSAIIZE())) {
            m4632getLetterSpacingXSAIIZE = DefaultLetterSpacing;
        } else {
            m4632getLetterSpacingXSAIIZE = spanStyle.m4632getLetterSpacingXSAIIZE();
        }
        long j9 = m4632getLetterSpacingXSAIIZE;
        BaselineShift m4627getBaselineShift5SSeXJ0 = spanStyle.m4627getBaselineShift5SSeXJ0();
        if (m4627getBaselineShift5SSeXJ0 != null) {
            m4953getNoney9eOQZs = m4627getBaselineShift5SSeXJ0.m4949unboximpl();
        } else {
            m4953getNoney9eOQZs = BaselineShift.Companion.m4953getNoney9eOQZs();
        }
        BaselineShift m4943boximpl = BaselineShift.m4943boximpl(m4953getNoney9eOQZs);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m4626getBackground0d7_KjU = spanStyle.m4626getBackground0d7_KjU();
        if (m4626getBackground0d7_KjU == Color.Companion.m2984getUnspecified0d7_KjU()) {
            m4626getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j10 = m4626getBackground0d7_KjU;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, j8, fontWeight2, m4776boximpl, m4787boximpl, fontFamily2, str, j9, m4943boximpl, textGeometricTransform2, localeList2, j10, textDecoration2, shadow2, platformStyle, drawStyle, (AbstractC3284p) null);
    }
}
