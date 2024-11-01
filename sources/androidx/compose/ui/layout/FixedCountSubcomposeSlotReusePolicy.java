package androidx.compose.ui.layout;

import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    private final int maxSlotsToRetainForReuse;

    public FixedCountSubcomposeSlotReusePolicy(int i8) {
        this.maxSlotsToRetainForReuse = i8;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        return true;
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        if (slotIdsSet.size() > this.maxSlotsToRetainForReuse) {
            Iterator<Object> it = slotIdsSet.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                it.next();
                i8++;
                if (i8 > this.maxSlotsToRetainForReuse) {
                    it.remove();
                }
            }
        }
    }
}
