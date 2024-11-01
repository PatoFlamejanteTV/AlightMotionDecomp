package com.google.android.material.shadow;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ShadowViewDelegate {
    float getRadius();

    boolean isCompatPaddingEnabled();

    void setBackgroundDrawable(@Nullable Drawable drawable);

    void setShadowPadding(int i8, int i9, int i10, int i11);
}
