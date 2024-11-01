package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class LazyListItemPlacementAnimator {
    private int firstVisibleIndex;
    private final Set<Object> activeKeys = new LinkedHashSet();
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.Empty;
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();
    private final List<LazyListMeasuredItem> movingInFromStartBound = new ArrayList();
    private final List<LazyListMeasuredItem> movingInFromEndBound = new ArrayList();
    private final List<LazyListMeasuredItem> movingAwayToStartBound = new ArrayList();
    private final List<LazyListMeasuredItem> movingAwayToEndBound = new ArrayList();

    private final void forEachNode(LazyListMeasuredItem lazyListMeasuredItem, InterfaceC2072n interfaceC2072n) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i8 = 0; i8 < placeablesCount; i8++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyListMeasuredItem.getParentData(i8));
            if (node != null) {
                interfaceC2072n.invoke(Integer.valueOf(i8), node);
            }
        }
    }

    private final boolean getHasAnimations(LazyListMeasuredItem lazyListMeasuredItem) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i8 = 0; i8 < placeablesCount; i8++) {
            if (getNode(lazyListMeasuredItem.getParentData(i8)) != null) {
                return true;
            }
        }
        return false;
    }

    private final LazyLayoutAnimateItemModifierNode getNode(Object obj) {
        if (obj instanceof LazyLayoutAnimateItemModifierNode) {
            return (LazyLayoutAnimateItemModifierNode) obj;
        }
        return null;
    }

    private final void initializeNode(LazyListMeasuredItem lazyListMeasuredItem, int i8) {
        long m5275copyiSbpLlY$default;
        long m685getOffsetBjo55l4 = lazyListMeasuredItem.m685getOffsetBjo55l4(0);
        if (lazyListMeasuredItem.isVertical()) {
            m5275copyiSbpLlY$default = IntOffset.m5275copyiSbpLlY$default(m685getOffsetBjo55l4, 0, i8, 1, null);
        } else {
            m5275copyiSbpLlY$default = IntOffset.m5275copyiSbpLlY$default(m685getOffsetBjo55l4, i8, 0, 2, null);
        }
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i9 = 0; i9 < placeablesCount; i9++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyListMeasuredItem.getParentData(i9));
            if (node != null) {
                long m685getOffsetBjo55l42 = lazyListMeasuredItem.m685getOffsetBjo55l4(i9);
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m685getOffsetBjo55l42) - IntOffset.m5279getXimpl(m685getOffsetBjo55l4), IntOffset.m5280getYimpl(m685getOffsetBjo55l42) - IntOffset.m5280getYimpl(m685getOffsetBjo55l4));
                node.m722setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m5275copyiSbpLlY$default) + IntOffset.m5279getXimpl(IntOffset), IntOffset.m5280getYimpl(m5275copyiSbpLlY$default) + IntOffset.m5280getYimpl(IntOffset)));
            }
        }
    }

    private final void startAnimationsIfNeeded(LazyListMeasuredItem lazyListMeasuredItem) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i8 = 0; i8 < placeablesCount; i8++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyListMeasuredItem.getParentData(i8));
            if (node != null) {
                long m685getOffsetBjo55l4 = lazyListMeasuredItem.m685getOffsetBjo55l4(i8);
                long m721getRawOffsetnOccac = node.m721getRawOffsetnOccac();
                if (!IntOffset.m5278equalsimpl0(m721getRawOffsetnOccac, LazyLayoutAnimateItemModifierNode.Companion.m723getNotInitializednOccac()) && !IntOffset.m5278equalsimpl0(m721getRawOffsetnOccac, m685getOffsetBjo55l4)) {
                    node.m719animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m685getOffsetBjo55l4) - IntOffset.m5279getXimpl(m721getRawOffsetnOccac), IntOffset.m5280getYimpl(m685getOffsetBjo55l4) - IntOffset.m5280getYimpl(m721getRawOffsetnOccac)));
                }
                node.m722setRawOffsetgyyYBs(m685getOffsetBjo55l4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ec, code lost:            r18.activeKeys.remove(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01be, code lost:            r18.activeKeys.remove(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0202, code lost:            r1 = r18.movingAwayToStartBound;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0208, code lost:            if (r1.size() <= 1) goto L91;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020a, code lost:            R5.AbstractC1435t.B(r1, new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2(r18));     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:            r18.firstVisibleIndex = r8;        r8 = r18.keyIndexMap;        r18.keyIndexMap = r23.getKeyIndexMap();     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0212, code lost:            r1 = r18.movingAwayToStartBound;        r2 = r1.size();        r4 = 0;        r5 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021a, code lost:            if (r4 >= r2) goto L131;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021c, code lost:            r6 = r1.get(r4);        r5 = r5 + r6.getSize();        r6.position(0 - r5, r20, r21);        r22.add(r6);        startAnimationsIfNeeded(r6);        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x023b, code lost:            r1 = r18.movingAwayToEndBound;     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0247, code lost:            if (r1.size() <= 1) goto L97;     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0249, code lost:            R5.AbstractC1435t.B(r1, new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2(r18));     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0251, code lost:            r1 = r18.movingAwayToEndBound;        r2 = r1.size();        r3 = 0;        r16 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025a, code lost:            if (r3 >= r2) goto L132;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x025c, code lost:            r4 = r1.get(r3);        r5 = r9 + r16;        r16 = r16 + r4.getSize();        r4.position(r5, r20, r21);        r22.add(r4);        startAnimationsIfNeeded(r4);        r3 = r3 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:            if (r24 == false) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0276, code lost:            r18.movingInFromStartBound.clear();        r18.movingInFromEndBound.clear();        r18.movingAwayToStartBound.clear();        r18.movingAwayToEndBound.clear();        r18.movingAwayKeys.clear();     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028f, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0060, code lost:            r10 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(r19, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0058, code lost:            r9 = r20;     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0049, code lost:            r8 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:            r9 = r21;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:            if (r24 == false) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:            r10 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, r19);     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:            r18.movingAwayKeys.addAll(r18.activeKeys);        r1 = r22.size();        r12 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:            if (r12 >= r1) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:            r14 = r4.get(r12);        r18.movingAwayKeys.remove(r14.getKey());     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:            if (getHasAnimations(r14) == false) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:            if (r18.activeKeys.contains(r14.getKey()) != false) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:            r18.activeKeys.add(r14.getKey());        r7 = r8.getIndex(r14.getKey());     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:            if (r7 == (-1)) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00af, code lost:            if (r14.getIndex() == r7) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:            if (r7 >= r6) goto L37;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:            r18.movingInFromStartBound.add(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:            r19 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0138, code lost:            r12 = r12 + 1;        r1 = r19;        r4 = r22;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:            r18.movingInFromEndBound.add(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:            r15 = r14.m685getOffsetBjo55l4(0);     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:            if (r14.isVertical() == false) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:            r13 = androidx.compose.ui.unit.IntOffset.m5280getYimpl(r15);     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:            initializeNode(r14, r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:            r13 = androidx.compose.ui.unit.IntOffset.m5279getXimpl(r15);     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:            r13 = r14.getPlaceablesCount();        r15 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:            if (r15 >= r13) goto L108;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:            r7 = getNode(r14.getParentData(r15));        r19 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:            if (r7 == null) goto L110;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:            if (androidx.compose.ui.unit.IntOffset.m5278equalsimpl0(r7.m721getRawOffsetnOccac(), androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode.Companion.m723getNotInitializednOccac()) != false) goto L111;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:            r1 = r7.m721getRawOffsetnOccac();        r7.m722setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m5279getXimpl(r1) + androidx.compose.ui.unit.IntOffset.m5279getXimpl(r10), androidx.compose.ui.unit.IntOffset.m5280getYimpl(r1) + androidx.compose.ui.unit.IntOffset.m5280getYimpl(r10)));     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011b, code lost:            r15 = r15 + 1;        r1 = r19;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0127, code lost:            r19 = r1;        startAnimationsIfNeeded(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:            r19 = r1;        r18.activeKeys.remove(r14.getKey());     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:            r1 = r18.movingInFromStartBound;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:            if (r1.size() <= 1) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:            R5.AbstractC1435t.B(r1, new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1(r8));     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:            r1 = r18.movingInFromStartBound;        r2 = r1.size();        r4 = 0;        r6 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015e, code lost:            if (r4 >= r2) goto L112;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0160, code lost:            r7 = r1.get(r4);        r6 = r6 + r7.getSize();        initializeNode(r7, 0 - r6);        startAnimationsIfNeeded(r7);        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:            r1 = r18.movingInFromEndBound;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017c, code lost:            if (r1.size() <= 1) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017e, code lost:            R5.AbstractC1435t.B(r1, new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1(r8));     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:            r1 = r18.movingInFromEndBound;        r2 = r1.size();        r4 = 0;        r6 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018e, code lost:            if (r4 >= r2) goto L113;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0190, code lost:            r7 = r1.get(r4);        r10 = r9 + r6;        r6 = r6 + r7.getSize();        initializeNode(r7, r10);        startAnimationsIfNeeded(r7);        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a6, code lost:            r1 = r18.movingAwayKeys.iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b0, code lost:            if (r1.hasNext() == false) goto L114;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b2, code lost:            r2 = r1.next();        r4 = r18.keyIndexMap.getIndex(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01bc, code lost:            if (r4 != (-1)) goto L115;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c4, code lost:            r6 = r23.getAndMeasure(r4);        r7 = r6.getPlaceablesCount();        r10 = 0;        r11 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ce, code lost:            if (r10 >= r7) goto L127;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d0, code lost:            r12 = getNode(r6.getParentData(r10));     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d8, code lost:            if (r12 == null) goto L129;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01de, code lost:            if (r12.isAnimationInProgress() != true) goto L130;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:            r6 = r18.firstVisibleIndex;        r8 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) R5.AbstractC1435t.o0(r22);     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e0, code lost:            r11 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e1, code lost:            r10 = r10 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e4, code lost:            if (r11 != false) goto L116;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ea, code lost:            if (r4 != r8.getIndex(r2)) goto L117;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:            if (r8 == null) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f4, code lost:            if (r4 >= r18.firstVisibleIndex) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fc, code lost:            r18.movingAwayToEndBound.add(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f6, code lost:            r18.movingAwayToStartBound.add(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:            r8 = r8.getIndex();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasured(int r19, int r20, int r21, java.util.List<androidx.compose.foundation.lazy.LazyListMeasuredItem> r22, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.LazyListMeasuredItemProvider, boolean):void");
    }

    public final void reset() {
        this.activeKeys.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.Empty;
        this.firstVisibleIndex = -1;
    }
}
