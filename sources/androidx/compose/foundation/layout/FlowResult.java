package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class FlowResult {
    private final int crossAxisTotalSize;
    private final MutableVector<RowColumnMeasureHelperResult> items;
    private final int mainAxisTotalSize;

    public FlowResult(int i8, int i9, MutableVector<RowColumnMeasureHelperResult> items) {
        AbstractC3292y.i(items, "items");
        this.mainAxisTotalSize = i8;
        this.crossAxisTotalSize = i9;
        this.items = items;
    }

    public final int getCrossAxisTotalSize() {
        return this.crossAxisTotalSize;
    }

    public final MutableVector<RowColumnMeasureHelperResult> getItems() {
        return this.items;
    }

    public final int getMainAxisTotalSize() {
        return this.mainAxisTotalSize;
    }
}
