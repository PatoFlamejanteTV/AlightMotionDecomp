package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;

/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        Spannable spannableString;
        if (charSequence.length() == 0) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i8) {
        int lineCount = textLayout.getLineCount();
        for (int i9 = 0; i9 < lineCount; i9++) {
            if (textLayout.getLineBottom(i9) > i8) {
                return i9;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z8) {
        if (!z8 || TextUnit.m5339equalsimpl0(textStyle.m4705getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m5339equalsimpl0(textStyle.m4705getLetterSpacingXSAIIZE(), TextUnit.Companion.m5353getUnspecifiedXSAIIZE())) {
            return false;
        }
        int m4710getTextAligne0LSkKk = textStyle.m4710getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m5055equalsimpl0(m4710getTextAligne0LSkKk, companion.m5065getUnspecifiede0LSkKk()) || TextAlign.m5055equalsimpl0(textStyle.m4710getTextAligne0LSkKk(), companion.m5064getStarte0LSkKk()) || TextAlign.m5055equalsimpl0(textStyle.m4710getTextAligne0LSkKk(), companion.m5061getJustifye0LSkKk())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m4530toLayoutAlignaXe7zB0(int i8) {
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m5055equalsimpl0(i8, companion.m5062getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m5055equalsimpl0(i8, companion.m5063getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m5055equalsimpl0(i8, companion.m5059getCentere0LSkKk())) {
            return 2;
        }
        if (TextAlign.m5055equalsimpl0(i8, companion.m5064getStarte0LSkKk()) || !TextAlign.m5055equalsimpl0(i8, companion.m5060getEnde0LSkKk())) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m4531toLayoutBreakStrategyxImikfE(int i8) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        if (LineBreak.Strategy.m4996equalsimpl0(i8, companion.m5002getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m4996equalsimpl0(i8, companion.m5001getHighQualityfcGXIks())) {
            return 1;
        }
        if (!LineBreak.Strategy.m4996equalsimpl0(i8, companion.m5000getBalancedfcGXIks())) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m4532toLayoutHyphenationFrequency3fSNIE(int i8) {
        Hyphens.Companion companion = Hyphens.Companion;
        if (Hyphens.m4965equalsimpl0(i8, companion.m4969getAutovmbZdU8())) {
            if (Build.VERSION.SDK_INT <= 32) {
                return 2;
            }
            return 4;
        }
        Hyphens.m4965equalsimpl0(i8, companion.m4970getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m4533toLayoutLineBreakStylehpcqdu8(int i8) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        if (LineBreak.Strictness.m5007equalsimpl0(i8, companion.m5011getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m5007equalsimpl0(i8, companion.m5012getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m5007equalsimpl0(i8, companion.m5013getNormalusljTpc())) {
            return 2;
        }
        if (!LineBreak.Strictness.m5007equalsimpl0(i8, companion.m5014getStrictusljTpc())) {
            return 0;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m4534toLayoutLineBreakWordStylewPN0Rpw(int i8) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        if (LineBreak.WordBreak.m5019equalsimpl0(i8, companion.m5023getDefaultjp8hJ3c()) || !LineBreak.WordBreak.m5019equalsimpl0(i8, companion.m5024getPhrasejp8hJ3c())) {
            return 0;
        }
        return 1;
    }
}
