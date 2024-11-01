package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class PasswordToggleEndIconDelegate extends EndIconDelegate {

    @Nullable
    private EditText editText;
    private int iconResId;
    private final View.OnClickListener onIconClickListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PasswordToggleEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout, @DrawableRes int i8) {
        super(endCompoundLayout);
        this.iconResId = R.drawable.design_password_eye;
        this.onIconClickListener = new View.OnClickListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PasswordToggleEndIconDelegate.this.lambda$new$0(view);
            }
        };
        if (i8 != 0) {
            this.iconResId = i8;
        }
    }

    private boolean hasPasswordTransformation() {
        EditText editText = this.editText;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }

    private static boolean isInputTypePassword(EditText editText) {
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (hasPasswordTransformation()) {
            this.editText.setTransformationMethod(null);
        } else {
            this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.editText.setSelection(selectionEnd);
        }
        refreshIconState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void beforeEditTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        refreshIconState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    @StringRes
    public int getIconContentDescriptionResId() {
        return R.string.password_toggle_content_description;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    @DrawableRes
    public int getIconDrawableResId() {
        return this.iconResId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconCheckable() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconChecked() {
        return !hasPasswordTransformation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@Nullable EditText editText) {
        this.editText = editText;
        refreshIconState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        if (isInputTypePassword(this.editText)) {
            this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.EndIconDelegate
    public void tearDown() {
        EditText editText = this.editText;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
