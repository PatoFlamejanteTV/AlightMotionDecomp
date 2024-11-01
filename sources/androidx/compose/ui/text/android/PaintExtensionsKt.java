package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
public final class PaintExtensionsKt {
    private static final void extendWith(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    private static final void fillStringBounds(Paint paint, CharSequence charSequence, int i8, int i9, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            Paint29.getTextBounds(paint, charSequence, i8, i9, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i8, i9, rect);
        }
    }

    public static final Rect getCharSequenceBounds(TextPaint textPaint, CharSequence charSequence, int i8, int i9) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (SpannedExtensionsKt.hasSpan(spanned, MetricAffectingSpan.class, i8, i9)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i8 < i9) {
                    int nextSpanTransition = spanned.nextSpanTransition(i8, i9, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i8, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    fillStringBounds(textPaint2, charSequence, i8, nextSpanTransition, rect2);
                    extendWith(rect, rect2);
                    i8 = nextSpanTransition;
                }
                return rect;
            }
        }
        return getStringBounds(textPaint, charSequence, i8, i9);
    }

    @VisibleForTesting
    public static final Rect getStringBounds(Paint paint, CharSequence charSequence, int i8, int i9) {
        Rect rect = new Rect();
        fillStringBounds(paint, charSequence, i8, i9, rect);
        return rect;
    }
}
