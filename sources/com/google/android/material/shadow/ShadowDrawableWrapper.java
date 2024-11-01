package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;

@Deprecated
/* loaded from: classes3.dex */
public class ShadowDrawableWrapper extends DrawableWrapperCompat {
    static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    static final float SHADOW_BOTTOM_SCALE = 1.0f;
    static final float SHADOW_HORIZ_SCALE = 0.5f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    static final float SHADOW_TOP_SCALE = 0.25f;
    private boolean addPaddingForCorners;

    @NonNull
    final RectF contentBounds;
    float cornerRadius;

    @NonNull
    final Paint cornerShadowPaint;
    Path cornerShadowPath;
    private boolean dirty;

    @NonNull
    final Paint edgeShadowPaint;
    float maxShadowSize;
    private boolean printedShadowClipWarning;
    float rawMaxShadowSize;
    float rawShadowSize;
    private float rotation;
    private final int shadowEndColor;
    private final int shadowMiddleColor;
    float shadowSize;
    private final int shadowStartColor;

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f8, float f9, float f10) {
        super(drawable);
        this.dirty = true;
        this.addPaddingForCorners = true;
        this.printedShadowClipWarning = false;
        this.shadowStartColor = ContextCompat.getColor(context, R.color.design_fab_shadow_start_color);
        this.shadowMiddleColor = ContextCompat.getColor(context, R.color.design_fab_shadow_mid_color);
        this.shadowEndColor = ContextCompat.getColor(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.cornerShadowPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.cornerRadius = Math.round(f8);
        this.contentBounds = new RectF();
        Paint paint2 = new Paint(paint);
        this.edgeShadowPaint = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f9, f10);
    }

    private void buildComponents(@NonNull Rect rect) {
        float f8 = this.rawMaxShadowSize;
        float f9 = SHADOW_MULTIPLIER * f8;
        this.contentBounds.set(rect.left + f8, rect.top + f9, rect.right - f8, rect.bottom - f9);
        Drawable drawable = getDrawable();
        RectF rectF = this.contentBounds;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        buildShadowCorners();
    }

    private void buildShadowCorners() {
        float f8 = this.cornerRadius;
        RectF rectF = new RectF(-f8, -f8, f8, f8);
        RectF rectF2 = new RectF(rectF);
        float f9 = this.shadowSize;
        rectF2.inset(-f9, -f9);
        Path path = this.cornerShadowPath;
        if (path == null) {
            this.cornerShadowPath = new Path();
        } else {
            path.reset();
        }
        this.cornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
        this.cornerShadowPath.moveTo(-this.cornerRadius, 0.0f);
        this.cornerShadowPath.rLineTo(-this.shadowSize, 0.0f);
        this.cornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.cornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.cornerShadowPath.close();
        float f10 = -rectF2.top;
        if (f10 > 0.0f) {
            float f11 = this.cornerRadius / f10;
            this.cornerShadowPaint.setShader(new RadialGradient(0.0f, 0.0f, f10, new int[]{0, this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, f11, ((1.0f - f11) / 2.0f) + f11, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.edgeShadowPaint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.edgeShadowPaint.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float f8, float f9, boolean z8) {
        if (z8) {
            return (float) (f8 + ((1.0d - COS_45) * f9));
        }
        return f8;
    }

    public static float calculateVerticalPadding(float f8, float f9, boolean z8) {
        if (z8) {
            return (float) ((f8 * SHADOW_MULTIPLIER) + ((1.0d - COS_45) * f9));
        }
        return f8 * SHADOW_MULTIPLIER;
    }

    private void drawShadow(@NonNull Canvas canvas) {
        boolean z8;
        boolean z9;
        int i8;
        float f8;
        int i9;
        float f9;
        float f10;
        float f11;
        int save = canvas.save();
        canvas.rotate(this.rotation, this.contentBounds.centerX(), this.contentBounds.centerY());
        float f12 = this.cornerRadius;
        float f13 = (-f12) - this.shadowSize;
        float f14 = f12 * 2.0f;
        if (this.contentBounds.width() - f14 > 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.contentBounds.height() - f14 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f15 = this.rawShadowSize;
        float f16 = f12 / ((f15 - (0.5f * f15)) + f12);
        float f17 = f12 / ((f15 - (SHADOW_TOP_SCALE * f15)) + f12);
        float f18 = f12 / ((f15 - (f15 * 1.0f)) + f12);
        int save2 = canvas.save();
        RectF rectF = this.contentBounds;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.scale(f16, f17);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z8) {
            canvas.scale(1.0f / f16, 1.0f);
            i8 = save2;
            f8 = f18;
            i9 = save;
            f9 = f17;
            canvas.drawRect(0.0f, f13, this.contentBounds.width() - f14, -this.cornerRadius, this.edgeShadowPaint);
        } else {
            i8 = save2;
            f8 = f18;
            i9 = save;
            f9 = f17;
        }
        canvas.restoreToCount(i8);
        int save3 = canvas.save();
        RectF rectF2 = this.contentBounds;
        canvas.translate(rectF2.right - f12, rectF2.bottom - f12);
        float f19 = f8;
        canvas.scale(f16, f19);
        canvas.rotate(180.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z8) {
            canvas.scale(1.0f / f16, 1.0f);
            f10 = f9;
            f11 = f19;
            canvas.drawRect(0.0f, f13, this.contentBounds.width() - f14, (-this.cornerRadius) + this.shadowSize, this.edgeShadowPaint);
        } else {
            f10 = f9;
            f11 = f19;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.contentBounds;
        canvas.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas.scale(f16, f11);
        canvas.rotate(270.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z9) {
            canvas.scale(1.0f / f11, 1.0f);
            canvas.drawRect(0.0f, f13, this.contentBounds.height() - f14, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.contentBounds;
        canvas.translate(rectF4.right - f12, rectF4.top + f12);
        float f20 = f10;
        canvas.scale(f16, f20);
        canvas.rotate(90.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z9) {
            canvas.scale(1.0f / f20, 1.0f);
            canvas.drawRect(0.0f, f13, this.contentBounds.height() - f14, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i9);
    }

    private static int toEven(float f8) {
        int round = Math.round(f8);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.dirty) {
            buildComponents(getBounds());
            this.dirty = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getMinHeight() {
        float f8 = this.rawMaxShadowSize;
        return (Math.max(f8, this.cornerRadius + ((f8 * SHADOW_MULTIPLIER) / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * SHADOW_MULTIPLIER * 2.0f);
    }

    public float getMinWidth() {
        float f8 = this.rawMaxShadowSize;
        return (Math.max(f8, this.cornerRadius + (f8 / 2.0f)) * 2.0f) + (this.rawMaxShadowSize * 2.0f);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        int ceil = (int) Math.ceil(calculateVerticalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        int ceil2 = (int) Math.ceil(calculateHorizontalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.dirty = true;
    }

    public void setAddPaddingForCorners(boolean z8) {
        this.addPaddingForCorners = z8;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        super.setAlpha(i8);
        this.cornerShadowPaint.setAlpha(i8);
        this.edgeShadowPaint.setAlpha(i8);
    }

    public void setCornerRadius(float f8) {
        float round = Math.round(f8);
        if (this.cornerRadius == round) {
            return;
        }
        this.cornerRadius = round;
        this.dirty = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f8) {
        setShadowSize(this.rawShadowSize, f8);
    }

    public final void setRotation(float f8) {
        if (this.rotation != f8) {
            this.rotation = f8;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f8, float f9) {
        if (f8 >= 0.0f && f9 >= 0.0f) {
            float even = toEven(f8);
            float even2 = toEven(f9);
            if (even > even2) {
                if (!this.printedShadowClipWarning) {
                    this.printedShadowClipWarning = true;
                }
                even = even2;
            }
            if (this.rawShadowSize == even && this.rawMaxShadowSize == even2) {
                return;
            }
            this.rawShadowSize = even;
            this.rawMaxShadowSize = even2;
            this.shadowSize = Math.round(even * SHADOW_MULTIPLIER);
            this.maxShadowSize = even2;
            this.dirty = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("invalid shadow size");
    }

    public void setShadowSize(float f8) {
        setShadowSize(f8, this.rawMaxShadowSize);
    }
}
