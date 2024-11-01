package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.b;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i8, int i9, Density density, FontFamily.Resolver resolver) {
        int m4786getNormal_LCdwA;
        int m4796getAllGVVA2EU;
        SpannableExtensions_androidKt.m4934setColorRPmYEkk(spannableString, spanStyle.m4628getColor0d7_KjU(), i8, i9);
        SpannableExtensions_androidKt.m4935setFontSizeKmRG4DE(spannableString, spanStyle.m4629getFontSizeXSAIIZE(), density, i8, i9);
        if (spanStyle.getFontWeight() != null || spanStyle.m4630getFontStyle4Lr2A7w() != null) {
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
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m4734getAndroidTypefaceStyleFO1MlWM(fontWeight, m4786getNormal_LCdwA)), i8, i9, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i8, i9, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis m4631getFontSynthesisZQGJjVo = spanStyle.m4631getFontSynthesisZQGJjVo();
                if (m4631getFontSynthesisZQGJjVo != null) {
                    m4796getAllGVVA2EU = m4631getFontSynthesisZQGJjVo.m4795unboximpl();
                } else {
                    m4796getAllGVVA2EU = FontSynthesis.Companion.m4796getAllGVVA2EU();
                }
                Object value = b.a(resolver, fontFamily, null, 0, m4796getAllGVVA2EU, 6, null).getValue();
                AbstractC3292y.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(Api28Impl.INSTANCE.createTypefaceSpan((Typeface) value), i8, i9, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.Companion;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i8, i9, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i8, i9, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i8, i9, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i8, i9);
        SpannableExtensions_androidKt.m4932setBackgroundRPmYEkk(spannableString, spanStyle.m4626getBackground0d7_KjU(), i8, i9);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver, URLSpanCache uRLSpanCache) {
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i8 = 0; i8 < size; i8++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i8);
                SpanStyle component1 = range.component1();
                setSpanStyle(spannableString, SpanStyle.m4619copyGSF8kmg$default(component1, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), range.component2(), range.component3(), density, resolver);
            }
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i9 = 0; i9 < size2; i9++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i9);
            TtsAnnotation component12 = range2.component1();
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(component12), range2.component2(), range2.component3(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i10 = 0; i10 < size3; i10++) {
            AnnotatedString.Range<UrlAnnotation> range3 = urlAnnotations.get(i10);
            UrlAnnotation component13 = range3.component1();
            spannableString.setSpan(uRLSpanCache.toURLSpan(component13), range3.component2(), range3.component3(), 33);
        }
        return spannableString;
    }
}
