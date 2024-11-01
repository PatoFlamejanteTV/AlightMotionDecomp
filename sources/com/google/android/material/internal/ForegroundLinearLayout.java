package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import com.google.android.material.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    @Nullable
    private Drawable foreground;
    boolean foregroundBoundsChanged;
    private int foregroundGravity;
    protected boolean mForegroundInPadding;
    private final Rect overlayBounds;
    private final Rect selfBounds;

    public ForegroundLinearLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.foreground;
        if (drawable != null) {
            if (this.foregroundBoundsChanged) {
                this.foregroundBoundsChanged = false;
                Rect rect = this.selfBounds;
                Rect rect2 = this.overlayBounds;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.mForegroundInPadding) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.foregroundGravity, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.foreground;
        if (drawable != null) {
            drawable.setHotspot(f8, f9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.foreground;
        if (drawable != null && drawable.isStateful()) {
            this.foreground.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.foreground;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.foregroundGravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.foreground;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        this.foregroundBoundsChanged = z8 | this.foregroundBoundsChanged;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.foregroundBoundsChanged = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.foreground;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.foreground);
            }
            this.foreground = drawable;
            this.foregroundBoundsChanged = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.foregroundGravity == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i8) {
        if (this.foregroundGravity != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= GravityCompat.START;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.foregroundGravity = i8;
            if (i8 == 119 && this.foreground != null) {
                this.foreground.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.foreground) {
            return false;
        }
        return true;
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.selfBounds = new Rect();
        this.overlayBounds = new Rect();
        this.foregroundGravity = 119;
        this.mForegroundInPadding = true;
        this.foregroundBoundsChanged = false;
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.ForegroundLinearLayout, i8, 0, new int[0]);
        this.foregroundGravity = obtainStyledAttributes.getInt(R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.foregroundGravity);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.mForegroundInPadding = obtainStyledAttributes.getBoolean(R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        obtainStyledAttributes.recycle();
    }
}
