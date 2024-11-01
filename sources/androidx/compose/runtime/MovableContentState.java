package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@InternalComposeApi
/* loaded from: classes.dex */
public final class MovableContentState {
    public static final int $stable = 8;
    private final SlotTable slotTable;

    public MovableContentState(SlotTable slotTable) {
        this.slotTable = slotTable;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }
}
