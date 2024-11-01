package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.core.os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class GapWorker implements Runnable {
    static final ThreadLocal<GapWorker> sGapWorker = new ThreadLocal<>();
    static Comparator<Task> sTaskComparator = new Comparator<Task>() { // from class: androidx.recyclerview.widget.GapWorker.1
        @Override // java.util.Comparator
        public int compare(Task task, Task task2) {
            RecyclerView recyclerView = task.view;
            if ((recyclerView == null) != (task2.view == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z8 = task.immediate;
            if (z8 != task2.immediate) {
                return z8 ? -1 : 1;
            }
            int i8 = task2.viewVelocity - task.viewVelocity;
            if (i8 != 0) {
                return i8;
            }
            int i9 = task.distanceToItem - task2.distanceToItem;
            if (i9 != 0) {
                return i9;
            }
            return 0;
        }
    };
    long mFrameIntervalNs;
    long mPostTimeNs;
    ArrayList<RecyclerView> mRecyclerViews = new ArrayList<>();
    private ArrayList<Task> mTasks = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes3.dex */
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {
        int mCount;
        int[] mPrefetchArray;
        int mPrefetchDx;
        int mPrefetchDy;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        public void addPosition(int i8, int i9) {
            if (i8 >= 0) {
                if (i9 >= 0) {
                    int i10 = this.mCount;
                    int i11 = i10 * 2;
                    int[] iArr = this.mPrefetchArray;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.mPrefetchArray = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i11 >= iArr.length) {
                        int[] iArr3 = new int[i10 * 4];
                        this.mPrefetchArray = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.mPrefetchArray;
                    iArr4[i11] = i8;
                    iArr4[i11 + 1] = i9;
                    this.mCount++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void clearPrefetchPositions() {
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.mCount = 0;
        }

        void collectPrefetchPositionsFromView(RecyclerView recyclerView, boolean z8) {
            this.mCount = 0;
            int[] iArr = this.mPrefetchArray;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && layoutManager != null && layoutManager.isItemPrefetchEnabled()) {
                if (z8) {
                    if (!recyclerView.mAdapterHelper.hasPendingUpdates()) {
                        layoutManager.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    layoutManager.collectAdjacentPrefetchPositions(this.mPrefetchDx, this.mPrefetchDy, recyclerView.mState, this);
                }
                int i8 = this.mCount;
                if (i8 > layoutManager.mPrefetchMaxCountObserved) {
                    layoutManager.mPrefetchMaxCountObserved = i8;
                    layoutManager.mPrefetchMaxObservedInInitialPrefetch = z8;
                    recyclerView.mRecycler.updateViewCacheSize();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean lastPrefetchIncludedPosition(int i8) {
            if (this.mPrefetchArray != null) {
                int i9 = this.mCount * 2;
                for (int i10 = 0; i10 < i9; i10 += 2) {
                    if (this.mPrefetchArray[i10] == i8) {
                        return true;
                    }
                }
            }
            return false;
        }

        void setPrefetchVector(int i8, int i9) {
            this.mPrefetchDx = i8;
            this.mPrefetchDy = i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Task {
        public int distanceToItem;
        public boolean immediate;
        public int position;
        public RecyclerView view;
        public int viewVelocity;

        Task() {
        }

        public void clear() {
            this.immediate = false;
            this.viewVelocity = 0;
            this.distanceToItem = 0;
            this.view = null;
            this.position = 0;
        }
    }

    private void buildTaskList() {
        Task task;
        boolean z8;
        int size = this.mRecyclerViews.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView = this.mRecyclerViews.get(i9);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.collectPrefetchPositionsFromView(recyclerView, false);
                i8 += recyclerView.mPrefetchRegistry.mCount;
            }
        }
        this.mTasks.ensureCapacity(i8);
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView2 = this.mRecyclerViews.get(i11);
            if (recyclerView2.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(layoutPrefetchRegistryImpl.mPrefetchDx) + Math.abs(layoutPrefetchRegistryImpl.mPrefetchDy);
                for (int i12 = 0; i12 < layoutPrefetchRegistryImpl.mCount * 2; i12 += 2) {
                    if (i10 >= this.mTasks.size()) {
                        task = new Task();
                        this.mTasks.add(task);
                    } else {
                        task = this.mTasks.get(i10);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.mPrefetchArray;
                    int i13 = iArr[i12 + 1];
                    if (i13 <= abs) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    task.immediate = z8;
                    task.viewVelocity = abs;
                    task.distanceToItem = i13;
                    task.view = recyclerView2;
                    task.position = iArr[i12];
                    i10++;
                }
            }
        }
        Collections.sort(this.mTasks, sTaskComparator);
    }

    private void flushTaskWithDeadline(Task task, long j8) {
        long j9;
        if (task.immediate) {
            j9 = Long.MAX_VALUE;
        } else {
            j9 = j8;
        }
        RecyclerView.ViewHolder prefetchPositionWithDeadline = prefetchPositionWithDeadline(task.view, task.position, j9);
        if (prefetchPositionWithDeadline != null && prefetchPositionWithDeadline.mNestedRecyclerView != null && prefetchPositionWithDeadline.isBound() && !prefetchPositionWithDeadline.isInvalid()) {
            prefetchInnerRecyclerViewWithDeadline(prefetchPositionWithDeadline.mNestedRecyclerView.get(), j8);
        }
    }

    private void flushTasksWithDeadline(long j8) {
        for (int i8 = 0; i8 < this.mTasks.size(); i8++) {
            Task task = this.mTasks.get(i8);
            if (task.view != null) {
                flushTaskWithDeadline(task, j8);
                task.clear();
            } else {
                return;
            }
        }
    }

    static boolean isPrefetchPositionAttached(RecyclerView recyclerView, int i8) {
        int unfilteredChildCount = recyclerView.mChildHelper.getUnfilteredChildCount();
        for (int i9 = 0; i9 < unfilteredChildCount; i9++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.getUnfilteredChildAt(i9));
            if (childViewHolderInt.mPosition == i8 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void prefetchInnerRecyclerViewWithDeadline(@Nullable RecyclerView recyclerView, long j8) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.getUnfilteredChildCount() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(recyclerView, true);
        if (layoutPrefetchRegistryImpl.mCount != 0) {
            try {
                TraceCompat.beginSection("RV Nested Prefetch");
                recyclerView.mState.prepareForNestedPrefetch(recyclerView.mAdapter);
                for (int i8 = 0; i8 < layoutPrefetchRegistryImpl.mCount * 2; i8 += 2) {
                    prefetchPositionWithDeadline(recyclerView, layoutPrefetchRegistryImpl.mPrefetchArray[i8], j8);
                }
            } finally {
                TraceCompat.endSection();
            }
        }
    }

    private RecyclerView.ViewHolder prefetchPositionWithDeadline(RecyclerView recyclerView, int i8, long j8) {
        if (isPrefetchPositionAttached(recyclerView, i8)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline = recycler.tryGetViewHolderForPositionByDeadline(i8, false, j8);
            if (tryGetViewHolderForPositionByDeadline != null) {
                if (tryGetViewHolderForPositionByDeadline.isBound() && !tryGetViewHolderForPositionByDeadline.isInvalid()) {
                    recycler.recycleView(tryGetViewHolderForPositionByDeadline.itemView);
                } else {
                    recycler.addViewHolderToRecycledViewPool(tryGetViewHolderForPositionByDeadline, false);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return tryGetViewHolderForPositionByDeadline;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    public void add(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.mRecyclerViews.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.mRecyclerViews.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void postFromTraversal(RecyclerView recyclerView, int i8, int i9) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.mRecyclerViews.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.mPostTimeNs == 0) {
                this.mPostTimeNs = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.setPrefetchVector(i8, i9);
    }

    void prefetch(long j8) {
        buildTaskList();
        flushTasksWithDeadline(j8);
    }

    public void remove(RecyclerView recyclerView) {
        boolean remove = this.mRecyclerViews.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            TraceCompat.beginSection("RV Prefetch");
            if (!this.mRecyclerViews.isEmpty()) {
                int size = this.mRecyclerViews.size();
                long j8 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    RecyclerView recyclerView = this.mRecyclerViews.get(i8);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j8 = Math.max(recyclerView.getDrawingTime(), j8);
                    }
                }
                if (j8 != 0) {
                    prefetch(TimeUnit.MILLISECONDS.toNanos(j8) + this.mFrameIntervalNs);
                    this.mPostTimeNs = 0L;
                    TraceCompat.endSection();
                }
            }
        } finally {
            this.mPostTimeNs = 0L;
            TraceCompat.endSection();
        }
    }
}
