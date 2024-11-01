package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes3.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    private void drawArc(@NonNull Canvas canvas, @NonNull Paint paint, float f8, float f9, @ColorInt int i8, @Px int i9, @Px int i10) {
        float f10;
        Paint.Cap cap;
        if (f9 >= f8) {
            f10 = f9 - f8;
        } else {
            f10 = (f9 + 1.0f) - f8;
        }
        float f11 = f8 % 1.0f;
        if (this.totalTrackLengthFraction < 1.0f) {
            float f12 = f11 + f10;
            if (f12 > 1.0f) {
                drawArc(canvas, paint, f11, 1.0f, i8, i9, 0);
                drawArc(canvas, paint, 1.0f, f12, i8, 0, i10);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        if (f11 == 0.0f && f10 >= 0.99f) {
            f10 += ((f10 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float lerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f11);
        float lerp2 = MathUtils.lerp(0.0f, this.totalTrackLengthFraction, f10);
        float degrees2 = (float) Math.toDegrees(i9 / this.adjustedRadius);
        float degrees3 = ((lerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i10 / this.adjustedRadius));
        float f13 = (lerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i8);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f14 = degrees * 2.0f;
        if (degrees3 < f14) {
            float f15 = degrees3 / f14;
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, f13 + (degrees * f15), this.displayedCornerRadius * 2.0f, this.displayedTrackThickness, f15);
            return;
        }
        float f16 = this.adjustedRadius;
        RectF rectF = new RectF(-f16, -f16, f16, f16);
        paint.setStyle(Paint.Style.STROKE);
        if (this.useStrokeCap) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        float f17 = f13 + degrees;
        canvas.drawArc(rectF, f17, degrees3 - f14, false, paint);
        if (!this.useStrokeCap && this.displayedCornerRadius > 0.0f) {
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, f17, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
            drawRoundedBlock(canvas, paint, (f13 + degrees3) - degrees, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, float f8, float f9, float f10) {
        drawRoundedBlock(canvas, paint, f8, f9, f10, 1.0f);
    }

    private int getSize() {
        S s8 = this.spec;
        return ((CircularProgressIndicatorSpec) s8).indicatorSize + (((CircularProgressIndicatorSpec) s8).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f8, boolean z8, boolean z9) {
        boolean z10;
        float width = rect.width() / getPreferredWidth();
        float height = rect.height() / getPreferredHeight();
        S s8 = this.spec;
        float f9 = (((CircularProgressIndicatorSpec) s8).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s8).indicatorInset;
        canvas.translate((f9 * width) + rect.left, (f9 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f10 = -f9;
        canvas.clipRect(f10, f10, f9, f9);
        S s9 = this.spec;
        if (((CircularProgressIndicatorSpec) s9).trackThickness / 2 <= ((CircularProgressIndicatorSpec) s9).trackCornerRadius) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.useStrokeCap = z10;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s9).trackThickness * f8;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) s9).trackThickness / 2, ((CircularProgressIndicatorSpec) s9).trackCornerRadius) * f8;
        S s10 = this.spec;
        float f11 = (((CircularProgressIndicatorSpec) s10).indicatorSize - ((CircularProgressIndicatorSpec) s10).trackThickness) / 2.0f;
        this.adjustedRadius = f11;
        if (z8 || z9) {
            if ((z8 && ((CircularProgressIndicatorSpec) s10).showAnimationBehavior == 2) || (z9 && ((CircularProgressIndicatorSpec) s10).hideAnimationBehavior == 1)) {
                this.adjustedRadius = f11 + (((1.0f - f8) * ((CircularProgressIndicatorSpec) s10).trackThickness) / 2.0f);
            } else if ((z8 && ((CircularProgressIndicatorSpec) s10).showAnimationBehavior == 1) || (z9 && ((CircularProgressIndicatorSpec) s10).hideAnimationBehavior == 2)) {
                this.adjustedRadius = f11 - (((1.0f - f8) * ((CircularProgressIndicatorSpec) s10).trackThickness) / 2.0f);
            }
        }
        if (z9 && ((CircularProgressIndicatorSpec) s10).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f8;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, @IntRange(from = 0, to = 255) int i8) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i8);
        float f8 = activeIndicator.startFraction;
        float f9 = activeIndicator.endFraction;
        int i9 = activeIndicator.gapSize;
        drawArc(canvas, paint, f8, f9, compositeARGBWithAlpha, i9, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f8, float f9, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9, int i10) {
        drawArc(canvas, paint, f8, f9, MaterialColors.compositeARGBWithAlpha(i8, i9), i10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, float f8, float f9, float f10, float f11) {
        float min = (int) Math.min(f10, this.displayedTrackThickness);
        float f12 = f9 / 2.0f;
        float min2 = Math.min(f12, (this.displayedCornerRadius * min) / this.displayedTrackThickness);
        RectF rectF = new RectF((-min) / 2.0f, (-f9) / 2.0f, min / 2.0f, f12);
        canvas.save();
        double d8 = f8;
        canvas.translate((float) (this.adjustedRadius * Math.cos(Math.toRadians(d8))), (float) (this.adjustedRadius * Math.sin(Math.toRadians(d8))));
        canvas.rotate(f8);
        canvas.scale(f11, f11);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
