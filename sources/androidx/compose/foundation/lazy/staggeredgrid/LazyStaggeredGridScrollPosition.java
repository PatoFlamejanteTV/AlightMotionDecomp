package androidx.compose.foundation.lazy.staggeredgrid;

import Q5.I;
import R5.AbstractC1428l;
import R5.N;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.Snapshot;
import c6.InterfaceC2072n;
import i6.i;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyStaggeredGridScrollPosition implements SnapshotMutationPolicy<int[]> {
    private final InterfaceC2072n fillIndices;
    private boolean hadFirstNotEmptyLayout;
    private final MutableState indices$delegate;
    private Object lastKnownFirstItemKey;
    private final LazyLayoutNearestRangeState nearestRangeState;
    private final MutableState offsets$delegate;

    public LazyStaggeredGridScrollPosition(int[] initialIndices, int[] initialOffsets, InterfaceC2072n fillIndices) {
        int i8;
        AbstractC3292y.i(initialIndices, "initialIndices");
        AbstractC3292y.i(initialOffsets, "initialOffsets");
        AbstractC3292y.i(fillIndices, "fillIndices");
        this.fillIndices = fillIndices;
        this.indices$delegate = SnapshotStateKt.mutableStateOf(initialIndices, this);
        this.offsets$delegate = SnapshotStateKt.mutableStateOf(initialOffsets, this);
        Integer E02 = AbstractC1428l.E0(initialIndices);
        if (E02 != null) {
            i8 = E02.intValue();
        } else {
            i8 = 0;
        }
        this.nearestRangeState = new LazyLayoutNearestRangeState(i8, 90, 200);
    }

    private final void setIndices(int[] iArr) {
        this.indices$delegate.setValue(iArr);
    }

    private final void setOffsets(int[] iArr) {
        this.offsets$delegate.setValue(iArr);
    }

    private final void update(int[] iArr, int[] iArr2) {
        setIndices(iArr);
        setOffsets(iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] getIndices() {
        return (int[]) this.indices$delegate.getValue();
    }

    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] getOffsets() {
        return (int[]) this.offsets$delegate.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, int[]] */
    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ int[] merge(int[] iArr, int[] iArr2, int[] iArr3) {
        return m.a(this, iArr, iArr2, iArr3);
    }

    public final void requestPosition(int i8, int i9) {
        int[] iArr = (int[]) this.fillIndices.invoke(Integer.valueOf(i8), Integer.valueOf(getIndices().length));
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = i9;
        }
        update(iArr, iArr2);
        this.nearestRangeState.update(i8);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(LazyStaggeredGridMeasureResult measureResult) {
        Object obj;
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        int i8;
        int i9;
        AbstractC3292y.i(measureResult, "measureResult");
        int[] firstVisibleItemIndices = measureResult.getFirstVisibleItemIndices();
        if (firstVisibleItemIndices.length != 0) {
            int i10 = 0;
            int i11 = firstVisibleItemIndices[0];
            int g02 = AbstractC1428l.g0(firstVisibleItemIndices);
            if (g02 != 0) {
                if (i11 == -1) {
                    i8 = Integer.MAX_VALUE;
                } else {
                    i8 = i11;
                }
                N it = new i(1, g02).iterator();
                while (it.hasNext()) {
                    int i12 = firstVisibleItemIndices[it.nextInt()];
                    if (i12 == -1) {
                        i9 = Integer.MAX_VALUE;
                    } else {
                        i9 = i12;
                    }
                    if (i8 > i9) {
                        i11 = i12;
                        i8 = i9;
                    }
                }
            }
            if (i11 == Integer.MAX_VALUE) {
                i11 = 0;
            }
            List<LazyStaggeredGridItemInfo> visibleItemsInfo = measureResult.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            while (true) {
                obj = null;
                if (i10 < size) {
                    lazyStaggeredGridItemInfo = visibleItemsInfo.get(i10);
                    if (lazyStaggeredGridItemInfo.getIndex() == i11) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    lazyStaggeredGridItemInfo = null;
                    break;
                }
            }
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2 = lazyStaggeredGridItemInfo;
            if (lazyStaggeredGridItemInfo2 != null) {
                obj = lazyStaggeredGridItemInfo2.getKey();
            }
            this.lastKnownFirstItemKey = obj;
            this.nearestRangeState.update(i11);
            if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
                this.hadFirstNotEmptyLayout = true;
                Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
                try {
                    Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                    try {
                        update(measureResult.getFirstVisibleItemIndices(), measureResult.getFirstVisibleItemScrollOffsets());
                        I i13 = I.f8786a;
                        return;
                    } finally {
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    }
                } finally {
                    createNonObservableSnapshot.dispose();
                }
            }
            return;
        }
        throw new NoSuchElementException();
    }

    @ExperimentalFoundationApi
    public final int[] updateScrollPositionIfTheFirstItemWasMoved(LazyLayoutItemProvider itemProvider, int[] indices) {
        AbstractC3292y.i(itemProvider, "itemProvider");
        AbstractC3292y.i(indices, "indices");
        Object obj = this.lastKnownFirstItemKey;
        int i8 = 0;
        Integer j02 = AbstractC1428l.j0(indices, 0);
        if (j02 != null) {
            i8 = j02.intValue();
        }
        int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(itemProvider, obj, i8);
        if (!AbstractC1428l.U(indices, findIndexByKey)) {
            this.nearestRangeState.update(findIndexByKey);
            int[] iArr = (int[]) this.fillIndices.invoke(Integer.valueOf(findIndexByKey), Integer.valueOf(indices.length));
            setIndices(iArr);
            return iArr;
        }
        return indices;
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(int[] a9, int[] b9) {
        AbstractC3292y.i(a9, "a");
        AbstractC3292y.i(b9, "b");
        return Arrays.equals(a9, b9);
    }
}
