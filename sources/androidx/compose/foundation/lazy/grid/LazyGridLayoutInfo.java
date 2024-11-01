package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;

/* loaded from: classes.dex */
public interface LazyGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    Orientation getOrientation();

    boolean getReverseLayout();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* renamed from: getViewportSize-YbymL2g */
    long mo689getViewportSizeYbymL2g();

    int getViewportStartOffset();

    List<LazyGridItemInfo> getVisibleItemsInfo();
}
