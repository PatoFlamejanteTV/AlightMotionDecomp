package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ScaleFrameLayout extends FrameLayout {
    private static final int DEFAULT_CHILD_GRAVITY = 8388659;
    private float mChildScale;
    private float mLayoutScaleX;
    private float mLayoutScaleY;

    public ScaleFrameLayout(Context context) {
        this(context, null);
    }

    private static int getScaledMeasureSpec(int i8, float f8) {
        if (f8 != 1.0f) {
            return View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i8) / f8) + 0.5f), View.MeasureSpec.getMode(i8));
        }
        return i8;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        view.setScaleX(this.mChildScale);
        view.setScaleY(this.mChildScale);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z8) {
        boolean addViewInLayout = super.addViewInLayout(view, i8, layoutParams, z8);
        if (addViewInLayout) {
            view.setScaleX(this.mChildScale);
            view.setScaleY(this.mChildScale);
        }
        return addViewInLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ScaleFrameLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        float f8 = this.mLayoutScaleX;
        if (f8 == 1.0f && this.mLayoutScaleY == 1.0f) {
            super.onMeasure(i8, i9);
        } else {
            super.onMeasure(getScaledMeasureSpec(i8, f8), getScaledMeasureSpec(i9, this.mLayoutScaleY));
            setMeasuredDimension((int) ((getMeasuredWidth() * this.mLayoutScaleX) + 0.5f), (int) ((getMeasuredHeight() * this.mLayoutScaleY) + 0.5f));
        }
    }

    public void setChildScale(float f8) {
        if (this.mChildScale != f8) {
            this.mChildScale = f8;
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                getChildAt(i8).setScaleX(f8);
                getChildAt(i8).setScaleY(f8);
            }
        }
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutScaleX(float f8) {
        if (f8 != this.mLayoutScaleX) {
            this.mLayoutScaleX = f8;
            requestLayout();
        }
    }

    public void setLayoutScaleY(float f8) {
        if (f8 != this.mLayoutScaleY) {
            this.mLayoutScaleY = f8;
            requestLayout();
        }
    }

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleFrameLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mLayoutScaleX = 1.0f;
        this.mLayoutScaleY = 1.0f;
        this.mChildScale = 1.0f;
    }
}
