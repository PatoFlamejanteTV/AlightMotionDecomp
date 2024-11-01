package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import c6.InterfaceC2074p;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, InterfaceC2074p interfaceC2074p, Density density, boolean z8) {
        Locale locale;
        int m4786getNormal_LCdwA;
        int m4796getAllGVVA2EU;
        long m5341getTypeUIouoOA = TextUnit.m5341getTypeUIouoOA(spanStyle.m4629getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5375getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo424toPxR2X_6o(spanStyle.m4629getFontSizeXSAIIZE()));
        } else if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5374getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m5342getValueimpl(spanStyle.m4629getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
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
            androidTextPaint.setTypeface((Typeface) interfaceC2074p.invoke(fontFamily, fontWeight, m4776boximpl, FontSynthesis.m4787boximpl(m4796getAllGVVA2EU)));
        }
        if (spanStyle.getLocaleList() != null && !AbstractC3292y.d(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
            } else {
                if (spanStyle.getLocaleList().isEmpty()) {
                    locale = Locale.Companion.getCurrent();
                } else {
                    locale = spanStyle.getLocaleList().get(0);
                }
                androidTextPaint.setTextLocale(LocaleExtensions_androidKt.toJavaLocale(locale));
            }
        }
        if (spanStyle.getFontFeatureSettings() != null && !AbstractC3292y.d(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !AbstractC3292y.d(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m4924setColor8_81llA(spanStyle.m4628getColor0d7_KjU());
        androidTextPaint.m4923setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m2789getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m5370equalsimpl0(TextUnit.m5341getTypeUIouoOA(spanStyle.m4632getLetterSpacingXSAIIZE()), companion.m5375getSpUIouoOA()) && TextUnit.m5342getValueimpl(spanStyle.m4632getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
            float mo424toPxR2X_6o = density.mo424toPxR2X_6o(spanStyle.m4632getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                androidTextPaint.setLetterSpacing(mo424toPxR2X_6o / textSize);
            }
        } else if (TextUnitType.m5370equalsimpl0(TextUnit.m5341getTypeUIouoOA(spanStyle.m4632getLetterSpacingXSAIIZE()), companion.m5374getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m5342getValueimpl(spanStyle.m4632getLetterSpacingXSAIIZE()));
        }
        return m4938generateFallbackSpanStyle62GTOB8(spanStyle.m4632getLetterSpacingXSAIIZE(), z8, spanStyle.m4626getBackground0d7_KjU(), spanStyle.m4627getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, InterfaceC2074p interfaceC2074p, Density density, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, interfaceC2074p, density, z8);
    }

    public static final float correctBlurRadius(float f8) {
        if (f8 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f8;
    }

    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m4938generateFallbackSpanStyle62GTOB8(long j8, boolean z8, long j9, BaselineShift baselineShift) {
        boolean z9;
        boolean z10;
        long m5353getUnspecifiedXSAIIZE;
        BaselineShift baselineShift2;
        long j10 = j9;
        boolean z11 = false;
        if (z8 && TextUnitType.m5370equalsimpl0(TextUnit.m5341getTypeUIouoOA(j8), TextUnitType.Companion.m5375getSpUIouoOA()) && TextUnit.m5342getValueimpl(j8) != 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        Color.Companion companion = Color.Companion;
        if (!Color.m2949equalsimpl0(j10, companion.m2984getUnspecified0d7_KjU()) && !Color.m2949equalsimpl0(j10, companion.m2983getTransparent0d7_KjU())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (baselineShift != null) {
            if (!BaselineShift.m4946equalsimpl0(baselineShift.m4949unboximpl(), BaselineShift.Companion.m4953getNoney9eOQZs())) {
                z11 = true;
            }
        }
        if (!z9 && !z10 && !z11) {
            return null;
        }
        if (z9) {
            m5353getUnspecifiedXSAIIZE = j8;
        } else {
            m5353getUnspecifiedXSAIIZE = TextUnit.Companion.m5353getUnspecifiedXSAIIZE();
        }
        if (!z10) {
            j10 = companion.m2984getUnspecified0d7_KjU();
        }
        long j11 = j10;
        if (z11) {
            baselineShift2 = baselineShift;
        } else {
            baselineShift2 = null;
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, m5353getUnspecifiedXSAIIZE, baselineShift2, (TextGeometricTransform) null, (LocaleList) null, j11, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (AbstractC3284p) null);
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle) {
        if (spanStyle.getFontFamily() == null && spanStyle.m4630getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) {
            return false;
        }
        return true;
    }

    public static final void setTextMotion(AndroidTextPaint androidTextPaint, TextMotion textMotion) {
        int flags;
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        if (textMotion.getSubpixelTextPositioning$ui_text_release()) {
            flags = androidTextPaint.getFlags() | 128;
        } else {
            flags = androidTextPaint.getFlags() & (-129);
        }
        androidTextPaint.setFlags(flags);
        int m5087getLinearity4e0Vf04$ui_text_release = textMotion.m5087getLinearity4e0Vf04$ui_text_release();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m5091equalsimpl0(m5087getLinearity4e0Vf04$ui_text_release, companion.m5096getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m5091equalsimpl0(m5087getLinearity4e0Vf04$ui_text_release, companion.m5095getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.m5091equalsimpl0(m5087getLinearity4e0Vf04$ui_text_release, companion.m5097getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }
}
