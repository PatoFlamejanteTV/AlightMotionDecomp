package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* loaded from: classes4.dex */
final class TtmlRenderUtil {
    private TtmlRenderUtil() {
    }

    public static void applyStylesToSpan(SpannableStringBuilder spannableStringBuilder, int i8, int i9, TtmlStyle ttmlStyle) {
        if (ttmlStyle.getStyle() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(ttmlStyle.getStyle()), i8, i9, 33);
        }
        if (ttmlStyle.isLinethrough()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i8, i9, 33);
        }
        if (ttmlStyle.isUnderline()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i8, i9, 33);
        }
        if (ttmlStyle.hasFontColor()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ttmlStyle.getFontColor()), i8, i9, 33);
        }
        if (ttmlStyle.hasBackgroundColor()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(ttmlStyle.getBackgroundColor()), i8, i9, 33);
        }
        if (ttmlStyle.getFontFamily() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(ttmlStyle.getFontFamily()), i8, i9, 33);
        }
        if (ttmlStyle.getTextAlign() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(ttmlStyle.getTextAlign()), i8, i9, 33);
        }
        int fontSizeUnit = ttmlStyle.getFontSizeUnit();
        if (fontSizeUnit != 1) {
            if (fontSizeUnit != 2) {
                if (fontSizeUnit == 3) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(ttmlStyle.getFontSize() / 100.0f), i8, i9, 33);
                    return;
                }
                return;
            }
            spannableStringBuilder.setSpan(new RelativeSizeSpan(ttmlStyle.getFontSize()), i8, i9, 33);
            return;
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) ttmlStyle.getFontSize(), true), i8, i9, 33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String applyTextElementSpacePolicy(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void endParagraph(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static TtmlStyle resolveStyle(TtmlStyle ttmlStyle, String[] strArr, Map<String, TtmlStyle> map) {
        if (ttmlStyle == null && strArr == null) {
            return null;
        }
        int i8 = 0;
        if (ttmlStyle == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (ttmlStyle == null && strArr.length > 1) {
            TtmlStyle ttmlStyle2 = new TtmlStyle();
            int length = strArr.length;
            while (i8 < length) {
                ttmlStyle2.chain(map.get(strArr[i8]));
                i8++;
            }
            return ttmlStyle2;
        }
        if (ttmlStyle != null && strArr != null && strArr.length == 1) {
            return ttmlStyle.chain(map.get(strArr[0]));
        }
        if (ttmlStyle != null && strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i8 < length2) {
                ttmlStyle.chain(map.get(strArr[i8]));
                i8++;
            }
        }
        return ttmlStyle;
    }
}
