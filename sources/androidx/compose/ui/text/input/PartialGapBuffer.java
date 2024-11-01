package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
@InternalTextApi
/* loaded from: classes.dex */
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private String text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public PartialGapBuffer(String str) {
        this.text = str;
    }

    public final char get(int i8) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(i8);
        }
        if (i8 < this.bufStart) {
            return this.text.charAt(i8);
        }
        int length = gapBuffer.length();
        int i9 = this.bufStart;
        if (i8 < length + i9) {
            return gapBuffer.get(i8 - i9);
        }
        return this.text.charAt(i8 - ((length - this.bufEnd) + i9));
    }

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.length();
        }
        return (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public final String getText() {
        return this.text;
    }

    public final void replace(int i8, int i9, String str) {
        if (i8 <= i9) {
            if (i8 >= 0) {
                GapBuffer gapBuffer = this.buffer;
                if (gapBuffer == null) {
                    int max = Math.max(255, str.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i8, 64);
                    int min2 = Math.min(this.text.length() - i9, 64);
                    int i10 = i8 - min;
                    GapBuffer_jvmKt.toCharArray(this.text, cArr, 0, i10, i8);
                    int i11 = max - min2;
                    int i12 = min2 + i9;
                    GapBuffer_jvmKt.toCharArray(this.text, cArr, i11, i9, i12);
                    GapBufferKt.toCharArray(str, cArr, min);
                    this.buffer = new GapBuffer(cArr, min + str.length(), i11);
                    this.bufStart = i10;
                    this.bufEnd = i12;
                    return;
                }
                int i13 = this.bufStart;
                int i14 = i8 - i13;
                int i15 = i9 - i13;
                if (i14 >= 0 && i15 <= gapBuffer.length()) {
                    gapBuffer.replace(i14, i15, str);
                    return;
                }
                this.text = toString();
                this.buffer = null;
                this.bufStart = -1;
                this.bufEnd = -1;
                replace(i8, i9, str);
                return;
            }
            throw new IllegalArgumentException(("start must be non-negative, but was " + i8).toString());
        }
        throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i8 + " > " + i9).toString());
    }

    public final void setText(String str) {
        this.text = str;
    }

    public String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        String str = this.text;
        sb.append((CharSequence) str, this.bufEnd, str.length());
        return sb.toString();
    }
}
