package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class EndIconDelegate {
    final Context context;
    final CheckableImageButton endIconView;
    final EndCompoundLayout endLayout;
    final TextInputLayout textInputLayout;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        this.textInputLayout = endCompoundLayout.textInputLayout;
        this.endLayout = endCompoundLayout;
        this.context = endCompoundLayout.getContext();
        this.endIconView = endCompoundLayout.getEndIconView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void afterEditTextChanged(Editable editable) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void beforeEditTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @StringRes
    public int getIconContentDescriptionResId() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @DrawableRes
    public int getIconDrawableResId() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.OnFocusChangeListener getOnEditTextFocusChangeListener() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.OnClickListener getOnIconClickListener() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.OnFocusChangeListener getOnIconViewFocusChangeListener() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isBoxBackgroundModeSupported(int i8) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isIconActivable() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isIconActivated() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isIconCheckable() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isIconChecked() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEditTextAttached(@Nullable EditText editText) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onSuffixVisibilityChanged(boolean z8) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void refreshIconState() {
        this.endLayout.refreshIconState(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setUp() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldTintIconOnError() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void tearDown() {
    }
}
