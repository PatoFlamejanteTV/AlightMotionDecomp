package androidx.compose.ui.text.android.style;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class LineHeightStyleSpanKt {
    public static final int lineHeight(Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
