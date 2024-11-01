package androidx.compose.foundation.text.selection;

import R5.AbstractC1435t;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    private final TextFieldValue currentValue;
    private final TextLayoutResultProxy layoutResultProxy;

    public /* synthetic */ TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState, int i8, AbstractC3284p abstractC3284p) {
        this(textFieldValue, (i8 & 2) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, textLayoutResultProxy, (i8 & 8) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:            if (r2 == null) goto L8;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy r6, int r7) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r6.getInnerTextFieldCoordinates()
            if (r0 == 0) goto L15
            androidx.compose.ui.layout.LayoutCoordinates r1 = r6.getDecorationBoxCoordinates()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.c.c(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1b:
            androidx.compose.ui.text.input.OffsetMapping r0 = r5.getOffsetMapping()
            androidx.compose.ui.text.input.TextFieldValue r1 = r5.currentValue
            long r3 = r1.m4906getSelectiond9O1mEE()
            int r1 = androidx.compose.ui.text.TextRange.m4664getEndimpl(r3)
            int r0 = r0.originalToTransformed(r1)
            androidx.compose.ui.text.TextLayoutResult r1 = r6.getValue()
            androidx.compose.ui.geometry.Rect r0 = r1.getCursorRect(r0)
            float r1 = r0.getLeft()
            float r0 = r0.getTop()
            long r2 = r2.m2745getSizeNHjbRc()
            float r2 = androidx.compose.ui.geometry.Size.m2778getHeightimpl(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            androidx.compose.ui.text.input.OffsetMapping r7 = r5.getOffsetMapping()
            androidx.compose.ui.text.TextLayoutResult r6 = r6.getValue()
            long r0 = androidx.compose.ui.geometry.OffsetKt.Offset(r1, r0)
            int r6 = r6.m4641getOffsetForPositionk4lQ0M(r0)
            int r6 = r7.transformedToOriginal(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldPreparedSelection.jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy, int):int");
    }

    public final List<EditCommand> deleteIfSelectedOr(Function1 or) {
        AbstractC3292y.i(or, "or");
        if (TextRange.m4663getCollapsedimpl(m985getSelectiond9O1mEE())) {
            EditCommand editCommand = (EditCommand) or.invoke(this);
            if (editCommand != null) {
                return AbstractC1435t.e(editCommand);
            }
            return null;
        }
        return AbstractC1435t.p(new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m4667getMinimpl(m985getSelectiond9O1mEE()), TextRange.m4667getMinimpl(m985getSelectiond9O1mEE())));
    }

    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    public final TextFieldValue getValue() {
        return TextFieldValue.m4901copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m985getSelectiond9O1mEE(), (TextRange) null, 4, (Object) null);
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        AbstractC3292y.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldPreparedSelection(TextFieldValue currentValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState state) {
        super(currentValue.getAnnotatedString(), currentValue.m4906getSelectiond9O1mEE(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, state, null);
        AbstractC3292y.i(currentValue, "currentValue");
        AbstractC3292y.i(offsetMapping, "offsetMapping");
        AbstractC3292y.i(state, "state");
        this.currentValue = currentValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }
}
