package androidx.compose.foundation.text.selection;

import Q5.r;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import i6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegate implements Selectable {
    private int _previousLastVisibleOffset;
    private TextLayoutResult _previousTextLayoutResult;
    private final Function0 coordinatesCallback;
    private final Function0 layoutResultCallback;
    private final long selectableId;

    public MultiWidgetSelectionDelegate(long j8, Function0 coordinatesCallback, Function0 layoutResultCallback) {
        AbstractC3292y.i(coordinatesCallback, "coordinatesCallback");
        AbstractC3292y.i(layoutResultCallback, "layoutResultCallback");
        this.selectableId = j8;
        this.coordinatesCallback = coordinatesCallback;
        this.layoutResultCallback = layoutResultCallback;
        this._previousLastVisibleOffset = -1;
    }

    private final synchronized int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int lineCount;
        try {
            if (this._previousTextLayoutResult != textLayoutResult) {
                if (textLayoutResult.getDidOverflowHeight() && !textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                    lineCount = m.g(textLayoutResult.getLineForVerticalPosition(IntSize.m5320getHeightimpl(textLayoutResult.m4642getSizeYbymL2g())), textLayoutResult.getLineCount() - 1);
                    while (textLayoutResult.getLineTop(lineCount) >= IntSize.m5320getHeightimpl(textLayoutResult.m4642getSizeYbymL2g())) {
                        lineCount--;
                    }
                    this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                    this._previousTextLayoutResult = textLayoutResult;
                }
                lineCount = textLayoutResult.getLineCount() - 1;
                this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                this._previousTextLayoutResult = textLayoutResult;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this._previousLastVisibleOffset;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Rect getBoundingBox(int i8) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return Rect.Companion.getZero();
        }
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (length < 1) {
            return Rect.Companion.getZero();
        }
        return textLayoutResult.getBoundingBox(m.k(i8, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo988getHandlePositiondBAh8RU(Selection selection, boolean z8) {
        Selection.AnchorInfo end;
        AbstractC3292y.i(selection, "selection");
        if ((z8 && selection.getStart().getSelectableId() != getSelectableId()) || (!z8 && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.Companion.m2728getZeroF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return Offset.Companion.m2728getZeroF1C5BW0();
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return Offset.Companion.m2728getZeroF1C5BW0();
        }
        if (z8) {
            end = selection.getStart();
        } else {
            end = selection.getEnd();
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult, m.k(end.getOffset(), 0, getLastVisibleOffset(textLayoutResult)), z8, selection.getHandlesCrossed());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.coordinatesCallback.invoke();
        if (layoutCoordinates != null && layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        return null;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo989getRangeOfLineContainingjx7JFs(int i8) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return TextRange.Companion.m4674getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(textLayoutResult);
        if (lastVisibleOffset < 1) {
            return TextRange.Companion.m4674getZerod9O1mEE();
        }
        int lineForOffset = textLayoutResult.getLineForOffset(m.k(i8, 0, lastVisibleOffset - 1));
        return TextRangeKt.TextRange(textLayoutResult.getLineStart(lineForOffset), textLayoutResult.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return null;
        }
        return MultiWidgetSelectionDelegateKt.m991access$getAssembledSelectionInfovJH6DeI(TextRangeKt.TextRange(0, textLayoutResult.getLayoutInput().getText().length()), false, getSelectableId(), textLayoutResult);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return new AnnotatedString("", null, null, 6, null);
        }
        return textLayoutResult.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: updateSelection-qCDeeow, reason: not valid java name */
    public r mo990updateSelectionqCDeeow(long j8, long j9, Offset offset, boolean z8, LayoutCoordinates containerLayoutCoordinates, SelectionAdjustment adjustment, Selection selection) {
        Offset offset2;
        AbstractC3292y.i(containerLayoutCoordinates, "containerLayoutCoordinates");
        AbstractC3292y.i(adjustment, "adjustment");
        if (selection != null && (getSelectableId() != selection.getStart().getSelectableId() || getSelectableId() != selection.getEnd().getSelectableId())) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
        }
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return new r(null, Boolean.FALSE);
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return new r(null, Boolean.FALSE);
        }
        long mo4116localPositionOfR5De75A = containerLayoutCoordinates.mo4116localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m2728getZeroF1C5BW0());
        long m2716minusMKHz9U = Offset.m2716minusMKHz9U(j8, mo4116localPositionOfR5De75A);
        long m2716minusMKHz9U2 = Offset.m2716minusMKHz9U(j9, mo4116localPositionOfR5De75A);
        if (offset != null) {
            offset2 = Offset.m2701boximpl(Offset.m2716minusMKHz9U(offset.m2722unboximpl(), mo4116localPositionOfR5De75A));
        } else {
            offset2 = null;
        }
        return MultiWidgetSelectionDelegateKt.m994getTextSelectionInfoyM0VcXU(textLayoutResult, m2716minusMKHz9U, m2716minusMKHz9U2, offset2, getSelectableId(), adjustment, selection, z8);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return getLastVisibleOffset(textLayoutResult);
    }
}
