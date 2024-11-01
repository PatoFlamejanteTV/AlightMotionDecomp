package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class StringHelpers_androidKt {
    public static final int findFollowingBreak(String str, int i8) {
        AbstractC3292y.i(str, "<this>");
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            Integer valueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiEnd(str, i8));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i8);
    }

    public static final int findPrecedingBreak(String str, int i8) {
        AbstractC3292y.i(str, "<this>");
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            Integer valueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiStart(str, Math.max(0, i8 - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i8);
    }

    private static final EmojiCompat getEmojiCompatIfLoaded() {
        if (!EmojiCompat.isConfigured()) {
            return null;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        if (emojiCompat.getLoadState() != 1) {
            return null;
        }
        return emojiCompat;
    }
}
