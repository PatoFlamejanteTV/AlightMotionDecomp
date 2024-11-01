package androidx.compose.runtime;

/* loaded from: classes.dex */
final class GroupInfo {
    private int nodeCount;
    private int nodeIndex;
    private int slotIndex;

    public GroupInfo(int i8, int i9, int i10) {
        this.slotIndex = i8;
        this.nodeIndex = i9;
        this.nodeCount = i10;
    }

    public final int getNodeCount() {
        return this.nodeCount;
    }

    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final void setNodeCount(int i8) {
        this.nodeCount = i8;
    }

    public final void setNodeIndex(int i8) {
        this.nodeIndex = i8;
    }

    public final void setSlotIndex(int i8) {
        this.slotIndex = i8;
    }
}
