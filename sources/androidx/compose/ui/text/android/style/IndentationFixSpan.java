package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.TextLayoutKt;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class IndentationFixSpan implements LeadingMarginSpan {
    public static final int $stable = 0;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z8, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i13)) == layout.getLineCount() - 1 && TextLayoutKt.isLineEllipsized(layout, lineForOffset)) {
            float ellipsizedLeftPadding = IndentationFixSpanKt.getEllipsizedLeftPadding(layout, lineForOffset, paint) + IndentationFixSpanKt.getEllipsizedRightPadding(layout, lineForOffset, paint);
            if (ellipsizedLeftPadding != 0.0f) {
                AbstractC3292y.f(canvas);
                canvas.translate(ellipsizedLeftPadding, 0.0f);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z8) {
        return 0;
    }
}
