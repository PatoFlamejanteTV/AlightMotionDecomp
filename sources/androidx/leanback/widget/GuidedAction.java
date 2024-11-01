package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import java.util.List;

/* loaded from: classes3.dex */
public class GuidedAction extends Action {
    public static final long ACTION_ID_CANCEL = -5;
    public static final long ACTION_ID_CONTINUE = -7;
    public static final long ACTION_ID_CURRENT = -3;
    public static final long ACTION_ID_FINISH = -6;
    public static final long ACTION_ID_NEXT = -2;
    public static final long ACTION_ID_NO = -9;
    public static final long ACTION_ID_OK = -4;
    public static final long ACTION_ID_YES = -8;
    public static final int CHECKBOX_CHECK_SET_ID = -1;
    public static final int DEFAULT_CHECK_SET_ID = 1;
    static final int EDITING_ACTIVATOR_VIEW = 3;
    static final int EDITING_DESCRIPTION = 2;
    static final int EDITING_NONE = 0;
    static final int EDITING_TITLE = 1;
    public static final int NO_CHECK_SET = 0;
    static final int PF_AUTORESTORE = 64;
    static final int PF_CHECKED = 1;
    static final int PF_ENABLED = 16;
    static final int PF_FOCUSABLE = 32;
    static final int PF_HAS_NEXT = 4;
    static final int PF_INFO_ONLY = 8;
    static final int PF_MULTI_LINE_DESCRIPTION = 2;
    private static final String TAG = "GuidedAction";
    int mActionFlags;
    String[] mAutofillHints;
    int mCheckSetId;
    int mDescriptionEditInputType;
    int mDescriptionInputType;
    private CharSequence mEditDescription;
    int mEditInputType;
    private CharSequence mEditTitle;
    int mEditable;
    int mInputType;
    Intent mIntent;
    List<GuidedAction> mSubActions;

    /* loaded from: classes3.dex */
    public static class Builder extends BuilderBase<Builder> {
        @Deprecated
        public Builder() {
            super(null);
        }

        public GuidedAction build() {
            GuidedAction guidedAction = new GuidedAction();
            applyValues(guidedAction);
            return guidedAction;
        }

