package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    private float cornerRadius;

    @Nullable
    private Path path;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void resetClipBoundsAndCornerRadius() {
        this.path = null;
        this.cornerRadius = 0.0f;
        invalidate();
    }

    public void updateClipBoundsAndCornerRadius(@NonNull Rect rect, float f8) {
        updateClipBoundsAndCornerRadius(rect.left, rect.top, rect.right, rect.bottom, f8);
    }

    public void updateCornerRadius(float f8) {
        updateClipBoundsAndCornerRadius(getLeft(), getTop(), getRight(), getBottom(), f8);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void updateClipBoundsAndCornerRadius(float f8, float f9, float f10, float f11, float f12) {
        updateClipBoundsAndCornerRadius(new RectF(f8, f9, f10, f11), f12);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }

    public void updateClipBoundsAndCornerRadius(@NonNull RectF rectF, float f8) {
        if (this.path == null) {
            this.path = new Path();
        }
        this.cornerRadius = f8;
        this.path.reset();
        this.path.addRoundRect(rectF, f8, f8, Path.Direction.CW);
        this.path.close();
        invalidate();
    }
}
