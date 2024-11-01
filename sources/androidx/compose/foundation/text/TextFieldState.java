package androidx.compose.foundation.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldState {
    private final MutableState handleState$delegate;
    private final MutableState hasFocus$delegate;
    private TextInputSession inputSession;
    private boolean isLayoutResultStale;
    private final KeyboardActionRunner keyboardActionRunner;
    private LayoutCoordinates layoutCoordinates;
    private final MutableState<TextLayoutResultProxy> layoutResultState;
    private final MutableState minHeightForSingleLineField$delegate;
    private final Function1 onImeActionPerformed;
    private final Function1 onValueChange;
    private Function1 onValueChangeOriginal;
    private final EditProcessor processor;
    private final RecomposeScope recomposeScope;
    private final Paint selectionPaint;
    private final MutableState showCursorHandle$delegate;
    private boolean showFloatingToolbar;
    private final MutableState showSelectionHandleEnd$delegate;
    private final MutableState showSelectionHandleStart$delegate;
    private TextDelegate textDelegate;
    private AnnotatedString untransformedText;

    public TextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<TextLayoutResultProxy> mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        AbstractC3292y.i(textDelegate, "textDelegate");
        AbstractC3292y.i(recomposeScope, "recomposeScope");
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.processor = new EditProcessor();
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5153boximpl(Dp.m5155constructorimpl(0)), null, 2, null);
        this.minHeightForSingleLineField$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.layoutResultState = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.handleState$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleStart$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd$delegate = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle$delegate = mutableStateOf$default7;
        this.isLayoutResultStale = true;
        this.keyboardActionRunner = new KeyboardActionRunner();
        this.onValueChangeOriginal = TextFieldState$onValueChangeOriginal$1.INSTANCE;
        this.onValueChange = new TextFieldState$onValueChange$1(this);
        this.onImeActionPerformed = new TextFieldState$onImeActionPerformed$1(this);
        this.selectionPaint = AndroidPaint_androidKt.Paint();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m928getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m5169unboximpl();
    }

    public final Function1 getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final Function1 getOnValueChange() {
        return this.onValueChange;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    public final boolean getShowFloatingToolbar() {
        return this.showFloatingToolbar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void setHandleState(HandleState handleState) {
        AbstractC3292y.i(handleState, "<set-?>");
        this.handleState$delegate.setValue(handleState);
    }

    public final void setHasFocus(boolean z8) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m929setMinHeightForSingleLineField0680j_4(float f8) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m5153boximpl(f8));
    }

    public final void setShowCursorHandle(boolean z8) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void setShowFloatingToolbar(boolean z8) {
        this.showFloatingToolbar = z8;
    }

    public final void setShowSelectionHandleEnd(boolean z8) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void setShowSelectionHandleStart(boolean z8) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z8));
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        AbstractC3292y.i(textDelegate, "<set-?>");
        this.textDelegate = textDelegate;
    }

    public final void setUntransformedText(AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m930updatefnh65Uc(AnnotatedString untransformedText, AnnotatedString visualText, TextStyle textStyle, boolean z8, Density density, FontFamily.Resolver fontFamilyResolver, Function1 onValueChange, KeyboardActions keyboardActions, FocusManager focusManager, long j8) {
        AbstractC3292y.i(untransformedText, "untransformedText");
        AbstractC3292y.i(visualText, "visualText");
        AbstractC3292y.i(textStyle, "textStyle");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        AbstractC3292y.i(onValueChange, "onValueChange");
        AbstractC3292y.i(keyboardActions, "keyboardActions");
        AbstractC3292y.i(focusManager, "focusManager");
        this.onValueChangeOriginal = onValueChange;
        this.selectionPaint.mo2833setColor8_81llA(j8);
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        keyboardActionRunner.setInputSession(this.inputSession);
        this.untransformedText = untransformedText;
        TextDelegate m901updateTextDelegaterm0N8CA$default = TextDelegateKt.m901updateTextDelegaterm0N8CA$default(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, z8, 0, 0, 0, AbstractC1435t.m(), 448, null);
        if (this.textDelegate != m901updateTextDelegaterm0N8CA$default) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = m901updateTextDelegaterm0N8CA$default;
    }
}
