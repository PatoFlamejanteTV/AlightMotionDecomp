package androidx.leanback.widget;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.CircularIntArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class Grid {
    public static final int START_DEFAULT = -1;
    protected int mNumRows;
    protected Provider mProvider;
    protected boolean mReversedFlow;
    protected int mSpacing;
    protected CircularIntArray[] mTmpItemPositionsInRows;
    Object[] mTmpItem = new Object[1];
    protected int mFirstVisibleIndex = -1;
    protected int mLastVisibleIndex = -1;
    protected int mStartIndex = -1;

    /* loaded from: classes3.dex */
    public static class Location {
        public int row;

        public Location(int i8) {
            this.row = i8;
        }
    }

    /* loaded from: classes3.dex */
    public interface Provider {
        void addItem(Object obj, int i8, int i9, int i10, int i11);

        int createItem(int i8, boolean z8, Object[] objArr, boolean z9);

        int getCount();

        int getEdge(int i8);

        int getMinIndex();

        int getSize(int i8);

        void removeItem(int i8);
    }

    public static Grid createGrid(int i8) {
        if (i8 == 1) {
            return new SingleRow();
        }
        StaggeredGridDefault staggeredGridDefault = new StaggeredGridDefault();
        staggeredGridDefault.setNumRows(i8);
        return staggeredGridDefault;
    }

    private void resetVisibleIndexIfEmpty() {
        if (this.mLastVisibleIndex < this.mFirstVisibleIndex) {
            resetVisibleIndex();
        }
    }

    public boolean appendOneColumnVisibleItems() {
        int i8;
        if (this.mReversedFlow) {
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = Integer.MIN_VALUE;
        }
        return appendVisibleItems(i8, true);
    }

    public final void appendVisibleItems(int i8) {
        appendVisibleItems(i8, false);
    }

    protected abstract boolean appendVisibleItems(int i8, boolean z8);

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean checkAppendOverLimit(int i8) {
        if (this.mLastVisibleIndex < 0) {
            return false;
        }
        if (this.mReversedFlow) {
            if (findRowMin(true, null) > i8 + this.mSpacing) {
                return false;
            }
        } else if (findRowMax(false, null) < i8 - this.mSpacing) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean checkPrependOverLimit(int i8) {
        if (this.mLastVisibleIndex < 0) {
            return false;
        }
        if (this.mReversedFlow) {
            if (findRowMax(false, null) < i8 - this.mSpacing) {
                return false;
            }
        } else if (findRowMin(true, null) > i8 + this.mSpacing) {
            return false;
        }
        return true;
    }

    public void collectAdjacentPrefetchPositions(int i8, int i9, @NonNull RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
    }

    public abstract void debugPrint(PrintWriter printWriter);

    public void fillDisappearingItems(int[] iArr, int i8, SparseIntArray sparseIntArray) {
        int i9;
        int i10;
        int edge;
        int i11;
        int edge2;
        int i12;
        int lastVisibleIndex = getLastVisibleIndex();
        if (lastVisibleIndex >= 0) {
            i9 = Arrays.binarySearch(iArr, 0, i8, lastVisibleIndex);
        } else {
            i9 = 0;
        }
        if (i9 < 0) {
            if (this.mReversedFlow) {
                edge2 = (this.mProvider.getEdge(lastVisibleIndex) - this.mProvider.getSize(lastVisibleIndex)) - this.mSpacing;
            } else {
                edge2 = this.mProvider.getEdge(lastVisibleIndex) + this.mProvider.getSize(lastVisibleIndex) + this.mSpacing;
            }
            int i13 = edge2;
            for (int i14 = (-i9) - 1; i14 < i8; i14++) {
                int i15 = iArr[i14];
                int i16 = sparseIntArray.get(i15);
                if (i16 < 0) {
                    i12 = 0;
                } else {
                    i12 = i16;
                }
                int createItem = this.mProvider.createItem(i15, true, this.mTmpItem, true);
                this.mProvider.addItem(this.mTmpItem[0], i15, createItem, i12, i13);
                if (this.mReversedFlow) {
                    i13 = (i13 - createItem) - this.mSpacing;
                } else {
                    i13 = i13 + createItem + this.mSpacing;
                }
            }
        }
        int firstVisibleIndex = getFirstVisibleIndex();
        if (firstVisibleIndex >= 0) {
            i10 = Arrays.binarySearch(iArr, 0, i8, firstVisibleIndex);
        } else {
            i10 = 0;
        }
        if (i10 < 0) {
            if (this.mReversedFlow) {
                edge = this.mProvider.getEdge(firstVisibleIndex);
            } else {
                edge = this.mProvider.getEdge(firstVisibleIndex);
            }
            for (int i17 = (-i10) - 2; i17 >= 0; i17--) {
                int i18 = iArr[i17];
                int i19 = sparseIntArray.get(i18);
                if (i19 < 0) {
                    i11 = 0;
                } else {
                    i11 = i19;
                }
                int createItem2 = this.mProvider.createItem(i18, false, this.mTmpItem, true);
                if (this.mReversedFlow) {
                    edge = edge + this.mSpacing + createItem2;
                } else {
                    edge = (edge - this.mSpacing) - createItem2;
                }
                this.mProvider.addItem(this.mTmpItem[0], i18, createItem2, i11, edge);
            }
        }
    }

    protected abstract int findRowMax(boolean z8, int i8, int[] iArr);

    public final int findRowMax(boolean z8, @Nullable int[] iArr) {
        return findRowMax(z8, this.mReversedFlow ? this.mFirstVisibleIndex : this.mLastVisibleIndex, iArr);
    }

    protected abstract int findRowMin(boolean z8, int i8, int[] iArr);

    public final int findRowMin(boolean z8, @Nullable int[] iArr) {
        return findRowMin(z8, this.mReversedFlow ? this.mLastVisibleIndex : this.mFirstVisibleIndex, iArr);
    }

    public final int getFirstVisibleIndex() {
        return this.mFirstVisibleIndex;
    }

    public final CircularIntArray[] getItemPositionsInRows() {
        return getItemPositionsInRows(getFirstVisibleIndex(), getLastVisibleIndex());
    }

    public abstract CircularIntArray[] getItemPositionsInRows(int i8, int i9);

    public final int getLastVisibleIndex() {
        return this.mLastVisibleIndex;
    }

    public abstract Location getLocation(int i8);

    public int getNumRows() {
        return this.mNumRows;
    }

    public final int getRowIndex(int i8) {
        Location location = getLocation(i8);
        if (location == null) {
            return -1;
        }
        return location.row;
    }

    public void invalidateItemsAfter(int i8) {
        int i9;
        if (i8 < 0 || (i9 = this.mLastVisibleIndex) < 0) {
            return;
        }
        if (i9 >= i8) {
            this.mLastVisibleIndex = i8 - 1;
        }
        resetVisibleIndexIfEmpty();
        if (getFirstVisibleIndex() < 0) {
            setStart(i8);
        }
    }

    public boolean isReversedFlow() {
        return this.mReversedFlow;
    }

    public final boolean prependOneColumnVisibleItems() {
        int i8;
        if (this.mReversedFlow) {
            i8 = Integer.MIN_VALUE;
        } else {
            i8 = Integer.MAX_VALUE;
        }
        return prependVisibleItems(i8, true);
    }

    public final void prependVisibleItems(int i8) {
        prependVisibleItems(i8, false);
    }

    protected abstract boolean prependVisibleItems(int i8, boolean z8);

    public void removeInvisibleItemsAtEnd(int i8, int i9) {
        while (true) {
            int i10 = this.mLastVisibleIndex;
            if (i10 < this.mFirstVisibleIndex || i10 <= i8) {
                break;
            }
            if (!this.mReversedFlow) {
                if (this.mProvider.getEdge(i10) < i9) {
                    break;
                }
                this.mProvider.removeItem(this.mLastVisibleIndex);
                this.mLastVisibleIndex--;
            } else {
                if (this.mProvider.getEdge(i10) > i9) {
                    break;
                }
                this.mProvider.removeItem(this.mLastVisibleIndex);
                this.mLastVisibleIndex--;
            }
        }
        resetVisibleIndexIfEmpty();
    }

    public void removeInvisibleItemsAtFront(int i8, int i9) {
        while (true) {
            int i10 = this.mLastVisibleIndex;
            int i11 = this.mFirstVisibleIndex;
            if (i10 < i11 || i11 >= i8) {
                break;
            }
            int size = this.mProvider.getSize(i11);
            if (!this.mReversedFlow) {
                if (this.mProvider.getEdge(this.mFirstVisibleIndex) + size > i9) {
                    break;
                }
                this.mProvider.removeItem(this.mFirstVisibleIndex);
                this.mFirstVisibleIndex++;
            } else {
                if (this.mProvider.getEdge(this.mFirstVisibleIndex) - size < i9) {
                    break;
                }
                this.mProvider.removeItem(this.mFirstVisibleIndex);
                this.mFirstVisibleIndex++;
            }
        }
        resetVisibleIndexIfEmpty();
    }

    public void resetVisibleIndex() {
        this.mLastVisibleIndex = -1;
        this.mFirstVisibleIndex = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNumRows(int i8) {
        if (i8 > 0) {
            if (this.mNumRows == i8) {
                return;
            }
            this.mNumRows = i8;
            this.mTmpItemPositionsInRows = new CircularIntArray[i8];
            for (int i9 = 0; i9 < this.mNumRows; i9++) {
                this.mTmpItemPositionsInRows[i9] = new CircularIntArray();
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setProvider(Provider provider) {
        this.mProvider = provider;
    }

    public final void setReversedFlow(boolean z8) {
        this.mReversedFlow = z8;
    }

    public final void setSpacing(int i8) {
        this.mSpacing = i8;
    }

    public void setStart(int i8) {
        this.mStartIndex = i8;
    }
}
