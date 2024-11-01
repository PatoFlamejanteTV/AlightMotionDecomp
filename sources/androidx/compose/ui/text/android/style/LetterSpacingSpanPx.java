package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.Px;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LetterSpacingSpanPx extends MetricAffectingSpan {
    public static final int $stable = 0;
    private final float letterSpacing;

    public LetterSpacingSpanPx(@Px float f8) {
        this.letterSpacing = f8;
    }

    private final void updatePaint(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.letterSpacing / textSize);
        }
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        updatePaint(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        updatePaint(textPaint);
    }
}
