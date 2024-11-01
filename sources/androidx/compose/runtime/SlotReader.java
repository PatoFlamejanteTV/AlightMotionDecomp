package androidx.compose.runtime;

import Q5.C1413h;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SlotReader {
    public static final int $stable = 8;
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private int parent;
    private final Object[] slots;
    private final int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private final SlotTable table;

    public SlotReader(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = slotReader.currentGroup;
        }
        return slotReader.anchor(i8);
    }

    private final Object aux(int[] iArr, int i8) {
        boolean hasAux;
        int auxIndex;
        hasAux = SlotTableKt.hasAux(iArr, i8);
        if (hasAux) {
            Object[] objArr = this.slots;
            auxIndex = SlotTableKt.auxIndex(iArr, i8);
            return objArr[auxIndex];
        }
        return Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i8) {
        boolean hasObjectKey;
        int objectKeyIndex;
        hasObjectKey = SlotTableKt.hasObjectKey(iArr, i8);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(iArr, i8);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    public final Anchor anchor(int i8) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int search = SlotTableKt.search(anchors$runtime_release, i8, this.groupsSize);
        if (search < 0) {
            Anchor anchor = new Anchor(i8);
            anchors$runtime_release.add(-(search + 1), anchor);
            return anchor;
        }
        return anchors$runtime_release.get(search);
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this, this.sourceInformationMap);
    }

    public final boolean containsMark(int i8) {
        boolean containsMark;
        containsMark = SlotTableKt.containsMark(this.groups, i8);
        return containsMark;
    }

    public final void endEmpty() {
        int i8 = this.emptyCount;
        if (i8 > 0) {
            this.emptyCount = i8 - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    public final void endGroup() {
        boolean z8;
        int parentAnchor;
        int groupSize;
        int i8;
        if (this.emptyCount == 0) {
            if (this.currentGroup == this.currentEnd) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
                this.parent = parentAnchor;
                if (parentAnchor >= 0) {
                    groupSize = SlotTableKt.groupSize(this.groups, parentAnchor);
                    i8 = parentAnchor + groupSize;
                } else {
                    i8 = this.groupsSize;
                }
                this.currentEnd = i8;
                return;
            }
            ComposerKt.composeRuntimeError("endGroup() not called at the end of a group".toString());
            throw new C1413h();
        }
    }

    public final List<KeyInfo> extractKeys() {
        int key;
        boolean isNode;
        int nodeCount;
        int i8;
        int groupSize;
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int i9 = this.currentGroup;
        int i10 = 0;
        while (i9 < this.currentEnd) {
            key = SlotTableKt.key(this.groups, i9);
            Object objectKey = objectKey(this.groups, i9);
            isNode = SlotTableKt.isNode(this.groups, i9);
            if (!isNode) {
                nodeCount = SlotTableKt.nodeCount(this.groups, i9);
                i8 = nodeCount;
            } else {
                i8 = 1;
            }
            arrayList.add(new KeyInfo(key, objectKey, i9, i8, i10));
            groupSize = SlotTableKt.groupSize(this.groups, i9);
            i9 += groupSize;
            i10++;
        }
        return arrayList;
    }

    public final Object get(int i8) {
        int i9 = this.currentSlot + i8;
        if (i9 < this.currentSlotEnd) {
            return this.slots[i9];
        }
        return Composer.Companion.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final Object getGroupAux() {
        int i8 = this.currentGroup;
        if (i8 < this.currentEnd) {
            return aux(this.groups, i8);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int key;
        int i8 = this.currentGroup;
        if (i8 < this.currentEnd) {
            key = SlotTableKt.key(this.groups, i8);
            return key;
        }
        return 0;
    }

    public final Object getGroupNode() {
        int i8 = this.currentGroup;
        if (i8 < this.currentEnd) {
            return node(this.groups, i8);
        }
        return null;
    }

    public final Object getGroupObjectKey() {
        int i8 = this.currentGroup;
        if (i8 < this.currentEnd) {
            return objectKey(this.groups, i8);
        }
        return null;
    }

    public final int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, this.currentGroup);
        return groupSize;
    }

    public final int getGroupSlotCount() {
        int slotAnchor;
        int i8;
        int i9 = this.currentGroup;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i9);
        int i10 = i9 + 1;
        if (i10 < this.groupsSize) {
            i8 = SlotTableKt.dataAnchor(this.groups, i10);
        } else {
            i8 = this.slotsSize;
        }
        return i8 - slotAnchor;
    }

    public final int getGroupSlotIndex() {
        int slotAnchor;
        int i8 = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i8 - slotAnchor;
    }

    public final boolean getInEmpty() {
        if (this.emptyCount > 0) {
            return true;
        }
        return false;
    }

    public final int getNodeCount() {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, this.currentGroup);
        return nodeCount;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int nodeCount;
        int i8 = this.parent;
        if (i8 >= 0) {
            nodeCount = SlotTableKt.nodeCount(this.groups, i8);
            return nodeCount;
        }
        return 0;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        int slotAnchor;
        int i8 = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i8 - slotAnchor;
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final Object groupAux(int i8) {
        return aux(this.groups, i8);
    }

    public final int groupEnd(int i8) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i8);
        return i8 + groupSize;
    }

    public final Object groupGet(int i8) {
        return groupGet(this.currentGroup, i8);
    }

    public final int groupKey(int i8) {
        int key;
        key = SlotTableKt.key(this.groups, i8);
        return key;
    }

    public final Object groupObjectKey(int i8) {
        return objectKey(this.groups, i8);
    }

    public final int groupSize(int i8) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i8);
        return groupSize;
    }

    public final boolean hasMark(int i8) {
        boolean hasMark;
        hasMark = SlotTableKt.hasMark(this.groups, i8);
        return hasMark;
    }

    public final boolean hasObjectKey(int i8) {
        boolean hasObjectKey;
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, i8);
        return hasObjectKey;
    }

    public final boolean isGroupEnd() {
        if (!getInEmpty() && this.currentGroup != this.currentEnd) {
            return false;
        }
        return true;
    }

    public final boolean isNode() {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
        return isNode;
    }

    public final Object next() {
        int i8;
        if (this.emptyCount <= 0 && (i8 = this.currentSlot) < this.currentSlotEnd) {
            Object[] objArr = this.slots;
            this.currentSlot = i8 + 1;
            return objArr[i8];
        }
        return Composer.Companion.getEmpty();
    }

    public final Object node(int i8) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, i8);
        if (isNode) {
            return node(this.groups, i8);
        }
        return null;
    }

    public final int nodeCount(int i8) {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, i8);
        return nodeCount;
    }

    public final int parent(int i8) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(this.groups, i8);
        return parentAnchor;
    }

    public final int parentOf(int i8) {
        int parentAnchor;
        if (i8 >= 0 && i8 < this.groupsSize) {
            parentAnchor = SlotTableKt.parentAnchor(this.groups, i8);
            return parentAnchor;
        }
        throw new IllegalArgumentException(("Invalid group index " + i8).toString());
    }

    public final void reposition(int i8) {
        boolean z8;
        int i9;
        int groupSize;
        if (this.emptyCount == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            this.currentGroup = i8;
            if (i8 < this.groupsSize) {
                i9 = SlotTableKt.parentAnchor(this.groups, i8);
            } else {
                i9 = -1;
            }
            this.parent = i9;
            if (i9 >= 0) {
                groupSize = SlotTableKt.groupSize(this.groups, i9);
                this.currentEnd = i9 + groupSize;
            } else {
                this.currentEnd = this.groupsSize;
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError("Cannot reposition while in an empty region".toString());
        throw new C1413h();
    }

    public final void restoreParent(int i8) {
        int groupSize;
        boolean z8;
        groupSize = SlotTableKt.groupSize(this.groups, i8);
        int i9 = groupSize + i8;
        int i10 = this.currentGroup;
        if (i10 >= i8 && i10 <= i9) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            this.parent = i8;
            this.currentEnd = i9;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        ComposerKt.composeRuntimeError(("Index " + i8 + " is not a parent of " + i10).toString());
        throw new C1413h();
    }

    public final int skipGroup() {
        boolean z8;
        boolean isNode;
        int groupSize;
        int i8 = 1;
        if (this.emptyCount == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
            if (!isNode) {
                i8 = SlotTableKt.nodeCount(this.groups, this.currentGroup);
            }
            int i9 = this.currentGroup;
            groupSize = SlotTableKt.groupSize(this.groups, i9);
            this.currentGroup = i9 + groupSize;
            return i8;
        }
        ComposerKt.composeRuntimeError("Cannot skip while in an empty region".toString());
        throw new C1413h();
    }

    public final void skipToGroupEnd() {
        boolean z8;
        if (this.emptyCount == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            this.currentGroup = this.currentEnd;
        } else {
            ComposerKt.composeRuntimeError("Cannot skip the enclosing group while in an empty region".toString());
            throw new C1413h();
        }
    }

    public final void startGroup() {
        int parentAnchor;
        int groupSize;
        int slotAnchor;
        int dataAnchor;
        GroupSourceInformation groupSourceInformation;
        if (this.emptyCount <= 0) {
            int i8 = this.parent;
            int i9 = this.currentGroup;
            parentAnchor = SlotTableKt.parentAnchor(this.groups, i9);
            if (parentAnchor == i8) {
                HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
                if (hashMap != null && (groupSourceInformation = hashMap.get(anchor(i8))) != null) {
                    groupSourceInformation.reportGroup(this.table, i9);
                }
                this.parent = i9;
                groupSize = SlotTableKt.groupSize(this.groups, i9);
                this.currentEnd = groupSize + i9;
                int i10 = i9 + 1;
                this.currentGroup = i10;
                slotAnchor = SlotTableKt.slotAnchor(this.groups, i9);
                this.currentSlot = slotAnchor;
                if (i9 < this.groupsSize - 1) {
                    dataAnchor = SlotTableKt.dataAnchor(this.groups, i10);
                } else {
                    dataAnchor = this.slotsSize;
                }
                this.currentSlotEnd = dataAnchor;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void startNode() {
        boolean isNode;
        if (this.emptyCount <= 0) {
            isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
            if (isNode) {
                startGroup();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
    }

    public String toString() {
        return "SlotReader(current=" + this.currentGroup + ", key=" + getGroupKey() + ", parent=" + this.parent + ", end=" + this.currentEnd + ')';
    }

    private final Object node(int[] iArr, int i8) {
        boolean isNode;
        int nodeIndex;
        isNode = SlotTableKt.isNode(iArr, i8);
        if (isNode) {
            Object[] objArr = this.slots;
            nodeIndex = SlotTableKt.nodeIndex(iArr, i8);
            return objArr[nodeIndex];
        }
        return Composer.Companion.getEmpty();
    }

    public final Object groupGet(int i8, int i9) {
        int slotAnchor;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i8);
        int i10 = i8 + 1;
        int i11 = slotAnchor + i9;
        return i11 < (i10 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i10) : this.slotsSize) ? this.slots[i11] : Composer.Companion.getEmpty();
    }

    public final int groupKey(Anchor anchor) {
        int key;
        if (!anchor.getValid()) {
            return 0;
        }
        key = SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
        return key;
    }

    public final boolean isNode(int i8) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, i8);
        return isNode;
    }
}
