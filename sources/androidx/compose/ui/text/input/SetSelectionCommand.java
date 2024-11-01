package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SetSelectionCommand implements EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public SetSelectionCommand(int i8, int i9) {
        this.start = i8;
        this.end = i9;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        int k8 = i6.m.k(this.start, 0, editingBuffer.getLength$ui_text_release());
        int k9 = i6.m.k(this.end, 0, editingBuffer.getLength$ui_text_release());
        if (k8 < k9) {
            editingBuffer.setSelection$ui_text_release(k8, k9);
        } else {
            editingBuffer.setSelection$ui_text_release(k9, k8);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        if (this.start == setSelectionCommand.start && this.end == setSelectionCommand.end) {
            return true;
        }
        return false;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}
