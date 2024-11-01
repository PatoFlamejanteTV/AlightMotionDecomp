package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class EndCompoundLayout extends LinearLayout {

    @Nullable
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final EndIconDelegates endIconDelegates;

    @NonNull
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;

    @NonNull
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;

    @NonNull
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;

    @NonNull
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;

    @Nullable
    private CharSequence suffixText;

    @NonNull
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;

    @Nullable
    private AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final SparseArray<EndIconDelegate> delegates = new SparseArray<>();
        private final EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.endLayout = endCompoundLayout;
            this.customEndIconDrawableId = tintTypedArray.getResourceId(R.styleable.TextInputLayout_endIconDrawable, 0);
            this.passwordIconDrawableId = tintTypedArray.getResourceId(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        private EndIconDelegate create(int i8) {
            if (i8 != -1) {
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 == 3) {
                                return new DropdownMenuEndIconDelegate(this.endLayout);
                            }
                            throw new IllegalArgumentException("Invalid end icon mode: " + i8);
                        }
                        return new ClearTextEndIconDelegate(this.endLayout);
                    }
                    return new PasswordToggleEndIconDelegate(this.endLayout, this.passwordIconDrawableId);
                }
                return new NoEndIconDelegate(this.endLayout);
            }
            return new CustomEndIconDelegate(this.endLayout);
        }

        EndIconDelegate get(int i8) {
            EndIconDelegate endIconDelegate = this.delegates.get(i8);
            if (endIconDelegate == null) {
                EndIconDelegate create = create(i8);
                this.delegates.append(i8, create);
                return create;
            }
            return endIconDelegate;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet<>();
        this.editTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
                EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i8, i9, i10);
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(@NonNull TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.editText == textInputLayout2.getEditText()) {
                    return;
                }
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.removeTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                    if (EndCompoundLayout.this.editText.getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                        EndCompoundLayout.this.editText.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.editText = textInputLayout2.getEditText();
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.addTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                }
                EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(EndCompoundLayout.this.editText);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
            }
        };
        this.onEditTextAttachedListener = onEditTextAttachedListener;
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton createIconView = createIconView(this, from, R.id.text_input_error_icon);
        this.errorIconView = createIconView;
        CheckableImageButton createIconView2 = createIconView(frameLayout, from, R.id.text_input_end_icon);
        this.endIconView = createIconView2;
        this.endIconDelegates = new EndIconDelegates(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.suffixTextView = appCompatTextView;
        initErrorIconView(tintTypedArray);
        initEndIconView(tintTypedArray);
        initSuffixTextView(tintTypedArray);
        frameLayout.addView(createIconView2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(createIconView);
        textInputLayout.addOnEditTextAttachedListener(onEditTextAttachedListener);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTouchExplorationStateChangeListenerIfNeeded() {
        if (this.touchExplorationStateChangeListener != null && this.accessibilityManager != null && ViewCompat.isAttachedToWindow(this)) {
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.accessibilityManager, this.touchExplorationStateChangeListener);
        }
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i8) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i8);
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void dispatchOnEndIconChanged(int i8) {
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.textInputLayout, i8);
        }
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
        int i8 = this.endIconDelegates.customEndIconDrawableId;
        if (i8 == 0) {
            return endIconDelegate.getIconDrawableResId();
        }
        return i8;
    }

    private void initEndIconView(TintTypedArray tintTypedArray) {
        int i8 = R.styleable.TextInputLayout_passwordToggleEnabled;
        if (!tintTypedArray.hasValue(i8)) {
            int i9 = R.styleable.TextInputLayout_endIconTint;
            if (tintTypedArray.hasValue(i9)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, i9);
            }
            int i10 = R.styleable.TextInputLayout_endIconTintMode;
            if (tintTypedArray.hasValue(i10)) {
                this.endIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(i10, -1), null);
            }
        }
        int i11 = R.styleable.TextInputLayout_endIconMode;
        if (tintTypedArray.hasValue(i11)) {
            setEndIconMode(tintTypedArray.getInt(i11, 0));
            int i12 = R.styleable.TextInputLayout_endIconContentDescription;
            if (tintTypedArray.hasValue(i12)) {
                setEndIconContentDescription(tintTypedArray.getText(i12));
            }
            setEndIconCheckable(tintTypedArray.getBoolean(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArray.hasValue(i8)) {
            int i13 = R.styleable.TextInputLayout_passwordToggleTint;
            if (tintTypedArray.hasValue(i13)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, i13);
            }
            int i14 = R.styleable.TextInputLayout_passwordToggleTintMode;
            if (tintTypedArray.hasValue(i14)) {
                this.endIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(i14, -1), null);
            }
            setEndIconMode(tintTypedArray.getBoolean(i8, false) ? 1 : 0);
            setEndIconContentDescription(tintTypedArray.getText(R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        setEndIconMinSize(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i15 = R.styleable.TextInputLayout_endIconScaleType;
        if (tintTypedArray.hasValue(i15)) {
            setEndIconScaleType(IconHelper.convertScaleType(tintTypedArray.getInt(i15, -1)));
        }
    }

    private void initErrorIconView(TintTypedArray tintTypedArray) {
        int i8 = R.styleable.TextInputLayout_errorIconTint;
        if (tintTypedArray.hasValue(i8)) {
            this.errorIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, i8);
        }
        int i9 = R.styleable.TextInputLayout_errorIconTintMode;
        if (tintTypedArray.hasValue(i9)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(i9, -1), null);
        }
        int i10 = R.styleable.TextInputLayout_errorIconDrawable;
        if (tintTypedArray.hasValue(i10)) {
            setErrorIconDrawable(tintTypedArray.getDrawable(i10));
        }
        this.errorIconView.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(this.errorIconView, 2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initSuffixTextView(TintTypedArray tintTypedArray) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(R.id.textinput_suffix_text);
        this.suffixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(this.suffixTextView, 1);
        setSuffixTextAppearance(tintTypedArray.getResourceId(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        int i8 = R.styleable.TextInputLayout_suffixTextColor;
        if (tintTypedArray.hasValue(i8)) {
            setSuffixTextColor(tintTypedArray.getColorStateList(i8));
        }
        setSuffixText(tintTypedArray.getText(R.styleable.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTouchExplorationStateChangeListenerIfNeeded() {
        AccessibilityManager accessibilityManager;
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
        if (touchExplorationStateChangeListener != null && (accessibilityManager = this.accessibilityManager) != null) {
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    private void setUpDelegate(@NonNull EndIconDelegate endIconDelegate) {
        endIconDelegate.setUp();
        this.touchExplorationStateChangeListener = endIconDelegate.getTouchExplorationStateChangeListener();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(@NonNull EndIconDelegate endIconDelegate) {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    private void tintEndIconOnError(boolean z8) {
        if (z8 && getEndIconDrawable() != null) {
            Drawable mutate = DrawableCompat.wrap(getEndIconDrawable()).mutate();
            DrawableCompat.setTint(mutate, this.textInputLayout.getErrorCurrentTextColors());
            this.endIconView.setImageDrawable(mutate);
            return;
        }
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
    }

    private void updateEndLayoutVisibility() {
        int i8;
        char c8;
        FrameLayout frameLayout = this.endIconFrame;
        int i9 = 8;
        if (this.endIconView.getVisibility() == 0 && !isErrorIconVisible()) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        frameLayout.setVisibility(i8);
        if (this.suffixText != null && !this.hintExpanded) {
            c8 = 0;
        } else {
            c8 = '\b';
        }
        if (isEndIconVisible() || isErrorIconVisible() || c8 == 0) {
            i9 = 0;
        }
        setVisibility(i9);
    }

    private void updateErrorIconVisibility() {
        boolean z8;
        int i8 = 0;
        if (getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError()) {
            z8 = true;
        } else {
            z8 = false;
        }
        CheckableImageButton checkableImageButton = this.errorIconView;
        if (!z8) {
            i8 = 8;
        }
        checkableImageButton.setVisibility(i8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (!hasEndIcon()) {
            this.textInputLayout.updateDummyDrawables();
        }
    }

    private void updateSuffixTextVisibility() {
        int i8;
        int visibility = this.suffixTextView.getVisibility();
        boolean z8 = false;
        if (this.suffixText != null && !this.hintExpanded) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        if (visibility != i8) {
            EndIconDelegate endIconDelegate = getEndIconDelegate();
            if (i8 == 0) {
                z8 = true;
            }
            endIconDelegate.onSuffixVisibilityChanged(z8);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i8);
        this.textInputLayout.updateDummyDrawables();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addOnEndIconChangedListener(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EndIconDelegate getEndIconDelegate() {
        return this.endIconDelegates.get(this.endIconMode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEndIconMinSize() {
        return this.endIconMinSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEndIconMode() {
        return this.endIconMode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.endIconScaleType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuffixTextEndOffset() {
        int measuredWidth;
        if (!isEndIconVisible() && !isErrorIconVisible()) {
            measuredWidth = 0;
        } else {
            measuredWidth = this.endIconView.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) this.endIconView.getLayoutParams());
        }
        return ViewCompat.getPaddingEnd(this) + ViewCompat.getPaddingEnd(this.suffixTextView) + measuredWidth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasEndIcon() {
        if (this.endIconMode != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEndIconChecked() {
        if (hasEndIcon() && this.endIconView.isChecked()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEndIconVisible() {
        if (this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isErrorIconVisible() {
        if (this.errorIconView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isPasswordVisibilityToggleEnabled() {
        if (this.endIconMode == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onHintStateChanged(boolean z8) {
        this.hintExpanded = z8;
        updateSuffixTextVisibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onTextInputBoxStateUpdated() {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void refreshEndIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void refreshErrorIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void refreshIconState(boolean z8) {
        boolean z9;
        boolean isActivated;
        boolean isChecked;
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean z10 = true;
        if (endIconDelegate.isIconCheckable() && (isChecked = this.endIconView.isChecked()) != endIconDelegate.isIconChecked()) {
            this.endIconView.setChecked(!isChecked);
            z9 = true;
        } else {
            z9 = false;
        }
        if (endIconDelegate.isIconActivable() && (isActivated = this.endIconView.isActivated()) != endIconDelegate.isIconActivated()) {
            setEndIconActivated(!isActivated);
        } else {
            z10 = z9;
        }
        if (z8 || z10) {
            refreshEndIconDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeOnEndIconChangedListener(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconActivated(boolean z8) {
        this.endIconView.setActivated(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconCheckable(boolean z8) {
        this.endIconView.setCheckable(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconContentDescription(@StringRes int i8) {
        setEndIconContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconDrawable(@DrawableRes int i8) {
        setEndIconDrawable(i8 != 0 ? AppCompatResources.getDrawable(getContext(), i8) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconMinSize(@Px int i8) {
        if (i8 >= 0) {
            if (i8 != this.endIconMinSize) {
                this.endIconMinSize = i8;
                IconHelper.setIconMinSize(this.endIconView, i8);
                IconHelper.setIconMinSize(this.errorIconView, i8);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconMode(int i8) {
        boolean z8;
        if (this.endIconMode == i8) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i9 = this.endIconMode;
        this.endIconMode = i8;
        dispatchOnEndIconChanged(i9);
        if (i8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        setEndIconVisible(z8);
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.getIconContentDescriptionResId());
        setEndIconCheckable(endIconDelegate.isIconCheckable());
        if (endIconDelegate.isBoxBackgroundModeSupported(this.textInputLayout.getBoxBackgroundMode())) {
            setUpDelegate(endIconDelegate);
            setEndIconOnClickListener(endIconDelegate.getOnIconClickListener());
            EditText editText = this.editText;
            if (editText != null) {
                endIconDelegate.onEditTextAttached(editText);
                setOnFocusChangeListenersIfNeeded(endIconDelegate);
            }
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshIconState(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.endIconView, scaleType);
        IconHelper.setIconScaleType(this.errorIconView, scaleType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconVisible(boolean z8) {
        int i8;
        if (isEndIconVisible() != z8) {
            CheckableImageButton checkableImageButton = this.endIconView;
            if (z8) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            checkableImageButton.setVisibility(i8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconDrawable(@DrawableRes int i8) {
        setErrorIconDrawable(i8 != 0 ? AppCompatResources.getDrawable(getContext(), i8) : null);
        refreshErrorIconDrawableState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i8) {
        setPasswordVisibilityToggleContentDescription(i8 != 0 ? getResources().getText(i8) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i8) {
        setPasswordVisibilityToggleDrawable(i8 != 0 ? AppCompatResources.getDrawable(getContext(), i8) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleEnabled(boolean z8) {
        if (z8 && this.endIconMode != 1) {
            setEndIconMode(1);
        } else if (!z8) {
            setEndIconMode(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSuffixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.suffixText = charSequence2;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSuffixTextAppearance(@StyleRes int i8) {
        TextViewCompat.setTextAppearance(this.suffixTextView, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void togglePasswordVisibilityToggle(boolean z8) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z8) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateSuffixTextViewPadding() {
        int i8;
        if (this.textInputLayout.editText == null) {
            return;
        }
        if (!isEndIconVisible() && !isErrorIconVisible()) {
            i8 = ViewCompat.getPaddingEnd(this.textInputLayout.editText);
        } else {
            i8 = 0;
        }
        ViewCompat.setPaddingRelative(this.suffixTextView, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.textInputLayout.editText.getPaddingTop(), i8, this.textInputLayout.editText.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }
}
