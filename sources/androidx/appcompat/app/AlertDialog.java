package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    final AlertController mAlert;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: P, reason: collision with root package name */
        private final AlertController.AlertParams f14346P;
        private final int mTheme;

        public Builder(@NonNull Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        @NonNull
        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.f14346P.mContext, this.mTheme);
            this.f14346P.apply(alertDialog.mAlert);
            alertDialog.setCancelable(this.f14346P.mCancelable);
            if (this.f14346P.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f14346P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.f14346P.mOnDismissListener);
            DialogInterface.OnKeyListener onKeyListener = this.f14346P.mOnKeyListener;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        @NonNull
        public Context getContext() {
            return this.f14346P.mContext;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z8) {
            this.f14346P.mCancelable = z8;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mCursor = cursor;
            alertParams.mLabelColumn = str;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCustomTitle(@Nullable View view) {
            this.f14346P.mCustomTitleView = view;
            return this;
        }

        public Builder setIcon(@DrawableRes int i8) {
            this.f14346P.mIconId = i8;
            return this;
        }

        public Builder setIconAttribute(@AttrRes int i8) {
            TypedValue typedValue = new TypedValue();
            this.f14346P.mContext.getTheme().resolveAttribute(i8, typedValue, true);
            this.f14346P.mIconId = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z8) {
            this.f14346P.mForceInverseBackground = z8;
            return this;
        }

        public Builder setItems(@ArrayRes int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i8);
            this.f14346P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setMessage(@StringRes int i8) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mMessage = alertParams.mContext.getText(i8);
            return this;
        }

        public Builder setMultiChoiceItems(@ArrayRes int i8, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i8);
            AlertController.AlertParams alertParams2 = this.f14346P;
            alertParams2.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams2.mCheckedItems = zArr;
            alertParams2.mIsMultiChoice = true;
            return this;
        }

        public Builder setNegativeButton(@StringRes int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i8);
            this.f14346P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
            this.f14346P.mNegativeButtonIcon = drawable;
            return this;
        }

        public Builder setNeutralButton(@StringRes int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mNeutralButtonText = alertParams.mContext.getText(i8);
            this.f14346P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
            this.f14346P.mNeutralButtonIcon = drawable;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f14346P.mOnCancelListener = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f14346P.mOnDismissListener = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f14346P.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f14346P.mOnKeyListener = onKeyListener;
            return this;
        }

        public Builder setPositiveButton(@StringRes int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i8);
            this.f14346P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
            this.f14346P.mPositiveButtonIcon = drawable;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder setRecycleOnMeasureEnabled(boolean z8) {
            this.f14346P.mRecycleOnMeasure = z8;
            return this;
        }

        public Builder setSingleChoiceItems(@ArrayRes int i8, int i9, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i8);
            AlertController.AlertParams alertParams2 = this.f14346P;
            alertParams2.mOnClickListener = onClickListener;
            alertParams2.mCheckedItem = i9;
            alertParams2.mIsSingleChoice = true;
            return this;
        }

        public Builder setTitle(@StringRes int i8) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mTitle = alertParams.mContext.getText(i8);
            return this;
        }

        public Builder setView(int i8) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mView = null;
            alertParams.mViewLayoutResId = i8;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public AlertDialog show() {
            AlertDialog create = create();
            create.show();
            return create;
        }

        public Builder(@NonNull Context context, @StyleRes int i8) {
            this.f14346P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i8)));
            this.mTheme = i8;
        }

        public Builder setIcon(@Nullable Drawable drawable) {
            this.f14346P.mIcon = drawable;
            return this;
        }

        public Builder setMessage(@Nullable CharSequence charSequence) {
            this.f14346P.mMessage = charSequence;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.f14346P.mTitle = charSequence;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mNegativeButtonText = charSequence;
            alertParams.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mNeutralButtonText = charSequence;
            alertParams.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mPositiveButtonText = charSequence;
            alertParams.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setView(View view) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mCheckedItems = zArr;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i8, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mCursor = cursor;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i8;
            alertParams.mLabelColumn = str;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public Builder setView(View view, int i8, int i9, int i10, int i11) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mView = view;
            alertParams.mViewLayoutResId = 0;
            alertParams.mViewSpacingSpecified = true;
            alertParams.mViewSpacingLeft = i8;
            alertParams.mViewSpacingTop = i9;
            alertParams.mViewSpacingRight = i10;
            alertParams.mViewSpacingBottom = i11;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mCursor = cursor;
            alertParams.mOnCheckboxClickListener = onMultiChoiceClickListener;
            alertParams.mIsCheckedColumn = str;
            alertParams.mLabelColumn = str2;
            alertParams.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mItems = charSequenceArr;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i8;
            alertParams.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f14346P;
            alertParams.mAdapter = listAdapter;
            alertParams.mOnClickListener = onClickListener;
            alertParams.mCheckedItem = i8;
            alertParams.mIsSingleChoice = true;
            return this;
        }
    }

    protected AlertDialog(@NonNull Context context) {
        this(context, 0);
    }

    static int resolveDialogTheme(@NonNull Context context, @StyleRes int i8) {
        if (((i8 >>> 24) & 255) >= 1) {
            return i8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i8) {
        return this.mAlert.getButton(i8);
    }

    public ListView getListView() {
        return this.mAlert.getListView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.installContent();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (this.mAlert.onKeyDown(i8, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i8, KeyEvent keyEvent) {
        if (this.mAlert.onKeyUp(i8, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i8, keyEvent);
    }

    public void setButton(int i8, CharSequence charSequence, Message message) {
        this.mAlert.setButton(i8, charSequence, null, message, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void setButtonPanelLayoutHint(int i8) {
        this.mAlert.setButtonPanelLayoutHint(i8);
    }

    public void setCustomTitle(View view) {
        this.mAlert.setCustomTitle(view);
    }

    public void setIcon(int i8) {
        this.mAlert.setIcon(i8);
    }

    public void setIconAttribute(int i8) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i8, typedValue, true);
        this.mAlert.setIcon(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        this.mAlert.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.setTitle(charSequence);
    }

    public void setView(View view) {
        this.mAlert.setView(view);
    }

    protected AlertDialog(@NonNull Context context, @StyleRes int i8) {
        super(context, resolveDialogTheme(context, i8));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    public void setButton(int i8, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i8, charSequence, onClickListener, null, null);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.setIcon(drawable);
    }

    public void setView(View view, int i8, int i9, int i10, int i11) {
        this.mAlert.setView(view, i8, i9, i10, i11);
    }

    public void setButton(int i8, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i8, charSequence, onClickListener, null, drawable);
    }

    protected AlertDialog(@NonNull Context context, boolean z8, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z8);
        setOnCancelListener(onCancelListener);
    }
}
