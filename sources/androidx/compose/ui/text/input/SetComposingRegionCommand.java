package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SetComposingRegionCommand implements EditCommand {
    public static final int $stable = 0;
    private final int end;
    private final int start;

    public SetComposingRegionCommand(int i8, int i9) {
        this.start = i8;
        this.end = i9;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        if (editingBuffer.hasComposition$ui_text_release()) {
            editingBuffer.commitComposition$ui_text_release();
        }
        int k8 = i6.m.k(this.start, 0, editingBuffer.getLength$ui_text_release());
        int k9 = i6.m.k(this.end, 0, editingBuffer.getLength$ui_text_release());
        if (k8 != k9) {
            if (k8 < k9) {
                editingBuffer.setComposition$ui_text_release(k8, k9);
            } else {
                editingBuffer.setComposition$ui_text_release(k9, k8);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingRegionCommand)) {
            return false;
        }
        SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
        if (this.start == setComposingRegionCommand.start && this.end == setComposingRegionCommand.end) {
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
        return "SetComposingRegionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}
