package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private Rect innerTextFieldBounds;
    private final InputMethodManager inputMethodManager;
    private boolean monitorEnabled;
    private OffsetMapping offsetMapping;
    private final PositionCalculator rootPositionCalculator;
    private TextFieldValue textFieldValue;
    private TextLayoutResult textLayoutResult;
    private Function1 textFieldToRootTransform = CursorAnchorInfoController$textFieldToRootTransform$1.INSTANCE;
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m3159constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(PositionCalculator positionCalculator, InputMethodManager inputMethodManager) {
        this.rootPositionCalculator = positionCalculator;
        this.inputMethodManager = inputMethodManager;
    }

    private final void updateCursorAnchorInfo() {
        if (!this.inputMethodManager.isActive()) {
            return;
        }
        this.textFieldToRootTransform.invoke(Matrix.m3157boximpl(this.matrix));
        this.rootPositionCalculator.mo4063localToScreen58bKbWc(this.matrix);
        AndroidMatrixConversions_androidKt.m2824setFromEL8BTi8(this.androidMatrix, this.matrix);
        InputMethodManager inputMethodManager = this.inputMethodManager;
        CursorAnchorInfo.Builder builder = this.builder;
        TextFieldValue textFieldValue = this.textFieldValue;
        AbstractC3292y.f(textFieldValue);
        OffsetMapping offsetMapping = this.offsetMapping;
        AbstractC3292y.f(offsetMapping);
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        AbstractC3292y.f(textLayoutResult);
        android.graphics.Matrix matrix = this.androidMatrix;
        Rect rect = this.innerTextFieldBounds;
        AbstractC3292y.f(rect);
        Rect rect2 = this.decorationBoxBounds;
        AbstractC3292y.f(rect2);
        inputMethodManager.updateCursorAnchorInfo(CursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
        this.hasPendingImmediateRequest = false;
    }

    public final void invalidate() {
        this.textFieldValue = null;
        this.offsetMapping = null;
        this.textLayoutResult = null;
        this.textFieldToRootTransform = CursorAnchorInfoController$invalidate$1.INSTANCE;
        this.innerTextFieldBounds = null;
        this.decorationBoxBounds = null;
    }

    public final void requestUpdate(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.includeInsertionMarker = z10;
        this.includeCharacterBounds = z11;
        this.includeEditorBounds = z12;
        this.includeLineBounds = z13;
        if (z8) {
            this.hasPendingImmediateRequest = true;
            if (this.textFieldValue != null) {
                updateCursorAnchorInfo();
            }
        }
        this.monitorEnabled = z9;
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Function1 function1, Rect rect, Rect rect2) {
        this.textFieldValue = textFieldValue;
        this.offsetMapping = offsetMapping;
        this.textLayoutResult = textLayoutResult;
        this.textFieldToRootTransform = function1;
        this.innerTextFieldBounds = rect;
        this.decorationBoxBounds = rect2;
        if (this.hasPendingImmediateRequest || this.monitorEnabled) {
            updateCursorAnchorInfo();
        }
    }
}
