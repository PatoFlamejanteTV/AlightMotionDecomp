package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FloatingActionButtonImpl {
    static final int ANIM_STATE_HIDING = 1;
    static final int ANIM_STATE_NONE = 0;
    static final int ANIM_STATE_SHOWING = 2;
    static final long ELEVATION_ANIM_DELAY = 100;
    static final long ELEVATION_ANIM_DURATION = 100;
    private static final float HIDE_ICON_SCALE = 0.4f;
    private static final float HIDE_OPACITY = 0.0f;
    private static final float HIDE_SCALE = 0.4f;
    static final float SHADOW_MULTIPLIER = 1.5f;
    private static final float SHOW_ICON_SCALE = 1.0f;
    private static final float SHOW_OPACITY = 1.0f;
    private static final float SHOW_SCALE = 1.0f;
    private static final float SPEC_HIDE_ICON_SCALE = 0.0f;
    private static final float SPEC_HIDE_SCALE = 0.0f;

    @Nullable
    BorderDrawable borderDrawable;

    @Nullable
    Drawable contentBackground;

    @Nullable
    private Animator currentAnimator;
    float elevation;
    boolean ensureMinTouchTargetSize;
    private ArrayList<Animator.AnimatorListener> hideListeners;

    @Nullable
    private MotionSpec hideMotionSpec;
    float hoveredFocusedTranslationZ;
    private int maxImageSize;
    int minTouchTargetSize;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    float pressedTranslationZ;

    @Nullable
    Drawable rippleDrawable;
    private float rotation;
    final ShadowViewDelegate shadowViewDelegate;

    @Nullable
    ShapeAppearanceModel shapeAppearance;

    @Nullable
    MaterialShapeDrawable shapeDrawable;
    private ArrayList<Animator.AnimatorListener> showListeners;

    @Nullable
    private MotionSpec showMotionSpec;

    @NonNull
    private final StateListAnimator stateListAnimator;
    private ArrayList<InternalTransformationCallback> transformationCallbacks;
    final FloatingActionButton view;
    static final TimeInterpolator ELEVATION_ANIM_INTERPOLATOR = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    private static final int SHOW_ANIM_DURATION_ATTR = R.attr.motionDurationLong2;
    private static final int SHOW_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
    private static final int HIDE_ANIM_DURATION_ATTR = R.attr.motionDurationMedium1;
    private static final int HIDE_ANIM_EASING_ATTR = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] PRESSED_ENABLED_STATE_SET = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] HOVERED_FOCUSED_ENABLED_STATE_SET = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] FOCUSED_ENABLED_STATE_SET = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] HOVERED_ENABLED_STATE_SET = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] ENABLED_STATE_SET = {android.R.attr.state_enabled};
    static final int[] EMPTY_STATE_SET = new int[0];
    boolean shadowPaddingEnabled = true;
    private float imageMatrixScale = 1.0f;
    private int animState = 0;
    private final Rect tmpRect = new Rect();
    private final RectF tmpRectF1 = new RectF();
    private final RectF tmpRectF2 = new RectF();
    private final Matrix tmpMatrix = new Matrix();

    /* loaded from: classes3.dex */
    private class DisabledElevationAnimation extends ShadowAnimatorImpl {
        DisabledElevationAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            return 0.0f;
        }
    }

    /* loaded from: classes3.dex */
    private class ElevateToHoveredFocusedTranslationZAnimation extends ShadowAnimatorImpl {
        ElevateToHoveredFocusedTranslationZAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            return floatingActionButtonImpl.elevation + floatingActionButtonImpl.hoveredFocusedTranslationZ;
        }
    }

    /* loaded from: classes3.dex */
    private class ElevateToPressedTranslationZAnimation extends ShadowAnimatorImpl {
        ElevateToPressedTranslationZAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            return floatingActionButtonImpl.elevation + floatingActionButtonImpl.pressedTranslationZ;
        }
    }

    /* loaded from: classes3.dex */
    interface InternalTransformationCallback {
        void onScaleChanged();

        void onTranslationChanged();
    }

    /* loaded from: classes3.dex */
    interface InternalVisibilityChangedListener {
        void onHidden();

        void onShown();
    }

    /* loaded from: classes3.dex */
    private class ResetElevationAnimation extends ShadowAnimatorImpl {
        ResetElevationAnimation() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.ShadowAnimatorImpl
        protected float getTargetShadowSize() {
            return FloatingActionButtonImpl.this.elevation;
        }
    }

    /* loaded from: classes3.dex */
    private abstract class ShadowAnimatorImpl extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private float shadowSizeEnd;
        private float shadowSizeStart;
        private boolean validValues;

        private ShadowAnimatorImpl() {
        }

        protected abstract float getTargetShadowSize();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FloatingActionButtonImpl.this.updateShapeElevation((int) this.shadowSizeEnd);
            this.validValues = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float elevation;
            if (!this.validValues) {
                MaterialShapeDrawable materialShapeDrawable = FloatingActionButtonImpl.this.shapeDrawable;
                if (materialShapeDrawable == null) {
                    elevation = 0.0f;
                } else {
                    elevation = materialShapeDrawable.getElevation();
                }
                this.shadowSizeStart = elevation;
                this.shadowSizeEnd = getTargetShadowSize();
                this.validValues = true;
            }
            FloatingActionButtonImpl floatingActionButtonImpl = FloatingActionButtonImpl.this;
            float f8 = this.shadowSizeStart;
            floatingActionButtonImpl.updateShapeElevation((int) (f8 + ((this.shadowSizeEnd - f8) * valueAnimator.getAnimatedFraction())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FloatingActionButtonImpl(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.view = floatingActionButton;
        this.shadowViewDelegate = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.stateListAnimator = stateListAnimator;
        stateListAnimator.addState(PRESSED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToPressedTranslationZAnimation()));
        stateListAnimator.addState(HOVERED_FOCUSED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(HOVERED_ENABLED_STATE_SET, createElevationAnimator(new ElevateToHoveredFocusedTranslationZAnimation()));
        stateListAnimator.addState(ENABLED_STATE_SET, createElevationAnimator(new ResetElevationAnimation()));
        stateListAnimator.addState(EMPTY_STATE_SET, createElevationAnimator(new DisabledElevationAnimation()));
        this.rotation = floatingActionButton.getRotation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateImageMatrixFromScale(float f8, @NonNull Matrix matrix) {
        matrix.reset();
        if (this.view.getDrawable() != null && this.maxImageSize != 0) {
            RectF rectF = this.tmpRectF1;
            RectF rectF2 = this.tmpRectF2;
            rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            int i8 = this.maxImageSize;
            rectF2.set(0.0f, 0.0f, i8, i8);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i9 = this.maxImageSize;
            matrix.postScale(f8, f8, i9 / 2.0f, i9 / 2.0f);
        }
    }

    @NonNull
    private AnimatorSet createAnimator(@NonNull MotionSpec motionSpec, float f8, float f9, float f10) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.ALPHA, f8);
        motionSpec.getTiming("opacity").apply(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.SCALE_X, f9);
        motionSpec.getTiming("scale").apply(ofFloat2);
        workAroundOreoBug(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.view, (Property<FloatingActionButton, Float>) View.SCALE_Y, f9);
        motionSpec.getTiming("scale").apply(ofFloat3);
        workAroundOreoBug(ofFloat3);
        arrayList.add(ofFloat3);
        calculateImageMatrixFromScale(f10, this.tmpMatrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.view, new ImageMatrixProperty(), new MatrixEvaluator() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
            public Matrix evaluate(float f11, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
                FloatingActionButtonImpl.this.imageMatrixScale = f11;
                return super.evaluate(f11, matrix, matrix2);
            }
        }, new Matrix(this.tmpMatrix));
        motionSpec.getTiming("iconScale").apply(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet createDefaultAnimator(final float f8, final float f9, final float f10, int i8, int i9) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.view.getAlpha();
        final float scaleX = this.view.getScaleX();
        final float scaleY = this.view.getScaleY();
        final float f11 = this.imageMatrixScale;
        final Matrix matrix = new Matrix(this.tmpMatrix);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButtonImpl.this.view.setAlpha(AnimationUtils.lerp(alpha, f8, 0.0f, 0.2f, floatValue));
                FloatingActionButtonImpl.this.view.setScaleX(AnimationUtils.lerp(scaleX, f9, floatValue));
                FloatingActionButtonImpl.this.view.setScaleY(AnimationUtils.lerp(scaleY, f9, floatValue));
                FloatingActionButtonImpl.this.imageMatrixScale = AnimationUtils.lerp(f11, f10, floatValue);
                FloatingActionButtonImpl.this.calculateImageMatrixFromScale(AnimationUtils.lerp(f11, f10, floatValue), matrix);
                FloatingActionButtonImpl.this.view.setImageMatrix(matrix);
            }
        });
        arrayList.add(ofFloat);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.resolveThemeDuration(this.view.getContext(), i8, this.view.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(this.view.getContext(), i9, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    @NonNull
    private ValueAnimator createElevationAnimator(@NonNull ShadowAnimatorImpl shadowAnimatorImpl) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(ELEVATION_ANIM_INTERPOLATOR);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(shadowAnimatorImpl);
        valueAnimator.addUpdateListener(shadowAnimatorImpl);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    @NonNull
    private ViewTreeObserver.OnPreDrawListener getOrCreatePreDrawListener() {
        if (this.preDrawListener == null) {
            this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.6
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    FloatingActionButtonImpl.this.onPreDraw();
                    return true;
                }
            };
        }
        return this.preDrawListener;
    }

    private boolean shouldAnimateVisibilityChange() {
        if (ViewCompat.isLaidOut(this.view) && !this.view.isInEditMode()) {
            return true;
        }
        return false;
    }

    private void workAroundOreoBug(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new TypeEvaluator<Float>() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.5
            FloatEvaluator floatEvaluator = new FloatEvaluator();

            @Override // android.animation.TypeEvaluator
            public Float evaluate(float f8, Float f9, Float f10) {
                float floatValue = this.floatEvaluator.evaluate(f8, (Number) f9, (Number) f10).floatValue();
                if (floatValue < 0.1f) {
                    floatValue = 0.0f;
                }
                return Float.valueOf(floatValue);
            }
        });
    }

    public void addOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.hideListeners == null) {
            this.hideListeners = new ArrayList<>();
        }
        this.hideListeners.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        if (this.showListeners == null) {
            this.showListeners = new ArrayList<>();
        }
        this.showListeners.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addTransformationCallback(@NonNull InternalTransformationCallback internalTransformationCallback) {
        if (this.transformationCallbacks == null) {
            this.transformationCallbacks = new ArrayList<>();
        }
        this.transformationCallbacks.add(internalTransformationCallback);
    }

    MaterialShapeDrawable createShapeDrawable() {
        return new MaterialShapeDrawable((ShapeAppearanceModel) Preconditions.checkNotNull(this.shapeAppearance));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final Drawable getContentBackground() {
        return this.contentBackground;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean getEnsureMinTouchTargetSize() {
        return this.ensureMinTouchTargetSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getHoveredFocusedTranslationZ() {
        return this.hoveredFocusedTranslationZ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getPadding(@NonNull Rect rect) {
        float f8;
        int touchTargetPadding = getTouchTargetPadding();
        if (this.shadowPaddingEnabled) {
            f8 = getElevation() + this.pressedTranslationZ;
        } else {
            f8 = 0.0f;
        }
        int max = Math.max(touchTargetPadding, (int) Math.ceil(f8));
        int max2 = Math.max(touchTargetPadding, (int) Math.ceil(f8 * SHADOW_MULTIPLIER));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getPressedTranslationZ() {
        return this.pressedTranslationZ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final ShapeAppearanceModel getShapeAppearance() {
        return this.shapeAppearance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public final MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getTouchTargetPadding() {
        if (!this.ensureMinTouchTargetSize) {
            return 0;
        }
        return Math.max((this.minTouchTargetSize - this.view.getSizeDimension()) / 2, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void hide(@Nullable final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z8) {
        int i8;
        AnimatorSet createDefaultAnimator;
        if (isOrWillBeHidden()) {
            return;
        }
        Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (shouldAnimateVisibilityChange()) {
            MotionSpec motionSpec = this.hideMotionSpec;
            if (motionSpec != null) {
                createDefaultAnimator = createAnimator(motionSpec, 0.0f, 0.0f, 0.0f);
            } else {
                createDefaultAnimator = createDefaultAnimator(0.0f, 0.4f, 0.4f, HIDE_ANIM_DURATION_ATTR, HIDE_ANIM_EASING_ATTR);
            }
            createDefaultAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.1
                private boolean cancelled;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator2) {
                    this.cancelled = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    int i9;
                    FloatingActionButtonImpl.this.animState = 0;
                    FloatingActionButtonImpl.this.currentAnimator = null;
                    if (!this.cancelled) {
                        FloatingActionButton floatingActionButton = FloatingActionButtonImpl.this.view;
                        boolean z9 = z8;
                        if (z9) {
                            i9 = 8;
                        } else {
                            i9 = 4;
                        }
                        floatingActionButton.internalSetVisibility(i9, z9);
                        InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                        if (internalVisibilityChangedListener2 != null) {
                            internalVisibilityChangedListener2.onHidden();
                        }
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    FloatingActionButtonImpl.this.view.internalSetVisibility(0, z8);
                    FloatingActionButtonImpl.this.animState = 1;
                    FloatingActionButtonImpl.this.currentAnimator = animator2;
                    this.cancelled = false;
                }
            });
            ArrayList<Animator.AnimatorListener> arrayList = this.hideListeners;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    createDefaultAnimator.addListener(it.next());
                }
            }
            createDefaultAnimator.start();
            return;
        }
        FloatingActionButton floatingActionButton = this.view;
        if (z8) {
            i8 = 8;
        } else {
            i8 = 4;
        }
        floatingActionButton.internalSetVisibility(i8, z8);
        if (internalVisibilityChangedListener != null) {
            internalVisibilityChangedListener.onHidden();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initializeBackgroundDrawable(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i8) {
        MaterialShapeDrawable createShapeDrawable = createShapeDrawable();
        this.shapeDrawable = createShapeDrawable;
        createShapeDrawable.setTintList(colorStateList);
        if (mode != null) {
            this.shapeDrawable.setTintMode(mode);
        }
        this.shapeDrawable.setShadowColor(-12303292);
        this.shapeDrawable.initializeElevationOverlay(this.view.getContext());
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.shapeDrawable.getShapeAppearanceModel());
        rippleDrawableCompat.setTintList(RippleUtils.sanitizeRippleDrawableColor(colorStateList2));
        this.rippleDrawable = rippleDrawableCompat;
        this.contentBackground = new LayerDrawable(new Drawable[]{(Drawable) Preconditions.checkNotNull(this.shapeDrawable), rippleDrawableCompat});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isOrWillBeHidden() {
        if (this.view.getVisibility() == 0) {
            if (this.animState != 1) {
                return false;
            }
            return true;
        }
        if (this.animState == 2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isOrWillBeShown() {
        if (this.view.getVisibility() != 0) {
            if (this.animState != 2) {
                return false;
            }
            return true;
        }
        if (this.animState == 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void jumpDrawableToCurrentState() {
        this.stateListAnimator.jumpToCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAttachedToWindow() {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.setParentAbsoluteElevation(this.view, materialShapeDrawable);
        }
        if (requirePreDrawListener()) {
            this.view.getViewTreeObserver().addOnPreDrawListener(getOrCreatePreDrawListener());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onCompatShadowChanged() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.view.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.preDrawListener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onDrawableStateChanged(int[] iArr) {
        this.stateListAnimator.setState(iArr);
    }

    void onElevationsChanged(float f8, float f9, float f10) {
        jumpDrawableToCurrentState();
        updatePadding();
        updateShapeElevation(f8);
    }

    void onPaddingUpdated(@NonNull Rect rect) {
        Preconditions.checkNotNull(this.contentBackground, "Didn't initialize content background");
        if (shouldAddPadding()) {
            this.shadowViewDelegate.setBackgroundDrawable(new InsetDrawable(this.contentBackground, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.shadowViewDelegate.setBackgroundDrawable(this.contentBackground);
        }
    }

    void onPreDraw() {
        float rotation = this.view.getRotation();
        if (this.rotation != rotation) {
            this.rotation = rotation;
            updateFromViewRotation();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onScaleChanged() {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onScaleChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onTranslationChanged() {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList != null) {
            Iterator<InternalTransformationCallback> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTranslationChanged();
            }
        }
    }

    public void removeOnHideAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.hideListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeOnShowAnimationListener(@NonNull Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.showListeners;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeTransformationCallback(@NonNull InternalTransformationCallback internalTransformationCallback) {
        ArrayList<InternalTransformationCallback> arrayList = this.transformationCallbacks;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(internalTransformationCallback);
    }

    boolean requirePreDrawListener() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        BorderDrawable borderDrawable = this.borderDrawable;
        if (borderDrawable != null) {
            borderDrawable.setBorderTint(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setElevation(float f8) {
        if (this.elevation != f8) {
            this.elevation = f8;
            onElevationsChanged(f8, this.hoveredFocusedTranslationZ, this.pressedTranslationZ);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEnsureMinTouchTargetSize(boolean z8) {
        this.ensureMinTouchTargetSize = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setHoveredFocusedTranslationZ(float f8) {
        if (this.hoveredFocusedTranslationZ != f8) {
            this.hoveredFocusedTranslationZ = f8;
            onElevationsChanged(this.elevation, f8, this.pressedTranslationZ);
        }
    }

    final void setImageMatrixScale(float f8) {
        this.imageMatrixScale = f8;
        Matrix matrix = this.tmpMatrix;
        calculateImageMatrixFromScale(f8, matrix);
        this.view.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setMaxImageSize(int i8) {
        if (this.maxImageSize != i8) {
            this.maxImageSize = i8;
            updateImageMatrixScale();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinTouchTargetSize(int i8) {
        this.minTouchTargetSize = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setPressedTranslationZ(float f8) {
        if (this.pressedTranslationZ != f8) {
            this.pressedTranslationZ = f8;
            onElevationsChanged(this.elevation, this.hoveredFocusedTranslationZ, f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.rippleDrawable;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShadowPaddingEnabled(boolean z8) {
        this.shadowPaddingEnabled = z8;
        updatePadding();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setShapeAppearance(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearance = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Object obj = this.rippleDrawable;
        if (obj instanceof Shapeable) {
            ((Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        BorderDrawable borderDrawable = this.borderDrawable;
        if (borderDrawable != null) {
            borderDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    boolean shouldAddPadding() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean shouldExpandBoundsForA11y() {
        if (this.ensureMinTouchTargetSize && this.view.getSizeDimension() < this.minTouchTargetSize) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void show(@Nullable final InternalVisibilityChangedListener internalVisibilityChangedListener, final boolean z8) {
        boolean z9;
        AnimatorSet createDefaultAnimator;
        float f8;
        float f9;
        if (isOrWillBeShown()) {
            return;
        }
        Animator animator = this.currentAnimator;
        if (animator != null) {
            animator.cancel();
        }
        if (this.showMotionSpec == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (shouldAnimateVisibilityChange()) {
            if (this.view.getVisibility() != 0) {
                float f10 = 0.0f;
                this.view.setAlpha(0.0f);
                FloatingActionButton floatingActionButton = this.view;
                if (z9) {
                    f8 = 0.4f;
                } else {
                    f8 = 0.0f;
                }
                floatingActionButton.setScaleY(f8);
                FloatingActionButton floatingActionButton2 = this.view;
                if (z9) {
                    f9 = 0.4f;
                } else {
                    f9 = 0.0f;
                }
                floatingActionButton2.setScaleX(f9);
                if (z9) {
                    f10 = 0.4f;
                }
                setImageMatrixScale(f10);
            }
            MotionSpec motionSpec = this.showMotionSpec;
            if (motionSpec != null) {
                createDefaultAnimator = createAnimator(motionSpec, 1.0f, 1.0f, 1.0f);
            } else {
                createDefaultAnimator = createDefaultAnimator(1.0f, 1.0f, 1.0f, SHOW_ANIM_DURATION_ATTR, SHOW_ANIM_EASING_ATTR);
            }
            createDefaultAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    FloatingActionButtonImpl.this.animState = 0;
                    FloatingActionButtonImpl.this.currentAnimator = null;
                    InternalVisibilityChangedListener internalVisibilityChangedListener2 = internalVisibilityChangedListener;
                    if (internalVisibilityChangedListener2 != null) {
                        internalVisibilityChangedListener2.onShown();
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator2) {
                    FloatingActionButtonImpl.this.view.internalSetVisibility(0, z8);
                    FloatingActionButtonImpl.this.animState = 2;
                    FloatingActionButtonImpl.this.currentAnimator = animator2;
                }
            });
            ArrayList<Animator.AnimatorListener> arrayList = this.showListeners;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    createDefaultAnimator.addListener(it.next());
                }
            }
            createDefaultAnimator.start();
            return;
        }
        this.view.internalSetVisibility(0, z8);
        this.view.setAlpha(1.0f);
        this.view.setScaleY(1.0f);
        this.view.setScaleX(1.0f);
        setImageMatrixScale(1.0f);
        if (internalVisibilityChangedListener != null) {
            internalVisibilityChangedListener.onShown();
        }
    }

    void updateFromViewRotation() {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShadowCompatRotation((int) this.rotation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void updateImageMatrixScale() {
        setImageMatrixScale(this.imageMatrixScale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void updatePadding() {
        Rect rect = this.tmpRect;
        getPadding(rect);
        onPaddingUpdated(rect);
        this.shadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateShapeElevation(float f8) {
        MaterialShapeDrawable materialShapeDrawable = this.shapeDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f8);
        }
    }
}
