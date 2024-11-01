package androidx.compose.ui.text.platform;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {
    public static final EmojiCompatStatus INSTANCE = new EmojiCompatStatus();
    private static EmojiCompatStatusDelegate delegate = new DefaultImpl();
    public static final int $stable = 8;

    private EmojiCompatStatus() {
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public State<Boolean> getFontLoaded() {
        return delegate.getFontLoaded();
    }

    @VisibleForTesting
    public final void setDelegateForTesting$ui_text_release(EmojiCompatStatusDelegate emojiCompatStatusDelegate) {
        if (emojiCompatStatusDelegate == null) {
            emojiCompatStatusDelegate = new DefaultImpl();
        }
        delegate = emojiCompatStatusDelegate;
    }
}
