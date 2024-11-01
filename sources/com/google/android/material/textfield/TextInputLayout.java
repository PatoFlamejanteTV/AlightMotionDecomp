package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_TextInputLayout;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{android.R.attr.state_pressed}, new int[0]};
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;

    @Nullable
    private MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;

    @ColorInt
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;

    @ColorInt
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;

    @Nullable
    private MaterialShapeDrawable boxUnderlineDefault;

    @Nullable
    private MaterialShapeDrawable boxUnderlineFocused;
    final CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;

    @Nullable
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;

    @Nullable
    private ColorStateList counterTextColor;

    @Nullable
    private TextView counterView;

    @Nullable
    private ColorStateList cursorColor;

    @Nullable
    private ColorStateList cursorErrorColor;

    @ColorInt
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;

    @ColorInt
    private int defaultStrokeColor;

    @ColorInt
    private int disabledColor;

    @ColorInt
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<OnEditTextAttachedListener> editTextAttachedListeners;

    @Nullable
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;

    @NonNull
    private final EndCompoundLayout endLayout;
    private boolean expandedHintEnabled;
    private StateListDrawable filledDropDownMenuBackground;

    @ColorInt
    private int focusedFilledBackgroundColor;

    @ColorInt
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean globalLayoutListenerAdded;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;

    @ColorInt
    private int hoveredFilledBackgroundColor;

    @ColorInt
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final IndicatorViewController indicatorViewController;

    @NonNull
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;

    @NonNull
    private LengthCounter lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    int originalEditTextMinimumHeight;
    private CharSequence originalHint;
    private MaterialShapeDrawable outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;

    @Nullable
    private Fade placeholderFadeIn;

    @Nullable
    private Fade placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;

    @Nullable
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;

    @NonNull
    private ShapeAppearanceModel shapeAppearanceModel;

    @Nullable
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;

    @NonNull
    private final StartCompoundLayout startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    /* loaded from: classes3.dex */
    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final TextInputLayout layout;

        public AccessibilityDelegate(@NonNull TextInputLayout textInputLayout) {
            this.layout = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            CharSequence charSequence;
            String str;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.layout.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.layout.getHint();
            CharSequence error = this.layout.getError();
            CharSequence placeholderText = this.layout.getPlaceholderText();
            int counterMaxLength = this.layout.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.layout.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            boolean z8 = !isEmpty;
            boolean z9 = true;
            boolean z10 = !TextUtils.isEmpty(hint);
            boolean z11 = !this.layout.isHintExpanded();
            boolean z12 = !TextUtils.isEmpty(error);
            if (!z12 && TextUtils.isEmpty(counterOverflowDescription)) {
                z9 = false;
            }
            if (z10) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.layout.startLayout.setupAccessibilityNodeInfo(accessibilityNodeInfoCompat);
            if (z8) {
                accessibilityNodeInfoCompat.setText(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                accessibilityNodeInfoCompat.setText(str);
                if (z11 && placeholderText != null) {
                    accessibilityNodeInfoCompat.setText(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(str);
                } else {
                    if (z8) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    accessibilityNodeInfoCompat.setText(str);
                }
                accessibilityNodeInfoCompat.setShowingHintText(isEmpty);
            }
            if (charSequence == null || charSequence.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
            if (z9) {
                if (!z12) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
            }
            View helperTextView = this.layout.indicatorViewController.getHelperTextView();
            if (helperTextView != null) {
                accessibilityNodeInfoCompat.setLabelFor(helperTextView);
            }
            this.layout.endLayout.getEndIconDelegate().onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.layout.endLayout.getEndIconDelegate().onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface EndIconMode {
    }

    /* loaded from: classes3.dex */
    public interface LengthCounter {
        int countLength(@Nullable Editable editable);
    }

    /* loaded from: classes3.dex */
    public interface OnEditTextAttachedListener {
        void onEditTextAttached(@NonNull TextInputLayout textInputLayout);
    }

    /* loaded from: classes3.dex */
    public interface OnEndIconChangedListener {
        void onEndIconChanged(@NonNull TextInputLayout textInputLayout, int i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        @Nullable
        CharSequence error;
        boolean isEndIconChecked;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.error) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            TextUtils.writeToParcel(this.error, parcel, i8);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
        }

        SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText != null && this.boxBackgroundMode == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                EditText editText = this.editText;
                ViewCompat.setPaddingRelative(editText, ViewCompat.getPaddingStart(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                EditText editText2 = this.editText;
                ViewCompat.setPaddingRelative(editText2, ViewCompat.getPaddingStart(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    private void applyBoxAttributes() {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        ShapeAppearanceModel shapeAppearanceModel2 = this.shapeAppearanceModel;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            this.boxBackground.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (canDrawOutlineStroke()) {
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int calculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = calculateBoxBackgroundColor;
        this.boxBackground.setFillColor(ColorStateList.valueOf(calculateBoxBackgroundColor));
        applyBoxUnderlineAttributes();
        updateEditTextBoxBackgroundIfNeeded();
    }

    private void applyBoxUnderlineAttributes() {
        ColorStateList valueOf;
        if (this.boxUnderlineDefault != null && this.boxUnderlineFocused != null) {
            if (canDrawStroke()) {
                MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
                if (this.editText.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.defaultStrokeColor);
                } else {
                    valueOf = ColorStateList.valueOf(this.boxStrokeColor);
                }
                materialShapeDrawable.setFillColor(valueOf);
                this.boxUnderlineFocused.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
            }
            invalidate();
        }
    }

    private void applyCutoutPadding(@NonNull RectF rectF) {
        float f8 = rectF.left;
        int i8 = this.boxLabelCutoutPaddingPx;
        rectF.left = f8 - i8;
        rectF.right += i8;
    }

    private void assignBoxBackgroundByMode() {
        int i8 = this.boxBackgroundMode;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    if (this.hintEnabled && !(this.boxBackground instanceof CutoutDrawable)) {
                        this.boxBackground = CutoutDrawable.create(this.shapeAppearanceModel);
                    } else {
                        this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
                    }
                    this.boxUnderlineDefault = null;
                    this.boxUnderlineFocused = null;
                    return;
                }
                throw new IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new MaterialShapeDrawable();
            this.boxUnderlineFocused = new MaterialShapeDrawable();
            return;
        }
        this.boxBackground = null;
        this.boxUnderlineDefault = null;
        this.boxUnderlineFocused = null;
    }

    private int calculateBoxBackgroundColor() {
        int i8 = this.boxBackgroundColor;
        if (this.boxBackgroundMode == 1) {
            return MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface, 0), this.boxBackgroundColor);
        }
        return i8;
    }

    @NonNull
    private Rect calculateCollapsedTextBounds(@NonNull Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
            rect2.bottom = rect.bottom;
            int i8 = this.boxBackgroundMode;
            if (i8 != 1) {
                if (i8 != 2) {
                    rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, isLayoutRtl);
                    rect2.top = getPaddingTop();
                    rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, isLayoutRtl);
                    return rect2;
                }
                rect2.left = rect.left + this.editText.getPaddingLeft();
                rect2.top = rect.top - calculateLabelMarginTop();
                rect2.right = rect.right - this.editText.getPaddingRight();
                return rect2;
            }
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, isLayoutRtl);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, isLayoutRtl);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int calculateExpandedLabelBottom(@NonNull Rect rect, @NonNull Rect rect2, float f8) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect2.top + f8);
        }
        return rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(@NonNull Rect rect, float f8) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect.centerY() - (f8 / 2.0f));
        }
        return rect.top + this.editText.getCompoundPaddingTop();
    }

    @NonNull
    private Rect calculateExpandedTextBounds(@NonNull Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            float expandedTextHeight = this.collapsingTextHelper.getExpandedTextHeight();
            rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
            rect2.top = calculateExpandedLabelTop(rect, expandedTextHeight);
            rect2.right = rect.right - this.editText.getCompoundPaddingRight();
            rect2.bottom = calculateExpandedLabelBottom(rect, rect2, expandedTextHeight);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int calculateLabelMarginTop() {
        float collapsedTextHeight;
        if (!this.hintEnabled) {
            return 0;
        }
        int i8 = this.boxBackgroundMode;
        if (i8 != 0) {
            if (i8 != 2) {
                return 0;
            }
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight() / 2.0f;
        } else {
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight();
        }
        return (int) collapsedTextHeight;
    }

    private boolean canDrawOutlineStroke() {
        if (this.boxBackgroundMode == 2 && canDrawStroke()) {
            return true;
        }
        return false;
    }

    private boolean canDrawStroke() {
        if (this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0) {
            return true;
        }
        return false;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((CutoutDrawable) this.boxBackground).removeCutout();
        }
    }

    private void collapseHint(boolean z8) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z8 && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        this.startLayout.onHintStateChanged(false);
        this.endLayout.onHintStateChanged(false);
    }

    private Fade createPlaceholderFadeTransition() {
        Fade fade = new Fade();
        fade.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationShort2, 87));
        fade.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
        return fade;
    }

    private boolean cutoutEnabled() {
        if (this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof CutoutDrawable)) {
            return true;
        }
        return false;
    }

    private void dispatchOnEditTextAttached() {
        Iterator<OnEditTextAttachedListener> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEditTextAttached(this);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.boxUnderlineFocused != null && (materialShapeDrawable = this.boxUnderlineDefault) != null) {
            materialShapeDrawable.draw(canvas);
            if (this.editText.isFocused()) {
                Rect bounds = this.boxUnderlineFocused.getBounds();
                Rect bounds2 = this.boxUnderlineDefault.getBounds();
                float expansionFraction = this.collapsingTextHelper.getExpansionFraction();
                int centerX = bounds2.centerX();
                bounds.left = AnimationUtils.lerp(centerX, bounds2.left, expansionFraction);
                bounds.right = AnimationUtils.lerp(centerX, bounds2.right, expansionFraction);
                this.boxUnderlineFocused.draw(canvas);
            }
        }
    }

    private void drawHint(@NonNull Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.draw(canvas);
        }
    }

    private void expandHint(boolean z8) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z8 && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        this.startLayout.onHintStateChanged(true);
        this.endLayout.onHintStateChanged(true);
    }

    private MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean z8) {
        float f8;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z8) {
            f8 = dimensionPixelOffset2;
        } else {
            f8 = 0.0f;
        }
        EditText editText = this.editText;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel build = ShapeAppearanceModel.builder().setTopLeftCornerSize(f8).setTopRightCornerSize(f8).setBottomLeftCornerSize(dimensionPixelOffset2).setBottomRightCornerSize(dimensionPixelOffset2).build();
        EditText editText2 = this.editText;
        if (editText2 instanceof MaterialAutoCompleteTextView) {
            colorStateList = ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(getContext(), dimensionPixelOffset, colorStateList);
        createWithElevationOverlay.setShapeAppearanceModel(build);
        createWithElevationOverlay.setPadding(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return createWithElevationOverlay;
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.editText;
        if ((editText instanceof AutoCompleteTextView) && !EditTextUtils.isEditable(editText)) {
            int color = MaterialColors.getColor(this.editText, R.attr.colorControlHighlight);
            int i8 = this.boxBackgroundMode;
            if (i8 == 2) {
                return getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
            }
            if (i8 == 1) {
                return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
            }
            return null;
        }
        return this.boxBackground;
    }

    private static Drawable getFilledBoxBackgroundWithRipple(MaterialShapeDrawable materialShapeDrawable, int i8, int i9, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.layer(i9, i8, 0.1f), i8}), materialShapeDrawable, materialShapeDrawable);
    }

    private int getLabelLeftBoundAlignedWithPrefixAndSuffix(int i8, boolean z8) {
        int compoundPaddingLeft;
        if (!z8 && getPrefixText() != null) {
            compoundPaddingLeft = this.startLayout.getPrefixTextStartOffset();
        } else if (z8 && getSuffixText() != null) {
            compoundPaddingLeft = this.endLayout.getSuffixTextEndOffset();
        } else {
            compoundPaddingLeft = this.editText.getCompoundPaddingLeft();
        }
        return i8 + compoundPaddingLeft;
    }

    private int getLabelRightBoundAlignedWithPrefixAndSuffix(int i8, boolean z8) {
        int compoundPaddingRight;
        if (!z8 && getSuffixText() != null) {
            compoundPaddingRight = this.endLayout.getSuffixTextEndOffset();
        } else if (z8 && getPrefixText() != null) {
            compoundPaddingRight = this.startLayout.getPrefixTextStartOffset();
        } else {
            compoundPaddingRight = this.editText.getCompoundPaddingRight();
        }
        return i8 - compoundPaddingRight;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.filledDropDownMenuBackground == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.filledDropDownMenuBackground = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
        }
        return this.filledDropDownMenuBackground;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.outlinedDropDownMenuBackground == null) {
            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, MaterialShapeDrawable materialShapeDrawable, int i8, int[][] iArr) {
        int color = MaterialColors.getColor(context, R.attr.colorSurface, LOG_TAG);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int layer = MaterialColors.layer(i8, color, 0.1f);
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{layer, 0}));
        materialShapeDrawable2.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{layer, color});
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView != null && this.placeholderEnabled) {
            textView.setText((CharSequence) null);
            TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeOut);
            this.placeholderTextView.setVisibility(4);
        }
    }

    private boolean isOnError() {
        if (!shouldShowError() && (this.counterView == null || !this.counterOverflowed)) {
            return false;
        }
        return true;
    }

    private boolean isSingleLineFilledTextField() {
        if (this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGlobalLayout$1() {
        this.editText.requestLayout();
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    private void openCutout() {
        if (!cutoutEnabled()) {
            return;
        }
        RectF rectF = this.tmpRectF;
        this.collapsingTextHelper.getCollapsedTextActualBounds(rectF, this.editText.getWidth(), this.editText.getGravity());
        if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
            applyCutoutPadding(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
            ((CutoutDrawable) this.boxBackground).setCutout(rectF);
        }
    }

    private void recalculateCutout() {
        if (cutoutEnabled() && !this.hintExpanded) {
            closeCutout();
            openCutout();
        }
    }

    private static void recursiveSetEnabled(@NonNull ViewGroup viewGroup, boolean z8) {
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            childAt.setEnabled(z8);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z8);
            }
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (!(editText instanceof AutoCompleteTextView)) {
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        if (autoCompleteTextView.getDropDownBackground() == null) {
            int i8 = this.boxBackgroundMode;
            if (i8 == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
            } else if (i8 == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.editText = editText;
            int i8 = this.minEms;
            if (i8 != -1) {
                setMinEms(i8);
            } else {
                setMinWidth(this.minWidth);
            }
            int i9 = this.maxEms;
            if (i9 != -1) {
                setMaxEms(i9);
            } else {
                setMaxWidth(this.maxWidth);
            }
            this.boxBackgroundApplied = false;
            onApplyBoxBackgroundMode();
            setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
            this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
            this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
            int i10 = Build.VERSION.SDK_INT;
            this.collapsingTextHelper.setExpandedLetterSpacing(this.editText.getLetterSpacing());
            int gravity = this.editText.getGravity();
            this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
            this.collapsingTextHelper.setExpandedTextGravity(gravity);
            this.originalEditTextMinimumHeight = ViewCompat.getMinimumHeight(editText);
            this.editText.addTextChangedListener(new TextWatcher(editText) { // from class: com.google.android.material.textfield.TextInputLayout.1
                int previousLineCount;
                final /* synthetic */ EditText val$editText;

                {
                    this.val$editText = editText;
                    this.previousLineCount = editText.getLineCount();
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(@NonNull Editable editable) {
                    TextInputLayout.this.updateLabelState(!r0.restoringSavedState);
                    TextInputLayout textInputLayout = TextInputLayout.this;
                    if (textInputLayout.counterEnabled) {
                        textInputLayout.updateCounter(editable);
                    }
                    if (TextInputLayout.this.placeholderEnabled) {
                        TextInputLayout.this.updatePlaceholderText(editable);
                    }
                    int lineCount = this.val$editText.getLineCount();
                    int i11 = this.previousLineCount;
                    if (lineCount != i11) {
                        if (lineCount < i11) {
                            int minimumHeight = ViewCompat.getMinimumHeight(this.val$editText);
                            int i12 = TextInputLayout.this.originalEditTextMinimumHeight;
                            if (minimumHeight != i12) {
                                this.val$editText.setMinimumHeight(i12);
                            }
                        }
                        this.previousLineCount = lineCount;
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                }
            });
            if (this.defaultHintTextColor == null) {
                this.defaultHintTextColor = this.editText.getHintTextColors();
            }
            if (this.hintEnabled) {
                if (TextUtils.isEmpty(this.hint)) {
                    CharSequence hint = this.editText.getHint();
                    this.originalHint = hint;
                    setHint(hint);
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (i10 >= 29) {
                updateCursorColor();
            }
            if (this.counterView != null) {
                updateCounter(this.editText.getText());
            }
            updateEditTextBackground();
            this.indicatorViewController.adjustIndicatorPadding();
            this.startLayout.bringToFront();
            this.endLayout.bringToFront();
            dispatchOnEditTextAttached();
            this.endLayout.updateSuffixTextViewPadding();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            updateLabelState(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.hint)) {
            this.hint = charSequence;
            this.collapsingTextHelper.setText(charSequence);
            if (!this.hintExpanded) {
                openCutout();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z8) {
        if (this.placeholderEnabled == z8) {
            return;
        }
        if (z8) {
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z8;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        if ((this.endLayout.isErrorIconVisible() || ((this.endLayout.hasEndIcon() && isEndIconVisible()) || this.endLayout.getSuffixText() != null)) && this.endLayout.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView != null && this.placeholderEnabled && !TextUtils.isEmpty(this.placeholderText)) {
            this.placeholderTextView.setText(this.placeholderText);
            TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeIn);
            this.placeholderTextView.setVisibility(0);
            this.placeholderTextView.bringToFront();
            announceForAccessibility(this.placeholderText);
        }
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void updateBoxUnderlineBounds(@NonNull Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
        if (materialShapeDrawable != null) {
            int i8 = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i8 - this.boxStrokeWidthDefaultPx, rect.right, i8);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.boxUnderlineFocused;
        if (materialShapeDrawable2 != null) {
            int i9 = rect.bottom;
            materialShapeDrawable2.setBounds(rect.left, i9 - this.boxStrokeWidthFocusedPx, rect.right, i9);
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? null : editText.getText());
        }
    }

    private static void updateCounterContentDescription(@NonNull Context context, @NonNull TextView textView, int i8, int i9, boolean z8) {
        int i10;
        if (z8) {
            i10 = R.string.character_counter_overflowed_content_description;
        } else {
            i10 = R.string.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i10, Integer.valueOf(i8), Integer.valueOf(i9)));
    }

    private void updateCounterTextAppearanceAndColor() {
        int i8;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            if (this.counterOverflowed) {
                i8 = this.counterOverflowTextAppearance;
            } else {
                i8 = this.counterTextAppearance;
            }
            setTextAppearanceCompatWithErrorFallback(textView, i8);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (this.counterOverflowed && (colorStateList = this.counterOverflowTextColor) != null) {
                this.counterView.setTextColor(colorStateList);
            }
        }
    }

    @RequiresApi(29)
    private void updateCursorColor() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.cursorColor;
        if (colorStateList2 == null) {
            colorStateList2 = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorControlActivated);
        }
        EditText editText = this.editText;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.editText.getTextCursorDrawable();
                Drawable mutate = DrawableCompat.wrap(textCursorDrawable2).mutate();
                if (isOnError() && (colorStateList = this.cursorErrorColor) != null) {
                    colorStateList2 = colorStateList;
                }
                DrawableCompat.setTintList(mutate, colorStateList2);
            }
        }
    }

    private void updateEditTextBoxBackground() {
        ViewCompat.setBackground(this.editText, getEditTextBoxBackground());
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int max;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (max = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(max);
        return true;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int calculateLabelMarginTop = calculateLabelMarginTop();
            if (calculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = calculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView != null && (editText = this.editText) != null) {
            this.placeholderTextView.setGravity(editText.getGravity());
            this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
        }
    }

    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? null : editText.getText());
    }

    private void updateStrokeErrorColor(boolean z8, boolean z9) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z8) {
            this.boxStrokeColor = colorForState2;
        } else if (z9) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    public void addOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.add(onEditTextAttachedListener);
        if (this.editText != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.endLayout.addOnEndIconChangedListener(onEndIconChangedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i8, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.inputFrame.addView(view, layoutParams2);
            this.inputFrame.setLayoutParams(layoutParams);
            updateInputLayoutMargins();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i8, layoutParams);
    }

    @VisibleForTesting
    void animateToExpansionFraction(float f8) {
        if (this.collapsingTextHelper.getExpansionFraction() == f8) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.animator.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationMedium4, LABEL_SCALE_ANIMATION_DURATION));
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    TextInputLayout.this.collapsingTextHelper.setExpansionFraction(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.animator.setFloatValues(this.collapsingTextHelper.getExpansionFraction(), f8);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endLayout.clearOnEndIconChangedListeners();
    }

    @VisibleForTesting
    boolean cutoutIsOpen() {
        if (cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i8) {
        AutofillId autofillId;
        ViewStructure newChild;
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i8);
            return;
        }
        if (this.originalHint == null) {
            autofillId = getAutofillId();
            viewStructure.setAutofillId(autofillId);
            onProvideAutofillStructure(viewStructure, i8);
            onProvideAutofillVirtualStructure(viewStructure, i8);
            viewStructure.setChildCount(this.inputFrame.getChildCount());
            for (int i9 = 0; i9 < this.inputFrame.getChildCount(); i9++) {
                View childAt = this.inputFrame.getChildAt(i9);
                newChild = viewStructure.newChild(i9);
                childAt.dispatchProvideAutofillStructure(newChild, i8);
                if (childAt == this.editText) {
                    newChild.setHint(getHint());
                }
            }
            return;
        }
        boolean z8 = this.isProvidingHint;
        this.isProvidingHint = false;
        CharSequence hint = editText.getHint();
        this.editText.setHint(this.originalHint);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i8);
        } finally {
            this.editText.setHint(hint);
            this.isProvidingHint = z8;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z8;
        if (this.inDrawableStateChanged) {
            return;
        }
        boolean z9 = true;
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        if (collapsingTextHelper != null) {
            z8 = collapsingTextHelper.setState(drawableState);
        } else {
            z8 = false;
        }
        if (this.editText != null) {
            if (!ViewCompat.isLaidOut(this) || !isEnabled()) {
                z9 = false;
            }
            updateLabelState(z9);
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (z8) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop();
        }
        return super.getBaseline();
    }

    @NonNull
    MaterialShapeDrawable getBoxBackground() {
        int i8 = this.boxBackgroundMode;
        if (i8 != 1 && i8 != 2) {
            throw new IllegalStateException();
        }
        return this.boxBackground;
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopStart() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    @Nullable
    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.counterOverflowTextColor;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorColor() {
        return this.cursorColor;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorErrorColor() {
        return this.cursorErrorColor;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    @Nullable
    public EditText getEditText() {
        return this.editText;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.endLayout.getEndIconContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.endLayout.getEndIconDrawable();
    }

    public int getEndIconMinSize() {
        return this.endLayout.getEndIconMinSize();
    }

    public int getEndIconMode() {
        return this.endLayout.getEndIconMode();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.endLayout.getEndIconScaleType();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.endLayout.getEndIconView();
    }

    @Nullable
    public CharSequence getError() {
        if (this.indicatorViewController.isErrorEnabled()) {
            return this.indicatorViewController.getErrorText();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.indicatorViewController.getErrorAccessibilityLiveRegion();
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.getErrorContentDescription();
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.endLayout.getErrorIconDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        if (this.indicatorViewController.isHelperTextEnabled()) {
            return this.indicatorViewController.getHelperText();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.getHelperTextViewCurrentTextColor();
    }

    @Nullable
    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    @VisibleForTesting
    final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    @VisibleForTesting
    final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    @NonNull
    public LengthCounter getLengthCounter() {
        return this.lengthCounter;
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinEms() {
        return this.minEms;
    }

    @Px
    public int getMinWidth() {
        return this.minWidth;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.getPasswordVisibilityToggleContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.getPasswordVisibilityToggleDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.startLayout.getPrefixText();
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.startLayout.getPrefixTextColor();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.startLayout.getPrefixTextView();
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.startLayout.getStartIconContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.startLayout.getStartIconDrawable();
    }

    public int getStartIconMinSize() {
        return this.startLayout.getStartIconMinSize();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.startLayout.getStartIconScaleType();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.endLayout.getSuffixText();
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.endLayout.getSuffixTextColor();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.endLayout.getSuffixTextView();
    }

    @Nullable
    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endLayout.isEndIconCheckable();
    }

    public boolean isEndIconVisible() {
        return this.endLayout.isEndIconVisible();
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.isErrorEnabled();
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    @VisibleForTesting
    final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.helperTextIsDisplayed();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.isHelperTextEnabled();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endLayout.isPasswordVisibilityToggleEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startLayout.isStartIconCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startLayout.isStartIconVisible();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.endLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.globalLayoutListenerAdded = false;
        boolean updateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean updateDummyDrawables = updateDummyDrawables();
        if (updateEditTextHeightBasedOnIcon || updateDummyDrawables) {
            this.editText.post(new Runnable() { // from class: com.google.android.material.textfield.v
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputLayout.this.lambda$onGlobalLayout$1();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
                this.collapsingTextHelper.setExpandedTextGravity(gravity);
                this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.setExpandedBounds(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.recalculate();
                if (cutoutEnabled() && !this.hintExpanded) {
                    openCutout();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (!this.globalLayoutListenerAdded) {
            this.endLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.globalLayoutListenerAdded = true;
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.updateSuffixTextViewPadding();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    TextInputLayout.this.endLayout.checkEndIcon();
                }
            });
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        boolean z8 = true;
        if (i8 != 1) {
            z8 = false;
        }
        if (z8 != this.areCornerRadiiRtl) {
            float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize2 = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize3 = this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize4 = this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
            CornerTreatment topLeftCorner = this.shapeAppearanceModel.getTopLeftCorner();
            CornerTreatment topRightCorner = this.shapeAppearanceModel.getTopRightCorner();
            ShapeAppearanceModel build = ShapeAppearanceModel.builder().setTopLeftCorner(topRightCorner).setTopRightCorner(topLeftCorner).setBottomLeftCorner(this.shapeAppearanceModel.getBottomRightCorner()).setBottomRightCorner(this.shapeAppearanceModel.getBottomLeftCorner()).setTopLeftCornerSize(cornerSize2).setTopRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize4).setBottomRightCornerSize(cornerSize3).build();
            this.areCornerRadiiRtl = z8;
            setShapeAppearanceModel(build);
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            savedState.error = getError();
        }
        savedState.isEndIconChecked = this.endLayout.isEndIconChecked();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z8) {
        this.endLayout.togglePasswordVisibilityToggle(z8);
    }

    public void refreshEndIconDrawableState() {
        this.endLayout.refreshEndIconDrawableState();
    }

    public void refreshErrorIconDrawableState() {
        this.endLayout.refreshErrorIconDrawableState();
    }

    public void refreshStartIconDrawableState() {
        this.startLayout.refreshStartIconDrawableState();
    }

    public void removeOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.remove(onEditTextAttachedListener);
    }

    public void removeOnEndIconChangedListener(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.endLayout.removeOnEndIconChangedListener(onEndIconChangedListener);
    }

    public void setBoxBackgroundColor(@ColorInt int i8) {
        if (this.boxBackgroundColor != i8) {
            this.boxBackgroundColor = i8;
            this.defaultFilledBackgroundColor = i8;
            this.focusedFilledBackgroundColor = i8;
            this.hoveredFilledBackgroundColor = i8;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i8) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i8));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i8) {
        if (i8 == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i8;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i8) {
        this.boxCollapsedPaddingTopPx = i8;
    }

    public void setBoxCornerFamily(int i8) {
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCorner(i8, this.shapeAppearanceModel.getTopLeftCornerSize()).setTopRightCorner(i8, this.shapeAppearanceModel.getTopRightCornerSize()).setBottomLeftCorner(i8, this.shapeAppearanceModel.getBottomLeftCornerSize()).setBottomRightCorner(i8, this.shapeAppearanceModel.getBottomRightCornerSize()).build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadii(float f8, float f9, float f10, float f11) {
        float f12;
        float f13;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        this.areCornerRadiiRtl = isLayoutRtl;
        if (isLayoutRtl) {
            f12 = f9;
        } else {
            f12 = f8;
        }
        if (!isLayoutRtl) {
            f8 = f9;
        }
        if (isLayoutRtl) {
            f13 = f11;
        } else {
            f13 = f10;
        }
        if (!isLayoutRtl) {
            f10 = f11;
        }
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null || materialShapeDrawable.getTopLeftCornerResolvedSize() != f12 || this.boxBackground.getTopRightCornerResolvedSize() != f8 || this.boxBackground.getBottomLeftCornerResolvedSize() != f13 || this.boxBackground.getBottomRightCornerResolvedSize() != f10) {
            this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f12).setTopRightCornerSize(f8).setBottomLeftCornerSize(f13).setBottomRightCornerSize(f10).build();
            applyBoxAttributes();
        }
    }

    public void setBoxCornerRadiiResources(@DimenRes int i8, @DimenRes int i9, @DimenRes int i10, @DimenRes int i11) {
        setBoxCornerRadii(getContext().getResources().getDimension(i8), getContext().getResources().getDimension(i9), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i10));
    }

    public void setBoxStrokeColor(@ColorInt int i8) {
        if (this.focusedStrokeColor != i8) {
            this.focusedStrokeColor = i8;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i8) {
        this.boxStrokeWidthDefaultPx = i8;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i8) {
        this.boxStrokeWidthFocusedPx = i8;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i8) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i8));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i8) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i8));
    }

    public void setCounterEnabled(boolean z8) {
        if (this.counterEnabled != z8) {
            if (z8) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.addIndicator(this.counterView, 2);
                MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.removeIndicator(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z8;
        }
    }

    public void setCounterMaxLength(int i8) {
        if (this.counterMaxLength != i8) {
            if (i8 > 0) {
                this.counterMaxLength = i8;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i8) {
        if (this.counterOverflowTextAppearance != i8) {
            this.counterOverflowTextAppearance = i8;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i8) {
        if (this.counterTextAppearance != i8) {
            this.counterTextAppearance = i8;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    @RequiresApi(29)
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.cursorColor != colorStateList) {
            this.cursorColor = colorStateList;
            updateCursorColor();
        }
    }

    @RequiresApi(29)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.cursorErrorColor != colorStateList) {
            this.cursorErrorColor = colorStateList;
            if (isOnError()) {
                updateCursorColor();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        recursiveSetEnabled(this, z8);
        super.setEnabled(z8);
    }

    public void setEndIconActivated(boolean z8) {
        this.endLayout.setEndIconActivated(z8);
    }

    public void setEndIconCheckable(boolean z8) {
        this.endLayout.setEndIconCheckable(z8);
    }

    public void setEndIconContentDescription(@StringRes int i8) {
        this.endLayout.setEndIconContentDescription(i8);
    }

    public void setEndIconDrawable(@DrawableRes int i8) {
        this.endLayout.setEndIconDrawable(i8);
    }

    public void setEndIconMinSize(@IntRange(from = 0) int i8) {
        this.endLayout.setEndIconMinSize(i8);
    }

    public void setEndIconMode(int i8) {
        this.endLayout.setEndIconMode(i8);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.endLayout.setEndIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.endLayout.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.endLayout.setEndIconScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        this.endLayout.setEndIconTintList(colorStateList);
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.endLayout.setEndIconTintMode(mode);
    }

    public void setEndIconVisible(boolean z8) {
        this.endLayout.setEndIconVisible(z8);
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.indicatorViewController.isErrorEnabled()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.showError(charSequence);
        } else {
            this.indicatorViewController.hideError();
        }
    }

    public void setErrorAccessibilityLiveRegion(int i8) {
        this.indicatorViewController.setErrorAccessibilityLiveRegion(i8);
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.indicatorViewController.setErrorContentDescription(charSequence);
    }

    public void setErrorEnabled(boolean z8) {
        this.indicatorViewController.setErrorEnabled(z8);
    }

    public void setErrorIconDrawable(@DrawableRes int i8) {
        this.endLayout.setErrorIconDrawable(i8);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.endLayout.setErrorIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.endLayout.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        this.endLayout.setErrorIconTintList(colorStateList);
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.endLayout.setErrorIconTintMode(mode);
    }

    public void setErrorTextAppearance(@StyleRes int i8) {
        this.indicatorViewController.setErrorTextAppearance(i8);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.indicatorViewController.setErrorViewTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z8) {
        if (this.expandedHintEnabled != z8) {
            this.expandedHintEnabled = z8;
            updateLabelState(false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.showHelper(charSequence);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.indicatorViewController.setHelperTextViewTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z8) {
        this.indicatorViewController.setHelperTextEnabled(z8);
    }

    public void setHelperTextTextAppearance(@StyleRes int i8) {
        this.indicatorViewController.setHelperTextAppearance(i8);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z8) {
        this.hintAnimationEnabled = z8;
    }

    public void setHintEnabled(boolean z8) {
        if (z8 != this.hintEnabled) {
            this.hintEnabled = z8;
            if (!z8) {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i8) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i8);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setLengthCounter(@NonNull LengthCounter lengthCounter) {
        this.lengthCounter = lengthCounter;
    }

    public void setMaxEms(int i8) {
        this.maxEms = i8;
        EditText editText = this.editText;
        if (editText != null && i8 != -1) {
            editText.setMaxEms(i8);
        }
    }

    public void setMaxWidth(@Px int i8) {
        this.maxWidth = i8;
        EditText editText = this.editText;
        if (editText != null && i8 != -1) {
            editText.setMaxWidth(i8);
        }
    }

    public void setMaxWidthResource(@DimenRes int i8) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i8));
    }

    public void setMinEms(int i8) {
        this.minEms = i8;
        EditText editText = this.editText;
        if (editText != null && i8 != -1) {
            editText.setMinEms(i8);
        }
    }

    public void setMinWidth(@Px int i8) {
        this.minWidth = i8;
        EditText editText = this.editText;
        if (editText != null && i8 != -1) {
            editText.setMinWidth(i8);
        }
    }

    public void setMinWidthResource(@DimenRes int i8) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i8));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i8) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(i8);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i8) {
        this.endLayout.setPasswordVisibilityToggleDrawable(i8);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z8) {
        this.endLayout.setPasswordVisibilityToggleEnabled(z8);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.endLayout.setPasswordVisibilityToggleTintList(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.endLayout.setPasswordVisibilityToggleTintMode(mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.placeholderTextView == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.placeholderTextView, 2);
            Fade createPlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = createPlaceholderFadeTransition;
            createPlaceholderFadeTransition.setStartDelay(67L);
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(@StyleRes int i8) {
        this.placeholderTextAppearance = i8;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i8);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.startLayout.setPrefixText(charSequence);
    }

    public void setPrefixTextAppearance(@StyleRes int i8) {
        this.startLayout.setPrefixTextAppearance(i8);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.startLayout.setPrefixTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null && materialShapeDrawable.getShapeAppearanceModel() != shapeAppearanceModel) {
            this.shapeAppearanceModel = shapeAppearanceModel;
            applyBoxAttributes();
        }
    }

    public void setStartIconCheckable(boolean z8) {
        this.startLayout.setStartIconCheckable(z8);
    }

    public void setStartIconContentDescription(@StringRes int i8) {
        setStartIconContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i8) {
        setStartIconDrawable(i8 != 0 ? AppCompatResources.getDrawable(getContext(), i8) : null);
    }

    public void setStartIconMinSize(@IntRange(from = 0) int i8) {
        this.startLayout.setStartIconMinSize(i8);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.startLayout.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.startLayout.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.startLayout.setStartIconScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        this.startLayout.setStartIconTintList(colorStateList);
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.startLayout.setStartIconTintMode(mode);
    }

    public void setStartIconVisible(boolean z8) {
        this.startLayout.setStartIconVisible(z8);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.endLayout.setSuffixText(charSequence);
    }

    public void setSuffixTextAppearance(@StyleRes int i8) {
        this.endLayout.setSuffixTextAppearance(i8);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.endLayout.setSuffixTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTextAppearanceCompatWithErrorFallback(@NonNull TextView textView, @StyleRes int i8) {
        try {
            TextViewCompat.setTextAppearance(textView, i8);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            TextViewCompat.setTextAppearance(textView, R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(ContextCompat.getColor(getContext(), R.color.design_error));
        }
    }

    public void setTextInputAccessibilityDelegate(@Nullable AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.editText;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.setTypefaces(typeface);
            this.indicatorViewController.setTypefaces(typeface);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldShowError() {
        return this.indicatorViewController.errorShouldBeShown();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean updateDummyDrawables() {
        boolean z8;
        if (this.editText == null) {
            return false;
        }
        boolean z9 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                TextViewCompat.setCompoundDrawablesRelative(this.editText, drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z8 = true;
            }
            z8 = false;
        } else {
            if (this.startDummyDrawable != null) {
                Drawable[] compoundDrawablesRelative2 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
                TextViewCompat.setCompoundDrawablesRelative(this.editText, null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.startDummyDrawable = null;
                z8 = true;
            }
            z8 = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.endLayout.getSuffixTextView().getMeasuredWidth() - this.editText.getPaddingRight();
            CheckableImageButton currentEndIconView = this.endLayout.getCurrentEndIconView();
            if (currentEndIconView != null) {
                measuredWidth2 = measuredWidth2 + currentEndIconView.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) currentEndIconView.getLayoutParams());
            }
            Drawable[] compoundDrawablesRelative3 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 != null && this.endDummyDrawableWidth != measuredWidth2) {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.endDummyDrawable, compoundDrawablesRelative3[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.endDummyDrawable = colorDrawable2;
                    this.endDummyDrawableWidth = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.endDummyDrawable;
                if (drawable4 != drawable5) {
                    this.originalEditTextEndDrawable = drawable4;
                    TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z9 = z8;
                }
            }
        } else if (this.endDummyDrawable != null) {
            Drawable[] compoundDrawablesRelative4 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            if (compoundDrawablesRelative4[2] == this.endDummyDrawable) {
                TextViewCompat.setCompoundDrawablesRelative(this.editText, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.originalEditTextEndDrawable, compoundDrawablesRelative4[3]);
            } else {
                z9 = z8;
            }
            this.endDummyDrawable = null;
        } else {
            return z8;
        }
        return z9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (shouldShowError()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.clearColorFilter(background);
            this.editText.refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateEditTextBoxBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText != null && this.boxBackground != null) {
            if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
                updateEditTextBoxBackground();
                this.boxBackgroundApplied = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateLabelState(boolean z8) {
        updateLabelState(z8, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateTextInputBoxState() {
        boolean z8;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground != null && this.boxBackgroundMode != 0) {
            boolean z9 = false;
            if (!isFocused() && ((editText2 = this.editText) == null || !editText2.hasFocus())) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (isHovered() || ((editText = this.editText) != null && editText.isHovered())) {
                z9 = true;
            }
            if (!isEnabled()) {
                this.boxStrokeColor = this.disabledColor;
            } else if (shouldShowError()) {
                if (this.strokeErrorColor != null) {
                    updateStrokeErrorColor(z8, z9);
                } else {
                    this.boxStrokeColor = getErrorCurrentTextColors();
                }
            } else if (this.counterOverflowed && (textView = this.counterView) != null) {
                if (this.strokeErrorColor != null) {
                    updateStrokeErrorColor(z8, z9);
                } else {
                    this.boxStrokeColor = textView.getCurrentTextColor();
                }
            } else if (z8) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z9) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                updateCursorColor();
            }
            this.endLayout.onTextInputBoxStateUpdated();
            refreshStartIconDrawableState();
            if (this.boxBackgroundMode == 2) {
                int i8 = this.boxStrokeWidthPx;
                if (z8 && isEnabled()) {
                    this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
                } else {
                    this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
                }
                if (this.boxStrokeWidthPx != i8) {
                    recalculateCutout();
                }
            }
            if (this.boxBackgroundMode == 1) {
                if (!isEnabled()) {
                    this.boxBackgroundColor = this.disabledFilledBackgroundColor;
                } else if (z9 && !z8) {
                    this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
                } else if (z8) {
                    this.boxBackgroundColor = this.focusedFilledBackgroundColor;
                } else {
                    this.boxBackgroundColor = this.defaultFilledBackgroundColor;
                }
            }
            applyBoxAttributes();
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    private void updateLabelState(boolean z8, boolean z9) {
        ColorStateList colorStateList;
        TextView textView;
        int i8;
        boolean isEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z10 = false;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        if (editText2 != null && editText2.hasFocus()) {
            z10 = true;
        }
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            if (colorStateList3 != null) {
                i8 = colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor);
            } else {
                i8 = this.disabledColor;
            }
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(i8));
        } else if (shouldShowError()) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(this.indicatorViewController.getErrorViewTextColors());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(textView.getTextColors());
        } else if (z10 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
        }
        if (!z11 && this.expandedHintEnabled && (!isEnabled() || !z10)) {
            if (z9 || !this.hintExpanded) {
                expandHint(z8);
                return;
            }
            return;
        }
        if (z9 || this.hintExpanded) {
            collapseHint(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(@Nullable Editable editable) {
        if (this.lengthCounter.countLength(editable) == 0 && !this.hintExpanded) {
            showPlaceholderText();
        } else {
            hidePlaceholderText();
        }
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        this.endLayout.setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.endLayout.setEndIconDrawable(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.endLayout.setErrorIconDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.endLayout.setPasswordVisibilityToggleDrawable(drawable);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.startLayout.setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.startLayout.setStartIconDrawable(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(@androidx.annotation.NonNull android.content.Context r22, @androidx.annotation.Nullable android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    void updateCounter(@Nullable Editable editable) {
        int countLength = this.lengthCounter.countLength(editable);
        boolean z8 = this.counterOverflowed;
        int i8 = this.counterMaxLength;
        if (i8 == -1) {
            this.counterView.setText(String.valueOf(countLength));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = countLength > i8;
            updateCounterContentDescription(getContext(), this.counterView, countLength, this.counterMaxLength, this.counterOverflowed);
            if (z8 != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(countLength), Integer.valueOf(this.counterMaxLength))));
        }
        if (this.editText == null || z8 == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public void setHint(@StringRes int i8) {
        setHint(i8 != 0 ? getResources().getText(i8) : null);
    }
}
