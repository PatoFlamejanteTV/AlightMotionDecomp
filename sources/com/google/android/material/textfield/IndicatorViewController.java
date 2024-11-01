package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class IndicatorViewController {
    private static final int CAPTION_STATE_ERROR = 1;
    private static final int CAPTION_STATE_HELPER_TEXT = 2;
    private static final int CAPTION_STATE_NONE = 0;
    static final int COUNTER_INDEX = 2;
    private static final int DEFAULT_CAPTION_FADE_ANIMATION_DURATION = 167;
    private static final int DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION = 217;
    static final int ERROR_INDEX = 0;
    static final int HELPER_INDEX = 1;

    @Nullable
    private Animator captionAnimator;
    private FrameLayout captionArea;
    private int captionDisplayed;
    private final int captionFadeInAnimationDuration;

    @NonNull
    private final TimeInterpolator captionFadeInAnimationInterpolator;
    private final int captionFadeOutAnimationDuration;

    @NonNull
    private final TimeInterpolator captionFadeOutAnimationInterpolator;
    private int captionToShow;
    private final int captionTranslationYAnimationDuration;

    @NonNull
    private final TimeInterpolator captionTranslationYAnimationInterpolator;
    private final float captionTranslationYPx;
    private final Context context;
    private boolean errorEnabled;

    @Nullable
    private CharSequence errorText;
    private int errorTextAppearance;

    @Nullable
    private TextView errorView;
    private int errorViewAccessibilityLiveRegion;

    @Nullable
    private CharSequence errorViewContentDescription;

    @Nullable
    private ColorStateList errorViewTextColor;
    private CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;

    @Nullable
    private TextView helperTextView;

    @Nullable
    private ColorStateList helperTextViewTextColor;
    private LinearLayout indicatorArea;
    private int indicatorsAdded;

    @NonNull
    private final TextInputLayout textInputView;
    private Typeface typeface;

    public IndicatorViewController(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.context = context;
        this.textInputView = textInputLayout;
        this.captionTranslationYPx = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        int i8 = R.attr.motionDurationShort4;
        this.captionTranslationYAnimationDuration = MotionUtils.resolveThemeDuration(context, i8, DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION);
        this.captionFadeInAnimationDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium4, DEFAULT_CAPTION_FADE_ANIMATION_DURATION);
        this.captionFadeOutAnimationDuration = MotionUtils.resolveThemeDuration(context, i8, DEFAULT_CAPTION_FADE_ANIMATION_DURATION);
        int i9 = R.attr.motionEasingEmphasizedDecelerateInterpolator;
        this.captionTranslationYAnimationInterpolator = MotionUtils.resolveThemeInterpolator(context, i9, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        this.captionFadeInAnimationInterpolator = MotionUtils.resolveThemeInterpolator(context, i9, timeInterpolator);
        this.captionFadeOutAnimationInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    private boolean canAdjustIndicatorPadding() {
        if (this.indicatorArea != null && this.textInputView.getEditText() != null) {
            return true;
        }
        return false;
    }

    private void createCaptionAnimators(@NonNull List<Animator> list, boolean z8, @Nullable TextView textView, int i8, int i9, int i10) {
        boolean z9;
        if (textView != null && z8) {
            if (i8 == i10 || i8 == i9) {
                if (i10 == i8) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ObjectAnimator createCaptionOpacityAnimator = createCaptionOpacityAnimator(textView, z9);
                if (i8 == i10 && i9 != 0) {
                    createCaptionOpacityAnimator.setStartDelay(this.captionFadeOutAnimationDuration);
                }
                list.add(createCaptionOpacityAnimator);
                if (i10 == i8 && i9 != 0) {
                    ObjectAnimator createCaptionTranslationYAnimator = createCaptionTranslationYAnimator(textView);
                    createCaptionTranslationYAnimator.setStartDelay(this.captionFadeOutAnimationDuration);
                    list.add(createCaptionTranslationYAnimator);
                }
            }
        }
    }

    private ObjectAnimator createCaptionOpacityAnimator(TextView textView, boolean z8) {
        float f8;
        int i8;
        TimeInterpolator timeInterpolator;
        if (z8) {
            f8 = 1.0f;
        } else {
            f8 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f8);
        if (z8) {
            i8 = this.captionFadeInAnimationDuration;
        } else {
            i8 = this.captionFadeOutAnimationDuration;
        }
        ofFloat.setDuration(i8);
        if (z8) {
            timeInterpolator = this.captionFadeInAnimationInterpolator;
        } else {
            timeInterpolator = this.captionFadeOutAnimationInterpolator;
        }
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    private ObjectAnimator createCaptionTranslationYAnimator(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.captionTranslationYPx, 0.0f);
        ofFloat.setDuration(this.captionTranslationYAnimationDuration);
        ofFloat.setInterpolator(this.captionTranslationYAnimationInterpolator);
        return ofFloat;
    }

    @Nullable
    private TextView getCaptionViewFromDisplayState(int i8) {
        if (i8 != 1) {
            if (i8 != 2) {
                return null;
            }
            return this.helperTextView;
        }
        return this.errorView;
    }

    private int getIndicatorPadding(boolean z8, @DimenRes int i8, int i9) {
        if (z8) {
            return this.context.getResources().getDimensionPixelSize(i8);
        }
        return i9;
    }

    private boolean isCaptionStateError(int i8) {
        if (i8 == 1 && this.errorView != null && !TextUtils.isEmpty(this.errorText)) {
            return true;
        }
        return false;
    }

    private boolean isCaptionStateHelperText(int i8) {
        if (i8 == 2 && this.helperTextView != null && !TextUtils.isEmpty(this.helperText)) {
            return true;
        }
        return false;
    }

    private void setCaptionViewVisibilities(int i8, int i9) {
        TextView captionViewFromDisplayState;
        TextView captionViewFromDisplayState2;
        if (i8 == i9) {
            return;
        }
        if (i9 != 0 && (captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i9)) != null) {
            captionViewFromDisplayState2.setVisibility(0);
            captionViewFromDisplayState2.setAlpha(1.0f);
        }
        if (i8 != 0 && (captionViewFromDisplayState = getCaptionViewFromDisplayState(i8)) != null) {
            captionViewFromDisplayState.setVisibility(4);
            if (i8 == 1) {
                captionViewFromDisplayState.setText((CharSequence) null);
            }
        }
        this.captionDisplayed = i9;
    }

    private void setTextViewTypeface(@Nullable TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void setViewGroupGoneIfEmpty(@NonNull ViewGroup viewGroup, int i8) {
        if (i8 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean shouldAnimateCaptionView(@Nullable TextView textView, @NonNull CharSequence charSequence) {
        if (ViewCompat.isLaidOut(this.textInputView) && this.textInputView.isEnabled() && (this.captionToShow != this.captionDisplayed || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    private void updateCaptionViewsVisibility(final int i8, final int i9, boolean z8) {
        if (i8 == i9) {
            return;
        }
        if (z8) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.captionAnimator = animatorSet;
            ArrayList arrayList = new ArrayList();
            createCaptionAnimators(arrayList, this.helperTextEnabled, this.helperTextView, 2, i8, i9);
            createCaptionAnimators(arrayList, this.errorEnabled, this.errorView, 1, i8, i9);
            AnimatorSetCompat.playTogether(animatorSet, arrayList);
            final TextView captionViewFromDisplayState = getCaptionViewFromDisplayState(i8);
            final TextView captionViewFromDisplayState2 = getCaptionViewFromDisplayState(i9);
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.IndicatorViewController.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IndicatorViewController.this.captionDisplayed = i9;
                    IndicatorViewController.this.captionAnimator = null;
                    TextView textView = captionViewFromDisplayState;
                    if (textView != null) {
                        textView.setVisibility(4);
                        if (i8 == 1 && IndicatorViewController.this.errorView != null) {
                            IndicatorViewController.this.errorView.setText((CharSequence) null);
                        }
                    }
                    TextView textView2 = captionViewFromDisplayState2;
                    if (textView2 != null) {
                        textView2.setTranslationY(0.0f);
                        captionViewFromDisplayState2.setAlpha(1.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    TextView textView = captionViewFromDisplayState2;
                    if (textView != null) {
                        textView.setVisibility(0);
                        captionViewFromDisplayState2.setAlpha(0.0f);
                    }
                }
            });
            animatorSet.start();
        } else {
            setCaptionViewVisibilities(i8, i9);
        }
        this.textInputView.updateEditTextBackground();
        this.textInputView.updateLabelState(z8);
        this.textInputView.updateTextInputBoxState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addIndicator(TextView textView, int i8) {
        if (this.indicatorArea == null && this.captionArea == null) {
            LinearLayout linearLayout = new LinearLayout(this.context);
            this.indicatorArea = linearLayout;
            linearLayout.setOrientation(0);
            this.textInputView.addView(this.indicatorArea, -1, -2);
            this.captionArea = new FrameLayout(this.context);
            this.indicatorArea.addView(this.captionArea, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.textInputView.getEditText() != null) {
                adjustIndicatorPadding();
            }
        }
        if (isCaptionView(i8)) {
            this.captionArea.setVisibility(0);
            this.captionArea.addView(textView);
        } else {
            this.indicatorArea.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.indicatorArea.setVisibility(0);
        this.indicatorsAdded++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void adjustIndicatorPadding() {
        if (canAdjustIndicatorPadding()) {
            EditText editText = this.textInputView.getEditText();
            boolean isFontScaleAtLeast1_3 = MaterialResources.isFontScaleAtLeast1_3(this.context);
            LinearLayout linearLayout = this.indicatorArea;
            int i8 = R.dimen.material_helper_text_font_1_3_padding_horizontal;
            ViewCompat.setPaddingRelative(linearLayout, getIndicatorPadding(isFontScaleAtLeast1_3, i8, ViewCompat.getPaddingStart(editText)), getIndicatorPadding(isFontScaleAtLeast1_3, R.dimen.material_helper_text_font_1_3_padding_top, this.context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), getIndicatorPadding(isFontScaleAtLeast1_3, i8, ViewCompat.getPaddingEnd(editText)), 0);
        }
    }

    void cancelCaptionAnimator() {
        Animator animator = this.captionAnimator;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean errorIsDisplayed() {
        return isCaptionStateError(this.captionDisplayed);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean errorShouldBeShown() {
        return isCaptionStateError(this.captionToShow);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getErrorAccessibilityLiveRegion() {
        return this.errorViewAccessibilityLiveRegion;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.errorViewContentDescription;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public CharSequence getErrorText() {
        return this.errorText;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    public int getErrorViewCurrentTextColor() {
        TextView textView = this.errorView;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public ColorStateList getErrorViewTextColors() {
        TextView textView = this.errorView;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence getHelperText() {
        return this.helperText;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public View getHelperTextView() {
        return this.helperTextView;
    }

    @Nullable
    ColorStateList getHelperTextViewColors() {
        TextView textView = this.helperTextView;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    public int getHelperTextViewCurrentTextColor() {
        TextView textView = this.helperTextView;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean helperTextIsDisplayed() {
        return isCaptionStateHelperText(this.captionDisplayed);
    }

    boolean helperTextShouldBeShown() {
        return isCaptionStateHelperText(this.captionToShow);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void hideError() {
        this.errorText = null;
        cancelCaptionAnimator();
        if (this.captionDisplayed == 1) {
            if (this.helperTextEnabled && !TextUtils.isEmpty(this.helperText)) {
                this.captionToShow = 2;
            } else {
                this.captionToShow = 0;
            }
        }
        updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, shouldAnimateCaptionView(this.errorView, ""));
    }

    void hideHelperText() {
        cancelCaptionAnimator();
        int i8 = this.captionDisplayed;
        if (i8 == 2) {
            this.captionToShow = 0;
        }
        updateCaptionViewsVisibility(i8, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, ""));
    }

    boolean isCaptionView(int i8) {
        return i8 == 0 || i8 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isErrorEnabled() {
        return this.errorEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isHelperTextEnabled() {
        return this.helperTextEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeIndicator(TextView textView, int i8) {
        FrameLayout frameLayout;
        if (this.indicatorArea == null) {
            return;
        }
        if (isCaptionView(i8) && (frameLayout = this.captionArea) != null) {
            frameLayout.removeView(textView);
        } else {
            this.indicatorArea.removeView(textView);
        }
        int i9 = this.indicatorsAdded - 1;
        this.indicatorsAdded = i9;
        setViewGroupGoneIfEmpty(this.indicatorArea, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorAccessibilityLiveRegion(int i8) {
        this.errorViewAccessibilityLiveRegion = i8;
        TextView textView = this.errorView;
        if (textView != null) {
            ViewCompat.setAccessibilityLiveRegion(textView, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.errorViewContentDescription = charSequence;
        TextView textView = this.errorView;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorEnabled(boolean z8) {
        if (this.errorEnabled == z8) {
            return;
        }
        cancelCaptionAnimator();
        if (z8) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.context);
            this.errorView = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            this.errorView.setTextAlignment(5);
            Typeface typeface = this.typeface;
            if (typeface != null) {
                this.errorView.setTypeface(typeface);
            }
            setErrorTextAppearance(this.errorTextAppearance);
            setErrorViewTextColor(this.errorViewTextColor);
            setErrorContentDescription(this.errorViewContentDescription);
            setErrorAccessibilityLiveRegion(this.errorViewAccessibilityLiveRegion);
            this.errorView.setVisibility(4);
            addIndicator(this.errorView, 0);
        } else {
            hideError();
            removeIndicator(this.errorView, 0);
            this.errorView = null;
            this.textInputView.updateEditTextBackground();
            this.textInputView.updateTextInputBoxState();
        }
        this.errorEnabled = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorTextAppearance(@StyleRes int i8) {
        this.errorTextAppearance = i8;
        TextView textView = this.errorView;
        if (textView != null) {
            this.textInputView.setTextAppearanceCompatWithErrorFallback(textView, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorViewTextColor(@Nullable ColorStateList colorStateList) {
        this.errorViewTextColor = colorStateList;
        TextView textView = this.errorView;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHelperTextAppearance(@StyleRes int i8) {
        this.helperTextTextAppearance = i8;
        TextView textView = this.helperTextView;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHelperTextEnabled(boolean z8) {
        if (this.helperTextEnabled == z8) {
            return;
        }
        cancelCaptionAnimator();
        if (z8) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.context);
            this.helperTextView = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            this.helperTextView.setTextAlignment(5);
            Typeface typeface = this.typeface;
            if (typeface != null) {
                this.helperTextView.setTypeface(typeface);
            }
            this.helperTextView.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(this.helperTextView, 1);
            setHelperTextAppearance(this.helperTextTextAppearance);
            setHelperTextViewTextColor(this.helperTextViewTextColor);
            addIndicator(this.helperTextView, 1);
            this.helperTextView.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.textfield.IndicatorViewController.2
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    EditText editText = IndicatorViewController.this.textInputView.getEditText();
                    if (editText != null) {
                        accessibilityNodeInfo.setLabeledBy(editText);
                    }
                }
            });
        } else {
            hideHelperText();
            removeIndicator(this.helperTextView, 1);
            this.helperTextView = null;
            this.textInputView.updateEditTextBackground();
            this.textInputView.updateTextInputBoxState();
        }
        this.helperTextEnabled = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setHelperTextViewTextColor(@Nullable ColorStateList colorStateList) {
        this.helperTextViewTextColor = colorStateList;
        TextView textView = this.helperTextView;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTypefaces(Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            setTextViewTypeface(this.errorView, typeface);
            setTextViewTypeface(this.helperTextView, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void showError(CharSequence charSequence) {
        cancelCaptionAnimator();
        this.errorText = charSequence;
        this.errorView.setText(charSequence);
        int i8 = this.captionDisplayed;
        if (i8 != 1) {
            this.captionToShow = 1;
        }
        updateCaptionViewsVisibility(i8, this.captionToShow, shouldAnimateCaptionView(this.errorView, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void showHelper(CharSequence charSequence) {
        cancelCaptionAnimator();
        this.helperText = charSequence;
        this.helperTextView.setText(charSequence);
        int i8 = this.captionDisplayed;
        if (i8 != 2) {
            this.captionToShow = 2;
        }
        updateCaptionViewsVisibility(i8, this.captionToShow, shouldAnimateCaptionView(this.helperTextView, charSequence));
    }
}
