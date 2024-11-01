package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
/* loaded from: classes.dex */
public final class StaticLayoutFactory {
    public static final int $stable;
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();
    private static final StaticLayoutFactoryImpl delegate;

    static {
        StaticLayoutFactoryImpl staticLayoutFactoryDefault;
        if (Build.VERSION.SDK_INT >= 23) {
            staticLayoutFactoryDefault = new StaticLayoutFactory23();
        } else {
            staticLayoutFactoryDefault = new StaticLayoutFactoryDefault();
        }
        delegate = staticLayoutFactoryDefault;
        $stable = 8;
    }

    private StaticLayoutFactory() {
    }

    public static /* synthetic */ StaticLayout create$default(StaticLayoutFactory staticLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i8, int i9, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, float f8, float f9, int i13, boolean z8, boolean z9, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int i18, Object obj) {
        int i19;
        int i20;
        TextDirectionHeuristic textDirectionHeuristic2;
        Layout.Alignment alignment2;
        int i21;
        TextUtils.TruncateAt truncateAt2;
        int i22;
        float f10;
        float f11;
        int i23;
        boolean z10;
        boolean z11;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr3;
        int[] iArr4;
        if ((i18 & 8) != 0) {
            i19 = 0;
        } else {
            i19 = i9;
        }
        if ((i18 & 16) != 0) {
            i20 = charSequence.length();
        } else {
            i20 = i10;
        }
        if ((i18 & 32) != 0) {
            textDirectionHeuristic2 = LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release();
        } else {
            textDirectionHeuristic2 = textDirectionHeuristic;
        }
        if ((i18 & 64) != 0) {
            alignment2 = LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release();
        } else {
            alignment2 = alignment;
        }
        if ((i18 & 128) != 0) {
            i21 = Integer.MAX_VALUE;
        } else {
            i21 = i11;
        }
        if ((i18 & 256) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i18 & 512) != 0) {
            i22 = i8;
        } else {
            i22 = i12;
        }
        if ((i18 & 1024) != 0) {
            f10 = 1.0f;
        } else {
            f10 = f8;
        }
        if ((i18 & 2048) != 0) {
            f11 = 0.0f;
        } else {
            f11 = f9;
        }
        if ((i18 & 4096) != 0) {
            i23 = 0;
        } else {
            i23 = i13;
        }
        if ((i18 & 8192) != 0) {
            z10 = false;
        } else {
            z10 = z8;
        }
        if ((i18 & 16384) != 0) {
            z11 = true;
        } else {
            z11 = z9;
        }
        if ((32768 & i18) != 0) {
            i24 = 0;
        } else {
            i24 = i14;
        }
        if ((65536 & i18) != 0) {
            i25 = 0;
        } else {
            i25 = i15;
        }
        if ((131072 & i18) != 0) {
            i26 = 0;
        } else {
            i26 = i16;
        }
        if ((262144 & i18) != 0) {
            i27 = 0;
        } else {
            i27 = i17;
        }
        if ((524288 & i18) != 0) {
            iArr3 = null;
        } else {
            iArr3 = iArr;
        }
        if ((i18 & 1048576) != 0) {
            iArr4 = null;
        } else {
            iArr4 = iArr2;
        }
        return staticLayoutFactory.create(charSequence, textPaint, i8, i19, i20, textDirectionHeuristic2, alignment2, i21, truncateAt2, i22, f10, f11, i23, z10, z11, i24, i25, i26, i27, iArr3, iArr4);
    }

    public final StaticLayout create(CharSequence charSequence, TextPaint textPaint, int i8, int i9, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, @IntRange(from = 0) int i11, TextUtils.TruncateAt truncateAt, @IntRange(from = 0) int i12, @FloatRange(from = 0.0d) float f8, float f9, int i13, boolean z8, boolean z9, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2) {
        return delegate.create(new StaticLayoutParams(charSequence, i9, i10, textPaint, i8, textDirectionHeuristic, alignment, i11, truncateAt, i12, f8, f9, i13, z8, z9, i14, i15, i16, i17, iArr, iArr2));
    }

    public final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z8) {
        return delegate.isFallbackLineSpacingEnabled(staticLayout, z8);
    }
}
