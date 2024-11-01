package androidx.compose.ui.text.platform;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.emoji2.text.EmojiCompat;
import c6.InterfaceC2074p;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidParagraphHelper_androidKt {
    private static final AndroidParagraphHelper_androidKt$NoopSpan$1 NoopSpan = new CharacterStyle() { // from class: androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    };

    public static final CharSequence createCharSequence(String str, float f8, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, InterfaceC2074p interfaceC2074p, boolean z8) {
        CharSequence charSequence;
        Spannable spannableString;
        if (z8 && EmojiCompat.isConfigured()) {
            charSequence = EmojiCompat.get().process(str);
            AbstractC3292y.f(charSequence);
        } else {
            charSequence = str;
        }
        if (list.isEmpty() && list2.isEmpty() && AbstractC3292y.d(textStyle.getTextIndent(), TextIndent.Companion.getNone()) && TextUnitKt.m5360isUnspecifiedR2X_6o(textStyle.m4708getLineHeightXSAIIZE())) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        if (AbstractC3292y.d(textStyle.getTextDecoration(), TextDecoration.Companion.getUnderline())) {
            SpannableExtensions_androidKt.setSpan(spannableString, NoopSpan, 0, str.length());
        }
        if (isIncludeFontPaddingEnabled(textStyle) && textStyle.getLineHeightStyle() == null) {
            SpannableExtensions_androidKt.m4937setLineHeightr9BaKPg(spannableString, textStyle.m4708getLineHeightXSAIIZE(), f8, density);
        } else {
            LineHeightStyle lineHeightStyle = textStyle.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = LineHeightStyle.Companion.getDefault();
            }
            Spannable spannable = spannableString;
            SpannableExtensions_androidKt.m4936setLineHeightKmRG4DE(spannable, textStyle.m4708getLineHeightXSAIIZE(), f8, density, lineHeightStyle);
        }
        SpannableExtensions_androidKt.setTextIndent(spannableString, textStyle.getTextIndent(), f8, density);
        SpannableExtensions_androidKt.setSpanStyles(spannableString, textStyle, list, density, interfaceC2074p);
        PlaceholderExtensions_androidKt.setPlaceholders(spannableString, list2, density);
        return spannableString;
    }

    public static final boolean isIncludeFontPaddingEnabled(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle != null && (paragraphStyle = platformStyle.getParagraphStyle()) != null) {
            return paragraphStyle.getIncludeFontPadding();
        }
        return false;
    }
}
