package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int ContainsMark_Mask = 67108864;
    private static final int DataAnchor_Offset = 4;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int LIVE_EDIT_INVALID_KEY = -3;
    private static final int Mark_Mask = 134217728;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeCount_Mask = 67108863;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    public static final /* synthetic */ int access$auxIndex(int[] iArr, int i8) {
        return auxIndex(iArr, i8);
    }

    public static final /* synthetic */ boolean access$containsAnyMark(int[] iArr, int i8) {
        return containsAnyMark(iArr, i8);
    }

    public static final /* synthetic */ boolean access$containsMark(int[] iArr, int i8) {
        return containsMark(iArr, i8);
    }

    public static final /* synthetic */ int access$dataAnchor(int[] iArr, int i8) {
        return dataAnchor(iArr, i8);
    }

    public static final /* synthetic */ List access$dataAnchors(int[] iArr, int i8) {
        return dataAnchors(iArr, i8);
    }

    public static final /* synthetic */ Anchor access$find(ArrayList arrayList, int i8, int i9) {
        return find(arrayList, i8, i9);
    }

    public static final /* synthetic */ int access$groupSize(int[] iArr, int i8) {
        return groupSize(iArr, i8);
    }

    public static final /* synthetic */ List access$groupSizes(int[] iArr, int i8) {
        return groupSizes(iArr, i8);
    }

    public static final /* synthetic */ boolean access$hasAux(int[] iArr, int i8) {
        return hasAux(iArr, i8);
    }

    public static final /* synthetic */ boolean access$hasMark(int[] iArr, int i8) {
        return hasMark(iArr, i8);
    }

    public static final /* synthetic */ boolean access$hasObjectKey(int[] iArr, int i8) {
        return hasObjectKey(iArr, i8);
    }

    public static final /* synthetic */ boolean access$isNode(int[] iArr, int i8) {
        return isNode(iArr, i8);
    }

    public static final /* synthetic */ int access$key(int[] iArr, int i8) {
        return key(iArr, i8);
    }

    public static final /* synthetic */ List access$keys(int[] iArr, int i8) {
        return keys(iArr, i8);
    }

    public static final /* synthetic */ int access$nodeCount(int[] iArr, int i8) {
        return nodeCount(iArr, i8);
    }

    public static final /* synthetic */ List access$nodeCounts(int[] iArr, int i8) {
        return nodeCounts(iArr, i8);
    }

    public static final /* synthetic */ int access$nodeIndex(int[] iArr, int i8) {
        return nodeIndex(iArr, i8);
    }

    public static final /* synthetic */ int access$objectKeyIndex(int[] iArr, int i8) {
        return objectKeyIndex(iArr, i8);
    }

    public static final /* synthetic */ int access$parentAnchor(int[] iArr, int i8) {
        return parentAnchor(iArr, i8);
    }

    public static final /* synthetic */ List access$parentAnchors(int[] iArr, int i8) {
        return parentAnchors(iArr, i8);
    }

    public static final /* synthetic */ int access$search(ArrayList arrayList, int i8, int i9) {
        return search(arrayList, i8, i9);
    }

    public static final /* synthetic */ int access$slotAnchor(int[] iArr, int i8) {
        return slotAnchor(iArr, i8);
    }

    public static final void addAux(int[] iArr, int i8) {
        int i9 = (i8 * 5) + 1;
        iArr[i9] = iArr[i9] | Aux_Mask;
    }

    public static final int auxIndex(int[] iArr, int i8) {
        int i9 = i8 * 5;
        if (i9 >= iArr.length) {
            return iArr.length;
        }
        return countOneBits(iArr[i9 + 1] >> 29) + iArr[i9 + 4];
    }

    public static final boolean containsAnyMark(int[] iArr, int i8) {
        if ((iArr[(i8 * 5) + 1] & 201326592) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean containsMark(int[] iArr, int i8) {
        if ((iArr[(i8 * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public static final int countOneBits(int i8) {
        switch (i8) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final int dataAnchor(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 4];
    }

    public static final List<Integer> dataAnchors(int[] iArr, int i8) {
        return slice(iArr, i6.m.r(i6.m.s(4, i8), 5));
    }

    public static /* synthetic */ List dataAnchors$default(int[] iArr, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = iArr.length;
        }
        return dataAnchors(iArr, i8);
    }

    private static final <T> int fastIndexOf(ArrayList<T> arrayList, Function1 function1) {
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (((Boolean) function1.invoke(arrayList.get(i8))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, Function1 function1) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t8 = arrayList.get(size);
            if (((Boolean) function1.invoke(t8)).booleanValue()) {
                return t8;
            }
        }
        return null;
    }

    public static final Anchor find(ArrayList<Anchor> arrayList, int i8, int i9) {
        int search = search(arrayList, i8, i9);
        if (search >= 0) {
            return arrayList.get(search);
        }
        return null;
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i8, int i9, Function0 function0) {
        int search = search(arrayList, i8, i9);
        if (search < 0) {
            Anchor anchor = (Anchor) function0.invoke();
            arrayList.add(-(search + 1), anchor);
            return anchor;
        }
        return arrayList.get(search);
    }

    public static final int groupInfo(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 1];
    }

    public static final int groupSize(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 3];
    }

    public static final List<Integer> groupSizes(int[] iArr, int i8) {
        return slice(iArr, i6.m.r(i6.m.s(3, i8), 5));
    }

    static /* synthetic */ List groupSizes$default(int[] iArr, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = iArr.length;
        }
        return groupSizes(iArr, i8);
    }

    public static final boolean hasAux(int[] iArr, int i8) {
        if ((iArr[(i8 * 5) + 1] & Aux_Mask) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasMark(int[] iArr, int i8) {
        if ((iArr[(i8 * 5) + 1] & Mark_Mask) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasObjectKey(int[] iArr, int i8) {
        if ((iArr[(i8 * 5) + 1] & ObjectKey_Mask) != 0) {
            return true;
        }
        return false;
    }

    public static final void initGroup(int[] iArr, int i8, int i9, boolean z8, boolean z9, boolean z10, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (z8) {
            i12 = 1073741824;
        } else {
            i12 = 0;
        }
        if (z9) {
            i13 = ObjectKey_Mask;
        } else {
            i13 = 0;
        }
        if (z10) {
            i14 = Aux_Mask;
        } else {
            i14 = 0;
        }
        int i15 = i8 * 5;
        iArr[i15] = i9;
        iArr[i15 + 1] = i12 | i13 | i14;
        iArr[i15 + 2] = i10;
        iArr[i15 + 3] = 0;
        iArr[i15 + 4] = i11;
    }

    public static final boolean isNode(int[] iArr, int i8) {
        if ((iArr[(i8 * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public static final int key(int[] iArr, int i8) {
        return iArr[i8 * 5];
    }

    public static final List<Integer> keys(int[] iArr, int i8) {
        return slice(iArr, i6.m.r(i6.m.s(0, i8), 5));
    }

    public static /* synthetic */ List keys$default(int[] iArr, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = iArr.length;
        }
        return keys(iArr, i8);
    }

    public static final int locationOf(ArrayList<Anchor> arrayList, int i8, int i9) {
        int search = search(arrayList, i8, i9);
        if (search < 0) {
            return -(search + 1);
        }
        return search;
    }

    public static final int nodeCount(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 1] & NodeCount_Mask;
    }

    public static final List<Integer> nodeCounts(int[] iArr, int i8) {
        List<Integer> slice = slice(iArr, i6.m.r(i6.m.s(1, i8), 5));
        ArrayList arrayList = new ArrayList(slice.size());
        int size = slice.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(Integer.valueOf(slice.get(i9).intValue() & NodeCount_Mask));
        }
        return arrayList;
    }

    static /* synthetic */ List nodeCounts$default(int[] iArr, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = iArr.length;
        }
        return nodeCounts(iArr, i8);
    }

    public static final int nodeIndex(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 4];
    }

    public static final int objectKeyIndex(int[] iArr, int i8) {
        int i9 = i8 * 5;
        return iArr[i9 + 4] + countOneBits(iArr[i9 + 1] >> 30);
    }

    public static final int parentAnchor(int[] iArr, int i8) {
        return iArr[(i8 * 5) + 2];
    }

    public static final List<Integer> parentAnchors(int[] iArr, int i8) {
        return slice(iArr, i6.m.r(i6.m.s(2, i8), 5));
    }

    static /* synthetic */ List parentAnchors$default(int[] iArr, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = iArr.length;
        }
        return parentAnchors(iArr, i8);
    }

    public static final int search(ArrayList<Anchor> arrayList, int i8, int i9) {
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int location$runtime_release = arrayList.get(i11).getLocation$runtime_release();
            if (location$runtime_release < 0) {
                location$runtime_release += i9;
            }
            int k8 = AbstractC3292y.k(location$runtime_release, i8);
            if (k8 < 0) {
                i10 = i11 + 1;
            } else if (k8 > 0) {
                size = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    public static final int slotAnchor(int[] iArr, int i8) {
        int i9 = i8 * 5;
        return iArr[i9 + 4] + countOneBits(iArr[i9 + 1] >> 28);
    }

    public static final void updateContainsMark(int[] iArr, int i8, boolean z8) {
        int i9 = (i8 * 5) + 1;
        if (z8) {
            iArr[i9] = iArr[i9] | 67108864;
        } else {
            iArr[i9] = iArr[i9] & (-67108865);
        }
    }

    public static final void updateDataAnchor(int[] iArr, int i8, int i9) {
        iArr[(i8 * 5) + 4] = i9;
    }

    public static final void updateGroupKey(int[] iArr, int i8, int i9) {
        iArr[i8 * 5] = i9;
    }

    public static final void updateGroupSize(int[] iArr, int i8, int i9) {
        boolean z8;
        if (i9 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        ComposerKt.runtimeCheck(z8);
        iArr[(i8 * 5) + 3] = i9;
    }

    public static final void updateMark(int[] iArr, int i8, boolean z8) {
        int i9 = (i8 * 5) + 1;
        if (z8) {
            iArr[i9] = iArr[i9] | Mark_Mask;
        } else {
            iArr[i9] = iArr[i9] & (-134217729);
        }
    }

    public static final void updateNodeCount(int[] iArr, int i8, int i9) {
        boolean z8;
        if (i9 >= 0 && i9 < NodeCount_Mask) {
            z8 = true;
        } else {
            z8 = false;
        }
        ComposerKt.runtimeCheck(z8);
        int i10 = (i8 * 5) + 1;
        iArr[i10] = i9 | (iArr[i10] & (-67108864));
    }

    public static final void updateParentAnchor(int[] iArr, int i8, int i9) {
        iArr[(i8 * 5) + 2] = i9;
    }
}
