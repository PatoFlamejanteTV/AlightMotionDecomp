package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class CircularProgressDrawable extends Drawable implements Animatable {
    private static final int ANIMATION_DURATION = 1332;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 7.5f;
    private static final float CENTER_RADIUS_LARGE = 11.0f;
    private static final float COLOR_CHANGE_OFFSET = 0.75f;
    public static final int DEFAULT = 1;
    private static final float GROUP_FULL_ROTATION = 216.0f;
    public static final int LARGE = 0;
    private static final float MAX_PROGRESS_ARC = 0.8f;
    private static final float MIN_PROGRESS_ARC = 0.01f;
    private static final float RING_ROTATION = 0.20999998f;
    private static final float SHRINK_OFFSET = 0.5f;
    private static final float STROKE_WIDTH = 2.5f;
    private static final float STROKE_WIDTH_LARGE = 3.0f;
    private Animator mAnimator;
    boolean mFinishing;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    float mRotationCount;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
    private static final int[] COLORS = {ViewCompat.MEASURED_STATE_MASK};

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface ProgressDrawableSize {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Ring {
        int mAlpha;
        Path mArrow;
        int mArrowHeight;
        final Paint mArrowPaint;
        float mArrowScale;
        int mArrowWidth;
        final Paint mCirclePaint;
        int mColorIndex;
        int[] mColors;
        int mCurrentColor;
        float mEndTrim;
        final Paint mPaint;
        float mRingCenterRadius;
        float mRotation;
        boolean mShowArrow;
        float mStartTrim;
        float mStartingEndTrim;
        float mStartingRotation;
        float mStartingStartTrim;
        float mStrokeWidth;
        final RectF mTempBounds = new RectF();

        Ring() {
            Paint paint = new Paint();
            this.mPaint = paint;
            Paint paint2 = new Paint();
            this.mArrowPaint = paint2;
            Paint paint3 = new Paint();
            this.mCirclePaint = paint3;
            this.mStartTrim = 0.0f;
            this.mEndTrim = 0.0f;
            this.mRotation = 0.0f;
            this.mStrokeWidth = 5.0f;
            this.mArrowScale = 1.0f;
            this.mAlpha = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void draw(Canvas canvas, Rect rect) {
            RectF rectF = this.mTempBounds;
            float f8 = this.mRingCenterRadius;
            float f9 = (this.mStrokeWidth / 2.0f) + f8;
            if (f8 <= 0.0f) {
                f9 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.mArrowWidth * this.mArrowScale) / 2.0f, this.mStrokeWidth / 2.0f);
            }
            rectF.set(rect.centerX() - f9, rect.centerY() - f9, rect.centerX() + f9, rect.centerY() + f9);
            float f10 = this.mStartTrim;
            float f11 = this.mRotation;
            float f12 = (f10 + f11) * 360.0f;
            float f13 = ((this.mEndTrim + f11) * 360.0f) - f12;
            this.mPaint.setColor(this.mCurrentColor);
            this.mPaint.setAlpha(this.mAlpha);
            float f14 = this.mStrokeWidth / 2.0f;
            rectF.inset(f14, f14);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.mCirclePaint);
            float f15 = -f14;
            rectF.inset(f15, f15);
            canvas.drawArc(rectF, f12, f13, false, this.mPaint);
            drawTriangle(canvas, f12, f13, rectF);
        }

        void drawTriangle(Canvas canvas, float f8, float f9, RectF rectF) {
            if (this.mShowArrow) {
                Path path = this.mArrow;
                if (path == null) {
                    Path path2 = new Path();
                    this.mArrow = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f10 = (this.mArrowWidth * this.mArrowScale) / 2.0f;
                this.mArrow.moveTo(0.0f, 0.0f);
                this.mArrow.lineTo(this.mArrowWidth * this.mArrowScale, 0.0f);
                Path path3 = this.mArrow;
                float f11 = this.mArrowWidth;
                float f12 = this.mArrowScale;
                path3.lineTo((f11 * f12) / 2.0f, this.mArrowHeight * f12);
                this.mArrow.offset((min + rectF.centerX()) - f10, rectF.centerY() + (this.mStrokeWidth / 2.0f));
                this.mArrow.close();
                this.mArrowPaint.setColor(this.mCurrentColor);
                this.mArrowPaint.setAlpha(this.mAlpha);
                canvas.save();
                canvas.rotate(f8 + f9, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.mArrow, this.mArrowPaint);
                canvas.restore();
            }
        }

        int getAlpha() {
            return this.mAlpha;
        }

        float getArrowHeight() {
            return this.mArrowHeight;
        }

        float getArrowScale() {
            return this.mArrowScale;
        }

        float getArrowWidth() {
            return this.mArrowWidth;
        }

        int getBackgroundColor() {
            return this.mCirclePaint.getColor();
        }

        float getCenterRadius() {
            return this.mRingCenterRadius;
        }

        int[] getColors() {
            return this.mColors;
        }

        float getEndTrim() {
            return this.mEndTrim;
        }

        int getNextColor() {
            return this.mColors[getNextColorIndex()];
        }

        int getNextColorIndex() {
            return (this.mColorIndex + 1) % this.mColors.length;
        }

        float getRotation() {
            return this.mRotation;
        }

        boolean getShowArrow() {
            return this.mShowArrow;
        }

        float getStartTrim() {
            return this.mStartTrim;
        }

        int getStartingColor() {
            return this.mColors[this.mColorIndex];
        }

        float getStartingEndTrim() {
            return this.mStartingEndTrim;
        }

        float getStartingRotation() {
            return this.mStartingRotation;
        }

        float getStartingStartTrim() {
            return this.mStartingStartTrim;
        }

        Paint.Cap getStrokeCap() {
            return this.mPaint.getStrokeCap();
        }

        float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        void goToNextColor() {
            setColorIndex(getNextColorIndex());
        }

        void resetOriginals() {
            this.mStartingStartTrim = 0.0f;
            this.mStartingEndTrim = 0.0f;
            this.mStartingRotation = 0.0f;
            setStartTrim(0.0f);
            setEndTrim(0.0f);
            setRotation(0.0f);
        }

        void setAlpha(int i8) {
            this.mAlpha = i8;
        }

        void setArrowDimensions(float f8, float f9) {
            this.mArrowWidth = (int) f8;
            this.mArrowHeight = (int) f9;
        }

        void setArrowScale(float f8) {
            if (f8 != this.mArrowScale) {
                this.mArrowScale = f8;
            }
        }

        void setBackgroundColor(int i8) {
            this.mCirclePaint.setColor(i8);
        }

        void setCenterRadius(float f8) {
            this.mRingCenterRadius = f8;
        }

        void setColor(int i8) {
            this.mCurrentColor = i8;
        }

        void setColorFilter(ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
        }

        void setColorIndex(int i8) {
            this.mColorIndex = i8;
            this.mCurrentColor = this.mColors[i8];
        }

        void setColors(@NonNull int[] iArr) {
            this.mColors = iArr;
            setColorIndex(0);
        }

        void setEndTrim(float f8) {
            this.mEndTrim = f8;
        }

        void setRotation(float f8) {
            this.mRotation = f8;
        }

        void setShowArrow(boolean z8) {
            if (this.mShowArrow != z8) {
                this.mShowArrow = z8;
            }
        }

        void setStartTrim(float f8) {
            this.mStartTrim = f8;
        }

        void setStrokeCap(Paint.Cap cap) {
            this.mPaint.setStrokeCap(cap);
        }

        void setStrokeWidth(float f8) {
            this.mStrokeWidth = f8;
            this.mPaint.setStrokeWidth(f8);
        }

        void storeOriginals() {
            this.mStartingStartTrim = this.mStartTrim;
            this.mStartingEndTrim = this.mEndTrim;
            this.mStartingRotation = this.mRotation;
        }
    }

    public CircularProgressDrawable(@NonNull Context context) {
        this.mResources = ((Context) Preconditions.checkNotNull(context)).getResources();
        Ring ring = new Ring();
        this.mRing = ring;
        ring.setColors(COLORS);
        setStrokeWidth(STROKE_WIDTH);
        setupAnimators();
    }

    private void applyFinishTranslation(float f8, Ring ring) {
        updateRingColor(f8, ring);
        float floor = (float) (Math.floor(ring.getStartingRotation() / MAX_PROGRESS_ARC) + 1.0d);
        ring.setStartTrim(ring.getStartingStartTrim() + (((ring.getStartingEndTrim() - 0.01f) - ring.getStartingStartTrim()) * f8));
        ring.setEndTrim(ring.getStartingEndTrim());
        ring.setRotation(ring.getStartingRotation() + ((floor - ring.getStartingRotation()) * f8));
    }

    private int evaluateColorChange(float f8, int i8, int i9) {
        return ((((i8 >> 24) & 255) + ((int) ((((i9 >> 24) & 255) - r0) * f8))) << 24) | ((((i8 >> 16) & 255) + ((int) ((((i9 >> 16) & 255) - r1) * f8))) << 16) | ((((i8 >> 8) & 255) + ((int) ((((i9 >> 8) & 255) - r2) * f8))) << 8) | ((i8 & 255) + ((int) (f8 * ((i9 & 255) - r8))));
    }

    private float getRotation() {
        return this.mRotation;
    }

    private void setRotation(float f8) {
        this.mRotation = f8;
    }

    private void setSizeParameters(float f8, float f9, float f10, float f11) {
        Ring ring = this.mRing;
        float f12 = this.mResources.getDisplayMetrics().density;
        ring.setStrokeWidth(f9 * f12);
        ring.setCenterRadius(f8 * f12);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f10 * f12, f11 * f12);
    }

    private void setupAnimators() {
        final Ring ring = this.mRing;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable.this.updateRingColor(floatValue, ring);
                CircularProgressDrawable.this.applyTransformation(floatValue, ring, false);
                CircularProgressDrawable.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(LINEAR_INTERPOLATOR);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                CircularProgressDrawable.this.applyTransformation(1.0f, ring, true);
                ring.storeOriginals();
                ring.goToNextColor();
                CircularProgressDrawable circularProgressDrawable = CircularProgressDrawable.this;
                if (circularProgressDrawable.mFinishing) {
                    circularProgressDrawable.mFinishing = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    ring.setShowArrow(false);
                    return;
                }
                circularProgressDrawable.mRotationCount += 1.0f;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                CircularProgressDrawable.this.mRotationCount = 0.0f;
            }
        });
        this.mAnimator = ofFloat;
    }

    void applyTransformation(float f8, Ring ring, boolean z8) {
        float interpolation;
        float f9;
        if (this.mFinishing) {
            applyFinishTranslation(f8, ring);
            return;
        }
        if (f8 != 1.0f || z8) {
            float startingRotation = ring.getStartingRotation();
            if (f8 < 0.5f) {
                interpolation = ring.getStartingStartTrim();
                f9 = (MATERIAL_INTERPOLATOR.getInterpolation(f8 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float startingStartTrim = ring.getStartingStartTrim() + 0.79f;
                interpolation = startingStartTrim - (((1.0f - MATERIAL_INTERPOLATOR.getInterpolation((f8 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f9 = startingStartTrim;
            }
            float f10 = startingRotation + (RING_ROTATION * f8);
            float f11 = (f8 + this.mRotationCount) * GROUP_FULL_ROTATION;
            ring.setStartTrim(interpolation);
            ring.setEndTrim(f9);
            ring.setRotation(f10);
            setRotation(f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.mRing.draw(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mRing.getAlpha();
    }

    public boolean getArrowEnabled() {
        return this.mRing.getShowArrow();
    }

    public float getArrowHeight() {
        return this.mRing.getArrowHeight();
    }

    public float getArrowScale() {
        return this.mRing.getArrowScale();
    }

    public float getArrowWidth() {
        return this.mRing.getArrowWidth();
    }

    public int getBackgroundColor() {
        return this.mRing.getBackgroundColor();
    }

    public float getCenterRadius() {
        return this.mRing.getCenterRadius();
    }

    @NonNull
    public int[] getColorSchemeColors() {
        return this.mRing.getColors();
    }

    public float getEndTrim() {
        return this.mRing.getEndTrim();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getProgressRotation() {
        return this.mRing.getRotation();
    }

    public float getStartTrim() {
        return this.mRing.getStartTrim();
    }

    @NonNull
    public Paint.Cap getStrokeCap() {
        return this.mRing.getStrokeCap();
    }

    public float getStrokeWidth() {
        return this.mRing.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.mAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.mRing.setAlpha(i8);
        invalidateSelf();
    }

    public void setArrowDimensions(float f8, float f9) {
        this.mRing.setArrowDimensions(f8, f9);
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z8) {
        this.mRing.setShowArrow(z8);
        invalidateSelf();
    }

    public void setArrowScale(float f8) {
        this.mRing.setArrowScale(f8);
        invalidateSelf();
    }

    public void setBackgroundColor(int i8) {
        this.mRing.setBackgroundColor(i8);
        invalidateSelf();
    }

    public void setCenterRadius(float f8) {
        this.mRing.setCenterRadius(f8);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mRing.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(@NonNull int... iArr) {
        this.mRing.setColors(iArr);
        this.mRing.setColorIndex(0);
        invalidateSelf();
    }

    public void setProgressRotation(float f8) {
        this.mRing.setRotation(f8);
        invalidateSelf();
    }

    public void setStartEndTrim(float f8, float f9) {
        this.mRing.setStartTrim(f8);
        this.mRing.setEndTrim(f9);
        invalidateSelf();
    }

    public void setStrokeCap(@NonNull Paint.Cap cap) {
        this.mRing.setStrokeCap(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f8) {
        this.mRing.setStrokeWidth(f8);
        invalidateSelf();
    }

    public void setStyle(int i8) {
        if (i8 == 0) {
            setSizeParameters(CENTER_RADIUS_LARGE, STROKE_WIDTH_LARGE, 12.0f, 6.0f);
        } else {
            setSizeParameters(CENTER_RADIUS, STROKE_WIDTH, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.mAnimator.cancel();
        this.mRing.storeOriginals();
        if (this.mRing.getEndTrim() != this.mRing.getStartTrim()) {
            this.mFinishing = true;
            this.mAnimator.setDuration(666L);
            this.mAnimator.start();
        } else {
            this.mRing.setColorIndex(0);
            this.mRing.resetOriginals();
            this.mAnimator.setDuration(1332L);
            this.mAnimator.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.mAnimator.cancel();
        setRotation(0.0f);
        this.mRing.setShowArrow(false);
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        invalidateSelf();
    }

    void updateRingColor(float f8, Ring ring) {
        if (f8 > 0.75f) {
            ring.setColor(evaluateColorChange((f8 - 0.75f) / 0.25f, ring.getStartingColor(), ring.getNextColor()));
        } else {
            ring.setColor(ring.getStartingColor());
        }
    }
}
