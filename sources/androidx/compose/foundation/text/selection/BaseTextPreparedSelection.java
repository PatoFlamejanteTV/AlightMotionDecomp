package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final Companion Companion = new Companion(null);
    public static final int NoCharacterFound = -1;
    private AnnotatedString annotatedString;
    private final TextLayoutResult layoutResult;
    private final OffsetMapping offsetMapping;
    private final long originalSelection;
    private final AnnotatedString originalText;
    private long selection;
    private final TextPreparedSelectionState state;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j8, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, AbstractC3284p abstractC3284p) {
        this(annotatedString, j8, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z8, Function1 block, int i8, Object obj2) {
        if (obj2 == null) {
            if ((i8 & 1) != 0) {
                z8 = true;
            }
            AbstractC3292y.i(block, "block");
            if (z8) {
                baseTextPreparedSelection.getState().resetCachedX();
            }
            if (baseTextPreparedSelection.getText$foundation_release().length() > 0) {
                block.invoke(obj);
            }
            AbstractC3292y.g(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
            return (BaseTextPreparedSelection) obj;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
    }

    private final int charOffset(int i8) {
        return m.g(i8, getText$foundation_release().length() - 1);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i8) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i8), true));
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 1) != 0) {
                i8 = baseTextPreparedSelection.transformedMaxOffset();
            }
            return baseTextPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i8) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i8)));
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 1) != 0) {
                i8 = baseTextPreparedSelection.transformedMinOffset();
            }
            return baseTextPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i8) {
        while (i8 < this.originalText.length()) {
            long m4643getWordBoundaryjx7JFs = textLayoutResult.m4643getWordBoundaryjx7JFs(charOffset(i8));
            if (TextRange.m4664getEndimpl(m4643getWordBoundaryjx7JFs) <= i8) {
                i8++;
            } else {
                return this.offsetMapping.transformedToOriginal(TextRange.m4664getEndimpl(m4643getWordBoundaryjx7JFs));
            }
        }
        return this.originalText.length();
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 1) != 0) {
                i8 = baseTextPreparedSelection.transformedEndOffset();
            }
            return baseTextPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    private final int getParagraphEnd() {
        return StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m4666getMaximpl(this.selection));
    }

    private final int getParagraphStart() {
        return StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m4667getMinimpl(this.selection));
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i8) {
        while (i8 > 0) {
            long m4643getWordBoundaryjx7JFs = textLayoutResult.m4643getWordBoundaryjx7JFs(charOffset(i8));
            if (TextRange.m4669getStartimpl(m4643getWordBoundaryjx7JFs) >= i8) {
                i8--;
            } else {
                return this.offsetMapping.transformedToOriginal(TextRange.m4669getStartimpl(m4643getWordBoundaryjx7JFs));
            }
        }
        return 0;
    }

    static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i8, int i9, Object obj) {
        if (obj == null) {
            if ((i9 & 1) != 0) {
                i8 = baseTextPreparedSelection.transformedEndOffset();
            }
            return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    private final boolean isLtr() {
        ResolvedTextDirection resolvedTextDirection;
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            resolvedTextDirection = textLayoutResult.getParagraphDirection(transformedEndOffset());
        } else {
            resolvedTextDirection = null;
        }
        if (resolvedTextDirection != ResolvedTextDirection.Rtl) {
            return true;
        }
        return false;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i8) {
        int transformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(transformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(transformedEndOffset) + i8;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.state.getCachedX();
        AbstractC3292y.f(cachedX);
        float floatValue = cachedX.floatValue();
        if ((isLtr() && floatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && floatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m4641getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX.floatValue(), lineBottom)));
    }

    private final T moveCursorNext() {
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorNextByWord() {
        Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrev() {
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrevByWord() {
        Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m4664getEndimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m4666getMaximpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m4667getMinimpl(this.selection));
    }

    protected final <U> T apply(U u8, boolean z8, Function1 block) {
        AbstractC3292y.i(block, "block");
        if (z8) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            block.invoke(u8);
        }
        AbstractC3292y.g(u8, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u8;
    }

    public final T collapseLeftOr(Function1 or) {
        AbstractC3292y.i(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m4663getCollapsedimpl(this.selection)) {
                AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m4667getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m4666getMaximpl(this.selection));
            }
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T collapseRightOr(Function1 or) {
        AbstractC3292y.i(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m4663getCollapsedimpl(this.selection)) {
                AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m4666getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m4667getMinimpl(this.selection));
            }
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(TextRange.m4664getEndimpl(this.selection));
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
    }

    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m4664getEndimpl(this.selection));
    }

    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m984getOriginalSelectiond9O1mEE() {
        return this.originalSelection;
    }

    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m4664getEndimpl(this.selection));
    }

    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult == null) {
            return null;
        }
        return Integer.valueOf(getPrevWordOffset$default(this, textLayoutResult, 0, 1, null));
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m985getSelectiond9O1mEE() {
        return this.selection;
    }

    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    public final T moveCursorDownByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getParagraphEnd());
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getParagraphStart());
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getText$foundation_release().length());
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(0);
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineEnd() {
        Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorToLineStart() {
        Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0 && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T moveCursorUpByLine() {
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setSelection(0, getText$foundation_release().length());
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T selectMovement() {
        if (getText$foundation_release().length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m4669getStartimpl(this.originalSelection), TextRange.m4664getEndimpl(this.selection));
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void setAnnotatedString(AnnotatedString annotatedString) {
        AbstractC3292y.i(annotatedString, "<set-?>");
        this.annotatedString = annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setCursor(int i8) {
        setSelection(i8, i8);
    }

    protected final void setSelection(int i8, int i9) {
        this.selection = TextRangeKt.TextRange(i8, i9);
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m986setSelection5zctL8(long j8) {
        this.selection = j8;
    }

    private BaseTextPreparedSelection(AnnotatedString originalText, long j8, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState state) {
        AbstractC3292y.i(originalText, "originalText");
        AbstractC3292y.i(offsetMapping, "offsetMapping");
        AbstractC3292y.i(state, "state");
        this.originalText = originalText;
        this.originalSelection = j8;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = state;
        this.selection = j8;
        this.annotatedString = originalText;
    }
}
