package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class StartCompoundLayout extends LinearLayout {
    private boolean hintExpanded;

    @Nullable
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private int startIconMinSize;
    private View.OnLongClickListener startIconOnLongClickListener;

    @NonNull
    private ImageView.ScaleType startIconScaleType;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StartCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.prefixTextView = appCompatTextView;
        initStartIconView(tintTypedArray);
        initPrefixTextView(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void initPrefixTextView(TintTypedArray tintTypedArray) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(R.id.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.setAccessibilityLiveRegion(this.prefixTextView, 1);
        setPrefixTextAppearance(tintTypedArray.getResourceId(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i8 = R.styleable.TextInputLayout_prefixTextColor;
        if (tintTypedArray.hasValue(i8)) {
            setPrefixTextColor(tintTypedArray.getColorStateList(i8));
        }
        setPrefixText(tintTypedArray.getText(R.styleable.TextInputLayout_prefixText));
    }

    private void initStartIconView(TintTypedArray tintTypedArray) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i8 = R.styleable.TextInputLayout_startIconTint;
        if (tintTypedArray.hasValue(i8)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, i8);
        }
        int i9 = R.styleable.TextInputLayout_startIconTintMode;
        if (tintTypedArray.hasValue(i9)) {
            this.startIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(i9, -1), null);
        }
        int i10 = R.styleable.TextInputLayout_startIconDrawable;
        if (tintTypedArray.hasValue(i10)) {
            setStartIconDrawable(tintTypedArray.getDrawable(i10));
            int i11 = R.styleable.TextInputLayout_startIconContentDescription;
            if (tintTypedArray.hasValue(i11)) {
                setStartIconContentDescription(tintTypedArray.getText(i11));
            }
            setStartIconCheckable(tintTypedArray.getBoolean(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        setStartIconMinSize(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i12 = R.styleable.TextInputLayout_startIconScaleType;
        if (tintTypedArray.hasValue(i12)) {
            setStartIconScaleType(IconHelper.convertScaleType(tintTypedArray.getInt(i12, -1)));
        }
    }

    private void updateVisibility() {
        int i8;
        int i9 = 8;
        if (this.prefixText != null && !this.hintExpanded) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        if (this.startIconView.getVisibility() == 0 || i8 == 0) {
            i9 = 0;
        }
        setVisibility(i9);
        this.prefixTextView.setVisibility(i8);
        this.textInputLayout.updateDummyDrawables();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPrefixTextStartOffset() {
        int i8;
        if (isStartIconVisible()) {
            i8 = this.startIconView.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams());
        } else {
            i8 = 0;
        }
        return ViewCompat.getPaddingStart(this) + ViewCompat.getPaddingStart(this.prefixTextView) + i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isStartIconVisible() {
        if (this.startIconView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onHintStateChanged(boolean z8) {
        this.hintExpanded = z8;
        updateVisibility();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        updatePrefixTextViewPadding();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPrefixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.prefixText = charSequence2;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPrefixTextAppearance(@StyleRes int i8) {
        TextViewCompat.setTextAppearance(this.prefixTextView, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartIconCheckable(boolean z8) {
        this.startIconView.setCheckable(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartIconMinSize(@Px int i8) {
        if (i8 >= 0) {
            if (i8 != this.startIconMinSize) {
                this.startIconMinSize = i8;
                IconHelper.setIconMinSize(this.startIconView, i8);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.startIconView, scaleType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStartIconVisible(boolean z8) {
        int i8;
        if (isStartIconVisible() != z8) {
            CheckableImageButton checkableImageButton = this.startIconView;
            if (z8) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            checkableImageButton.setVisibility(i8);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setupAccessibilityNodeInfo(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.prefixTextView.getVisibility() == 0) {
            accessibilityNodeInfoCompat.setLabelFor(this.prefixTextView);
            accessibilityNodeInfoCompat.setTraversalAfter(this.prefixTextView);
        } else {
            accessibilityNodeInfoCompat.setTraversalAfter(this.startIconView);
        }
    }

    void updatePrefixTextViewPadding() {
        int paddingStart;
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        if (isStartIconVisible()) {
            paddingStart = 0;
        } else {
            paddingStart = ViewCompat.getPaddingStart(editText);
        }
        ViewCompat.setPaddingRelative(this.prefixTextView, paddingStart, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }
}
