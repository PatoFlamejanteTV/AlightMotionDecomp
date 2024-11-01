package androidx.compose.ui.text.input;

import R5.AbstractC1428l;

/* loaded from: classes.dex */
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] cArr, int i8, int i9) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i8;
        this.gapEnd = i9;
    }

    private final void delete(int i8, int i9) {
        int i10 = this.gapStart;
        if (i8 < i10 && i9 <= i10) {
            int i11 = i10 - i9;
            char[] cArr = this.buffer;
            AbstractC1428l.e(cArr, cArr, this.gapEnd - i11, i9, i10);
            this.gapStart = i8;
            this.gapEnd -= i11;
            return;
        }
        if (i8 < i10 && i9 >= i10) {
            this.gapEnd = i9 + gapLength();
            this.gapStart = i8;
            return;
        }
        int gapLength = i8 + gapLength();
        int gapLength2 = i9 + gapLength();
        int i12 = this.gapEnd;
        char[] cArr2 = this.buffer;
        AbstractC1428l.e(cArr2, cArr2, this.gapStart, i12, gapLength);
        this.gapStart += gapLength - i12;
        this.gapEnd = gapLength2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int i8) {
        if (i8 <= gapLength()) {
            return;
        }
        int gapLength = i8 - gapLength();
        int i9 = this.capacity;
        do {
            i9 *= 2;
        } while (i9 - this.capacity < gapLength);
        char[] cArr = new char[i9];
        AbstractC1428l.e(this.buffer, cArr, 0, 0, this.gapStart);
        int i10 = this.capacity;
        int i11 = this.gapEnd;
        int i12 = i10 - i11;
        int i13 = i9 - i12;
        AbstractC1428l.e(this.buffer, cArr, i13, i11, i12 + i11);
        this.buffer = cArr;
        this.capacity = i9;
        this.gapEnd = i13;
    }

    public final void append(StringBuilder sb) {
        sb.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i8 = this.gapEnd;
        sb.append(cArr, i8, this.capacity - i8);
    }

    public final char get(int i8) {
        int i9 = this.gapStart;
        if (i8 < i9) {
            return this.buffer[i8];
        }
        return this.buffer[(i8 - i9) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int i8, int i9, String str) {
        makeSureAvailableSpace(str.length() - (i9 - i8));
        delete(i8, i9);
        GapBufferKt.toCharArray(str, this.buffer, this.gapStart);
        this.gapStart += str.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
