package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class StringHelpersKt {
    public static final int findParagraphEnd(CharSequence charSequence, int i8) {
        AbstractC3292y.i(charSequence, "<this>");
        int length = charSequence.length();
        for (int i9 = i8 + 1; i9 < length; i9++) {
            if (charSequence.charAt(i9) == '\n') {
                return i9;
            }
        }
        return charSequence.length();
    }

    public static final int findParagraphStart(CharSequence charSequence, int i8) {
        AbstractC3292y.i(charSequence, "<this>");
        for (int i9 = i8 - 1; i9 > 0; i9--) {
            if (charSequence.charAt(i9 - 1) == '\n') {
                return i9;
            }
        }
        return 0;
    }

    public static final long getParagraphBoundary(CharSequence charSequence, int i8) {
        AbstractC3292y.i(charSequence, "<this>");
        return TextRangeKt.TextRange(findParagraphStart(charSequence, i8), findParagraphEnd(charSequence, i8));
    }
}
