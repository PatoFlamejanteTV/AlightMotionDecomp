package androidx.compose.material;

import R5.AbstractC1435t;
import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import i6.m;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;

/* loaded from: classes.dex */
final class ScrollableTabData {
    private final M coroutineScope;
    private final ScrollState scrollState;
    private Integer selectedTab;

    public ScrollableTabData(ScrollState scrollState, M coroutineScope) {
        AbstractC3292y.i(scrollState, "scrollState");
        AbstractC3292y.i(coroutineScope, "coroutineScope");
        this.scrollState = scrollState;
        this.coroutineScope = coroutineScope;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i8, List<TabPosition> list) {
        int mo419roundToPx0680j_4 = density.mo419roundToPx0680j_4(((TabPosition) AbstractC1435t.y0(list)).m1353getRightD9Ej5fM()) + i8;
        int maxValue = mo419roundToPx0680j_4 - this.scrollState.getMaxValue();
        return m.k(density.mo419roundToPx0680j_4(tabPosition.m1352getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo419roundToPx0680j_4(tabPosition.m1354getWidthD9Ej5fM()) / 2)), 0, m.d(mo419roundToPx0680j_4 - maxValue, 0));
    }

    public final void onLaidOut(Density density, int i8, List<TabPosition> tabPositions, int i9) {
        int calculateTabOffset;
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(tabPositions, "tabPositions");
        Integer num = this.selectedTab;
        if (num == null || num.intValue() != i9) {
            this.selectedTab = Integer.valueOf(i9);
            TabPosition tabPosition = (TabPosition) AbstractC1435t.p0(tabPositions, i9);
            if (tabPosition != null && this.scrollState.getValue() != (calculateTabOffset = calculateTabOffset(tabPosition, density, i8, tabPositions))) {
                AbstractC3462k.d(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, calculateTabOffset, null), 3, null);
            }
        }
    }
}
