package androidx.compose.runtime;

import Q5.C1413h;
import Q5.I;
import R5.AbstractC1428l;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import d6.InterfaceC2767a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.Q;
import l6.n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, InterfaceC2767a {
    public static final int $stable = 8;
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private ArrayList<Anchor> anchors = new ArrayList<>();

    private final List<Integer> dataIndexes() {
        return SlotTableKt.access$dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder sb, int i8, int i9) {
        HashMap<Anchor, GroupSourceInformation> hashMap;
        GroupSourceInformation groupSourceInformation;
        String sourceInformation;
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i8);
        sb.append(")");
        Anchor tryAnchor = tryAnchor(i8);
        if (tryAnchor != null && (hashMap = this.sourceInformationMap) != null && (groupSourceInformation = hashMap.get(tryAnchor)) != null && (sourceInformation = groupSourceInformation.getSourceInformation()) != null && (n.B(sourceInformation, "C(", false, 2, null) || n.B(sourceInformation, "CC(", false, 2, null))) {
            int R8 = n.R(sourceInformation, "(", 0, false, 6, null) + 1;
            int Q8 = n.Q(sourceInformation, ')', 0, false, 6, null);
            sb.append(" ");
            String substring = sourceInformation.substring(R8, Q8);
            AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("()");
        }
        sb.append(" key=");
        sb.append(SlotTableKt.access$key(this.groups, i8));
        int access$groupSize = SlotTableKt.access$groupSize(this.groups, i8);
        sb.append(", nodes=");
        sb.append(SlotTableKt.access$nodeCount(this.groups, i8));
        sb.append(", size=");
        sb.append(access$groupSize);
        if (SlotTableKt.access$hasMark(this.groups, i8)) {
            sb.append(", mark");
        }
        if (SlotTableKt.access$containsMark(this.groups, i8)) {
            sb.append(", contains mark");
        }
        int emitGroup$dataIndex = emitGroup$dataIndex(this, i8);
        int i11 = i8 + 1;
        int emitGroup$dataIndex2 = emitGroup$dataIndex(this, i11);
        if (emitGroup$dataIndex >= 0 && emitGroup$dataIndex <= emitGroup$dataIndex2 && emitGroup$dataIndex2 <= this.slotsSize) {
            if (SlotTableKt.access$hasObjectKey(this.groups, i8)) {
                sb.append(" objectKey=" + this.slots[SlotTableKt.access$objectKeyIndex(this.groups, i8)]);
            }
            if (SlotTableKt.access$isNode(this.groups, i8)) {
                sb.append(" node=" + this.slots[SlotTableKt.access$nodeIndex(this.groups, i8)]);
            }
            if (SlotTableKt.access$hasAux(this.groups, i8)) {
                sb.append(" aux=" + this.slots[SlotTableKt.access$auxIndex(this.groups, i8)]);
            }
            int access$slotAnchor = SlotTableKt.access$slotAnchor(this.groups, i8);
            if (access$slotAnchor < emitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(access$slotAnchor);
                sb.append(": ");
                for (int i12 = access$slotAnchor; i12 < emitGroup$dataIndex2; i12++) {
                    if (i12 != access$slotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(String.valueOf(this.slots[i12]));
                }
                sb.append("]");
            }
        } else {
            sb.append(", *invalid data offsets " + emitGroup$dataIndex + '-' + emitGroup$dataIndex2 + '*');
        }
        sb.append('\n');
        int i13 = i8 + access$groupSize;
        while (i11 < i13) {
            i11 += emitGroup(sb, i11, i9 + 1);
        }
        return access$groupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable, int i8) {
        if (i8 >= slotTable.groupsSize) {
            return slotTable.slotsSize;
        }
        return SlotTableKt.access$dataAnchor(slotTable.groups, i8);
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int i8) {
        int i9 = i8;
        while (i9 > 0) {
            Iterator<Object> it = new DataIterator(this, i9).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof RecomposeScopeImpl) {
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i9 != i8) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i9 = SlotTableKt.access$parentAnchor(this.groups, i9);
        }
        return null;
    }

    private final List<Integer> groupSizes() {
        return SlotTableKt.access$groupSizes(this.groups, this.groupsSize * 5);
    }

    private static final void invalidateGroupsWithKey$lambda$16$scanGroup(SlotReader slotReader, int i8, List<Anchor> list, O o8, SlotTable slotTable, List<RecomposeScopeImpl> list2) {
        int groupKey = slotReader.getGroupKey();
        if (groupKey != i8 && groupKey != -3) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                invalidateGroupsWithKey$lambda$16$scanGroup(slotReader, i8, list, o8, slotTable, list2);
            }
            slotReader.endGroup();
            return;
        }
        if (groupKey != -3) {
            list.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        }
        if (o8.f34569a) {
            RecomposeScopeImpl findEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
            if (findEffectiveRecomposeScope != null) {
                list2.add(findEffectiveRecomposeScope);
            } else {
                o8.f34569a = false;
                list2.clear();
            }
        }
        slotReader.skipGroup();
    }

    private final List<Integer> keys() {
        return SlotTableKt.access$keys(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> nodes() {
        return SlotTableKt.access$nodeCounts(this.groups, this.groupsSize * 5);
    }

    private final List<Integer> parentIndexes() {
        return SlotTableKt.access$parentAnchors(this.groups, this.groupsSize * 5);
    }

    private static final int verifyWellFormed$validateGroup(Q q8, SlotTable slotTable, int i8, int i9) {
        int access$dataAnchor;
        int i10 = q8.f34571a;
        int i11 = i10 + 1;
        q8.f34571a = i11;
        int access$parentAnchor = SlotTableKt.access$parentAnchor(slotTable.groups, i10);
        if (access$parentAnchor == i8) {
            int access$groupSize = SlotTableKt.access$groupSize(slotTable.groups, i10) + i10;
            if (access$groupSize <= slotTable.groupsSize) {
                if (access$groupSize <= i9) {
                    int access$dataAnchor2 = SlotTableKt.access$dataAnchor(slotTable.groups, i10);
                    if (i10 >= slotTable.groupsSize - 1) {
                        access$dataAnchor = slotTable.slotsSize;
                    } else {
                        access$dataAnchor = SlotTableKt.access$dataAnchor(slotTable.groups, i11);
                    }
                    if (access$dataAnchor <= slotTable.slots.length) {
                        if (access$dataAnchor2 <= access$dataAnchor) {
                            if (SlotTableKt.access$slotAnchor(slotTable.groups, i10) <= access$dataAnchor) {
                                if (access$dataAnchor - access$dataAnchor2 >= (SlotTableKt.access$isNode(slotTable.groups, i10) ? 1 : 0) + (SlotTableKt.access$hasObjectKey(slotTable.groups, i10) ? 1 : 0) + (SlotTableKt.access$hasAux(slotTable.groups, i10) ? 1 : 0)) {
                                    boolean access$isNode = SlotTableKt.access$isNode(slotTable.groups, i10);
                                    if (access$isNode && slotTable.slots[SlotTableKt.access$nodeIndex(slotTable.groups, i10)] == null) {
                                        throw new IllegalStateException(("No node recorded for a node group at " + i10).toString());
                                    }
                                    int i12 = 0;
                                    while (q8.f34571a < access$groupSize) {
                                        i12 += verifyWellFormed$validateGroup(q8, slotTable, i10, access$groupSize);
                                    }
                                    int access$nodeCount = SlotTableKt.access$nodeCount(slotTable.groups, i10);
                                    int access$groupSize2 = SlotTableKt.access$groupSize(slotTable.groups, i10);
                                    if (access$nodeCount == i12) {
                                        int i13 = q8.f34571a - i10;
                                        if (access$groupSize2 == i13) {
                                            if (SlotTableKt.access$containsAnyMark(slotTable.groups, i10) && i10 > 0 && !SlotTableKt.access$containsMark(slotTable.groups, i8)) {
                                                throw new IllegalStateException(("Expected group " + i8 + " to record it contains a mark because " + i10 + " does").toString());
                                            }
                                            if (access$isNode) {
                                                return 1;
                                            }
                                            return i12;
                                        }
                                        throw new IllegalStateException(("Incorrect slot count detected at " + i10 + ", expected " + access$groupSize2 + ", received " + i13).toString());
                                    }
                                    throw new IllegalStateException(("Incorrect node count detected at " + i10 + ", expected " + access$nodeCount + ", received " + i12).toString());
                                }
                                throw new IllegalStateException(("Not enough slots added for group " + i10).toString());
                            }
                            throw new IllegalStateException(("Slots start out of range at " + i10).toString());
                        }
                        throw new IllegalStateException(("Invalid data anchor at " + i10).toString());
                    }
                    throw new IllegalStateException(("Slots for " + i10 + " extend past the end of the slot table").toString());
                }
                throw new IllegalStateException(("A group extends past its parent group at " + i10).toString());
            }
            throw new IllegalStateException(("A group extends past the end of the table at " + i10).toString());
        }
        throw new IllegalStateException(("Invalid parent index detected at " + i10 + ", expected parent index to be " + i8 + " found " + access$parentAnchor).toString());
    }

    private static final void verifyWellFormed$verifySourceGroup(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = groups.get(i8);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (anchor.getValid()) {
                        if (!slotTable.ownsAnchor(anchor)) {
                            throw new IllegalArgumentException("Source map anchor is not owned by the slot table".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Source map contains invalid anchor".toString());
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    public final Anchor anchor(int i8) {
        int i9;
        if (!this.writer) {
            if (i8 >= 0 && i8 < (i9 = this.groupsSize)) {
                ArrayList<Anchor> arrayList = this.anchors;
                int access$search = SlotTableKt.access$search(arrayList, i8, i9);
                if (access$search < 0) {
                    Anchor anchor = new Anchor(i8);
                    arrayList.add(-(access$search + 1), anchor);
                    return anchor;
                }
                return arrayList.get(access$search);
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead".toString());
        throw new C1413h();
    }

    public final int anchorIndex(Anchor anchor) {
        if (!this.writer) {
            if (anchor.getValid()) {
                return anchor.getLocation$runtime_release();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
        throw new C1413h();
    }

    public final String asString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i8 = this.groupsSize;
        if (i8 > 0) {
            int i9 = 0;
            while (i9 < i8) {
                i9 += emitGroup(sb, i9, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void close$runtime_release(SlotReader slotReader, HashMap<Anchor, GroupSourceInformation> hashMap) {
        if (slotReader.getTable$runtime_release() == this && this.readers > 0) {
            this.readers--;
            if (hashMap != null) {
                synchronized (this) {
                    try {
                        HashMap<Anchor, GroupSourceInformation> hashMap2 = this.sourceInformationMap;
                        if (hashMap2 != null) {
                            hashMap2.putAll(hashMap);
                        } else {
                            this.sourceInformationMap = hashMap;
                        }
                        I i8 = I.f8786a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Unexpected reader close()".toString());
        throw new C1413h();
    }

    public final boolean containsMark() {
        if (this.groupsSize <= 0 || !SlotTableKt.access$containsMark(this.groups, 0)) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object obj) {
        return new SlotTableGroup(this, 0, 0, 4, null).find(obj);
    }

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int i8, Anchor anchor) {
        boolean z8;
        if (!this.writer) {
            if (i8 >= 0 && i8 < this.groupsSize) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                if (ownsAnchor(anchor)) {
                    int access$groupSize = SlotTableKt.access$groupSize(this.groups, i8) + i8;
                    int location$runtime_release = anchor.getLocation$runtime_release();
                    if (i8 <= location$runtime_release && location$runtime_release < access$groupSize) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.composeRuntimeError("Invalid group index".toString());
            throw new C1413h();
        }
        ComposerKt.composeRuntimeError("Writer is active".toString());
        throw new C1413h();
    }

    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int i8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        O o8 = new O();
        o8.f34569a = true;
        SlotReader openReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$16$scanGroup(openReader, i8, arrayList, o8, this, arrayList2);
            I i9 = I.f8786a;
            openReader.close();
            SlotWriter openWriter = openWriter();
            try {
                openWriter.startGroup();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Anchor anchor = (Anchor) arrayList.get(i10);
                    if (anchor.toIndexFor(openWriter) >= openWriter.getCurrentGroup()) {
                        openWriter.seek(anchor);
                        openWriter.bashCurrentGroup();
                    }
                }
                openWriter.skipToGroupEnd();
                openWriter.endGroup();
                openWriter.close();
                if (!o8.f34569a) {
                    return null;
                }
                return arrayList2;
            } catch (Throwable th) {
                openWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            openReader.close();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        if (this.groupsSize == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    public final SlotReader openReader() {
        if (!this.writer) {
            this.readers++;
            return new SlotReader(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final SlotWriter openWriter() {
        boolean z8;
        if (!this.writer) {
            if (this.readers <= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                this.writer = true;
                this.version++;
                return new SlotWriter(this);
            }
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new C1413h();
        }
        ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
        throw new C1413h();
    }

    public final boolean ownsAnchor(Anchor anchor) {
        int access$search;
        if (anchor.getValid() && (access$search = SlotTableKt.access$search(this.anchors, anchor.getLocation$runtime_release(), this.groupsSize)) >= 0 && AbstractC3292y.d(this.anchors.get(access$search), anchor)) {
            return true;
        }
        return false;
    }

    public final <T> T read(Function1 function1) {
        SlotReader openReader = openReader();
        try {
            return (T) function1.invoke(openReader);
        } finally {
            AbstractC3290w.b(1);
            openReader.close();
            AbstractC3290w.a(1);
        }
    }

    public final void setAnchors$runtime_release(ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setSourceInformationMap$runtime_release(HashMap<Anchor, GroupSourceInformation> hashMap) {
        this.sourceInformationMap = hashMap;
    }

    public final void setTo$runtime_release(int[] iArr, int i8, Object[] objArr, int i9, ArrayList<Anchor> arrayList, HashMap<Anchor, GroupSourceInformation> hashMap) {
        this.groups = iArr;
        this.groupsSize = i8;
        this.slots = objArr;
        this.slotsSize = i9;
        this.anchors = arrayList;
        this.sourceInformationMap = hashMap;
    }

    public final void setVersion$runtime_release(int i8) {
        this.version = i8;
    }

    public final Object slot$runtime_release(int i8, int i9) {
        int length;
        int access$slotAnchor = SlotTableKt.access$slotAnchor(this.groups, i8);
        int i10 = i8 + 1;
        if (i10 < this.groupsSize) {
            length = SlotTableKt.access$dataAnchor(this.groups, i10);
        } else {
            length = this.slots.length;
        }
        int i11 = length - access$slotAnchor;
        if (i9 >= 0 && i9 < i11) {
            return this.slots[access$slotAnchor + i9];
        }
        return Composer.Companion.getEmpty();
    }

    public final List<Object> slotsOf$runtime_release(int i8) {
        int length;
        int access$dataAnchor = SlotTableKt.access$dataAnchor(this.groups, i8);
        int i9 = i8 + 1;
        if (i9 < this.groupsSize) {
            length = SlotTableKt.access$dataAnchor(this.groups, i9);
        } else {
            length = this.slots.length;
        }
        return AbstractC1428l.V0(this.slots).subList(access$dataAnchor, length);
    }

    public final GroupSourceInformation sourceInformationOf(int i8) {
        Anchor tryAnchor;
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor = tryAnchor(i8)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor);
    }

    public final Anchor tryAnchor(int i8) {
        int i9;
        if (!this.writer) {
            if (i8 >= 0 && i8 < (i9 = this.groupsSize)) {
                return SlotTableKt.access$find(this.anchors, i8, i9);
            }
            return null;
        }
        ComposerKt.composeRuntimeError("use active SlotWriter to crate an anchor for location instead".toString());
        throw new C1413h();
    }

    public final void verifyWellFormed() {
        int i8;
        int i9;
        Q q8 = new Q();
        int i10 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i8 = q8.f34571a;
                i9 = this.groupsSize;
                if (i8 >= i9) {
                    break;
                } else {
                    verifyWellFormed$validateGroup(q8, this, -1, i8 + SlotTableKt.access$groupSize(this.groups, i8));
                }
            }
            if (i8 != i9) {
                throw new IllegalStateException(("Incomplete group at root " + q8.f34571a + " expected to be " + this.groupsSize).toString());
            }
        }
        int length = this.slots.length;
        for (int i11 = this.slotsSize; i11 < length; i11++) {
            if (this.slots[i11] != null) {
                throw new IllegalStateException(("Non null value in the slot gap at index " + i11).toString());
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int indexFor = arrayList.get(i12).toIndexFor(this);
            if (indexFor >= 0 && indexFor <= this.groupsSize) {
                if (i10 < indexFor) {
                    i12++;
                    i10 = indexFor;
                } else {
                    throw new IllegalArgumentException("Anchor is out of order".toString());
                }
            } else {
                throw new IllegalArgumentException("Invalid anchor, location out of bound".toString());
            }
        }
        HashMap<Anchor, GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : hashMap.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (key.getValid()) {
                    if (ownsAnchor(key)) {
                        verifyWellFormed$verifySourceGroup(this, value);
                    } else {
                        throw new IllegalArgumentException("Source map anchor is not owned by the slot table".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Source map contains invalid anchor".toString());
                }
            }
        }
    }

    public final <T> T write(Function1 function1) {
        SlotWriter openWriter = openWriter();
        try {
            return (T) function1.invoke(openWriter);
        } finally {
            AbstractC3290w.b(1);
            openWriter.close();
            AbstractC3290w.a(1);
        }
    }

    public final void close$runtime_release(SlotWriter slotWriter, int[] iArr, int i8, Object[] objArr, int i9, ArrayList<Anchor> arrayList, HashMap<Anchor, GroupSourceInformation> hashMap) {
        if (slotWriter.getTable$runtime_release() == this && this.writer) {
            this.writer = false;
            setTo$runtime_release(iArr, i8, objArr, i9, arrayList, hashMap);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }
}
