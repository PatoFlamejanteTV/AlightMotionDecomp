package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class FadeThroughDrawable extends Drawable {
    private final float[] alphas;
    private final Drawable fadeInDrawable;
    private final Drawable fadeOutDrawable;
    private float progress;

    public FadeThroughDrawable(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        this.fadeOutDrawable = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.fadeInDrawable = mutate;
        mutate.setAlpha(0);
        this.alphas = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.fadeOutDrawable.draw(canvas);
        this.fadeInDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.fadeOutDrawable.getIntrinsicHeight(), this.fadeInDrawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.fadeOutDrawable.getIntrinsicWidth(), this.fadeInDrawable.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.fadeOutDrawable.getMinimumHeight(), this.fadeInDrawable.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.fadeOutDrawable.getMinimumWidth(), this.fadeInDrawable.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.fadeOutDrawable.isStateful() && !this.fadeInDrawable.isStateful()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        if (this.progress <= 0.5f) {
            this.fadeOutDrawable.setAlpha(i8);
            this.fadeInDrawable.setAlpha(0);
        } else {
            this.fadeOutDrawable.setAlpha(0);
            this.fadeInDrawable.setAlpha(i8);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i8, int i9, int i10, int i11) {
        super.setBounds(i8, i9, i10, i11);
        this.fadeOutDrawable.setBounds(i8, i9, i10, i11);
        this.fadeInDrawable.setBounds(i8, i9, i10, i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.fadeOutDrawable.setColorFilter(colorFilter);
        this.fadeInDrawable.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        if (this.progress != f8) {
            this.progress = f8;
            FadeThroughUtils.calculateFadeOutAndInAlphas(f8, this.alphas);
            this.fadeOutDrawable.setAlpha((int) (this.alphas[0] * 255.0f));
            this.fadeInDrawable.setAlpha((int) (this.alphas[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.fadeOutDrawable.setState(iArr);
        boolean state2 = this.fadeInDrawable.setState(iArr);
        if (!state && !state2) {
            return false;
        }
        return true;
    }
}
