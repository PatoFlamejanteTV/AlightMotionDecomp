package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(TextLayoutResult textLayoutResult, int i8, boolean z8, boolean z9) {
        int max;
        AbstractC3292y.i(textLayoutResult, "<this>");
        boolean z10 = false;
        if ((z8 && !z9) || (!z8 && z9)) {
            max = i8;
        } else {
            max = Math.max(i8 - 1, 0);
        }
        if (textLayoutResult.getBidiRunDirection(max) == textLayoutResult.getParagraphDirection(i8)) {
            z10 = true;
        }
        return textLayoutResult.getHorizontalPosition(i8, z10);
    }

    public static final long getSelectionHandleCoordinates(TextLayoutResult textLayoutResult, int i8, boolean z8, boolean z9) {
        AbstractC3292y.i(textLayoutResult, "textLayoutResult");
        return OffsetKt.Offset(getHorizontalPosition(textLayoutResult, i8, z8, z9), textLayoutResult.getLineBottom(textLayoutResult.getLineForOffset(i8)));
    }
}
