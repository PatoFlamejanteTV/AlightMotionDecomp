package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import e6.AbstractC2829a;
import i6.m;

/* loaded from: classes.dex */
public final class AndroidTextPaint_androidKt {
    public static final void setAlpha(TextPaint textPaint, float f8) {
        if (!Float.isNaN(f8)) {
            textPaint.setAlpha(AbstractC2829a.d(m.j(f8, 0.0f, 1.0f) * 255));
        }
    }
}
