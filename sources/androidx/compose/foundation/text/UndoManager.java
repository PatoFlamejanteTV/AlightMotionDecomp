package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class UndoManager {
    private boolean forceNextSnapshot;
    private Long lastSnapshot;
    private final int maxStoredCharacters;
    private Entry redoStack;
    private int storedCharacters;
    private Entry undoStack;

    public UndoManager() {
        this(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:7:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[EDGE_INSN: B:13:0x0023->B:14:0x0023 BREAK  A[LOOP:0: B:7:0x000e->B:12:0x001e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void removeLastUndo() {
        /*
            r3 = this;
            androidx.compose.foundation.text.UndoManager$Entry r0 = r3.undoStack
            r1 = 0
            if (r0 == 0) goto La
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.getNext()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 == 0) goto L1b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r0.getNext()
            if (r2 == 0) goto L1b
            androidx.compose.foundation.text.UndoManager$Entry r2 = r2.getNext()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            androidx.compose.foundation.text.UndoManager$Entry r0 = r0.getNext()
            goto Le
        L23:
            if (r0 != 0) goto L26
            goto L29
        L26:
            r0.setNext(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.UndoManager.removeLastUndo():void");
    }

    public static /* synthetic */ void snapshotIfNeeded$default(UndoManager undoManager, TextFieldValue textFieldValue, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = UndoManager_jvmKt.timeNowMillis();
        }
        undoManager.snapshotIfNeeded(textFieldValue, j8);
    }

    public final void forceNextSnapshot() {
        this.forceNextSnapshot = true;
    }

    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public final void makeSnapshot(TextFieldValue value) {
        TextFieldValue textFieldValue;
        String str;
        TextFieldValue value2;
        AbstractC3292y.i(value, "value");
        this.forceNextSnapshot = false;
        Entry entry = this.undoStack;
        if (entry != null) {
            textFieldValue = entry.getValue();
        } else {
            textFieldValue = null;
        }
        if (AbstractC3292y.d(value, textFieldValue)) {
            return;
        }
        String text = value.getText();
        Entry entry2 = this.undoStack;
        if (entry2 != null && (value2 = entry2.getValue()) != null) {
            str = value2.getText();
        } else {
            str = null;
        }
        if (AbstractC3292y.d(text, str)) {
            Entry entry3 = this.undoStack;
            if (entry3 != null) {
                entry3.setValue(value);
                return;
            }
            return;
        }
        this.undoStack = new Entry(this.undoStack, value);
        this.redoStack = null;
        int length = this.storedCharacters + value.getText().length();
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            removeLastUndo();
        }
    }

    public final TextFieldValue redo() {
        Entry entry = this.redoStack;
        if (entry != null) {
            this.redoStack = entry.getNext();
            this.undoStack = new Entry(this.undoStack, entry.getValue());
            this.storedCharacters += entry.getValue().getText().length();
            return entry.getValue();
        }
        return null;
    }

    public final void snapshotIfNeeded(TextFieldValue value, long j8) {
        long j9;
        AbstractC3292y.i(value, "value");
        if (!this.forceNextSnapshot) {
            Long l8 = this.lastSnapshot;
            if (l8 != null) {
                j9 = l8.longValue();
            } else {
                j9 = 0;
            }
            if (j8 <= j9 + UndoManagerKt.getSNAPSHOTS_INTERVAL_MILLIS()) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(j8);
        makeSnapshot(value);
    }

    public final TextFieldValue undo() {
        Entry next;
        Entry entry = this.undoStack;
        if (entry == null || (next = entry.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= entry.getValue().getText().length();
        this.redoStack = new Entry(this.redoStack, entry.getValue());
        return next.getValue();
    }

    public UndoManager(int i8) {
        this.maxStoredCharacters = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Entry {
        private Entry next;
        private TextFieldValue value;

        public Entry(Entry entry, TextFieldValue value) {
            AbstractC3292y.i(value, "value");
            this.next = entry;
            this.value = value;
        }

        public final Entry getNext() {
            return this.next;
        }

        public final TextFieldValue getValue() {
            return this.value;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final void setValue(TextFieldValue textFieldValue) {
            AbstractC3292y.i(textFieldValue, "<set-?>");
            this.value = textFieldValue;
        }

        public /* synthetic */ Entry(Entry entry, TextFieldValue textFieldValue, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : entry, textFieldValue);
        }
    }

    public /* synthetic */ UndoManager(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 100000 : i8);
    }
}
