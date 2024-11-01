package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class WordBoundary {
    public static final int $stable = 8;
    private final WordIterator wordIterator;

    public WordBoundary(Locale locale, CharSequence charSequence) {
        this.wordIterator = new WordIterator(charSequence, 0, charSequence.length(), locale);
    }

    public final int getWordEnd(int i8) {
        int nextWordEndOnTwoWordBoundary;
        if (this.wordIterator.isAfterPunctuation(this.wordIterator.nextBoundary(i8))) {
            nextWordEndOnTwoWordBoundary = this.wordIterator.getPunctuationEnd(i8);
        } else {
            nextWordEndOnTwoWordBoundary = this.wordIterator.getNextWordEndOnTwoWordBoundary(i8);
        }
        if (nextWordEndOnTwoWordBoundary != -1) {
            return nextWordEndOnTwoWordBoundary;
        }
        return i8;
    }

    public final int getWordStart(int i8) {
        int prevWordBeginningOnTwoWordsBoundary;
        if (this.wordIterator.isOnPunctuation(this.wordIterator.prevBoundary(i8))) {
            prevWordBeginningOnTwoWordsBoundary = this.wordIterator.getPunctuationBeginning(i8);
        } else {
            prevWordBeginningOnTwoWordsBoundary = this.wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i8);
        }
        if (prevWordBeginningOnTwoWordsBoundary != -1) {
            return prevWordBeginningOnTwoWordsBoundary;
        }
        return i8;
    }
}
