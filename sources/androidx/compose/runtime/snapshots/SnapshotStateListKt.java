package androidx.compose.runtime.snapshots;

/* loaded from: classes.dex */
public final class SnapshotStateListKt {
    private static final Object sync = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void invalidIteratorSet() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateRange(int i8, int i9) {
        if (i8 >= 0 && i8 < i9) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i8 + ") is out of bound of [0, " + i9 + ')');
    }
}
