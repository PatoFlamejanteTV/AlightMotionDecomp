package androidx.compose.runtime;

import Q5.C1413h;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SlotWriter {
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private PrioritySet pendingRecalculateMarks;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final IntStack startStack = new IntStack();
    private final IntStack endStack = new IntStack();
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x01d0  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01f7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<androidx.compose.runtime.Anchor> moveGroup(androidx.compose.runtime.SlotWriter r24, int r25, androidx.compose.runtime.SlotWriter r26, boolean r27, boolean r28, boolean r29) {
            /*
                Method dump skipped, instructions count: 518
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.Companion.moveGroup(androidx.compose.runtime.SlotWriter, int, androidx.compose.runtime.SlotWriter, boolean, boolean, boolean):java.util.List");
        }

        static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i8, SlotWriter slotWriter2, boolean z8, boolean z9, boolean z10, int i9, Object obj) {
            boolean z11;
            if ((i9 & 32) != 0) {
                z11 = true;
            } else {
                z11 = z10;
            }
            return companion.moveGroup(slotWriter, i8, slotWriter2, z8, z9, z11);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime_release();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime_release();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static final /* synthetic */ int access$dataIndexToDataAddress(SlotWriter slotWriter, int i8) {
        return slotWriter.dataIndexToDataAddress(i8);
    }

    public static final /* synthetic */ int[] access$getGroups$p(SlotWriter slotWriter) {
        return slotWriter.groups;
    }

    public static final /* synthetic */ Object[] access$getSlots$p(SlotWriter slotWriter) {
        return slotWriter.slots;
    }

    public static final /* synthetic */ int access$groupIndexToAddress(SlotWriter slotWriter, int i8) {
        return slotWriter.groupIndexToAddress(i8);
    }

    public static final /* synthetic */ int access$slotIndex(SlotWriter slotWriter, int[] iArr, int i8) {
        return slotWriter.slotIndex(iArr, i8);
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i8);
    }

    private final int auxIndex(int[] iArr, int i8) {
        int groupInfo;
        int countOneBits;
        int dataIndex = dataIndex(iArr, i8);
        groupInfo = SlotTableKt.groupInfo(iArr, i8);
        countOneBits = SlotTableKt.countOneBits(groupInfo >> 29);
        return dataIndex + countOneBits;
    }

    private final boolean childContainsAnyMarks(int i8) {
        boolean containsAnyMark;
        int i9 = i8 + 1;
        int groupSize = i8 + groupSize(i8);
        while (i9 < groupSize) {
            containsAnyMark = SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i9));
            if (containsAnyMark) {
                return true;
            }
            i9 += groupSize(i9);
        }
        return false;
    }

    private final void clearSlotGap() {
        int i8 = this.slotsGapStart;
        AbstractC1428l.t(this.slots, null, i8, this.slotsGapLen + i8);
    }

    public final boolean containsAnyGroupMarks(int i8) {
        boolean containsAnyMark;
        if (i8 >= 0) {
            containsAnyMark = SlotTableKt.containsAnyMark(this.groups, groupIndexToAddress(i8));
            if (containsAnyMark) {
                return true;
            }
        }
        return false;
    }

    private final boolean containsGroupMark(int i8) {
        boolean containsMark;
        if (i8 >= 0) {
            containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress(i8));
            if (containsMark) {
                return true;
            }
        }
        return false;
    }

    private final int dataAnchorToDataIndex(int i8, int i9, int i10) {
        return i8 < 0 ? (i10 - i9) + i8 + 1 : i8;
    }

    public final int dataIndex(int i8) {
        return dataIndex(this.groups, groupIndexToAddress(i8));
    }

    public final int dataIndexToDataAddress(int i8) {
        if (i8 >= this.slotsGapStart) {
            return i8 + this.slotsGapLen;
        }
        return i8;
    }

    public final int dataIndexToDataAnchor(int i8, int i9, int i10, int i11) {
        return i8 > i9 ? -(((i11 - i10) - i8) + 1) : i8;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        List dataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List G02 = AbstractC1435t.G0(AbstractC1435t.N0(dataAnchors$default, i6.m.s(0, this.groupGapStart)), AbstractC1435t.N0(dataAnchors$default, i6.m.s(this.groupGapStart + this.groupGapLen, iArr.length / 5)));
        ArrayList arrayList = new ArrayList(G02.size());
        int size = G02.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) G02.get(i8)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i8, int i9, int i10) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(i8, this.groupGapStart);
        while (i10 < i9) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i10), parentIndexToAnchor);
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i10));
            int i11 = groupSize + i10;
            fixParentAnchorsFor(i10, i11, i10 + 1);
            i10 = i11;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final void groupAsString(StringBuilder sb, int i8) {
        int groupSize;
        int parentAnchor;
        int key;
        int nodeCount;
        int dataAnchor;
        int parentAnchor2;
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i8);
        sb.append("Group(");
        if (i8 < 10) {
            sb.append(' ');
        }
        if (i8 < 100) {
            sb.append(' ');
        }
        if (i8 < 1000) {
            sb.append(' ');
        }
        sb.append(i8);
        if (groupIndexToAddress != i8) {
            sb.append("(");
            sb.append(groupIndexToAddress);
            sb.append(")");
        }
        sb.append('#');
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        sb.append(groupSize);
        boolean groupAsString$isStarted = groupAsString$isStarted(this, i8);
        if (groupAsString$isStarted) {
            sb.append('?');
        }
        sb.append('^');
        parentAnchor = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchorToIndex(parentAnchor));
        sb.append(": key=");
        key = SlotTableKt.key(this.groups, groupIndexToAddress);
        sb.append(key);
        sb.append(", nodes=");
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        sb.append(nodeCount);
        if (groupAsString$isStarted) {
            sb.append('?');
        }
        sb.append(", dataAnchor=");
        dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
        sb.append(dataAnchor);
        sb.append(", parentAnchor=");
        parentAnchor2 = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchor2);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            sb.append(", node=" + this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))]);
        }
        int slotIndex = slotIndex(this.groups, groupIndexToAddress);
        int dataIndex = dataIndex(this.groups, groupIndexToAddress + 1);
        if (dataIndex > slotIndex) {
            sb.append(", [");
            for (int i9 = slotIndex; i9 < dataIndex; i9++) {
                if (i9 != slotIndex) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(this.slots[dataIndexToDataAddress(i9)]));
            }
            sb.append(']');
        }
        sb.append(")");
    }

    private static final boolean groupAsString$isStarted(SlotWriter slotWriter, int i8) {
        if (i8 < slotWriter.currentGroup && (i8 == slotWriter.parent || slotWriter.startStack.indexOf(i8) >= 0 || groupAsString$isStarted(slotWriter, slotWriter.parent(i8)))) {
            return true;
        }
        return false;
    }

    public final int groupIndexToAddress(int i8) {
        if (i8 >= this.groupGapStart) {
            return i8 + this.groupGapLen;
        }
        return i8;
    }

    private final GroupSourceInformation groupSourceInformationFor(int i8, String str) {
        int groupSize;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        this.sourceInformationMap = hashMap;
        Anchor anchor = anchor(i8);
        GroupSourceInformation groupSourceInformation = hashMap.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, str);
            if (str == null) {
                int i9 = i8 + 1;
                int i10 = this.currentGroup;
                while (i9 < i10) {
                    groupSourceInformation.reportGroup(this, i9);
                    groupSize = SlotTableKt.groupSize(this.groups, i9);
                    i9 += groupSize;
                }
            }
            hashMap.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    public final void insertGroups(int i8) {
        int i9;
        if (i8 > 0) {
            int i10 = this.currentGroup;
            moveGroupGapTo(i10);
            int i11 = this.groupGapStart;
            int i12 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i13 = length - i12;
            int i14 = 0;
            if (i12 < i8) {
                int max = Math.max(Math.max(length * 2, i13 + i8), 32);
                int[] iArr2 = new int[max * 5];
                int i15 = max - i13;
                AbstractC1428l.g(iArr, iArr2, 0, 0, i11 * 5);
                AbstractC1428l.g(iArr, iArr2, (i11 + i15) * 5, (i12 + i11) * 5, length * 5);
                this.groups = iArr2;
                i12 = i15;
            }
            int i16 = this.currentGroupEnd;
            if (i16 >= i11) {
                this.currentGroupEnd = i16 + i8;
            }
            int i17 = i11 + i8;
            this.groupGapStart = i17;
            this.groupGapLen = i12 - i8;
            if (i13 > 0) {
                i9 = dataIndex(i10 + i8);
            } else {
                i9 = 0;
            }
            if (this.slotsGapOwner >= i11) {
                i14 = this.slotsGapStart;
            }
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i9, i14, this.slotsGapLen, this.slots.length);
            for (int i18 = i11; i18 < i17; i18++) {
                SlotTableKt.updateDataAnchor(this.groups, i18, dataIndexToDataAnchor);
            }
            int i19 = this.slotsGapOwner;
            if (i19 >= i11) {
                this.slotsGapOwner = i19 + i8;
            }
        }
    }

    public final void insertSlots(int i8, int i9) {
        if (i8 > 0) {
            moveSlotGapTo(this.currentSlot, i9);
            int i10 = this.slotsGapStart;
            int i11 = this.slotsGapLen;
            if (i11 < i8) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i12 = length - i11;
                int max = Math.max(Math.max(length * 2, i12 + i8), 32);
                Object[] objArr2 = new Object[max];
                for (int i13 = 0; i13 < max; i13++) {
                    objArr2[i13] = null;
                }
                int i14 = max - i12;
                AbstractC1428l.i(objArr, objArr2, 0, 0, i10);
                AbstractC1428l.i(objArr, objArr2, i10 + i14, i11 + i10, length);
                this.slots = objArr2;
                i11 = i14;
            }
            int i15 = this.currentSlotEnd;
            if (i15 >= i10) {
                this.currentSlotEnd = i15 + i8;
            }
            this.slotsGapStart = i10 + i8;
            this.slotsGapLen = i11 - i8;
        }
    }

    private final List<Integer> keys() {
        List keys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(keys$default.size());
        int size = keys$default.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = keys$default.get(i8);
            ((Number) obj).intValue();
            int i9 = this.groupGapStart;
            if (i8 < i9 || i8 >= i9 + this.groupGapLen) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = slotWriter.parent;
        }
        slotWriter.markGroup(i8);
    }

    private final void moveAnchors(int i8, int i9, int i10) {
        int locationOf;
        int locationOf2;
        Anchor anchor;
        int anchorIndex;
        int i11 = i10 + i8;
        int size$runtime_release = getSize$runtime_release();
        locationOf = SlotTableKt.locationOf(this.anchors, i8, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size() && (anchorIndex = anchorIndex((anchor = this.anchors.get(locationOf)))) >= i8 && anchorIndex < i11) {
                arrayList.add(anchor);
                this.anchors.remove(locationOf);
            }
        }
        int i12 = i9 - i8;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Anchor anchor2 = (Anchor) arrayList.get(i13);
            int anchorIndex2 = anchorIndex(anchor2) + i12;
            if (anchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(anchorIndex2);
            }
            locationOf2 = SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime_release);
            this.anchors.add(locationOf2, anchor2);
        }
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z8 = true;
        }
        return slotWriter.moveFrom(slotTable, i8, z8);
    }

    public final void moveGroupGapTo(int i8) {
        int parentAnchor;
        int i9 = this.groupGapLen;
        int i10 = this.groupGapStart;
        if (i10 != i8) {
            boolean z8 = true;
            if (!this.anchors.isEmpty()) {
                updateAnchors(i10, i8);
            }
            if (i9 > 0) {
                int[] iArr = this.groups;
                int i11 = i8 * 5;
                int i12 = i9 * 5;
                int i13 = i10 * 5;
                if (i8 < i10) {
                    AbstractC1428l.g(iArr, iArr, i12 + i11, i11, i13);
                } else {
                    AbstractC1428l.g(iArr, iArr, i13, i13 + i12, i11 + i12);
                }
            }
            if (i8 < i10) {
                i10 = i8 + i9;
            }
            int capacity = getCapacity();
            if (i10 >= capacity) {
                z8 = false;
            }
            ComposerKt.runtimeCheck(z8);
            while (i10 < capacity) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, i10);
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(parentAnchor), i8);
                if (parentIndexToAnchor != parentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i10, parentIndexToAnchor);
                }
                i10++;
                if (i10 == i8) {
                    i10 += i9;
                }
            }
        }
        this.groupGapStart = i8;
    }

    public final void moveSlotGapTo(int i8, int i9) {
        int dataAnchor;
        boolean z8;
        int dataAnchor2;
        boolean z9;
        int i10 = this.slotsGapLen;
        int i11 = this.slotsGapStart;
        int i12 = this.slotsGapOwner;
        if (i11 != i8) {
            Object[] objArr = this.slots;
            if (i8 < i11) {
                AbstractC1428l.i(objArr, objArr, i8 + i10, i8, i11);
            } else {
                AbstractC1428l.i(objArr, objArr, i11, i11 + i10, i8 + i10);
            }
        }
        int min = Math.min(i9 + 1, getSize$runtime_release());
        if (i12 != min) {
            int length = this.slots.length - i10;
            if (min < i12) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i12);
                int i13 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    dataAnchor2 = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
                    if (dataAnchor2 >= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress, -((length - dataAnchor2) + 1));
                        groupIndexToAddress++;
                        if (groupIndexToAddress == i13) {
                            groupIndexToAddress += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new C1413h();
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i12);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress3);
                    if (dataAnchor < 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress3, dataAnchor + length + 1);
                        groupIndexToAddress3++;
                        if (groupIndexToAddress3 == this.groupGapStart) {
                            groupIndexToAddress3 += this.groupGapLen;
                        }
                    } else {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new C1413h();
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i8;
    }

    private final int nodeIndex(int[] iArr, int i8) {
        return dataIndex(iArr, i8);
    }

    private final int parentAnchorToIndex(int i8) {
        if (i8 <= -2) {
            return getSize$runtime_release() + i8 + 2;
        }
        return i8;
    }

    private final int parentIndexToAnchor(int i8, int i9) {
        if (i8 >= i9) {
            return -((getSize$runtime_release() - i8) + 2);
        }
        return i8;
    }

    private final void recalculateMarks() {
        PrioritySet prioritySet = this.pendingRecalculateMarks;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                updateContainsMarkNow(prioritySet.takeMax(), prioritySet);
            }
        }
    }

    private final boolean removeAnchors(int i8, int i9, HashMap<Anchor, GroupSourceInformation> hashMap) {
        int locationOf;
        int i10 = i9 + i8;
        locationOf = SlotTableKt.locationOf(this.anchors, i10, getCapacity() - this.groupGapLen);
        if (locationOf >= this.anchors.size()) {
            locationOf--;
        }
        int i11 = locationOf + 1;
        boolean z8 = false;
        int i12 = 0;
        while (locationOf >= 0) {
            Anchor anchor = this.anchors.get(locationOf);
            int anchorIndex = anchorIndex(anchor);
            if (anchorIndex < i8) {
                break;
            }
            if (anchorIndex < i10) {
                anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                if (hashMap != null) {
                    hashMap.remove(anchor);
                }
                if (i12 == 0) {
                    i12 = locationOf + 1;
                }
                i11 = locationOf;
            }
            locationOf--;
        }
        if (i11 < i12) {
            z8 = true;
        }
        if (z8) {
            this.anchors.subList(i11, i12).clear();
        }
        return z8;
    }

    public final boolean removeGroups(int i8, int i9) {
        boolean z8 = false;
        if (i9 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i8);
            if (!arrayList.isEmpty()) {
                z8 = removeAnchors(i8, i9, this.sourceInformationMap);
            }
            this.groupGapStart = i8;
            this.groupGapLen += i9;
            int i10 = this.slotsGapOwner;
            if (i10 > i8) {
                this.slotsGapOwner = Math.max(i8, i10 - i9);
            }
            int i11 = this.currentGroupEnd;
            if (i11 >= this.groupGapStart) {
                this.currentGroupEnd = i11 - i9;
            }
            int i12 = this.parent;
            if (containsGroupMark(i12)) {
                updateContainsMark(i12);
            }
        }
        return z8;
    }

    public final void removeSlots(int i8, int i9, int i10) {
        if (i9 > 0) {
            int i11 = this.slotsGapLen;
            int i12 = i8 + i9;
            moveSlotGapTo(i12, i10);
            this.slotsGapStart = i8;
            this.slotsGapLen = i11 + i9;
            AbstractC1428l.t(this.slots, null, i8, i12);
            int i13 = this.currentSlotEnd;
            if (i13 >= i8) {
                this.currentSlotEnd = i13 - i9;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    public final int slotIndex(int[] iArr, int i8) {
        int slotAnchor;
        if (i8 < getCapacity()) {
            slotAnchor = SlotTableKt.slotAnchor(iArr, i8);
            return dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
        }
        return this.slots.length - this.slotsGapLen;
    }

    public final GroupSourceInformation sourceInformationOf(int i8) {
        Anchor tryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor$runtime_release = tryAnchor$runtime_release(i8)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor$runtime_release);
    }

    private final void updateAnchors(int i8, int i9) {
        int locationOf;
        Anchor anchor;
        int location$runtime_release;
        int locationOf2;
        Anchor anchor2;
        int location$runtime_release2;
        int i10;
        int capacity = getCapacity() - this.groupGapLen;
        if (i8 < i9) {
            for (locationOf2 = SlotTableKt.locationOf(this.anchors, i8, capacity); locationOf2 < this.anchors.size() && (location$runtime_release2 = (anchor2 = this.anchors.get(locationOf2)).getLocation$runtime_release()) < 0 && (i10 = location$runtime_release2 + capacity) < i9; locationOf2++) {
                anchor2.setLocation$runtime_release(i10);
            }
            return;
        }
        for (locationOf = SlotTableKt.locationOf(this.anchors, i9, capacity); locationOf < this.anchors.size() && (location$runtime_release = (anchor = this.anchors.get(locationOf)).getLocation$runtime_release()) >= 0; locationOf++) {
            anchor.setLocation$runtime_release(-(capacity - location$runtime_release));
        }
    }

    public final void updateContainsMark(int i8) {
        if (i8 >= 0) {
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = prioritySet;
            }
            prioritySet.add(i8);
        }
    }

    private final void updateContainsMarkNow(int i8, PrioritySet prioritySet) {
        boolean containsMark;
        int groupIndexToAddress = groupIndexToAddress(i8);
        boolean childContainsAnyMarks = childContainsAnyMarks(i8);
        containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress);
        if (containsMark != childContainsAnyMarks) {
            SlotTableKt.updateContainsMark(this.groups, groupIndexToAddress, childContainsAnyMarks);
            int parent = parent(i8);
            if (parent >= 0) {
                prioritySet.add(parent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i8, int i9) {
        SlotTableKt.updateDataAnchor(iArr, i8, dataIndexToDataAnchor(i9, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateNodeOfGroup(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.groupIndexToAddress(r4)
            int[] r1 = r3.groups
            int r2 = r1.length
            if (r0 >= r2) goto L11
            boolean r1 = androidx.compose.runtime.SlotTableKt.access$isNode(r1, r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L23
            java.lang.Object[] r4 = r3.slots
            int[] r1 = r3.groups
            int r0 = r3.nodeIndex(r1, r0)
            int r0 = r3.dataIndexToDataAddress(r0)
            r4[r0] = r5
            return
        L23:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Updating the node of a group at "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = " that was not created with as a node group"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = r4.toString()
            androidx.compose.runtime.ComposerKt.composeRuntimeError(r4)
            Q5.h r4 = new Q5.h
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.updateNodeOfGroup(int, java.lang.Object):void");
    }

    public final void advanceBy(int i8) {
        boolean z8;
        boolean z9 = false;
        if (i8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (this.insertCount <= 0) {
                if (i8 == 0) {
                    return;
                }
                int i9 = this.currentGroup + i8;
                if (i9 >= this.parent && i9 <= this.currentGroupEnd) {
                    z9 = true;
                }
                if (z9) {
                    this.currentGroup = i9;
                    int dataIndex = dataIndex(this.groups, groupIndexToAddress(i9));
                    this.currentSlot = dataIndex;
                    this.currentSlotEnd = dataIndex;
                    return;
                }
                ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')').toString());
                throw new C1413h();
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        ComposerKt.composeRuntimeError("Cannot seek backwards".toString());
        throw new C1413h();
    }

    public final Anchor anchor(int i8) {
        ArrayList<Anchor> arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i8, getSize$runtime_release());
        if (search < 0) {
            if (i8 > this.groupGapStart) {
                i8 = -(getSize$runtime_release() - i8);
            }
            Anchor anchor = new Anchor(i8);
            arrayList.add(-(search + 1), anchor);
            return anchor;
        }
        return arrayList.get(search);
    }

    public final int anchorIndex(Anchor anchor) {
        int location$runtime_release = anchor.getLocation$runtime_release();
        if (location$runtime_release < 0) {
            return location$runtime_release + getSize$runtime_release();
        }
        return location$runtime_release;
    }

    public final void bashCurrentGroup() {
        SlotTableKt.updateGroupKey(this.groups, this.currentGroup, -3);
    }

    public final void beginInsert() {
        int i8 = this.insertCount;
        this.insertCount = i8 + 1;
        if (i8 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void close() {
        this.closed = true;
        if (this.startStack.isEmpty()) {
            moveGroupGapTo(getSize$runtime_release());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap);
    }

    public final int endGroup() {
        boolean z8;
        boolean isNode;
        int groupSize;
        int nodeCount;
        int i8;
        boolean isNode2;
        int nodeCount2;
        int groupSize2;
        int i9 = 1;
        int i10 = 0;
        if (this.insertCount > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i11 = this.currentGroup;
        int i12 = this.currentGroupEnd;
        int i13 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i13);
        int i14 = this.nodeCount;
        int i15 = i11 - i13;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (z8) {
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i15);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i14);
            int pop = this.nodeCountStack.pop();
            if (!isNode) {
                i9 = i14;
            }
            this.nodeCount = pop + i9;
            this.parent = parent(this.groups, i13);
        } else {
            if (i11 != i12) {
                i9 = 0;
            }
            if (i9 != 0) {
                groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
                nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
                SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i15);
                SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i14);
                int pop2 = this.startStack.pop();
                restoreCurrentGroupEnd();
                this.parent = pop2;
                int parent = parent(this.groups, i13);
                int pop3 = this.nodeCountStack.pop();
                this.nodeCount = pop3;
                if (parent == pop2) {
                    if (!isNode) {
                        i10 = i14 - nodeCount;
                    }
                    this.nodeCount = pop3 + i10;
                } else {
                    int i16 = i15 - groupSize;
                    if (isNode) {
                        i8 = 0;
                    } else {
                        i8 = i14 - nodeCount;
                    }
                    if (i16 != 0 || i8 != 0) {
                        while (parent != 0 && parent != pop2 && (i8 != 0 || i16 != 0)) {
                            int groupIndexToAddress2 = groupIndexToAddress(parent);
                            if (i16 != 0) {
                                groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                                SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i16);
                            }
                            if (i8 != 0) {
                                int[] iArr = this.groups;
                                nodeCount2 = SlotTableKt.nodeCount(iArr, groupIndexToAddress2);
                                SlotTableKt.updateNodeCount(iArr, groupIndexToAddress2, nodeCount2 + i8);
                            }
                            isNode2 = SlotTableKt.isNode(this.groups, groupIndexToAddress2);
                            if (isNode2) {
                                i8 = 0;
                            }
                            parent = parent(this.groups, parent);
                        }
                    }
                    this.nodeCount += i8;
                }
            } else {
                ComposerKt.composeRuntimeError("Expected to be at the end of a group".toString());
                throw new C1413h();
            }
        }
        return i14;
    }

    public final void endInsert() {
        boolean z8;
        int i8 = this.insertCount;
        if (i8 > 0) {
            int i9 = i8 - 1;
            this.insertCount = i9;
            if (i9 == 0) {
                if (this.nodeCountStack.getSize() == this.startStack.getSize()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    restoreCurrentGroupEnd();
                    return;
                } else {
                    ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                    throw new C1413h();
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void ensureStarted(int i8) {
        boolean z8 = false;
        if (this.insertCount <= 0) {
            int i9 = this.parent;
            if (i9 != i8) {
                if (i8 >= i9 && i8 < this.currentGroupEnd) {
                    z8 = true;
                }
                if (z8) {
                    int i10 = this.currentGroup;
                    int i11 = this.currentSlot;
                    int i12 = this.currentSlotEnd;
                    this.currentGroup = i8;
                    startGroup();
                    this.currentGroup = i10;
                    this.currentSlot = i11;
                    this.currentSlotEnd = i12;
                    return;
                }
                ComposerKt.composeRuntimeError(("Started group at " + i8 + " must be a subgroup of the group at " + i9).toString());
                throw new C1413h();
            }
            return;
        }
        ComposerKt.composeRuntimeError("Cannot call ensureStarted() while inserting".toString());
        throw new C1413h();
    }

    public final void forEachData(int i8, InterfaceC2072n interfaceC2072n) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i8));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i8 + 1));
        for (int i9 = slotIndex; i9 < dataIndex; i9++) {
            interfaceC2072n.invoke(Integer.valueOf(i9 - slotIndex), this.slots[dataIndexToDataAddress(i9)]);
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final Object groupAux(int i8) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(i8);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            return this.slots[auxIndex(this.groups, groupIndexToAddress)];
        }
        return Composer.Companion.getEmpty();
    }

    public final int groupKey(int i8) {
        int key;
        key = SlotTableKt.key(this.groups, groupIndexToAddress(i8));
        return key;
    }

    public final Object groupObjectKey(int i8) {
        boolean hasObjectKey;
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(i8);
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, groupIndexToAddress);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(this.groups, groupIndexToAddress);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    public final int groupSize(int i8) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i8));
        return groupSize;
    }

    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i8 = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i8 + groupSize(i8))), this);
    }

    public final String groupsAsString() {
        StringBuilder sb = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i8 = 0; i8 < size$runtime_release; i8++) {
            groupAsString(sb, i8);
            sb.append('\n');
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean indexInCurrentGroup(int i8) {
        return indexInGroup(i8, this.currentGroup);
    }

    public final boolean indexInGroup(int i8, int i9) {
        int capacity;
        int groupSize;
        if (i9 == this.parent) {
            capacity = this.currentGroupEnd;
        } else {
            if (i9 > this.startStack.peekOr(0)) {
                groupSize = groupSize(i9);
            } else {
                int indexOf = this.startStack.indexOf(i9);
                if (indexOf < 0) {
                    groupSize = groupSize(i9);
                } else {
                    capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(indexOf);
                }
            }
            capacity = groupSize + i9;
        }
        if (i8 <= i9 || i8 >= capacity) {
            return false;
        }
        return true;
    }

    public final boolean indexInParent(int i8) {
        int i9 = this.parent;
        if ((i8 > i9 && i8 < this.currentGroupEnd) || (i9 == 0 && i8 == 0)) {
            return true;
        }
        return false;
    }

    public final void insertAux(Object obj) {
        boolean z8;
        boolean hasAux;
        if (this.insertCount >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            int i8 = this.parent;
            int groupIndexToAddress = groupIndexToAddress(i8);
            hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
            if (!hasAux) {
                insertSlots(1, i8);
                int auxIndex = auxIndex(this.groups, groupIndexToAddress);
                int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
                int i9 = this.currentSlot;
                if (i9 > auxIndex) {
                    int i10 = i9 - auxIndex;
                    if (i10 < 3) {
                        if (i10 > 1) {
                            Object[] objArr = this.slots;
                            objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
                        }
                        Object[] objArr2 = this.slots;
                        objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
                    } else {
                        throw new IllegalStateException("Moving more than two slot not supported".toString());
                    }
                }
                SlotTableKt.addAux(this.groups, groupIndexToAddress);
                this.slots[dataIndexToDataAddress] = obj;
                this.currentSlot++;
                return;
            }
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new C1413h();
        }
        ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
        throw new C1413h();
    }

    public final boolean isGroupEnd() {
        if (this.currentGroup == this.currentGroupEnd) {
            return true;
        }
        return false;
    }

    public final boolean isNode() {
        boolean isNode;
        int i8 = this.currentGroup;
        if (i8 < this.currentGroupEnd) {
            isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i8));
            if (isNode) {
                return true;
            }
        }
        return false;
    }

    public final void markGroup(int i8) {
        boolean hasMark;
        boolean containsMark;
        int groupIndexToAddress = groupIndexToAddress(i8);
        hasMark = SlotTableKt.hasMark(this.groups, groupIndexToAddress);
        if (!hasMark) {
            SlotTableKt.updateMark(this.groups, groupIndexToAddress, true);
            containsMark = SlotTableKt.containsMark(this.groups, groupIndexToAddress);
            if (!containsMark) {
                updateContainsMark(parent(i8));
            }
        }
    }

    public final List<Anchor> moveFrom(SlotTable slotTable, int i8, boolean z8) {
        boolean z9;
        int groupSize;
        if (this.insertCount > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ComposerKt.runtimeCheck(z9);
        if (i8 == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
            groupSize = SlotTableKt.groupSize(slotTable.getGroups(), i8);
            if (groupSize == slotTable.getGroupsSize()) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<Anchor> arrayList = this.anchors;
                HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
                int[] groups = slotTable.getGroups();
                int groupsSize = slotTable.getGroupsSize();
                Object[] slots = slotTable.getSlots();
                int slotsSize = slotTable.getSlotsSize();
                HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = slotTable.getSourceInformationMap$runtime_release();
                this.groups = groups;
                this.slots = slots;
                this.anchors = slotTable.getAnchors$runtime_release();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                this.sourceInformationMap = sourceInformationMap$runtime_release;
                slotTable.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, hashMap);
                return this.anchors;
            }
        }
        SlotWriter openWriter = slotTable.openWriter();
        try {
            return Companion.moveGroup(openWriter, i8, this, true, true, z8);
        } finally {
            openWriter.close();
        }
    }

    public final void moveGroup(int i8) {
        boolean z8;
        boolean z9;
        int groupSize;
        int i9;
        int groupSize2;
        boolean z10;
        if (this.insertCount == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (i8 >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (i8 == 0) {
                    return;
                }
                int i10 = this.currentGroup;
                int i11 = this.parent;
                int i12 = this.currentGroupEnd;
                int i13 = i10;
                for (int i14 = i8; i14 > 0; i14--) {
                    groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i13));
                    i13 += groupSize2;
                    if (i13 <= i12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
                        throw new C1413h();
                    }
                }
                groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i13));
                int i15 = this.currentSlot;
                int dataIndex = dataIndex(this.groups, groupIndexToAddress(i13));
                int i16 = i13 + groupSize;
                int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i16));
                int i17 = dataIndex2 - dataIndex;
                insertSlots(i17, Math.max(this.currentGroup - 1, 0));
                insertGroups(groupSize);
                int[] iArr = this.groups;
                int groupIndexToAddress = groupIndexToAddress(i16) * 5;
                AbstractC1428l.g(iArr, iArr, groupIndexToAddress(i10) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
                if (i17 > 0) {
                    Object[] objArr = this.slots;
                    AbstractC1428l.i(objArr, objArr, i15, dataIndexToDataAddress(dataIndex + i17), dataIndexToDataAddress(dataIndex2 + i17));
                }
                int i18 = dataIndex + i17;
                int i19 = i18 - i15;
                int i20 = this.slotsGapStart;
                int i21 = this.slotsGapLen;
                int length = this.slots.length;
                int i22 = this.slotsGapOwner;
                int i23 = i10 + groupSize;
                int i24 = i10;
                while (i24 < i23) {
                    int groupIndexToAddress2 = groupIndexToAddress(i24);
                    int i25 = i20;
                    int dataIndex3 = dataIndex(iArr, groupIndexToAddress2) - i19;
                    int i26 = i19;
                    if (i22 < groupIndexToAddress2) {
                        i9 = 0;
                    } else {
                        i9 = i25;
                    }
                    updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex3, i9, i21, length));
                    i24++;
                    i20 = i25;
                    i19 = i26;
                }
                moveAnchors(i16, i10, groupSize);
                if (!removeGroups(i16, groupSize)) {
                    fixParentAnchorsFor(i11, this.currentGroupEnd, i10);
                    if (i17 > 0) {
                        removeSlots(i18, i17, i16 - 1);
                        return;
                    }
                    return;
                }
                ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                throw new C1413h();
            }
            ComposerKt.composeRuntimeError("Parameter offset is out of bounds".toString());
            throw new C1413h();
        }
        ComposerKt.composeRuntimeError("Cannot move a group while inserting".toString());
        throw new C1413h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:            if (groupSize(r12.currentGroup + r13) == 1) goto L25;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom(int r13, androidx.compose.runtime.SlotTable r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.insertCount
            if (r0 > 0) goto Lf
            int r0 = r12.currentGroup
            int r0 = r0 + r13
            int r0 = r12.groupSize(r0)
            r1 = 1
            if (r0 != r1) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            androidx.compose.runtime.ComposerKt.runtimeCheck(r1)
            int r0 = r12.currentGroup
            int r1 = r12.currentSlot
            int r2 = r12.currentSlotEnd
            r12.advanceBy(r13)
            r12.startGroup()
            r12.beginInsert()
            androidx.compose.runtime.SlotWriter r13 = r14.openWriter()
            androidx.compose.runtime.SlotWriter$Companion r3 = androidx.compose.runtime.SlotWriter.Companion     // Catch: java.lang.Throwable -> L45
            r10 = 32
            r11 = 0
            r7 = 0
            r8 = 1
            r9 = 0
            r4 = r13
            r5 = r15
            r6 = r12
            java.util.List r14 = androidx.compose.runtime.SlotWriter.Companion.moveGroup$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L45
            r13.close()
            r12.endInsert()
            r12.endGroup()
            r12.currentGroup = r0
            r12.currentSlot = r1
            r12.currentSlotEnd = r2
            return r14
        L45:
            r14 = move-exception
            r13.close()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.moveIntoGroupFrom(int, androidx.compose.runtime.SlotTable, int):java.util.List");
    }

    public final List<Anchor> moveTo(Anchor anchor, int i8, SlotWriter slotWriter) {
        boolean z8;
        boolean z9;
        boolean z10;
        int nodeCount;
        boolean z11;
        int groupSize;
        boolean isNode;
        int nodeCount2;
        boolean z12 = true;
        if (slotWriter.insertCount > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        ComposerKt.runtimeCheck(z8);
        if (this.insertCount == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ComposerKt.runtimeCheck(z9);
        ComposerKt.runtimeCheck(anchor.getValid());
        int anchorIndex = anchorIndex(anchor) + i8;
        int i9 = this.currentGroup;
        if (i9 <= anchorIndex && anchorIndex < this.currentGroupEnd) {
            z10 = true;
        } else {
            z10 = false;
        }
        ComposerKt.runtimeCheck(z10);
        int parent = parent(anchorIndex);
        int groupSize2 = groupSize(anchorIndex);
        if (isNode(anchorIndex)) {
            nodeCount = 1;
        } else {
            nodeCount = nodeCount(anchorIndex);
        }
        List<Anchor> moveGroup$default = Companion.moveGroup$default(Companion, this, anchorIndex, slotWriter, false, false, false, 32, null);
        updateContainsMark(parent);
        if (nodeCount > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        while (parent >= i9) {
            int groupIndexToAddress = groupIndexToAddress(parent);
            int[] iArr = this.groups;
            groupSize = SlotTableKt.groupSize(iArr, groupIndexToAddress);
            SlotTableKt.updateGroupSize(iArr, groupIndexToAddress, groupSize - groupSize2);
            if (z11) {
                isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
                if (isNode) {
                    z11 = false;
                } else {
                    int[] iArr2 = this.groups;
                    nodeCount2 = SlotTableKt.nodeCount(iArr2, groupIndexToAddress);
                    SlotTableKt.updateNodeCount(iArr2, groupIndexToAddress, nodeCount2 - nodeCount);
                }
            }
            parent = parent(parent);
        }
        if (z11) {
            if (this.nodeCount < nodeCount) {
                z12 = false;
            }
            ComposerKt.runtimeCheck(z12);
            this.nodeCount -= nodeCount;
        }
        return moveGroup$default;
    }

    public final Object node(int i8) {
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i8);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int i8) {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress(i8));
        return nodeCount;
    }

    public final int parent(int i8) {
        return parent(this.groups, i8);
    }

    public final void recordGroupSourceInformation(String str) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, str);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, null).endGrouplessCall();
        }
    }

    public final void recordGrouplessCallSourceInformationStart(int i8, String str) {
        if (this.insertCount > 0) {
            groupSourceInformationFor(this.parent, null).startGrouplessCall(i8, str);
        }
    }

    public final boolean removeGroup() {
        boolean z8;
        Anchor tryAnchor$runtime_release;
        if (this.insertCount == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            int i8 = this.currentGroup;
            int i9 = this.currentSlot;
            int skipGroup = skipGroup();
            GroupSourceInformation sourceInformationOf = sourceInformationOf(this.parent);
            if (sourceInformationOf != null && (tryAnchor$runtime_release = tryAnchor$runtime_release(i8)) != null) {
                sourceInformationOf.removeAnchor(tryAnchor$runtime_release);
            }
            PrioritySet prioritySet = this.pendingRecalculateMarks;
            if (prioritySet != null) {
                while (prioritySet.isNotEmpty() && prioritySet.peek() >= i8) {
                    prioritySet.takeMax();
                }
            }
            boolean removeGroups = removeGroups(i8, this.currentGroup - i8);
            removeSlots(i9, this.currentSlot - i9, i8 - 1);
            this.currentGroup = i8;
            this.currentSlot = i9;
            this.nodeCount -= skipGroup;
            return removeGroups;
        }
        ComposerKt.composeRuntimeError("Cannot remove group while inserting".toString());
        throw new C1413h();
    }

    public final void reset() {
        boolean z8;
        if (this.insertCount == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            recalculateMarks();
            this.currentGroup = 0;
            this.currentGroupEnd = getCapacity() - this.groupGapLen;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            this.nodeCount = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reset when inserting".toString());
        throw new C1413h();
    }

    public final void seek(Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(Object obj) {
        int i8 = this.currentSlot;
        if (i8 <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i8 - 1)] = obj;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new C1413h();
        }
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i8 = this.currentSlot;
        this.currentSlot = i8 + 1;
        return objArr[dataIndexToDataAddress(i8)];
    }

    public final int skipGroup() {
        int groupSize;
        boolean isNode;
        int nodeCount;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i8 = this.currentGroup;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i9 = i8 + groupSize;
        this.currentGroup = i9;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i9));
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (!isNode) {
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
            return nodeCount;
        }
        return 1;
    }

    public final void skipToGroupEnd() {
        int i8 = this.currentGroupEnd;
        this.currentGroup = i8;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i8));
    }

    public final Object slot(Anchor anchor, int i8) {
        return slot(anchorIndex(anchor), i8);
    }

    public final void startData(int i8, Object obj, Object obj2) {
        startGroup(i8, obj, false, obj2);
    }

    public final void startGroup() {
        if (this.insertCount == 0) {
            Composer.Companion companion = Composer.Companion;
            startGroup(0, companion.getEmpty(), false, companion.getEmpty());
        } else {
            ComposerKt.composeRuntimeError("Key must be supplied when inserting".toString());
            throw new C1413h();
        }
    }

    public final void startNode(int i8, Object obj) {
        startGroup(i8, obj, true, Composer.Companion.getEmpty());
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final Anchor tryAnchor$runtime_release(int i8) {
        Anchor find;
        if (i8 >= 0 && i8 < getSize$runtime_release()) {
            find = SlotTableKt.find(this.anchors, i8, getSize$runtime_release());
            return find;
        }
        return null;
    }

    public final Object update(Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    public final void updateAux(Object obj) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = obj;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new C1413h();
        }
    }

    public final void updateNode(Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateParentNode(Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void verifyDataAnchors$runtime_release() {
        int dataAnchor;
        int i8 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i9 = 0;
        int i10 = 0;
        boolean z8 = false;
        while (i9 < size$runtime_release) {
            int groupIndexToAddress = groupIndexToAddress(i9);
            dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
            int dataIndex = dataIndex(this.groups, groupIndexToAddress);
            if (dataIndex >= i10) {
                if (dataIndex <= length) {
                    if (dataAnchor < 0 && !z8) {
                        if (i8 == i9) {
                            z8 = true;
                        } else {
                            throw new IllegalStateException(("Expected the slot gap owner to be " + i8 + " found gap at " + i9).toString());
                        }
                    }
                    i9++;
                    i10 = dataIndex;
                } else {
                    throw new IllegalStateException(("Data index, " + dataIndex + ", out of bound at " + i9).toString());
                }
            } else {
                throw new IllegalStateException(("Data index out of order at " + i9 + ", previous = " + i10 + ", current = " + dataIndex).toString());
            }
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int parentAnchor;
        int parentAnchor2;
        int i8 = this.groupGapStart;
        int i9 = this.groupGapLen;
        int capacity = getCapacity();
        for (int i10 = 0; i10 < i8; i10++) {
            parentAnchor2 = SlotTableKt.parentAnchor(this.groups, i10);
            if (parentAnchor2 <= -2) {
                throw new IllegalStateException(("Expected a start relative anchor at " + i10).toString());
            }
        }
        for (int i11 = i9 + i8; i11 < capacity; i11++) {
            parentAnchor = SlotTableKt.parentAnchor(this.groups, i11);
            if (parentAnchorToIndex(parentAnchor) < i8) {
                if (parentAnchor <= -2) {
                    throw new IllegalStateException(("Expected a start relative anchor at " + i11).toString());
                }
            } else if (parentAnchor > -2) {
                throw new IllegalStateException(("Expected an end relative anchor at " + i11).toString());
            }
        }
    }

    public static final /* synthetic */ int access$dataIndex(SlotWriter slotWriter, int[] iArr, int i8) {
        return slotWriter.dataIndex(iArr, i8);
    }

    public final int dataIndex(int[] iArr, int i8) {
        int dataAnchor;
        if (i8 >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        dataAnchor = SlotTableKt.dataAnchor(iArr, i8);
        return dataAnchorToDataIndex(dataAnchor, this.slotsGapLen, this.slots.length);
    }

    public final boolean isNode(int i8) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i8));
        return isNode;
    }

    public final int parent(Anchor anchor) {
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final Object slot(int i8, int i9) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i8));
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i8 + 1));
        int i10 = i9 + slotIndex;
        if (slotIndex <= i10 && i10 < dataIndex) {
            return this.slots[dataIndexToDataAddress(i10)];
        }
        return Composer.Companion.getEmpty();
    }

    public final void startData(int i8, Object obj) {
        startGroup(i8, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startNode(int i8, Object obj, Object obj2) {
        startGroup(i8, obj, true, obj2);
    }

    public final void updateNode(Anchor anchor, Object obj) {
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    private final int parent(int[] iArr, int i8) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i8));
        return parentAnchorToIndex(parentAnchor);
    }

    public final Object node(Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final Object set(int i8, Object obj) {
        return set(this.currentGroup, i8, obj);
    }

    public final void startGroup(int i8) {
        Composer.Companion companion = Composer.Companion;
        startGroup(i8, companion.getEmpty(), false, companion.getEmpty());
    }

    public final Object set(int i8, int i9, Object obj) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(i8));
        int i10 = slotIndex + i9;
        if (i10 >= slotIndex && i10 < dataIndex(this.groups, groupIndexToAddress(i8 + 1))) {
            int dataIndexToDataAddress = dataIndexToDataAddress(i10);
            Object[] objArr = this.slots;
            Object obj2 = objArr[dataIndexToDataAddress];
            objArr[dataIndexToDataAddress] = obj;
            return obj2;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + i9 + " for group " + i8).toString());
        throw new C1413h();
    }

    public final void startGroup(int i8, Object obj) {
        startGroup(i8, obj, false, Composer.Companion.getEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int i8, Object obj, boolean z8, Object obj2) {
        int nodeCount;
        int groupSize;
        int i9;
        GroupSourceInformation sourceInformationOf;
        int i10 = this.parent;
        boolean z9 = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (z9) {
            insertGroups(1);
            int i11 = this.currentGroup;
            int groupIndexToAddress = groupIndexToAddress(i11);
            Composer.Companion companion = Composer.Companion;
            int i12 = obj != companion.getEmpty() ? 1 : 0;
            int i13 = (z8 || obj2 == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, i8, z8, i12, i13, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i14 = (z8 ? 1 : 0) + i12 + i13;
            if (i14 > 0) {
                insertSlots(i14, i11);
                Object[] objArr = this.slots;
                int i15 = this.currentSlot;
                if (z8) {
                    objArr[i15] = obj2;
                    i15++;
                }
                if (i12 != 0) {
                    objArr[i15] = obj;
                    i15++;
                }
                if (i13 != 0) {
                    objArr[i15] = obj2;
                    i15++;
                }
                this.currentSlot = i15;
            }
            this.nodeCount = 0;
            i9 = i11 + 1;
            this.parent = i11;
            this.currentGroup = i9;
            if (i10 >= 0 && (sourceInformationOf = sourceInformationOf(i10)) != null) {
                sourceInformationOf.reportGroup(this, i11);
            }
        } else {
            this.startStack.push(i10);
            saveCurrentGroupEnd();
            int i16 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i16);
            if (!AbstractC3292y.d(obj2, Composer.Companion.getEmpty())) {
                if (z8) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress2);
            this.nodeCount = nodeCount;
            this.parent = i16;
            this.currentGroup = i16 + 1;
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
            i9 = i16 + groupSize;
        }
        this.currentGroupEnd = i9;
    }

    public final void ensureStarted(Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }
}
