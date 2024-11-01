package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
final class EmojiTextWatcher implements TextWatcher {
    private final EditText mEditText;
    private final boolean mExpectInitializedEmojiCompat;
    private EmojiCompat.InitCallback mInitCallback;
    private int mMaxEmojiCount = Integer.MAX_VALUE;
    private int mEmojiReplaceStrategy = 0;
    private boolean mEnabled = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes3.dex */
    public static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {
        private final Reference<EditText> mViewRef;

        InitCallbackImpl(EditText editText) {
            this.mViewRef = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            Handler handler;
            super.onInitialized();
            EditText editText = this.mViewRef.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            EmojiTextWatcher.processTextOnEnablingEvent(this.mViewRef.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EmojiTextWatcher(EditText editText, boolean z8) {
        this.mEditText = editText;
        this.mExpectInitializedEmojiCompat = z8;
    }

    static void processTextOnEnablingEvent(@Nullable EditText editText, int i8) {
        if (i8 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.get().process(editableText);
            EmojiInputFilter.updateSelection(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean shouldSkipForDisabledOrNotConfigured() {
        if (this.mEnabled && (this.mExpectInitializedEmojiCompat || EmojiCompat.isConfigured())) {
            return false;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }

    int getEmojiReplaceStrategy() {
        return this.mEmojiReplaceStrategy;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    EmojiCompat.InitCallback getInitCallback() {
        if (this.mInitCallback == null) {
            this.mInitCallback = new InitCallbackImpl(this.mEditText);
        }
        return this.mInitCallback;
    }

    int getMaxEmojiCount() {
        return this.mMaxEmojiCount;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        if (!this.mEditText.isInEditMode() && !shouldSkipForDisabledOrNotConfigured() && i9 <= i10 && (charSequence instanceof Spannable)) {
            int loadState = EmojiCompat.get().getLoadState();
            if (loadState != 0) {
                if (loadState != 1) {
                    if (loadState != 3) {
                        return;
                    }
                } else {
                    EmojiCompat.get().process((Spannable) charSequence, i8, i8 + i10, this.mMaxEmojiCount, this.mEmojiReplaceStrategy);
                    return;
                }
            }
            EmojiCompat.get().registerInitCallback(getInitCallback());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEmojiReplaceStrategy(int i8) {
        this.mEmojiReplaceStrategy = i8;
    }

    public void setEnabled(boolean z8) {
        if (this.mEnabled != z8) {
            if (this.mInitCallback != null) {
                EmojiCompat.get().unregisterInitCallback(this.mInitCallback);
            }
            this.mEnabled = z8;
            if (z8) {
                processTextOnEnablingEvent(this.mEditText, EmojiCompat.get().getLoadState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxEmojiCount(int i8) {
        this.mMaxEmojiCount = i8;
    }
}
