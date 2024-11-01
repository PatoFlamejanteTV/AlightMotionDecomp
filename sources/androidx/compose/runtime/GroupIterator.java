package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import d6.InterfaceC2767a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class GroupIterator implements Iterator<CompositionGroup>, InterfaceC2767a {
    private final int end;
    private int index;
    private final SlotTable table;
    private final int version;

    public GroupIterator(SlotTable slotTable, int i8, int i9) {
        this.table = slotTable;
        this.end = i9;
        this.index = i8;
        this.version = slotTable.getVersion$runtime_release();
        if (!slotTable.getWriter$runtime_release()) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    private final void validateRead() {
        if (this.table.getVersion$runtime_release() == this.version) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.end;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.index < this.end) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public CompositionGroup next() {
        int groupSize;
        validateRead();
        int i8 = this.index;
        groupSize = SlotTableKt.groupSize(this.table.getGroups(), i8);
        this.index = groupSize + i8;
        return new SlotTableGroup(this.table, i8, this.version);
    }
}
