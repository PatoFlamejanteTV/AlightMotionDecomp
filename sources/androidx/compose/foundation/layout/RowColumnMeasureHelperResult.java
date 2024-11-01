package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class RowColumnMeasureHelperResult {
    private final int beforeCrossAxisAlignmentLine;
    private final int crossAxisSize;
    private final int endIndex;
    private final int[] mainAxisPositions;
    private final int mainAxisSize;
    private final int startIndex;

    public RowColumnMeasureHelperResult(int i8, int i9, int i10, int i11, int i12, int[] mainAxisPositions) {
        AbstractC3292y.i(mainAxisPositions, "mainAxisPositions");
        this.crossAxisSize = i8;
        this.mainAxisSize = i9;
        this.startIndex = i10;
        this.endIndex = i11;
        this.beforeCrossAxisAlignmentLine = i12;
        this.mainAxisPositions = mainAxisPositions;
    }

    public final int getBeforeCrossAxisAlignmentLine() {
        return this.beforeCrossAxisAlignmentLine;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int[] getMainAxisPositions() {
        return this.mainAxisPositions;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }
}
