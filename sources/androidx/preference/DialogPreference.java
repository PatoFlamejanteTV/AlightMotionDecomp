package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;

/* loaded from: classes3.dex */
public abstract class DialogPreference extends Preference {
    private Drawable mDialogIcon;
    private int mDialogLayoutResId;
    private CharSequence mDialogMessage;
    private CharSequence mDialogTitle;
    private CharSequence mNegativeButtonText;
    private CharSequence mPositiveButtonText;

    /* loaded from: classes3.dex */
    public interface TargetFragment {
        @Nullable
        <T extends Preference> T findPreference(@NonNull CharSequence charSequence);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DialogPreference, i8, i9);
        String string = TypedArrayUtils.getString(obtainStyledAttributes, R.styleable.DialogPreference_dialogTitle, R.styleable.DialogPreference_android_dialogTitle);
        this.mDialogTitle = string;
        if (string == null) {
            this.mDialogTitle = getTitle();
        }
        this.mDialogMessage = TypedArrayUtils.getString(obtainStyledAttributes, R.styleable.DialogPreference_dialogMessage, R.styleable.DialogPreference_android_dialogMessage);
        this.mDialogIcon = TypedArrayUtils.getDrawable(obtainStyledAttributes, R.styleable.DialogPreference_dialogIcon, R.styleable.DialogPreference_android_dialogIcon);
        this.mPositiveButtonText = TypedArrayUtils.getString(obtainStyledAttributes, R.styleable.DialogPreference_positiveButtonText, R.styleable.DialogPreference_android_positiveButtonText);
        this.mNegativeButtonText = TypedArrayUtils.getString(obtainStyledAttributes, R.styleable.DialogPreference_negativeButtonText, R.styleable.DialogPreference_android_negativeButtonText);
        this.mDialogLayoutResId = TypedArrayUtils.getResourceId(obtainStyledAttributes, R.styleable.DialogPreference_dialogLayout, R.styleable.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    @Nullable
    public Drawable getDialogIcon() {
        return this.mDialogIcon;
    }

    public int getDialogLayoutResource() {
        return this.mDialogLayoutResId;
    }

    @Nullable
    public CharSequence getDialogMessage() {
        return this.mDialogMessage;
    }

    @Nullable
    public CharSequence getDialogTitle() {
        return this.mDialogTitle;
    }

    @Nullable
    public CharSequence getNegativeButtonText() {
        return this.mNegativeButtonText;
    }

    @Nullable
    public CharSequence getPositiveButtonText() {
        return this.mPositiveButtonText;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void onClick() {
        getPreferenceManager().showDialog(this);
    }

    public void setDialogIcon(@Nullable Drawable drawable) {
        this.mDialogIcon = drawable;
    }

    public void setDialogLayoutResource(int i8) {
        this.mDialogLayoutResId = i8;
    }

    public void setDialogMessage(@Nullable CharSequence charSequence) {
        this.mDialogMessage = charSequence;
    }

    public void setDialogTitle(@Nullable CharSequence charSequence) {
        this.mDialogTitle = charSequence;
    }

    public void setNegativeButtonText(@Nullable CharSequence charSequence) {
        this.mNegativeButtonText = charSequence;
    }

    public void setPositiveButtonText(@Nullable CharSequence charSequence) {
        this.mPositiveButtonText = charSequence;
    }

    public void setDialogIcon(int i8) {
        this.mDialogIcon = AppCompatResources.getDrawable(getContext(), i8);
    }

    public void setDialogMessage(int i8) {
        setDialogMessage(getContext().getString(i8));
    }

    public void setDialogTitle(int i8) {
        setDialogTitle(getContext().getString(i8));
    }

    public void setNegativeButtonText(int i8) {
        setNegativeButtonText(getContext().getString(i8));
    }

    public void setPositiveButtonText(int i8) {
        setPositiveButtonText(getContext().getString(i8));
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(@NonNull Context context) {
        this(context, null);
    }
}
