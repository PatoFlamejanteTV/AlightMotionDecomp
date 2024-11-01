package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j8, AbstractC3284p abstractC3284p) {
        this(annotatedString, j8);
    }

    private final void setSelectionEnd(int i8) {
        if (i8 >= 0) {
            this.selectionEnd = i8;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i8).toString());
    }

    private final void setSelectionStart(int i8) {
        if (i8 >= 0) {
            this.selectionStart = i8;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i8).toString());
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int i8, int i9) {
        long TextRange = TextRangeKt.TextRange(i8, i9);
        this.gapBuffer.replace(i8, i9, "");
        long m4828updateRangeAfterDeletepWDy79M = EditingBufferKt.m4828updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        setSelectionStart(TextRange.m4667getMinimpl(m4828updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m4666getMaximpl(m4828updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long m4828updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m4828updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (TextRange.m4663getCollapsedimpl(m4828updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m4667getMinimpl(m4828updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m4666getMaximpl(m4828updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int i8) {
        return this.gapBuffer.get(i8);
    }

    /* renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m4826getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m4657boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i8 = this.selectionStart;
        int i9 = this.selectionEnd;
        if (i8 != i9) {
            return -1;
        }
        return i9;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m4827getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        if (this.compositionStart != -1) {
            return true;
        }
        return false;
    }

    public final void replace$ui_text_release(int i8, int i9, AnnotatedString annotatedString) {
        replace$ui_text_release(i8, i9, annotatedString.getText());
    }

    public final void setComposition$ui_text_release(int i8, int i9) {
        if (i8 >= 0 && i8 <= this.gapBuffer.getLength()) {
            if (i9 >= 0 && i9 <= this.gapBuffer.getLength()) {
                if (i8 < i9) {
                    this.compositionStart = i8;
                    this.compositionEnd = i9;
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed or empty range: " + i8 + " > " + i9);
            }
            throw new IndexOutOfBoundsException("end (" + i9 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        throw new IndexOutOfBoundsException("start (" + i8 + ") offset is outside of text region " + this.gapBuffer.getLength());
    }

    public final void setCursor$ui_text_release(int i8) {
        setSelection$ui_text_release(i8, i8);
    }

    public final void setSelection$ui_text_release(int i8, int i9) {
        if (i8 >= 0 && i8 <= this.gapBuffer.getLength()) {
            if (i9 >= 0 && i9 <= this.gapBuffer.getLength()) {
                if (i8 <= i9) {
                    setSelectionStart(i8);
                    setSelectionEnd(i9);
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed range: " + i8 + " > " + i9);
            }
            throw new IndexOutOfBoundsException("end (" + i9 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        throw new IndexOutOfBoundsException("start (" + i8 + ") offset is outside of text region " + this.gapBuffer.getLength());
    }

    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public /* synthetic */ EditingBuffer(String str, long j8, AbstractC3284p abstractC3284p) {
        this(str, j8);
    }

    public final void replace$ui_text_release(int i8, int i9, String str) {
        if (i8 >= 0 && i8 <= this.gapBuffer.getLength()) {
            if (i9 < 0 || i9 > this.gapBuffer.getLength()) {
                throw new IndexOutOfBoundsException("end (" + i9 + ") offset is outside of text region " + this.gapBuffer.getLength());
            }
            if (i8 <= i9) {
                this.gapBuffer.replace(i8, i9, str);
                setSelectionStart(str.length() + i8);
                setSelectionEnd(i8 + str.length());
                this.compositionStart = -1;
                this.compositionEnd = -1;
                return;
            }
            throw new IllegalArgumentException("Do not set reversed range: " + i8 + " > " + i9);
        }
        throw new IndexOutOfBoundsException("start (" + i8 + ") offset is outside of text region " + this.gapBuffer.getLength());
    }

    private EditingBuffer(AnnotatedString annotatedString, long j8) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m4667getMinimpl(j8);
        this.selectionEnd = TextRange.m4666getMaximpl(j8);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int m4667getMinimpl = TextRange.m4667getMinimpl(j8);
        int m4666getMaximpl = TextRange.m4666getMaximpl(j8);
        if (m4667getMinimpl >= 0 && m4667getMinimpl <= annotatedString.length()) {
            if (m4666getMaximpl < 0 || m4666getMaximpl > annotatedString.length()) {
                throw new IndexOutOfBoundsException("end (" + m4666getMaximpl + ") offset is outside of text region " + annotatedString.length());
            }
            if (m4667getMinimpl <= m4666getMaximpl) {
                return;
            }
            throw new IllegalArgumentException("Do not set reversed range: " + m4667getMinimpl + " > " + m4666getMaximpl);
        }
        throw new IndexOutOfBoundsException("start (" + m4667getMinimpl + ") offset is outside of text region " + annotatedString.length());
    }

    private EditingBuffer(String str, long j8) {
        this(new AnnotatedString(str, null, null, 6, null), j8, (AbstractC3284p) null);
    }
}
