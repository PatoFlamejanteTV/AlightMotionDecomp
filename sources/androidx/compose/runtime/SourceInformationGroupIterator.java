package androidx.compose.runtime;

import Q5.C1413h;
import androidx.compose.runtime.tooling.CompositionGroup;
import d6.InterfaceC2767a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class SourceInformationGroupIterator implements Iterator<CompositionGroup>, InterfaceC2767a {
    private final GroupSourceInformation group;
    private int index;
    private final SlotTable table;
    private final int version;

    public SourceInformationGroupIterator(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        this.table = slotTable;
        this.group = groupSourceInformation;
        this.version = slotTable.getVersion$runtime_release();
    }

    public final GroupSourceInformation getGroup() {
        return this.group;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> groups = this.group.getGroups();
        if (groups == null || this.index >= groups.size()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        Object obj;
        ArrayList<Object> groups = this.group.getGroups();
        if (groups != null) {
            int i8 = this.index;
            this.index = i8 + 1;
            obj = groups.get(i8);
        } else {
            obj = null;
        }
        if (obj instanceof Anchor) {
            return new SlotTableGroup(this.table, ((Anchor) obj).getLocation$runtime_release(), this.version);
        }
        if (obj instanceof GroupSourceInformation) {
            return new SourceInformationSlotTableGroup(this.table, (GroupSourceInformation) obj);
        }
        ComposerKt.composeRuntimeError("Unexpected group information structure");
        throw new C1413h();
    }
}
