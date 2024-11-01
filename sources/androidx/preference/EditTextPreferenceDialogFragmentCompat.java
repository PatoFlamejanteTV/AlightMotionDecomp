package androidx.preference;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.leanback.preference.LeanbackPreferenceDialogFragment;

/* loaded from: classes3.dex */
public class EditTextPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    private static final String SAVE_STATE_TEXT = "EditTextPreferenceDialogFragment.text";
    private static final int SHOW_REQUEST_TIMEOUT = 1000;
    private EditText mEditText;
    private CharSequence mText;
    private final Runnable mShowSoftInputRunnable = new Runnable() { // from class: androidx.preference.EditTextPreferenceDialogFragmentCompat.1
        @Override // java.lang.Runnable
        public void run() {
            EditTextPreferenceDialogFragmentCompat.this.scheduleShowSoftInputInner();
        }
    };
    private long mShowRequestTime = -1;

    private EditTextPreference getEditTextPreference() {
        return (EditTextPreference) getPreference();
    }

    private boolean hasPendingShowSoftInputRequest() {
        long j8 = this.mShowRequestTime;
        if (j8 != -1 && j8 + 1000 > SystemClock.currentThreadTimeMillis()) {
            return true;
        }
        return false;
    }

    @NonNull
    public static EditTextPreferenceDialogFragmentCompat newInstance(String str) {
        EditTextPreferenceDialogFragmentCompat editTextPreferenceDialogFragmentCompat = new EditTextPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString(LeanbackPreferenceDialogFragment.ARG_KEY, str);
        editTextPreferenceDialogFragmentCompat.setArguments(bundle);
        return editTextPreferenceDialogFragmentCompat;
    }

    private void setPendingShowSoftInputRequest(boolean z8) {
        long j8;
        if (z8) {
            j8 = SystemClock.currentThreadTimeMillis();
        } else {
            j8 = -1;
        }
        this.mShowRequestTime = j8;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected boolean needInputMethod() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onBindDialogView(@NonNull View view) {
        super.onBindDialogView(view);
        EditText editText = (EditText) view.findViewById(android.R.id.edit);
        this.mEditText = editText;
        if (editText != null) {
            editText.requestFocus();
            this.mEditText.setText(this.mText);
            EditText editText2 = this.mEditText;
            editText2.setSelection(editText2.getText().length());
            if (getEditTextPreference().getOnBindEditTextListener() != null) {
                getEditTextPreference().getOnBindEditTextListener().onBindEditText(this.mEditText);
                return;
            }
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.mText = getEditTextPreference().getText();
        } else {
            this.mText = bundle.getCharSequence(SAVE_STATE_TEXT);
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z8) {
        if (z8) {
            String obj = this.mEditText.getText().toString();
            EditTextPreference editTextPreference = getEditTextPreference();
            if (editTextPreference.callChangeListener(obj)) {
                editTextPreference.setText(obj);
            }
        }
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(SAVE_STATE_TEXT, this.mText);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected void scheduleShowSoftInput() {
        setPendingShowSoftInputRequest(true);
        scheduleShowSoftInputInner();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void scheduleShowSoftInputInner() {
        if (hasPendingShowSoftInputRequest()) {
            EditText editText = this.mEditText;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.mEditText.getContext().getSystemService("input_method")).showSoftInput(this.mEditText, 0)) {
                    setPendingShowSoftInputRequest(false);
                    return;
                } else {
                    this.mEditText.removeCallbacks(this.mShowSoftInputRunnable);
                    this.mEditText.postDelayed(this.mShowSoftInputRunnable, 50L);
                    return;
                }
            }
            setPendingShowSoftInputRequest(false);
        }
    }
}
