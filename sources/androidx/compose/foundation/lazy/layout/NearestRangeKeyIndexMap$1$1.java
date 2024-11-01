package androidx.compose.foundation.lazy.layout;

import Q5.I;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ int $first;
    final /* synthetic */ int $last;
    final /* synthetic */ HashMap<Object, Integer> $map;
    final /* synthetic */ NearestRangeKeyIndexMap this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearestRangeKeyIndexMap$1$1(int i8, int i9, HashMap<Object, Integer> hashMap, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        super(1);
        this.$first = i8;
        this.$last = i9;
        this.$map = hashMap;
        this.this$0 = nearestRangeKeyIndexMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IntervalList.Interval<? extends LazyLayoutIntervalContent.Interval>) obj);
        return I.f8786a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:            if (r3 == null) goto L7;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke(androidx.compose.foundation.lazy.layout.IntervalList.Interval<? extends androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "it"
            kotlin.jvm.internal.AbstractC3292y.i(r7, r0)
            java.lang.Object r0 = r7.getValue()
            androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) r0
            kotlin.jvm.functions.Function1 r0 = r0.getKey()
            int r1 = r6.$first
            int r2 = r7.getStartIndex()
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r6.$last
            int r3 = r7.getStartIndex()
            int r4 = r7.getSize()
            int r3 = r3 + r4
            int r3 = r3 + (-1)
            int r2 = java.lang.Math.min(r2, r3)
            if (r1 > r2) goto L60
        L2c:
            if (r0 == 0) goto L3e
            int r3 = r7.getStartIndex()
            int r3 = r1 - r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.invoke(r3)
            if (r3 != 0) goto L42
        L3e:
            java.lang.Object r3 = androidx.compose.foundation.lazy.layout.Lazy_androidKt.getDefaultLazyLayoutKey(r1)
        L42:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.util.HashMap<java.lang.Object, java.lang.Integer> r5 = r6.$map
            r5.put(r3, r4)
            androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r4 = r6.this$0
            java.lang.Object[] r4 = androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.access$getKeys$p(r4)
            androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r5 = r6.this$0
            int r5 = androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.access$getKeysStartIndex$p(r5)
            int r5 = r1 - r5
            r4[r5] = r3
            if (r1 == r2) goto L60
            int r1 = r1 + 1
            goto L2c
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap$1$1.invoke(androidx.compose.foundation.lazy.layout.IntervalList$Interval):void");
    }
}
