package androidx.compose.ui.text.android;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.CharacterIterator;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CharSequenceCharacterIterator implements CharacterIterator {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    public CharSequenceCharacterIterator(CharSequence charSequence, int i8, int i9) {
        this.charSequence = charSequence;
        this.start = i8;
        this.end = i9;
        this.index = i8;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i8 = this.index;
        if (i8 == this.end) {
            return (char) 65535;
        }
        return this.charSequence.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.index = this.start;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.start;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.end;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.index;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i8 = this.start;
        int i9 = this.end;
        if (i8 == i9) {
            this.index = i9;
            return (char) 65535;
        }
        int i10 = i9 - 1;
        this.index = i10;
        return this.charSequence.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i8 = this.index + 1;
        this.index = i8;
        int i9 = this.end;
        if (i8 >= i9) {
            this.index = i9;
            return (char) 65535;
        }
        return this.charSequence.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i8 = this.index;
        if (i8 <= this.start) {
            return (char) 65535;
        }
        int i9 = i8 - 1;
        this.index = i9;
        return this.charSequence.charAt(i9);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i8) {
        int i9 = this.start;
        if (i8 <= this.end && i9 <= i8) {
            this.index = i8;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
