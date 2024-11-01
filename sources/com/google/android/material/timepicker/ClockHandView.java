package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 200;
    private boolean animatingOnTouchUp;
    private final int animationDuration;
    private final TimeInterpolator animationInterpolator;
    private final float centerDotRadius;
    private boolean changedDuringTouch;
    private int circleRadius;
    private int currentLevel;
    private double degRad;
    private float downX;
    private float downY;
    private boolean isInTapRegion;
    private boolean isMultiLevel;
    private final List<OnRotateListener> listeners;
    private OnActionUpListener onActionUpListener;
    private float originalDeg;
    private final Paint paint;
    private final ValueAnimator rotationAnimator;
    private final int scaledTouchSlop;
    private final RectF selectorBox;
    private final int selectorRadius;

    @Px
    private final int selectorStrokeWidth;

    /* loaded from: classes3.dex */
    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = 0.0d, to = 360.0d) float f8, boolean z8);
    }

    /* loaded from: classes3.dex */
    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0d, to = 360.0d) float f8, boolean z8);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    private void adjustLevel(float f8, float f9) {
        int i8 = 2;
        if (MathUtils.dist(getWidth() / 2, getHeight() / 2, f8, f9) > getLeveledCircleRadius(2) + ViewUtils.dpToPx(getContext(), 12)) {
            i8 = 1;
        }
        this.currentLevel = i8;
    }

    private void drawSelector(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f8 = width;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = (((float) Math.cos(this.degRad)) * leveledCircleRadius) + f8;
        float f9 = height;
        float sin = (leveledCircleRadius * ((float) Math.sin(this.degRad))) + f9;
        this.paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.selectorRadius, this.paint);
        double sin2 = Math.sin(this.degRad);
        double cos2 = Math.cos(this.degRad);
        this.paint.setStrokeWidth(this.selectorStrokeWidth);
        canvas.drawLine(f8, f9, width + ((int) (cos2 * r7)), height + ((int) (r7 * sin2)), this.paint);
        canvas.drawCircle(f8, f9, this.centerDotRadius, this.paint);
    }

    private int getDegreesFromXY(float f8, float f9) {
        int degrees = (int) Math.toDegrees(Math.atan2(f9 - (getHeight() / 2), f8 - (getWidth() / 2)));
        int i8 = degrees + 90;
        if (i8 < 0) {
            return degrees + 450;
        }
        return i8;
    }

    @Dimension
    private int getLeveledCircleRadius(int i8) {
        if (i8 == 2) {
            return Math.round(this.circleRadius * 0.66f);
        }
        return this.circleRadius;
    }

    private Pair<Float, Float> getValuesForAnimation(float f8) {
        float handRotation = getHandRotation();
        if (Math.abs(handRotation - f8) > 180.0f) {
            if (handRotation > 180.0f && f8 < 180.0f) {
                f8 += 360.0f;
            }
            if (handRotation < 180.0f && f8 > 180.0f) {
                handRotation += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(handRotation), Float.valueOf(f8));
    }

    private boolean handleTouchInput(float f8, float f9, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        float degreesFromXY = getDegreesFromXY(f8, f9);
        boolean z12 = false;
        if (getHandRotation() != degreesFromXY) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 && z11) {
            return true;
        }
        if (!z11 && !z8) {
            return false;
        }
        if (z10 && this.animatingOnTouchUp) {
            z12 = true;
        }
        setHandRotation(degreesFromXY, z12);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setHandRotation$0(ValueAnimator valueAnimator) {
        setHandRotationInternal(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void setHandRotationInternal(@FloatRange(from = 0.0d, to = 360.0d) float f8, boolean z8) {
        float f9 = f8 % 360.0f;
        this.originalDeg = f9;
        this.degRad = Math.toRadians(f9 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float leveledCircleRadius = getLeveledCircleRadius(this.currentLevel);
        float cos = width + (((float) Math.cos(this.degRad)) * leveledCircleRadius);
        float sin = height + (leveledCircleRadius * ((float) Math.sin(this.degRad)));
        RectF rectF = this.selectorBox;
        int i8 = this.selectorRadius;
        rectF.set(cos - i8, sin - i8, cos + i8, sin + i8);
        Iterator<OnRotateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRotate(f9, z8);
        }
        invalidate();
    }

    public void addOnRotateListener(OnRotateListener onRotateListener) {
        this.listeners.add(onRotateListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCurrentLevel() {
        return this.currentLevel;
    }

    public RectF getCurrentSelectorBox() {
        return this.selectorBox;
    }

    @FloatRange(from = 0.0d, to = 360.0d)
    public float getHandRotation() {
        return this.originalDeg;
    }

    public int getSelectorRadius() {
        return this.selectorRadius;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSelector(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        if (!this.rotationAnimator.isRunning()) {
            setHandRotation(getHandRotation());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z9;
        boolean z10;
        OnActionUpListener onActionUpListener;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x8 = motionEvent.getX();
        float y8 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z8 = false;
                z9 = false;
            } else {
                int i8 = (int) (x8 - this.downX);
                int i9 = (int) (y8 - this.downY);
                if ((i8 * i8) + (i9 * i9) > this.scaledTouchSlop) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.isInTapRegion = z11;
                boolean z12 = this.changedDuringTouch;
                if (actionMasked == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (this.isMultiLevel) {
                    adjustLevel(x8, y8);
                }
                z9 = z12;
            }
            z10 = false;
        } else {
            this.downX = x8;
            this.downY = y8;
            this.isInTapRegion = true;
            this.changedDuringTouch = false;
            z8 = false;
            z9 = false;
            z10 = true;
        }
        boolean handleTouchInput = handleTouchInput(x8, y8, z9, z10, z8) | this.changedDuringTouch;
        this.changedDuringTouch = handleTouchInput;
        if (handleTouchInput && z8 && (onActionUpListener = this.onActionUpListener) != null) {
            onActionUpListener.onActionUp(getDegreesFromXY(x8, y8), this.isInTapRegion);
        }
        return true;
    }

    public void setAnimateOnTouchUp(boolean z8) {
        this.animatingOnTouchUp = z8;
    }

    public void setCircleRadius(@Dimension int i8) {
        this.circleRadius = i8;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCurrentLevel(int i8) {
        this.currentLevel = i8;
        invalidate();
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f8) {
        setHandRotation(f8, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMultiLevel(boolean z8) {
        if (this.isMultiLevel && !z8) {
            this.currentLevel = 1;
        }
        this.isMultiLevel = z8;
        invalidate();
    }

    public void setOnActionUpListener(OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f8, boolean z8) {
        ValueAnimator valueAnimator = this.rotationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z8) {
            setHandRotationInternal(f8, false);
            return;
        }
        Pair<Float, Float> valuesForAnimation = getValuesForAnimation(f8);
        this.rotationAnimator.setFloatValues(((Float) valuesForAnimation.first).floatValue(), ((Float) valuesForAnimation.second).floatValue());
        this.rotationAnimator.setDuration(this.animationDuration);
        this.rotationAnimator.setInterpolator(this.animationInterpolator);
        this.rotationAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.this.lambda$setHandRotation$0(valueAnimator2);
            }
        });
        this.rotationAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.rotationAnimator.start();
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.rotationAnimator = new ValueAnimator();
        this.listeners = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.selectorBox = new RectF();
        this.currentLevel = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockHandView, i8, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.animationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationLong2, 200);
        this.animationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_materialCircleRadius, 0);
        this.selectorRadius = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ClockHandView_selectorSize, 0);
        this.selectorStrokeWidth = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.centerDotRadius = r7.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(R.styleable.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        this.scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }
}
