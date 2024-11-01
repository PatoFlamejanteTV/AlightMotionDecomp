package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    public static final long ensureAtLeastOneChar(String text, int i8, int i9, boolean z8, boolean z9) {
        AbstractC3292y.i(text, "text");
        if (i9 == 0) {
            return TextRangeKt.TextRange(i8, i8);
        }
        if (i8 == 0) {
            if (z8) {
                return TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(text, 0), 0);
            }
            return TextRangeKt.TextRange(0, StringHelpers_androidKt.findFollowingBreak(text, 0));
        }
        if (i8 == i9) {
            if (z8) {
                return TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(text, i9), i9);
            }
            return TextRangeKt.TextRange(i9, StringHelpers_androidKt.findPrecedingBreak(text, i9));
        }
        if (z8) {
            if (!z9) {
                return TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(text, i8), i8);
            }
            return TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(text, i8), i8);
        }
        if (!z9) {
            return TextRangeKt.TextRange(i8, StringHelpers_androidKt.findFollowingBreak(text, i8));
        }
        return TextRangeKt.TextRange(i8, StringHelpers_androidKt.findPrecedingBreak(text, i8));
    }
}
