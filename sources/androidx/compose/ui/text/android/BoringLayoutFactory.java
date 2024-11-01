package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class BoringLayoutFactory {
    public static final int $stable = 0;
    public static final BoringLayoutFactory INSTANCE = new BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    public static /* synthetic */ BoringLayout create$default(BoringLayoutFactory boringLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i8, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z8, boolean z9, TextUtils.TruncateAt truncateAt, int i9, int i10, Object obj) {
        Layout.Alignment alignment2;
        boolean z10;
        boolean z11;
        TextUtils.TruncateAt truncateAt2;
        int i11;
        if ((i10 & 16) != 0) {
            alignment2 = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment2 = alignment;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        } else {
            z10 = z8;
        }
        if ((i10 & 64) != 0) {
            z11 = true;
        } else {
            z11 = z9;
        }
        if ((i10 & 128) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i10 & 256) != 0) {
            i11 = i8;
        } else {
            i11 = i9;
        }
        return boringLayoutFactory.create(charSequence, textPaint, i8, metrics, alignment2, z10, z11, truncateAt2, i11);
    }

    public final BoringLayout create(CharSequence charSequence, TextPaint textPaint, int i8, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z8, boolean z9, TextUtils.TruncateAt truncateAt, int i9) {
        if (i8 >= 0) {
            if (i9 >= 0) {
                if (Build.VERSION.SDK_INT >= 33) {
                    return BoringLayoutFactory33.create(charSequence, textPaint, i8, alignment, 1.0f, 0.0f, metrics, z8, z9, truncateAt, i9);
                }
                return BoringLayoutFactoryDefault.create(charSequence, textPaint, i8, alignment, 1.0f, 0.0f, metrics, z8, truncateAt, i9);
            }
            throw new IllegalArgumentException("negative ellipsized width".toString());
        }
        throw new IllegalArgumentException("negative width".toString());
    }

    public final boolean isFallbackLineSpacingEnabled(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return BoringLayoutFactory33.INSTANCE.isFallbackLineSpacingEnabled(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics measure(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (Build.VERSION.SDK_INT >= 33) {
            return BoringLayoutFactory33.isBoring(charSequence, textPaint, textDirectionHeuristic);
        }
        return BoringLayoutFactoryDefault.isBoring(charSequence, textPaint, textDirectionHeuristic);
    }
}
