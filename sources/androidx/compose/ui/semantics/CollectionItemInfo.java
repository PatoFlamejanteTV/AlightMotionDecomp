package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class CollectionItemInfo {
    public static final int $stable = 0;
    private final int columnIndex;
    private final int columnSpan;
    private final int rowIndex;
    private final int rowSpan;

    public CollectionItemInfo(int i8, int i9, int i10, int i11) {
        this.rowIndex = i8;
        this.rowSpan = i9;
        this.columnIndex = i10;
        this.columnSpan = i11;
    }

    public final int getColumnIndex() {
        return this.columnIndex;
    }

    public final int getColumnSpan() {
        return this.columnSpan;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public final int getRowSpan() {
        return this.rowSpan;
    }
}
