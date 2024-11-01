package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;
import androidx.leanback.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class SeekBar extends View {
    private AccessibilitySeekListener mAccessibilitySeekListener;
    private int mActiveBarHeight;
    private int mActiveRadius;
    private final Paint mBackgroundPaint;
    private final RectF mBackgroundRect;
    private int mBarHeight;
    private final Paint mKnobPaint;
    private int mKnobx;
    private int mMax;
    private int mProgress;
    private final Paint mProgressPaint;
    private final RectF mProgressRect;
    private int mSecondProgress;
    private final Paint mSecondProgressPaint;
    private final RectF mSecondProgressRect;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public static abstract class AccessibilitySeekListener {
        public abstract boolean onAccessibilitySeekBackward();

        public abstract boolean onAccessibilitySeekForward();
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mProgressRect = new RectF();
        this.mSecondProgressRect = new RectF();
        this.mBackgroundRect = new RectF();
        Paint paint = new Paint(1);
        this.mSecondProgressPaint = paint;
        Paint paint2 = new Paint(1);
        this.mProgressPaint = paint2;
        Paint paint3 = new Paint(1);
        this.mBackgroundPaint = paint3;
        Paint paint4 = new Paint(1);
        this.mKnobPaint = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(SupportMenu.CATEGORY_MASK);
        paint4.setColor(-1);
        this.mBarHeight = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_bar_height);
        this.mActiveBarHeight = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_bar_height);
        this.mActiveRadius = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_progressbar_active_radius);
    }

    private void calculate() {
        int i8;
        int i9;
        if (isFocused()) {
            i8 = this.mActiveBarHeight;
        } else {
            i8 = this.mBarHeight;
        }
        int width = getWidth();
        int height = getHeight();
        int i10 = (height - i8) / 2;
        RectF rectF = this.mBackgroundRect;
        int i11 = this.mBarHeight;
        float f8 = i10;
        float f9 = height - i10;
        rectF.set(i11 / 2, f8, width - (i11 / 2), f9);
        if (isFocused()) {
            i9 = this.mActiveRadius;
        } else {
            i9 = this.mBarHeight / 2;
        }
        float f10 = width - (i9 * 2);
        float f11 = (this.mProgress / this.mMax) * f10;
        RectF rectF2 = this.mProgressRect;
        int i12 = this.mBarHeight;
        rectF2.set(i12 / 2, f8, (i12 / 2) + f11, f9);
        this.mSecondProgressRect.set(this.mProgressRect.right, f8, (this.mBarHeight / 2) + ((this.mSecondProgress / this.mMax) * f10), f9);
        this.mKnobx = i9 + ((int) f11);
        invalidate();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.mMax;
    }

    public int getProgress() {
        return this.mProgress;
    }

    public int getSecondProgress() {
        return this.mSecondProgress;
    }

    public int getSecondaryProgressColor() {
        return this.mSecondProgressPaint.getColor();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i8;
        super.onDraw(canvas);
        if (isFocused()) {
            i8 = this.mActiveRadius;
        } else {
            i8 = this.mBarHeight / 2;
        }
        float f8 = i8;
        canvas.drawRoundRect(this.mBackgroundRect, f8, f8, this.mBackgroundPaint);
        RectF rectF = this.mSecondProgressRect;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f8, f8, this.mSecondProgressPaint);
        }
        canvas.drawRoundRect(this.mProgressRect, f8, f8, this.mProgressPaint);
        canvas.drawCircle(this.mKnobx, getHeight() / 2, f8, this.mKnobPaint);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z8, int i8, Rect rect) {
        super.onFocusChanged(z8, i8, rect);
        calculate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        calculate();
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i8, Bundle bundle) {
        AccessibilitySeekListener accessibilitySeekListener = this.mAccessibilitySeekListener;
        if (accessibilitySeekListener != null) {
            if (i8 != 4096) {
                if (i8 == 8192) {
                    return accessibilitySeekListener.onAccessibilitySeekBackward();
                }
            } else {
                return accessibilitySeekListener.onAccessibilitySeekForward();
            }
        }
        return super.performAccessibilityAction(i8, bundle);
    }

    public void setAccessibilitySeekListener(AccessibilitySeekListener accessibilitySeekListener) {
        this.mAccessibilitySeekListener = accessibilitySeekListener;
    }

    public void setActiveBarHeight(int i8) {
        this.mActiveBarHeight = i8;
        calculate();
    }

    public void setActiveRadius(int i8) {
        this.mActiveRadius = i8;
        calculate();
    }

    public void setBarHeight(int i8) {
        this.mBarHeight = i8;
        calculate();
    }

    public void setMax(int i8) {
        this.mMax = i8;
        calculate();
    }

    public void setProgress(int i8) {
        int i9 = this.mMax;
        if (i8 > i9) {
            i8 = i9;
        } else if (i8 < 0) {
            i8 = 0;
        }
        this.mProgress = i8;
        calculate();
    }

    public void setProgressColor(int i8) {
        this.mProgressPaint.setColor(i8);
    }

    public void setSecondaryProgress(int i8) {
        int i9 = this.mMax;
        if (i8 > i9) {
            i8 = i9;
        } else if (i8 < 0) {
            i8 = 0;
        }
        this.mSecondProgress = i8;
        calculate();
    }

    public void setSecondaryProgressColor(int i8) {
        this.mSecondProgressPaint.setColor(i8);
    }
}
