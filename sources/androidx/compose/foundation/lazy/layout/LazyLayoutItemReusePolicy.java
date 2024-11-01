package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {
    private final Map<Object, Integer> countPerType;
    private final LazyLayoutItemContentFactory factory;

    public LazyLayoutItemReusePolicy(LazyLayoutItemContentFactory factory) {
        AbstractC3292y.i(factory, "factory");
        this.factory = factory;
        this.countPerType = new LinkedHashMap();
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(Object obj, Object obj2) {
        return AbstractC3292y.d(this.factory.getContentType(obj), this.factory.getContentType(obj2));
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        int i8;
        AbstractC3292y.i(slotIds, "slotIds");
        this.countPerType.clear();
        Iterator<Object> it = slotIds.iterator();
        while (it.hasNext()) {
            Object contentType = this.factory.getContentType(it.next());
            Integer num = this.countPerType.get(contentType);
            if (num != null) {
                i8 = num.intValue();
            } else {
                i8 = 0;
            }
            if (i8 == 7) {
                it.remove();
            } else {
                this.countPerType.put(contentType, Integer.valueOf(i8 + 1));
            }
        }
    }
}
