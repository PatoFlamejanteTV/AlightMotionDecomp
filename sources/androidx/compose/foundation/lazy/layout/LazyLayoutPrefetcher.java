package androidx.compose.foundation.lazy.layout;

import Q5.I;
import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyLayoutPrefetcher implements RememberObserver, LazyLayoutPrefetchState.Prefetcher, Runnable, Choreographer.FrameCallback {
    public static final Companion Companion = new Companion(null);
    private static long frameIntervalNs;
    private long averagePrecomposeTimeNs;
    private long averagePremeasureTimeNs;
    private final Choreographer choreographer;
    private boolean isActive;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final MutableVector<PrefetchRequest> prefetchRequests;
    private boolean prefetchScheduled;
    private final LazyLayoutPrefetchState prefetchState;
    private final SubcomposeLayoutState subcomposeLayoutState;
    private final View view;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:            if (r6 >= 30.0f) goto L11;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void calculateFrameIntervalIfNeeded(android.view.View r6) {
            /*
                r5 = this;
                long r0 = androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.access$getFrameIntervalNs$cp()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L2c
                android.view.Display r0 = r6.getDisplay()
                boolean r6 = r6.isInEditMode()
                if (r6 != 0) goto L21
                if (r0 == 0) goto L21
                float r6 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r6 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r6
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.access$setFrameIntervalNs$cp(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher.Companion.calculateFrameIntervalIfNeeded(android.view.View):void");
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes.dex */
    private static final class PrefetchRequest implements LazyLayoutPrefetchState.PrefetchHandle {
        private boolean canceled;
        private final long constraints;
        private final int index;
        private boolean measured;
        private SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle;

        public /* synthetic */ PrefetchRequest(int i8, long j8, AbstractC3284p abstractC3284p) {
            this(i8, j8);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle
        public void cancel() {
            if (!this.canceled) {
                this.canceled = true;
                SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposeHandle;
                if (precomposedSlotHandle != null) {
                    precomposedSlotHandle.dispose();
                }
                this.precomposeHandle = null;
            }
        }

        public final boolean getCanceled() {
            return this.canceled;
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m736getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final int getIndex() {
            return this.index;
        }

        public final boolean getMeasured() {
            return this.measured;
        }

        public final SubcomposeLayoutState.PrecomposedSlotHandle getPrecomposeHandle() {
            return this.precomposeHandle;
        }

        public final void setCanceled(boolean z8) {
            this.canceled = z8;
        }

        public final void setMeasured(boolean z8) {
            this.measured = z8;
        }

        public final void setPrecomposeHandle(SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle) {
            this.precomposeHandle = precomposedSlotHandle;
        }

        private PrefetchRequest(int i8, long j8) {
            this.index = i8;
            this.constraints = j8;
        }
    }

    public LazyLayoutPrefetcher(LazyLayoutPrefetchState prefetchState, SubcomposeLayoutState subcomposeLayoutState, LazyLayoutItemContentFactory itemContentFactory, View view) {
        AbstractC3292y.i(prefetchState, "prefetchState");
        AbstractC3292y.i(subcomposeLayoutState, "subcomposeLayoutState");
        AbstractC3292y.i(itemContentFactory, "itemContentFactory");
        AbstractC3292y.i(view, "view");
        this.prefetchState = prefetchState;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.itemContentFactory = itemContentFactory;
        this.view = view;
        this.prefetchRequests = new MutableVector<>(new PrefetchRequest[16], 0);
        this.choreographer = Choreographer.getInstance();
        Companion.calculateFrameIntervalIfNeeded(view);
    }

    private final long calculateAverageTime(long j8, long j9) {
        if (j9 != 0) {
            long j10 = 4;
            return (j8 / j10) + ((j9 / j10) * 3);
        }
        return j8;
    }

    private final boolean enoughTimeLeft(long j8, long j9, long j10) {
        return j8 > j9 || j8 + j10 < j9;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j8) {
        if (this.isActive) {
            this.view.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.isActive = false;
        this.prefetchState.setPrefetcher$foundation_release(null);
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.prefetchState.setPrefetcher$foundation_release(this);
        this.isActive = true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.prefetchRequests.isEmpty() && this.prefetchScheduled && this.isActive && this.view.getWindowVisibility() == 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + frameIntervalNs;
            boolean z8 = false;
            while (this.prefetchRequests.isNotEmpty() && !z8) {
                PrefetchRequest prefetchRequest = this.prefetchRequests.getContent()[0];
                LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.itemContentFactory.getItemProvider().invoke();
                if (!prefetchRequest.getCanceled()) {
                    int itemCount = lazyLayoutItemProvider.getItemCount();
                    int index = prefetchRequest.getIndex();
                    if (index >= 0 && index < itemCount) {
                        if (prefetchRequest.getPrecomposeHandle() == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long nanoTime = System.nanoTime();
                                if (enoughTimeLeft(nanoTime, nanos, this.averagePrecomposeTimeNs)) {
                                    Object key = lazyLayoutItemProvider.getKey(prefetchRequest.getIndex());
                                    prefetchRequest.setPrecomposeHandle(this.subcomposeLayoutState.precompose(key, this.itemContentFactory.getContent(prefetchRequest.getIndex(), key, lazyLayoutItemProvider.getContentType(prefetchRequest.getIndex()))));
                                    this.averagePrecomposeTimeNs = calculateAverageTime(System.nanoTime() - nanoTime, this.averagePrecomposeTimeNs);
                                } else {
                                    z8 = true;
                                }
                                I i8 = I.f8786a;
                                Trace.endSection();
                            } finally {
                            }
                        } else if (!prefetchRequest.getMeasured()) {
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long nanoTime2 = System.nanoTime();
                                if (enoughTimeLeft(nanoTime2, nanos, this.averagePremeasureTimeNs)) {
                                    SubcomposeLayoutState.PrecomposedSlotHandle precomposeHandle = prefetchRequest.getPrecomposeHandle();
                                    AbstractC3292y.f(precomposeHandle);
                                    int placeablesCount = precomposeHandle.getPlaceablesCount();
                                    for (int i9 = 0; i9 < placeablesCount; i9++) {
                                        precomposeHandle.mo4124premeasure0kLqBqw(i9, prefetchRequest.m736getConstraintsmsEJaDk());
                                    }
                                    this.averagePremeasureTimeNs = calculateAverageTime(System.nanoTime() - nanoTime2, this.averagePremeasureTimeNs);
                                    this.prefetchRequests.removeAt(0);
                                } else {
                                    I i10 = I.f8786a;
                                    z8 = true;
                                }
                                Trace.endSection();
                            } finally {
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
                this.prefetchRequests.removeAt(0);
            }
            if (z8) {
                this.choreographer.postFrameCallback(this);
                return;
            } else {
                this.prefetchScheduled = false;
                return;
            }
        }
        this.prefetchScheduled = false;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.Prefetcher
    /* renamed from: schedulePrefetch-0kLqBqw */
    public LazyLayoutPrefetchState.PrefetchHandle mo735schedulePrefetch0kLqBqw(int i8, long j8) {
        PrefetchRequest prefetchRequest = new PrefetchRequest(i8, j8, null);
        this.prefetchRequests.add(prefetchRequest);
        if (!this.prefetchScheduled) {
            this.prefetchScheduled = true;
            this.view.post(this);
        }
        return prefetchRequest;
    }
}
