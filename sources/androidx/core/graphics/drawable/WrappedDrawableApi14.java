package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {
    static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    private boolean mColorFilterSet;
    private int mCurrentColor;
    private PorterDuff.Mode mCurrentMode;
    Drawable mDrawable;
    private boolean mMutated;
    WrappedDrawableState mState;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WrappedDrawableApi14(@NonNull WrappedDrawableState wrappedDrawableState, @Nullable Resources resources) {
        this.mState = wrappedDrawableState;
        updateLocalState(resources);
    }

    @NonNull
    private WrappedDrawableState mutateConstantState() {
        return new WrappedDrawableState(this.mState);
    }

    private void updateLocalState(@Nullable Resources resources) {
        Drawable.ConstantState constantState;
        WrappedDrawableState wrappedDrawableState = this.mState;
        if (wrappedDrawableState != null && (constantState = wrappedDrawableState.mDrawableState) != null) {
            setWrappedDrawable(constantState.newDrawable(resources));
        }
    }

    private boolean updateTint(int[] iArr) {
        if (!isCompatTintEnabled()) {
            return false;
        }
        WrappedDrawableState wrappedDrawableState = this.mState;
        ColorStateList colorStateList = wrappedDrawableState.mTint;
        PorterDuff.Mode mode = wrappedDrawableState.mTintMode;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.mColorFilterSet || colorForState != this.mCurrentColor || mode != this.mCurrentMode) {
                setColorFilter(colorForState, mode);
                this.mCurrentColor = colorForState;
                this.mCurrentMode = mode;
                this.mColorFilterSet = true;
                return true;
            }
        } else {
            this.mColorFilterSet = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.mDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i8;
        int changingConfigurations = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState = this.mState;
        if (wrappedDrawableState != null) {
            i8 = wrappedDrawableState.getChangingConfigurations();
        } else {
            i8 = 0;
        }
        return changingConfigurations | i8 | this.mDrawable.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        WrappedDrawableState wrappedDrawableState = this.mState;
        if (wrappedDrawableState != null && wrappedDrawableState.canConstantState()) {
            this.mState.mChangingConfigurations = getChangingConfigurations();
            return this.mState;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.mDrawable.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(23)
    public int getLayoutDirection() {
        return DrawableCompat.getLayoutDirection(this.mDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.mDrawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.mDrawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.mDrawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.mDrawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public int[] getState() {
        return this.mDrawable.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.mDrawable.getTransparentRegion();
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable getWrappedDrawable() {
        return this.mDrawable;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return DrawableCompat.isAutoMirrored(this.mDrawable);
    }

    protected boolean isCompatTintEnabled() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        WrappedDrawableState wrappedDrawableState;
        if (isCompatTintEnabled() && (wrappedDrawableState = this.mState) != null) {
            colorStateList = wrappedDrawableState.mTint;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.mDrawable.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.mDrawable.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.mMutated && super.mutate() == this) {
            this.mState = mutateConstantState();
            Drawable drawable = this.mDrawable;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState wrappedDrawableState = this.mState;
            if (wrappedDrawableState != null) {
                Drawable drawable2 = this.mDrawable;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                wrappedDrawableState.mDrawableState = constantState;
            }
            this.mMutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.mDrawable;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(23)
    public boolean onLayoutDirectionChanged(int i8) {
        return DrawableCompat.setLayoutDirection(this.mDrawable, i8);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        return this.mDrawable.setLevel(i8);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j8) {
        scheduleSelf(runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.mDrawable.setAlpha(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z8) {
        DrawableCompat.setAutoMirrored(this.mDrawable, z8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i8) {
        this.mDrawable.setChangingConfigurations(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawable.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z8) {
        this.mDrawable.setDither(z8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z8) {
        this.mDrawable.setFilterBitmap(z8);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        boolean state = this.mDrawable.setState(iArr);
        if (!updateTint(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i8) {
        setTintList(ColorStateList.valueOf(i8));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        this.mState.mTint = colorStateList;
        updateTint(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.mState.mTintMode = mode;
        updateTint(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z8, boolean z9) {
        if (!super.setVisible(z8, z9) && !this.mDrawable.setVisible(z8, z9)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void setWrappedDrawable(Drawable drawable) {
        Drawable drawable2 = this.mDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState wrappedDrawableState = this.mState;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.mDrawableState = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WrappedDrawableApi14(@Nullable Drawable drawable) {
        this.mState = mutateConstantState();
        setWrappedDrawable(drawable);
    }
}
