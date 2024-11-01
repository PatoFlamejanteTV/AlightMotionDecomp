package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;

/* loaded from: classes3.dex */
public class AsyncListUtil<T> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncListUtil";
    boolean mAllowScrollHints;
    private final ThreadUtil.BackgroundCallback<T> mBackgroundCallback;
    final ThreadUtil.BackgroundCallback<T> mBackgroundProxy;
    final DataCallback<T> mDataCallback;
    private final ThreadUtil.MainThreadCallback<T> mMainThreadCallback;
    final ThreadUtil.MainThreadCallback<T> mMainThreadProxy;
    final Class<T> mTClass;
    final TileList<T> mTileList;
    final int mTileSize;
    final ViewCallback mViewCallback;
    final int[] mTmpRange = new int[2];
    final int[] mPrevRange = new int[2];
    final int[] mTmpRangeExtended = new int[2];
    private int mScrollHint = 0;
    int mItemCount = 0;
    int mDisplayedGeneration = 0;
    int mRequestedGeneration = 0;
    final SparseIntArray mMissingPositions = new SparseIntArray();

    /* loaded from: classes3.dex */
    public static abstract class DataCallback<T> {
        @WorkerThread
        public abstract void fillData(@NonNull T[] tArr, int i8, int i9);

        @WorkerThread
        public int getMaxCachedTiles() {
            return 10;
        }

        @WorkerThread
        public void recycleData(@NonNull T[] tArr, int i8) {
        }

        @WorkerThread
        public abstract int refreshData();
    }

    /* loaded from: classes3.dex */
    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE = 0;

        @UiThread
        public void extendRangeInto(@NonNull int[] iArr, @NonNull int[] iArr2, int i8) {
            int i9;
            int i10 = iArr[1];
            int i11 = iArr[0];
            int i12 = (i10 - i11) + 1;
            int i13 = i12 / 2;
            if (i8 == 1) {
                i9 = i12;
            } else {
                i9 = i13;
            }
            iArr2[0] = i11 - i9;
            if (i8 != 2) {
                i12 = i13;
            }
            iArr2[1] = i10 + i12;
        }

        @UiThread
        public abstract void getItemRangeInto(@NonNull int[] iArr);

        @UiThread
        public abstract void onDataRefresh();

        @UiThread
        public abstract void onItemLoaded(int i8);
    }

    public AsyncListUtil(@NonNull Class<T> cls, int i8, @NonNull DataCallback<T> dataCallback, @NonNull ViewCallback viewCallback) {
        ThreadUtil.MainThreadCallback<T> mainThreadCallback = new ThreadUtil.MainThreadCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.1
            private boolean isRequestedGeneration(int i9) {
                if (i9 == AsyncListUtil.this.mRequestedGeneration) {
                    return true;
                }
                return false;
            }

            private void recycleAllTiles() {
                for (int i9 = 0; i9 < AsyncListUtil.this.mTileList.size(); i9++) {
                    AsyncListUtil asyncListUtil = AsyncListUtil.this;
                    asyncListUtil.mBackgroundProxy.recycleTile(asyncListUtil.mTileList.getAtIndex(i9));
                }
                AsyncListUtil.this.mTileList.clear();
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void addTile(int i9, TileList.Tile<T> tile) {
                if (!isRequestedGeneration(i9)) {
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(tile);
                    return;
                }
                TileList.Tile<T> addOrReplace = AsyncListUtil.this.mTileList.addOrReplace(tile);
                if (addOrReplace != null) {
                    Log.e(AsyncListUtil.TAG, "duplicate tile @" + addOrReplace.mStartPosition);
                    AsyncListUtil.this.mBackgroundProxy.recycleTile(addOrReplace);
                }
                int i10 = tile.mStartPosition + tile.mItemCount;
                int i11 = 0;
                while (i11 < AsyncListUtil.this.mMissingPositions.size()) {
                    int keyAt = AsyncListUtil.this.mMissingPositions.keyAt(i11);
                    if (tile.mStartPosition <= keyAt && keyAt < i10) {
                        AsyncListUtil.this.mMissingPositions.removeAt(i11);
                        AsyncListUtil.this.mViewCallback.onItemLoaded(keyAt);
                    } else {
                        i11++;
                    }
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void removeTile(int i9, int i10) {
                if (!isRequestedGeneration(i9)) {
                    return;
                }
                TileList.Tile<T> removeAtPos = AsyncListUtil.this.mTileList.removeAtPos(i10);
                if (removeAtPos == null) {
                    Log.e(AsyncListUtil.TAG, "tile not found @" + i10);
                    return;
                }
                AsyncListUtil.this.mBackgroundProxy.recycleTile(removeAtPos);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
            public void updateItemCount(int i9, int i10) {
                if (!isRequestedGeneration(i9)) {
                    return;
                }
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                asyncListUtil.mItemCount = i10;
                asyncListUtil.mViewCallback.onDataRefresh();
                AsyncListUtil asyncListUtil2 = AsyncListUtil.this;
                asyncListUtil2.mDisplayedGeneration = asyncListUtil2.mRequestedGeneration;
                recycleAllTiles();
                AsyncListUtil asyncListUtil3 = AsyncListUtil.this;
                asyncListUtil3.mAllowScrollHints = false;
                asyncListUtil3.updateRange();
            }
        };
        this.mMainThreadCallback = mainThreadCallback;
        ThreadUtil.BackgroundCallback<T> backgroundCallback = new ThreadUtil.BackgroundCallback<T>() { // from class: androidx.recyclerview.widget.AsyncListUtil.2
            private int mFirstRequiredTileStart;
            private int mGeneration;
            private int mItemCount;
            private int mLastRequiredTileStart;
            final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
            private TileList.Tile<T> mRecycledRoot;

            private TileList.Tile<T> acquireTile() {
                TileList.Tile<T> tile = this.mRecycledRoot;
                if (tile != null) {
                    this.mRecycledRoot = tile.mNext;
                    return tile;
                }
                AsyncListUtil asyncListUtil = AsyncListUtil.this;
                return new TileList.Tile<>(asyncListUtil.mTClass, asyncListUtil.mTileSize);
            }

            private void addTile(TileList.Tile<T> tile) {
                this.mLoadedTiles.put(tile.mStartPosition, true);
                AsyncListUtil.this.mMainThreadProxy.addTile(this.mGeneration, tile);
            }

            private void flushTileCache(int i9) {
                int maxCachedTiles = AsyncListUtil.this.mDataCallback.getMaxCachedTiles();
                while (this.mLoadedTiles.size() >= maxCachedTiles) {
                    int keyAt = this.mLoadedTiles.keyAt(0);
                    SparseBooleanArray sparseBooleanArray = this.mLoadedTiles;
                    int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                    int i10 = this.mFirstRequiredTileStart - keyAt;
                    int i11 = keyAt2 - this.mLastRequiredTileStart;
                    if (i10 > 0 && (i10 >= i11 || i9 == 2)) {
                        removeTile(keyAt);
                    } else if (i11 > 0) {
                        if (i10 < i11 || i9 == 1) {
                            removeTile(keyAt2);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            private int getTileStart(int i9) {
                return i9 - (i9 % AsyncListUtil.this.mTileSize);
            }

            private boolean isTileLoaded(int i9) {
                return this.mLoadedTiles.get(i9);
            }

            private void log(String str, Object... objArr) {
                Log.d(AsyncListUtil.TAG, "[BKGR] " + String.format(str, objArr));
            }

            private void removeTile(int i9) {
                this.mLoadedTiles.delete(i9);
                AsyncListUtil.this.mMainThreadProxy.removeTile(this.mGeneration, i9);
            }

            private void requestTiles(int i9, int i10, int i11, boolean z8) {
                int i12;
                int i13 = i9;
                while (i13 <= i10) {
                    if (z8) {
                        i12 = (i10 + i9) - i13;
                    } else {
                        i12 = i13;
                    }
                    AsyncListUtil.this.mBackgroundProxy.loadTile(i12, i11);
                    i13 += AsyncListUtil.this.mTileSize;
                }
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void loadTile(int i9, int i10) {
                if (isTileLoaded(i9)) {
                    return;
                }
                TileList.Tile<T> acquireTile = acquireTile();
                acquireTile.mStartPosition = i9;
                int min = Math.min(AsyncListUtil.this.mTileSize, this.mItemCount - i9);
                acquireTile.mItemCount = min;
                AsyncListUtil.this.mDataCallback.fillData(acquireTile.mItems, acquireTile.mStartPosition, min);
                flushTileCache(i10);
                addTile(acquireTile);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void recycleTile(TileList.Tile<T> tile) {
                AsyncListUtil.this.mDataCallback.recycleData(tile.mItems, tile.mItemCount);
                tile.mNext = this.mRecycledRoot;
                this.mRecycledRoot = tile;
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void refresh(int i9) {
                this.mGeneration = i9;
                this.mLoadedTiles.clear();
                int refreshData = AsyncListUtil.this.mDataCallback.refreshData();
                this.mItemCount = refreshData;
                AsyncListUtil.this.mMainThreadProxy.updateItemCount(this.mGeneration, refreshData);
            }

            @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
            public void updateRange(int i9, int i10, int i11, int i12, int i13) {
                if (i9 > i10) {
                    return;
                }
                int tileStart = getTileStart(i9);
                int tileStart2 = getTileStart(i10);
                this.mFirstRequiredTileStart = getTileStart(i11);
                int tileStart3 = getTileStart(i12);
                this.mLastRequiredTileStart = tileStart3;
                if (i13 == 1) {
                    requestTiles(this.mFirstRequiredTileStart, tileStart2, i13, true);
                    requestTiles(tileStart2 + AsyncListUtil.this.mTileSize, this.mLastRequiredTileStart, i13, false);
                } else {
                    requestTiles(tileStart, tileStart3, i13, false);
                    requestTiles(this.mFirstRequiredTileStart, tileStart - AsyncListUtil.this.mTileSize, i13, true);
                }
            }
        };
        this.mBackgroundCallback = backgroundCallback;
        this.mTClass = cls;
        this.mTileSize = i8;
        this.mDataCallback = dataCallback;
        this.mViewCallback = viewCallback;
        this.mTileList = new TileList<>(i8);
        MessageThreadUtil messageThreadUtil = new MessageThreadUtil();
        this.mMainThreadProxy = messageThreadUtil.getMainThreadProxy(mainThreadCallback);
        this.mBackgroundProxy = messageThreadUtil.getBackgroundProxy(backgroundCallback);
        refresh();
    }

    private boolean isRefreshPending() {
        if (this.mRequestedGeneration != this.mDisplayedGeneration) {
            return true;
        }
        return false;
    }

    @Nullable
    public T getItem(int i8) {
        if (i8 >= 0 && i8 < this.mItemCount) {
            T itemAt = this.mTileList.getItemAt(i8);
            if (itemAt == null && !isRefreshPending()) {
                this.mMissingPositions.put(i8, 0);
            }
            return itemAt;
        }
        throw new IndexOutOfBoundsException(i8 + " is not within 0 and " + this.mItemCount);
    }

    public int getItemCount() {
        return this.mItemCount;
    }

    void log(String str, Object... objArr) {
        Log.d(TAG, "[MAIN] " + String.format(str, objArr));
    }

    public void onRangeChanged() {
        if (isRefreshPending()) {
            return;
        }
        updateRange();
        this.mAllowScrollHints = true;
    }

    public void refresh() {
        this.mMissingPositions.clear();
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int i8 = this.mRequestedGeneration + 1;
        this.mRequestedGeneration = i8;
        backgroundCallback.refresh(i8);
    }

    void updateRange() {
        int i8;
        this.mViewCallback.getItemRangeInto(this.mTmpRange);
        int[] iArr = this.mTmpRange;
        int i9 = iArr[0];
        int i10 = iArr[1];
        if (i9 > i10 || i9 < 0 || i10 >= this.mItemCount) {
            return;
        }
        if (!this.mAllowScrollHints) {
            this.mScrollHint = 0;
        } else {
            int[] iArr2 = this.mPrevRange;
            if (i9 <= iArr2[1] && (i8 = iArr2[0]) <= i10) {
                if (i9 < i8) {
                    this.mScrollHint = 1;
                } else if (i9 > i8) {
                    this.mScrollHint = 2;
                }
            } else {
                this.mScrollHint = 0;
            }
        }
        int[] iArr3 = this.mPrevRange;
        iArr3[0] = i9;
        iArr3[1] = i10;
        this.mViewCallback.extendRangeInto(iArr, this.mTmpRangeExtended, this.mScrollHint);
        int[] iArr4 = this.mTmpRangeExtended;
        iArr4[0] = Math.min(this.mTmpRange[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.mTmpRangeExtended;
        iArr5[1] = Math.max(this.mTmpRange[1], Math.min(iArr5[1], this.mItemCount - 1));
        ThreadUtil.BackgroundCallback<T> backgroundCallback = this.mBackgroundProxy;
        int[] iArr6 = this.mTmpRange;
        int i11 = iArr6[0];
        int i12 = iArr6[1];
        int[] iArr7 = this.mTmpRangeExtended;
        backgroundCallback.updateRange(i11, i12, iArr7[0], iArr7[1], this.mScrollHint);
    }
}
