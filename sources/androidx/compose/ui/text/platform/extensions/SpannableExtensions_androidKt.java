package androidx.compose.ui.text.platform.extensions;

import R5.AbstractC1428l;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import e6.AbstractC2829a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import l6.n;

/* loaded from: classes.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m4930createLetterSpacingSpaneAf_CNQ(long j8, Density density) {
        long m5341getTypeUIouoOA = TextUnit.m5341getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5375getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo424toPxR2X_6o(j8));
        }
        if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5374getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m5342getValueimpl(j8));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, InterfaceC2073o interfaceC2073o) {
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                interfaceC2073o.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = list.size();
        int i8 = size * 2;
        Integer[] numArr = new Integer[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            numArr[i9] = 0;
        }
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i10);
            numArr[i10] = Integer.valueOf(range.getStart());
            numArr[i10 + size] = Integer.valueOf(range.getEnd());
        }
        AbstractC1428l.J(numArr);
        int intValue = ((Number) AbstractC1428l.c0(numArr)).intValue();
        for (int i11 = 0; i11 < i8; i11++) {
            Integer num = numArr[i11];
            int intValue2 = num.intValue();
            if (intValue2 != intValue) {
                int size3 = list.size();
                SpanStyle spanStyle2 = spanStyle;
                for (int i12 = 0; i12 < size3; i12++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i12);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(intValue, intValue2, range2.getStart(), range2.getEnd())) {
                        spanStyle2 = merge(spanStyle2, range2.getItem());
                    }
                }
                if (spanStyle2 != null) {
                    interfaceC2073o.invoke(spanStyle2, Integer.valueOf(intValue), num);
                }
                intValue = intValue2;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long m5341getTypeUIouoOA = TextUnit.m5341getTypeUIouoOA(spanStyle.m4632getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (!TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5375getSpUIouoOA()) && !TextUnitType.m5370equalsimpl0(TextUnit.m5341getTypeUIouoOA(spanStyle.m4632getLetterSpacingXSAIIZE()), companion.m5374getEmUIouoOA())) {
            return false;
        }
        return true;
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        if (!TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) && textStyle.m4702getFontSynthesisZQGJjVo() == null) {
            return false;
        }
        return true;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        if (density.getFontScale() > 1.05d) {
            return true;
        }
        return false;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        if (spanStyle == null) {
            return spanStyle2;
        }
        return spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m4931resolveLineHeightInPxo2QH7mI(long j8, float f8, Density density) {
        float m5342getValueimpl;
        long m5341getTypeUIouoOA = TextUnit.m5341getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5375getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo424toPxR2X_6o(j8);
            }
            m5342getValueimpl = TextUnit.m5342getValueimpl(j8) / TextUnit.m5342getValueimpl(density.mo428toSpkPz2Gy4(f8));
        } else if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5374getEmUIouoOA())) {
            m5342getValueimpl = TextUnit.m5342getValueimpl(j8);
        } else {
            return Float.NaN;
        }
        return m5342getValueimpl * f8;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m4932setBackgroundRPmYEkk(Spannable spannable, long j8, int i8, int i9) {
        if (j8 != Color.Companion.m2984getUnspecified0d7_KjU()) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m3002toArgb8_81llA(j8)), i8, i9);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m4933setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i8, int i9) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m4949unboximpl()), i8, i9);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f8, int i8, int i9) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m4934setColorRPmYEkk(spannable, ((SolidColor) brush).m3260getValue0d7_KjU(), i8, i9);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f8), i8, i9);
            }
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m4934setColorRPmYEkk(Spannable spannable, long j8, int i8, int i9) {
        if (j8 != Color.Companion.m2984getUnspecified0d7_KjU()) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m3002toArgb8_81llA(j8)), i8, i9);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i8, int i9) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i8, i9);
        }
    }

    private static final void setFontAttributes(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, InterfaceC2074p interfaceC2074p) {
        SpanStyle spanStyle;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i8);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().m4631getFontSynthesisZQGJjVo() != null) {
                arrayList.add(range);
            }
        }
        if (hasFontAttributes(textStyle)) {
            spanStyle = new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m4701getFontStyle4Lr2A7w(), textStyle.m4702getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (AbstractC3284p) null);
        } else {
            spanStyle = null;
        }
        flattenFontStylesAndApply(spanStyle, arrayList, new SpannableExtensions_androidKt$setFontAttributes$1(spannable, interfaceC2074p));
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i8, int i9) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i8, i9);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m4935setFontSizeKmRG4DE(Spannable spannable, long j8, Density density, int i8, int i9) {
        long m5341getTypeUIouoOA = TextUnit.m5341getTypeUIouoOA(j8);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5375getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(AbstractC2829a.d(density.mo424toPxR2X_6o(j8)), false), i8, i9);
        } else if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5374getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m5342getValueimpl(j8)), i8, i9);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i8, int i9) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i8, i9);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i8, i9);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m4936setLineHeightKmRG4DE(Spannable spannable, long j8, float f8, Density density, LineHeightStyle lineHeightStyle) {
        int length;
        float m4931resolveLineHeightInPxo2QH7mI = m4931resolveLineHeightInPxo2QH7mI(j8, f8, density);
        if (!Float.isNaN(m4931resolveLineHeightInPxo2QH7mI)) {
            if (spannable.length() == 0 || n.R0(spannable) == '\n') {
                length = spannable.length() + 1;
            } else {
                length = spannable.length();
            }
            setSpan(spannable, new LineHeightStyleSpan(m4931resolveLineHeightInPxo2QH7mI, 0, length, LineHeightStyle.Trim.m5044isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m5027getTrimEVpEnUU()), LineHeightStyle.Trim.m5045isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m5027getTrimEVpEnUU()), lineHeightStyle.m5026getAlignmentPIaL0Z0()), 0, spannable.length());
        }
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m4937setLineHeightr9BaKPg(Spannable spannable, long j8, float f8, Density density) {
        float m4931resolveLineHeightInPxo2QH7mI = m4931resolveLineHeightInPxo2QH7mI(j8, f8, density);
        if (!Float.isNaN(m4931resolveLineHeightInPxo2QH7mI)) {
            setSpan(spannable, new LineHeightSpan(m4931resolveLineHeightInPxo2QH7mI), 0, spannable.length());
        }
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i8, int i9) {
        Locale locale;
        Object localeSpan;
        if (localeList != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = LocaleListHelperMethods.INSTANCE.localeSpan(localeList);
            } else {
                if (localeList.isEmpty()) {
                    locale = Locale.Companion.getCurrent();
                } else {
                    locale = localeList.get(0);
                }
                localeSpan = new LocaleSpan(LocaleExtensions_androidKt.toJavaLocale(locale));
            }
            setSpan(spannable, localeSpan, i8, i9);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i8, int i9) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m3002toArgb8_81llA(shadow.m3250getColor0d7_KjU()), Offset.m2712getXimpl(shadow.m3251getOffsetF1C5BW0()), Offset.m2713getYimpl(shadow.m3251getOffsetF1C5BW0()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i8, i9);
        }
    }

    public static final void setSpan(Spannable spannable, Object obj, int i8, int i9) {
        spannable.setSpan(obj, i8, i9, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m4933setBaselineShift0ocSgnM(spannable, item.m4627getBaselineShift5SSeXJ0(), start, end);
        m4934setColorRPmYEkk(spannable, item.m4628getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), item.getAlpha(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m4935setFontSizeKmRG4DE(spannable, item.m4629getFontSizeXSAIIZE(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m4932setBackgroundRPmYEkk(spannable, item.m4626getBackground0d7_KjU(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        setDrawStyle(spannable, item.getDrawStyle(), start, end);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, Density density, InterfaceC2074p interfaceC2074p) {
        MetricAffectingSpan m4930createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, interfaceC2074p);
        int size = list.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i8);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density);
                if (getNeedsLetterSpacingSpan(range.getItem())) {
                    z8 = true;
                }
            }
        }
        if (z8) {
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                AnnotatedString.Range<SpanStyle> range2 = list.get(i9);
                int start2 = range2.getStart();
                int end2 = range2.getEnd();
                SpanStyle item = range2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (m4930createLetterSpacingSpaneAf_CNQ = m4930createLetterSpacingSpaneAf_CNQ(item.m4632getLetterSpacingXSAIIZE(), density)) != null) {
                    setSpan(spannable, m4930createLetterSpacingSpaneAf_CNQ, start2, end2);
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i8, int i9) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.Companion;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i8, i9);
        }
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f8, Density density) {
        float f9;
        if (textIndent != null) {
            if ((!TextUnit.m5339equalsimpl0(textIndent.m5083getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) || !TextUnit.m5339equalsimpl0(textIndent.m5084getRestLineXSAIIZE(), TextUnitKt.getSp(0))) && !TextUnitKt.m5360isUnspecifiedR2X_6o(textIndent.m5083getFirstLineXSAIIZE()) && !TextUnitKt.m5360isUnspecifiedR2X_6o(textIndent.m5084getRestLineXSAIIZE())) {
                long m5341getTypeUIouoOA = TextUnit.m5341getTypeUIouoOA(textIndent.m5083getFirstLineXSAIIZE());
                TextUnitType.Companion companion = TextUnitType.Companion;
                float f10 = 0.0f;
                if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5375getSpUIouoOA())) {
                    f9 = density.mo424toPxR2X_6o(textIndent.m5083getFirstLineXSAIIZE());
                } else if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA, companion.m5374getEmUIouoOA())) {
                    f9 = TextUnit.m5342getValueimpl(textIndent.m5083getFirstLineXSAIIZE()) * f8;
                } else {
                    f9 = 0.0f;
                }
                long m5341getTypeUIouoOA2 = TextUnit.m5341getTypeUIouoOA(textIndent.m5084getRestLineXSAIIZE());
                if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA2, companion.m5375getSpUIouoOA())) {
                    f10 = density.mo424toPxR2X_6o(textIndent.m5084getRestLineXSAIIZE());
                } else if (TextUnitType.m5370equalsimpl0(m5341getTypeUIouoOA2, companion.m5374getEmUIouoOA())) {
                    f10 = TextUnit.m5342getValueimpl(textIndent.m5084getRestLineXSAIIZE()) * f8;
                }
                setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(f9), (int) Math.ceil(f10)), 0, spannable.length());
            }
        }
    }
}
