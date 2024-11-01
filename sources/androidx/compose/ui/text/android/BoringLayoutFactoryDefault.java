package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;

/* loaded from: classes.dex */
final class BoringLayoutFactoryDefault {
    public static final BoringLayoutFactoryDefault INSTANCE = new BoringLayoutFactoryDefault();

    private BoringLayoutFactoryDefault() {
    }

    @DoNotInline
    public static final BoringLayout create(CharSequence charSequence, TextPaint textPaint, int i8, Layout.Alignment alignment, float f8, float f9, BoringLayout.Metrics metrics, boolean z8, TextUtils.TruncateAt truncateAt, int i9) {
        return new BoringLayout(charSequence, textPaint, i8, alignment, f8, f9, metrics, z8, truncateAt, i9);
    }

    public static /* synthetic */ BoringLayout create$default(CharSequence charSequence, TextPaint textPaint, int i8, Layout.Alignment alignment, float f8, float f9, BoringLayout.Metrics metrics, boolean z8, TextUtils.TruncateAt truncateAt, int i9, int i10, Object obj) {
        TextUtils.TruncateAt truncateAt2;
        int i11;
        if ((i10 & 256) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i10 & 512) != 0) {
            i11 = i8;
        } else {
            i11 = i9;
        }
        return create(charSequence, textPaint, i8, alignment, f8, f9, metrics, z8, truncateAt2, i11);
    }

    @DoNotInline
    public static final BoringLayout.Metrics isBoring(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
