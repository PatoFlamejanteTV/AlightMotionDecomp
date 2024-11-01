package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class ColorDrawableKt {
    public static final ColorDrawable toDrawable(@ColorInt int i8) {
        return new ColorDrawable(i8);
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final ColorDrawable toDrawable(Color color) {
        int argb;
        argb = color.toArgb();
        return new ColorDrawable(argb);
    }
}
