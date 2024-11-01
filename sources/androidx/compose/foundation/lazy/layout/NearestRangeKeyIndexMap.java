package androidx.compose.foundation.lazy.layout;

import R5.AbstractC1428l;
import R5.Q;
import androidx.compose.foundation.ExperimentalFoundationApi;
import i6.i;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {
    private final Object[] keys;
    private final int keysStartIndex;
    private final Map<Object, Integer> map;

    public NearestRangeKeyIndexMap(i nearestRange, LazyLayoutIntervalContent<?> intervalContent) {
        AbstractC3292y.i(nearestRange, "nearestRange");
        AbstractC3292y.i(intervalContent, "intervalContent");
        IntervalList<?> intervals = intervalContent.getIntervals();
        int e8 = nearestRange.e();
        if (e8 >= 0) {
            int min = Math.min(nearestRange.g(), intervals.getSize() - 1);
            if (min < e8) {
                this.map = Q.h();
                this.keys = new Object[0];
                this.keysStartIndex = 0;
                return;
            } else {
                this.keys = new Object[(min - e8) + 1];
                this.keysStartIndex = e8;
                HashMap hashMap = new HashMap();
                intervals.forEach(e8, min, new NearestRangeKeyIndexMap$1$1(e8, min, hashMap, this));
                this.map = hashMap;
                return;
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(Object key) {
        AbstractC3292y.i(key, "key");
        Integer num = this.map.get(key);
        if (num == null) {
            num = -1;
        }
        return num.intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public Object getKey(int i8) {
        Object[] objArr = this.keys;
        int i9 = i8 - this.keysStartIndex;
        if (i9 >= 0 && i9 <= AbstractC1428l.i0(objArr)) {
            return objArr[i9];
        }
        return null;
    }
}
