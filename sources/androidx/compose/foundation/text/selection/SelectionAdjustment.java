package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes.dex */
public interface SelectionAdjustment {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SelectionAdjustment None = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$None$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo997adjustZXO7KMw(TextLayoutResult textLayoutResult, long j8, int i8, boolean z8, TextRange textRange) {
                AbstractC3292y.i(textLayoutResult, "textLayoutResult");
                return j8;
            }
        };
        private static final SelectionAdjustment Character = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Character$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo997adjustZXO7KMw(TextLayoutResult textLayoutResult, long j8, int i8, boolean z8, TextRange textRange) {
                boolean z9;
                AbstractC3292y.i(textLayoutResult, "textLayoutResult");
                if (TextRange.m4663getCollapsedimpl(j8)) {
                    if (textRange != null) {
                        z9 = TextRange.m4668getReversedimpl(textRange.m4673unboximpl());
                    } else {
                        z9 = false;
                    }
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(textLayoutResult.getLayoutInput().getText().getText(), TextRange.m4669getStartimpl(j8), n.L(textLayoutResult.getLayoutInput().getText()), z8, z9);
                }
                return j8;
            }
        };
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo997adjustZXO7KMw(TextLayoutResult textLayoutResult, long j8, int i8, boolean z8, TextRange textRange) {
                long m999adjustByBoundaryDvylE;
                AbstractC3292y.i(textLayoutResult, "textLayoutResult");
                m999adjustByBoundaryDvylE = SelectionAdjustment.Companion.$$INSTANCE.m999adjustByBoundaryDvylE(textLayoutResult, j8, new SelectionAdjustment$Companion$Word$1$adjust$1(textLayoutResult));
                return m999adjustByBoundaryDvylE;
            }
        };
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo997adjustZXO7KMw(TextLayoutResult textLayoutResult, long j8, int i8, boolean z8, TextRange textRange) {
                long m999adjustByBoundaryDvylE;
                AbstractC3292y.i(textLayoutResult, "textLayoutResult");
                m999adjustByBoundaryDvylE = SelectionAdjustment.Companion.$$INSTANCE.m999adjustByBoundaryDvylE(textLayoutResult, j8, new SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(textLayoutResult.getLayoutInput().getText()));
                return m999adjustByBoundaryDvylE;
            }
        };
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$CharacterWithWordAccelerate$1
            private final boolean isAtWordBoundary(TextLayoutResult textLayoutResult, int i8) {
                long m4643getWordBoundaryjx7JFs = textLayoutResult.m4643getWordBoundaryjx7JFs(i8);
                if (i8 != TextRange.m4669getStartimpl(m4643getWordBoundaryjx7JFs) && i8 != TextRange.m4664getEndimpl(m4643getWordBoundaryjx7JFs)) {
                    return false;
                }
                return true;
            }

            private final boolean isExpanding(int i8, int i9, boolean z8, boolean z9) {
                if (i9 == -1) {
                    return true;
                }
                if (i8 == i9) {
                    return false;
                }
                if (z8 ^ z9) {
                    if (i8 < i9) {
                        return true;
                    }
                } else if (i8 > i9) {
                    return true;
                }
                return false;
            }

            private final int snapToWordBoundary(TextLayoutResult textLayoutResult, int i8, int i9, int i10, boolean z8, boolean z9) {
                int lineStart;
                int lineEnd$default;
                long m4643getWordBoundaryjx7JFs = textLayoutResult.m4643getWordBoundaryjx7JFs(i8);
                if (textLayoutResult.getLineForOffset(TextRange.m4669getStartimpl(m4643getWordBoundaryjx7JFs)) == i9) {
                    lineStart = TextRange.m4669getStartimpl(m4643getWordBoundaryjx7JFs);
                } else {
                    lineStart = textLayoutResult.getLineStart(i9);
                }
                if (textLayoutResult.getLineForOffset(TextRange.m4664getEndimpl(m4643getWordBoundaryjx7JFs)) == i9) {
                    lineEnd$default = TextRange.m4664getEndimpl(m4643getWordBoundaryjx7JFs);
                } else {
                    lineEnd$default = TextLayoutResult.getLineEnd$default(textLayoutResult, i9, false, 2, null);
                }
                if (lineStart == i10) {
                    return lineEnd$default;
                }
                if (lineEnd$default == i10) {
                    return lineStart;
                }
                int i11 = (lineStart + lineEnd$default) / 2;
                if (z8 ^ z9) {
                    if (i8 <= i11) {
                        return lineStart;
                    }
                } else if (i8 < i11) {
                    return lineStart;
                }
                return lineEnd$default;
            }

            private final int updateSelectionBoundary(TextLayoutResult textLayoutResult, int i8, int i9, int i10, int i11, boolean z8, boolean z9) {
                if (i8 == i9) {
                    return i10;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i8);
                if (lineForOffset != textLayoutResult.getLineForOffset(i10)) {
                    return snapToWordBoundary(textLayoutResult, i8, lineForOffset, i11, z8, z9);
                }
                if (!isExpanding(i8, i9, z8, z9)) {
                    return i8;
                }
                if (!isAtWordBoundary(textLayoutResult, i10)) {
                    return i8;
                }
                return snapToWordBoundary(textLayoutResult, i8, lineForOffset, i11, z8, z9);
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo997adjustZXO7KMw(TextLayoutResult textLayoutResult, long j8, int i8, boolean z8, TextRange textRange) {
                int updateSelectionBoundary;
                int i9;
                AbstractC3292y.i(textLayoutResult, "textLayoutResult");
                if (textRange == null) {
                    return SelectionAdjustment.Companion.$$INSTANCE.getWord().mo997adjustZXO7KMw(textLayoutResult, j8, i8, z8, textRange);
                }
                if (TextRange.m4663getCollapsedimpl(j8)) {
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(textLayoutResult.getLayoutInput().getText().getText(), TextRange.m4669getStartimpl(j8), n.L(textLayoutResult.getLayoutInput().getText()), z8, TextRange.m4668getReversedimpl(textRange.m4673unboximpl()));
                }
                if (z8) {
                    i9 = updateSelectionBoundary(textLayoutResult, TextRange.m4669getStartimpl(j8), i8, TextRange.m4669getStartimpl(textRange.m4673unboximpl()), TextRange.m4664getEndimpl(j8), true, TextRange.m4668getReversedimpl(j8));
                    updateSelectionBoundary = TextRange.m4664getEndimpl(j8);
                } else {
                    int m4669getStartimpl = TextRange.m4669getStartimpl(j8);
                    updateSelectionBoundary = updateSelectionBoundary(textLayoutResult, TextRange.m4664getEndimpl(j8), i8, TextRange.m4664getEndimpl(textRange.m4673unboximpl()), TextRange.m4669getStartimpl(j8), false, TextRange.m4668getReversedimpl(j8));
                    i9 = m4669getStartimpl;
                }
                return TextRangeKt.TextRange(i9, updateSelectionBoundary);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: adjustByBoundary--Dv-ylE, reason: not valid java name */
        public final long m999adjustByBoundaryDvylE(TextLayoutResult textLayoutResult, long j8, Function1 function1) {
            int m4669getStartimpl;
            int m4664getEndimpl;
            if (textLayoutResult.getLayoutInput().getText().length() == 0) {
                return TextRange.Companion.m4674getZerod9O1mEE();
            }
            int L8 = n.L(textLayoutResult.getLayoutInput().getText());
            long m4673unboximpl = ((TextRange) function1.invoke(Integer.valueOf(m.k(TextRange.m4669getStartimpl(j8), 0, L8)))).m4673unboximpl();
            long m4673unboximpl2 = ((TextRange) function1.invoke(Integer.valueOf(m.k(TextRange.m4664getEndimpl(j8), 0, L8)))).m4673unboximpl();
            if (TextRange.m4668getReversedimpl(j8)) {
                m4669getStartimpl = TextRange.m4664getEndimpl(m4673unboximpl);
            } else {
                m4669getStartimpl = TextRange.m4669getStartimpl(m4673unboximpl);
            }
            if (TextRange.m4668getReversedimpl(j8)) {
                m4664getEndimpl = TextRange.m4669getStartimpl(m4673unboximpl2);
            } else {
                m4664getEndimpl = TextRange.m4664getEndimpl(m4673unboximpl2);
            }
            return TextRangeKt.TextRange(m4669getStartimpl, m4664getEndimpl);
        }

        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        public final SelectionAdjustment getNone() {
            return None;
        }

        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    /* renamed from: adjust-ZXO7KMw, reason: not valid java name */
    long mo997adjustZXO7KMw(TextLayoutResult textLayoutResult, long j8, int i8, boolean z8, TextRange textRange);
}
