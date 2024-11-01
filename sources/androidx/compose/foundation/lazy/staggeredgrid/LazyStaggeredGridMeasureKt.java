package androidx.compose.foundation.lazy.staggeredgrid;

import Q5.I;
import R5.AbstractC1435t;
import R5.C1427k;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import e6.AbstractC2829a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    @ExperimentalFoundationApi
    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1 function1, Function1 function12) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size = pinnedItems.size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = pinnedItems.get(i8).intValue();
            if (((Boolean) function12.invoke(Integer.valueOf(intValue))).booleanValue()) {
                long m755getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m755getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                LazyStaggeredGridMeasuredItem m763getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m763getAndMeasurejy6DScQ(intValue, m755getSpanRangelOCCd4c);
                function1.invoke(m763getAndMeasurejy6DScQ);
                arrayList.add(m763getAndMeasurejy6DScQ);
            }
        }
        if (arrayList == null) {
            return AbstractC1435t.m();
        }
        return arrayList;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, C1427k[] c1427kArr, int[] iArr, int i8) {
        int i9;
        int i10 = 0;
        for (C1427k c1427k : c1427kArr) {
            i10 += c1427k.size();
        }
        ArrayList arrayList = new ArrayList(i10);
        while (true) {
            for (C1427k c1427k2 : c1427kArr) {
                if (!c1427k2.isEmpty()) {
                    int length = c1427kArr.length;
                    int i11 = -1;
                    int i12 = Integer.MAX_VALUE;
                    for (int i13 = 0; i13 < length; i13++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) c1427kArr[i13].n();
                        if (lazyStaggeredGridMeasuredItem != null) {
                            i9 = lazyStaggeredGridMeasuredItem.getIndex();
                        } else {
                            i9 = Integer.MAX_VALUE;
                        }
                        if (i12 > i9) {
                            i11 = i13;
                            i12 = i9;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) c1427kArr[i11].y();
                    if (lazyStaggeredGridMeasuredItem2.getLane() == i11) {
                        long m768constructorimpl = SpanRange.m768constructorimpl(lazyStaggeredGridMeasuredItem2.getLane(), lazyStaggeredGridMeasuredItem2.getSpan());
                        int m758maxInRangejy6DScQ = m758maxInRangejy6DScQ(iArr, m768constructorimpl);
                        int i14 = lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i11];
                        if (lazyStaggeredGridMeasuredItem2.getPlaceablesCount() != 0) {
                            lazyStaggeredGridMeasuredItem2.position(m758maxInRangejy6DScQ, i14, i8);
                            arrayList.add(lazyStaggeredGridMeasuredItem2);
                            int i15 = (int) (m768constructorimpl & 4294967295L);
                            for (int i16 = (int) (m768constructorimpl >> 32); i16 < i15; i16++) {
                                iArr[i16] = lazyStaggeredGridMeasuredItem2.getSizeWithSpacings() + m758maxInRangejy6DScQ;
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final void debugLog(Function0 function0) {
    }

    private static final String debugRender(C1427k[] c1427kArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i8) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i9 = length - 1;
            while (true) {
                if (iArr[length] < i8 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i9 >= 0) {
                length = i9;
            } else {
                return;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i8, int i9) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i8, i9);
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m757forEachnIS5qE8(long j8, Function1 function1) {
        int i8 = (int) (j8 & 4294967295L);
        for (int i9 = (int) (j8 >> 32); i9 < i8; i9++) {
            function1.invoke(Integer.valueOf(i9));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i8 = -1;
        int i9 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (i9 < i11) {
                i8 = i10;
                i9 = i11;
            }
        }
        return i8;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1 function1) {
        int length = tArr.length;
        int i8 = -1;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < length; i10++) {
            int intValue = ((Number) function1.invoke(tArr[i10])).intValue();
            if (i9 > intValue) {
                i8 = i10;
                i9 = intValue;
            }
        }
        return i8;
    }

    public static final int indexOfMinValue(int[] iArr, int i8) {
        AbstractC3292y.i(iArr, "<this>");
        int length = iArr.length;
        int i9 = -1;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i8 + 1;
            int i13 = iArr[i11];
            if (i12 <= i13 && i13 < i10) {
                i9 = i11;
                i10 = i13;
            }
        }
        return i9;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i8);
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m758maxInRangejy6DScQ(int[] iArr, long j8) {
        int i8 = (int) (j8 & 4294967295L);
        int i9 = Integer.MIN_VALUE;
        for (int i10 = (int) (j8 >> 32); i10 < i8; i10++) {
            i9 = Math.max(i9, iArr[i10]);
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0542, code lost:            if (r13[r6] > r4) goto L241;     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x02d9, code lost:            r2 = indexOfMinValue$default(r8, 0, 1, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x02e4, code lost:            if (r2 == indexOfMaxValue(r28)) goto L142;     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x02e6, code lost:            r0 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x02e7, code lost:            r4 = r28[r2];     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x02ea, code lost:            if (r4 != (-1)) goto L145;     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x02ec, code lost:            r9 = r37;        r4 = r12;     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x02f2, code lost:            r4 = findPreviousItemIndex(r9, r4, r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x02f6, code lost:            if (r4 >= 0) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x033c, code lost:            r38 = r0;        r5 = r27;        r13 = r28;        r40 = r14;        r24 = r15;        r14 = r9.m755getSpanRangelOCCd4c(r37.getItemProvider(), r4, r2);        r0 = r37.getLaneInfo();        r23 = r3;        r3 = (int) (r14 & 4294967295L);        r27 = r10;        r28 = r11;        r2 = (int) (r14 >> 32);        r10 = r3 - r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0368, code lost:            if (r10 == 1) goto L167;     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x036a, code lost:            r11 = -2;     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x036d, code lost:            r0.setLane(r4, r11);        r0 = r37.getMeasuredItemProvider().m763getAndMeasurejy6DScQ(r4, r14);        r11 = m758maxInRangejy6DScQ(r8, r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x037d, code lost:            if (r10 == 1) goto L171;     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x037f, code lost:            r10 = r37.getLaneInfo().getGaps(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0389, code lost:            r14 = r2;        r2 = r38;     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x038c, code lost:            if (r14 >= r3) goto L420;     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0390, code lost:            if (r8[r14] == r11) goto L177;     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0392, code lost:            r2 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0393, code lost:            r7[r14].c(r0);        r13[r14] = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x039a, code lost:            if (r10 != null) goto L180;     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x039c, code lost:            r15 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x03a0, code lost:            r8[r14] = (r11 + r0.getSizeWithSpacings()) + r15;        r14 = r14 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x039e, code lost:            r15 = r10[r14];     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0388, code lost:            r10 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x036c, code lost:            r11 = r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x02f8, code lost:            r13 = r28;     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x02fa, code lost:            if (r0 != false) goto L154;     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0300, code lost:            if (measure$lambda$38$misalignedStart(r13, r9, r8, r2) == false) goto L153;     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0303, code lost:            r5 = r27;     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0330, code lost:            r23 = r3;        r27 = r10;        r28 = r11;        r40 = r14;        r24 = r15;     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0306, code lost:            if (r41 == false) goto L153;     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0308, code lost:            r37.getLaneInfo().reset();        r0 = r13.length;        r1 = new int[r0];        r3 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0313, code lost:            if (r3 >= r0) goto L423;     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0315, code lost:            r1[r3] = -1;        r3 = r3 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x031b, code lost:            r0 = r8.length;        r3 = new int[r0];        r4 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x031f, code lost:            if (r4 >= r0) goto L424;     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0321, code lost:            r3[r4] = r8[r2];        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x032f, code lost:            return measure(r9, r27, r1, r3, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x02f0, code lost:            r9 = r37;     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x062a  */
    @androidx.compose.foundation.ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r37, int r38, int[] r39, int[] r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 2062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = iArr[i8];
            if (iArr2[i8] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i9 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i8) {
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i9], i9) == -1 && iArr2[i9] != iArr2[i8]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i10], i10) != -1 && iArr2[i10] >= iArr2[i8]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        if (lane == 0 || lane == -1 || lane == -2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @ExperimentalFoundationApi
    /* renamed from: measureStaggeredGrid-dSVRQoE, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m759measureStaggeredGriddSVRQoE(LazyLayoutMeasureScope measureStaggeredGrid, LazyStaggeredGridState state, List<Integer> pinnedItems, LazyStaggeredGridItemProvider itemProvider, LazyStaggeredGridSlots resolvedSlots, long j8, boolean z8, boolean z9, long j9, int i8, int i9, int i10, int i11) {
        ?? r12;
        int i12;
        int m758maxInRangejy6DScQ;
        int i13;
        AbstractC3292y.i(measureStaggeredGrid, "$this$measureStaggeredGrid");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(pinnedItems, "pinnedItems");
        AbstractC3292y.i(itemProvider, "itemProvider");
        AbstractC3292y.i(resolvedSlots, "resolvedSlots");
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(state, pinnedItems, itemProvider, resolvedSlots, j8, z8, measureStaggeredGrid, i8, j9, i10, i11, z9, i9, null);
        T t8 = new T();
        T t9 = new T();
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release = state.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(itemProvider, state.getScrollPosition$foundation_release().getIndices());
                int[] offsets = state.getScrollPosition$foundation_release().getOffsets();
                if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length == lazyStaggeredGridMeasureContext.getLaneCount()) {
                    r12 = 1;
                } else {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr = new int[laneCount];
                    int i14 = 0;
                    while (i14 < laneCount) {
                        if (i14 >= updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (m758maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation_release[i14]) == -1) {
                            if (i14 == 0) {
                                m758maxInRangejy6DScQ = 0;
                            } else {
                                i12 = 1;
                                m758maxInRangejy6DScQ = m758maxInRangejy6DScQ(iArr, SpanRange.m768constructorimpl(0, i14)) + 1;
                                iArr[i14] = m758maxInRangejy6DScQ;
                                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i14], i14);
                                i14 += i12;
                            }
                        }
                        i12 = 1;
                        iArr[i14] = m758maxInRangejy6DScQ;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i14], i14);
                        i14 += i12;
                    }
                    r12 = 1;
                    updateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
                }
                t8.f34573a = updateScrollPositionIfTheFirstItemWasMoved$foundation_release;
                if (offsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
                    int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
                    int[] iArr2 = new int[laneCount2];
                    for (int i15 = 0; i15 < laneCount2; i15 += r12) {
                        if (i15 < offsets.length) {
                            i13 = offsets[i15];
                        } else if (i15 == 0) {
                            i13 = 0;
                        } else {
                            i13 = iArr2[i15 - 1];
                        }
                        iArr2[i15] = i13;
                    }
                    offsets = iArr2;
                }
                t9.f34573a = offsets;
                I i16 = I.f8786a;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                return measure(lazyStaggeredGridMeasureContext, AbstractC2829a.d(state.getScrollToBeConsumed$foundation_release()), (int[]) t8.f34573a, (int[]) t9.f34573a, r12);
            } catch (Throwable th) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                throw th;
            }
        } catch (Throwable th2) {
            createNonObservableSnapshot.dispose();
            throw th2;
        }
    }

    private static final void offsetBy(int[] iArr, int i8) {
        int length = iArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = iArr[i9] + i8;
        }
    }

    private static final int[] transform(int[] iArr, Function1 function1) {
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = ((Number) function1.invoke(Integer.valueOf(iArr[i8]))).intValue();
        }
        return iArr;
    }

    @ExperimentalFoundationApi
    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1 function1) {
        return (T) function1.invoke(lazyLayoutMeasureScope);
    }
}
