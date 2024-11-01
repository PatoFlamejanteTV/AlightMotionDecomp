package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* loaded from: classes.dex */
public interface LazyStaggeredGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    Orientation getOrientation();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g */
    long mo744getViewportSizeYbymL2g();

    int getViewportStartOffset();

    List<LazyStaggeredGridItemInfo> getVisibleItemsInfo();
}
