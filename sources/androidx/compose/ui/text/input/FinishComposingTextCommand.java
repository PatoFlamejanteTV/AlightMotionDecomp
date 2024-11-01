package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.U;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FinishComposingTextCommand implements EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        editingBuffer.commitComposition$ui_text_release();
    }

    public boolean equals(Object obj) {
        return obj instanceof FinishComposingTextCommand;
    }

    public int hashCode() {
        return U.b(FinishComposingTextCommand.class).hashCode();
    }

    public String toString() {
        return "FinishComposingTextCommand()";
    }
}
