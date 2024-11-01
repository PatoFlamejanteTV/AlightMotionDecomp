package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i8, int i9) {
        this.lengthBeforeCursor = i8;
        this.lengthAfterCursor = i9;
        if (i8 >= 0 && i9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i8 + " and " + i9 + " respectively.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[LOOP:0: B:2:0x0005->B:10:0x0033, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[EDGE_INSN: B:11:0x0036->B:12:0x0036 BREAK  A[LOOP:0: B:2:0x0005->B:10:0x0033], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[LOOP:1: B:13:0x0039->B:21:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[EDGE_INSN: B:22:0x0074->B:23:0x0074 BREAK  A[LOOP:1: B:13:0x0039->B:21:0x0071], SYNTHETIC] */
    @Override // androidx.compose.ui.text.input.EditCommand
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void applyTo(androidx.compose.ui.text.input.EditingBuffer r8) {
        /*
            r7 = this;
            int r0 = r7.lengthBeforeCursor
            r1 = 0
            r2 = 0
            r3 = 0
        L5:
            if (r2 >= r0) goto L36
            int r4 = r3 + 1
            int r5 = r8.getSelectionStart$ui_text_release()
            if (r5 <= r4) goto L2c
            int r5 = r8.getSelectionStart$ui_text_release()
            int r5 = r5 - r4
            int r5 = r5 + (-1)
            char r5 = r8.get$ui_text_release(r5)
            int r6 = r8.getSelectionStart$ui_text_release()
            int r6 = r6 - r4
            char r6 = r8.get$ui_text_release(r6)
            boolean r5 = androidx.compose.ui.text.input.EditCommandKt.access$isSurrogatePair(r5, r6)
            if (r5 == 0) goto L2c
            int r3 = r3 + 2
            goto L2d
        L2c:
            r3 = r4
        L2d:
            int r4 = r8.getSelectionStart$ui_text_release()
            if (r3 == r4) goto L36
            int r2 = r2 + 1
            goto L5
        L36:
            int r0 = r7.lengthAfterCursor
            r2 = 0
        L39:
            if (r1 >= r0) goto L74
            int r4 = r2 + 1
            int r5 = r8.getSelectionEnd$ui_text_release()
            int r5 = r5 + r4
            int r6 = r8.getLength$ui_text_release()
            if (r5 >= r6) goto L65
            int r5 = r8.getSelectionEnd$ui_text_release()
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            char r5 = r8.get$ui_text_release(r5)
            int r6 = r8.getSelectionEnd$ui_text_release()
            int r6 = r6 + r4
            char r6 = r8.get$ui_text_release(r6)
            boolean r5 = androidx.compose.ui.text.input.EditCommandKt.access$isSurrogatePair(r5, r6)
            if (r5 == 0) goto L65
            int r2 = r2 + 2
            goto L66
        L65:
            r2 = r4
        L66:
            int r4 = r8.getSelectionEnd$ui_text_release()
            int r4 = r4 + r2
            int r5 = r8.getLength$ui_text_release()
            if (r4 == r5) goto L74
            int r1 = r1 + 1
            goto L39
        L74:
            int r0 = r8.getSelectionEnd$ui_text_release()
            int r1 = r8.getSelectionEnd$ui_text_release()
            int r1 = r1 + r2
            r8.delete$ui_text_release(r0, r1)
            int r0 = r8.getSelectionStart$ui_text_release()
            int r0 = r0 - r3
            int r1 = r8.getSelectionStart$ui_text_release()
            r8.delete$ui_text_release(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand.applyTo(androidx.compose.ui.text.input.EditingBuffer):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        if (this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor) {
            return true;
        }
        return false;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
