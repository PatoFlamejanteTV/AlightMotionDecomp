package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import i6.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    private ClipboardManager clipboardManager;
    private final MutableState currentDragPosition$delegate;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;
    private final MutableState draggingHandle$delegate;
    private final MutableState editable$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1 onValueChange;
    private TextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private final MutableState value$delegate;
    private VisualTransformation visualTransformation;

    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        textFieldSelectionManager.copy$foundation_release(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m1054createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j8) {
        return new TextFieldValue(annotatedString, j8, (TextRange) null, 4, (AbstractC3284p) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m1055deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1058deselect_kEHs6E$foundation_release(offset);
    }

    private final Rect getContentRect() {
        long m2728getZeroF1C5BW0;
        long m2728getZeroF1C5BW02;
        float f8;
        LayoutCoordinates layoutCoordinates;
        float f9;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        float f10;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            if (!(!textFieldState.isLayoutResultStale())) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m4669getStartimpl(getValue$foundation_release().m4906getSelectiond9O1mEE()));
                int originalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m4664getEndimpl(getValue$foundation_release().m4906getSelectiond9O1mEE()));
                TextFieldState textFieldState2 = this.state;
                if (textFieldState2 != null && (layoutCoordinates4 = textFieldState2.getLayoutCoordinates()) != null) {
                    m2728getZeroF1C5BW0 = layoutCoordinates4.mo4117localToRootMKHz9U(m1061getHandlePositiontuRUvjQ$foundation_release(true));
                } else {
                    m2728getZeroF1C5BW0 = Offset.Companion.m2728getZeroF1C5BW0();
                }
                TextFieldState textFieldState3 = this.state;
                if (textFieldState3 != null && (layoutCoordinates3 = textFieldState3.getLayoutCoordinates()) != null) {
                    m2728getZeroF1C5BW02 = layoutCoordinates3.mo4117localToRootMKHz9U(m1061getHandlePositiontuRUvjQ$foundation_release(false));
                } else {
                    m2728getZeroF1C5BW02 = Offset.Companion.m2728getZeroF1C5BW0();
                }
                TextFieldState textFieldState4 = this.state;
                float f11 = 0.0f;
                if (textFieldState4 != null && (layoutCoordinates2 = textFieldState4.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    if (layoutResult != null && (value2 = layoutResult.getValue()) != null && (cursorRect2 = value2.getCursorRect(originalToTransformed)) != null) {
                        f10 = cursorRect2.getTop();
                    } else {
                        f10 = 0.0f;
                    }
                    f8 = Offset.m2713getYimpl(layoutCoordinates2.mo4117localToRootMKHz9U(OffsetKt.Offset(0.0f, f10)));
                } else {
                    f8 = 0.0f;
                }
                TextFieldState textFieldState5 = this.state;
                if (textFieldState5 != null && (layoutCoordinates = textFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
                    if (layoutResult2 != null && (value = layoutResult2.getValue()) != null && (cursorRect = value.getCursorRect(originalToTransformed2)) != null) {
                        f9 = cursorRect.getTop();
                    } else {
                        f9 = 0.0f;
                    }
                    f11 = Offset.m2713getYimpl(layoutCoordinates.mo4117localToRootMKHz9U(OffsetKt.Offset(0.0f, f9)));
                }
                return new Rect(Math.min(Offset.m2712getXimpl(m2728getZeroF1C5BW0), Offset.m2712getXimpl(m2728getZeroF1C5BW02)), Math.min(f8, f11), Math.max(Offset.m2712getXimpl(m2728getZeroF1C5BW0), Offset.m2712getXimpl(m2728getZeroF1C5BW02)), Math.max(Offset.m2713getYimpl(m2728getZeroF1C5BW0), Offset.m2713getYimpl(m2728getZeroF1C5BW02)) + (Dp.m5155constructorimpl(25) * textFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.Companion.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1056setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    private final void setHandleState(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setHandleState(handleState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelection(TextFieldValue textFieldValue, int i8, int i9, boolean z8, SelectionAdjustment selectionAdjustment) {
        TextLayoutResult textLayoutResult;
        TextLayoutResultProxy layoutResult;
        long TextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m4669getStartimpl(textFieldValue.m4906getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m4664getEndimpl(textFieldValue.m4906getSelectiond9O1mEE())));
        TextFieldState textFieldState = this.state;
        TextRange textRange = null;
        if (textFieldState != null && (layoutResult = textFieldState.getLayoutResult()) != null) {
            textLayoutResult = layoutResult.getValue();
        } else {
            textLayoutResult = null;
        }
        if (!TextRange.m4663getCollapsedimpl(TextRange)) {
            textRange = TextRange.m4657boximpl(TextRange);
        }
        long m1051getTextFieldSelectionbb3KNj8 = TextFieldSelectionDelegateKt.m1051getTextFieldSelectionbb3KNj8(textLayoutResult, i8, i9, textRange, z8, selectionAdjustment);
        long TextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(TextRange.m4669getStartimpl(m1051getTextFieldSelectionbb3KNj8)), this.offsetMapping.transformedToOriginal(TextRange.m4664getEndimpl(m1051getTextFieldSelectionbb3KNj8)));
        if (TextRange.m4662equalsimpl0(TextRange2, textFieldValue.m4906getSelectiond9O1mEE())) {
            return;
        }
        HapticFeedback hapticFeedback = this.hapticFeedBack;
        if (hapticFeedback != null) {
            hapticFeedback.mo3539performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3548getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m1054createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), TextRange2));
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        TextFieldState textFieldState3 = this.state;
        if (textFieldState3 != null) {
            textFieldState3.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m1057contextMenuOpenAdjustmentk4lQ0M(long j8) {
        TextLayoutResultProxy layoutResult;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null && (layoutResult = textFieldState.getLayoutResult()) != null) {
            int m934getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m934getOffsetForPosition3MmeM6k$default(layoutResult, j8, false, 2, null);
            if (!TextRange.m4660containsimpl(getValue$foundation_release().m4906getSelectiond9O1mEE(), m934getOffsetForPosition3MmeM6k$default)) {
                updateSelection(getValue$foundation_release(), m934getOffsetForPosition3MmeM6k$default, m934getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.Companion.getWord());
            }
        }
    }

    public final void copy$foundation_release(boolean z8) {
        if (TextRange.m4663getCollapsedimpl(getValue$foundation_release().m4906getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (!z8) {
            return;
        }
        int m4666getMaximpl = TextRange.m4666getMaximpl(getValue$foundation_release().m4906getSelectiond9O1mEE());
        this.onValueChange.invoke(m1054createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(m4666getMaximpl, m4666getMaximpl)));
        setHandleState(HandleState.None);
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo902onDownk4lQ0M(long j8) {
                TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m1056setCurrentDragPosition_kEHs6E(Offset.m2701boximpl(SelectionHandlesKt.m1006getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1061getHandlePositiontuRUvjQ$foundation_release(true))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo903onDragk4lQ0M(long j8) {
                long j9;
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                long j10;
                long j11;
                TextFieldValue m1054createTextFieldValueFDrldGo;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j9 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m2717plusMKHz9U(j9, j8);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j10 = textFieldSelectionManager2.dragBeginPosition;
                    j11 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m1056setCurrentDragPosition_kEHs6E(Offset.m2701boximpl(Offset.m2717plusMKHz9U(j10, j11)));
                    OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                    Offset m1059getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1059getCurrentDragPosition_m7T9E();
                    AbstractC3292y.f(m1059getCurrentDragPosition_m7T9E);
                    int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(value.m4641getOffsetForPositionk4lQ0M(m1059getCurrentDragPosition_m7T9E.m2722unboximpl()));
                    long TextRange = TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
                    if (TextRange.m4662equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().m4906getSelectiond9O1mEE())) {
                        return;
                    }
                    HapticFeedback hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo3539performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3548getTextHandleMove5zf0vsI());
                    }
                    Function1 onValueChange$foundation_release = textFieldSelectionManager2.getOnValueChange$foundation_release();
                    m1054createTextFieldValueFDrldGo = textFieldSelectionManager2.m1054createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), TextRange);
                    onValueChange$foundation_release.invoke(m1054createTextFieldValueFDrldGo);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo904onStartk4lQ0M(long j8) {
                long j9;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m1006getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1061getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j9 = textFieldSelectionManager2.dragBeginPosition;
                textFieldSelectionManager2.m1056setCurrentDragPosition_kEHs6E(Offset.m2701boximpl(j9));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m2728getZeroF1C5BW0();
                TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1056setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1056setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final void cut$foundation_release() {
        if (TextRange.m4663getCollapsedimpl(getValue$foundation_release().m4906getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m4667getMinimpl = TextRange.m4667getMinimpl(getValue$foundation_release().m4906getSelectiond9O1mEE());
        this.onValueChange.invoke(m1054createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m4667getMinimpl, m4667getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m1058deselect_kEHs6E$foundation_release(Offset offset) {
        HandleState handleState;
        TextLayoutResultProxy textLayoutResultProxy;
        int m4666getMaximpl;
        if (!TextRange.m4663getCollapsedimpl(getValue$foundation_release().m4906getSelectiond9O1mEE())) {
            TextFieldState textFieldState = this.state;
            if (textFieldState != null) {
                textLayoutResultProxy = textFieldState.getLayoutResult();
            } else {
                textLayoutResultProxy = null;
            }
            TextLayoutResultProxy textLayoutResultProxy2 = textLayoutResultProxy;
            if (offset != null && textLayoutResultProxy2 != null) {
                m4666getMaximpl = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m934getOffsetForPosition3MmeM6k$default(textLayoutResultProxy2, offset.m2722unboximpl(), false, 2, null));
            } else {
                m4666getMaximpl = TextRange.m4666getMaximpl(getValue$foundation_release().m4906getSelectiond9O1mEE());
            }
            this.onValueChange.invoke(TextFieldValue.m4901copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(m4666getMaximpl), (TextRange) null, 5, (Object) null));
        }
        if (offset != null && getValue$foundation_release().getText().length() > 0) {
            handleState = HandleState.Cursor;
        } else {
            handleState = HandleState.None;
        }
        setHandleState(handleState);
        hideSelectionToolbar$foundation_release();
    }

    public final void enterSelectionMode$foundation_release() {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null && !textFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        TextFieldState textFieldState2 = this.state;
        if (textFieldState2 != null) {
            textFieldState2.setShowFloatingToolbar(true);
        }
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(false);
        }
        setHandleState(HandleState.None);
    }

    public final ClipboardManager getClipboardManager$foundation_release() {
        return this.clipboardManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1059getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1060getCursorPositiontuRUvjQ$foundation_release(Density density) {
        TextLayoutResultProxy textLayoutResultProxy;
        AbstractC3292y.i(density, "density");
        int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m4669getStartimpl(getValue$foundation_release().m4906getSelectiond9O1mEE()));
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textLayoutResultProxy = textFieldState.getLayoutResult();
        } else {
            textLayoutResultProxy = null;
        }
        AbstractC3292y.f(textLayoutResultProxy);
        TextLayoutResult value = textLayoutResultProxy.getValue();
        Rect cursorRect = value.getCursorRect(m.k(originalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset(cursorRect.getLeft() + (density.mo425toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2), cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1061getHandlePositiontuRUvjQ$foundation_release(boolean z8) {
        int m4664getEndimpl;
        TextLayoutResultProxy textLayoutResultProxy;
        long m4906getSelectiond9O1mEE = getValue$foundation_release().m4906getSelectiond9O1mEE();
        if (z8) {
            m4664getEndimpl = TextRange.m4669getStartimpl(m4906getSelectiond9O1mEE);
        } else {
            m4664getEndimpl = TextRange.m4664getEndimpl(m4906getSelectiond9O1mEE);
        }
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textLayoutResultProxy = textFieldState.getLayoutResult();
        } else {
            textLayoutResultProxy = null;
        }
        AbstractC3292y.f(textLayoutResultProxy);
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResultProxy.getValue(), this.offsetMapping.originalToTransformed(m4664getEndimpl), z8, TextRange.m4668getReversedimpl(getValue$foundation_release().m4906getSelectiond9O1mEE()));
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    public final Function1 getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final TextFieldState getState$foundation_release() {
        return this.state;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value$delegate.getValue();
    }

    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.visualTransformation;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean z8) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo902onDownk4lQ0M(long j8) {
                Handle handle;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                if (z8) {
                    handle = Handle.SelectionStart;
                } else {
                    handle = Handle.SelectionEnd;
                }
                textFieldSelectionManager.setDraggingHandle(handle);
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                textFieldSelectionManager2.m1056setCurrentDragPosition_kEHs6E(Offset.m2701boximpl(SelectionHandlesKt.m1006getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager2.m1061getHandlePositiontuRUvjQ$foundation_release(z8))));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo903onDragk4lQ0M(long j8) {
                long j9;
                TextLayoutResultProxy layoutResult;
                TextLayoutResult value;
                long j10;
                long j11;
                int originalToTransformed;
                int m4641getOffsetForPositionk4lQ0M;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j9 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m2717plusMKHz9U(j9, j8);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    boolean z9 = z8;
                    j10 = textFieldSelectionManager2.dragBeginPosition;
                    j11 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m1056setCurrentDragPosition_kEHs6E(Offset.m2701boximpl(Offset.m2717plusMKHz9U(j10, j11)));
                    if (z9) {
                        Offset m1059getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1059getCurrentDragPosition_m7T9E();
                        AbstractC3292y.f(m1059getCurrentDragPosition_m7T9E);
                        originalToTransformed = value.m4641getOffsetForPositionk4lQ0M(m1059getCurrentDragPosition_m7T9E.m2722unboximpl());
                    } else {
                        originalToTransformed = textFieldSelectionManager2.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4669getStartimpl(textFieldSelectionManager2.getValue$foundation_release().m4906getSelectiond9O1mEE()));
                    }
                    int i8 = originalToTransformed;
                    if (z9) {
                        m4641getOffsetForPositionk4lQ0M = textFieldSelectionManager2.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4664getEndimpl(textFieldSelectionManager2.getValue$foundation_release().m4906getSelectiond9O1mEE()));
                    } else {
                        Offset m1059getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m1059getCurrentDragPosition_m7T9E();
                        AbstractC3292y.f(m1059getCurrentDragPosition_m7T9E2);
                        m4641getOffsetForPositionk4lQ0M = value.m4641getOffsetForPositionk4lQ0M(m1059getCurrentDragPosition_m7T9E2.m2722unboximpl());
                    }
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), i8, m4641getOffsetForPositionk4lQ0M, z9, SelectionAdjustment.Companion.getCharacter());
                }
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setShowFloatingToolbar(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo904onStartk4lQ0M(long j8) {
                long j9;
                Handle handle;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.dragBeginPosition = SelectionHandlesKt.m1006getAdjustedCoordinatesk4lQ0M(textFieldSelectionManager.m1061getHandlePositiontuRUvjQ$foundation_release(z8));
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j9 = textFieldSelectionManager2.dragBeginPosition;
                textFieldSelectionManager2.m1056setCurrentDragPosition_kEHs6E(Offset.m2701boximpl(j9));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m2728getZeroF1C5BW0();
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                if (z8) {
                    handle = Handle.SelectionStart;
                } else {
                    handle = Handle.SelectionEnd;
                }
                textFieldSelectionManager3.setDraggingHandle(handle);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowFloatingToolbar(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextToolbarStatus textToolbarStatus = null;
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1056setCurrentDragPosition_kEHs6E(null);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = TextFieldSelectionManager.this.getTextToolbar();
                if (textToolbar != null) {
                    textToolbarStatus = textToolbar.getStatus();
                }
                if (textToolbarStatus == TextToolbarStatus.Hidden) {
                    TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1056setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbarStatus textToolbarStatus;
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if (textToolbar2 != null) {
            textToolbarStatus = textToolbar2.getStatus();
        } else {
            textToolbarStatus = null;
        }
        if (textToolbarStatus == TextToolbarStatus.Shown && (textToolbar = this.textToolbar) != null) {
            textToolbar.hide();
        }
    }

    public final boolean isTextChanged$foundation_release() {
        return !AbstractC3292y.d(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null && (text = clipboardManager.getText()) != null) {
            AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
            int m4667getMinimpl = TextRange.m4667getMinimpl(getValue$foundation_release().m4906getSelectiond9O1mEE()) + text.length();
            this.onValueChange.invoke(m1054createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m4667getMinimpl, m4667getMinimpl)));
            setHandleState(HandleState.None);
            UndoManager undoManager = this.undoManager;
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue m1054createTextFieldValueFDrldGo = m1054createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(m1054createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m4901copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, m1054createTextFieldValueFDrldGo.m4906getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(true);
        }
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setEditable(boolean z8) {
        this.editable$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        AbstractC3292y.i(offsetMapping, "<set-?>");
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(Function1 function1) {
        AbstractC3292y.i(function1, "<set-?>");
        this.onValueChange = function1;
    }

    public final void setState$foundation_release(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        AbstractC3292y.i(textFieldValue, "<set-?>");
        this.value$delegate.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        AbstractC3292y.i(visualTransformation, "<set-?>");
        this.visualTransformation = visualTransformation;
    }

    public final void showSelectionToolbar$foundation_release() {
        TextFieldSelectionManager$showSelectionToolbar$copy$1 textFieldSelectionManager$showSelectionToolbar$copy$1;
        TextFieldSelectionManager$showSelectionToolbar$cut$1 textFieldSelectionManager$showSelectionToolbar$cut$1;
        TextFieldSelectionManager$showSelectionToolbar$paste$1 textFieldSelectionManager$showSelectionToolbar$paste$1;
        ClipboardManager clipboardManager;
        boolean z8 = this.visualTransformation instanceof PasswordVisualTransformation;
        TextFieldSelectionManager$showSelectionToolbar$selectAll$1 textFieldSelectionManager$showSelectionToolbar$selectAll$1 = null;
        if (!TextRange.m4663getCollapsedimpl(getValue$foundation_release().m4906getSelectiond9O1mEE()) && !z8) {
            textFieldSelectionManager$showSelectionToolbar$copy$1 = new TextFieldSelectionManager$showSelectionToolbar$copy$1(this);
        } else {
            textFieldSelectionManager$showSelectionToolbar$copy$1 = null;
        }
        if (!TextRange.m4663getCollapsedimpl(getValue$foundation_release().m4906getSelectiond9O1mEE()) && getEditable() && !z8) {
            textFieldSelectionManager$showSelectionToolbar$cut$1 = new TextFieldSelectionManager$showSelectionToolbar$cut$1(this);
        } else {
            textFieldSelectionManager$showSelectionToolbar$cut$1 = null;
        }
        if (getEditable() && (clipboardManager = this.clipboardManager) != null && clipboardManager.hasText()) {
            textFieldSelectionManager$showSelectionToolbar$paste$1 = new TextFieldSelectionManager$showSelectionToolbar$paste$1(this);
        } else {
            textFieldSelectionManager$showSelectionToolbar$paste$1 = null;
        }
        if (TextRange.m4665getLengthimpl(getValue$foundation_release().m4906getSelectiond9O1mEE()) != getValue$foundation_release().getText().length()) {
            textFieldSelectionManager$showSelectionToolbar$selectAll$1 = new TextFieldSelectionManager$showSelectionToolbar$selectAll$1(this);
        }
        TextFieldSelectionManager$showSelectionToolbar$selectAll$1 textFieldSelectionManager$showSelectionToolbar$selectAll$12 = textFieldSelectionManager$showSelectionToolbar$selectAll$1;
        TextToolbar textToolbar = this.textToolbar;
        if (textToolbar != null) {
            textToolbar.showMenu(getContentRect(), textFieldSelectionManager$showSelectionToolbar$copy$1, textFieldSelectionManager$showSelectionToolbar$paste$1, textFieldSelectionManager$showSelectionToolbar$cut$1, textFieldSelectionManager$showSelectionToolbar$selectAll$12);
        }
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = TextFieldSelectionManager$onValueChange$1.INSTANCE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (AbstractC3284p) null), null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.visualTransformation = VisualTransformation.Companion.getNone();
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.editable$delegate = mutableStateOf$default2;
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition = companion.m2728getZeroF1C5BW0();
        this.dragTotalDistance = companion.m2728getZeroF1C5BW0();
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = mutableStateOf$default4;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (AbstractC3284p) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo902onDownk4lQ0M(long j8) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo903onDragk4lQ0M(long j8) {
                long j9;
                TextLayoutResultProxy layoutResult;
                long j10;
                long j11;
                Integer num;
                long j12;
                int m936getOffsetForPosition3MmeM6k;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j9 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m2717plusMKHz9U(j9, j8);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j10 = textFieldSelectionManager2.dragBeginPosition;
                    j11 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m1056setCurrentDragPosition_kEHs6E(Offset.m2701boximpl(Offset.m2717plusMKHz9U(j10, j11)));
                    num = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num == null) {
                        j12 = textFieldSelectionManager2.dragBeginPosition;
                        m936getOffsetForPosition3MmeM6k = layoutResult.m936getOffsetForPosition3MmeM6k(j12, false);
                    } else {
                        m936getOffsetForPosition3MmeM6k = num.intValue();
                    }
                    int i8 = m936getOffsetForPosition3MmeM6k;
                    Offset m1059getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1059getCurrentDragPosition_m7T9E();
                    AbstractC3292y.f(m1059getCurrentDragPosition_m7T9E);
                    textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), i8, layoutResult.m936getOffsetForPosition3MmeM6k(m1059getCurrentDragPosition_m7T9E.m2722unboximpl(), false), false, SelectionAdjustment.Companion.getWord());
                }
                TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setShowFloatingToolbar(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo904onStartk4lQ0M(long j8) {
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult;
                TextFieldValue m1054createTextFieldValueFDrldGo;
                long j9;
                TextLayoutResultProxy layoutResult2;
                TextLayoutResultProxy layoutResult3;
                if (TextFieldSelectionManager.this.getDraggingHandle() == null) {
                    TextFieldSelectionManager.this.setDraggingHandle(Handle.SelectionEnd);
                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                    if ((state$foundation_release2 == null || (layoutResult3 = state$foundation_release2.getLayoutResult()) == null || !layoutResult3.m937isPositionOnTextk4lQ0M(j8)) && (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                        TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                        int transformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.getLineEnd$default(layoutResult, layoutResult.getLineForVerticalPosition(Offset.m2713getYimpl(j8)), false, 2, null));
                        HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                        if (hapticFeedBack != null) {
                            hapticFeedBack.mo3539performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3548getTextHandleMove5zf0vsI());
                        }
                        m1054createTextFieldValueFDrldGo = textFieldSelectionManager.m1054createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                        textFieldSelectionManager.enterSelectionMode$foundation_release();
                        textFieldSelectionManager.getOnValueChange$foundation_release().invoke(m1054createTextFieldValueFDrldGo);
                        return;
                    }
                    if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                        return;
                    }
                    TextFieldSelectionManager.this.enterSelectionMode$foundation_release();
                    TextFieldState state$foundation_release3 = TextFieldSelectionManager.this.getState$foundation_release();
                    if (state$foundation_release3 != null && (layoutResult2 = state$foundation_release3.getLayoutResult()) != null) {
                        TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                        int m934getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m934getOffsetForPosition3MmeM6k$default(layoutResult2, j8, false, 2, null);
                        textFieldSelectionManager2.updateSelection(textFieldSelectionManager2.getValue$foundation_release(), m934getOffsetForPosition3MmeM6k$default, m934getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.Companion.getWord());
                        textFieldSelectionManager2.dragBeginOffsetInText = Integer.valueOf(m934getOffsetForPosition3MmeM6k$default);
                    }
                    TextFieldSelectionManager.this.dragBeginPosition = j8;
                    TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                    j9 = textFieldSelectionManager3.dragBeginPosition;
                    textFieldSelectionManager3.m1056setCurrentDragPosition_kEHs6E(Offset.m2701boximpl(j9));
                    TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m2728getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextToolbarStatus textToolbarStatus;
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1056setCurrentDragPosition_kEHs6E(null);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowFloatingToolbar(true);
                }
                TextToolbar textToolbar = TextFieldSelectionManager.this.getTextToolbar();
                if (textToolbar != null) {
                    textToolbarStatus = textToolbar.getStatus();
                } else {
                    textToolbarStatus = null;
                }
                if (textToolbarStatus == TextToolbarStatus.Hidden) {
                    TextFieldSelectionManager.this.showSelectionToolbar$foundation_release();
                }
                TextFieldSelectionManager.this.dragBeginOffsetInText = null;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo975onDrag3MmeM6k(long j8, SelectionAdjustment adjustment) {
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult;
                Integer num;
                AbstractC3292y.i(adjustment, "adjustment");
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                int m936getOffsetForPosition3MmeM6k = layoutResult.m936getOffsetForPosition3MmeM6k(j8, false);
                TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
                num = textFieldSelectionManager.dragBeginOffsetInText;
                AbstractC3292y.f(num);
                textFieldSelectionManager.updateSelection(value$foundation_release, num.intValue(), m936getOffsetForPosition3MmeM6k, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo976onExtendk4lQ0M(long j8) {
                TextLayoutResultProxy layoutResult;
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                    textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4669getStartimpl(textFieldSelectionManager.getValue$foundation_release().m4906getSelectiond9O1mEE())), TextLayoutResultProxy.m934getOffsetForPosition3MmeM6k$default(layoutResult, j8, false, 2, null), false, SelectionAdjustment.Companion.getNone());
                    return true;
                }
                return false;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo977onExtendDragk4lQ0M(long j8) {
                TextFieldState state$foundation_release;
                TextLayoutResultProxy layoutResult;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m4669getStartimpl(textFieldSelectionManager.getValue$foundation_release().m4906getSelectiond9O1mEE())), layoutResult.m936getOffsetForPosition3MmeM6k(j8, false), false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo978onStart3MmeM6k(long j8, SelectionAdjustment adjustment) {
                TextLayoutResultProxy layoutResult;
                long j9;
                AbstractC3292y.i(adjustment, "adjustment");
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                TextFieldSelectionManager.this.dragBeginPosition = j8;
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                    textFieldSelectionManager.dragBeginOffsetInText = Integer.valueOf(TextLayoutResultProxy.m934getOffsetForPosition3MmeM6k$default(layoutResult, j8, false, 2, null));
                    j9 = textFieldSelectionManager.dragBeginPosition;
                    int m934getOffsetForPosition3MmeM6k$default = TextLayoutResultProxy.m934getOffsetForPosition3MmeM6k$default(layoutResult, j9, false, 2, null);
                    textFieldSelectionManager.updateSelection(textFieldSelectionManager.getValue$foundation_release(), m934getOffsetForPosition3MmeM6k$default, m934getOffsetForPosition3MmeM6k$default, false, adjustment);
                    return true;
                }
                return false;
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : undoManager);
    }
}
