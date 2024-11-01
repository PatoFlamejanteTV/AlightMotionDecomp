package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes3.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    private float totalTrackLengthFraction;
    private float trackLength;
    private boolean useStrokeCap;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f8, float f9, @ColorInt int i8, @Px int i9, @Px int i10) {
        Paint.Cap cap;
        float clamp = MathUtils.clamp(f8, 0.0f, 1.0f);
        float clamp2 = MathUtils.clamp(f9, 0.0f, 1.0f);
        float lerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, clamp);
        float lerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, clamp2);
        int clamp3 = (int) ((i9 * MathUtils.clamp(lerp, 0.0f, 0.01f)) / 0.01f);
        int clamp4 = (int) ((i10 * (1.0f - MathUtils.clamp(lerp2, 0.99f, 1.0f))) / 0.01f);
        float f10 = this.trackLength;
        int i11 = (int) ((lerp * f10) + clamp3);
        int i12 = (int) ((lerp2 * f10) - clamp4);
        float f11 = (-f10) / 2.0f;
        if (i11 <= i12) {
            float f12 = this.displayedCornerRadius;
            float f13 = i11 + f12;
            float f14 = i12 - f12;
            float f15 = f12 * 2.0f;
            paint.setColor(i8);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            if (f13 >= f14) {
                drawRoundedBlock(canvas, paint, new PointF(f13 + f11, 0.0f), new PointF(f14 + f11, 0.0f), f15, this.displayedTrackThickness);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            if (this.useStrokeCap) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f16 = f13 + f11;
            float f17 = f14 + f11;
            canvas.drawLine(f16, 0.0f, f17, 0.0f, paint);
            if (!this.useStrokeCap && this.displayedCornerRadius > 0.0f) {
                paint.setStyle(Paint.Style.FILL);
                if (f13 > 0.0f) {
                    drawRoundedBlock(canvas, paint, new PointF(f16, 0.0f), f15, this.displayedTrackThickness);
                }
                if (f14 < this.trackLength) {
                    drawRoundedBlock(canvas, paint, new PointF(f17, 0.0f), f15, this.displayedTrackThickness);
                }
            }
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, float f8, float f9) {
        drawRoundedBlock(canvas, paint, pointF, null, f8, f9);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f8, boolean z8, boolean z9) {
        boolean z10;
        this.trackLength = rect.width();
        float f9 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - f9) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f10 = this.trackLength / 2.0f;
        float f11 = f9 / 2.0f;
        canvas.clipRect(-f10, -f11, f10, f11);
        S s8 = this.spec;
        if (((LinearProgressIndicatorSpec) s8).trackThickness / 2 == ((LinearProgressIndicatorSpec) s8).trackCornerRadius) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.useStrokeCap = z10;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s8).trackThickness * f8;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s8).trackThickness / 2, ((LinearProgressIndicatorSpec) s8).trackCornerRadius) * f8;
        if (z8 || z9) {
            if ((z8 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z9 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z8 || (z9 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (1.0f - f8)) / 2.0f);
            }
        }
        if (z9 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f8;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i8, @IntRange(from = 0, to = 255) int i9) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i8, i9);
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize > 0 && compositeARGBWithAlpha != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(compositeARGBWithAlpha);
            PointF pointF = new PointF((this.trackLength / 2.0f) - (this.displayedTrackThickness / 2.0f), 0.0f);
            S s8 = this.spec;
            drawRoundedBlock(canvas, paint, pointF, ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s8).trackStopIndicatorSize);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i8) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i8);
        float f8 = activeIndicator.startFraction;
        float f9 = activeIndicator.endFraction;
        int i9 = activeIndicator.gapSize;
        drawLine(canvas, paint, f8, f9, compositeARGBWithAlpha, i9, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f8, float f9, int i8, int i9, @Px int i10) {
        drawLine(canvas, paint, f8, f9, MaterialColors.compositeARGBWithAlpha(i8, i9), i10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, @Nullable PointF pointF2, float f8, float f9) {
        float min = Math.min(f9, this.displayedTrackThickness);
        float f10 = f8 / 2.0f;
        float min2 = Math.min(f10, (this.displayedCornerRadius * min) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f8) / 2.0f, (-min) / 2.0f, f10, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
