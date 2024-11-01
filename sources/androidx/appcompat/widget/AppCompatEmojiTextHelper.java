package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* loaded from: classes.dex */
class AppCompatEmojiTextHelper {

    @NonNull
    private final EmojiTextViewHelper mEmojiTextViewHelper;

    @NonNull
    private final TextView mView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatEmojiTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mEmojiTextViewHelper = new EmojiTextViewHelper(textView, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
        return this.mEmojiTextViewHelper.getFilters(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.mEmojiTextViewHelper.isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i8) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, R.styleable.AppCompatTextView, i8, 0);
        try {
            int i9 = R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z8 = true;
            if (obtainStyledAttributes.hasValue(i9)) {
                z8 = obtainStyledAttributes.getBoolean(i9, true);
            }
            obtainStyledAttributes.recycle();
            setEnabled(z8);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAllCaps(boolean z8) {
        this.mEmojiTextViewHelper.setAllCaps(z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEnabled(boolean z8) {
        this.mEmojiTextViewHelper.setEnabled(z8);
    }

    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
        return this.mEmojiTextViewHelper.wrapTransformationMethod(transformationMethod);
    }
}
