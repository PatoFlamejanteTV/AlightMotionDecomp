package androidx.compose.runtime;

import d6.InterfaceC2767a;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DataIterator implements Iterable<Object>, Iterator<Object>, InterfaceC2767a {
    private final int end;
    private int index;
    private final int start;
    private final SlotTable table;

    public DataIterator(SlotTable slotTable, int i8) {
        int dataAnchor;
        int slotsSize;
        this.table = slotTable;
        dataAnchor = SlotTableKt.dataAnchor(slotTable.getGroups(), i8);
        this.start = dataAnchor;
        int i9 = i8 + 1;
        if (i9 < slotTable.getGroupsSize()) {
            slotsSize = SlotTableKt.dataAnchor(slotTable.getGroups(), i9);
        } else {
            slotsSize = slotTable.getSlotsSize();
        }
        this.end = slotsSize;
        this.index = dataAnchor;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getStart() {
        return this.start;
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

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj;
        int i8 = this.index;
        if (i8 >= 0 && i8 < this.table.getSlots().length) {
            obj = this.table.getSlots()[this.index];
        } else {
            obj = null;
        }
        this.index++;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i8) {
        this.index = i8;
    }
}
