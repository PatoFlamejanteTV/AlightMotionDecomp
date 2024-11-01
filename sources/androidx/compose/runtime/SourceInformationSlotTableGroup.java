package androidx.compose.runtime;

import R5.AbstractC1435t;
import androidx.compose.runtime.tooling.CompositionGroup;
import d6.InterfaceC2767a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class SourceInformationSlotTableGroup implements CompositionGroup, Iterable<CompositionGroup>, InterfaceC2767a {
    private final Object key;
    private final GroupSourceInformation sourceInformation;
    private final SlotTable table;
    private final Iterable<Object> data = AbstractC1435t.m();
    private final Iterable<CompositionGroup> compositionGroups = this;

    public SourceInformationSlotTableGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        this.table = slotTable;
        this.sourceInformation = groupSourceInformation;
        this.key = Integer.valueOf(groupSourceInformation.getKey());
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public /* synthetic */ CompositionGroup find(Object obj) {
        return androidx.compose.runtime.tooling.a.a(this, obj);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this.compositionGroups;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Iterable<Object> getData() {
        return this.data;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public /* synthetic */ int getGroupSize() {
        return androidx.compose.runtime.tooling.b.a(this);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public /* synthetic */ Object getIdentity() {
        return androidx.compose.runtime.tooling.b.b(this);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public Object getNode() {
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public /* synthetic */ int getSlotsSize() {
        return androidx.compose.runtime.tooling.b.c(this);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    public String getSourceInfo() {
        return this.sourceInformation.getSourceInformation();
    }

    public final GroupSourceInformation getSourceInformation() {
        return this.sourceInformation;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        ArrayList<Object> groups = this.sourceInformation.getGroups();
        boolean z8 = false;
        if (groups != null && !groups.isEmpty()) {
            z8 = true;
        }
        return !z8;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new SourceInformationGroupIterator(this.table, this.sourceInformation);
    }
}
