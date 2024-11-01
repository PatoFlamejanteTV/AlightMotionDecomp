package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;

/* loaded from: classes.dex */
public final class LayoutCompatKt {
    public static final int getLineForOffset(Layout layout, @IntRange(from = 0) int i8, boolean z8) {
        if (i8 <= 0) {
            return 0;
        }
        if (i8 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i8);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i8 && lineEnd != i8) {
            return lineForOffset;
        }
        if (lineStart == i8) {
            if (z8) {
                return lineForOffset - 1;
            }
            return lineForOffset;
        }
        if (!z8) {
            return lineForOffset + 1;
        }
        return lineForOffset;
    }
}
