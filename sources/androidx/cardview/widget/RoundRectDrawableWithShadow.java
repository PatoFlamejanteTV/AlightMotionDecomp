package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.cardview.R;

/* loaded from: classes.dex */
class RoundRectDrawableWithShadow extends Drawable {
    private static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    private static final float SHADOW_MULTIPLIER = 1.5f;
    static RoundRectHelper sRoundRectHelper;
    private ColorStateList mBackground;
    private final RectF mCardBounds;
    private float mCornerRadius;
    private Paint mCornerShadowPaint;
    private Path mCornerShadowPath;
    private Paint mEdgeShadowPaint;
    private final int mInsetShadow;
    private float mRawMaxShadowSize;
    private float mRawShadowSize;
    private final int mShadowEndColor;
    private float mShadowSize;
    private final int mShadowStartColor;
    private boolean mDirty = true;
    private boolean mAddPaddingForCorners = true;
    private boolean mPrintedShadowClipWarning = false;
    private Paint mPaint = new Paint(5);

    /* loaded from: classes.dex */
    interface RoundRectHelper {
        void drawRoundRect(Canvas canvas, RectF rectF, float f8, Paint paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RoundRectDrawableWithShadow(Resources resources, ColorStateList colorStateList, float f8, float f9, float f10) {
        this.mShadowStartColor = resources.getColor(R.color.cardview_shadow_start_color);
        this.mShadowEndColor = resources.getColor(R.color.cardview_shadow_end_color);
        this.mInsetShadow = resources.getDimensionPixelSize(R.dimen.cardview_compat_inset_shadow);
        setBackground(colorStateList);
        Paint paint = new Paint(5);
        this.mCornerShadowPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mCornerRadius = (int) (f8 + 0.5f);
        this.mCardBounds = new RectF();
        Paint paint2 = new Paint(this.mCornerShadowPaint);
        this.mEdgeShadowPaint = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f9, f10);
    }

    private void buildComponents(Rect rect) {
        float f8 = this.mRawMaxShadowSize;
        float f9 = SHADOW_MULTIPLIER * f8;
        this.mCardBounds.set(rect.left + f8, rect.top + f9, rect.right - f8, rect.bottom - f9);
        buildShadowCorners();
    }

