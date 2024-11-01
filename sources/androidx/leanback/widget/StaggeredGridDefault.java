package androidx.leanback.widget;

import androidx.leanback.widget.StaggeredGrid;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class StaggeredGridDefault extends StaggeredGrid {
    private int findRowEdgeLimitSearchIndex(boolean z8) {
        boolean z9 = false;
        if (z8) {
            for (int i8 = this.mLastVisibleIndex; i8 >= this.mFirstVisibleIndex; i8--) {
                int i9 = getLocation(i8).row;
                if (i9 == 0) {
                    z9 = true;
                } else if (z9 && i9 == this.mNumRows - 1) {
                    return i8;
                }
            }
            return -1;
        }
        for (int i10 = this.mFirstVisibleIndex; i10 <= this.mLastVisibleIndex; i10++) {
            int i11 = getLocation(i10).row;
            if (i11 == this.mNumRows - 1) {
                z9 = true;
            } else if (z9 && i11 == 0) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x014f, code lost:            return r9;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0137, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0138, code lost:            r6 = r10;     */
    @Override // androidx.leanback.widget.StaggeredGrid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean appendVisibleItemsWithoutCache(int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.StaggeredGridDefault.appendVisibleItemsWithoutCache(int, boolean):boolean");
    }

    @Override // androidx.leanback.widget.Grid
    public int findRowMax(boolean z8, int i8, int[] iArr) {
        int i9;
        int edge = this.mProvider.getEdge(i8);
        StaggeredGrid.Location location = getLocation(i8);
        int i10 = location.row;
        if (this.mReversedFlow) {
            i9 = i10;
            int i11 = i9;
            int i12 = 1;
            int i13 = edge;
            for (int i14 = i8 + 1; i12 < this.mNumRows && i14 <= this.mLastVisibleIndex; i14++) {
                StaggeredGrid.Location location2 = getLocation(i14);
                i13 += location2.offset;
                int i15 = location2.row;
                if (i15 != i11) {
                    i12++;
                    if (!z8 ? i13 < edge : i13 > edge) {
                        edge = i13;
                        i8 = i14;
                        i9 = i15;
                        i11 = i9;
                    } else {
                        i11 = i15;
                    }
                }
            }
        } else {
            int i16 = 1;
            int i17 = i10;
            StaggeredGrid.Location location3 = location;
            int i18 = edge;
            edge = this.mProvider.getSize(i8) + edge;
            i9 = i17;
            for (int i19 = i8 - 1; i16 < this.mNumRows && i19 >= this.mFirstVisibleIndex; i19--) {
                i18 -= location3.offset;
                location3 = getLocation(i19);
                int i20 = location3.row;
                if (i20 != i17) {
                    i16++;
                    int size = this.mProvider.getSize(i19) + i18;
                    if (!z8 ? size < edge : size > edge) {
                        edge = size;
                        i8 = i19;
                        i9 = i20;
                        i17 = i9;
                    } else {
                        i17 = i20;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i9;
            iArr[1] = i8;
        }
        return edge;
    }

    @Override // androidx.leanback.widget.Grid
    public int findRowMin(boolean z8, int i8, int[] iArr) {
        int i9;
        int edge = this.mProvider.getEdge(i8);
        StaggeredGrid.Location location = getLocation(i8);
        int i10 = location.row;
        if (this.mReversedFlow) {
            int i11 = 1;
            i9 = edge - this.mProvider.getSize(i8);
            int i12 = i10;
            for (int i13 = i8 - 1; i11 < this.mNumRows && i13 >= this.mFirstVisibleIndex; i13--) {
                edge -= location.offset;
                location = getLocation(i13);
                int i14 = location.row;
                if (i14 != i12) {
                    i11++;
                    int size = edge - this.mProvider.getSize(i13);
                    if (!z8 ? size < i9 : size > i9) {
                        i9 = size;
                        i8 = i13;
                        i10 = i14;
                        i12 = i10;
                    } else {
                        i12 = i14;
                    }
                }
            }
        } else {
            int i15 = i10;
            int i16 = i15;
            int i17 = 1;
            int i18 = edge;
            for (int i19 = i8 + 1; i17 < this.mNumRows && i19 <= this.mLastVisibleIndex; i19++) {
                StaggeredGrid.Location location2 = getLocation(i19);
                i18 += location2.offset;
                int i20 = location2.row;
                if (i20 != i16) {
                    i17++;
                    if (!z8 ? i18 < edge : i18 > edge) {
                        edge = i18;
                        i8 = i19;
                        i15 = i20;
                        i16 = i15;
                    } else {
                        i16 = i20;
                    }
                }
            }
            i9 = edge;
            i10 = i15;
        }
        if (iArr != null) {
            iArr[0] = i10;
            iArr[1] = i8;
        }
        return i9;
    }

    int getRowMax(int i8) {
        int i9;
        StaggeredGrid.Location location;
        int i10 = this.mFirstVisibleIndex;
        if (i10 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.mReversedFlow) {
            int edge = this.mProvider.getEdge(i10);
            if (getLocation(this.mFirstVisibleIndex).row == i8) {
                return edge;
            }
            int i11 = this.mFirstVisibleIndex;
            do {
                i11++;
                if (i11 <= getLastIndex()) {
                    location = getLocation(i11);
                    edge += location.offset;
                }
            } while (location.row != i8);
            return edge;
        }
        int edge2 = this.mProvider.getEdge(this.mLastVisibleIndex);
        StaggeredGrid.Location location2 = getLocation(this.mLastVisibleIndex);
        if (location2.row == i8) {
            i9 = location2.size;
        } else {
            int i12 = this.mLastVisibleIndex;
            do {
                i12--;
                if (i12 >= getFirstIndex()) {
                    edge2 -= location2.offset;
                    location2 = getLocation(i12);
                }
            } while (location2.row != i8);
            i9 = location2.size;
        }
        return edge2 + i9;
        return Integer.MIN_VALUE;
    }

    int getRowMin(int i8) {
        StaggeredGrid.Location location;
        int i9;
        int i10 = this.mFirstVisibleIndex;
        if (i10 < 0) {
            return Integer.MAX_VALUE;
        }
        if (this.mReversedFlow) {
            int edge = this.mProvider.getEdge(this.mLastVisibleIndex);
            StaggeredGrid.Location location2 = getLocation(this.mLastVisibleIndex);
            if (location2.row == i8) {
                i9 = location2.size;
            } else {
                int i11 = this.mLastVisibleIndex;
                do {
                    i11--;
                    if (i11 >= getFirstIndex()) {
                        edge -= location2.offset;
                        location2 = getLocation(i11);
                    }
                } while (location2.row != i8);
                i9 = location2.size;
            }
            return edge - i9;
        }
        int edge2 = this.mProvider.getEdge(i10);
        if (getLocation(this.mFirstVisibleIndex).row == i8) {
            return edge2;
        }
        int i12 = this.mFirstVisibleIndex;
        do {
            i12++;
            if (i12 <= getLastIndex()) {
                location = getLocation(i12);
                edge2 += location.offset;
            }
        } while (location.row != i8);
        return edge2;
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x014a, code lost:            return r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0132, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0133, code lost:            r5 = r9;     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103 A[LOOP:2: B:55:0x0103->B:69:0x0127, LOOP_START, PHI: r5 r8 r9
  0x0103: PHI (r5v13 int) = (r5v6 int), (r5v19 int) binds: [B:54:0x0101, B:69:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r8v19 int) = (r8v17 int), (r8v20 int) binds: [B:54:0x0101, B:69:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x0103: PHI (r9v7 int) = (r9v6 int), (r9v9 int) binds: [B:54:0x0101, B:69:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    @Override // androidx.leanback.widget.StaggeredGrid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean prependVisibleItemsWithoutCache(int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.StaggeredGridDefault.prependVisibleItemsWithoutCache(int, boolean):boolean");
    }
}
