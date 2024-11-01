package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    private float dependencyOriginalTranslationX;
    private float dependencyOriginalTranslationY;
    private final int[] tmpArray;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class FabTransformationSpec {
        public Positioning positioning;

        @Nullable
        public MotionSpec timings;
    }

    public FabTransformationBehavior() {
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }

    @Nullable
    private ViewGroup calculateChildContentContainer(@NonNull View view) {
        View findViewById = view.findViewById(R.id.mtrl_child_content_container);
        if (findViewById != null) {
            return toViewGroupOrNull(findViewById);
        }
        if (!(view instanceof TransformationChildLayout) && !(view instanceof TransformationChildCard)) {
            return toViewGroupOrNull(view);
        }
        return toViewGroupOrNull(((ViewGroup) view).getChildAt(0));
    }

    private void calculateChildVisibleBoundsAtEndOfExpansion(@NonNull View view, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull MotionTiming motionTiming, @NonNull MotionTiming motionTiming2, float f8, float f9, float f10, float f11, @NonNull RectF rectF) {
        float calculateValueOfAnimationAtEndOfExpansion = calculateValueOfAnimationAtEndOfExpansion(fabTransformationSpec, motionTiming, f8, f10);
        float calculateValueOfAnimationAtEndOfExpansion2 = calculateValueOfAnimationAtEndOfExpansion(fabTransformationSpec, motionTiming2, f9, f11);
        Rect rect = this.tmpRect;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.tmpRectF1;
        rectF2.set(rect);
        RectF rectF3 = this.tmpRectF2;
        calculateWindowBounds(view, rectF3);
        rectF3.offset(calculateValueOfAnimationAtEndOfExpansion, calculateValueOfAnimationAtEndOfExpansion2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void calculateDependencyWindowBounds(@NonNull View view, @NonNull RectF rectF) {
        calculateWindowBounds(view, rectF);
        rectF.offset(this.dependencyOriginalTranslationX, this.dependencyOriginalTranslationY);
    }

    @NonNull
    private Pair<MotionTiming, MotionTiming> calculateMotionTiming(float f8, float f9, boolean z8, @NonNull FabTransformationSpec fabTransformationSpec) {
        MotionTiming timing;
        MotionTiming timing2;
        if (f8 != 0.0f && f9 != 0.0f) {
            if ((z8 && f9 < 0.0f) || (!z8 && f9 > 0.0f)) {
                timing = fabTransformationSpec.timings.getTiming("translationXCurveUpwards");
                timing2 = fabTransformationSpec.timings.getTiming("translationYCurveUpwards");
            } else {
                timing = fabTransformationSpec.timings.getTiming("translationXCurveDownwards");
                timing2 = fabTransformationSpec.timings.getTiming("translationYCurveDownwards");
            }
        } else {
            timing = fabTransformationSpec.timings.getTiming("translationXLinear");
            timing2 = fabTransformationSpec.timings.getTiming("translationYLinear");
        }
        return new Pair<>(timing, timing2);
    }

    private float calculateRevealCenterX(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        rectF2.offset(-calculateTranslationX(view, view2, positioning), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float calculateRevealCenterY(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        rectF2.offset(0.0f, -calculateTranslationY(view, view2, positioning));
        return rectF.centerY() - rectF2.top;
    }

    private float calculateTranslationX(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        float centerX;
        float centerX2;
        float f8;
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        int i8 = positioning.gravity & 7;
        if (i8 != 1) {
            if (i8 != 3) {
                if (i8 != 5) {
                    f8 = 0.0f;
                    return f8 + positioning.xAdjustment;
                }
                centerX = rectF2.right;
                centerX2 = rectF.right;
            } else {
                centerX = rectF2.left;
                centerX2 = rectF.left;
            }
        } else {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        }
        f8 = centerX - centerX2;
        return f8 + positioning.xAdjustment;
    }

    private float calculateTranslationY(@NonNull View view, @NonNull View view2, @NonNull Positioning positioning) {
        float centerY;
        float centerY2;
        float f8;
        RectF rectF = this.tmpRectF1;
        RectF rectF2 = this.tmpRectF2;
        calculateDependencyWindowBounds(view, rectF);
        calculateWindowBounds(view2, rectF2);
        int i8 = positioning.gravity & 112;
        if (i8 != 16) {
            if (i8 != 48) {
                if (i8 != 80) {
                    f8 = 0.0f;
                    return f8 + positioning.yAdjustment;
                }
                centerY = rectF2.bottom;
                centerY2 = rectF.bottom;
            } else {
                centerY = rectF2.top;
                centerY2 = rectF.top;
            }
        } else {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        }
        f8 = centerY - centerY2;
        return f8 + positioning.yAdjustment;
    }

    private float calculateValueOfAnimationAtEndOfExpansion(@NonNull FabTransformationSpec fabTransformationSpec, @NonNull MotionTiming motionTiming, float f8, float f9) {
        long delay = motionTiming.getDelay();
        long duration = motionTiming.getDuration();
        MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
        return AnimationUtils.lerp(f8, f9, motionTiming.getInterpolator().getInterpolation(((float) (((timing.getDelay() + timing.getDuration()) + 17) - delay)) / ((float) duration)));
    }

    private void calculateWindowBounds(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.tmpArray);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void createChildrenFadeAnimation(View view, View view2, boolean z8, boolean z9, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup calculateChildContentContainer;
        ObjectAnimator ofFloat;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof CircularRevealWidget) && CircularRevealHelper.STRATEGY == 0) || (calculateChildContentContainer = calculateChildContentContainer(view2)) == null) {
            return;
        }
        if (z8) {
            if (!z9) {
                ChildrenAlphaProperty.CHILDREN_ALPHA.set(calculateChildContentContainer, Float.valueOf(0.0f));
            }
            ofFloat = ObjectAnimator.ofFloat(calculateChildContentContainer, ChildrenAlphaProperty.CHILDREN_ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(calculateChildContentContainer, ChildrenAlphaProperty.CHILDREN_ALPHA, 0.0f);
        }
        fabTransformationSpec.timings.getTiming("contentFade").apply(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createColorAnimation(@NonNull View view, View view2, boolean z8, boolean z9, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof CircularRevealWidget)) {
            return;
        }
        CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
        int backgroundTint = getBackgroundTint(view);
        int i8 = 16777215 & backgroundTint;
        if (z8) {
            if (!z9) {
                circularRevealWidget.setCircularRevealScrimColor(backgroundTint);
            }
            ofInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, i8);
        } else {
            ofInt = ObjectAnimator.ofInt(circularRevealWidget, CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, backgroundTint);
        }
        ofInt.setEvaluator(ArgbEvaluatorCompat.getInstance());
        fabTransformationSpec.timings.getTiming("color").apply(ofInt);
        list.add(ofInt);
    }

    private void createDependencyTranslationAnimation(@NonNull View view, @NonNull View view2, boolean z8, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list) {
        float calculateTranslationX = calculateTranslationX(view, view2, fabTransformationSpec.positioning);
        float calculateTranslationY = calculateTranslationY(view, view2, fabTransformationSpec.positioning);
        Pair<MotionTiming, MotionTiming> calculateMotionTiming = calculateMotionTiming(calculateTranslationX, calculateTranslationY, z8, fabTransformationSpec);
        MotionTiming motionTiming = (MotionTiming) calculateMotionTiming.first;
        MotionTiming motionTiming2 = (MotionTiming) calculateMotionTiming.second;
        Property property = View.TRANSLATION_X;
        if (!z8) {
            calculateTranslationX = this.dependencyOriginalTranslationX;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, calculateTranslationX);
        Property property2 = View.TRANSLATION_Y;
        if (!z8) {
            calculateTranslationY = this.dependencyOriginalTranslationY;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, calculateTranslationY);
        motionTiming.apply(ofFloat);
        motionTiming2.apply(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void createElevationAnimation(View view, @NonNull View view2, boolean z8, boolean z9, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float elevation = ViewCompat.getElevation(view2) - ViewCompat.getElevation(view);
        if (z8) {
            if (!z9) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        fabTransformationSpec.timings.getTiming("elevation").apply(ofFloat);
        list.add(ofFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createExpansionAnimation(@NonNull View view, View view2, boolean z8, boolean z9, @NonNull FabTransformationSpec fabTransformationSpec, float f8, float f9, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (!(view2 instanceof CircularRevealWidget)) {
            return;
        }
        final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
        float calculateRevealCenterX = calculateRevealCenterX(view, view2, fabTransformationSpec.positioning);
        float calculateRevealCenterY = calculateRevealCenterY(view, view2, fabTransformationSpec.positioning);
        ((FloatingActionButton) view).getContentRect(this.tmpRect);
        float width = this.tmpRect.width() / 2.0f;
        MotionTiming timing = fabTransformationSpec.timings.getTiming("expansion");
        if (z8) {
            if (!z9) {
                circularRevealWidget.setRevealInfo(new CircularRevealWidget.RevealInfo(calculateRevealCenterX, calculateRevealCenterY, width));
            }
            if (z9) {
                width = circularRevealWidget.getRevealInfo().radius;
            }
            animator = CircularRevealCompat.createCircularReveal(circularRevealWidget, calculateRevealCenterX, calculateRevealCenterY, MathUtils.distanceToFurthestCorner(calculateRevealCenterX, calculateRevealCenterY, 0.0f, 0.0f, f8, f9));
            animator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator2) {
                    CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
                    revealInfo.radius = Float.MAX_VALUE;
                    circularRevealWidget.setRevealInfo(revealInfo);
                }
            });
            createPreFillRadialExpansion(view2, timing.getDelay(), (int) calculateRevealCenterX, (int) calculateRevealCenterY, width, list);
        } else {
            float f10 = circularRevealWidget.getRevealInfo().radius;
            Animator createCircularReveal = CircularRevealCompat.createCircularReveal(circularRevealWidget, calculateRevealCenterX, calculateRevealCenterY, width);
            int i8 = (int) calculateRevealCenterX;
            int i9 = (int) calculateRevealCenterY;
            createPreFillRadialExpansion(view2, timing.getDelay(), i8, i9, f10, list);
            createPostFillRadialExpansion(view2, timing.getDelay(), timing.getDuration(), fabTransformationSpec.timings.getTotalDuration(), i8, i9, width, list);
            animator = createCircularReveal;
        }
        timing.apply(animator);
        list.add(animator);
        list2.add(CircularRevealCompat.createCircularRevealListener(circularRevealWidget));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createIconFadeAnimation(View view, final View view2, boolean z8, boolean z9, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, @NonNull List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof CircularRevealWidget) && (view instanceof ImageView)) {
            final CircularRevealWidget circularRevealWidget = (CircularRevealWidget) view2;
            final Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z8) {
                if (!z9) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, 255);
            }
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transformation.FabTransformationBehavior.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    view2.invalidate();
                }
            });
            fabTransformationSpec.timings.getTiming("iconFade").apply(ofInt);
            list.add(ofInt);
            list2.add(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    circularRevealWidget.setCircularRevealOverlayDrawable(null);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    circularRevealWidget.setCircularRevealOverlayDrawable(drawable);
                }
            });
        }
    }

    private void createPostFillRadialExpansion(View view, long j8, long j9, long j10, int i8, int i9, float f8, @NonNull List<Animator> list) {
        long j11 = j8 + j9;
        if (j11 < j10) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i8, i9, f8, f8);
            createCircularReveal.setStartDelay(j11);
            createCircularReveal.setDuration(j10 - j11);
            list.add(createCircularReveal);
        }
    }

    private void createPreFillRadialExpansion(View view, long j8, int i8, int i9, float f8, @NonNull List<Animator> list) {
        if (j8 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i8, i9, f8, f8);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j8);
            list.add(createCircularReveal);
        }
    }

    private void createTranslationAnimation(@NonNull View view, @NonNull View view2, boolean z8, boolean z9, @NonNull FabTransformationSpec fabTransformationSpec, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2, @NonNull RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float calculateTranslationX = calculateTranslationX(view, view2, fabTransformationSpec.positioning);
        float calculateTranslationY = calculateTranslationY(view, view2, fabTransformationSpec.positioning);
        Pair<MotionTiming, MotionTiming> calculateMotionTiming = calculateMotionTiming(calculateTranslationX, calculateTranslationY, z8, fabTransformationSpec);
        MotionTiming motionTiming = (MotionTiming) calculateMotionTiming.first;
        MotionTiming motionTiming2 = (MotionTiming) calculateMotionTiming.second;
        if (z8) {
            if (!z9) {
                view2.setTranslationX(-calculateTranslationX);
                view2.setTranslationY(-calculateTranslationY);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            calculateChildVisibleBoundsAtEndOfExpansion(view2, fabTransformationSpec, motionTiming, motionTiming2, -calculateTranslationX, -calculateTranslationY, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -calculateTranslationX);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -calculateTranslationY);
        }
        motionTiming.apply(ofFloat);
        motionTiming2.apply(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private int getBackgroundTint(@NonNull View view) {
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    @Nullable
    private ViewGroup toViewGroupOrNull(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    protected AnimatorSet onCreateExpandedStateChangeAnimation(@NonNull final View view, @NonNull final View view2, final boolean z8, boolean z9) {
        FabTransformationSpec onCreateMotionSpec = onCreateMotionSpec(view2.getContext(), z8);
        if (z8) {
            this.dependencyOriginalTranslationX = view.getTranslationX();
            this.dependencyOriginalTranslationY = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        createElevationAnimation(view, view2, z8, z9, onCreateMotionSpec, arrayList, arrayList2);
        RectF rectF = this.tmpRectF1;
        createTranslationAnimation(view, view2, z8, z9, onCreateMotionSpec, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        createDependencyTranslationAnimation(view, view2, z8, onCreateMotionSpec, arrayList);
        createIconFadeAnimation(view, view2, z8, z9, onCreateMotionSpec, arrayList, arrayList2);
        createExpansionAnimation(view, view2, z8, z9, onCreateMotionSpec, width, height, arrayList, arrayList2);
        createColorAnimation(view, view2, z8, z9, onCreateMotionSpec, arrayList, arrayList2);
        createChildrenFadeAnimation(view, view2, z8, z9, onCreateMotionSpec, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!z8) {
                    view2.setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (z8) {
                    view2.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                }
            }
        });
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            animatorSet.addListener(arrayList2.get(i8));
        }
        return animatorSet;
    }

    protected abstract FabTransformationSpec onCreateMotionSpec(Context context, boolean z8);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }
}
