package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class WordIterator {
    private static final int WINDOW_WIDTH = 50;
    private final CharSequence charSequence;
    private final int end;
    private final BreakIterator iterator;
    private final int start;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final boolean isPunctuation$ui_text_release(int i8) {
            int type = Character.getType(i8);
            if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
                return false;
            }
            return true;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public WordIterator(CharSequence charSequence, int i8, int i9, Locale locale) {
        this.charSequence = charSequence;
        if (i8 >= 0 && i8 <= charSequence.length()) {
            if (i9 >= 0 && i9 <= charSequence.length()) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                this.iterator = wordInstance;
                this.start = Math.max(0, i8 - 50);
                this.end = Math.min(charSequence.length(), i9 + 50);
                wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i8, i9));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    private final void checkOffsetIsValid(int i8) {
        int i9 = this.start;
        if (i8 <= this.end && i9 <= i8) {
            return;
        }
        throw new IllegalArgumentException(("Invalid offset: " + i8 + ". Valid range is [" + this.start + " , " + this.end + ']').toString());
    }

    private final int getBeginning(int i8, boolean z8) {
        checkOffsetIsValid(i8);
        if (isOnLetterOrDigit(i8)) {
            if (!this.iterator.isBoundary(i8) || (isAfterLetterOrDigit(i8) && z8)) {
                return this.iterator.preceding(i8);
            }
            return i8;
        }
        if (isAfterLetterOrDigit(i8)) {
            return this.iterator.preceding(i8);
        }
        return -1;
    }

    private final int getEnd(int i8, boolean z8) {
        checkOffsetIsValid(i8);
        if (isAfterLetterOrDigit(i8)) {
            if (!this.iterator.isBoundary(i8) || (isOnLetterOrDigit(i8) && z8)) {
                return this.iterator.following(i8);
            }
            return i8;
        }
        if (isOnLetterOrDigit(i8)) {
            return this.iterator.following(i8);
        }
        return -1;
    }

    private final boolean isAfterLetterOrDigit(int i8) {
        int i9 = this.start + 1;
        if (i8 <= this.end && i9 <= i8 && Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i8))) {
            return true;
        }
        return false;
    }

    private final boolean isOnLetterOrDigit(int i8) {
        int i9 = this.start;
        if (i8 < this.end && i9 <= i8 && Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i8))) {
            return true;
        }
        return false;
    }

    private final boolean isPunctuationEndBoundary(int i8) {
        if (!isOnPunctuation(i8) && isAfterPunctuation(i8)) {
            return true;
        }
        return false;
    }

    private final boolean isPunctuationStartBoundary(int i8) {
        if (isOnPunctuation(i8) && !isAfterPunctuation(i8)) {
            return true;
        }
        return false;
    }

    public final int getNextWordEndOnTwoWordBoundary(int i8) {
        return getEnd(i8, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i8) {
        return getBeginning(i8, true);
    }

    public final int getPunctuationBeginning(int i8) {
        checkOffsetIsValid(i8);
        while (i8 != -1 && !isPunctuationStartBoundary(i8)) {
            i8 = prevBoundary(i8);
        }
        return i8;
    }

    public final int getPunctuationEnd(int i8) {
        checkOffsetIsValid(i8);
        while (i8 != -1 && !isPunctuationEndBoundary(i8)) {
            i8 = nextBoundary(i8);
        }
        return i8;
    }

    public final boolean isAfterPunctuation(int i8) {
        int i9 = this.start + 1;
        if (i8 <= this.end && i9 <= i8) {
            return Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.charSequence, i8));
        }
        return false;
    }

    public final boolean isOnPunctuation(int i8) {
        int i9 = this.start;
        if (i8 < this.end && i9 <= i8) {
            return Companion.isPunctuation$ui_text_release(Character.codePointAt(this.charSequence, i8));
        }
        return false;
    }

    public final int nextBoundary(int i8) {
        checkOffsetIsValid(i8);
        return this.iterator.following(i8);
    }

    public final int prevBoundary(int i8) {
        checkOffsetIsValid(i8);
        return this.iterator.preceding(i8);
    }
}
