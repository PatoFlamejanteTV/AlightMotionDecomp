package androidx.leanback.widget;

import androidx.annotation.NonNull;
import androidx.collection.CircularIntArray;
import androidx.leanback.widget.Grid;
import androidx.recyclerview.widget.RecyclerView;
import java.io.PrintWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class SingleRow extends Grid {
    private final Grid.Location mTmpLocation = new Grid.Location(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleRow() {
        setNumRows(1);
    }

    @Override // androidx.leanback.widget.Grid
    protected final boolean appendVisibleItems(int i8, boolean z8) {
        int i9;
        if (this.mProvider.getCount() == 0) {
            return false;
        }
        if (!z8 && checkAppendOverLimit(i8)) {
            return false;
        }
        int startIndexForAppend = getStartIndexForAppend();
        boolean z9 = false;
        while (startIndexForAppend < this.mProvider.getCount()) {
            int createItem = this.mProvider.createItem(startIndexForAppend, true, this.mTmpItem, false);
            if (this.mFirstVisibleIndex >= 0 && this.mLastVisibleIndex >= 0) {
                if (this.mReversedFlow) {
                    int i10 = startIndexForAppend - 1;
                    i9 = (this.mProvider.getEdge(i10) - this.mProvider.getSize(i10)) - this.mSpacing;
                } else {
                    int i11 = startIndexForAppend - 1;
                    i9 = this.mProvider.getEdge(i11) + this.mProvider.getSize(i11) + this.mSpacing;
                }
                this.mLastVisibleIndex = startIndexForAppend;
            } else {
                if (this.mReversedFlow) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = Integer.MIN_VALUE;
                }
                this.mFirstVisibleIndex = startIndexForAppend;
                this.mLastVisibleIndex = startIndexForAppend;
            }
            this.mProvider.addItem(this.mTmpItem[0], startIndexForAppend, createItem, 0, i9);
            if (!z8 && !checkAppendOverLimit(i8)) {
                startIndexForAppend++;
                z9 = true;
            } else {
                return true;
            }
        }
        return z9;
    }

    @Override // androidx.leanback.widget.Grid
    public void collectAdjacentPrefetchPositions(int i8, int i9, @NonNull RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int startIndexForPrepend;
        int i10;
        int i11;
        if (!this.mReversedFlow ? i9 < 0 : i9 > 0) {
            if (getFirstVisibleIndex() == 0) {
                return;
            }
            startIndexForPrepend = getStartIndexForPrepend();
            int edge = this.mProvider.getEdge(this.mFirstVisibleIndex);
            if (this.mReversedFlow) {
                i10 = this.mSpacing;
            } else {
                i10 = -this.mSpacing;
            }
            i11 = edge + i10;
        } else {
            if (getLastVisibleIndex() == this.mProvider.getCount() - 1) {
                return;
            }
            startIndexForPrepend = getStartIndexForAppend();
            int size = this.mProvider.getSize(this.mLastVisibleIndex) + this.mSpacing;
            int edge2 = this.mProvider.getEdge(this.mLastVisibleIndex);
            if (this.mReversedFlow) {
                size = -size;
            }
            i11 = size + edge2;
        }
        layoutPrefetchRegistry.addPosition(startIndexForPrepend, Math.abs(i11 - i8));
    }

    @Override // androidx.leanback.widget.Grid
    public final void debugPrint(PrintWriter printWriter) {
        printWriter.print("SingleRow<");
        printWriter.print(this.mFirstVisibleIndex);
        printWriter.print(",");
        printWriter.print(this.mLastVisibleIndex);
        printWriter.print(">");
        printWriter.println();
    }

    @Override // androidx.leanback.widget.Grid
    protected final int findRowMax(boolean z8, int i8, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i8;
        }
        if (this.mReversedFlow) {
            return this.mProvider.getEdge(i8);
        }
        return this.mProvider.getEdge(i8) + this.mProvider.getSize(i8);
    }

    @Override // androidx.leanback.widget.Grid
    protected final int findRowMin(boolean z8, int i8, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i8;
        }
        if (this.mReversedFlow) {
            return this.mProvider.getEdge(i8) - this.mProvider.getSize(i8);
        }
        return this.mProvider.getEdge(i8);
    }

    @Override // androidx.leanback.widget.Grid
    public final CircularIntArray[] getItemPositionsInRows(int i8, int i9) {
        this.mTmpItemPositionsInRows[0].clear();
        this.mTmpItemPositionsInRows[0].addLast(i8);
        this.mTmpItemPositionsInRows[0].addLast(i9);
        return this.mTmpItemPositionsInRows;
    }

    @Override // androidx.leanback.widget.Grid
    public final Grid.Location getLocation(int i8) {
        return this.mTmpLocation;
    }

    int getStartIndexForAppend() {
        int i8 = this.mLastVisibleIndex;
        if (i8 >= 0) {
            return i8 + 1;
        }
        int i9 = this.mStartIndex;
        if (i9 != -1) {
            return Math.min(i9, this.mProvider.getCount() - 1);
        }
        return 0;
    }

    int getStartIndexForPrepend() {
        int i8 = this.mFirstVisibleIndex;
        if (i8 >= 0) {
            return i8 - 1;
        }
        int i9 = this.mStartIndex;
        if (i9 != -1) {
            return Math.min(i9, this.mProvider.getCount() - 1);
        }
        return this.mProvider.getCount() - 1;
    }

    @Override // androidx.leanback.widget.Grid
    protected final boolean prependVisibleItems(int i8, boolean z8) {
        int i9;
        if (this.mProvider.getCount() == 0) {
            return false;
        }
        if (!z8 && checkPrependOverLimit(i8)) {
            return false;
        }
        int minIndex = this.mProvider.getMinIndex();
        boolean z9 = false;
        for (int startIndexForPrepend = getStartIndexForPrepend(); startIndexForPrepend >= minIndex; startIndexForPrepend--) {
            int createItem = this.mProvider.createItem(startIndexForPrepend, false, this.mTmpItem, false);
            if (this.mFirstVisibleIndex >= 0 && this.mLastVisibleIndex >= 0) {
                if (this.mReversedFlow) {
                    i9 = this.mProvider.getEdge(startIndexForPrepend + 1) + this.mSpacing + createItem;
                } else {
                    i9 = (this.mProvider.getEdge(startIndexForPrepend + 1) - this.mSpacing) - createItem;
                }
                this.mFirstVisibleIndex = startIndexForPrepend;
            } else {
                if (this.mReversedFlow) {
                    i9 = Integer.MIN_VALUE;
                } else {
                    i9 = Integer.MAX_VALUE;
                }
                this.mFirstVisibleIndex = startIndexForPrepend;
                this.mLastVisibleIndex = startIndexForPrepend;
            }
            this.mProvider.addItem(this.mTmpItem[0], startIndexForPrepend, createItem, 0, i9);
            z9 = true;
            if (z8 || checkPrependOverLimit(i8)) {
                break;
            }
        }
        return z9;
    }
}
