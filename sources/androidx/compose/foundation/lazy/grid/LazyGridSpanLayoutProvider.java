package androidx.compose.foundation.lazy.grid;

import R5.AbstractC1435t;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyGridSpanLayoutProvider {
    private final ArrayList<Bucket> buckets;
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;
    private final LazyGridIntervalContent gridContent;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private int lastLineStartKnownSpan;
    private List<GridItemSpan> previousDefaultSpans;
    private int slotsPerLine;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int maxCurrentLineSpan;
        private static int maxLineSpan;

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        @Override // androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
        public int getMaxLineSpan() {
            return maxLineSpan;
        }

        public void setMaxCurrentLineSpan(int i8) {
            maxCurrentLineSpan = i8;
        }

        public void setMaxLineSpan(int i8) {
            maxLineSpan = i8;
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class LineConfiguration {
        public static final int $stable = 8;
        private final int firstItemIndex;
        private final List<GridItemSpan> spans;

        public LineConfiguration(int i8, List<GridItemSpan> spans) {
            AbstractC3292y.i(spans, "spans");
            this.firstItemIndex = i8;
            this.spans = spans;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<GridItemSpan> getSpans() {
            return this.spans;
        }
    }

    public LazyGridSpanLayoutProvider(LazyGridIntervalContent gridContent) {
        AbstractC3292y.i(gridContent, "gridContent");
        this.gridContent = gridContent;
        ArrayList<Bucket> arrayList = new ArrayList<>();
        int i8 = 0;
        arrayList.add(new Bucket(i8, i8, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = AbstractC1435t.m();
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((getTotalSize() * 1.0d) / this.slotsPerLine)) + 1;
    }

    private final List<GridItemSpan> getDefaultSpans(int i8) {
        if (i8 == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(GridItemSpan.m690boximpl(LazyGridSpanKt.GridItemSpan(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    private final void invalidateCache() {
        this.buckets.clear();
        int i8 = 0;
        this.buckets.add(new Bucket(i8, i8, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:            if (r7 < r6) goto L22;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.LineConfiguration getLineConfiguration(int r11) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.getLineConfiguration(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$LineConfiguration");
    }

    public final int getLineIndexOfItem(int i8) {
        int i9;
        int i10 = 0;
        if (getTotalSize() <= 0) {
            return 0;
        }
        if (i8 < getTotalSize()) {
            if (!this.gridContent.getHasCustomSpans$foundation_release()) {
                return i8 / this.slotsPerLine;
            }
            int k8 = AbstractC1435t.k(this.buckets, 0, 0, new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(i8), 3, null);
            int i11 = 2;
            if (k8 < 0) {
                k8 = (-k8) - 2;
            }
            int bucketSize = getBucketSize() * k8;
            int firstItemIndex = this.buckets.get(k8).getFirstItemIndex();
            if (firstItemIndex <= i8) {
                int i12 = 0;
                while (firstItemIndex < i8) {
                    int i13 = firstItemIndex + 1;
                    int spanOf = spanOf(firstItemIndex, this.slotsPerLine - i12);
                    i12 += spanOf;
                    int i14 = this.slotsPerLine;
                    if (i12 >= i14) {
                        if (i12 == i14) {
                            bucketSize++;
                            i12 = 0;
                        } else {
                            bucketSize++;
                            i12 = spanOf;
                        }
                    }
                    if (bucketSize % getBucketSize() == 0 && bucketSize / getBucketSize() >= this.buckets.size()) {
                        ArrayList<Bucket> arrayList = this.buckets;
                        if (i12 > 0) {
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        arrayList.add(new Bucket(i13 - i9, i10, i11, null));
                    }
                    firstItemIndex = i13;
                }
                if (i12 + spanOf(i8, this.slotsPerLine - i12) > this.slotsPerLine) {
                    return bucketSize + 1;
                }
                return bucketSize;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int getTotalSize() {
        return this.gridContent.getIntervals().getSize();
    }

    public final void setSlotsPerLine(int i8) {
        if (i8 != this.slotsPerLine) {
            this.slotsPerLine = i8;
            invalidateCache();
        }
    }

    public final int spanOf(int i8, int i9) {
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i9);
        lazyGridItemSpanScopeImpl.setMaxLineSpan(this.slotsPerLine);
        IntervalList.Interval<LazyGridInterval> interval = this.gridContent.getIntervals().get(i8);
        return GridItemSpan.m694getCurrentLineSpanimpl(((GridItemSpan) interval.getValue().getSpan().invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i8 - interval.getStartIndex()))).m697unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Bucket {
        private final int firstItemIndex;
        private final int firstItemKnownSpan;

        public Bucket(int i8, int i9) {
            this.firstItemIndex = i8;
            this.firstItemKnownSpan = i9;
        }

        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ Bucket(int i8, int i9, int i10, AbstractC3284p abstractC3284p) {
            this(i8, (i10 & 2) != 0 ? 0 : i9);
        }
    }
}
