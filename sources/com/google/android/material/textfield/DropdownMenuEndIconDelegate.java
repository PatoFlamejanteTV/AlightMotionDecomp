package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class DropdownMenuEndIconDelegate extends EndIconDelegate {
    private static final int DEFAULT_ANIMATION_FADE_IN_DURATION = 67;
    private static final int DEFAULT_ANIMATION_FADE_OUT_DURATION = 50;

    @ChecksSdkIntAtLeast(api = 21)
    private static final boolean IS_LOLLIPOP = true;

    @Nullable
    private AccessibilityManager accessibilityManager;
    private final int animationFadeInDuration;

    @NonNull
    private final TimeInterpolator animationFadeInterpolator;
    private final int animationFadeOutDuration;

    @Nullable
    private AutoCompleteTextView autoCompleteTextView;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    private boolean editTextHasFocus;
    private ValueAnimator fadeInAnim;
    private ValueAnimator fadeOutAnim;
    private boolean isEndIconChecked;
    private final View.OnFocusChangeListener onEditTextFocusChangeListener;
    private final View.OnClickListener onIconClickListener;
    private final AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DropdownMenuEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.onIconClickListener = new View.OnClickListener() { // from class: com.google.android.material.textfield.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DropdownMenuEndIconDelegate.this.lambda$new$0(view);
            }
        };
        this.onEditTextFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                DropdownMenuEndIconDelegate.this.lambda$new$1(view, z8);
            }
        };
        this.touchExplorationStateChangeListener = new AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.k
            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z8) {
                DropdownMenuEndIconDelegate.this.lambda$new$2(z8);
            }
        };
        this.dropdownPopupActivatedAt = Long.MAX_VALUE;
        Context context = endCompoundLayout.getContext();
        int i8 = R.attr.motionDurationShort3;
        this.animationFadeInDuration = MotionUtils.resolveThemeDuration(context, i8, 67);
        this.animationFadeOutDuration = MotionUtils.resolveThemeDuration(endCompoundLayout.getContext(), i8, 50);
        this.animationFadeInterpolator = MotionUtils.resolveThemeInterpolator(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
    }

    @NonNull
    private static AutoCompleteTextView castAutoCompleteTextViewOrThrow(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator getAlphaAnimator(int i8, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.animationFadeInterpolator);
        ofFloat.setDuration(i8);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DropdownMenuEndIconDelegate.this.lambda$getAlphaAnimator$6(valueAnimator);
            }
        });
        return ofFloat;
    }

    private void initAnimators() {
        this.fadeInAnim = getAlphaAnimator(this.animationFadeInDuration, 0.0f, 1.0f);
        ValueAnimator alphaAnimator = getAlphaAnimator(this.animationFadeOutDuration, 1.0f, 0.0f);
        this.fadeOutAnim = alphaAnimator;
        alphaAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DropdownMenuEndIconDelegate.this.refreshIconState();
                DropdownMenuEndIconDelegate.this.fadeInAnim.start();
            }
        });
    }

    private boolean isDropdownPopupActive() {
        long currentTimeMillis = System.currentTimeMillis() - this.dropdownPopupActivatedAt;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$afterEditTextChanged$3() {
        boolean isPopupShowing = this.autoCompleteTextView.isPopupShowing();
        setEndIconChecked(isPopupShowing);
        this.dropdownPopupDirty = isPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAlphaAnimator$6(ValueAnimator valueAnimator) {
        this.endIconView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        showHideDropdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(View view, boolean z8) {
        this.editTextHasFocus = z8;
        refreshIconState();
        if (!z8) {
            setEndIconChecked(false);
            this.dropdownPopupDirty = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(boolean z8) {
        int i8;
        AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        if (autoCompleteTextView != null && !EditTextUtils.isEditable(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = this.endIconView;
            if (z8) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            ViewCompat.setImportantForAccessibility(checkableImageButton, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setUpDropdownShowHideBehavior$4(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (isDropdownPopupActive()) {
                this.dropdownPopupDirty = false;
            }
            showHideDropdown();
            updateDropdownPopupDirty();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpDropdownShowHideBehavior$5() {
        updateDropdownPopupDirty();
        setEndIconChecked(false);
    }

    private void setEndIconChecked(boolean z8) {
        if (this.isEndIconChecked != z8) {
            this.isEndIconChecked = z8;
            this.fadeInAnim.cancel();
            this.fadeOutAnim.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpDropdownShowHideBehavior() {
        this.autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$setUpDropdownShowHideBehavior$4;
                lambda$setUpDropdownShowHideBehavior$4 = DropdownMenuEndIconDelegate.this.lambda$setUpDropdownShowHideBehavior$4(view, motionEvent);
                return lambda$setUpDropdownShowHideBehavior$4;
            }
        });
        if (IS_LOLLIPOP) {
            this.autoCompleteTextView.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.h
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    DropdownMenuEndIconDelegate.this.lambda$setUpDropdownShowHideBehavior$5();
                }
            });
        }
        this.autoCompleteTextView.setThreshold(0);
    }

    private void showHideDropdown() {
        if (this.autoCompleteTextView == null) {
            return;
        }
        if (isDropdownPopupActive()) {
            this.dropdownPopupDirty = false;
        }
        if (!this.dropdownPopupDirty) {
            if (IS_LOLLIPOP) {
                setEndIconChecked(!this.isEndIconChecked);
            } else {
                this.isEndIconChecked = !this.isEndIconChecked;
                refreshIconState();
            }
            if (this.isEndIconChecked) {
                this.autoCompleteTextView.requestFocus();
                this.autoCompleteTextView.showDropDown();
                return;
            } else {
                this.autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.dropdownPopupDirty = false;
    }

    private void updateDropdownPopupDirty() {
        this.dropdownPopupDirty = true;
        this.dropdownPopupActivatedAt = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void afterEditTextChanged(Editable editable) {
        if (this.accessibilityManager.isTouchExplorationEnabled() && EditTextUtils.isEditable(this.autoCompleteTextView) && !this.endIconView.hasFocus()) {
            this.autoCompleteTextView.dismissDropDown();
        }
        this.autoCompleteTextView.post(new Runnable() { // from class: com.google.android.material.textfield.l
            @Override // java.lang.Runnable
            public final void run() {
                DropdownMenuEndIconDelegate.this.lambda$afterEditTextChanged$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public int getIconContentDescriptionResId() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public int getIconDrawableResId() {
        if (IS_LOLLIPOP) {
            return R.drawable.mtrl_dropdown_arrow;
        }
        return R.drawable.mtrl_ic_arrow_drop_down;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return this.onEditTextFocusChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return this.touchExplorationStateChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isBoxBackgroundModeSupported(int i8) {
        return i8 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconActivable() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconActivated() {
        return this.editTextHasFocus;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconCheckable() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconChecked() {
        return this.isEndIconChecked;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@Nullable EditText editText) {
        this.autoCompleteTextView = castAutoCompleteTextViewOrThrow(editText);
        setUpDropdownShowHideBehavior();
        this.textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!EditTextUtils.isEditable(editText) && this.accessibilityManager.isTouchExplorationEnabled()) {
            ViewCompat.setImportantForAccessibility(this.endIconView, 2);
        }
        this.textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!EditTextUtils.isEditable(this.autoCompleteTextView)) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @SuppressLint({"WrongConstant"})
    public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        boolean z8;
        if (this.accessibilityManager.isEnabled() && !EditTextUtils.isEditable(this.autoCompleteTextView)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.isEndIconChecked && !this.autoCompleteTextView.isPopupShowing()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z8) {
                showHideDropdown();
                updateDropdownPopupDirty();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        initAnimators();
        this.accessibilityManager = (AccessibilityManager) this.context.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean shouldTintIconOnError() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    @SuppressLint({"ClickableViewAccessibility"})
    public void tearDown() {
        AutoCompleteTextView autoCompleteTextView = this.autoCompleteTextView;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (IS_LOLLIPOP) {
                this.autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }
}
