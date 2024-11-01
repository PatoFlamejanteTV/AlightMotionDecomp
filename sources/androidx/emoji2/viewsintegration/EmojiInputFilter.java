package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
final class EmojiInputFilter implements InputFilter {
    private EmojiCompat.InitCallback mInitCallback;
    private final TextView mTextView;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes3.dex */
    public static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {
        private final Reference<EmojiInputFilter> mEmojiInputFilterReference;
        private final Reference<TextView> mViewRef;

        InitCallbackImpl(TextView textView, EmojiInputFilter emojiInputFilter) {
            this.mViewRef = new WeakReference(textView);
            this.mEmojiInputFilterReference = new WeakReference(emojiInputFilter);
        }

        private boolean isInputFilterCurrentlyRegisteredOnTextView(@Nullable TextView textView, @Nullable InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            Handler handler;
            super.onInitialized();
            TextView textView = this.mViewRef.get();
            if (textView != null && (handler = textView.getHandler()) != null) {
                handler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence process;
            TextView textView = this.mViewRef.get();
            if (!isInputFilterCurrentlyRegisteredOnTextView(textView, this.mEmojiInputFilterReference.get()) || !textView.isAttachedToWindow() || text == (process = EmojiCompat.get().process((text = textView.getText())))) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(process);
            int selectionEnd = Selection.getSelectionEnd(process);
            textView.setText(process);
            if (process instanceof Spannable) {
                EmojiInputFilter.updateSelection((Spannable) process, selectionStart, selectionEnd);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EmojiInputFilter(@NonNull TextView textView) {
        this.mTextView = textView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void updateSelection(Spannable spannable, int i8, int i9) {
        if (i8 >= 0 && i9 >= 0) {
            Selection.setSelection(spannable, i8, i9);
        } else if (i8 >= 0) {
            Selection.setSelection(spannable, i8);
        } else if (i9 >= 0) {
            Selection.setSelection(spannable, i9);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i8, int i9, Spanned spanned, int i10, int i11) {
        if (this.mTextView.isInEditMode()) {
            return charSequence;
        }
        int loadState = EmojiCompat.get().getLoadState();
        if (loadState != 0) {
            if (loadState != 1) {
                if (loadState != 3) {
                    return charSequence;
                }
            } else {
                if ((i11 != 0 || i10 != 0 || spanned.length() != 0 || charSequence != this.mTextView.getText()) && charSequence != null) {
                    if (i8 != 0 || i9 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i8, i9);
                    }
                    return EmojiCompat.get().process(charSequence, 0, charSequence.length());
                }
                return charSequence;
            }
        }
        EmojiCompat.get().registerInitCallback(getInitCallback());
        return charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    EmojiCompat.InitCallback getInitCallback() {
        if (this.mInitCallback == null) {
            this.mInitCallback = new InitCallbackImpl(this.mTextView, this);
        }
        return this.mInitCallback;
    }
}
