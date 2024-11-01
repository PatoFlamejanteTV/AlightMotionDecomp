package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: androidx.compose.ui.text.android.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1814c {
    public static /* synthetic */ BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i8, Layout.Alignment alignment, float f8, float f9, BoringLayout.Metrics metrics, boolean z8, TextUtils.TruncateAt truncateAt, int i9, boolean z9) {
        return new BoringLayout(charSequence, textPaint, i8, alignment, f8, f9, metrics, z8, truncateAt, i9, z9);
    }
}
