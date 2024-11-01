package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 0;
    private final float lineHeight;

    public LineHeightSpan(float f8) {
        this.lineHeight = f8;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i8, int i9, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.lineHeight));
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }
}