    private void buildShadowCorners() {
        float f8 = this.mCornerRadius;
        RectF rectF = new RectF(-f8, -f8, f8, f8);
        RectF rectF2 = new RectF(rectF);
        float f9 = this.mShadowSize;
        rectF2.inset(-f9, -f9);
        Path path = this.mCornerShadowPath;
        if (path == null) {
            this.mCornerShadowPath = new Path();
        } else {
            path.reset();
        }
        this.mCornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
        this.mCornerShadowPath.moveTo(-this.mCornerRadius, 0.0f);
        this.mCornerShadowPath.rLineTo(-this.mShadowSize, 0.0f);
        this.mCornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.mCornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.mCornerShadowPath.close();
        float f10 = this.mCornerRadius;
        float f11 = f10 / (this.mShadowSize + f10);
        Paint paint = this.mCornerShadowPaint;
        float f12 = this.mCornerRadius + this.mShadowSize;
        int i8 = this.mShadowStartColor;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f12, new int[]{i8, i8, this.mShadowEndColor}, new float[]{0.0f, f11, 1.0f}, tileMode));
        Paint paint2 = this.mEdgeShadowPaint;
        float f13 = this.mCornerRadius;
        float f14 = this.mShadowSize;
        float f15 = (-f13) + f14;
        float f16 = (-f13) - f14;
        int i9 = this.mShadowStartColor;
        paint2.setShader(new LinearGradient(0.0f, f15, 0.0f, f16, new int[]{i9, i9, this.mShadowEndColor}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.mEdgeShadowPaint.setAntiAlias(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float calculateHorizontalPadding(float f8, float f9, boolean z8) {
        if (z8) {
            return (float) (f8 + ((1.0d - COS_45) * f9));
        }
        return f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float calculateVerticalPadding(float f8, float f9, boolean z8) {
        if (z8) {
            return (float) ((f8 * SHADOW_MULTIPLIER) + ((1.0d - COS_45) * f9));
        }
        return f8 * SHADOW_MULTIPLIER;
    }

    private void drawShadow(Canvas canvas) {
        boolean z8;
        boolean z9;
        float f8 = this.mCornerRadius;
        float f9 = (-f8) - this.mShadowSize;
        float f10 = f8 + this.mInsetShadow + (this.mRawShadowSize / 2.0f);
        float f11 = f10 * 2.0f;
        if (this.mCardBounds.width() - f11 > 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.mCardBounds.height() - f11 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        int save = canvas.save();
        RectF rectF = this.mCardBounds;
        canvas.translate(rectF.left + f10, rectF.top + f10);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z8) {
            canvas.drawRect(0.0f, f9, this.mCardBounds.width() - f11, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.mCardBounds;
        canvas.translate(rectF2.right - f10, rectF2.bottom - f10);
        canvas.rotate(180.0f);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z8) {
            canvas.drawRect(0.0f, f9, this.mCardBounds.width() - f11, (-this.mCornerRadius) + this.mShadowSize, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.mCardBounds;
        canvas.translate(rectF3.left + f10, rectF3.bottom - f10);
        canvas.rotate(270.0f);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z9) {
            canvas.drawRect(0.0f, f9, this.mCardBounds.height() - f11, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.mCardBounds;
        canvas.translate(rectF4.right - f10, rectF4.top + f10);
        canvas.rotate(90.0f);
        canvas.drawPath(this.mCornerShadowPath, this.mCornerShadowPaint);
        if (z9) {
            canvas.drawRect(0.0f, f9, this.mCardBounds.height() - f11, -this.mCornerRadius, this.mEdgeShadowPaint);
        }
        canvas.restoreToCount(save4);
    }

    private void setBackground(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.mBackground = colorStateList;
        this.mPaint.setColor(colorStateList.getColorForState(getState(), this.mBackground.getDefaultColor()));
    }

    private void setShadowSize(float f8, float f9) {
        if (f8 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f8 + ". Must be >= 0");
        }
        if (f9 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f9 + ". Must be >= 0");
        }
        float even = toEven(f8);
        float even2 = toEven(f9);
        if (even > even2) {
            if (!this.mPrintedShadowClipWarning) {
                this.mPrintedShadowClipWarning = true;
            }
            even = even2;
        }
        if (this.mRawShadowSize == even && this.mRawMaxShadowSize == even2) {
            return;
        }
        this.mRawShadowSize = even;
        this.mRawMaxShadowSize = even2;
        this.mShadowSize = (int) ((even * SHADOW_MULTIPLIER) + this.mInsetShadow + 0.5f);
        this.mDirty = true;
        invalidateSelf();
    }

    private int toEven(float f8) {
        int i8 = (int) (f8 + 0.5f);
        if (i8 % 2 == 1) {
            return i8 - 1;
        }
        return i8;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mDirty) {
            buildComponents(getBounds());
            this.mDirty = false;
        }
        canvas.translate(0.0f, this.mRawShadowSize / 2.0f);
        drawShadow(canvas);
        canvas.translate(0.0f, (-this.mRawShadowSize) / 2.0f);
        sRoundRectHelper.drawRoundRect(canvas, this.mCardBounds, this.mCornerRadius, this.mPaint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList getColor() {
        return this.mBackground;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCornerRadius() {
        return this.mCornerRadius;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getMaxShadowAndCornerPadding(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getMaxShadowSize() {
        return this.mRawMaxShadowSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getMinHeight() {
        float f8 = this.mRawMaxShadowSize;
        return (Math.max(f8, this.mCornerRadius + this.mInsetShadow + ((f8 * SHADOW_MULTIPLIER) / 2.0f)) * 2.0f) + (((this.mRawMaxShadowSize * SHADOW_MULTIPLIER) + this.mInsetShadow) * 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getMinWidth() {
        float f8 = this.mRawMaxShadowSize;
        return (Math.max(f8, this.mCornerRadius + this.mInsetShadow + (f8 / 2.0f)) * 2.0f) + ((this.mRawMaxShadowSize + this.mInsetShadow) * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(calculateVerticalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
        int ceil2 = (int) Math.ceil(calculateHorizontalPadding(this.mRawMaxShadowSize, this.mCornerRadius, this.mAddPaddingForCorners));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getShadowSize() {
        return this.mRawShadowSize;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.mBackground;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mDirty = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.mBackground;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.mPaint.getColor() == colorForState) {
            return false;
        }
        this.mPaint.setColor(colorForState);
        this.mDirty = true;
        invalidateSelf();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAddPaddingForCorners(boolean z8) {
        this.mAddPaddingForCorners = z8;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.mPaint.setAlpha(i8);
        this.mCornerShadowPaint.setAlpha(i8);
        this.mEdgeShadowPaint.setAlpha(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setColor(@Nullable ColorStateList colorStateList) {
        setBackground(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCornerRadius(float f8) {
        if (f8 >= 0.0f) {
            float f9 = (int) (f8 + 0.5f);
            if (this.mCornerRadius == f9) {
                return;
            }
            this.mCornerRadius = f9;
            this.mDirty = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f8 + ". Must be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxShadowSize(float f8) {
        setShadowSize(this.mRawShadowSize, f8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShadowSize(float f8) {
        setShadowSize(f8, this.mRawMaxShadowSize);
    }
}
