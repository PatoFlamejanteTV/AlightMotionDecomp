package androidx.compose.runtime;

import Q5.InterfaceC1416k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Pending {
    private int groupIndex;
    private final HashMap<Integer, GroupInfo> groupInfos;
    private final List<KeyInfo> keyInfos;
    private final InterfaceC1416k keyMap$delegate;
    private final int startIndex;
    private final List<KeyInfo> usedKeys;

    public Pending(List<KeyInfo> list, int i8) {
        this.keyInfos = list;
        this.startIndex = i8;
        if (i8 >= 0) {
            this.usedKeys = new ArrayList();
            HashMap<Integer, GroupInfo> hashMap = new HashMap<>();
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                KeyInfo keyInfo = this.keyInfos.get(i10);
                hashMap.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(i10, i9, keyInfo.getNodes()));
                i9 += keyInfo.getNodes();
            }
            this.groupInfos = hashMap;
            this.keyMap$delegate = Q5.l.b(new Pending$keyMap$2(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    public final HashMap<Object, LinkedHashSet<KeyInfo>> getKeyMap() {
        return (HashMap) this.keyMap$delegate.getValue();
    }

    public final KeyInfo getNext(int i8, Object obj) {
        Object valueOf;
        Object pop;
        if (obj != null) {
            valueOf = new JoinedKey(Integer.valueOf(i8), obj);
        } else {
            valueOf = Integer.valueOf(i8);
        }
        pop = ComposerKt.pop(getKeyMap(), valueOf);
        return (KeyInfo) pop;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final int nodePositionOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final boolean recordUsed(KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void registerInsert(KeyInfo keyInfo, int i8) {
        this.groupInfos.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(-1, i8, 0));
    }

    public final void registerMoveNode(int i8, int i9, int i10) {
        if (i8 > i9) {
            for (GroupInfo groupInfo : this.groupInfos.values()) {
                int nodeIndex = groupInfo.getNodeIndex();
                if (i8 <= nodeIndex && nodeIndex < i8 + i10) {
                    groupInfo.setNodeIndex((nodeIndex - i8) + i9);
                } else if (i9 <= nodeIndex && nodeIndex < i8) {
                    groupInfo.setNodeIndex(nodeIndex + i10);
                }
            }
            return;
        }
        if (i9 > i8) {
            for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                int nodeIndex2 = groupInfo2.getNodeIndex();
                if (i8 <= nodeIndex2 && nodeIndex2 < i8 + i10) {
                    groupInfo2.setNodeIndex((nodeIndex2 - i8) + i9);
                } else if (i8 + 1 <= nodeIndex2 && nodeIndex2 < i9) {
                    groupInfo2.setNodeIndex(nodeIndex2 - i10);
                }
            }
        }
    }

    public final void registerMoveSlot(int i8, int i9) {
        if (i8 > i9) {
            for (GroupInfo groupInfo : this.groupInfos.values()) {
                int slotIndex = groupInfo.getSlotIndex();
                if (slotIndex == i8) {
                    groupInfo.setSlotIndex(i9);
                } else if (i9 <= slotIndex && slotIndex < i8) {
                    groupInfo.setSlotIndex(slotIndex + 1);
                }
            }
            return;
        }
        if (i9 > i8) {
            for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                int slotIndex2 = groupInfo2.getSlotIndex();
                if (slotIndex2 == i8) {
                    groupInfo2.setSlotIndex(i9);
                } else if (i8 + 1 <= slotIndex2 && slotIndex2 < i9) {
                    groupInfo2.setSlotIndex(slotIndex2 - 1);
                }
            }
        }
    }

    public final void setGroupIndex(int i8) {
        this.groupIndex = i8;
    }

    public final int slotPositionOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final boolean updateNodeCount(int i8, int i9) {
        int nodeIndex;
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(i8));
        if (groupInfo != null) {
            int nodeIndex2 = groupInfo.getNodeIndex();
            int nodeCount = i9 - groupInfo.getNodeCount();
            groupInfo.setNodeCount(i9);
            if (nodeCount != 0) {
                for (GroupInfo groupInfo2 : this.groupInfos.values()) {
                    if (groupInfo2.getNodeIndex() >= nodeIndex2 && !AbstractC3292y.d(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                        groupInfo2.setNodeIndex(nodeIndex);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final int updatedNodeCountOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getNodeCount();
        }
        return keyInfo.getNodes();
    }
}
