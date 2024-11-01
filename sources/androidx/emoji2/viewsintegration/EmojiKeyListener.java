package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
final class EmojiKeyListener implements KeyListener {
    private final EmojiCompatHandleKeyDownHelper mEmojiCompatHandleKeyDownHelper;
    private final KeyListener mKeyListener;

    /* loaded from: classes3.dex */
    public static class EmojiCompatHandleKeyDownHelper {
        public boolean handleKeyDown(@NonNull Editable editable, int i8, @NonNull KeyEvent keyEvent) {
            return EmojiCompat.handleOnKeyDown(editable, i8, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EmojiKeyListener(KeyListener keyListener) {
        this(keyListener, new EmojiCompatHandleKeyDownHelper());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i8) {
        this.mKeyListener.clearMetaKeyState(view, editable, i8);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.mKeyListener.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i8, KeyEvent keyEvent) {
        if (!this.mEmojiCompatHandleKeyDownHelper.handleKeyDown(editable, i8, keyEvent) && !this.mKeyListener.onKeyDown(view, editable, i8, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.mKeyListener.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i8, KeyEvent keyEvent) {
        return this.mKeyListener.onKeyUp(view, editable, i8, keyEvent);
    }

    EmojiKeyListener(KeyListener keyListener, EmojiCompatHandleKeyDownHelper emojiCompatHandleKeyDownHelper) {
        this.mKeyListener = keyListener;
        this.mEmojiCompatHandleKeyDownHelper = emojiCompatHandleKeyDownHelper;
    }
}
