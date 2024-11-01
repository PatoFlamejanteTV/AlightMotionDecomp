package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class PagerLayoutInfoKt {
    public static final int getMainAxisViewportSize(PagerLayoutInfo pagerLayoutInfo) {
        AbstractC3292y.i(pagerLayoutInfo, "<this>");
        if (pagerLayoutInfo.getOrientation() == Orientation.Vertical) {
            return IntSize.m5320getHeightimpl(pagerLayoutInfo.mo789getViewportSizeYbymL2g());
        }
        return IntSize.m5321getWidthimpl(pagerLayoutInfo.mo789getViewportSizeYbymL2g());
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getMainAxisViewportSize$annotations(PagerLayoutInfo pagerLayoutInfo) {
    }
}
