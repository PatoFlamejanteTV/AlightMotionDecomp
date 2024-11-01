package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LayoutIntrinsics {
    public static final int $stable = 8;
    private BoringLayout.Metrics _boringMetrics;
    private float _maxIntrinsicWidth = Float.NaN;
    private float _minIntrinsicWidth = Float.NaN;
    private boolean boringMetricsIsInit;
    private final CharSequence charSequence;
    private final int textDirectionHeuristic;
    private final TextPaint textPaint;

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i8) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i8;
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = BoringLayoutFactory.INSTANCE.measure(this.charSequence, this.textPaint, TextLayoutKt.getTextDirectionHeuristic(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float getMaxIntrinsicWidth() {
        Float f8;
        boolean shouldIncreaseMaxIntrinsic;
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        if (getBoringMetrics() != null) {
            f8 = Float.valueOf(r0.width);
        } else {
            f8 = null;
        }
        if (f8 == null) {
            CharSequence charSequence = this.charSequence;
            f8 = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.textPaint)));
        }
        shouldIncreaseMaxIntrinsic = LayoutIntrinsicsKt.shouldIncreaseMaxIntrinsic(f8.floatValue(), this.charSequence, this.textPaint);
        if (shouldIncreaseMaxIntrinsic) {
            f8 = Float.valueOf(f8.floatValue() + 0.5f);
        }
        float floatValue = f8.floatValue();
        this._maxIntrinsicWidth = floatValue;
        return floatValue;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float minIntrinsicWidth = LayoutIntrinsicsKt.minIntrinsicWidth(this.charSequence, this.textPaint);
        this._minIntrinsicWidth = minIntrinsicWidth;
        return minIntrinsicWidth;
    }
}
