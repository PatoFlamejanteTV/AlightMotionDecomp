package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class LazyGridItemPlacementAnimator {
    private int firstVisibleIndex;
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.Empty;
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();
    private final List<LazyGridMeasuredItem> movingInFromStartBound = new ArrayList();
    private final List<LazyGridMeasuredItem> movingInFromEndBound = new ArrayList();
    private final List<LazyGridMeasuredItem> movingAwayToStartBound = new ArrayList();
    private final List<LazyGridMeasuredItem> movingAwayToEndBound = new ArrayList();

    private final void forEachNode(LazyGridMeasuredItem lazyGridMeasuredItem, Function1 function1) {
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i8 = 0; i8 < placeablesCount; i8++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyGridMeasuredItem.getParentData(i8));
            if (node != null) {
                function1.invoke(node);
            }
        }
    }

    private final boolean getHasAnimations(LazyGridMeasuredItem lazyGridMeasuredItem) {
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i8 = 0; i8 < placeablesCount; i8++) {
            if (getNode(lazyGridMeasuredItem.getParentData(i8)) != null) {
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

    private final void initializeNode(LazyGridMeasuredItem lazyGridMeasuredItem, int i8) {
        long m5275copyiSbpLlY$default;
        long mo707getOffsetnOccac = lazyGridMeasuredItem.mo707getOffsetnOccac();
        if (lazyGridMeasuredItem.isVertical()) {
            m5275copyiSbpLlY$default = IntOffset.m5275copyiSbpLlY$default(mo707getOffsetnOccac, 0, i8, 1, null);
        } else {
            m5275copyiSbpLlY$default = IntOffset.m5275copyiSbpLlY$default(mo707getOffsetnOccac, i8, 0, 2, null);
        }
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i9 = 0; i9 < placeablesCount; i9++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyGridMeasuredItem.getParentData(i9));
            if (node != null) {
                long mo707getOffsetnOccac2 = lazyGridMeasuredItem.mo707getOffsetnOccac();
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(mo707getOffsetnOccac2) - IntOffset.m5279getXimpl(mo707getOffsetnOccac), IntOffset.m5280getYimpl(mo707getOffsetnOccac2) - IntOffset.m5280getYimpl(mo707getOffsetnOccac));
                node.m722setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(m5275copyiSbpLlY$default) + IntOffset.m5279getXimpl(IntOffset), IntOffset.m5280getYimpl(m5275copyiSbpLlY$default) + IntOffset.m5280getYimpl(IntOffset)));
            }
        }
    }

    private final void startAnimationsIfNeeded(LazyGridMeasuredItem lazyGridMeasuredItem) {
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i8 = 0; i8 < placeablesCount; i8++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyGridMeasuredItem.getParentData(i8));
            if (node != null) {
                long mo707getOffsetnOccac = lazyGridMeasuredItem.mo707getOffsetnOccac();
                long m721getRawOffsetnOccac = node.m721getRawOffsetnOccac();
                if (!IntOffset.m5278equalsimpl0(m721getRawOffsetnOccac, LazyLayoutAnimateItemModifierNode.Companion.m723getNotInitializednOccac()) && !IntOffset.m5278equalsimpl0(m721getRawOffsetnOccac, mo707getOffsetnOccac)) {
                    node.m719animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m5279getXimpl(mo707getOffsetnOccac) - IntOffset.m5279getXimpl(m721getRawOffsetnOccac), IntOffset.m5280getYimpl(mo707getOffsetnOccac) - IntOffset.m5280getYimpl(m721getRawOffsetnOccac)));
                }
                node.m722setRawOffsetgyyYBs(mo707getOffsetnOccac);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0247, code lost:            r5 = androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider.m713getAndMeasure3p2s80s$default(r34, r12, 0, r5, 2, null);        r6 = r5.getPlaceablesCount();        r7 = 0;        r8 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0258, code lost:            if (r7 >= r6) goto L164;     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025a, code lost:            r9 = getNode(r5.getParentData(r7));     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0262, code lost:            if (r9 == null) goto L166;     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0268, code lost:            if (r9.isAnimationInProgress() != true) goto L167;     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026a, code lost:            r8 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026b, code lost:            r7 = r7 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:            r29.firstVisibleIndex = r5;        r14 = r29.keyIndexMap;        r29.keyIndexMap = r34.getKeyIndexMap();     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x026e, code lost:            if (r8 != false) goto L154;     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0274, code lost:            if (r12 != r14.getIndex(r2)) goto L155;     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027e, code lost:            if (r12 >= r29.firstVisibleIndex) goto L157;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0286, code lost:            r29.movingAwayToEndBound.add(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:            if (r36 == false) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0280, code lost:            r29.movingAwayToStartBound.add(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0276, code lost:            r29.keyToItemInfoMap.remove(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x023c, code lost:            r5 = androidx.compose.ui.unit.Constraints.Companion.m5132fixedHeightOenEA2s(r5.getCrossAxisSize());     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:            r15 = r32;     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0228, code lost:            r29.keyToItemInfoMap.remove(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028c, code lost:            r1 = r29.movingAwayToStartBound;     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0292, code lost:            if (r1.size() <= 1) goto L112;     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0294, code lost:            R5.AbstractC1435t.B(r1, new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2(r29));     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x029c, code lost:            r1 = r29.movingAwayToStartBound;        r2 = r1.size();        r5 = 0;        r6 = 0;        r7 = 0;        r11 = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02a6, code lost:            if (r5 >= r2) goto L168;     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02a8, code lost:            r8 = r1.get(r5);        r9 = r35.getLineIndexOfItem(r8.getIndex());     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:            if (r36 == false) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b7, code lost:            if (r9 == (-1)) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b9, code lost:            if (r9 != r11) goto L118;     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02bb, code lost:            r7 = java.lang.Math.max(r7, r8.getMainAxisSize());     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ca, code lost:            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem.position$default(r8, (0 - r6) - r8.getMainAxisSize(), ((androidx.compose.foundation.lazy.grid.ItemInfo) R5.Q.i(r29.keyToItemInfoMap, r8.getKey())).getCrossAxisOffset(), r31, r32, 0, 0, 48, null);        r33.add(r8);        startAnimationsIfNeeded(r8);        r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c4, code lost:            r6 = r6 + r7;        r7 = r8.getMainAxisSize();        r11 = r9;     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02fe, code lost:            r1 = r29.movingAwayToEndBound;     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0307, code lost:            if (r1.size() <= 1) goto L123;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:            r5 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, r30);     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0309, code lost:            R5.AbstractC1435t.B(r1, new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2(r29));     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0311, code lost:            r1 = r29.movingAwayToEndBound;        r2 = r1.size();        r4 = 0;        r11 = -1;        r13 = 0;        r16 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x031c, code lost:            if (r13 >= r2) goto L171;     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x031e, code lost:            r5 = r1.get(r13);        r6 = r35.getLineIndexOfItem(r5.getIndex());     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x032c, code lost:            if (r6 == (-1)) goto L129;     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x032e, code lost:            if (r6 != r11) goto L129;     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0330, code lost:            r4 = java.lang.Math.max(r4, r5.getMainAxisSize());     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0340, code lost:            androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem.position$default(r5, r15 + r16, ((androidx.compose.foundation.lazy.grid.ItemInfo) R5.Q.i(r29.keyToItemInfoMap, r5.getKey())).getCrossAxisOffset(), r31, r32, 0, 0, 48, null);        r33.add(r5);        startAnimationsIfNeeded(r5);        r13 = r13 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0339, code lost:            r16 = r16 + r4;        r4 = r5.getMainAxisSize();        r11 = r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:            r29.movingAwayKeys.addAll(r29.keyToItemInfoMap.keySet());        r1 = r33.size();        r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x036c, code lost:            r29.movingInFromStartBound.clear();        r29.movingInFromEndBound.clear();        r29.movingAwayToStartBound.clear();        r29.movingAwayToEndBound.clear();        r29.movingAwayKeys.clear();     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0385, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0065, code lost:            r5 = androidx.compose.ui.unit.IntOffsetKt.IntOffset(r30, 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x005c, code lost:            r15 = r31;     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x004c, code lost:            r5 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:            if (r7 >= r1) goto L135;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:            r8 = r2.get(r7);        r29.movingAwayKeys.remove(r8.getKey());     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:            if (getHasAnimations(r8) == false) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:            r9 = r29.keyToItemInfoMap.get(r8.getKey());     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:            if (r9 != null) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:            r17 = r1;        r29.keyToItemInfoMap.put(r8.getKey(), new androidx.compose.foundation.lazy.grid.ItemInfo(r8.getCrossAxisSize(), r8.getCrossAxisOffset()));        r1 = r14.getIndex(r8.getKey());     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:            if (r1 == (-1)) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:            if (r8.getIndex() == r1) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:            if (r1 >= r4) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:            r29.movingInFromStartBound.add(r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x015b, code lost:            r7 = r7 + 1;        r2 = r33;        r1 = r17;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:            r29.movingInFromEndBound.add(r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:            r9 = r8.mo707getOffsetnOccac();     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:            if (r8.isVertical() == false) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:            r1 = androidx.compose.ui.unit.IntOffset.m5280getYimpl(r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:            initializeNode(r8, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e8, code lost:            r1 = androidx.compose.ui.unit.IntOffset.m5279getXimpl(r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:            r17 = r1;        r1 = r8.getPlaceablesCount();        r10 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f7, code lost:            if (r10 >= r1) goto L141;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f9, code lost:            r11 = getNode(r8.getParentData(r10));     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0101, code lost:            if (r11 == null) goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0103, code lost:            r30 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0113, code lost:            if (androidx.compose.ui.unit.IntOffset.m5278equalsimpl0(r11.m721getRawOffsetnOccac(), androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode.Companion.m723getNotInitializednOccac()) != false) goto L143;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:            r1 = r11.m721getRawOffsetnOccac();        r11.m722setRawOffsetgyyYBs(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m5279getXimpl(r1) + androidx.compose.ui.unit.IntOffset.m5279getXimpl(r5), androidx.compose.ui.unit.IntOffset.m5280getYimpl(r1) + androidx.compose.ui.unit.IntOffset.m5280getYimpl(r5)));     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0135, code lost:            r10 = r10 + 1;        r1 = r30;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0133, code lost:            r30 = r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013e, code lost:            r9.setCrossAxisSize(r8.getCrossAxisSize());        r9.setCrossAxisOffset(r8.getCrossAxisOffset());        startAnimationsIfNeeded(r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0150, code lost:            r17 = r1;        r29.keyToItemInfoMap.remove(r8.getKey());     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0166, code lost:            r1 = r29.movingInFromStartBound;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016d, code lost:            if (r1.size() <= 1) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016f, code lost:            R5.AbstractC1435t.B(r1, new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1(r14));     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0177, code lost:            r1 = r29.movingInFromStartBound;        r2 = r1.size();        r5 = -1;        r6 = 0;        r7 = 0;        r8 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0181, code lost:            if (r6 >= r2) goto L145;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0183, code lost:            r9 = r1.get(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0189, code lost:            if (r36 == false) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018b, code lost:            r10 = r9.getRow();     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0196, code lost:            if (r10 == (-1)) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0198, code lost:            if (r10 != r5) goto L66;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019a, code lost:            r8 = java.lang.Math.max(r8, r9.getMainAxisSize());     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01aa, code lost:            initializeNode(r9, (0 - r7) - r9.getMainAxisSize());        startAnimationsIfNeeded(r9);        r6 = r6 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:            r7 = r7 + r8;        r8 = r9.getMainAxisSize();        r5 = r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0191, code lost:            r10 = r9.getColumn();     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ba, code lost:            r1 = r29.movingInFromEndBound;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c0, code lost:            if (r1.size() <= 1) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c2, code lost:            R5.AbstractC1435t.B(r1, new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1(r14));     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ca, code lost:            r1 = r29.movingInFromEndBound;        r2 = r1.size();        r5 = 0;        r6 = 0;        r7 = 0;        r9 = -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d4, code lost:            if (r5 >= r2) goto L148;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d6, code lost:            r8 = r1.get(r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01dc, code lost:            if (r36 == false) goto L77;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:            r4 = r29.firstVisibleIndex;        r5 = (androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem) R5.AbstractC1435t.o0(r33);     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01de, code lost:            r10 = r8.getRow();     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e9, code lost:            if (r10 == (-1)) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01eb, code lost:            if (r10 != r9) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ed, code lost:            r7 = java.lang.Math.max(r7, r8.getMainAxisSize());     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fc, code lost:            initializeNode(r8, r15 + r6);        startAnimationsIfNeeded(r8);        r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f6, code lost:            r6 = r6 + r7;        r7 = r8.getMainAxisSize();        r9 = r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e4, code lost:            r10 = r8.getColumn();     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:            if (r5 == null) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0207, code lost:            r1 = r29.movingAwayKeys.iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0211, code lost:            if (r1.hasNext() == false) goto L151;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0213, code lost:            r2 = r1.next();        r5 = (androidx.compose.foundation.lazy.grid.ItemInfo) R5.Q.i(r29.keyToItemInfoMap, r2);        r12 = r29.keyIndexMap.getIndex(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0226, code lost:            if (r12 != (-1)) goto L152;     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022e, code lost:            if (r36 == false) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0230, code lost:            r5 = androidx.compose.ui.unit.Constraints.Companion.m5133fixedWidthOenEA2s(r5.getCrossAxisSize());     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:            r5 = r5.getIndex();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasured(int r30, int r31, int r32, java.util.List<androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem> r33, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider r34, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.onMeasured(int, int, int, java.util.List, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, boolean):void");
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.Empty;
        this.firstVisibleIndex = -1;
    }
}
