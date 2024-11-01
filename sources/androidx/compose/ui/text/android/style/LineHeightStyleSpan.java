package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 8;
    private final int endIndex;
    private int firstAscentDiff;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;
    private int firstAscent = Integer.MIN_VALUE;
    private int ascent = Integer.MIN_VALUE;
    private int descent = Integer.MIN_VALUE;
    private int lastDescent = Integer.MIN_VALUE;

    public LineHeightStyleSpan(float f8, int i8, int i9, boolean z8, boolean z9, @FloatRange(from = -1.0d, to = 1.0d) float f9) {
        this.lineHeight = f8;
        this.startIndex = i8;
        this.endIndex = i9;
        this.trimFirstLineTop = z8;
        this.trimLastLineBottom = z9;
        this.topRatio = f9;
        if ((0.0f <= f9 && f9 <= 1.0f) || f9 == -1.0f) {
        } else {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        double ceil;
        int ceil2 = (int) Math.ceil(this.lineHeight);
        int lineHeight = ceil2 - LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        float f8 = this.topRatio;
        if (f8 == -1.0f) {
            f8 = Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        }
        if (lineHeight <= 0) {
            ceil = Math.ceil(lineHeight * f8);
        } else {
            ceil = Math.ceil(lineHeight * (1.0f - f8));
        }
        int i8 = (int) ceil;
        int i9 = fontMetricsInt.descent;
        int i10 = i8 + i9;
        this.descent = i10;
        int i11 = i10 - ceil2;
        this.ascent = i11;
        if (this.trimFirstLineTop) {
            i11 = fontMetricsInt.ascent;
        }
        this.firstAscent = i11;
        if (this.trimLastLineBottom) {
            i10 = i9;
        }
        this.lastDescent = i10;
        this.firstAscentDiff = fontMetricsInt.ascent - i11;
        this.lastDescentDiff = i10 - i9;
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text_release$default(LineHeightStyleSpan lineHeightStyleSpan, int i8, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z8 = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text_release(i8, i9, z8);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i8, int i9, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        boolean z8;
        int i12;
        int i13;
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z9 = false;
        if (i8 == this.startIndex) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (i9 == this.endIndex) {
            z9 = true;
        }
        if (z8 && z9 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        if (z8) {
            i12 = this.firstAscent;
        } else {
            i12 = this.ascent;
        }
        fontMetricsInt.ascent = i12;
        if (z9) {
            i13 = this.lastDescent;
        } else {
            i13 = this.descent;
        }
        fontMetricsInt.descent = i13;
    }

    public final LineHeightStyleSpan copy$ui_text_release(int i8, int i9, boolean z8) {
        return new LineHeightStyleSpan(this.lineHeight, i8, i9, z8, this.trimLastLineBottom, this.topRatio);
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }
}
