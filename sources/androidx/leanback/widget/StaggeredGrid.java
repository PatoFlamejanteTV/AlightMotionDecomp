package androidx.leanback.widget;

import androidx.collection.CircularArray;
import androidx.collection.CircularIntArray;
import androidx.leanback.widget.Grid;
import java.io.PrintWriter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class StaggeredGrid extends Grid {
    protected Object mPendingItem;
    protected int mPendingItemSize;
    protected CircularArray<Location> mLocations = new CircularArray<>(64);
    protected int mFirstIndex = -1;

    /* loaded from: classes3.dex */
    public static class Location extends Grid.Location {
        public int offset;
        public int size;

        public Location(int i8, int i9, int i10) {
            super(i8);
            this.offset = i9;
            this.size = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0039 -> B:10:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int calculateOffsetAfterLastItem(int r3) {
        /*
            r2 = this;
            int r0 = r2.getLastIndex()
        L4:
            int r1 = r2.mFirstIndex
            if (r0 < r1) goto L14
            androidx.leanback.widget.StaggeredGrid$Location r1 = r2.getLocation(r0)
            int r1 = r1.row
            if (r1 != r3) goto L11
            goto L18
        L11:
            int r0 = r0 + (-1)
            goto L4
        L14:
            int r0 = r2.getLastIndex()
        L18:
            boolean r3 = r2.isReversedFlow()
            if (r3 == 0) goto L28
            androidx.leanback.widget.StaggeredGrid$Location r3 = r2.getLocation(r0)
            int r3 = r3.size
            int r3 = -r3
            int r1 = r2.mSpacing
            goto L3f
        L28:
            androidx.leanback.widget.StaggeredGrid$Location r3 = r2.getLocation(r0)
            int r3 = r3.size
            int r1 = r2.mSpacing
            int r3 = r3 + r1
        L31:
            int r0 = r0 + 1
            int r1 = r2.getLastIndex()
            if (r0 > r1) goto L41
            androidx.leanback.widget.StaggeredGrid$Location r1 = r2.getLocation(r0)
            int r1 = r1.offset
        L3f:
            int r3 = r3 - r1
            goto L31
        L41:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.StaggeredGrid.calculateOffsetAfterLastItem(int):int");
    }

    protected final boolean appendVisbleItemsWithCache(int i8, boolean z8) {
        int i9;
        int i10;
        int i11;
        if (this.mLocations.size() == 0) {
            return false;
        }
        int count = this.mProvider.getCount();
        int i12 = this.mLastVisibleIndex;
        if (i12 >= 0) {
            i9 = i12 + 1;
            i10 = this.mProvider.getEdge(i12);
        } else {
            int i13 = this.mStartIndex;
            if (i13 != -1) {
                i9 = i13;
            } else {
                i9 = 0;
            }
            if (i9 <= getLastIndex() + 1 && i9 >= getFirstIndex()) {
                if (i9 > getLastIndex()) {
                    return false;
                }
                i10 = Integer.MAX_VALUE;
            } else {
                this.mLocations.clear();
                return false;
            }
        }
        int lastIndex = getLastIndex();
        int i14 = i9;
        while (i14 < count && i14 <= lastIndex) {
            Location location = getLocation(i14);
            if (i10 != Integer.MAX_VALUE) {
                i10 += location.offset;
            }
            int i15 = location.row;
            int createItem = this.mProvider.createItem(i14, true, this.mTmpItem, false);
            if (createItem != location.size) {
                location.size = createItem;
                this.mLocations.removeFromEnd(lastIndex - i14);
                i11 = i14;
            } else {
                i11 = lastIndex;
            }
            this.mLastVisibleIndex = i14;
            if (this.mFirstVisibleIndex < 0) {
                this.mFirstVisibleIndex = i14;
            }
            this.mProvider.addItem(this.mTmpItem[0], i14, createItem, i15, i10);
            if (!z8 && checkAppendOverLimit(i8)) {
                return true;
            }
            if (i10 == Integer.MAX_VALUE) {
                i10 = this.mProvider.getEdge(i14);
            }
            if (i15 == this.mNumRows - 1 && z8) {
                return true;
            }
            i14++;
            lastIndex = i11;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int appendVisibleItemToRow(int i8, int i9, int i10) {
        int edge;
        int i11 = this.mLastVisibleIndex;
        if (i11 >= 0 && (i11 != getLastIndex() || this.mLastVisibleIndex != i8 - 1)) {
            throw new IllegalStateException();
        }
        int i12 = this.mLastVisibleIndex;
        if (i12 < 0) {
            if (this.mLocations.size() > 0 && i8 == getLastIndex() + 1) {
                edge = calculateOffsetAfterLastItem(i9);
            } else {
                edge = 0;
            }
        } else {
            edge = i10 - this.mProvider.getEdge(i12);
        }
        Location location = new Location(i9, edge, 0);
        this.mLocations.addLast(location);
        Object obj = this.mPendingItem;
        if (obj != null) {
            location.size = this.mPendingItemSize;
            this.mPendingItem = null;
        } else {
            location.size = this.mProvider.createItem(i8, true, this.mTmpItem, false);
            obj = this.mTmpItem[0];
        }
        Object obj2 = obj;
        if (this.mLocations.size() == 1) {
            this.mLastVisibleIndex = i8;
            this.mFirstVisibleIndex = i8;
            this.mFirstIndex = i8;
        } else {
            int i13 = this.mLastVisibleIndex;
            if (i13 < 0) {
                this.mLastVisibleIndex = i8;
                this.mFirstVisibleIndex = i8;
            } else {
                this.mLastVisibleIndex = i13 + 1;
            }
        }
        this.mProvider.addItem(obj2, i8, location.size, i9, i10);
        return location.size;
    }

    @Override // androidx.leanback.widget.Grid
    protected final boolean appendVisibleItems(int i8, boolean z8) {
        if (this.mProvider.getCount() == 0) {
            return false;
        }
        if (!z8 && checkAppendOverLimit(i8)) {
            return false;
        }
        try {
            if (appendVisbleItemsWithCache(i8, z8)) {
                this.mTmpItem[0] = null;
                this.mPendingItem = null;
                return true;
            }
            return appendVisibleItemsWithoutCache(i8, z8);
        } finally {
            this.mTmpItem[0] = null;
            this.mPendingItem = null;
        }
    }

    protected abstract boolean appendVisibleItemsWithoutCache(int i8, boolean z8);

    @Override // androidx.leanback.widget.Grid
    public final void debugPrint(PrintWriter printWriter) {
        int size = this.mLocations.size();
        for (int i8 = 0; i8 < size; i8++) {
            printWriter.print("<" + (this.mFirstIndex + i8) + "," + this.mLocations.get(i8).row + ">");
            printWriter.print(" ");
            printWriter.println();
        }
    }

    public final int getFirstIndex() {
        return this.mFirstIndex;
    }

    @Override // androidx.leanback.widget.Grid
    public final CircularIntArray[] getItemPositionsInRows(int i8, int i9) {
        for (int i10 = 0; i10 < this.mNumRows; i10++) {
            this.mTmpItemPositionsInRows[i10].clear();
        }
        if (i8 >= 0) {
            while (i8 <= i9) {
                CircularIntArray circularIntArray = this.mTmpItemPositionsInRows[getLocation(i8).row];
                if (circularIntArray.size() > 0 && circularIntArray.getLast() == i8 - 1) {
                    circularIntArray.popLast();
                    circularIntArray.addLast(i8);
                } else {
                    circularIntArray.addLast(i8);
                    circularIntArray.addLast(i8);
                }
                i8++;
            }
        }
        return this.mTmpItemPositionsInRows;
    }

    public final int getLastIndex() {
        return (this.mFirstIndex + this.mLocations.size()) - 1;
    }

    public final int getSize() {
        return this.mLocations.size();
    }

    @Override // androidx.leanback.widget.Grid
    public void invalidateItemsAfter(int i8) {
        super.invalidateItemsAfter(i8);
        this.mLocations.removeFromEnd((getLastIndex() - i8) + 1);
        if (this.mLocations.size() == 0) {
            this.mFirstIndex = -1;
        }
    }

    protected final boolean prependVisbleItemsWithCache(int i8, boolean z8) {
        int i9;
        int i10;
        int i11;
        if (this.mLocations.size() == 0) {
            return false;
        }
        int i12 = this.mFirstVisibleIndex;
        if (i12 >= 0) {
            i10 = this.mProvider.getEdge(i12);
            i11 = getLocation(this.mFirstVisibleIndex).offset;
            i9 = this.mFirstVisibleIndex - 1;
        } else {
            int i13 = this.mStartIndex;
            if (i13 != -1) {
                i9 = i13;
            } else {
                i9 = 0;
            }
            if (i9 <= getLastIndex() && i9 >= getFirstIndex() - 1) {
                if (i9 < getFirstIndex()) {
                    return false;
                }
                i10 = Integer.MAX_VALUE;
                i11 = 0;
            } else {
                this.mLocations.clear();
                return false;
            }
        }
        int max = Math.max(this.mProvider.getMinIndex(), this.mFirstIndex);
        while (i9 >= max) {
            Location location = getLocation(i9);
            int i14 = location.row;
            int createItem = this.mProvider.createItem(i9, false, this.mTmpItem, false);
            if (createItem != location.size) {
                this.mLocations.removeFromStart((i9 + 1) - this.mFirstIndex);
                this.mFirstIndex = this.mFirstVisibleIndex;
                this.mPendingItem = this.mTmpItem[0];
                this.mPendingItemSize = createItem;
                return false;
            }
            this.mFirstVisibleIndex = i9;
            if (this.mLastVisibleIndex < 0) {
                this.mLastVisibleIndex = i9;
            }
            this.mProvider.addItem(this.mTmpItem[0], i9, createItem, i14, i10 - i11);
            if (!z8 && checkPrependOverLimit(i8)) {
                return true;
            }
            i10 = this.mProvider.getEdge(i9);
            i11 = location.offset;
            if (i14 == 0 && z8) {
                return true;
            }
            i9--;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int prependVisibleItemToRow(int i8, int i9, int i10) {
        Location location;
        int i11;
        int i12 = this.mFirstVisibleIndex;
        if (i12 >= 0 && (i12 != getFirstIndex() || this.mFirstVisibleIndex != i8 + 1)) {
            throw new IllegalStateException();
        }
        int i13 = this.mFirstIndex;
        if (i13 >= 0) {
            location = getLocation(i13);
        } else {
            location = null;
        }
        int edge = this.mProvider.getEdge(this.mFirstIndex);
        Location location2 = new Location(i9, 0, 0);
        this.mLocations.addFirst(location2);
        Object obj = this.mPendingItem;
        if (obj != null) {
            location2.size = this.mPendingItemSize;
            this.mPendingItem = null;
        } else {
            location2.size = this.mProvider.createItem(i8, false, this.mTmpItem, false);
            obj = this.mTmpItem[0];
        }
        Object obj2 = obj;
        this.mFirstVisibleIndex = i8;
        this.mFirstIndex = i8;
        if (this.mLastVisibleIndex < 0) {
            this.mLastVisibleIndex = i8;
        }
        if (!this.mReversedFlow) {
            i11 = i10 - location2.size;
        } else {
            i11 = i10 + location2.size;
        }
        int i14 = i11;
        if (location != null) {
            location.offset = edge - i14;
        }
        this.mProvider.addItem(obj2, i8, location2.size, i9, i14);
        return location2.size;
    }

    @Override // androidx.leanback.widget.Grid
    protected final boolean prependVisibleItems(int i8, boolean z8) {
        if (this.mProvider.getCount() == 0) {
            return false;
        }
        if (!z8 && checkPrependOverLimit(i8)) {
            return false;
        }
        try {
            if (prependVisbleItemsWithCache(i8, z8)) {
                this.mTmpItem[0] = null;
                this.mPendingItem = null;
                return true;
            }
            return prependVisibleItemsWithoutCache(i8, z8);
        } finally {
            this.mTmpItem[0] = null;
            this.mPendingItem = null;
        }
    }

    protected abstract boolean prependVisibleItemsWithoutCache(int i8, boolean z8);

    @Override // androidx.leanback.widget.Grid
    public final Location getLocation(int i8) {
        int i9 = i8 - this.mFirstIndex;
        if (i9 < 0 || i9 >= this.mLocations.size()) {
            return null;
        }
        return this.mLocations.get(i9);
    }
}
