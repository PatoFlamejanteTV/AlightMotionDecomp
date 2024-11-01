package androidx.compose.foundation.lazy.layout;

import R5.AbstractC1435t;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import i6.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsStateKt {
    public static final List<Integer> calculateLazyLayoutPinnedIndices(LazyLayoutItemProvider lazyLayoutItemProvider, LazyLayoutPinnedItemList pinnedItemList, LazyLayoutBeyondBoundsInfo beyondBoundsInfo) {
        i a9;
        AbstractC3292y.i(lazyLayoutItemProvider, "<this>");
        AbstractC3292y.i(pinnedItemList, "pinnedItemList");
        AbstractC3292y.i(beyondBoundsInfo, "beyondBoundsInfo");
        if (!beyondBoundsInfo.hasIntervals() && pinnedItemList.isEmpty()) {
            return AbstractC1435t.m();
        }
        ArrayList arrayList = new ArrayList();
        if (beyondBoundsInfo.hasIntervals()) {
            a9 = new i(beyondBoundsInfo.getStart(), Math.min(beyondBoundsInfo.getEnd(), lazyLayoutItemProvider.getItemCount() - 1));
        } else {
            a9 = i.f32777e.a();
        }
        int size = pinnedItemList.size();
        for (int i8 = 0; i8 < size; i8++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = pinnedItemList.get(i8);
            int findIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            int e8 = a9.e();
            if ((findIndexByKey > a9.g() || e8 > findIndexByKey) && findIndexByKey >= 0 && findIndexByKey < lazyLayoutItemProvider.getItemCount()) {
                arrayList.add(Integer.valueOf(findIndexByKey));
            }
        }
        int e9 = a9.e();
        int g8 = a9.g();
        if (e9 <= g8) {
            while (true) {
                arrayList.add(Integer.valueOf(e9));
                if (e9 == g8) {
                    break;
                }
                e9++;
            }
        }
        return arrayList;
    }
}
