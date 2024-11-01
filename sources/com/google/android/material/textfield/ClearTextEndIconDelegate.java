package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClearTextEndIconDelegate extends EndIconDelegate {
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    private static final int DEFAULT_ANIMATION_FADE_DURATION = 100;
    private static final int DEFAULT_ANIMATION_SCALE_DURATION = 150;
    private final int animationFadeDuration;

    @NonNull
    private final TimeInterpolator animationFadeInterpolator;
    private final int animationScaleDuration;

    @NonNull
    private final TimeInterpolator animationScaleInterpolator;

    @Nullable
    private EditText editText;
    private AnimatorSet iconInAnim;
    private ValueAnimator iconOutAnim;
    private final View.OnFocusChangeListener onFocusChangeListener;
    private final View.OnClickListener onIconClickListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClearTextEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.onIconClickListener = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClearTextEndIconDelegate.this.lambda$new$0(view);
            }
        };
        this.onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                ClearTextEndIconDelegate.this.lambda$new$1(view, z8);
            }
        };
        Context context = endCompoundLayout.getContext();
        int i8 = R.attr.motionDurationShort3;
        this.animationFadeDuration = MotionUtils.resolveThemeDuration(context, i8, 100);
        this.animationScaleDuration = MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), i8, 150);
        this.animationFadeInterpolator = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.animationScaleInterpolator = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
    }

    private void animateIcon(boolean z8) {
        boolean z9;
        if (this.endLayout.isEndIconVisible() == z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 && !this.iconInAnim.isRunning()) {
            this.iconOutAnim.cancel();
            this.iconInAnim.start();
            if (z9) {
                this.iconInAnim.end();
                return;
            }
            return;
        }
        if (!z8) {
            this.iconInAnim.cancel();
            this.iconOutAnim.start();
            if (z9) {
                this.iconOutAnim.end();
            }
        }
    }

    private ValueAnimator getAlphaAnimator(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.animationFadeInterpolator);
        ofFloat.setDuration(this.animationFadeDuration);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClearTextEndIconDelegate.this.lambda$getAlphaAnimator$3(valueAnimator);
            }
        });
        return ofFloat;
    }

    private ValueAnimator getScaleAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(ANIMATION_SCALE_FROM_VALUE, 1.0f);
        ofFloat.setInterpolator(this.animationScaleInterpolator);
        ofFloat.setDuration(this.animationScaleDuration);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClearTextEndIconDelegate.this.lambda$getScaleAnimator$4(valueAnimator);
            }
        });
        return ofFloat;
    }

    private void initAnimators() {
        ValueAnimator scaleAnimator = getScaleAnimator();
        ValueAnimator alphaAnimator = getAlphaAnimator(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.iconInAnim = animatorSet;
        animatorSet.playTogether(scaleAnimator, alphaAnimator);
        this.iconInAnim.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ClearTextEndIconDelegate.this.endLayout.setEndIconVisible(true);
            }
        });
        ValueAnimator alphaAnimator2 = getAlphaAnimator(1.0f, 0.0f);
        this.iconOutAnim = alphaAnimator2;
        alphaAnimator2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.ClearTextEndIconDelegate.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ClearTextEndIconDelegate.this.endLayout.setEndIconVisible(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAlphaAnimator$3(ValueAnimator valueAnimator) {
        this.endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getScaleAnimator$4(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.endIconView.setScaleX(floatValue);
        this.endIconView.setScaleY(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        refreshIconState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view, boolean z8) {
        animateIcon(shouldBeVisible());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tearDown$2() {
        animateIcon(true);
    }

    private boolean shouldBeVisible() {
        EditText editText = this.editText;
        if (editText != null && ((editText.hasFocus() || this.endIconView.hasFocus()) && this.editText.getText().length() > 0)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void afterEditTextChanged(@NonNull Editable editable) {
        if (this.endLayout.getSuffixText() != null) {
            return;
        }
        animateIcon(shouldBeVisible());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public int getIconContentDescriptionResId() {
        return R.string.clear_text_end_icon_content_description;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public int getIconDrawableResId() {
        return R.drawable.mtrl_ic_cancel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return this.onFocusChangeListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@Nullable EditText editText) {
        this.editText = editText;
        this.textInputLayout.setEndIconVisible(shouldBeVisible());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onSuffixVisibilityChanged(boolean z8) {
        if (this.endLayout.getSuffixText() == null) {
            return;
        }
        animateIcon(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        initAnimators();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void tearDown() {
        EditText editText = this.editText;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    ClearTextEndIconDelegate.this.lambda$tearDown$2();
                }
            });
        }
    }
}
