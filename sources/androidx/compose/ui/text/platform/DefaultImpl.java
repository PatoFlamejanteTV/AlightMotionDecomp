package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class DefaultImpl implements EmojiCompatStatusDelegate {
    private State<Boolean> loadState;

    public DefaultImpl() {
        State<Boolean> state;
        if (EmojiCompat.isConfigured()) {
            state = getFontLoadState();
        } else {
            state = null;
        }
        this.loadState = state;
    }

    private final State<Boolean> getFontLoadState() {
        final MutableState mutableStateOf$default;
        EmojiCompat emojiCompat = EmojiCompat.get();
        if (emojiCompat.getLoadState() != 1) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            emojiCompat.registerInitCallback(new EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void onFailed(Throwable th) {
                    ImmutableBool immutableBool;
                    DefaultImpl defaultImpl = this;
                    immutableBool = EmojiCompatStatus_androidKt.Falsey;
                    defaultImpl.loadState = immutableBool;
                }

                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void onInitialized() {
                    mutableStateOf$default.setValue(Boolean.TRUE);
                    this.loadState = new ImmutableBool(true);
                }
            });
            return mutableStateOf$default;
        }
        return new ImmutableBool(true);
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public State<Boolean> getFontLoaded() {
        ImmutableBool immutableBool;
        State<Boolean> state = this.loadState;
        if (state != null) {
            AbstractC3292y.f(state);
            return state;
        }
        if (!EmojiCompat.isConfigured()) {
            immutableBool = EmojiCompatStatus_androidKt.Falsey;
            return immutableBool;
        }
        State<Boolean> fontLoadState = getFontLoadState();
        this.loadState = fontLoadState;
        AbstractC3292y.f(fontLoadState);
        return fontLoadState;
    }
}
