package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
/* loaded from: classes.dex */
final class BoringLayoutFactory33 {
    public static final BoringLayoutFactory33 INSTANCE = new BoringLayoutFactory33();

    private BoringLayoutFactory33() {
    }

    @DoNotInline
    public static final BoringLayout create(CharSequence charSequence, TextPaint textPaint, int i8, Layout.Alignment alignment, float f8, float f9, BoringLayout.Metrics metrics, boolean z8, boolean z9, TextUtils.TruncateAt truncateAt, int i9) {
        return AbstractC1814c.a(charSequence, textPaint, i8, alignment, f8, f9, metrics, z8, truncateAt, i9, z9);
    }

    public static /* synthetic */ BoringLayout create$default(CharSequence charSequence, TextPaint textPaint, int i8, Layout.Alignment alignment, float f8, float f9, BoringLayout.Metrics metrics, boolean z8, boolean z9, TextUtils.TruncateAt truncateAt, int i9, int i10, Object obj) {
        TextUtils.TruncateAt truncateAt2;
        int i11;
        if ((i10 & 512) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i10 & 1024) != 0) {
            i11 = i8;
        } else {
            i11 = i9;
        }
        return create(charSequence, textPaint, i8, alignment, f8, f9, metrics, z8, z9, truncateAt2, i11);
    }

    @DoNotInline
    public static final BoringLayout.Metrics isBoring(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        BoringLayout.Metrics isBoring;
        isBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
        return isBoring;
    }

    public final boolean isFallbackLineSpacingEnabled(BoringLayout boringLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }
}
