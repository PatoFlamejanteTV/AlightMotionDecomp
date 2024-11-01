package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ScaledDrawableWrapper extends DrawableWrapperCompat {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(@NonNull Drawable drawable, int i8, int i9) {
        super(drawable);
        this.width = i8;
        this.height = i9;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }
}