        public Builder(Context context) {
            super(context);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class BuilderBase<B extends BuilderBase> {
        private String[] mAutofillHints;
        private Context mContext;
        private CharSequence mDescription;
        private CharSequence mEditDescription;
        private CharSequence mEditTitle;
        private Drawable mIcon;
        private long mId;
        private Intent mIntent;
        private List<GuidedAction> mSubActions;
        private CharSequence mTitle;
        private int mEditable = 0;
        private int mInputType = 524289;
        private int mDescriptionInputType = 524289;
        private int mEditInputType = 1;
        private int mDescriptionEditInputType = 1;
        private int mCheckSetId = 0;
        private int mActionFlags = 112;

        public BuilderBase(Context context) {
            this.mContext = context;
        }

        private boolean isChecked() {
            if ((this.mActionFlags & 1) == 1) {
                return true;
            }
            return false;
        }

        private void setFlags(int i8, int i9) {
            this.mActionFlags = (i8 & i9) | (this.mActionFlags & (~i9));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void applyValues(GuidedAction guidedAction) {
            guidedAction.setId(this.mId);
            guidedAction.setLabel1(this.mTitle);
            guidedAction.setEditTitle(this.mEditTitle);
            guidedAction.setLabel2(this.mDescription);
            guidedAction.setEditDescription(this.mEditDescription);
            guidedAction.setIcon(this.mIcon);
            guidedAction.mIntent = this.mIntent;
            guidedAction.mEditable = this.mEditable;
            guidedAction.mInputType = this.mInputType;
            guidedAction.mDescriptionInputType = this.mDescriptionInputType;
            guidedAction.mAutofillHints = this.mAutofillHints;
            guidedAction.mEditInputType = this.mEditInputType;
            guidedAction.mDescriptionEditInputType = this.mDescriptionEditInputType;
            guidedAction.mActionFlags = this.mActionFlags;
            guidedAction.mCheckSetId = this.mCheckSetId;
            guidedAction.mSubActions = this.mSubActions;
        }

        public B autoSaveRestoreEnabled(boolean z8) {
            int i8;
            if (z8) {
                i8 = 64;
            } else {
                i8 = 0;
            }
            setFlags(i8, 64);
            return this;
        }

        public B autofillHints(String... strArr) {
            this.mAutofillHints = strArr;
            return this;
        }

        public B checkSetId(int i8) {
            this.mCheckSetId = i8;
            if (this.mEditable == 0) {
                return this;
            }
            throw new IllegalArgumentException("Editable actions cannot also be in check sets");
        }

        public B checked(boolean z8) {
            setFlags(z8 ? 1 : 0, 1);
            if (this.mEditable == 0) {
                return this;
            }
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }

        public B clickAction(long j8) {
            if (j8 == -4) {
                this.mId = -4L;
                this.mTitle = this.mContext.getString(R.string.ok);
            } else if (j8 == -5) {
                this.mId = -5L;
                this.mTitle = this.mContext.getString(R.string.cancel);
            } else if (j8 == -6) {
                this.mId = -6L;
                this.mTitle = this.mContext.getString(androidx.leanback.R.string.lb_guidedaction_finish_title);
            } else if (j8 == -7) {
                this.mId = -7L;
                this.mTitle = this.mContext.getString(androidx.leanback.R.string.lb_guidedaction_continue_title);
            } else if (j8 == -8) {
                this.mId = -8L;
                this.mTitle = this.mContext.getString(R.string.ok);
            } else if (j8 == -9) {
                this.mId = -9L;
                this.mTitle = this.mContext.getString(R.string.cancel);
            }
            return this;
        }

        public B description(CharSequence charSequence) {
            this.mDescription = charSequence;
            return this;
        }

        public B descriptionEditInputType(int i8) {
            this.mDescriptionEditInputType = i8;
            return this;
        }

        public B descriptionEditable(boolean z8) {
            if (!z8) {
                if (this.mEditable == 2) {
                    this.mEditable = 0;
                }
                return this;
            }
            this.mEditable = 2;
            if (!isChecked() && this.mCheckSetId == 0) {
                return this;
            }
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }

        public B descriptionInputType(int i8) {
            this.mDescriptionInputType = i8;
            return this;
        }

        public B editDescription(CharSequence charSequence) {
            this.mEditDescription = charSequence;
            return this;
        }

        public B editInputType(int i8) {
            this.mEditInputType = i8;
            return this;
        }

        public B editTitle(CharSequence charSequence) {
            this.mEditTitle = charSequence;
            return this;
        }

        public B editable(boolean z8) {
            if (!z8) {
                if (this.mEditable == 1) {
                    this.mEditable = 0;
                }
                return this;
            }
            this.mEditable = 1;
            if (!isChecked() && this.mCheckSetId == 0) {
                return this;
            }
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }

        public B enabled(boolean z8) {
            int i8;
            if (z8) {
                i8 = 16;
            } else {
                i8 = 0;
            }
            setFlags(i8, 16);
            return this;
        }

        public B focusable(boolean z8) {
            int i8;
            if (z8) {
                i8 = 32;
            } else {
                i8 = 0;
            }
            setFlags(i8, 32);
            return this;
        }

        public Context getContext() {
            return this.mContext;
        }

        public B hasEditableActivatorView(boolean z8) {
            if (!z8) {
                if (this.mEditable == 3) {
                    this.mEditable = 0;
                }
                return this;
            }
            this.mEditable = 3;
            if (!isChecked() && this.mCheckSetId == 0) {
                return this;
            }
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }

        public B hasNext(boolean z8) {
            int i8;
            if (z8) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            setFlags(i8, 4);
            return this;
        }

        public B icon(Drawable drawable) {
            this.mIcon = drawable;
            return this;
        }

        @Deprecated
        public B iconResourceId(@DrawableRes int i8, Context context) {
            return icon(ContextCompat.getDrawable(context, i8));
        }

        public B id(long j8) {
            this.mId = j8;
            return this;
        }

        public B infoOnly(boolean z8) {
            int i8;
            if (z8) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            setFlags(i8, 8);
            return this;
        }

        public B inputType(int i8) {
            this.mInputType = i8;
            return this;
        }

        public B intent(Intent intent) {
            this.mIntent = intent;
            return this;
        }

        public B multilineDescription(boolean z8) {
            int i8;
            if (z8) {
                i8 = 2;
            } else {
                i8 = 0;
            }
            setFlags(i8, 2);
            return this;
        }

        public B subActions(List<GuidedAction> list) {
            this.mSubActions = list;
            return this;
        }

        public B title(CharSequence charSequence) {
            this.mTitle = charSequence;
            return this;
        }

        public B description(@StringRes int i8) {
            this.mDescription = getContext().getString(i8);
            return this;
        }

        public B editDescription(@StringRes int i8) {
            this.mEditDescription = getContext().getString(i8);
            return this;
        }

        public B editTitle(@StringRes int i8) {
            this.mEditTitle = getContext().getString(i8);
            return this;
        }

        public B icon(@DrawableRes int i8) {
            return icon(ContextCompat.getDrawable(getContext(), i8));
        }

        public B title(@StringRes int i8) {
            this.mTitle = getContext().getString(i8);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GuidedAction() {
        super(0L);
    }

    static boolean isPasswordVariant(int i8) {
        int i9 = i8 & 4080;
        return i9 == 128 || i9 == 144 || i9 == 224;
    }

    private void setFlags(int i8, int i9) {
        this.mActionFlags = (i8 & i9) | (this.mActionFlags & (~i9));
    }

    public String[] getAutofillHints() {
        return this.mAutofillHints;
    }

    public int getCheckSetId() {
        return this.mCheckSetId;
    }

    public CharSequence getDescription() {
        return getLabel2();
    }

    public int getDescriptionEditInputType() {
        return this.mDescriptionEditInputType;
    }

    public int getDescriptionInputType() {
        return this.mDescriptionInputType;
    }

    public CharSequence getEditDescription() {
        return this.mEditDescription;
    }

    public int getEditInputType() {
        return this.mEditInputType;
    }

    public CharSequence getEditTitle() {
        return this.mEditTitle;
    }

    public int getInputType() {
        return this.mInputType;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public List<GuidedAction> getSubActions() {
        return this.mSubActions;
    }

    public CharSequence getTitle() {
        return getLabel1();
    }

    public boolean hasEditableActivatorView() {
        if (this.mEditable == 3) {
            return true;
        }
        return false;
    }

    public boolean hasMultilineDescription() {
        if ((this.mActionFlags & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        if ((this.mActionFlags & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean hasSubActions() {
        if (this.mSubActions != null) {
            return true;
        }
        return false;
    }

    public boolean hasTextEditable() {
        int i8 = this.mEditable;
        if (i8 == 1 || i8 == 2) {
            return true;
        }
        return false;
    }

    public boolean infoOnly() {
        if ((this.mActionFlags & 8) == 8) {
            return true;
        }
        return false;
    }

    public final boolean isAutoSaveRestoreEnabled() {
        if ((this.mActionFlags & 64) == 64) {
            return true;
        }
        return false;
    }

    public boolean isChecked() {
        if ((this.mActionFlags & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isDescriptionEditable() {
        if (this.mEditable == 2) {
            return true;
        }
        return false;
    }

    public boolean isEditTitleUsed() {
        if (this.mEditTitle != null) {
            return true;
        }
        return false;
    }

    public boolean isEditable() {
        if (this.mEditable == 1) {
            return true;
        }
        return false;
    }

    public boolean isEnabled() {
        if ((this.mActionFlags & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean isFocusable() {
        if ((this.mActionFlags & 32) == 32) {
            return true;
        }
        return false;
    }

    final boolean needAutoSaveDescription() {
        if (isDescriptionEditable() && !isPasswordVariant(getDescriptionEditInputType())) {
            return true;
        }
        return false;
    }

    final boolean needAutoSaveTitle() {
        if (isEditable() && !isPasswordVariant(getEditInputType())) {
            return true;
        }
        return false;
    }

    public void onRestoreInstanceState(Bundle bundle, String str) {
        if (needAutoSaveTitle()) {
            String string = bundle.getString(str);
            if (string != null) {
                setTitle(string);
                return;
            }
            return;
        }
        if (needAutoSaveDescription()) {
            String string2 = bundle.getString(str);
            if (string2 != null) {
                setDescription(string2);
                return;
            }
            return;
        }
        if (getCheckSetId() != 0) {
            setChecked(bundle.getBoolean(str, isChecked()));
        }
    }

    public void onSaveInstanceState(Bundle bundle, String str) {
        if (needAutoSaveTitle() && getTitle() != null) {
            bundle.putString(str, getTitle().toString());
            return;
        }
        if (needAutoSaveDescription() && getDescription() != null) {
            bundle.putString(str, getDescription().toString());
        } else if (getCheckSetId() != 0) {
            bundle.putBoolean(str, isChecked());
        }
    }

    public void setChecked(boolean z8) {
        setFlags(z8 ? 1 : 0, 1);
    }

    public void setDescription(CharSequence charSequence) {
        setLabel2(charSequence);
    }

    public void setEditDescription(CharSequence charSequence) {
        this.mEditDescription = charSequence;
    }

    public void setEditTitle(CharSequence charSequence) {
        this.mEditTitle = charSequence;
    }

    public void setEnabled(boolean z8) {
        int i8;
        if (z8) {
            i8 = 16;
        } else {
            i8 = 0;
        }
        setFlags(i8, 16);
    }

    public void setFocusable(boolean z8) {
        int i8;
        if (z8) {
            i8 = 32;
        } else {
            i8 = 0;
        }
        setFlags(i8, 32);
    }

    public void setIntent(Intent intent) {
        this.mIntent = intent;
    }

    public void setSubActions(List<GuidedAction> list) {
        this.mSubActions = list;
    }

    public void setTitle(CharSequence charSequence) {
        setLabel1(charSequence);
    }
}
