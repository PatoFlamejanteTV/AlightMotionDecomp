package androidx.compose.ui.text;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class JvmCharHelpers_androidKt {
    public static final int findFollowingBreak(String str, int i8) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i8);
    }

    public static final int findPrecedingBreak(String str, int i8) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i8);
    }
}
