package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class CommitTextCommand implements EditCommand {
    public static final int $stable = 0;
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public CommitTextCommand(AnnotatedString annotatedString, int i8) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i8;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int length;
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.replace$ui_text_release(editingBuffer.getCompositionStart$ui_text_release(), editingBuffer.getCompositionEnd$ui_text_release(), getText());
        } else {
            editingBuffer.replace$ui_text_release(editingBuffer.getSelectionStart$ui_text_release(), editingBuffer.getSelectionEnd$ui_text_release(), getText());
        }
        int cursor$ui_text_release = editingBuffer.getCursor$ui_text_release();
        int i8 = this.newCursorPosition;
        if (i8 > 0) {
            length = (cursor$ui_text_release + i8) - 1;
        } else {
            length = (cursor$ui_text_release + i8) - getText().length();
        }
        editingBuffer.setCursor$ui_text_release(i6.m.k(length, 0, editingBuffer.getLength$ui_text_release()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        if (AbstractC3292y.d(getText(), commitTextCommand.getText()) && this.newCursorPosition == commitTextCommand.newCursorPosition) {
            return true;
        }
        return false;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "CommitTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    public CommitTextCommand(String str, int i8) {
        this(new AnnotatedString(str, null, null, 6, null), i8);
    }
}
