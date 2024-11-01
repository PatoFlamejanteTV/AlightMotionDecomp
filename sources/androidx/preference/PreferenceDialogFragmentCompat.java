package androidx.preference;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.preference.DialogPreference;

/* loaded from: classes3.dex */
public abstract class PreferenceDialogFragmentCompat extends DialogFragment implements DialogInterface.OnClickListener {
    protected static final String ARG_KEY = "key";
    private static final String SAVE_STATE_ICON = "PreferenceDialogFragment.icon";
    private static final String SAVE_STATE_LAYOUT = "PreferenceDialogFragment.layout";
    private static final String SAVE_STATE_MESSAGE = "PreferenceDialogFragment.message";
    private static final String SAVE_STATE_NEGATIVE_TEXT = "PreferenceDialogFragment.negativeText";
    private static final String SAVE_STATE_POSITIVE_TEXT = "PreferenceDialogFragment.positiveText";
    private static final String SAVE_STATE_TITLE = "PreferenceDialogFragment.title";
    private BitmapDrawable mDialogIcon;

    @LayoutRes
    private int mDialogLayoutRes;
    private CharSequence mDialogMessage;
    private CharSequence mDialogTitle;
    private CharSequence mNegativeButtonText;
    private CharSequence mPositiveButtonText;
    private DialogPreference mPreference;
    private int mWhichButtonClicked;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(30)
    /* loaded from: classes3.dex */
    public static class Api30Impl {
        private Api30Impl() {
        }

        @DoNotInline
        static void showIme(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    private void requestInputMethod(@NonNull Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.showIme(window);
        } else {
            scheduleShowSoftInput();
        }
    }

    public DialogPreference getPreference() {
        if (this.mPreference == null) {
            this.mPreference = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).findPreference(requireArguments().getString("key"));
        }
        return this.mPreference;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected boolean needInputMethod() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onBindDialogView(@NonNull View view) {
        int i8;
        View findViewById = view.findViewById(android.R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.mDialogMessage;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i8 = 0;
            } else {
                i8 = 8;
            }
            if (findViewById.getVisibility() != i8) {
                findViewById.setVisibility(i8);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(@NonNull DialogInterface dialogInterface, int i8) {
        this.mWhichButtonClicked = i8;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityResultCaller targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.TargetFragment) {
            DialogPreference.TargetFragment targetFragment2 = (DialogPreference.TargetFragment) targetFragment;
            String string = requireArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) targetFragment2.findPreference(string);
                this.mPreference = dialogPreference;
                this.mDialogTitle = dialogPreference.getDialogTitle();
                this.mPositiveButtonText = this.mPreference.getPositiveButtonText();
                this.mNegativeButtonText = this.mPreference.getNegativeButtonText();
                this.mDialogMessage = this.mPreference.getDialogMessage();
                this.mDialogLayoutRes = this.mPreference.getDialogLayoutResource();
                Drawable dialogIcon = this.mPreference.getDialogIcon();
                if (dialogIcon != null && !(dialogIcon instanceof BitmapDrawable)) {
                    Bitmap createBitmap = Bitmap.createBitmap(dialogIcon.getIntrinsicWidth(), dialogIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    dialogIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    dialogIcon.draw(canvas);
                    this.mDialogIcon = new BitmapDrawable(getResources(), createBitmap);
                    return;
                }
                this.mDialogIcon = (BitmapDrawable) dialogIcon;
                return;
            }
            this.mDialogTitle = bundle.getCharSequence(SAVE_STATE_TITLE);
            this.mPositiveButtonText = bundle.getCharSequence(SAVE_STATE_POSITIVE_TEXT);
            this.mNegativeButtonText = bundle.getCharSequence(SAVE_STATE_NEGATIVE_TEXT);
            this.mDialogMessage = bundle.getCharSequence(SAVE_STATE_MESSAGE);
            this.mDialogLayoutRes = bundle.getInt(SAVE_STATE_LAYOUT, 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable(SAVE_STATE_ICON);
            if (bitmap != null) {
                this.mDialogIcon = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        this.mWhichButtonClicked = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(requireContext()).setTitle(this.mDialogTitle).setIcon(this.mDialogIcon).setPositiveButton(this.mPositiveButtonText, this).setNegativeButton(this.mNegativeButtonText, this);
        View onCreateDialogView = onCreateDialogView(requireContext());
        if (onCreateDialogView != null) {
            onBindDialogView(onCreateDialogView);
            negativeButton.setView(onCreateDialogView);
        } else {
            negativeButton.setMessage(this.mDialogMessage);
        }
        onPrepareDialogBuilder(negativeButton);
        AlertDialog create = negativeButton.create();
        if (needInputMethod()) {
            requestInputMethod(create);
        }
        return create;
    }

    @Nullable
    protected View onCreateDialogView(@NonNull Context context) {
        int i8 = this.mDialogLayoutRes;
        if (i8 == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i8, (ViewGroup) null);
    }

    public abstract void onDialogClosed(boolean z8);

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        boolean z8;
        super.onDismiss(dialogInterface);
        if (this.mWhichButtonClicked == -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        onDialogClosed(z8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onPrepareDialogBuilder(@NonNull AlertDialog.Builder builder) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(SAVE_STATE_TITLE, this.mDialogTitle);
        bundle.putCharSequence(SAVE_STATE_POSITIVE_TEXT, this.mPositiveButtonText);
        bundle.putCharSequence(SAVE_STATE_NEGATIVE_TEXT, this.mNegativeButtonText);
        bundle.putCharSequence(SAVE_STATE_MESSAGE, this.mDialogMessage);
        bundle.putInt(SAVE_STATE_LAYOUT, this.mDialogLayoutRes);
        BitmapDrawable bitmapDrawable = this.mDialogIcon;
        if (bitmapDrawable != null) {
            bundle.putParcelable(SAVE_STATE_ICON, bitmapDrawable.getBitmap());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    protected void scheduleShowSoftInput() {
    }
}
