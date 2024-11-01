package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import d6.InterfaceC2767a;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, InterfaceC2767a {
    private final int group;
    private final SlotTable table;
    private final int version;

    public SlotTableGroup(SlotTable slotTable, int i8, int i9) {
        this.table = slotTable;
        this.group = i8;
        this.version = i9;
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() == this.version) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        Anchor anchor;
        int anchorIndex;
        int i8;
        int groupSize;
        if (obj instanceof Anchor) {
            anchor = (Anchor) obj;
        } else {
            anchor = null;
        }
        if (anchor == null || !this.table.ownsAnchor(anchor) || (anchorIndex = this.table.anchorIndex(anchor)) < (i8 = this.group)) {
            return null;
        }
        int i9 = anchorIndex - i8;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), this.group);
        if (i9 >= groupSize) {
            return null;
        }
        return new SlotTableGroup(this.table, anchorIndex, this.version);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable<Object> getData() {
        return new DataIterator(this.table, this.group);
    }

    public final int getGroup() {
        return this.group;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), this.group);
        return groupSize;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getIdentity() {
        validateRead();
        SlotReader openReader = this.table.openReader();
        try {
            return openReader.anchor(this.group);
        } finally {
            openReader.close();
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        boolean hasObjectKey;
        int key;
        int objectKeyIndex;
        hasObjectKey = SlotTableKt.hasObjectKey(this.table.getGroups(), this.group);
        if (!hasObjectKey) {
            key = SlotTableKt.key(this.table.getGroups(), this.group);
            return Integer.valueOf(key);
        }
        Object[] slots = this.table.getSlots();
        objectKeyIndex = SlotTableKt.objectKeyIndex(this.table.getGroups(), this.group);
        Object obj = slots[objectKeyIndex];
        AbstractC3292y.f(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        boolean isNode;
        int nodeIndex;
        isNode = SlotTableKt.isNode(this.table.getGroups(), this.group);
        if (isNode) {
            Object[] slots = this.table.getSlots();
            nodeIndex = SlotTableKt.nodeIndex(this.table.getGroups(), this.group);
            return slots[nodeIndex];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public int getSlotsSize() {
        int slotsSize;
        int dataAnchor;
        int groupSize = this.group + getGroupSize();
        if (groupSize < this.table.getGroupsSize()) {
            slotsSize = SlotTableKt.dataAnchor(this.table.getGroups(), groupSize);
        } else {
            slotsSize = this.table.getSlotsSize();
        }
        dataAnchor = SlotTableKt.dataAnchor(this.table.getGroups(), this.group);
        return slotsSize - dataAnchor;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        boolean hasAux;
        HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release;
        GroupSourceInformation groupSourceInformation;
        int auxIndex;
        hasAux = SlotTableKt.hasAux(this.table.getGroups(), this.group);
        if (hasAux) {
            Object[] slots = this.table.getSlots();
            auxIndex = SlotTableKt.auxIndex(this.table.getGroups(), this.group);
            Object obj = slots[auxIndex];
            if (!(obj instanceof String)) {
                return null;
            }
            return (String) obj;
        }
        Anchor tryAnchor = this.table.tryAnchor(this.group);
        if (tryAnchor == null || (sourceInformationMap$runtime_release = this.table.getSourceInformationMap$runtime_release()) == null || (groupSourceInformation = sourceInformationMap$runtime_release.get(tryAnchor)) == null) {
            return null;
        }
        return groupSourceInformation.getSourceInformation();
    }

    public final SlotTable getTable() {
        return this.table;
    }

    public final int getVersion() {
        return this.version;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), this.group);
        if (groupSize == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        int groupSize;
        validateRead();
        GroupSourceInformation sourceInformationOf = this.table.sourceInformationOf(this.group);
        if (sourceInformationOf != null) {
            return new SourceInformationGroupIterator(this.table, sourceInformationOf);
        }
        SlotTable slotTable = this.table;
        int i8 = this.group;
        groupSize = SlotTableKt.groupSize(slotTable.getGroups(), this.group);
        return new GroupIterator(slotTable, i8 + 1, i8 + groupSize);
    }

    public /* synthetic */ SlotTableGroup(SlotTable slotTable, int i8, int i9, int i10, AbstractC3284p abstractC3284p) {
        this(slotTable, i8, (i10 & 4) != 0 ? slotTable.getVersion$runtime_release() : i9);
    }
}
